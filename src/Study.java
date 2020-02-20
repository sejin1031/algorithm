import java.util.Arrays;
import java.util.List;

public class Study {
    public static void main(String... args){
        List<Human> list = Arrays.asList(
                new Human("강동원",15,Human.MALE),
                new Human("박지원",23,Human.FEMALE),
                new Human("노지선",23,Human.FEMALE),
                new Human("송강호",50,Human.MALE)
        );

        double male_5year_later = list.stream()
                .filter(x->x.getSex() == Human.MALE)
                .peek(x->x.setAge(x.getAge() + 5))
                .mapToInt(Human :: getAge)
                .average()
                .getAsDouble();

        System.out.println(male_5year_later);
    }
}
class Human{
    public static int MALE = 0;
    public static int FEMALE = 1;
    String name;
    int age;
    int sex;
    public Human(String name, int age, int sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public int getSex(){return sex;}
    public int getAge(){return age;}
    public String getName(){return name;}
    public void setAge(int age){this.age = age;}
}