package it.idabi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/shows")
//@RegisterRestClient(baseUri = "http://api.tvmaze.com/")
@RegisterRestClient(configKey = "tvmaze-api") // application.properties
public interface TvSeriesService {  // proxy  // http://api.tvmaze.com/shows/120

    @GET
    @Path("/{id}")  // http://api.tvmaze.com/shows/{id}
    public TvSeries getSeriesById(@PathParam("id") int id);
}
