package dubbo.cnblog.consumer.xml.component;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;

public class TraceIdFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		String traceId = String.valueOf(System.currentTimeMillis());
		RpcContext.getContext().setAttachment("traceId", traceId);
		System.out.println("traceId = " + traceId);

		return invoker.invoke(invocation);
	}
}