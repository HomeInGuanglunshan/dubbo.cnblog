package dubbo.cnblog.consumer.xml.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dubbo.cnblog.api.TracingService;

@Controller
public class TracingController {

	@Autowired
	TracingService tracingService;

	@RequestMapping("trace")
	@ResponseBody
	public void trace(String key) {
		tracingService.trace(key);
	}
}
