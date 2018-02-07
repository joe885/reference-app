package com.jdsoft.referenceapp.di;

import com.jdsoft.referenceapp.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Joe on 20/01/2018.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, ActivityBindingModule.class})
public interface ApplicationComponent {
    void inject(Application application);
}
