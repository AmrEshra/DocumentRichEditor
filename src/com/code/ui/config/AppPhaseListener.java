package com.code.ui.config;


import java.util.Locale;

import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.code.enums.SessionAttributesEnum;


public class AppPhaseListener implements PhaseListener {
    private static final long serialVersionUID = 1L;
	
    public void afterPhase(PhaseEvent phaseEvent) {
    }

    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }

    @SuppressWarnings("unchecked")
	public void beforePhase(PhaseEvent phaseEvent) {
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String curLang = (String)req.getSession().getAttribute(SessionAttributesEnum.CURRENT_LANG.getCode());        
        if(curLang != null){   		
            FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(curLang));
        } else{
        	FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("ar"));
        }
//        /*-------AJAX REQUEST CHECK Solution ----------------*/
       if(FacesContext.getCurrentInstance().getPartialViewContext().isAjaxRequest())
          return;
        
        String requestURI = req.getRequestURI();
        int index = requestURI.indexOf("?");
        if(index != -1){
            requestURI =  requestURI.substring(0, index);
        }
        
//        if (!req.getRequestURI().endsWith("/Main/Login.jsf")){
//            EmployeeData sessionUser = (EmployeeData) req.getSession().getAttribute(SessionAttributesEnum.USER_DATA.getCode());
//            if (sessionUser == null) {
//            	
//            	try {
//                    HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//					response.sendRedirect(EnvironmentUtilities.getPortalUrl());
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
////            	redirect("/Main/Login.jsf");
//            	return;
//            }
//        }
        
//        if(!requestURI.endsWith("/Main/Login.jsf")){
//            // If no session Emp_ID then redirect to login
//            if(req.getSession().getAttribute(SessionAttributesEnum.USER_DATA.getCode()) == null){
//                redirect("/Main/Editor.jsf");
//            }
//        }  
//        else{
//        	boolean skip =false;
//        	if(req.getAttribute("skipLogin")!=null)
//        		skip = (Boolean) req.getAttribute("skipLogin");
//        	if(req.getParameter("logout") != null)
//        		skip = false;
//        	HttpSession session =req.getSession();
//        	if(session.getAttribute(SessionAttributesEnum.USER_DATA.getCode())==null)
//        		skip=false;
//        	if(skip)
//        		redirect("/Main/Welcome.jsf");
//        }
        
        FacesContext facesContext = phaseEvent.getFacesContext();
        HttpServletResponse response = (HttpServletResponse) facesContext
                .getExternalContext().getResponse();
        response.addHeader("Pragma", "no-cache");
        response.addHeader("Cache-Control", "no-cache");
        response.addHeader("Cache-Control", "no-store");
        response.addHeader("Cache-Control", "must-revalidate");
        // some date in the past
        response.addHeader("Expires", "0");
    }
    
    private void redirect(String viewURI){        
        Application app = FacesContext.getCurrentInstance().getApplication();
        ViewHandler viewHandler = app.getViewHandler();
        UIViewRoot viewRoot = viewHandler.createView(FacesContext.getCurrentInstance(), viewURI);
        FacesContext.getCurrentInstance().setViewRoot(viewRoot);
    }
}