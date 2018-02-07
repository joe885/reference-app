package com.jdsoft.referenceapp.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Joe on 07/02/2018.
 */

@Module
public class MainFragmentModule {

    @Provides
    ReferenceViewModel provideReferenceViewModel(MainFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(ReferenceViewModel.class);
    }
}
