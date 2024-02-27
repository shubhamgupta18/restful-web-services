package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {


    private final String message;

    public String getMessage() {
        return message;
    }

    public String setMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public HelloWorldBean(String message) {

        this.message = message;


    }
}
