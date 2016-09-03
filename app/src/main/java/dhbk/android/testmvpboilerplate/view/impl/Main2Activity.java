package dhbk.android.testmvpboilerplate.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import dhbk.android.testmvpboilerplate.R;
import dhbk.android.testmvpboilerplate.view.Main2View;
import dhbk.android.testmvpboilerplate.presenter.loader.PresenterFactory;
import dhbk.android.testmvpboilerplate.presenter.Main2Presenter;
import dhbk.android.testmvpboilerplate.injection.AppComponent;
import dhbk.android.testmvpboilerplate.injection.Main2ViewModule;
import dhbk.android.testmvpboilerplate.injection.DaggerMain2ViewComponent;

import javax.inject.Inject;

public final class Main2Activity extends BaseActivity<Main2Presenter, Main2View> implements Main2View {
    @Inject
    PresenterFactory<Main2Presenter> mPresenterFactory;

    // Your presenter is available using the mPresenter variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Your code here
        // Do not call mPresenter from here, it will be null! Wait for onStart or onPostCreate.
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerMain2ViewComponent.builder()
                .appComponent(parentComponent)
                .main2ViewModule(new Main2ViewModule())
                .build()
                .inject(this);
    }

    @NonNull
    @Override
    protected PresenterFactory<Main2Presenter> getPresenterFactory() {
        return mPresenterFactory;
    }
}
