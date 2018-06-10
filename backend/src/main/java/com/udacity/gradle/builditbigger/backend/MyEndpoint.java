package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.mostafa1075.javajokes.Joker;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com"
        )
)
public class MyEndpoint {

    /** Retrieves the joke from the Java class and returns it */
    @ApiMethod(name = "retrieveJoke")
    public MyBean retrieveJoke() {
        Joker joker = new Joker();
        String joke = joker.getJoke();

        MyBean response = new MyBean();
        response.setData(joke);
        return response;
    }

}
