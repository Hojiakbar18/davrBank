package uz.davrbank.davrbank.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.davrbank.davrbank.entity.Chat;
import uz.davrbank.davrbank.entity.Message;
import uz.davrbank.davrbank.entity.User;


import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private UUID id;

    private Chat chat;

    private User author;

    private String text;


    public static MessageDto getMessageDto(Message message){
        MessageDto dto=new MessageDto();
        dto.setAuthor(message.getAuthor());
        dto.setChat(message.getChat());
        dto.setId(message.getId());
        dto.setText(message.getText());
        return dto;
    }
}
