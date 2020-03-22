package dubbo.cnblog.provider.xml.service.impl;

import org.springframework.stereotype.Service;

import dubbo.cnblog.api.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String invokesMe(String someone) {
		return someone + " invokes me. [from Provider Xml]";
	}

	@Override
	public String fksMe(String someone) {
		return someone + " fks me. [from Provider Xml]";
	}
}
