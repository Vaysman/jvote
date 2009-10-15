package ru.wiseman.jvote.server.scenario;

import org.jbehave.scenario.MostUsefulConfiguration;
import org.jbehave.scenario.PropertyBasedConfiguration;
import org.jbehave.scenario.Scenario;
import org.jbehave.scenario.parser.ClasspathScenarioDefiner;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.ScenarioDefiner;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;
import ru.wiseman.jvote.server.scenario.steps.GetingVotingDescriptionSteps;

public class VoterGetVotingDescription extends Scenario
{

    public VoterGetVotingDescription() {
        this(Thread.currentThread().getContextClassLoader());
    }
    
    public VoterGetVotingDescription(final ClassLoader classLoader) {
        super(new MostUsefulConfiguration() {
            public ScenarioDefiner forDefiningScenarios() {
                return new ClasspathScenarioDefiner(new UnderscoredCamelCaseResolver(".scenario"),
                               new PatternScenarioParser(new PropertyBasedConfiguration()), classLoader);
            }
        }, new GetingVotingDescriptionSteps());
    }
}