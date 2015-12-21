package uk.co.rockspin.androiddi.modules.activities;

import android.support.v7.app.AppCompatActivity;
import dagger.Module;
import dagger.Provides;
import uk.co.rockspin.androiddi.annotations.PerActivity;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module public class AppCompatActivityModule extends FragmentActivityModule {
    private final AppCompatActivity activity;

    public AppCompatActivityModule(AppCompatActivity activity) {
        super(activity);
        this.activity = activity;
    }

    public @Provides @PerActivity AppCompatActivity appCompatActivity() {
        return activity;
    }

}