import java.util.*;


public class Main {
    public static void main(String[] args) {

        
        List<String> details = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("NAME: ");
        String d = input.nextLine();
        details.add(d);
        
        System.out.println("NICKNAME: ");
        String d1 = input.nextLine();
        details.add(d1);

        System.out.println("RESIDENCY: ");
        String d2 = input.nextLine();
        details.add(d2);

        System.out.println("HOBBIES: ");
        String d3 = input.nextLine();
        details.add(d3);

        System.out.println("FAVORITES: ");
        String d4 = input.nextLine();
        details.add(d4);

        Iterator<String> i=details.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }
    }
  
}
