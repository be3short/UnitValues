package bs.commons.dimvars.core;

/*
 * Class that stores any object.  This class is used to pass objects that could change during runtime.
 */
public abstract class AnyObject<T>
{

	private T object; // value itself

	/*
	 * Public Constructor
	 * 
	 * @param obj - object to be stored
	 */
	protected AnyObject(T obj)
	{
		object = obj;
	}

	/*
	 * sets the object
	 * 
	 * @param obj - object to be stored
	 */
	protected void set(T obj)
	{
		object = obj;
	}

	/*
	 * gets the stored object
	 * 
	 * @return stored object
	 */
	protected T get()
	{
		return object;
	}

}