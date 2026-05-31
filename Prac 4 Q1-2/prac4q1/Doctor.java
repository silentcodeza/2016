/*
 * To run this on your system remove the PACKAGE LINE
 */


import java.util.Objects;


public class Doctor extends Person{
private String specialty;
private double fee;



    public Doctor(String name,String specialty, double fee) {
        this.name=name;
        this.specialty = specialty;
        this.fee = fee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctor other = (Doctor) obj;
        if (!Objects.equals(this.specialty, other.specialty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fee) != Double.doubleToLongBits(other.fee)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

 public void writeOutput(){
     System.out.println("Name: " + this.getName());
     System.out.println("Specialty: " + this.getSpecialty());
     System.out.println("Fee: " + this.getFee());
     System.out.println();
 }


}
