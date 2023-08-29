package info.h9.controller;

import info.h9.domain.home.HomeRequest;
import info.h9.domain.home.HomeResponse;
import info.h9.utils.ResponseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<HomeResponse> index(
        @Validated HomeRequest requestBody,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        return ResponseUtils.buildResponse(HomeResponse::new, requestBody.toDto());
    }
}
