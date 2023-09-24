package info.h9.controller;

import info.h9.domain.home.HomeRequest;
import info.h9.domain.home.HomeResponse;
import info.h9.service.home.HomeService;
import info.h9.utils.ResponseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("")
    public ResponseEntity<HomeResponse> index(
            @Validated HomeRequest requestBody,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            throw new IllegalArgumentException("Invalid parameters");
        }

        return ResponseUtils.buildResponse(HomeResponse::new, homeService.getHome(requestBody.toDto()));
    }
}
