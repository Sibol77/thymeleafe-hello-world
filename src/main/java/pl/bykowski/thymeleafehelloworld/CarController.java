package pl.bykowski.thymeleafehelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String get(Model model){
        Car car = new Car("BMW","i8");


        model.addAttribute("name","Seba");
        model.addAttribute("car",car);
        return "car";
    }
}
