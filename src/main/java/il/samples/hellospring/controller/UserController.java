package il.samples.hellospring.controller;

import il.samples.hellospring.data.UserEntity;
import il.samples.hellospring.data.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping()
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
}
