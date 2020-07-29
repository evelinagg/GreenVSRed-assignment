package com.game;

import com.game.services.base.PlayService;
import com.game.services.impl.PlayServiceImpl;
import com.game.services.impl.ServiceWrapper;

public class Main {
    private static ServiceWrapper serviceWrapper;

    public static void main(String[] args) {
        final InitialState initialState = new InitialState();
        initialState.init();
        initialState.showInputs();

        initServices();
        int count = serviceWrapper.getPlayService().surroundElements(initialState.getGrid(),
                initialState.getOffsetX(), initialState.getOffsetY(), initialState.getMaxRounds());
        System.out.println("Result " + count);
    }

    private static void initServices() {
        PlayService playService = new PlayServiceImpl();

        serviceWrapper = ServiceWrapper.getInstance();
        serviceWrapper.setServices(playService);
    }


}
