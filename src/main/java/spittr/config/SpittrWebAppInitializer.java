package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 扩展AbstractAnnotationConfigDispatcherServletInitializer的任意类都会自动配置DispatcherServlet, Spring应用上下文
 * 和ContextLoaderListener - 负责加载应用中的其它bean, 通常是驱动应用后端的中间层和数据层组件
 * Spring的上下文会位于Servlet的上下文之中
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 表示配置ContextLoaderListener应用上下文使用RootConfig配置类中的bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    /**
     * 表示当DispatcherServlet启动时, 加载Spring应用上下文使用WebConfig配置类中的bean
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        //指定配置类
        return new Class<?>[]{ WebConfig.class };
    }

    /**
     * 将一个或多个路径映射到DispatcherServlet上
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        //将DispatcherServlet映射到"/", 表示应用默认的Servlet并处理进入应用的所有请求
        return new String[]{"/"};
    }
}
