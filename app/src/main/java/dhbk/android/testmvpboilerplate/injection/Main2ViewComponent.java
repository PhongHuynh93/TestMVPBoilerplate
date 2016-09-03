package dhbk.android.testmvpboilerplate.injection;

import dhbk.android.testmvpboilerplate.view.impl.Main2Activity;

import dagger.Component;


/**
 * todo 3 declare Dependent Components with different scope compared with the parent component
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = Main2ViewModule.class)
public interface Main2ViewComponent {
    void inject(Main2Activity activity);
}