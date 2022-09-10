package cole.edd.weddingsite.controllers;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@NoArgsConstructor
public class HomeController {

//    @RequestMapping(path = {"/home", "/", "home.html"}, method = RequestMethod.GET)
    @RequestMapping("/home")
    public ResponseEntity<String> getHomePage(Model model) {
        return new ResponseEntity<>("home", HttpStatus.OK);
//        return "home";
    }
}
