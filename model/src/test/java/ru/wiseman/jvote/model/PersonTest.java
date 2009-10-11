package ru.wiseman.jvote.model;

import java.security.InvalidKeyException;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    final public String validKey = "";
    final public String invalidKey = "BAD";

    Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @Test
    public void shouldAcceptValidKey() throws InvalidKeyException {
        person.setPublicKey(validKey);
    }

    @Test(expected=InvalidKeyException.class)
    public void shouldRejectInvalidKey() throws InvalidKeyException {
        person.setPublicKey(invalidKey);
    }
}
