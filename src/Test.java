public class Test {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.getName() + " " + s1.getClasses());
        Student s2 = new Student();
        s2.setName("Nam");
        s2.setClasses("D02");
        System.out.println(s2.getName() + " " + s2.getClasses());
    }
}
