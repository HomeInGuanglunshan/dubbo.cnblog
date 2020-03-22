package dubbo.cnblog.consumer.backup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import dubbo.cnblog.api.PoetryService;

@Controller
public class PoetryController {

	@Reference(filter = { "poetryFilter1", "poetryFilter2", "poetryFilter3", "poetryFilter4" })
	PoetryService poetryService;

	@RequestMapping("recite")
	@ResponseBody
	public String recite(String... sentences) {
		return poetryService.recite(sentences);
	}

}
