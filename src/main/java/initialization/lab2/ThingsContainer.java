package initialization.lab2;

import initialization.lab1.ColorfulThing;

public class ThingsContainer {

    private ColorfulThing[] colorfulThings;

    public ThingsContainer(int size) {
         ColorfulThing[] colorfulThings = new ColorfulThing[size];

    }

    public  void addColorfulThings(ColorfulThing colorfulThing) {

        for (int i = 0; i < this.colorfulThings.length; i++)

            colorfulThings[i] = colorfulThing;


        System.out.println("Array is full");
    }

    public void printColorfulThings(ThingsContainer thingsContainer) {

        for (int i = 0; i < colorfulThings.length; i++)

            System.out.println(colorfulThings[i]);

    }


}
