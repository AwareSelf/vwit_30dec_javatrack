package nama.springboot.usingprofiledemo.restcontroller;

import nama.springboot.usingprofiledemo.AppProperties;
import nama.springboot.usingprofiledemo.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRest {
    @Autowired
    AppProperties appprop;

    @Autowired
    GlobalProperties globprop;

    //you can access all global and properties with specific prefix here
    //once you autowire ConfigurationProperties class

    @GetMapping("email")
    public String getEmail()
    {
       return globprop.getEmail();
    }

    @GetMapping("/menu/0/title")
    public String getMenuTitle()
    {
        return this.appprop.getMenus().get(0).getTitle();
    }


}
