public class Test<T>
{
    T obj;                                                         // An object of type T is declared

    Test(T obj) { this.obj = obj; }                                     // constructor
    public T getObject()
    {
        return this.obj;
    }
}

