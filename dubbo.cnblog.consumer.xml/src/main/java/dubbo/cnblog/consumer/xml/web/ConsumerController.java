package dubbo.cnblog.consumer.xml.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dubbo.cnblog.api.UserService;
import dubbo.cnblog.jiekou.AnotherService;

@Controller
public class ConsumerController {

	@Autowired
	UserService userService;

	@Autowired
//	@Qualifier("autoJiekou")
	AnotherService anotherService;

	@RequestMapping("/userService/{someone}/invoke")
	@ResponseBody
	public String invoke(@PathVariable("someone") String someone) {
		return userService.invokesMe(someone);
	}

	@RequestMapping("/userService/{someone}/fk")
	@ResponseBody
	public String fk(@PathVariable("someone") String someone) {
		return userService.fksMe(someone + " having a big cock");
	}

	@RequestMapping("/anotherService/{guy}/runAway")
	@ResponseBody
	public String runAway(@PathVariable("guy") String guy) {
		return anotherService.runAway(guy);
	}

	@RequestMapping("/anotherService/{guy}/leaveHere")
	@ResponseBody
	public String leaveHere(@PathVariable("guy") String guy) {
		return anotherService.leaveHere(guy);
	}
}
