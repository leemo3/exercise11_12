    import java.util.ArrayList;
    import java.util.ListIterator;
    import java.util.Scanner;
public class Class_11_12 {

  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<>();

    Scanner in = new Scanner(System.in);
    System.out.print("Enter 11 numbers: ");
    for (int i = 0; i < 11; i++) {
        list.add(in.nextDouble());
    }
    System.out.println("Sum = " + sum(list));

    in.close();
}

public static double sum(ArrayList<Double> list) {
    double sum = 0;
    ListIterator<Double> iterator = list.listIterator();
    while (iterator.hasNext()) {
        sum += iterator.next();
    }
    return sum;
    }


}


  


    

            