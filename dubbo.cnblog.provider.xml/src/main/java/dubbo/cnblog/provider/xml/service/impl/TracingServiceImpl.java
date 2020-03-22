package dubbo.cnblog.provider.xml.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.RpcContext;

import dubbo.cnblog.api.TracingService;

@Service("tracingService")
public class TracingServiceImpl implements TracingService {

	@Override
	public void trace(String key) {
		String traceId = RpcContext.getContext().getAttachment("traceId");
		System.out.println("key = " + key + ", traceId = " + traceId);
	}

}
