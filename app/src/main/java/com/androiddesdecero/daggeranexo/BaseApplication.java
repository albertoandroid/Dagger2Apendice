package com.androiddesdecero.daggeranexo;

import android.app.Application;

import com.androiddesdecero.daggeranexo.di.component.MensajeComponent;
import com.androiddesdecero.daggeranexo.di.module.MensajeModule;

/**
 * Created by albertopalomarrobledo on 11/3/19.
 */

public class BaseApplication extends Application {

    private MensajeComponent mensajeComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public MensajeComponent getMensajeComponent(){
        if(mensajeComponent == null){
            setUpGraphMensajeComponent();
        }
        return mensajeComponent;
    }

    public void clearMensajeComponent(){
        mensajeComponent=null;
    }

    private void setUpGraphMensajeComponent(){
        mensajeComponent = DaggerMensajeComponent
                .builder()
                .mensajeModule(new MensajeModule())
                .build();
    }
}
