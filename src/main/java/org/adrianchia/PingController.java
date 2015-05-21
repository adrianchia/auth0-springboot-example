package org.adrianchia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by adrianchia on 5/20/15.
 */
@Controller
public class PingController {

    @RequestMapping("/ping")
    @ResponseBody
    public String ping() {
        return "Hooray!, you can reach this endpoint without authentication";
    }
}
