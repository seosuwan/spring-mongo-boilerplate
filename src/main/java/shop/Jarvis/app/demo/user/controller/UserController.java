package shop.Jarvis.app.demo.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.Jarvis.app.demo.user.entity.User;
import shop.Jarvis.app.demo.user.service.UserService;
import shop.Jarvis.app.demo.user.service.UserServiceImpl;

import java.util.List;

@RestController@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
    @GetMapping("/users/all")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/users/name/{name}")
    public List<User> findByName(@PathVariable String name){
        return userService.findAllByName(name);
    }
}
