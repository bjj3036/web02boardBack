package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/api/user")
    public List users() {
        return this.userService.findAll();
    }

    @DeleteMapping(value = "/api/user/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return this.userService.deleteById(id);
    }

    @PostMapping(value = "/api/user/add")
    public Long add(@RequestBody User user) {
        return this.userService.add(user);
    }

    @PutMapping(value = "/api/user/modify")
    public int modify(@RequestBody User user) {
        return this.userService.modify(user);
    }

    @PutMapping(value = "/api/user/findById/{id}")
    public User findById(@PathVariable Long id){
        return this.userService.findById(id);
    }

}
