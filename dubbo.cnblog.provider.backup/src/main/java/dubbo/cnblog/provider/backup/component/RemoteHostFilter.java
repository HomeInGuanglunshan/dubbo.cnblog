package dubbo.cnblog.provider.backup.component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;

/**
 * https://my.oschina.net/warm6Y/blog/3110293
 */
@Activate(group = Constants.PROVIDER)
public class RemoteHostFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

		Properties prop = new Properties();
		InputStream in = RemoteAddrFilter.class.getResourceAsStream("/ipWhiteList.properties");
		String clientIp = RpcContext.getContext().getRemoteHost();//客户端ip
		try {
			prop.load(in);
			String ipwhitelist = prop.getProperty("ipWhiteList");//ip白名单
			if (ipwhitelist.contains(clientIp)) {
				return invoker.invoke(invocation);
			} else {
				return new RpcResult(new Exception("ip地址：" + clientIp + "没有访问权限"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RpcException e) {
			throw e;
		} catch (Throwable t) {
			throw new RpcException(t.getMessage(), t);
		}
		return invoker.invoke(invocation);

	}

}
