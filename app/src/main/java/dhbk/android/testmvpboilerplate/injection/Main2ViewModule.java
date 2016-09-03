package dhbk.android.testmvpboilerplate.injection;

import android.support.annotation.NonNull;

import dhbk.android.testmvpboilerplate.interactor.Main2Interactor;
import dhbk.android.testmvpboilerplate.interactor.impl.Main2InteractorImpl;
import dhbk.android.testmvpboilerplate.presenter.loader.PresenterFactory;
import dhbk.android.testmvpboilerplate.presenter.Main2Presenter;
import dhbk.android.testmvpboilerplate.presenter.impl.Main2PresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public final class Main2ViewModule {
    @Provides
    public Main2Interactor provideInteractor() {
        return new Main2InteractorImpl();
    }

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
