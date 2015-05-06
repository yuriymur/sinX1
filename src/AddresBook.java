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
}
    int[] find(String namefind){
        int resultCount = 0;

        for (int i = 0; i<count;i++) {
            if (list[i].getName().startsWith(namefind)) {
                resultCount++;
            }
        }
        int []result = new int[resultCount];
        int found = 0;
        for (int i = 0; i<count;i++) {
            if (list[i].getName().startsWith(namefind)) {
                //resultCount++;
                result[found] = i;
                found++;
            }
        }
        return result;
    }
    void delete(int index){
        for (int i = index+1; i < count; i++){
            list[i-1] = list[i];
            list[count-1] = null;
            count--;



    }

    }

}
