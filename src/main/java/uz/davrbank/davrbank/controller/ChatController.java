package uz.davrbank.davrbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.davrbank.davrbank.payload.ChatDto;
import uz.davrbank.davrbank.service.ChatService;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    ChatService chatService;

    @PostMapping("/save")
    public HttpEntity<?>save(@RequestBody ChatDto dto){
        return ResponseEntity.ok(chatService.saveChat(dto));
    }
}
