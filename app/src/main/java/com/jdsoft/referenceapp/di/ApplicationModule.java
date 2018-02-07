package com.jdsoft.referenceapp.di;

import android.arch.lifecycle.ViewModelProvider;

import com.jdsoft.referenceapp.data.ReferenceSingleton;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Joe on 20/01/2018.
 */

@Module(subcomponents = ViewModelSubComponent.class)
public class ApplicationModule {

    @Singleton
    @Provides
    ReferenceSingleton provideReferenceSingleton() {
        return new ReferenceSingleton();
    }

    @Singleton
    @Provides
    ViewModelProvider.Factory provideViewModelFactory(ViewModelSubComponent.Builder viewModelSubComponent) {
        return new InjectableViewModelFactory(viewModelSubComponent.build());
    }
}
