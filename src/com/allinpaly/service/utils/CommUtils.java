package com.allinpaly.service.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/8/2.
 */
public class CommUtils {
    public static void sendJson(HttpServletResponse response, String sendDate) {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
            try {
                out = response.getWriter();
                out.write(sendDate);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    out.close();
                }
        }
    }
}
