package dubbo.cnblog.consumer.backup.component;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * 内容变动重启生效，spring-boot-devtools不起作用
 */
//@Activate(group = Constants.CONSUMER, order = 0)
public class CustomFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

//		eg: RpcInvocation [methodName=invokesMe, parameterTypes=[class java.lang.String], arguments=[kk], attachments={}]
		System.out.println(invocation.toString());

//		NullPointerException
//		return null;

//		正常反应
		return invoker.invoke(invocation);

//		无反应
//		return new RpcResult();

//		前端返回结果为Everybody puts your hands up!
//		return new RpcResult("Everybody puts your hands up!");
	}

}
