package com.johnmsaylor.routes.route;

import com.johnmsaylor.routes.model.TestObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200") // for future reference when testing full stack
public class GetTest {

    @GetMapping("/{id}")
    public Object test(@PathVariable Integer id){
        return "This works! This number is " + id;
    }

    @GetMapping
    public Object test2(@RequestParam Integer id){
        return id;
    }
}
