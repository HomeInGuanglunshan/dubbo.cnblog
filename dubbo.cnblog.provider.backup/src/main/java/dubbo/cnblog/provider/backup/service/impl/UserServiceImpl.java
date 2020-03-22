package dubbo.cnblog.provider.backup.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.cnblog.api.UserService;

@Service(deprecated = true)
public class UserServiceImpl implements UserService {

	@Override
	public String invokesMe(String someone) {
		return someone + " invokes me. [from Provider Backup]";
	}

	@Override
	public String fksMe(String someone) {
		return someone + " fks me. [from Provider Backup]";
	}
}
