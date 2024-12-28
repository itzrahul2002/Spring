package Spring;

public class LifeUser {
    private int id;
    private String name;
    private String course;

    
    public LifeUser(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCourse() {
        return course;
    }


    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "LifeUser [id=" + id + ", name=" + name + ", course=" + course + "]";
    }

    public void hi(){
        System.out.println("Hi I am Life Cylcle Init");
    }
    
    public void bye(){
        System.out.println("Bye I am Destroyer From Life Cycle ");
    }
}
