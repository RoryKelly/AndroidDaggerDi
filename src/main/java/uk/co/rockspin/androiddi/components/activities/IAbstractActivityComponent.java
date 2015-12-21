package uk.co.rockspin.androiddi.components.activities;


import dagger.Subcomponent;
import uk.co.rockspin.androiddi.annotations.PerActivity;
import uk.co.rockspin.androiddi.modules.activities.ActivityModule;

/**
 * A base component upon which fragment's components may depend.  Activity-level components
 * should extend this component.
 */
@PerActivity // Subtypes of ActivityComponent should be decorated with @PerActivity.
@Subcomponent(modules = ActivityModule.class) public interface IAbstractActivityComponent {

}