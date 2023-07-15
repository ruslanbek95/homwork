public class Main {
    public static void main(String[] args) {
        Danser danser = new Danser("Step by Step","world", "Magdonalds","они ходит по городу","Tic tak");
        danser.dans();
        System.out.println(danser);

        Programmer programmer = new Programmer("Bektur","coding","lapsha","ходит на работу ","Peacksout");
        programmer.coding();
        System.out.println(programmer);
        Singer singer = new Singer("Mirbek","Stydy", "sushi","они ходит по гору","Tic");
        singer.mus();
        System.out.println(singer);
        Person person = new Person("Meder","campus","Beshbarmak","woorld Klass");
        System.out.println(person);
    }
}