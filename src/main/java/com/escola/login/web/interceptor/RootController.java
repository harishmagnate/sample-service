package com.escola.login.web.interceptor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author harishmagnate
 *
 */
@RestController
@RequestMapping("/")
public class RootController {

	  static final LocalDateTime buildTime = LocalDateTime.now();

	  @RequestMapping(method = RequestMethod.GET)
	  @ResponseStatus(HttpStatus.OK)
	  public Object heartBeat() {
	    return "OK";
	  }

	  @RequestMapping(value = "/buildTime", method = RequestMethod.GET)
	  @ResponseBody
	  public String getBuildTime() {
	    return buildTime.toString();
	  }

}
