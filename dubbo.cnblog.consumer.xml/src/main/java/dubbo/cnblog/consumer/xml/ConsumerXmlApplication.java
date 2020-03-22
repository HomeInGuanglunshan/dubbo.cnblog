package dubbo.cnblog.consumer.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * https://www.cnblogs.com/zjfjava/p/9696086.html
 */
@EnableDubbo
@SpringBootApplication
public class ConsumerXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerXmlApplication.class, args);
	}
}
