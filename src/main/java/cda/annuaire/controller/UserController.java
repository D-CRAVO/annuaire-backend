package cda.annuaire.controller;

import cda.annuaire.model.User;
import cda.annuaire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable long id){
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
    public void updateUser(@RequestBody User user, @PathVariable long id){
        userService.updateUser(user, id);
    }
}
