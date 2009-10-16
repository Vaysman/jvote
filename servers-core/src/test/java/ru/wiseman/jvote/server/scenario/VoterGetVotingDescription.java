package ru.wiseman.jvote.server.scenario;

import ru.wiseman.jvote.server.scenario.steps.GetingVotingDescriptionSteps;
import ru.wiseman.utils.test.jbehave.MyScenario;

public class VoterGetVotingDescription extends MyScenario {
    public VoterGetVotingDescription(final ClassLoader classLoader) {
        super(classLoader, new GetingVotingDescriptionSteps());
    }
}