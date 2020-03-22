package dubbo.cnblog.consumer.xml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "dubbo-consumer.xml" })
public class DubboConfig {

}
