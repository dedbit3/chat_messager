package amazbay;

public class Person
{
    // TODO - add the other fields mentioned in the handout, and create
    // getters and setters for each.
    private int uid;
    private String firstName;
    private String lastName;

    public Person(int uid, String first, String last)
    {
        setUID(uid);
        setFirstName(first);
        setLastName(last);
    }
    
    //setters for first and last name
    public void setFirstName(String first){
        this.firstName = first;
    }
    
    public void setLastName(String last){
        this.lastName = last;
    }
    
    //getters for first and last name 
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    //getter for UID
    public int getUID(){
        return uid;
    }

    //setter for UID
    public void setUID(int uid)
    {
        this.uid = uid;
    }
    
    //full name method
    public String getFullName(){
        String full = firstName + lastName;
        return full;
    }

    //send message method
    public void sendMessageTo(Person receiver, String message, long when,
                              Website website)
    {
        Message m = new Message(this, receiver, message, when);
        website.addMessage(m);
    }
}
