package dubbo.cnblog.consumer.backup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import dubbo.cnblog.api.UserService;
import dubbo.cnblog.jiekou.AnotherService;

@Controller
public class ConsumerBackupController {

//	@Reference(loadbalance = "roundrobin")
//	@Reference(loadbalance = "random")
//	@Reference(loadbalance = "leastactive", timeout = 3000, filter = "activelimit")
//	@Reference(loadbalance = "consistenthash")
	@Reference
	UserService userService;

	@Reference(group = "*")
	AnotherService anotherService;

	@RequestMapping("/userService/{someone}/invoke")
	@ResponseBody
	public String invoke(@PathVariable("someone") String someone) {
		return userService.invokesMe(someone);
	}

	@RequestMapping("/userService/{someone}/fk")
	@ResponseBody
	public String fk(@PathVariable("someone") String someone) {
		return userService.fksMe(someone + " so sexy and strong");
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
