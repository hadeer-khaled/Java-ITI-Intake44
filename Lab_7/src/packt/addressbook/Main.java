package packt.addressbook;
import packt.addressbook.Model.Contact;
import packt.addressbook.Util.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("7", "Hadeer", "Khaled", "01122334455", "01122334455", "hadeerkhaled@gmail.com");
        Contact c2 = new Contact("2", "Rahma", "Khaled", "01122334455", "01122334455", "rahmakhaled@gmail.com");
        Contact c3 = new Contact("9", "Omar", "Khaled", "01122334455", "01122334455", "omarkhaled@gmail.com");

        Contact c4 = new Contact("3", "Hala", "Khaled", "01122334455", "01122334455", "halakhaled@gmail.com");

        ContactUtil contactList = new ContactUtil();

        contactList.addContacts(c1,c2,c3,c4);
        System.out.println("Before Sorting");
        contactList.displayContacts();

        System.out.println("After Sorting");

        SortUtil.sortContacts(contactList.getContactsSet());
        contactList.displayContacts();

    }
}