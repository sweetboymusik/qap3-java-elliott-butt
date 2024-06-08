public class Demo {
    public static void main(String[] args) {
        Person elliott = new Person("Elliott Butt", 33, "M");
        Student stacey = new Student("Stacey Warford", 19, "F", "1991092BCA", 4.0);
        Teacher lloyd = new Teacher("Lloyd Nichols", 62, "M", "Math", 70000.00);
        CollegeStudent nichole = new CollegeStudent("Nichole Douglas", 25, "F", "198230985BEU", 3.5, "Computer Science",
                2014);

        System.out.println(elliott);
        System.out.println(stacey);
        System.out.println(lloyd);
        System.out.println(nichole);
    }
}
