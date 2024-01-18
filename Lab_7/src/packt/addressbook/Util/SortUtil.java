package packt.addressbook.Util;
import packt.addressbook.Model.Contact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUtil  {

    public static void sortContacts(ArrayList<Contact> contactsList){
        contactsList.sort((contact1, contact2) -> contact1.id.compareTo(contact2.id));
    }




}