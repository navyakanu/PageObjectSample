package entities;

/**
 * Created by navyab on 2/1/16.
 */
public class ClientDetails {

    private String client_name;
    private String event_name;
    private String event_date;
    private String client_email;

    public ClientDetails(String client_name, String event_name, String event_date,String email ) {


        this.client_name=client_name;
        this.event_name=event_name;
        this.event_date=event_date;
        this.client_email=email;

    }

    public String getClientName() {
        return client_name;
    }

    public String getEvent_name() {
        return event_name;
    }

    public String getEvent_date() { return event_date; }

    public String getClient_Email() { return client_email; }
}



