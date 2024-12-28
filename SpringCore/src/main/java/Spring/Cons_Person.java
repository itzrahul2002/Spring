package Spring;

public class Cons_Person {
    private int id;
    private String name;
    private String Language;
    private Cons_Certificate Certificate;

    public Cons_Person() {
        super();
    }

    public Cons_Person(int id, String name, String language, Cons_Certificate certificate) {
        this.id = id;
        this.name = name;
        Language = language;
        Certificate = certificate;
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

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public Cons_Certificate getCertificate() {
        return Certificate;
    }

    public void setCertificate(Cons_Certificate certificate) {
        Certificate = certificate;
    }

    @Override
    public String toString() {
        return "Cons_Person [id=" + id + ", name=" + name + ", Language=" + Language + ", Certificate=" + Certificate
                + "]";
    }

   

    
    
}
