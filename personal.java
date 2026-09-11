public class personal {

    String name;
   String nump;
   int yearOfBirth;

   public personal(String name,String nump,int yearOfBirth){
this.name=name;
this.nump=nump;
this.yearOfBirth=yearOfBirth;

   }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setNump(String nump) {
        this.nump = nump;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getNump() {
        return nump;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "personal{" +
                "name='" + name + '\'' +
                ", nump='" + nump + '\'' +
                ", yearOf_Birth=" + yearOfBirth +
                '}';
    }







}
