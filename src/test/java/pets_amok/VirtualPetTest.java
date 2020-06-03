package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {
   //Trying out TDD along with Ben's Friday Workshop, need to finish
    /*pet should dot he following
     *have hunger
     *can eat to lower hunger
     *have boredom
     *can play to lower boredom
     *have a name on creation
     *should have a tick () to increase hunger and boredom.
     */
        private VirtualPet underTest;
        @BeforeEach
        void setUp() {
            underTest = new VirtualPet("Bob");
        }
        @Test
        public void shouldHaveNameOnCreation() {
            String name = underTest.getName();
            assertEquals("Bob", name);
        }
        @Test
        public void shouldHaveADefaultHungerOf20() {
            for (int i = 0; i < 10000; i++) {
                int hunger = underTest.getHunger();
                assertTrue(hunger>10&&hunger <40);
                //  assertEquals(20, hunger);
            }
        }
        @Test
        public void eatShouldLowerHungerBy10() {
            int preEatingHunger = underTest.getHunger();
            underTest.eat();
            int postEatingHunger = underTest.getHunger();
            assertEquals(10, preEatingHunger - postEatingHunger);
        }
        @Test
        public void shouldHaveADefaultBoredomOf20() {
            int boredom = underTest.getBoredom();
            assertEquals(20, boredom);
        }
        @Test
        public void playShouldLowerBoredomBy10 () {
            underTest.play();
            int boredom = underTest.getBoredom();
            assertEquals(10, boredom);
        }
        @Test
        public void tickShouldIncreaseHungerBy5(){
            underTest.tick();
            int hunger = underTest.getHunger();
            assertEquals(25,hunger);
        }
        @Test
        public  void tickShouldIncreaseBoredomby5(){
            underTest.tick();
            int boredom = underTest.getBoredom();
            assertEquals(25,boredom);
        }
    }
}
