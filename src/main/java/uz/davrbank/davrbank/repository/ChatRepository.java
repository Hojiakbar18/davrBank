package uz.davrbank.davrbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.davrbank.davrbank.entity.Chat;

import java.util.List;
import java.util.UUID;

public interface ChatRepository extends JpaRepository<Chat, UUID> {

}
