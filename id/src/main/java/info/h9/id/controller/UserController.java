package info.h9.id.controller;

import info.h9.common.utils.ResponseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("login")
public class UserController {

    @GetMapping("")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("hoge", HttpStatus.OK);
    }
}
