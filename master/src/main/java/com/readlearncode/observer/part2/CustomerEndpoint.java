package com.readlearncode.observer.part2;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import static com.readlearncode.observer.part2.CustomerEvent.Type.ADD;
import static com.readlearncode.observer.part2.CustomerEvent.Type.REMOVE;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Stateless
@Path("/customers")
public class CustomerEndpoint {

    @Inject
    @CustomerEvent(ADD)
    private Event<Customer> customerAddEvent;

    @Inject
    @CustomerEvent(REMOVE)
    private Event<Customer> customerRemoveEvent;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void newCustomer(Customer customer) {
        customerAddEvent.fire(customer);
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeCustomer(Customer customer) {
        customerRemoveEvent.fire(customer);
    }

}