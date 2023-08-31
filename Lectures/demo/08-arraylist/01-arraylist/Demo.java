
import java.util.ArrayList;

public class Demo
{
    public static void main(String[] args)
    {
	ArrayList<String> a = new ArrayList<>();

	a.add("b");
	a.add("a");
	a.add("g");
	System.out.println(a);

	a.set(1, "e");
	System.out.println(a);

	System.out.println(a.set(5, "e"));  // Error
    }
}
