package controller;

import dto.UserDTO;
import entity.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/add")
    public ResponseEntity<UserDTO> newUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(new UserDTO()));
    }

    @GetMapping("/parameter/{userId}")
    public ResponseEntity<UserDTO> userInfo(@PathVariable("userId") Long userId) {
        UserDTO result = (UserDTO) userService.getUser(userId, new UserDTO()).orElse(null);
        return ResponseEntity.ok(result);
    }
}
