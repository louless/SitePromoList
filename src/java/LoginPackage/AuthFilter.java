/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPackage;

import LoginPackage.Actions.LoginAction;
import LoginPackage.ModelClasses.User;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import other.ConstClass;

/**
 *
 * @author VGLukin
 */
public class AuthFilter implements Filter {

    private final String ADMIN = "admin.jsp";
    private final String LOGIN = "login.jsp";
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AuthFilter.doFilter is execute: page from private zone is called.");
        HttpSession session = ((HttpServletRequest) request).getSession();
        boolean result = validateUser(session);

        if (result) {
            chain.doFilter(request, response);  // вызываем следующий фильтр
        }else{
            // Мы не можем вызвать response.sendRedirect("login.jsp"),
            // так как нам нужен httpResponse, а не ServletResponse.
            HttpServletResponse httpResponse = (HttpServletResponse) response;
        //    System.err.println("Access denied: Authfilter redurect you to URL:");
         //   System.out.println(request.getServletContext().getContextPath() + "/jsps/login.jsp");
            //httpResponse.sendRedirect(request.getServletContext().getContextPath() + "jsps/login.jsp");   
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            httpRequest.getRequestDispatcher(ConstClass.LOGIN).forward(request, response);
        }
    }

    /**
     * перед переходом на некоторые страницы проверка, что пользователь зашел
     * под существующим логином
     *
     * @return
     */
    private boolean validateUser(HttpSession session) {
        User userTmp = (User) session.getAttribute("user");
        if ((userTmp != null) && (userTmp.getUserID() != 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void destroy() {
        this.filterConfig = null;
    }

}
