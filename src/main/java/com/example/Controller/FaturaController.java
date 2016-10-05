package com.example.Controller;

import com.example.Service.FaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by memojja on 17.07.2016.
 */
@Controller
public class FaturaController {
    private final FaturaService faturaService;


    @Autowired
    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }
    @RequestMapping(value = "/fatura/{id}",method = RequestMethod.GET)
    public ModelAndView getFatura(@PathVariable("id")Long id){
        faturaService.init();
        return new ModelAndView("fatura","fatura",faturaService.getFatura(id));
    }

    @RequestMapping("/")
    public String index(){
        System.out.print("AAAAA");
        return "index";
    }

}
