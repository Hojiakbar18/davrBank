package uz.davrbank.davrbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.davrbank.davrbank.entity.User;
import uz.davrbank.davrbank.payload.ApiResponse;
import uz.davrbank.davrbank.payload.UserDto;
import uz.davrbank.davrbank.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ApiResponse saveUser(UserDto dto){

        try {
            User user=new User();

            user.setUsername(dto.getUsername());

            userRepository.save(user);
            return new ApiResponse("success",true);
        }catch (Exception e){
            e.printStackTrace();
            return new ApiResponse("Error",false);
        }
    }

}
