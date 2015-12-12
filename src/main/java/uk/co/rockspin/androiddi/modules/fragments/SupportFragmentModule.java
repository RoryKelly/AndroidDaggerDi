package uk.co.rockspin.androiddi.modules.fragments;


import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;
import uk.co.rockspin.androiddi.annotations.PerFragment;

@Module public class SupportFragmentModule {

    private final Fragment fragment;

    public SupportFragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides @PerFragment
    Fragment getFragment() {
        return fragment;
    }

    @Provides @PerFragment CompositeSubscription getCompositeSubscription() {
        return new CompositeSubscription();
    }
}
