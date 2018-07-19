public class Time
{
	private long hour;
	private long minute;
	private long second;

	public Time()
	{
		hour = (((System.currentTimeMillis() / 1000) /60) /60) % 24 ;
		minute = ((System.currentTimeMillis() / 1000) / 60) % 60;
		second = (System.currentTimeMillis() / 1000) % 60;
	}

	public Time(long elapsed)
	{
		second = (elapsed / 1000) % 60;
		minute = ((elapsed / 1000) / 60) % 60;
		hour = (((elapsed / 1000) / 60) / 60) % 24;
	}

	public Time(long hour, long minute, long second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour()
	{
		return hour;
	}

	public long getMinute()
	{
		return minute;
	}

	public long getSecond()
	{
		return second;
	}

	public void setTime(long elapseTime)
	{
		second = (elapseTime / 1000) % 60;
		minute = ((elapseTime / 1000) / 60) % 60;
		hour = (((elapseTime / 1000) / 60) / 60) % 24;
	}
}
