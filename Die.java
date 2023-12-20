import java.util.Random;

public class Die
{
    private int sides;
    
    public Die(int sides) {
        this.sides = sides;
    }
    
    public int roll() {
        return new Random().nextIndex(sides) + 1;
    }
}
