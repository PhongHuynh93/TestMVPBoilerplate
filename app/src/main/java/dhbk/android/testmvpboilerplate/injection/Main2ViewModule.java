package dhbk.android.testmvpboilerplate.injection;

import android.support.annotation.NonNull;

import dhbk.android.testmvpboilerplate.interactor.Main2Interactor;
import dhbk.android.testmvpboilerplate.interactor.impl.Main2InteractorImpl;
import dhbk.android.testmvpboilerplate.presenter.loader.PresenterFactory;
import dhbk.android.testmvpboilerplate.presenter.Main2Presenter;
import dhbk.android.testmvpboilerplate.presenter.impl.Main2PresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * todo 4 declare module that {@link dhbk.android.testmvpboilerplate.view.impl.Main2Activity} need
 */
@Module
public final class Main2ViewModule {
    // it need interactor for presenter to interact with reposition
    @Provides
    public Main2Interactor provideInteractor() {
        return new Main2InteractorImpl();
    }

    /**
     * get the interactor to create the presenter
     * @param interactor above interactor to communicate with reposition
     * @return the presenter of the {@link dhbk.android.testmvpboilerplate.view.impl.Main2Activity}
     */
    @Provides
    public PresenterFactory<Main2Presenter> providePresenterFactory(@NonNull final Main2Interactor interactor) {
        return new PresenterFactory<Main2Presenter>() {
            @NonNull
            @Override
            public Main2Presenter create() {
                return new Main2PresenterImpl(interactor);
            }
        };
    }
}
