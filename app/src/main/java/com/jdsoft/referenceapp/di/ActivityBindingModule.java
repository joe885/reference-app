package com.jdsoft.referenceapp.di;

import com.jdsoft.referenceapp.di.scopes.ActivityScope;
import com.jdsoft.referenceapp.main.MainActivity;
import com.jdsoft.referenceapp.main.MainActivityFragmentsBindingModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Joe on 20/01/2018.
 */

@Module
public abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityFragmentsBindingModule.class)
    abstract MainActivity contributeMainActivityInjector();
}
