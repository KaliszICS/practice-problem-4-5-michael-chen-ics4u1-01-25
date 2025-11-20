public class Cow {
    /**
     * Class to describe a cow
     * @author Michael Chen
     * @version 1.0.0
     */
    private String name;
    private int age;
    private double weight;

    /**
     * Constructor for a cow
     * @param name Name of the cow
     * @param age Age of the cow
     * @param weight Weight of the cow
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Gets name of the cow
     * @return name of the cow
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the cow
     * @return age of the cow
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the weight of the cow
     * @return weight of the cow
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Overrides the toString method, returning the name, age, and weight in the format "name, age - weight"
     * @return cow as a string
     */
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.weight;
    }

    /**
     * Overrides the equals method, comparing instance variables of the Cow class
     * @return true if instance variables are the same, false if Object is not of type Cow or instance variables are not equal
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cow)) {
            return false;
        }
        Cow cow = (Cow) obj;
        return cow.getName().equals(this.name) && cow.getAge() == this.age && cow.getWeight() == this.weight;
    }
}
