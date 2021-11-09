package TrickyQs.String;

import org.apache.commons.lang3.StringUtils;

public class RemoveSpaces {

    public static void main(String[] args) {

        String spaceString = "            This        is   my java Code      ";

        //Trim() - spaces at edge trimmed
        System.out.println(spaceString.trim()); // --> This        is   my java Code

        //replaceAll() - all spaces are trimmed
        System.out.println(spaceString.replaceAll("\\s+", "")); // --> ThisismyjavaCode

        // delete white spaces with String utils
        System.out.println(StringUtils.deleteWhitespace(spaceString)); // -->  ThisismyjavaCode

        // Using conventional non-build function
        String nonWhiteSpacestring = "";

        for (int i = 0; i < spaceString.length(); i++) {
            if (spaceString.charAt(i) == ' ' && spaceString.charAt(i) == '\t') {
                nonWhiteSpacestring+=spaceString.charAt(i);
            }

            System.out.println(nonWhiteSpacestring);
        }

    }

}
