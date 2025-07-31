package humanmodel;

public class Human {
    private String name;
    private int age;
    private String gender;
    private String nationality;
    private String address;
    private String phone;
    private String email;
    private String occupation;

    public Human(String name, int age, String gender, String nationality, String address, String phone, String email, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.occupation = occupation;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    // Behavior methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void talk() {
        System.out.println(name + " is talking.");
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + ".");
    }

    public void contactInfo() {
        System.out.println("Phone: " + phone + ", Email: " + email);
    }

    public void showAddress() {
        System.out.println("Address: " + address);
    }

    public void showAge() {
        System.out.println("Age: " + age);
    }

    public void showGender() {
        System.out.println("Gender: " + gender);
    }

    public void nationalityInfo() {
        System.out.println("Nationality: " + nationality);
    }

    public void occupationInfo() {
        System.out.println("Occupation: " + occupation);
    }
}
