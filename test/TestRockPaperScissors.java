package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestRockPaperScissors extends SwingTestCase {
    private PersonEditorPanel emptyPanel;
    private PersonEditorPanel tannerPanel;
    private Person tanner;

    protected void setUp(  ) throws Exception {
        // create a panel without a Person
        this.emptyPanel = new PersonEditorPanel(  );

        // create a panel with a Person
        this.tanner = new Person("Tanner", "Burke");
        this.tannerPanel = new PersonEditorPanel(  );
        this.tannerPanel.setPerson(this.tanner);
    }

    public void testTextFieldsAreInitiallyDisabled(  ) {
        assertTrue("First name field should be disabled",
                !this.emptyPanel.getFirstNameField().isEnabled(  ));
        assertTrue("Last name field should be disabled",
                !this.emptyPanel.getLastNameField().isEnabled(  ));
    }

    public void testEnabledStateAfterSettingPerson(  ) {
        assertTrue("First name field should be enabled",
                this.tannerPanel.getFirstNameField().isEnabled(  ));
        assertTrue("Last name field should be enabled",
                this.tannerPanel.getLastNameField().isEnabled(  ));
    }