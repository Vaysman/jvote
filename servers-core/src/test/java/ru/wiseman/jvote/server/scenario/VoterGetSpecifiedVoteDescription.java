package ru.wiseman.jvote.server.scenario;

import ru.wiseman.jvote.server.scenario.steps.GettingVoteDescriptionSteps;
import ru.wiseman.utils.test.jbehave.MyScenario;

public class VoterGetSpecifiedVoteDescription extends MyScenario {
    public VoterGetSpecifiedVoteDescription(final ClassLoader classLoader) {
        super(classLoader, new GettingVoteDescriptionSteps());
    }
}