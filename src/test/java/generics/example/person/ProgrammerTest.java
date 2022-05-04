package generics.example.person;

import static org.junit.jupiter.api.Assertions.*;

import generics.example.person.Programmer.ProgrammerBuilder;
import org.junit.jupiter.api.Test;

class ProgrammerTest {

    @Test
    void shouldInheritFluentBuilder() {
        ProgrammerBuilder programmerBuilder = new ProgrammerBuilder("John", "Smith", "Java");
        Programmer programmer = programmerBuilder.withId(100002).withAddress("New York")
            .withCompany("Google").withLevel("Senior").build();

        assertEquals(programmer.getCompany(),"Google");
        assertEquals(programmer.getLevel(),"Senior");
    }
}