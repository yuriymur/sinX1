/**
 * Created by student on 29.04.2015.
 */
public class AddresBook {
    Address[] list = new Address[100];
    int count = 0;
    void add (Address newAddress)
    {
       list [count] = newAddress;
        count++;

    }
    void printAll(){
        for (int i = 0;i<count;i++){
            System.out.println(list [i]);

        }
            ;

    }
}
