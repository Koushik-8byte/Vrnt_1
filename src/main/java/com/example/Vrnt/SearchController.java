package com.example.Vrnt;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class SearchController {
    @RequestMapping(path="/search")
    public String search()
    {
        return "search.html";
    }
}
