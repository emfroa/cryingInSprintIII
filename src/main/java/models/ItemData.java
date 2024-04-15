package models;

public class ItemData
{
	String name;
	String description;
	int likes;
	/**
	 * @param name
	 * @param description
	 */
	public ItemData(String name, String description)
	{
		super();
		this.name = name;
		this.description = description;
		likes = 0;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
}
