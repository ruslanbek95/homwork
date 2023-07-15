public class Singer extends Person {
    private String bandName;

    public Singer(String name, String learn, String eat, String walk, String bandName) {
        super(name, learn, eat, walk);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + getName() + '\'' +
                ", Learn='" + getLearn() + '\'' +
                ", eat='" + getEat() + '\'' +
                ", walk='" + getWalk() + '\'' +
                "bandName='" + bandName + '\'' +
                '}';
    }
    public void mus(){
        System.out.println(bandName+ "  будет выступать ");
    }
}

