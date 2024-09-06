package java_core_examples;

public class Elements {

    public int atomic_number;
    public float atomic_mass;
    public String name;


    // Parameterized Constructor
    public Elements(int atomic_number, float atomic_mass, String name) {
        this.atomic_number = atomic_number;
        this.atomic_mass = atomic_mass;
        this.name = name;
    }

    // No Args Constructor
    public Elements(){
//        this.atomic_number = 2;
//        this.atomic_mass = 4.006F;
//        this.name = "Helium";
    }

    @Override
    public String toString() {
        return "Elements {" +
                "atomic_number=" + atomic_number +
                ", atomic_mass=" + atomic_mass +
                ", name='" + name + '\'' +
                '}';
    }




}


