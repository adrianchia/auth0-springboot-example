package org.adrianchia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * Created by adrianchia on 5/20/15.
 */
@Controller
public class SecuredPingController {

    @RequestMapping("/secured/ping")
    @ResponseBody
    public String ping(Principal principal) {
        return "Hooray " + principal.getName() + "! " + " You reached this endpoint after authentication";
    }
}
