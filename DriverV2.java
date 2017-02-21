import java.util.*;

public class DriverV2
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(1280,720);
		Rectangle r = new Rectangle(200,200,20,20,"RED");
		Ball startBall[] = new Ball[1];
		Ball balls[] = new Ball[600];
		Random random = new Random();
		
		a.addRectangle(r);
		
		int speed = 2;
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

            if (a.rightPressed())
			    r.setXPosition(r.getXPosition() + speed);

            if (a.leftPressed())
			    r.setXPosition(r.getXPosition() - speed);

            if (a.upPressed())
			    r.setYPosition(r.getYPosition() - speed);

            if (a.downPressed())
			    r.setYPosition(r.getYPosition() + speed);
				
			if (a.rPressed())
				a.addRectangle(r);
			
			if(a.enterPressed())
				a.removeRectangle(r);
				
			//r.collides(r);

			a.pause();
		}

		
	}
}