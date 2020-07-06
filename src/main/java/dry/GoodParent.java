package dry;

import java.util.ArrayList;
import java.util.List;

public class GoodParent {
    public List<Person> findAllGoodMan(List<Person> persons) {
        var results = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.name.startsWith("T")
                    && person.age > 25
                    && person.hairColor == HairColor.BLACK
                    && person.skinColor == SkinColor.WHITE
            ) {
                if (person.sex == Gender.MALE) {
                    results.add(person);
                }
            }

        }

        return results;

    }

    public List<Person> findAllGoodGirl(List<Person> persons) {
        var results = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.name.startsWith("T") && person.age > 25 && person.hairColor == HairColor.BLACK && person.skinColor == SkinColor.WHITE) {
                if (person.sex == Gender.FEMALE) {
                    results.add(person);
                }
            }

        }

        return results;

    }
}

class Person {
    String name;
    int age;
    Gender sex;
    HairColor hairColor;
    SkinColor skinColor;


}

enum SkinColor {
    BLACK, BROWN, WHITE
}

enum HairColor {
    RED, BLACK, YELLOW
}

enum Gender {
    FEMALE,
    MALE,
    GAY,
    LES,
}
