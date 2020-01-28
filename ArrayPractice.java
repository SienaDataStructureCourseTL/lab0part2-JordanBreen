/*
 * CSIS-210 Lab 0
 * 
 * Complete each of the following methods according to the method comments.
 * DO NOT CHANGE THE METHOD HEADERS.
 *
 * @author Jordan Breen
 * @version 01/27/2020
 */
public class ArrayPractice
{
    /**
     * Return the sum of the elements in the array.
     * 
     * @param arr[] The input array of Double objects.
     * @return The sum of the elements in the array.
     */
    public static double sum(Double arr[])
    {
        double sumDouble = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sumDouble += arr[i];
        }
        return sumDouble;
    }

    /**
     * Return the sum of the elements in the array.
     * 
     * @param arr[] The input array of Integer objects.
     * @return The sum of the elements in the array.
     */
    public static int sum(Integer arr[])
    {
        int sumInt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sumInt += arr[i];
        }
        return sumInt;
    }
    
    /**
     * Return the largest value in the array.
     * 
     * @param arr[] The input array of Integer objects.
     * @return The largest value in the array.
     */
    public static int largest(Integer arr[])
    {
        int largestInt = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largestInt)
            {
                largestInt = arr[i];
            }
        }
        return largestInt;
    }
    
    /**
     * Return the number of elements in the input array that are
     * strictly larger than the input value.
     * 
     * @param arr[] The input array of Integer objects.
     * @param value The value to which the elements will be compared.
     * @return The number of elements in the input array that are
     *         strictly larger than the input value.
     */
    public static int countLarger(Integer arr[], int value)
    {
        int largerThanInputCt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] > value)
            {
                largerThanInputCt++;
            }
        }
        return largerThanInputCt;
    }
    
    /**
     * Return the number of elements in the array that have
     * a value of TRUE.
     * 
     * @param arr[] The input array of Boolean values.
     * @return The number of elements in the array that have
     *         a value of TRUE.
     */
    public static int countTrue(Boolean arr[])
    {
        int trueCt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == true)
            {
                trueCt++;
            }
        }
        return trueCt;
    }
    
    /**
     * Return an array of values that represent the lengths of
     * the string values in the input array.  For example, if
     * the input array is {"I", "love", "CS"}, then the returned
     * array would be {1, 4, 2}.
     * 
     * @param arr[] The input array of String objects.
     * @return The array representing the lengths of the Strings in
     *         the input array.
     */
    public static Integer[] stringLengths(String arr[])
    {
        Integer[] stringLengthArr = new Integer[arr.length];
        String stringHolder;
        for(int i = 0; i < arr.length; i++)
        {
            stringHolder = arr[i];
            stringLengthArr[i] = stringHolder.length();
        }
        return stringLengthArr;
    }
    
}
