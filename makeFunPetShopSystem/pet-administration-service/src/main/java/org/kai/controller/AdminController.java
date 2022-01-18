package org.kai.controller;

import org.kai.clients.CommodityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private CommodityClient commodityClient;

    @GetMapping("/admin/getCommodifyListInfo")
        public Map<String ,Object> getCommodifyListInfo(){
        Map<String ,Object> commodifyListInfo = commodityClient.getCommodifyList();
        return commodifyListInfo;
    }

}
