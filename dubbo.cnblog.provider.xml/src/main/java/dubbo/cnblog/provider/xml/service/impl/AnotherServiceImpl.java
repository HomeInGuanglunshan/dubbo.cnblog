package dubbo.cnblog.provider.xml.service.impl;

import org.springframework.stereotype.Service;

import dubbo.cnblog.jiekou.AnotherService;

@Service("anotherService")
public class AnotherServiceImpl implements AnotherService {

	@Override
	public String runAway(String guy) {
		return guy + " runs away. [from Provider Xml]";
	}

	@Override
	public String leaveHere(String guy) {
		return guy + " leaves here. [from Provider Xml]";
	}

}
