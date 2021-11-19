package com.matrix.learnspring.controllers;

import com.matrix.learnspring.models.GeoIP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@ResponseBody
@RestController
public class HomeController {


    private HttpServletRequest request;

    @Autowired
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
    @PostMapping("find-ip")
    private static String getClientIp(HttpServletRequest request) {

        String remoteAddr = "";
//
//        if (request != null) {
//            remoteAddr = request.getHeader("X-FORWARDED-FOR");
//            if (remoteAddr == null || "".equals(remoteAddr)) {
//                remoteAddr = request.getRemoteAddr();
//            }
//        }


        String ip = "your-ip-address";


        return remoteAddr;
    }

    @PostMapping("/GeoIPTest")
    public GeoIP getLocation(
            @RequestParam(value="ipAddress", required=true) String ipAddress
    ) throws Exception {

        GeoIPLocationService<String, GeoIP> locationService
                = new RawDBDemoGeoIPLocationService();
        return locationService.getLocation(ipAddress);
    }


}
