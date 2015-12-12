package uk.co.rockspin.androiddi.components.application;


import android.content.Context;
import android.content.SharedPreferences;

import dagger.Component;
import uk.co.rockspin.androiddi.modules.application.ApplicationModule;

@Component(modules = { ApplicationModule.class }) public interface IAbstractApplicationComponent {

    //this exposes the provides to any submodules
    Context getContext();

    SharedPreferences getSharedPreferences();
}
