class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobtitle;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Developer extends Employee {
    private double bonus;

    public void Project() {
        System.out.println(getJobtitle() + " is handling project");
    }

    public double CalculateBonus() {
        this.bonus = getSalary() * 0.15;
        return this.bonus;
    }
}

class Manager extends Employee {
    private double bonus;

    public void Project() {
        System.out.println(getJobtitle() + " is handling project");
    }

    public double CalculateBonus() {
        this.bonus = getSalary() * 0.20; // Managers might have a different bonus rate
        return this.bonus;
    }
}

class Programmer extends Employee {
    private double bonus;

    public void Project() {
        System.out.println(getJobtitle() + " is working on code");
    }

    public double CalculateBonus() {
        this.bonus = getSalary() * 0.10; // Programmers might have a different bonus rate
        return this.bonus;
    }

    public void set(String name) {
        setName(name);
    }
}

public class CWR_44 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Ravi");
        manager.setAddress("Varanasi, Uttar Pradesh");
        manager.setJobtitle("Manager");
        manager.setSalary(100000);
        System.out.println("Name:" + manager.getName());
        System.out.println("address:" + manager.getAddress());
        System.out.println("jobtitle:" + manager.getJobtitle());
        System.out.println("current bonus:" + manager.CalculateBonus());
        manager.Project();
        System.out.println();

        Developer developer = new Developer();
        developer.setName("Ritik");
        developer.setAddress("Varanasi, Uttar Pradesh");
        developer.setJobtitle("Developer");
        developer.setSalary(80000);
        System.out.println("Name:" + developer.getName());
        System.out.println("address: " + developer.getAddress());
        System.out.println("jobtitle: " + developer.getJobtitle());
        System.out.println("current bonus:" + developer.CalculateBonus());
        developer.Project();
        System.out.println();

        Developer anotherDeveloper = new Developer(); // Using a new instance here to avoid confusion
        anotherDeveloper.setName("Rohan"); // Re-setting properties for clarity
        anotherDeveloper.setAddress("Sasaram, Bihar");
        anotherDeveloper.setJobtitle("Developer");
        anotherDeveloper.setSalary(80000);
        System.out.println("Name:" + anotherDeveloper.getName());
        System.out.println("address:" + anotherDeveloper.getAddress());
        System.out.println("jobtitle:" + anotherDeveloper.getJobtitle());
        System.out.println("current bonus:" + anotherDeveloper.CalculateBonus());
        anotherDeveloper.Project();
        System.out.println();

        Programmer programmer = new Programmer();
        programmer.set("Sameer");
        programmer.setAddress("Raebareli, Uttar Pradesh");
        programmer.setJobtitle("Programmer");
        programmer.setSalary(70000);
        System.out.println("Name:" + programmer.getName());
        System.out.println("address:" + programmer.getAddress());
        System.out.println("jobtitle:" + programmer.getJobtitle());
        System.out.println("current bonus:" + programmer.CalculateBonus());
        programmer.Project();
    }
}