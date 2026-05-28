package company;

public class Employee {
protected final String name;
private final String department;
private final String position;
private final int employeeld;

public Employee(String name,String department,String position,int employeeld) {
    this.name=name;
    this.department=department;
    this.position=position;
    this.employeeld=employeeld;
}

public void report(int times) {
    System.out.println(times+"回目の報告をします。役職:"+position+"、名前:"+name);
    
}
public void report() {
    report(1);
}
public void joinMeeting() {
    department.meeting();
    System.out.println("上記の会議に参加します。部署:"+department.getName()+"名前:"+name);
}
}
