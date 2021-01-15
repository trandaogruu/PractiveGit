package dry;

public class Person {

        String name;
        int age;
        Gender sex;
        HairColor hairColor;
        SkinColor skinColor;

        public Person(String name, int age, Gender sex, HairColor hairColor, SkinColor skinColor) {
                this.name = name;
                this.age = age;
                this.sex = sex;
                this.hairColor = hairColor;
                this.skinColor = skinColor;
        }
}
