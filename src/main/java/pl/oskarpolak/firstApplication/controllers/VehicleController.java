package pl.oskarpolak.firstApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.oskarpolak.firstApplication.models.forms.VehicleForm;

@Controller
public class VehicleController {
    @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public String vehcileGet(Model model){
        model.addAttribute("vehicleForm", new VehicleForm());
        return "vehicle";
    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public String vehcilePost(@ModelAttribute("vehicleForm") VehicleForm form,  Model model){
        // Wyświetlamy tylko i wyłącznie rok produkcji
        model.addAttribute("info", form.getProductionYear());
        model.addAttribute("infoColor", form.getProductionYear() >= 2000 ? "green" : "red");
        return "vehicle";
    }
    /*
        Sobota:
        Poznanie IF'A w thymeleaf na podstawie roku produkcji (zmiana koloru tekstu)
        Walidacja formularzy na podstawie JSR-303
        Internacjonalizacja aplikacji i komunikatów
        Wstęp do JPA & Hibernate w podejsciu SpringBoot.
     */
}
