
public class IncompleteCarConfigurationException extends Exception 
{
	public IncompleteCarConfigurationException(String message)
	{
		super(message);
	}

}
class CarNotInParkedException extends Exception
{
	public CarNotInParkedException(String message)
	{
		super(message);
	}
}
class CarAlreadyRunningException extends Exception
{
	public CarAlreadyRunningException(String message)
	{
		super(message);
	}
}
class BrakesNotAppliedException extends Exception
{
	public BrakesNotAppliedException(String message)
	{
		super(message);
	}
}

