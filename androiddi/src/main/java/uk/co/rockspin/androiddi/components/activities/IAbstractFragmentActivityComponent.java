package uk.co.rockspin.androiddi.components.activities;


import android.support.v4.app.FragmentManager;

import dagger.Component;
import uk.co.rockspin.androiddi.annotations.PerActivity;
import uk.co.rockspin.androiddi.components.application.IAbstractApplicationComponent;
import uk.co.rockspin.androiddi.modules.activities.FragmentActivityModule;

/**
 * A base component upon which fragment's components may depend.  Activity-level components
 * should extend this component.
 */
@PerActivity // Subtypes of ActivityComponent should be decorated with @PerActivity.
@Component(dependencies = IAbstractApplicationComponent.class, modules = FragmentActivityModule.class) public interface IAbstractFragmentActivityComponent
    extends IAbstractActivityComponent {
    FragmentManager fragmentManager();
}