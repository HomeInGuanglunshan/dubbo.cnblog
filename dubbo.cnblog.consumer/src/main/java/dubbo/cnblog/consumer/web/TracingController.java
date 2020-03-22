package dubbo.cnblog.consumer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import dubbo.cnblog.api.TracingService;

@Controller
public class TracingController {

	@Reference(filter = "traceIdFilter")
	TracingService tracingService;

	@RequestMapping("trace")
	@ResponseBody
	public void trace(String key) {
		tracingService.trace(key);
	}
}
