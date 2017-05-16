package com.antonicastejon.domain.requests;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public interface Callback<T> {
    void onResponse(T data);
    void onError(String message);
}
