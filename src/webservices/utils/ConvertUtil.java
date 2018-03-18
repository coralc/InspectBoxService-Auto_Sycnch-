 package webservices.utils;
 
public class ConvertUtil
{

    public ConvertUtil()
    {
    }

    public static String string(String string)
    {
        if(string.equals(""))
        {
            return null;
        } else
        {
            return (new StringBuilder("'")).append(string).append("'").toString();
        }
    }

    public static Integer integer(Integer integer)
    {
        if(integer.equals(Integer.valueOf(0)))
        {
            return null;
        } else
        {
            return integer;
        }
    }
}
