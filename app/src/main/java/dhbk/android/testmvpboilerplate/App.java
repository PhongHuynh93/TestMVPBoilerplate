package dhbk.android.testmvpboilerplate;

import android.app.Application;
import android.support.annotation.NonNull;

import dhbk.android.testmvpboilerplate.injection.AppComponent;
import dhbk.android.testmvpboilerplate.injection.AppModule;
import dhbk.android.testmvpboilerplate.injection.DaggerAppComponent;

public final class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}