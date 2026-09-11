public class Employee{
private int id;
 personal per;
Department dd;

    public Employee( int id  ,String name,String nump,int yearOfBirth,Department dd) {
        this.id=id;
        this.per=new personal(name,nump,yearOfBirth);//علاقة كومبوزيشن
        this.dd=dd;


    }

    public void setDd(Department dd) {
        this.dd = dd;
    }

    public void setPer(personal per) {
        this.per = per;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDd() {
        return dd;
    }

    public personal getPer() {
        return per;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", per=" + per +
                ", dd=" + dd +
                '}';
    }
}
