package com.mariochat.MarioChat.chat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;

@Controller
public class ChatController {
    String[] mario_images = {"mario_64_ds_mario_face.png", "mk8_mario.png",
            "smg2mario.png", "paper_mario.png"};

    ArrayList<String> messages = new ArrayList<String>();

    @GetMapping
    String marioChatImages(Model model){
        model.addAttribute("images", mario_images);
        System.out.println("GetMapping");
        model.addAttribute("messages", messages);
        return "home";
    }

    @PostMapping
    String chatMessage(Model model, @ModelAttribute Chat chat){
        messages.add(chat.getMessage());
        System.out.println(messages);
        model.addAttribute("images", mario_images);
        model.addAttribute("messages", messages);
        return "home";
    }
    @DeleteMapping("/clearchat")
    ResponseEntity<String> clearChat(Model model){
        System.out.println("Delete Mapping");
        messages.clear();
        return new ResponseEntity<>("Delete Successful", HttpStatus.OK);
    }
}
