package com.androiddesdecero.daggeranexo.di.module;

import com.androiddesdecero.daggeranexo.Mensaje;
import com.androiddesdecero.daggeranexo.di.scope.MensajeScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 11/3/19.
 */

@Module
public class MensajeModule {
    @MensajeScope
    @Provides
    public Mensaje getMensaje(){
        return new Mensaje("Aplicación Tiempo", "La aplicación numero uno para saber el tiempo en tu ciudad");
    }
}
