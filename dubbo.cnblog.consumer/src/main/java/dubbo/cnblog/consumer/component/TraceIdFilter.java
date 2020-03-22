package dubbo.cnblog.consumer.component;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;

@Activate
//@Activate(group = Constants.CONSUMER)
public class TraceIdFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		String traceId = String.valueOf(System.currentTimeMillis());
		RpcContext.getContext().setAttachment("traceId", traceId);
		System.out.println("traceId = " + traceId);

		return invoker.invoke(invocation);
	}
}