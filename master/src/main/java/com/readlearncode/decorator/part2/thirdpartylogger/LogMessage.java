package com.readlearncode.decorator.part2.thirdpartylogger;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public interface LogMessage {
    void printMessage();
    String getMessage();
    void setMessage(String message);
}