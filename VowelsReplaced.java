
/**
 * An example of useing StringBuilder and
 * the toString( )
 *
 * @author L. Lehmann
 * @version 2-24-2014
 * @auther Arion Almond
 * @version 3-14-2016
 */
public class VowelsReplaced
{
    private String original;
    private StringBuilder workingOnIt;
    private String converted;

    public VowelsReplaced(String startingString)
    {
        original = new String(startingString);
        workingOnIt = new StringBuilder(startingString);
    }

    /**
     * This method changes all vowels in the string to blanks
     */
    public void convert( )
    {
        int index;
        for(index = 0; index < original.length(); index++)
        {
            if(workingOnIt.charAt(index) == 'a'
              || workingOnIt.charAt(index) == 'a'
              || workingOnIt.charAt(index) == 'e'
              || workingOnIt.charAt(index) == 'i'
              || workingOnIt.charAt(index) == 'o'
              || workingOnIt.charAt(index) == 'u')
            workingOnIt.replace(index,index + 1,  " ");
         }
        converted = new String(workingOnIt);
    }

    public String toString( )
    {
        return converted;
    }

 }
