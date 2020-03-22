package dubbo.cnblog.consumer.component;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.listener.InvokerListenerAdapter;

@Activate
public class ReferenceListener extends InvokerListenerAdapter {

	@Override
	public void referred(Invoker<?> invoker) throws RpcException {
		System.out.println("引用了" + invoker.getInterface());
	}

	@Override
	public void destroyed(Invoker<?> invoker) {
		System.out.println("销毁了" + invoker.getInterface());
	}
}