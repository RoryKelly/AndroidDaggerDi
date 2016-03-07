package uk.co.rockspin.androiddi.components.application;

import dagger.Component;
import uk.co.rockspin.androiddi.annotations.PerApplication;
import uk.co.rockspin.androiddi.modules.application.ApplicationModule;

@PerApplication @Component(modules = { ApplicationModule.class }) public interface AbstractApplicationComponent {

}
