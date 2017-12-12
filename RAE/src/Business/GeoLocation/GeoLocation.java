/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GeoLocation;
import java.io.File;
import java.io.IOException;
import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.regionName;
import Business.GeoLocation.ServerLocation.ServerLocation;


/**
 *
<<<<<<< HEAD
 * @author Romell
=======
 * @author eric
>>>>>>> 1f267105eb8402491cf1ac94cde0087e26ec9d55
 */
public class GeoLocation {
    public static ServerLocation getLocation(String ipAddress) throws IOException {

	File file = new File(
<<<<<<< HEAD
	    "C:\\Users\\Romell\\romell2111\\aed_final_project_rae\\RAE\\GeoLocation\\GeoLiteCity.dat\\GeoLiteCity.dat");
=======
	    "C:\\Aedfinalproject\\aed_final_project_rae\\RAE\\GeoLocation\\GeoLiteCity.dat\\GeoLiteCity.dat");
>>>>>>> 1f267105eb8402491cf1ac94cde0087e26ec9d55
	return getLocation(ipAddress, file);

  }

    public static ServerLocation getLocation(String ipAddress, File file) throws IOException {

	ServerLocation serverLocation = null;

        serverLocation = new ServerLocation();
        LookupService lookup = new LookupService(file,LookupService.GEOIP_MEMORY_CACHE);
        Location locationServices = lookup.getLocation(ipAddress);
        serverLocation.setCountryCode(locationServices.countryCode);
        serverLocation.setCountryName(locationServices.countryName);
        serverLocation.setRegion(locationServices.region);
        serverLocation.setRegionName(regionName.regionNameByCode(
                locationServices.countryCode, locationServices.region));
        serverLocation.setCity(locationServices.city);
        serverLocation.setPostalCode(locationServices.postalCode);
        serverLocation.setLatitude(String.valueOf(locationServices.latitude));
        serverLocation.setLongitude(String.valueOf(locationServices.longitude));

	return serverLocation;

  }

    
}
