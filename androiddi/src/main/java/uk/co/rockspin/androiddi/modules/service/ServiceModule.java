package uk.co.rockspin.androiddi.modules.service;


import android.app.Service;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;
import uk.co.rockspin.androiddi.annotations.PerService;

@Module public class ServiceModule {
    private final Service service;

    public ServiceModule(Service service) {
        this.service = service;
    }

    @Provides @PerService
    CompositeSubscription getCompositeSubscription() {
        return new CompositeSubscription();
    }
}
