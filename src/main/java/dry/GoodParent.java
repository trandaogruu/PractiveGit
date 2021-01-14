package dry;

import java.util.ArrayList;
import java.util.List;

public class GoodParent {

    public List<Person> findAllByGender(List<Person> persons, Enum gender) {
        List results = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.name.startsWith("T")
                    && person.age > 25
                    && person.hairColor == HairColor.BLACK
                    && person.skinColor == SkinColor.WHITE
                    && person.sex == gender
            ) {
                results.add(person);

            }

        }

        return results;

    }

}


