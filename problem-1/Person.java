class Person {
    // instance variables
    protected String myName;
    protected int myAge;
    protected String myGender;

    // constructors
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // getters and setters
    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    // methods
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
