package A12.CG1;

public class A12_GameCharacter
{
    private String characterName;
    private int hitPoints;
    private int magicPoints;

    public A12_GameCharacter(String characterName, int hitPoints, int magicPoints)
    {
        this.characterName = characterName;
        this.hitPoints = hitPoints;
        this.magicPoints = magicPoints;
    }

    public String getCharacterName()
    {  return characterName;  }

    public int getHitPoints()
    {  return hitPoints;  }

    public int getMagicPoints()
    {  return magicPoints;  }

    public void takeDamage(int damage)
    {  hitPoints-=damage;  }

    public void setMagicPoints(int magicPoints)
    {  this.magicPoints = magicPoints;  }
}
