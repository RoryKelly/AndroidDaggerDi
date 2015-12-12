package uk.co.rockspin.androiddi.components.fragments;

import dagger.Component;
import rx.subscriptions.CompositeSubscription;
import uk.co.rockspin.androiddi.annotations.PerFragment;
import uk.co.rockspin.androiddi.components.activities.IAbstractActivityComponent;
import uk.co.rockspin.androiddi.modules.fragments.SupportFragmentModule;

/**
 * Should depend on a specific implementation of IAbstractActivityComponent.
 */
@PerFragment @Component(dependencies = IAbstractActivityComponent.class, modules = SupportFragmentModule.class)
public interface IAbstractSupportFragmentComponent {

    @PerFragment CompositeSubscription fragmentSubscriptions();

}
