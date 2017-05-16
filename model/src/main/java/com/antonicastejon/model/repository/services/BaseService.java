package com.antonicastejon.model.repository.services;

import com.antonicastejon.model.repository.entities.base.RepositoryResponse;

import io.reactivex.Flowable;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public abstract class BaseService<T> {

    private final static String TAG = BaseService.class.getName();

    protected abstract Flowable<RepositoryResponse<T>> executeService();

    public BaseService() {}

    public Flowable<RepositoryResponse<T>> execute() {
        return executeService();
    }
}

