package dubbo.cnblog.provider.backup;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * https://www.cnblogs.com/zjfjava/p/9696086.html
 */
@EnableDubbo
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProviderBackupApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ProviderBackupApplication.class, args);
		// 不占端口启动。如此一来，application.yml中的server.port作废，无法tcping通。但dubbo运作不受影响，相关端口依然可以tcping通。
		new SpringApplicationBuilder().sources(ProviderBackupApplication.class).web(WebApplicationType.NONE).run(args);
	}
}
