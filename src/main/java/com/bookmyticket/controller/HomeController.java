package com.bookmyticket.controller;
import com.bookmyticket.entity.MovieStatus; import com.bookmyticket.repository.MovieRepository; import lombok.RequiredArgsConstructor; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.*;
@Controller @RequiredArgsConstructor public class HomeController { private final MovieRepository movies; @GetMapping({"/","/home"}) public String home(Model model){ model.addAttribute("movies", movies.findByStatus(MovieStatus.ACTIVE)); return "home"; } }
