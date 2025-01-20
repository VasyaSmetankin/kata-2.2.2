package web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequiredArgsConstructor
public class CarsController {
    private final CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getLimitedCars(count));
        return "Cars";
    }

}
