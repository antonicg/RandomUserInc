package com.antonicastejon.model.repository.services;

import com.antonicastejon.model.repository.api.UserApi;
import com.antonicastejon.model.repository.entities.base.RepositoryResponse;
import com.antonicastejon.model.repository.entities.user.User;

import io.reactivex.Flowable;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public class UserService extends BaseService<User> {

    private UserApi userApi;
    private int results;

    public UserService(UserApi userApi, int results) {
        this.userApi = userApi;
        this.results = results;
    }

    @Override
    protected Flowable<RepositoryResponse<User>> executeService() {
        return userApi.getUsers(results);
    }
}
