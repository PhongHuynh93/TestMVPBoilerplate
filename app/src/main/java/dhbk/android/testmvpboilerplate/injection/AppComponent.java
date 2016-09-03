package dhbk.android.testmvpboilerplate.injection;

import android.content.Context;

import dhbk.android.testmvpboilerplate.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getAppContext();

    App getApp();
}