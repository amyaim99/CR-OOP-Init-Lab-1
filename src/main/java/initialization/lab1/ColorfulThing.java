package initialization.lab1;

public class ColorfulThing {
    public enum Color {RED,YELLOW,BLUE}

    private Color color;
    private String colorString;

    public ColorfulThing(Color color){

       this.color = color;
    }
    public ColorfulThing(String colorString){

         this.colorString = colorString;
    }

    public Color getColor() {
        return color;
    }

    public String getColorString() {
        return colorString;
    }
//    @Override
//    public String toString(){
//        return getColorString();
//    }
}
