package dubbo.cnblog.provider.xml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "dubbo-provider.xml" })
public class DubboConfig {

}
