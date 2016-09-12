package de.devfest.dagger2codelab.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by RogerParis on 09/09/16.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationScope {
}
