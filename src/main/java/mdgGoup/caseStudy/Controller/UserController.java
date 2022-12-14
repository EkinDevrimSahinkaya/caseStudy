package mdgGoup.caseStudy.Controller;


import mdgGoup.caseStudy.Service.UserService;
import mdgGoup.caseStudy.DTO.UserDTO;
import mdgGoup.caseStudy.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDTO> findAll(){ return userService.findAll(); }

    @GetMapping("/{user-id}")
    public UserDTO getUserById(@PathVariable("user-id") int id) {return userService.findById(id); }

    @DeleteMapping("/{user-id}")
    public void deleteById(@PathVariable("user-id") int id){ userService.deleteById(id); }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/signin")
    public boolean getUserById(@RequestBody String body) {
        String[] result = body.split("\\s+");
        return userService.validateUser(result[0], result[1]);
    }

}