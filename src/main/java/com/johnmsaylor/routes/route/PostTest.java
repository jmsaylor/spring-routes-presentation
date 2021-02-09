package com.johnmsaylor.routes.route;

import com.johnmsaylor.routes.model.TestObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostTest {

    @PostMapping("/test")
    public Object test(@RequestBody TestObject body, @RequestHeader("x-auth-token") String jwt) {
        System.out.println("Token: " + jwt);
        System.out.println(body.getFirst() + " " + body.getMiddle() + " " + body.getLast());
        body.setLast("##########");
        return body;
    }
}
