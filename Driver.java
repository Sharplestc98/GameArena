public class Driver
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(640,480);
		Rectangle r = new Rectangle(200,200,20,70,"RED");
		Rectangle b	= new Rectangle(r.getXPosition(), r.getYPosition(), r.getWidth(), r.getHeight(), "GREEN");
		Rectangle rectangles[] = new Rectangle[30];
		
		a.addRectangle(r);
		double ghostWidth = r.getWidth();
		double ghostHeight = r.getHeight();
		double ghostXPosition = r.getXPosition();
		double ghostYPosition = r.getYPosition();
		int i = 0;
		
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
				/*r.setWidth(ghostHeight);
				r.setHeight(ghostWidth);*/
			
			if (a.enterPressed())
				//Rectangle b	= new Rectangle(r.getXPosition(), r.getYPosition(), r.getWidth(), r.getHeight(), "GREEN");
				a.addRectangle(b);

			a.pause();
		}

		
	}
}