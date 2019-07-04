package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class CallController {
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String respond() {
		List<InstanceInfo> s = eurekaClient.getInstancesByVipAddress("RestServer", true);
		return restTemplate.exchange(s.get(0).getHomePageUrl(), HttpMethod.GET,null,String.class).toString();
	}
}
