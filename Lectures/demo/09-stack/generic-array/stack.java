
import java.util.ArrayList;

public class stack<T>
{
    ArrayList<T> item;
    int top;

    public stack()
    {
        item = new ArrayList<T>();
	top = 0;
    }

    public void push(T x)
    {
	item.add(x);
	top++;
    }

    public T pop()
    {
	T r = item.get(--top);
	item.remove(top);
	return r;
    }

}
