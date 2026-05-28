package company;

public class Employee {
String name;
String department;
String position;
int employeeld;

public Employee(String name,String department,String position,int employeeld) {
    this.name=name;
    this.department=department;
    this.position=position;
    this.employeeld=employeeld;
}

public void report(int times) {
    System.out.println(times+"回目の報告をします。役職:"+position+"、名前:"+name);
    
}
public boid report() {
    report(1);
}
}
