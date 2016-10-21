package com.escola.login.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.log4j.Log4j;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Simple logging interceptor that supports logging APP_CODE header for all web-service traffic. Can
 * be used to track sources of web service traffic
 */
@Component
@Log4j
public class TrafficLoggingInterceptor extends HandlerInterceptorAdapter {



  private static final String APP_CODE = "APP_CODE";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    String appCode = request.getHeader(APP_CODE);

    if (StringUtils.hasText(appCode)) {
      log.info("APP_CODE_TRACE[" + appCode + "]");
    }
    return true;
  }
}

