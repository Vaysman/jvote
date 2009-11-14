package ru.wiseman.jvote.client;

import org.apache.log4j.Logger;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

import javax.swing.*;

public class VoteClient extends SingleFrameApplication {
    @Override
    protected void startup() {
        JLabel label = new JLabel("Started");
        show(label);
    }

    @Override
    protected void shutdown() {
        super.shutdown();
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("ru.wiseman.jvote.client");
        logger.info("Client started");
        Application.launch(VoteClient.class, args);
        logger.info("Client finished");
    }
}
