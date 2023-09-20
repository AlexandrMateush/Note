package com.example.Notes.Controller;

import com.example.Notes.entity.Note;
import com.example.Notes.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @PostMapping("/login")
    public String loginPageSubmit() {
        return "redirect:/note/list";
    }
    }

