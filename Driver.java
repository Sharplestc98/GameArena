import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(1280,720);
		Rectangle r = new Rectangle(200,200,20,20,"RED");
		
		a.addRectangle(r);
		
		int speed = 2;
		
		while(true)
		{
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
				
			r.collides(r);

			a.pause();
		}

		
	}
}