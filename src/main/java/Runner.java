public class Runner {

    public static void main(String[] args) {
        Planet myPlanet = new Planet("Mars", 908973);
//        System.out.println(myPlanet.getName() + " is " + myPlanet.getSize());

        String name = myPlanet.getName();
        int size = myPlanet.getSize();
        String sentence = String.format("%s is %d", name, size);

        System.out.println(sentence);
        myPlanet.explode();
    }

}
