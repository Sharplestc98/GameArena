import java.util.*;

public class BallDriver2
{
public static void main(String[] args)
	{
		GameArena a = new GameArena(1280,720);
        Ball startBall[] = new Ball[1];
		Ball balls[] = new Ball[600];
		Random random = new Random();
				
		double x = 100;
		double y = 100;
		startBall[0] = new Ball(x, y, 20, "#FF0000");
		a.addBall(startBall[0]);
				
		for (int i=0; i<balls.length; i++)
        {
			double size = 3;
			balls[i] = new Ball(x, y, size, "#0000FF");
            balls[i].setXSpeed(random.nextDouble()*15 - 7);
            balls[i].setYSpeed(random.nextDouble()*20);
			
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