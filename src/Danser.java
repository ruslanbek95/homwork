public class Danser extends Person{
    private String goroupName;

    public Danser(String name, String learn, String eat, String walk, String goroupName) {
        super(name, learn, eat, walk);
        this.goroupName = goroupName;
    }

    @Override
    public String toString() {
        return "Danser{" +
                "name='" + getName() + '\'' +
                ", Learn='" + getLearn() + '\'' +
                ", eat='" + getEat()+ '\'' +
                ", walk='" + getWalk() + '\'' +
                "goroupName='" + goroupName + '\'' +
                '}';
    }
    public void dans(){
        System.out.println(goroupName+" тансует вальс");
    }
}
