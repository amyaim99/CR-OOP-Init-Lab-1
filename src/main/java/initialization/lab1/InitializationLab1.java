package initialization.lab1;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class InitializationLab1 {
    public static void main(String[] args) {


        BoringThing boringThing = new BoringThing("sleeping");
        BoringThing boringThing1 = new BoringThing("peeing");
        BoringThing boringThing2 = new BoringThing("pooping");
        BoringThing boringThing3 = new BoringThing("slandering");
        BoringThing boringThing4 = new BoringThing("sedentaryLife");


        ColorfulThing colorfulThing = new ColorfulThing("blue");
        ColorfulThing colorfulThing1 = new ColorfulThing("green");
        ColorfulThing colorfulThing2 = new ColorfulThing("lighBlue");
        ColorfulThing colorfulThing3 = new ColorfulThing("white");
        ColorfulThing colorfulThing4 = new ColorfulThing("black");
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing6 = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing colorfulThing7 = new ColorfulThing(ColorfulThing.Color.RED);

        System.out.println(colorfulThing.getColor());
        System.out.println(colorfulThing1.getColor());
        System.out.println(colorfulThing3.getColor());
        System.out.println(colorfulThing5.getColor());
        System.out.println(colorfulThing6.getColor());
        System.out.println(colorfulThing7.getColor());

    }
}
