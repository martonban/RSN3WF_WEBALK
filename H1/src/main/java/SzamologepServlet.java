import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/szamologep.do")
public class SzamologepServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResultDto resultDto = new ResultDto();
        List<String> errorList = new ArrayList<>();
        String aString = req.getParameter("a");
        double a = 0.0;
        if(aString == null){
            errorList.add("Az a paraméter nem lehet");
        }else{
            try{
                a = Double.parseDouble(aString);
            }catch (NumberFormatException ex){
                errorList.add("Nem szám");
            }
        }
        resultDto.setA(aString);



        String bString = req.getParameter("b");
        Double b = 0.0;
        if(bString == null){
            errorList.add("Az a paraméter nem lehet");
        }else{
            try{
                b = Double.parseDouble(bString);
            }catch (NumberFormatException ex){
                errorList.add("Nem szám");
            }

        }
        resultDto.setB(bString);
        String operatorString = req.getParameter("operator");

        resultDto.setOperator(operatorString);

        double result = 0;
        if("+".equals(operatorString)){
            result = Double.parseDouble(aString) + Double.parseDouble(bString);
        }else{
            errorList.add("Nem támogatott művelet.");
        }


        if("-".equals(operatorString)){
            result = Double.parseDouble(aString) - Double.parseDouble(bString);
        }

        if("*".equals(operatorString)){
            result = Double.parseDouble(aString) * Double.parseDouble(bString);
        }

        if("/".equals(operatorString)){
            result = Double.parseDouble(aString) / Double.parseDouble(bString);
        }

        resultDto.setResult(result);
        resultDto.setErrorlist(errorList);
        //eltárolja  a kérés atributumban az össze infót, hogy a jsp is elejére
        req.setAttribute("result", resultDto);

        //Forward
        RequestDispatcher rd = req.getSession().getServletContext().getRequestDispatcher("/");
        rd.forward(req, resp);
    }
}
