package com.example.android.dagger.di

import javax.inject.Scope

/**
 * Good Practice: The scope annotation's name should not be explicit to
 * the purpose it fulfills. It should be named depending
 * on the lifetime it has since annotations can be reused
 * by sibling Components (e.g. LoginComponent, SettingsComponent, etc).
 * That's why instead of calling it @RegistrationScope,we call it @ActivityScope.
 */
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope

/**
 * Scoping rules:
 * When a type is marked with a scope annotation, it can only be used by Components that are annotated with the same scope.
 * When a Component is marked with a scope annotation, it can only provide types with that annotation or types that have no annotation.
 * A subcomponent cannot use a scope annotation used by one of its parent Components.
 * Components also involve subcomponents in this context.
 */