package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) {


            if(raise < 0){
                throw new IllegalArgumentException("Raise must be non-negative");
            }

            double s = e.getSalary();

           if(e.getName().equals(this.getName())){
                e.setSalary(raise + s);
            }else{
                e.setSalary(raise/2.0 + s);
            }




    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}
