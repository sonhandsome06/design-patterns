package com.sonph.facade;

public class Coffee {

    public interface CoffeeMachineInterface {
        void chooseFirstSelection();
        void chooseSecondSelection();


    }



    public class OldCoffeeMachine {

    void selectA() {}

    void selectB() {}



    }







    public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {


        public void chooseFirstSelection() {
            OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
            oldCoffeeMachine.selectA();
        }

        public void chooseSecondSelection() {
            OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
            oldCoffeeMachine.selectB();
        }
    }

}
