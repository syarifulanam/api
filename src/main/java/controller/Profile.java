package Com.belajar.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Profile {

    @RequestMapping("/profile")
    @ResponseBody
    public String profile() {
        return "Ini adalah halaman profile";
    }
}
