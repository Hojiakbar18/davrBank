package uz.davrbank.davrbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.davrbank.davrbank.payload.MessageDto;
import uz.davrbank.davrbank.service.MessageService;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    MessageService messageService;


    @PostMapping("/save")
    public HttpEntity<?> save(@RequestBody MessageDto dto){
        return ResponseEntity.ok(messageService.saveMessage(dto));
    }

}
