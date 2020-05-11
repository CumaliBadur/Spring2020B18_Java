package day37_Constructors;

public class Employee {

    String name;
    long id;
    long ssn;
    String jontitle;
    double salary;
    char gender;

    public void setInfo(String name,long id, long ssn, String jontitle, double salary,char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jontitle=jontitle;
        this.salary=salary;
        this.gender=gender;



    }
    public String toString(){

        return "Name: "+name+" ID: "+id+" SSN: "+ssn+" Jon Title:"+
                jontitle+" Salary: "+salary+" Gender: "+gender;
    }
}
