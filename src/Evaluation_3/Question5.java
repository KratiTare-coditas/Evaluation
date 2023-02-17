class Address{
    int plotno,houseno;
    String area;

    public Address(int plotno, int houseno, String area) {
        this.plotno = plotno;
        this.houseno = houseno;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotno=" + plotno +
                ", houseno=" + houseno +
                ", area='" + area + '\'' +
                '}';
    }
}
class Student{
    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                '}';
    }
}


class Teacher{
    int id;
    String name;
    Address address;

    public Teacher(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                '}';
    }
}





public class Question5 {
    public static void main(String[] args){
        Address address = new Address(143,2,"Betul");
        Teacher t = new Teacher(1,"Aarti",address);
        System.out.println(t);
        Student s = new Student(101,"Krati",address);
        System.out.println(s);
    }
}

















