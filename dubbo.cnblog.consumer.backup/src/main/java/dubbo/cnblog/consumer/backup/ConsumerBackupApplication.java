package dubbo.cnblog.consumer.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * https://www.cnblogs.com/zjfjava/p/9696086.html
 */
@EnableDubbo
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ConsumerBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerBackupApplication.class, args);
	}
}
