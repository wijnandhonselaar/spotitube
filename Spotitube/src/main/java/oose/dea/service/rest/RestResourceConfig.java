package oose.dea.service.rest;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Wijnand on 6-10-2015.
 */

public class RestResourceConfig extends ResourceConfig {
    public static final String JSON_SERIALIZER = "jersey.config.server.provider.packages";
    public static final String JACKSON_JSON_SERIALIZER = "com.fasterxml.jackson.jaxrs.json;service";

    public RestResourceConfig() {
        packages(true, "oose.dea.services.playlist");
        property(JSON_SERIALIZER, JACKSON_JSON_SERIALIZER);
    }
}
