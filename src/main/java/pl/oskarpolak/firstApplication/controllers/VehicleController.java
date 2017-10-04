package pl.oskarpolak.firstApplication.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.oskarpolak.firstApplication.models.forms.VehicleForm;

public class VehicleController {
    @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public String vehcileGet(Model model){
        model.addAttribute("vehicleForm", new VehicleForm());
        return "vehicle";
    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public String vehcilePost(@ModelAttribute("vehicleForm") VehicleForm form,  Model model){
        // Wyświetlamy tylko i wyłącznie rok produkcji
        model.addAttribute("info", form.getProducitionYear());
        return "vehicle";
    }
}
