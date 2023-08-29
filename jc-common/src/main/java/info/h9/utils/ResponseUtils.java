package info.h9.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.function.Function;

public class ResponseUtils {
    public static <DTO, RESPONSE> ResponseEntity<RESPONSE> buildResponse(
        Function<DTO, RESPONSE> response,
        DTO dto
    ) {
        return new ResponseEntity<>(response.apply(dto), new HttpHeaders(), HttpStatus.OK);
    }

}
