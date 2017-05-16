package com.antonicastejon.domain.requests;

import io.reactivex.functions.Consumer;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public class RequestConsumer<T> implements Consumer<T> {

    private final Callback<T> callback;

    public RequestConsumer(Callback<T> callback) {
        this.callback = callback;
    }

    @Override
    public void accept(T response) throws Exception {
        callback.onResponse(response);
    }

    public void onError(String message) {
        callback.onError(message);
    }
}
