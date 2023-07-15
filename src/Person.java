public class Person {
    private String name;
    private String Learn;
    private String eat;
    private String walk;

    public Person(String name, String learn, String eat, String walk) {
        this.name = name;
        Learn = learn;
        this.eat = eat;
        this.walk = walk;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLearn() {
        return Learn;
    }

    public void setLearn(String learn) {
        Learn = learn;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Learn='" + Learn + '\'' +
                ", eat='" + eat + '\'' +
                ", walk='" + walk + '\'' +
                '}';
    }
}
