package spittr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classPath:activeMQ-config.xml")
public class JmsCofig {

}
