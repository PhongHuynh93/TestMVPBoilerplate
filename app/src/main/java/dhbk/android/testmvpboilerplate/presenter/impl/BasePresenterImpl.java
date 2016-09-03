package dhbk.android.testmvpboilerplate.presenter.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import dhbk.android.testmvpboilerplate.presenter.BasePresenter;

/**
 * todo 7 - Abstract presenter implementation that contains base implementation for other presenters.
 * Subclasses must call super for all {@link BasePresenter} method overriding.
 */
public abstract class BasePresenterImpl<V> implements BasePresenter<V> {
    /**
     * The view
     */
    @Nullable
    protected V mView;

    /**
     * attach the view
     * @param view the view
     */
    @Override
    public void onViewAttached(@NonNull V view) {
        mView = view;
    }


    @Override
    public void onStart(boolean firstStart) {

    }

    @Override
    public void onStop() {

    }

    /**
     * detach the view
     */
    @Override
    public void onViewDetached() {
        mView = null;
    }

    @Override
    public void onPresenterDestroyed() {

    }
}
