package oose.dea.services.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import java.util.ArrayList;

/**
 * Created by Wijnand on 5-10-2015.
 */

@ApplicationPath("/rest")
public class RestResourceConfig extends ResourceConfig {
    public static final String JSON_SERIALIZER = "jersey.config.server.provider.packages";
    public static final String JACKSON_JSON_SERIALIZER = "com.fasterxml.jackson.jaxrs.json;service";

    public RestResourceConfig() {
        packages(true, "oose.dea.services.rest" );
        property(JSON_SERIALIZER, JACKSON_JSON_SERIALIZER);
    }
}
