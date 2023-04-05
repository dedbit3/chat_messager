package amazbay;

public class Website
{
    private Person[] users;
    private Message[] messages = new Message[0];
    private Message[] mss = new Message[0];

    public Website()
    {
        users = new Person[0];
    }

    public void addPerson(Person p)
    {
        // We will need to create a new Person[] array that is 1 more in size
        // than what `users` used to be, and copy the contents of `users`
        // into it.
        Person newArray[] = new Person[users.length+1];
        for(int i = 0; i < users.length; i+=1)
        {
            newArray[i] = users[i];
        }

        // TODO - add p to newUsers, and update `users`
        newArray[users.length] = p;
        users = newArray;
    }

    public Person getPersonByUID(int uid)
    {
        // TODO - loop through `users`, and return the first person whose uid
        // matches.  Otherwise, return null as below.
        for(int i = 0; i < users.length; i+=1){
            if(users[i].getUID() == uid){
                return users[i];
            }
        }

        return null;
    }

    void addMessage(Message m)
    {
        // TODO - decide how to store m, so that you can later retrieve the
        // right ones in getMessagesFor().
        Message[] mess = new Message[messages.length + 1];
     
        for(int i = 0; i < messages.length; i++){
            mess[i] = messages[i];
        }
        
        //creating array for Message objects
        Message[] lss = new Message[this.mss.length + 1];
        
        for(int i = 0; i < mss.length; i++){
            lss[i] = this.mss[i];
        }
        
        //adding message objects to the array
        lss[mss.length] = m;
        mss = lss;
       
        mess[messages.length] = m;
        messages = mess;
        
    }

    
    public Message[] getMessagesFor(int uid)
    {
        // TODO - return all messages added on the Website where either
        // the sender or the receiver was the person with uid `uid`, in
        // the order they were sent.\
     
    //created new array selected
    Message[] selected = new Message[0];

    //loops through all the messages
    for(int i = 0;  i < messages.length; i++){ 
        
        if(mss[i].getReceiver().getUID() == uid || mss[i].getSender().getUID() == uid){
            
            Message obj = messages[i];
            
            Message[] temp = new Message[selected.length + 1];
            for(int z = 0; z < selected.length; z++){
                temp[z] = selected[z]; 
            }
            temp[temp.length - 1] = obj;
            selected = temp;
        }
    }

    return selected;

    }

}
