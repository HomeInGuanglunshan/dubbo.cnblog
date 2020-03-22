package dubbo.cnblog.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.cnblog.api.UserService;

@Service(filter = { "myFilter" })
public class UserServiceImpl implements UserService {

	@Override
	public String invokesMe(String someone) {
		return someone + " invokes me. [from Provider]";
	}

	@Override
	public String fksMe(String someone) {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return someone + " fks me. [from Provider]";
	}
}
