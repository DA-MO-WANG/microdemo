/**
 * java bean如何看待这个类，只分两种：可写、可读
 * 它只有
 */
public class Person {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
