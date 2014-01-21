package array.Model;

public class MarshmallowCreature
{
	private String name;
	private int eyes;
	private int arms;
	private int legs;
	private int button;
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void seteyes(int eyes)
	{
		this.eyes = eyes;
	}
	
	public void setarms(int arms)
	{
		this.arms = arms;
	}
	
	public void setlegs(int legs)
	{
		this.legs = legs;
	}
	
	public void setbutton(int button)
	{
		this.button = button;
	}
	
	public String getname()
	{
		return name;
	}
	
	public int geteyes()
	{
		return eyes;
	}
	
	public int getarms()
	{
		return arms;
	}
	
	public int getlegs()
	{
		return legs;
	}
	
	public int getbutton()
	{
		return button;
	}
	/**
	 * Create a marshmallow with the specified values.
	 * @param name The name of the creature.
	 * @param eyes The number of eyes the creature has.
	 * @param arms The number of arms the creature has.
	 * @param legs The number of legs the creature has.
	 * @param button Whether or not the creature has a button.
	 */
	public MarshmallowCreature(String name, int eyes, int arms, int legs, int button)
	{
		setname(name);
		seteyes(eyes);
		setarms(arms);
		setlegs(legs);
		setbutton(button);
	}
	
	public MarshmallowCreature()
	{
		// default constructor has no parameters and shouldn't be used.
		name = "null";
		eyes = -1;
		arms = -1;
		legs = -1;
		button = 0;		
	}
	
	
}
