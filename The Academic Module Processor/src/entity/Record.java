package entity;

public class Record {
    private long id;
    private String name;
    private int creditValue;
    private String grade;
    public Record(long id, String name, int creditValue, String grade) {
        this.setGrade(grade);
        this.setId(id);
        this.setName(name);
        this.setCreditValue(creditValue);
    }

    public long getId() {
        return id;
    }

    public int getCreditValue() {
        return creditValue;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString(){
        return "ID : "+getId()+"\nName : "+getName()+"\nCredit value: "+getCreditValue()+"\nGrade : "+getGrade();
    }
}
