package java_core_examples;

public class Main {

    public static void main(String[] args) {

        /*Elements elements = new Elements(1, 1.001F, "Hydrogen");

        Elements elements2 = new Elements();

        elements2.atomic_number = 2;
        elements2.atomic_mass = 4.006F;
        elements2.name = "Helium";


        System.out.println("First Element of periodic table -- " + elements);
        System.out.println("Second Element of periodic table -- " + elements2);

        System.out.println("Hashcode 1 -- " + elements.hashCode());
        System.out.println("Hashcode 2 -- " + elements2.hashCode());*/

        Metals metals = new Metals(3, 6.008F, "Alkali Metals", "Lithium");

        System.out.println("Alkali Metals " + metals);

        System.out.println(metals.electricalConductivity(args[0]));
        System.out.println(metals.magnetism());
        System.out.println(metals.meltingPoint(Double.parseDouble(args[1])));
        System.out.println(metals.boilingPoint(Integer.parseInt(args[2])));


    }
}
