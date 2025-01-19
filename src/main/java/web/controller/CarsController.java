package web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequiredArgsConstructor
public class CarsController {
    private final CarServiceImpl carServiceImpl;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carServiceImpl.getCars().stream().limit(count).toList());
        return "Cars";
    }

}
