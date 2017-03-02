package bs.commons.dimvars.exceptions;

/*
 * Signals that a dimensioned variable exception of some sort has occurred.  This class is the general class of exceptions produced by failed or incorrect dimensioned variable operations.
 *
 * @author  Brendan Short
 * @see     bs.commons.dimvars.values.DimensionedValue
 * @see     bs.commons.dimvars.units.UnitData
 */
public class UnitException extends Exception
{

	private static final long serialVersionUID = 2675032739033435588L;

	/**
	 * Constructs an {@code UnitException} with {@code null} as its error detail
	 * message.
	 */
	public UnitException()
	{
		super();
	}

	/**
	 * Constructs an {@code UnitException} with the specified detail message.
	 *
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)
	 */
	public UnitException(String message)
	{
		super(message);
	}

	/**
	 * Constructs a {@code UnitException} with the specified detail message and
	 * cause.
	 *
	 * <p>
	 * Note that the detail message associated with {@code cause} is <i>not</i>
	 * automatically incorporated into this exception's detail message.
	 *
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)
	 *
	 * @param cause
	 *            The cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A null value is permitted, and
	 *            indicates that the cause is nonexistent or unknown.)
	 *
	 */
	public UnitException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * Constructs an {@code UnitException} with the specified cause and a detail
	 * message of {@code (cause==null ? null : cause.toString())} (which
	 * typically contains the class and detail message of {@code cause}). This
	 * constructor is useful for IO exceptions that are little more than
	 * wrappers for other throwables.
	 *
	 * @param cause
	 *            The cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A null value is permitted, and
	 *            indicates that the cause is nonexistent or unknown.)
	 *
	 */
	public UnitException(Throwable cause)
	{
		super(cause);
	}
}
