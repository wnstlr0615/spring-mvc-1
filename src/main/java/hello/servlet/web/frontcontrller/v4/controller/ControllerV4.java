package hello.servlet.web.frontcontrller.v4.controller;

import java.util.Map;

public interface ControllerV4 {
    String process(Map<String , String> paramMap, Map<String, Object> model);
}
