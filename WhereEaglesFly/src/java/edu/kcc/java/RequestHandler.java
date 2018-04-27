package edu.kcc.java;

import edu.kcc.java.student.Student;
import edu.kcc.java.survey.Survey;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Brady Feller
 */
public class RequestHandler extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        String task = request.getParameter("task");
        if (null == task) {
            task = "default";
        }

        String target = "index.jsp";
        String errorMessage = "";

        switch (task) {
            case "survey":
                try {
                    String studentID = request.getParameter("studentId");

                    if (studentID == null) {
                        // page cant be found
                        target = "index.jsp";
                    } else {
                        //session.setAttribute();

                        //Note: names wll change
                        String firstName = request.getParameter("userFirstName");
                        String lastName = request.getParameter("userLastName");
                        String email = request.getParameter("userEmail");
                        String phoneNumber = request.getParameter("userPhoneNumber");
                        String degreeProgram = request.getParameter("degreeProgram");
                        String graduationYear = request.getParameter("graduationYear");
                        String priorDegree = request.getParameter("priorDegree");
                        String employer = request.getParameter("employer");
                        String employmentPosition = request.getParameter("employmentPosition");
                        String salaryRange = request.getParameter("salaryRange");
                        String location = request.getParameter("location");
                        String country = request.getParameter("country");
                        String address = request.getParameter("address");
                        String nonTraditionalstudent = request.getParameter("nonTraditionalstudent");

                        try {

                            
                            Survey survey = new Survey();
                            Student student = new Student();
                            
                            target = "thanksPage.jsp";
                            
                            // save survey and student to database
                            
                            
                        } catch (Exception ex) {
                            target = "formSubmission.jsp";
                            errorMessage = "Something went wrong " + ex.getMessage();
                        }
                    }
                } catch (NumberFormatException nfe) {

                }

                break;
            case "thanksPage":
                target = "thanksPage.jsp";
                break;
            case "login":
                //login handler code here
                // waiting for active directory
                break;
            case "logout":

                session.setAttribute("userName", null);

                // Send the user to the login page
                target = "/login.jsp";

            default:
                // Return to index.jsp
                // send to error page
                target = "index.jsp";
                errorMessage = "Requested resouce does not exist!";
        }
        session.setAttribute(
                "errorMessage", errorMessage);
        request.getRequestDispatcher(target)
                .forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
