package org.kai.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class CommodifyController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/commodify/getCommodifyList")
    public Map<String,Object> getCommodifyList(){
    log.info("进入商品服务");
        Map<String,Object> proMap=new HashMap<>();
        proMap.put("status",200);
        proMap.put("msg","商品列表"+port);
        return proMap;
    }
}
