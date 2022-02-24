package uz.davrbank.davrbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.davrbank.davrbank.entity.Message;

import java.util.List;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<Message> getAllByChatId(UUID author_id);
}
