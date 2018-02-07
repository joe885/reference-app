package com.jdsoft.referenceapp.main;

import com.jdsoft.referenceapp.di.scopes.FragmentScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Joe on 20/01/2018.
 */

@Module
public abstract class MainActivityFragmentsBindingModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment contributeMainFragment();
}
