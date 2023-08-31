import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoGenArray3<T> 
{

    private T[] genericArray;

    DemoGenArray(Class<T> classType, int size) 
    {
       genericArray = (T[]) Array.newInstance(classType, size);
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
    public String toString() {
        return Arrays.toString(genericArray);
    }
}

