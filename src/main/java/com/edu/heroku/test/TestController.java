package com.edu.heroku.test;


import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

//    @Autowired
//    private UserRepository userRepository;

    @RequestMapping(value = "/")
    public String home() {
        return "Hello World !";
    }

    @RequestMapping(value = "/test")
    public String home2() {
        return "Hello World ! test path";
    }

    @RequestMapping(value = "/dis")
    public String home3(@RequestParam String name) {
        return "your name is " + name;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable long id) {
        User user = new User();
        user.setId(id);
        user.setName("sherif");
        return user;
//        return userRepository.findOne(id);
    }

//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public void addUser(@RequestBody User user) {
//        userRepository.save(user);
//    }


}
