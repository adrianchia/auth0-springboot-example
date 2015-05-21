package org.adrianchia;

import com.auth0.spring.security.auth0.Auth0JWTToken;
import com.auth0.spring.security.auth0.Auth0UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
