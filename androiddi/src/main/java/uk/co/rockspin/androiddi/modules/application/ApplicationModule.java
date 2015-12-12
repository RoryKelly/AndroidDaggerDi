package uk.co.rockspin.androiddi.modules.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;

import dagger.Module;
import dagger.Provides;

import static uk.co.rockspin.guandroid.Preconditions.checkNotNull;

@Module public class ApplicationModule {

    final Context context;

    public ApplicationModule(Application context) {
        this.context = checkNotNull(context, "Context cannot be null");
    }

    @Provides public Context providesContext() {
        return context;
    }

    @Provides public SharedPreferences providesSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides public LayoutInflater providesLayoutInflater() {
        return LayoutInflater.from(context);
    }
}
