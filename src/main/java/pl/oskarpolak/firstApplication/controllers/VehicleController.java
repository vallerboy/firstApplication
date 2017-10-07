package pl.oskarpolak.firstApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.oskarpolak.firstApplication.models.forms.VehicleForm;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class VehicleController {

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public String vehcileGet(Locale locale, Model model){
        model.addAttribute("vehicleForm", new VehicleForm());

        String s = messageSource.getMessage("hello.message", new Object[]{"Oskar"}, locale);

        System.out.println(s);
        return "vehicle";
    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public String vehcilePost(@ModelAttribute("vehicleForm") @Valid VehicleForm form, BindingResult result, Model model){
        // Wyświetlamy tylko i wyłącznie rok produkcji

        if(result.hasErrors()){
            model.addAttribute("info", "Wypełnij poprawnie formularz");
            return "vehicle";
        }

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
