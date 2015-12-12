package uk.co.rockspin.androiddi.modules.activities;


import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;
import uk.co.rockspin.androiddi.annotations.PerActivity;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    public @Provides @PerActivity
    Activity activity() {
        return activity;
    }

    public @Provides @PerActivity CompositeSubscription compositeSubscription() {
        return new CompositeSubscription();
    }

    public @Provides LayoutInflater layoutInflater() {
        return LayoutInflater.from(activity);
    }

    public @Provides Resources resources() {
        return activity().getResources();
    }

    public @Provides NotificationManager notificationManager() {
        return (NotificationManager) activity.getSystemService(Context.NOTIFICATION_SERVICE);
    }
}