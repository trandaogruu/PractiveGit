package dry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GoodParent {

    public List<Person> findAllByGender(List<Person> persons, Enum gender) {

        return persons.stream().filter(temp -> temp.name.startsWith("T"))
                .filter(temp -> temp.age > 25 && temp.hairColor == HairColor.BLACK
                        && temp.skinColor == SkinColor.WHITE
                        && temp.sex == gender).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Person person1 = new Person("TP01",18,Gender.FEMALE,HairColor.YELLOW,SkinColor.WHITE);
        Person person2 = new Person("TP02",28,Gender.GAY,HairColor.BLACK,SkinColor.BROWN);
        Person person3 = new Person("TP03",38,Gender.MALE,HairColor.RED,SkinColor.WHITE);
        Person person4 = new Person("TP04",48,Gender.LES,HairColor.BLACK,SkinColor.WHITE);
        Person person5 = new Person("TP05",58,Gender.FEMALE,HairColor.BLACK,SkinColor.WHITE);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);


        GoodParent goodParent = new GoodParent();

        List<Person> demo =goodParent.findAllByGender(people,Gender.FEMALE);

        System.out.println(demo.get(0).name + "  ACB");

    }
}


