package uk.co.rockspin.androiddi.components.activities;


import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;

import dagger.Component;
import uk.co.rockspin.androiddi.annotations.PerActivity;
import uk.co.rockspin.androiddi.components.application.IAbstractApplicationComponent;
import uk.co.rockspin.androiddi.modules.activities.ActivityModule;

/**
 * A base component upon which fragment's components may depend.  Activity-level components
 * should extend this component.
 */
@PerActivity // Subtypes of ActivityComponent should be decorated with @PerActivity.
@Component(dependencies = IAbstractApplicationComponent.class, modules = ActivityModule.class) public interface IAbstractActivityComponent {
    Activity activity(); // Expose the activity to sub-graphs.

    Resources resources();

    LayoutInflater layoutInflator();
}