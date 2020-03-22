package dubbo.cnblog.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

import dubbo.cnblog.api.TracingService;

@Service
public class TraceServiceImpl implements TracingService {

	@Override
	public void trace(String key) {
		String traceId = RpcContext.getContext().getAttachment("traceId");
		System.out.println("key = " + key + ", traceId = " + traceId);
	}

}
