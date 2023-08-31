
public class Demo2
{
    public static void main(String[] args)
    {
	IntegerStack s = new IntegerStack();

	s.push(1);
	s.push(2);

        System.out.println("---------- Start of push/pop sequence");
	s.push(5);
	s.pop();
	s.push(5);
	s.pop();
	s.push(5);
	s.pop();
    }

}
