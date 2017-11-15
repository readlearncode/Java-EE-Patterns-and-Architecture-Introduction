package com.readlearncode.dependecyinjection.part2;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Target {

    @Inject
    @Favourite
    private Subject subject;

}