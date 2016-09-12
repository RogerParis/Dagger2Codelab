package de.devfest.dagger2codelab.core;

import android.app.Application;

import de.devfest.dagger2codelab.di.components.ApplicationComponent;
import de.devfest.dagger2codelab.di.modules.ApplicationModule;

/**
 * Created by RogerParis on 12/09/16.
 */
public class MyApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = ApplicationComponent.Initializer.init(new ApplicationModule(this));
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }
}
