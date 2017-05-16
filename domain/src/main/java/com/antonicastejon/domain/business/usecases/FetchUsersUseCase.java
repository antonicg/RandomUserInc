package com.antonicastejon.domain.business.usecases;

import com.antonicastejon.domain.business.usecases.base.BaseUseCase;
import com.antonicastejon.domain.helpers.NetworkStateHelper;
import com.antonicastejon.domain.requests.RequestConsumer;
import com.antonicastejon.model.repository.entities.base.RepositoryResponse;
import com.antonicastejon.model.repository.entities.user.User;
import com.antonicastejon.model.repository.services.UserService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Antoni Castejón on 16/05/2017.
 */

public class FetchUsersUseCase extends BaseUseCase<RepositoryResponse<User>> {

    private UserService userService;

    public FetchUsersUseCase(NetworkStateHelper networkStateHelper, UserService userService) {
        super(networkStateHelper);
        this.userService = userService;
    }

    @Override
    protected void executeRequest(RequestConsumer<RepositoryResponse<User>> callback) {
        userService.execute()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {

                    }
                });
    }
}
