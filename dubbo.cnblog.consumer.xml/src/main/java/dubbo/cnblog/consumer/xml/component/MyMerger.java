package dubbo.cnblog.consumer.xml.component;

import java.util.Arrays;

import com.alibaba.dubbo.rpc.cluster.Merger;

public class MyMerger implements Merger<String> {

	@Override
	public String merge(String... items) {
		return Arrays.toString(items);
	}

}
