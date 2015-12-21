package uk.co.rockspin.androiddi.components.fragments;

import android.view.LayoutInflater;
import dagger.Subcomponent;
import uk.co.rockspin.androiddi.annotations.ForActivity;
import uk.co.rockspin.androiddi.annotations.PerFragment;
import uk.co.rockspin.androiddi.modules.fragments.SupportFragmentModule;

/**
 * Should depend on a specific implementation of IAbstractActivityComponent.
 */
@PerFragment @Subcomponent(modules = SupportFragmentModule.class)
public interface IAbstractSupportFragmentComponent {

    @ForActivity LayoutInflater layoutInflater();
}
