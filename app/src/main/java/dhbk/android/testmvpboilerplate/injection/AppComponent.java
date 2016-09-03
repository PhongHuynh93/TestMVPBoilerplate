package dhbk.android.testmvpboilerplate.injection;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import dhbk.android.testmvpboilerplate.App;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    // todo 2 downstream components need these exposed with the return type method name does not really matter
    Context getAppContext();

    App getApp();
}