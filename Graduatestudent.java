class Graduatestudent extends Student {

    private String specialization;

    // Constructor
    public Graduatestudent(int id, String name, int marks, String specialization) {
        super(id, name, marks);
        this.specialization = specialization;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + specialization);
    }
}