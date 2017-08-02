package me.xiaobailong24.mvvmarms.weather.app;

import me.xiaobailong24.mvvmarms.base.ArmsApplication;
import me.xiaobailong24.mvvmarms.weather.di.component.AppComponent;
import me.xiaobailong24.mvvmarms.weather.di.component.DaggerAppComponent;
import me.xiaobailong24.mvvmarms.weather.di.module.AppModule;

/**
 * Created by xiaobailong24 on 2017/7/13.
 */

public class MainApp extends ArmsApplication {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent
                .builder()
                .armsComponent(getArmsComponent())
                .appModule(new AppModule(this))
                .build();
        mAppComponent.inject(this);
    }


    public AppComponent getAppComponent() {
        return this.mAppComponent;
    }

}
