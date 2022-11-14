package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {
  //省略

  @GetMapping("/post_message")
  private String postMessage(){
    return "post_message";
  }

  @PostMapping("/confirm_message")
  private String confirmMessage(@RequestParam String mess, Model model){
	 
    model.addAttribute("mess1", mess);
    return "confirm_message";
  }
}
