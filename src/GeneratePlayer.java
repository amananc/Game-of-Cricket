public class GeneratePlayer
{
    public static String generatePlayerName(int i)
    {
        String str = "";
        str += (char)('A' + i);
        return str;
    }

    public static int generatePlayerAge()
    {
        int max = 36;
        int min = 20;

        int age = (int)(Math.random() * (max - min + 1) + min);
        return age;
    }
}
