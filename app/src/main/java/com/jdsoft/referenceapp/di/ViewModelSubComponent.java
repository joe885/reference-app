package com.jdsoft.referenceapp.di;

import com.jdsoft.referenceapp.main.ReferenceViewModel;

import dagger.Subcomponent;

/**
 * Created by Joe on 20/01/2018.
 */

@Subcomponent
public interface ViewModelSubComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelSubComponent build();
    }

    ReferenceViewModel lightingViewModel();
}
