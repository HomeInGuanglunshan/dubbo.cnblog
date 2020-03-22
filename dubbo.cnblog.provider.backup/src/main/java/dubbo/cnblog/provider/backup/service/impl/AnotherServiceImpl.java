package dubbo.cnblog.provider.backup.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.cnblog.jiekou.AnotherService;

@Service(group = "provider-backup")
public class AnotherServiceImpl implements AnotherService {

	@Override
	public String runAway(String guy) {
		return guy + " runs away. [from Provider Backup]";
	}

	@Override
	public String leaveHere(String guy) {
		return guy + " leaves here. [from Provider Backup]";
	}

}
