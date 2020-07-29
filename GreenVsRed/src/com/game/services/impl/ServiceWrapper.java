package com.game.services.impl;

import com.game.services.base.PlayService;


public class ServiceWrapper {
    private static ServiceWrapper instance = null;
    private PlayService playService;

    public ServiceWrapper() {
    }

    public static ServiceWrapper getInstance() {
        if(instance == null) {
            instance = new ServiceWrapper();
        }
        return instance;
    }

    public void setServices(PlayService playService) {
        this.playService = playService;
    }

    public PlayService getPlayService() {
        return playService;
    }


}
