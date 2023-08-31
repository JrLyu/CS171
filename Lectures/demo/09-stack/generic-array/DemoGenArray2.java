
import java.util.Arrays;

public class DemoGenArray2<T> 
{
    private Object[] genericArray;

    public DemoGenArray2(int size) 
    {
        genericArray = new Object[size];
    }


    public T get(int index) 
    {
        return (T) genericArray[index];
    }

    public void set(int index, T item) 
    {
        genericArray[index] = item;
    }

    @Override
    public String toString() 
    {
        return Arrays.toString(genericArray);
    }
}

