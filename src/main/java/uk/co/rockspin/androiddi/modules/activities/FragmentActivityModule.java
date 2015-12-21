package uk.co.rockspin.androiddi.modules.activities;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import dagger.Module;
import dagger.Provides;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module public class FragmentActivityModule extends ActivityModule {
    private final FragmentActivity activity;

    public FragmentActivityModule(FragmentActivity activity) {
        super(activity);
        this.activity = activity;
    }

    public @Provides FragmentManager fragmentManager() {
        return activity.getSupportFragmentManager();
    }
}