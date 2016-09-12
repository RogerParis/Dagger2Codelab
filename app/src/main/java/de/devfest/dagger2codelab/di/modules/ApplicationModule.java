package de.devfest.dagger2codelab.di.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import de.devfest.dagger2codelab.R;
import de.devfest.dagger2codelab.data.api.GitHubApi;
import de.devfest.dagger2codelab.di.scopes.ApplicationScope;
import retrofit.RestAdapter;

/**
 * Created by RogerParis on 09/09/16.
 */
@Module
public class ApplicationModule {

    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @ApplicationScope
    @Provides
    Context providesApplicationContext(){
        return context;
    }

    @ApplicationScope
    @Provides
    GitHubApi providesGitHubApi(){
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(context.getString(R.string.endpoint))
                .build();
        return restAdapter.create(GitHubApi.class);
    }
}
