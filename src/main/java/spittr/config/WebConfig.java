package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc   //启用SpringMVC
@ComponentScan("spittr.web")    //启动组件扫描
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver(){
        //配置JSP视图解析器, 查找JSP文件
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        //视图名称前缀
        resolver.setPrefix("/WEB-INF/views/");
        //视图名称后缀
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 配置静态资源的处理, 将要求DispatchServlet对静态资源的请求转发到Servlet中默认的Servlet上
     * 而不是使用DispatchServlet本身处理此类请求
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
