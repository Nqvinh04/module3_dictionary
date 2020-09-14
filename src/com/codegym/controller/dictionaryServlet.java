package com.codegym.controller;

import com.codegym.model.Dictionary;
import com.codegym.service.dictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class dictionaryServlet {
    private dictionaryService dictionaryServlets = new dictionaryService();

    @GetMapping("/search")
    public String search(){
        return "main";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model){
        List<Dictionary> dictionaries = this.dictionaryServlets.findAll();
        for (int i = 0; i < dictionaries.size(); i++){
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEn())){
                model.addAttribute("word", dictionaries.get(i).getVi());
                model.addAttribute("key", keyword);
                return "dictionary";
            }
        }
        return "dictionary";
    }
}
