package spring.testboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.testboot.service.AsyncService;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/aysnc1")
    public String async1(){
        asyncService.sendMsg("123123");
        // 订单搞定之后就可以返回
        return "success";
    }
}
