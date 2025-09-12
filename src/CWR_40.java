public class CWR_40 {
    private String name;
    private int age;
    private String country;
    public CWR_40(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public static void main(String[] args) {
        CWR_40 person1 = new CWR_40("Ravi", 20, "India");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Country: " + person1.getCountry());

        person1.setName("Bhanu");
        person1.setAge(20);
        person1.setCountry("India");

        System.out.println("\nName: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Country: " + person1.getCountry());
    }
}