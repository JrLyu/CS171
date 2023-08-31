import java.util.Arrays;

public class DemoGenArray<T> 
{

    private T[] genericArray;

    DemoGenArray(int size) 
    {
        genericArray = new T[size];// Generic Array Creation Error
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

