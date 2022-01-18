package org.kai.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("cloud-commodity")
public interface CommodityClient {
    @GetMapping("/commodify/getCommodifyList")
    Map<String,Object> getCommodifyList();
}
