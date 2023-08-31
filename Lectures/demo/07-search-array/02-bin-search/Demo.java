public class Demo
{
    public static void main(String[] args)
    {
        int[] myList = {1, 5, 9, 17, 19, 78, 99, 143, 450, 876, 999};
        
        System.out.println( binarySearch(myList,  5) ); //  1
        System.out.println( binarySearch(myList, -4) ); // -1
        System.out.println( binarySearch(myList, 99) ); //  6
    }

    public static int binarySearch(int[] list, int key) 
    {
        int low  = 0;
	int high = list.length - 1;

	while ( low <= high ) 
	{
	    int mid = (low + high) / 2;

	    if (list[mid] == key)
	        return mid;
	    else if (list[mid] > key)
	        high = mid - 1;
	    else
	        low = mid + 1;
        }

        return -1; // Not found
    } 
}
