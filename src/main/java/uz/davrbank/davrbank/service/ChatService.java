package uz.davrbank.davrbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.davrbank.davrbank.entity.Chat;
import uz.davrbank.davrbank.payload.ApiResponse;
import uz.davrbank.davrbank.payload.ChatDto;
import uz.davrbank.davrbank.repository.ChatRepository;
import uz.davrbank.davrbank.repository.UserRepository;
import java.util.UUID;

@Service
public class ChatService {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    UserRepository userRepository;

    public ApiResponse saveChat(ChatDto dto){
        try {

            Chat chat=new Chat();
            chat.setName(dto.getName());
            chat.setUsers(dto.getUsers());
            chatRepository.save(chat);
            return new ApiResponse("success!",true);
        }catch (Exception e){
            e.printStackTrace();
            return new ApiResponse("error!",false);

        }
    }
}
