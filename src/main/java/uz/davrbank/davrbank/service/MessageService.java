package uz.davrbank.davrbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.davrbank.davrbank.entity.Message;
import uz.davrbank.davrbank.payload.ApiResponse;
import uz.davrbank.davrbank.payload.MessageDto;
import uz.davrbank.davrbank.repository.MessageRepository;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;


    public ApiResponse saveMessage(MessageDto dto){
        try {
            Message message=new Message();
            message.setAuthor(dto.getAuthor());
            message.setChat(dto.getChat());
            message.setText(dto.getText());
            messageRepository.save(message);
            return new ApiResponse("success",true);
        }catch (Exception e  ){
            e.printStackTrace();
            return new ApiResponse("Error",false);
        }
    }

    public ApiResponse getByUserId(UUID chatId){
        try {
            return new ApiResponse(true,"success",messageRepository.getAllByChatId(chatId));
        }catch (Exception e){
            e.printStackTrace();
            return new ApiResponse("error",false);
        }
    }

}
