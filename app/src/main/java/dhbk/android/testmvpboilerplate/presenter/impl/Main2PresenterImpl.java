package dhbk.android.testmvpboilerplate.presenter.impl;

import android.support.annotation.NonNull;

import javax.inject.Inject;

import dhbk.android.testmvpboilerplate.interactor.Main2Interactor;
import dhbk.android.testmvpboilerplate.presenter.Main2Presenter;
import dhbk.android.testmvpboilerplate.view.Main2View;

/**
 * todo 6b - implement the presenter contract
 */
public final class Main2PresenterImpl extends BasePresenterImpl<Main2View> implements Main2Presenter {
    /**
     * The interactor
     */
    @NonNull
    private final Main2Interactor mInteractor;

    // The view is available using the mView variable
    @Inject
    public Main2PresenterImpl(@NonNull Main2Interactor interactor) {
        mInteractor = interactor;
    }

    @Override
    public void onStart(boolean firstStart) {
        super.onStart(firstStart);

        // Your code here. Your view is available using mView and will not be null until next onStop()
    }

    @Override
    public void onStop() {
        // Your code here, mView will be null after this method until next onStart()

        super.onStop();
    }

    @Override
    public void onPresenterDestroyed() {
        /*
         * Your code here. After this method, your presenter (and view) will be completely destroyed
         * so make sure to cancel any HTTP call or database connection
         */

        super.onPresenterDestroyed();
    }
}