package com.tts.WeatherApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model) {
        List<ZipCode> zips = weatherService.findLastTen();
        model.addAttribute("zipList", zips);
        model.addAttribute("request", new Request());
        return "index";
    }

    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        ZipCode zipcode = new ZipCode();
        zipcode.setZip(request.getZipCode());
        weatherService.save(zipcode);
        model.addAttribute("data", data);
        return "index";
    }
}
