/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.calculator.servlets;

import java.io.*;
import java.util.HashSet;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Kevin
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
            request.setAttribute("result", "---");        
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
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
            
            int total = 0; 
            
            String first = request.getParameter("first");
            String second = request.getParameter("second");
        
        if(first != null && second != null){
            try{
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(second);
            
            String calculate = request.getParameter("calculate");
            
            //case to check with operation needs to be performed
            switch(calculate){
                
                case "add" : total = num1 + num2; 
                break;
                
                case "minus" : total = num1 - num2; 
                break;
                
                case "multiply" : total = num1 * num2; 
                break; 
                
                case "divide" : total = num1 % num2; 
                break;
       
            }          
            

            request.setAttribute("result", total);
            }
            catch (Exception ex){
                //Catches invalid result
                request.setAttribute("result", "invalid");
            }

        }
        else{
            //send a message to indicate its not a number
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }
}
