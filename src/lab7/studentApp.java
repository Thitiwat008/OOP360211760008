package lab7;

public class studentApp {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        s1.toString();
        System.out.println(s1.toString());
        Student s2 = new Student("Safe",90,"Femaie","130");
        System.out.println(s2.toString());
    }
}
