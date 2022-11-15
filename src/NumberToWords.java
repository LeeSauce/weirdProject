public class NumberToWords
{
    public static void numberToWords(int number)
    {

        int words = 0;
        int same = reverse(number);
        int digit = getDigitCount(number);

        if(number < 0)
        {
            System.out.println("Invalid Value");
        }

        for(int i = digit; i > 0; i--)
        {
            int remainder = same % 10;
            words = remainder;
            same /= 10;
            switch(words)
            {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int getDigitCount(int number)
    {
        int count = 0;
        int same = number;
        if (number < 0)
        {
            return -1;
        }
        while(same >= 10)
        {
            same /= 10;
            count ++;
        }
        if(same < 10)
        {
            count += 1;
        }
        return count;
    }

    public static int reverse(int number)
    {
        int same = number;
        int myReverse = 0;
        int negativeInt = -1;
        boolean isNegative = false;
        if(same < 0)
        {
            same *= negativeInt;
            isNegative = true;
        }
        while(same >= 10)
        {
                int remainder = same % 10;
                myReverse += remainder;
                myReverse *= 10;
                same /= 10;
        }
        if(same <10)
        {
            myReverse += same;
        }
        if(isNegative)
        {
            myReverse *= negativeInt;
        }
        return myReverse;
    }
}