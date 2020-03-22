package dubbo.cnblog.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.cnblog.jiekou.AnotherService;

@Service(group = "provider")
public class AnotherServiceImpl implements AnotherService {

	@Override
	public String runAway(String guy) {
		return guy + " runs away. [from Provider]";
	}

	@Override
	public String leaveHere(String guy) {
		return guy + " leaves here. [from Provider]";
	}

}
