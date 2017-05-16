package com.antonicastejon.domain.requests;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public class NoInternetException extends Throwable {

    private final static String NO_INTERNET_ERROR = "No internet connection";

    public NoInternetException() {
        super(NO_INTERNET_ERROR);
    }
}
