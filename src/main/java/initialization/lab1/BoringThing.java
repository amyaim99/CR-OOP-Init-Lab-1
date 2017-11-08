package initialization.lab1;

public class BoringThing {


        private String boringThing;

        public BoringThing(String thing){

             this.boringThing = thing;
        }

        public String getBoringThing() {
            return boringThing;
        }

        @Override
        public String toString(){
            return getBoringThing();
        }
}
