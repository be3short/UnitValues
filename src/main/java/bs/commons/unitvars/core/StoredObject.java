package bs.commons.unitvars.core;

/*
 * Class that stores any object.  This class is used to pass objects that could change during runtime to ensure the correct pointer.
 */
public abstract class StoredObject<T>
{

	private T object; // value itself

	/*
	 * Public Constructor
	 * 
	 * @param obj - object to be stored
	 */
	protected StoredObject(T obj)
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

	/*
	 * returns flag if object is null
	 * 
	 * @return null object flag
	 */
	protected Boolean hasObject()
	{
		return object == null;
	}

}