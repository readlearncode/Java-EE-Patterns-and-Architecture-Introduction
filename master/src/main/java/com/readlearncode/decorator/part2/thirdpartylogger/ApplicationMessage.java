package com.readlearncode.decorator.part2.thirdpartylogger;

import com.readlearncode.decorator.part1.thirdpartylogger.LogMessage;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ApplicationMessage implements LogMessage {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.print(message);
    }
}