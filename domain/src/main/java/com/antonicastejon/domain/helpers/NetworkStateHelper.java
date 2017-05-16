package com.antonicastejon.domain.helpers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Antoni Castejón on 28/01/2017.
 */

public class NetworkStateHelper {

    private Context appContext;

    public NetworkStateHelper(Context appContext) {
        this.appContext = appContext;
    }

    public boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager
                = (ConnectivityManager) appContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
