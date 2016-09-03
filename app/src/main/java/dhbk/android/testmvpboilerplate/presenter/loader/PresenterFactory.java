package dhbk.android.testmvpboilerplate.presenter.loader;

import android.support.annotation.NonNull;

import dhbk.android.testmvpboilerplate.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
