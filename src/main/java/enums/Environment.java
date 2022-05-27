package enums;

public enum Environment {
    DEV("localhost/dev"),
    QA("localhost/qa"),
    PRD("locahost/prd");

    private String url;

    Environment(String url) {
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }

}
