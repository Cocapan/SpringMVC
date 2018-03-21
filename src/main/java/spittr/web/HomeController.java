package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //声明一个控制器。构造型注解, 基于@Component注解, 辅助实现组件扫描。使用@Component注解也可以
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/")    //处理对"/"的GET请求
    public String home(){
        return "home";  //返回的视图名为home
    }

}
