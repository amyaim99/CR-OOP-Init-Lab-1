package initialization.lab2;


import initialization.lab1.ColorfulThing;

public class InitializationLab2 {
    public static void main(String[] args) {
        ColorfulThing colorfulThing = new ColorfulThing("blue");
        ColorfulThing colorfulThing1 = new ColorfulThing("green");
        ColorfulThing colorfulThing2 = new ColorfulThing("lighBlue");
        ColorfulThing colorfulThing3 = new ColorfulThing("white");
        ColorfulThing colorfulThing4 = new ColorfulThing("black");
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing6 = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing colorfulThing7 = new ColorfulThing(ColorfulThing.Color.RED);

        ThingsContainer thingsContainer = new ThingsContainer(5);
        ThingsContainer thingsContainer2 = new ThingsContainer(7);
        ThingsContainer thingsContainer4 = new ThingsContainer(9);

        thingsContainer.addColorfulThings(colorfulThing);
        thingsContainer.addColorfulThings(colorfulThing1);
        thingsContainer.addColorfulThings(colorfulThing2);
        thingsContainer.addColorfulThings(colorfulThing3);

        thingsContainer.printColorfulThings(thingsContainer);
        //thingsContainer.addColorfulThings(colorfulThing4);
        //thingsContainer.addColorfulThings(colorfulThing5);
        //thingsContainer.addColorfulThings(colorfulThing6);

        //thingsContainer.printColorfulThings(colorfulThing4);




    }

}
