package chaptertwo.encapsulation;

class Person {
    private String name;
    private int age;
    private String email; // new field

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String email) {
        this(name, age);   // constructor with new field
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;   //new field getter
    }

    public void setEmail(String email) {
        this.email = email;  //new field setter
    }
}
