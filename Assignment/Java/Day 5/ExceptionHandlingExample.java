public class ExceptionHandlingExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            throwExceptionMethod();
        } catch (CustomException ce) 
        {
            System.out.println("Exception caught in the main method: " + ce.getMessage());
        }
    }
    public static void throwExceptionMethod() throws CustomException 
    {
        if (someConditionIsMet()) 
        {
            throw new CustomException("CustomException occurred");
        }
    }
    static class CustomException extends Exception 
    {
        public CustomException(String message) 
        {
            super(message);
        }
    }
    public static boolean someConditionIsMet()
    {

        return true;
    }
}
