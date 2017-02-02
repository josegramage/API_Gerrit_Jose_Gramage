package com.fpmislata.practicas.api_gerrit_jose_gramage;

/**
 * Created by joso on 02/02/2017.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GerritAPI {
    @GET("changes/")
    Call<List<Change>> loadChanges(@Query("q") String status);
}
