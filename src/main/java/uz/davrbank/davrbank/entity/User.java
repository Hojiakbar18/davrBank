package uz.davrbank.davrbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.davrbank.davrbank.entity.template.AbsTemplate;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends AbsTemplate {

    @Column(unique = true)
    private String username;
}
