package spring.testboot.restcontroller;

import org.springframework.web.bind.annotation.*;
import spring.testboot.model.Employee;

@RestController
@RequestMapping("/forthcontoller")
public class ForthBeanRestController {

    @PostMapping("/employees")
    Employee replaceEmployee(@RequestBody Employee newEmployee) {
        newEmployee.setId(newEmployee.getId() + "123");
        newEmployee.setName(newEmployee.getName() + "124");
        return newEmployee;
    }
}