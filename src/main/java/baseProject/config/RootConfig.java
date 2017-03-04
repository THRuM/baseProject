package baseProject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by IntelliJ IDEA.
 * User: Maciej Cyrka maciej.cyrka@gmail.com
 * Date: 04.03.17
 * Time: 14:38
 */

@Configuration
@ComponentScan(basePackages = {"baseProject"}, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class))
public class RootConfig {
}
