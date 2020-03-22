package dubbo.cnblog.consumer.backup.component;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;

@Activate
public class PoetryFilter4 implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		String sentence = ((String[]) invocation.getArguments()[0])[3];
		if (!"不教胡马度阴山".equals(sentence)) {
			return new RpcResult("第四句不对");
		} else {
			return invoker.invoke(invocation);
		}
	}

}
