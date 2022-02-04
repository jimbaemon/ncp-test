package jimbae.ncptest.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NcpController {

	@GetMapping("/")
	public String printSystemInfo() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostName()+"/"+System.getProperty("user.name");
	}
}
