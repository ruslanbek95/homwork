public class Programmer extends Person {
    private String campanyName;

    public Programmer(String name, String learn, String eat, String walk, String campanyName) {
        super(name, learn, eat, walk);
        this.campanyName = campanyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", Learn='" + getLearn() + '\'' +
                ", eat='" + getEat()+ '\'' +
                ", walk='" + getWalk() + '\'' +
                "campanyName='" + campanyName + '\'' +
                '}';
    }
    public void coding(){
        System.out.println(campanyName+"кодировать");

    }
}
