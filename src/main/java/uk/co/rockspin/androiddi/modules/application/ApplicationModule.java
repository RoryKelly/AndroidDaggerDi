package uk.co.rockspin.androiddi.modules.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import dagger.Module;
import dagger.Provides;
import uk.co.rockspin.androiddi.annotations.ForApplication;
import uk.co.rockspin.androiddi.annotations.PerApplication;

import static uk.co.rockspin.androiddi.Preconditions.checkNotNull;

@Module public class ApplicationModule {

    final Context context;

    public ApplicationModule(Application context) {
        this.context = checkNotNull(context, "Context cannot be null");
    }

    @Provides @PerApplication @ForApplication public Context providesContext() {
        return context;
    }

    @Provides @PerApplication public SharedPreferences providesSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides @PerApplication @ForApplication public LayoutInflater providesLayoutInflater() {
        return LayoutInflater.from(context);
    }
}
