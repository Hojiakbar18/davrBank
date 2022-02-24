package uz.davrbank.davrbank.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.davrbank.davrbank.entity.User;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatDto {

    private UUID id;

    private String name;

    private List<User> users;
}
