package com.xhz.file_storage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 标记这个类是Controller，其方法的返回值会直接写入HTTP响应体
public class TestController {

    @GetMapping("/api/test") // 处理GET请求到 /api/test 这个路径
    public String test() {
        return "服务器连接成功！File Storage Project is running!";
    }
}
/*
恭喜你！你已经完成了：
使用 Spring Initializr 正确创建了一个Spring Boot项目。

在IDE中成功导入并配置了项目。

编写了第一个Spring MVC控制器（Controller）。

成功启动了内嵌的Web服务器（Tomcat）。

通过浏览器访问了你定义的第一个RESTful API接口。+
 */