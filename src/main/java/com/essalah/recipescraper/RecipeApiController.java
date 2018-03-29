package com.essalah.recipescraper;

import com.essalah.recipescraper.services.AllRecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RecipeApiController {

    @RequestMapping(method = RequestMethod.GET, value = "/fromurl")
    public Object getRecipeFromGivenUrl(@RequestParam("url") String url){
        try {
            return AllRecipeService.getFromUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}