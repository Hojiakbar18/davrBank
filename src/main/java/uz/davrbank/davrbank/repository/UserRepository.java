package uz.davrbank.davrbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.davrbank.davrbank.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User,UUID> {
}
