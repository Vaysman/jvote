package ru.wiseman.jvote.server.scenario;

import org.jbehave.scenario.Scenario;
import ru.wiseman.jvote.server.scenario.steps.GetingVotingDescriptionSteps;

public class VoterGetVotingDescription extends Scenario
{

    public VoterGetVotingDescription() {
        this(Thread.currentThread().getContextClassLoader());
    }
    
    public VoterGetVotingDescription(final ClassLoader classLoader) {
        super(new GetingVotingDescriptionSteps());
    }
}