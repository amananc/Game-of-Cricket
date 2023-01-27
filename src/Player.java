public class Player
{
    String name;
    int age;
    String team;

    public Player(String name, int age, String team)
    {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }
}
