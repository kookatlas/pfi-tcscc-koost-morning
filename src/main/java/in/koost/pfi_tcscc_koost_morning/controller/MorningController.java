package in.koost.pfi_tcscc_koost_morning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MorningController {


    @GetMapping("/morning")
    public ResponseEntity<String> goodMorning(){
        return new ResponseEntity<>("Good morning", HttpStatus.OK);
    }
}
