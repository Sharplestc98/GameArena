import java.util.*;

public class BallDriver
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(300,300);
        Ball balls[] = new Ball[600];
        Random random = new Random();

        for (int i=0; i<balls.length; i++)
        {
            double x = random.nextDouble() * a.getArenaWidth();
            double y = random.nextDouble() * a.getArenaHeight();
            double size = 1;

		    balls[i] = new Ball(x, y, size, "#0000FF");
            balls[i].setXSpeed(1);
            balls[i].setYSpeed(1);

		    a.addBall(balls[i]);
        }

		while(true)
		{
            for (int i=0; i<balls.length; i++)
			    balls[i].gravity(a.getArenaWidth(), a.getArenaHeight());

			a.pause();
		}
	}
}
