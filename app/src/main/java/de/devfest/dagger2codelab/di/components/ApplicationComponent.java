package de.devfest.dagger2codelab.di.components;

import android.content.Context;

import dagger.Component;
import de.devfest.dagger2codelab.data.api.GitHubApi;
import de.devfest.dagger2codelab.di.modules.ApplicationModule;
import de.devfest.dagger2codelab.di.scopes.ApplicationScope;
import de.devfest.dagger2codelab.ui.MainActivity;

/**
 * Created by RogerParis on 12/09/16.
 */
@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity activity);

    Context getApplicationContext();

    GitHubApi getGitHubApi();

    final class Initializer{

        private Initializer(){}

        public static ApplicationComponent init(ApplicationModule applicationModule) {
            return DaggerApplicationComponent.builder()
                    .applicationModule(applicationModule)
                    .build();
        }
    }

}
