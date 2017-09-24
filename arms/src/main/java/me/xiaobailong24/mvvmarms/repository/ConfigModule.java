package me.xiaobailong24.mvvmarms.repository;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentManager;

import java.util.List;

import me.xiaobailong24.mvvmarms.base.delegate.AppLifecycles;
import me.xiaobailong24.mvvmarms.di.module.GlobalConfigModule;

/**
 * Created by xiaobailong24 on 2017/6/16.
 * 框架配置接口
 */
public interface ConfigModule {
    /**
     * 使用{@link GlobalConfigModule.Builder}给框架配置一些配置参数
     *
     * @param context: Context
     * @param builder: GlobalConfigModule.Builder
     */
    void applyOptions(Context context, GlobalConfigModule.Builder builder);


    /**
     * 使用{@link IRepositoryManager}给框架注入一些数据管理服务
     *
     * @param context:           Context
     * @param repositoryManager: IRepositoryManager
     */
    void registerComponents(Context context, IRepositoryManager repositoryManager);

    /**
     * 使用{@link AppLifecycles}在Application的生命周期中注入一些操作
     */
    void injectAppLifecycle(Context context, List<AppLifecycles> lifecycles);

    /**
     * 使用{@link Application.ActivityLifecycleCallbacks}在Activity的生命周期中注入一些操作
     *
     * @param context:    Context
     * @param lifecycles: List<Application.ActivityLifecycleCallbacks>
     */
    void injectActivityLifecycle(Context context, List<Application.ActivityLifecycleCallbacks> lifecycles);


    /**
     * 使用{@link FragmentManager.FragmentLifecycleCallbacks}在Fragment的生命周期中注入一些操作
     *
     * @param context:    Context
     * @param lifecycles: List<FragmentManager.FragmentLifecycleCallbacks>
     */
    void injectFragmentLifecycle(Context context, List<FragmentManager.FragmentLifecycleCallbacks> lifecycles);
}
