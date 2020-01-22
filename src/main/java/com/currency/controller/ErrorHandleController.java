package com.currency.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandleController implements ErrorController{

	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "<h2>Ooops..Something went wrong! </h2><br> Please contact web administrator.";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
