package com.kafein.project.RestApi;

import com.kafein.project.Entities.User;
import com.kafein.project.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> get(){
        return this.userService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        this.userService.add(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user){
        this.userService.update(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody User user){
        this.userService.delete(user);
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return this.userService.getById(id);
    }

    @RequestMapping("/users/{id}/blog")
    @ResponseBody
    public String readPost(@PathVariable int id) {
        User user = this.userService.getById(id);
        return String.format(user.getUsername() + "'s Blog: " + user.getBlogPost());
    }
}
