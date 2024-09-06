package java_core_examples;

public class Metals implements PhysicalProperties{

    public int atomic_number;
    float atomic_mass;
    String metalType;
    String name;

    public Metals(int atomic_number, float atomic_mass, String metalType, String name){
        this.atomic_number = atomic_number;
        this.atomic_mass = atomic_mass;
        this.metalType = metalType;
        this.name = name;
    }


    @Override
    public boolean electricalConductivity(String s) {
        return s.equals("Yes");
    }

    @Override
    public Magnetism magnetism() {
        return Magnetism.DIAMAGNETIC;
    }

    @Override
    public double meltingPoint(double mp) {
        return mp;
    }

    @Override
    public int boilingPoint(int bp) {
        return bp;
    }

    @Override
    public String toString() {
        return "Metals {" +
                "atomic_number=" + atomic_number +
                ", atomic_mass=" + atomic_mass +
                ", metalType='" + metalType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
