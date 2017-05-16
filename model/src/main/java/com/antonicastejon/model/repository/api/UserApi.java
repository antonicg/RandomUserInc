package com.antonicastejon.model.repository.api;

import com.antonicastejon.model.repository.entities.base.RepositoryResponse;
import com.antonicastejon.model.repository.entities.user.User;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public interface UserApi {
    @GET("/") Flowable<RepositoryResponse<User>> getUsers(@Query("results") int results);
}
