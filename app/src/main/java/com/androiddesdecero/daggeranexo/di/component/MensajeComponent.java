package com.androiddesdecero.daggeranexo.di.component;

import com.androiddesdecero.daggeranexo.di.module.MensajeModule;
import com.androiddesdecero.daggeranexo.di.scope.MensajeScope;
import com.androiddesdecero.daggeranexo.ui.MainActivity;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 11/3/19.
 */

@MensajeScope
@Component(modules = MensajeModule.class)
public interface MensajeComponent {
    void inject(MainActivity mainActivity);
}
