public class Driver
{
	public static void main(String[] args)
	{
		GameArena a = new GameArena(640,480);
		Rectangle r = new Rectangle(200,200,20,70,"RED");
		
		a.addRectangle(r);
		
		
	}
}