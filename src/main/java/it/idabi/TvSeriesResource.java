package it.idabi;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Singleton
@Path("/tvSeries")   // localhost/8080/tvSeries
public class TvSeriesResource {

    @Inject
    @RestClient
    TvSeriesService tvSeriesService;

    @GET
    @Path("/{id}")  // localhost/8080/tvSeries/{id} -> http://api.tvmaze.com/shows/{id}
    public TvSeries getTvSeriesById(@PathParam("id") int id) {
        return tvSeriesService.getSeriesById(id);
    }

}
