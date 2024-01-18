package packt.addressbook.Util;

import packt.addressbook.Model.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ContactUtil {
    private ArrayList<Contact> contactsList ;

    public ContactUtil(){
        contactsList = new ArrayList();
    }
    public void addContacts(Contact... contacts){
        contactsList.addAll(Arrays.asList(contacts));
    }

    public ArrayList<Contact> getContactsSet(){
        return contactsList ;
    }
    public void displayContacts()
    {
        contactsList.forEach(contact -> System.out.println("Id: "+contact.id+" ,Name: "+contact.firstName+
                " "+contact.lastName+ " ,workPhone: "+contact.workPhone+" ,homePhone: "+contact.homePhone+" ,Email: "+contact.email));
    }


}
