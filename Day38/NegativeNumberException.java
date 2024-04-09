class NegativeNumberException extends Exception
{
    NegativeNumberException(int n)
    {
        System.out.println("NegativeNumberException "+n);
    }
}