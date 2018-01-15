package one.jan.one;
/**
 * 
 */

/**
 * @author dilip.duraiswamy
 *
 */
public class DistanceCalculator {

	

	/**
	 * @param lat1
	 * @param lng1
	 * @param lat2
	 * @param lng2
	 * @return distance in meters
	 * @throws Exception
	 * @Description calculate distance using haversine formula
	 * @Example 13.0017452, 77.5301752, 13.0012471, 77.5328322 distance is 0.29315066848545507
	 */
	public static double calculateDistance(double lat1, double lng1, double lat2, double lng2) throws Exception{
		int r = 6371; // average radius of the earth in km
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(lng2 - lng1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double d = r * c;
		return d;
	}

	

}
