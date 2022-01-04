package com.example.thanhjav.controller;

import com.example.thanhjav.entity.Movie;
import com.example.thanhjav.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api/v1/home")
@RequiredArgsConstructor
public class HomeController {
    private final MovieService movieService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> home() {
        return movieService.fetchHomePageData();
    }
}
