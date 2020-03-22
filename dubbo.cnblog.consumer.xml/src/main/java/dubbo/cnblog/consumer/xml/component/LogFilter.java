package dubbo.cnblog.consumer.xml.component;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;

/**
 * https://www.cnblogs.com/Vivianwang/p/9429314.html
 */
public class LogFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		// TODO Auto-generated method stub
		Result result = null;
		Long takeTime = 0L;

		try {
			Long startTime = System.currentTimeMillis();

			//before filter
			System.out.println("before filter");
			result = invoker.invoke(invocation);
			if (result.getException() instanceof Exception) {
				throw new Exception(result.getException());
			}

			takeTime = System.currentTimeMillis() - startTime;
			System.out.println("TakeTime: " + takeTime);
			//after filter
			System.out.println("after filter");
		} catch (Exception e) {
			e.printStackTrace();
			result = new RpcResult(e);
			return result;
		}

		return result;

	}

}