package nama.springboot.firstspringbootproj.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="welcome")
public class WelcomeRestController {

    // welcome/greet
  //@RequestMapping(value="/greet",method=RequestMethod.POST)
    @PostMapping("/greet")
    public String greetMe()
    {
        System.out.println("greetMe method called inside " +
                          "post-wala /greet path param..");
        return "Hello, Everyone!(inside post request)";
    }

   // @RequestMapping(value="/greet",method=RequestMethod.GET)
     @GetMapping("/greet")
    public String greetMe1()
    {
        System.out.println("greetMe method called get /greet path param...");
        return "Hello, Everyone! (inside get request)";
    }


}
