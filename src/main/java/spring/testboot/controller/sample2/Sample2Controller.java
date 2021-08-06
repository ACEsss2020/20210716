
package spring.testboot.controller.sample2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample2Controller {

    @GetMapping("/sample2_1")
    public String sample2_1(){
        System.out.println("sample2_1 exec");
        return "sample2_1";
    }

    @GetMapping("/sample2_2")
    public String sample2_2(){
        System.out.println("sample2_2 exec");
        return "sample2_2";
    }
}
