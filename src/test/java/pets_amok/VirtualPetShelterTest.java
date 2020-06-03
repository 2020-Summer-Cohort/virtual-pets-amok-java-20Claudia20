package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    //Trying out TDD along with Ben's Friday Workshop, need to finish
     /*  adopt a pet
        admit a pet
        feed all pets
        play with a pet
        return a collection of pets
     */

        private VirtualPet testPet;
        private VirtualPetShelter underTest;
        @BeforeEach
        void setUp() {
            testPet = new VirtualPet("TESTY");
            underTest = new VirtualPetShelter();
            underTest.admit(testPet);
        }
        @Test
        public void shouldBeAbleToAddPetToShelter() {
            //assertion
            Collection<VirtualPet> pets = underTest.retrieveAllPets();
            assertThat(pets).containsOnlyOnce(testPet);
        }
        @Test
        public void shouldBeAbleToFeedAllPetsInShelter() {
            //action
            underTest.feedAllPets(testPet);
            //assertion
            assertEquals(10, testPet.getHunger());
        }
        @Test
        public void shouldPlayWithASinglePetGivenName() {
            underTest.playWith("TESTY");
            assertEquals(10, testPet.getBoredom());
        }
        @Test
        public void shouldBeAbleToRemoveAPetFromShelterThroughAdoption() {
            underTest.adoptOut("TESTY");
            assertThat(underTest.retrieveAllPets()).isEmpty();
        }
        @Test
        public void shouldBeAbleToTickAllPetsInShelter() {
            underTest.tickAllPets(testPet);
            assertEquals(5, testPet.getTick());
        }
    }
}
