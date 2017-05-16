package com.antonicastejon.domain.business.usecases.base;

import android.support.annotation.NonNull;

import com.antonicastejon.domain.helpers.NetworkStateHelper;
import com.antonicastejon.domain.requests.NoInternetException;
import com.antonicastejon.domain.requests.RequestConsumer;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public abstract class BaseUseCase<T> {

    protected abstract void executeRequest(RequestConsumer<T> callback);

    private NetworkStateHelper networkStateHelper;

    public BaseUseCase(NetworkStateHelper networkStateHelper) {
        this.networkStateHelper = networkStateHelper;
    }

    public void execute(RequestConsumer<T> callback) {
        if (networkStateHelper.isNetworkAvailable()) {
            executeRequest(callback);
        }
        else {
            onError(new NoInternetException(), callback);
        }
    }

    protected void onError(@NonNull Throwable throwable, RequestConsumer<T> callback) {
        callback.onError(throwable.getMessage());
    }
}
