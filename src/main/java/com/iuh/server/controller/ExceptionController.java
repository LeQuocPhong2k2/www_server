package com.iuh.server.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionController implements ErrorController {
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String accessDenied() {
        return "exception/error";
    }
}
