public class Department {
     int deptno;
     String deptName;

    public Department(int deptno , String deptName){
        this.deptno=deptno;
        this.deptName=deptName;


    }

    public String getDeptName() {
        return deptName;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptno=" + deptno +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
