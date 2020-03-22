package dubbo.cnblog.provider.backup.service.impl;

import java.util.Arrays;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.cnblog.api.PoetryService;

@Service
public class PoetryServiceImpl implements PoetryService {

	@Override
	public String recite(String[] sentences) {
		return Arrays.toString(sentences);
	}

}
