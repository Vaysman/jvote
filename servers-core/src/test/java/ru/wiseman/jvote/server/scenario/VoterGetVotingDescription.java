package ru.wiseman.jvote.server.scenario;

import org.jbehave.scenario.steps.CandidateSteps;
import ru.wiseman.jvote.server.scenario.steps.GetingVotingDescriptionSteps;
import ru.wiseman.utils.test.jbehave.MyScenario;

public class VoterGetVotingDescription extends MyScenario {
    public VoterGetVotingDescription(final ClassLoader classLoader) {
        super(classLoader, (CandidateSteps) new GetingVotingDescriptionSteps());
    }
}