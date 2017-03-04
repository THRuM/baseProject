package baseProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;

/**
 * Created by IntelliJ IDEA.
 * User: Maciej Cyrka maciej.cyrka@gmail.com
 * Date: 04.03.17
 * Time: 14:37
 */
public class BaseProjectWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() { return new Class<?>[] { RootConfig.class }; }

    protected Class<?>[] getServletConfigClasses() { return new Class<?>[] { WebConfig.class }; }

    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
    }
}
