class CustomDataStructure implements Iterable<> 
{
    // code for data structure



    public Iterator<> iterator() 
    {
        return new CustomIterator<>(this);
//                                  ^^^^ Pass object to constructor
    }
}

