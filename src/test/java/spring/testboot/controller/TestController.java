package spring.testboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "hello word";
    }
    @PostMapping("/postHello")
    public String test2(){
        return "post";
    }
    @DeleteMapping("/deleteHello")
    public String test3(){
        return "deleteHello";
    }
    @GetMapping("/hello/{userId}/{passwd}")
    public String test4(@PathVariable String userId, @PathVariable String passwd){
        return "hello word : " + userId + " : " +passwd;
    }
    @GetMapping("/param1")
    public String test5(@RequestParam("userId") String name, @RequestParam("passwd") String pwd){
        return "hello word param1 : " + name + " : " +pwd;
    }
}
