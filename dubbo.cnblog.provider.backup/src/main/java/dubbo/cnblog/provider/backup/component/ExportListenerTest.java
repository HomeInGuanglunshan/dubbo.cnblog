package dubbo.cnblog.provider.backup.component;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.listener.ExporterListenerAdapter;

@Activate
public class ExportListenerTest extends ExporterListenerAdapter {

	@Override
	public void exported(Exporter<?> exporter) throws RpcException {
		System.out.println("暴露完成后的处理：" + exporter.getInvoker().getInterface());
	}

	@Override
	public void unexported(Exporter<?> exporter) throws RpcException {
		System.out.println("暴露未完成的处理：" + exporter.getInvoker().getInterface());
	}
}
