package cn.wjq.myweb.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/code")
public class OauthCode {

    @GetMapping()
    public String code(@RequestParam("code") String code) {

        if (StringUtils.hasText(code)) {
            return "success";
        }
        return "fail";
    }
}
