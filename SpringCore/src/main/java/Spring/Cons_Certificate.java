package Spring;

public class Cons_Certificate {
    private String certificateName;

    public Cons_Certificate(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    @Override
    public String toString() {
        return "Cons_Certificate [certificateName=" + certificateName + "]";
    }

    
}
