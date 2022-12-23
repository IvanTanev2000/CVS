public class Person {
    private String date;
    private String fullName;
    private String eventContext;
    private String component;
    private String eventName;
    private String description;
    private String IP;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person ==> " +
                "date: " + date +
                ", fullName='" + fullName + '\'' +
                ", eventContext='" + eventContext + '\'' +
                ", component='" + component + '\'' +
                ", eventName='" + eventName + '\'' +
                ", description='" + description + '\'' +
                ", IP='" + IP + '\'';
    }

    public Person(String date, String fullName, String eventContext, String component, String eventName, String description, String IP) {
        this.date = date;
        this.fullName = fullName;
        this.eventContext = eventContext;
        this.component = component;
        this.eventName = eventName;
        this.description = description;
        this.IP = IP;
    }
}
