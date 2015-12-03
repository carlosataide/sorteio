
package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/sorteio")
public class SorteioNumeroControle extends HttpServlet{
    protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    String paramPeso = req.getParameter("numero1");
    Double numero1 = paramNumero1 == null ? 0.0 : Double.parseDouble(paramPeso);
    
    String paramAltura = req.getParameter("numero2");
    Double numero2 = paramAltura == null ? 0.0 : Double.parseDouble(paramAltura);

    SorteioNumeroModel cSorteio = new SorteioNumeroModel();
    cSorteio.getNumero1(numero1);
    cSorteio.getNumero2(numero2);
    cSorteio.getSorteio();
    
    req.setAttribute("sorteio", cSorteio); //Passando um objeto para o JSP.
    
    //Chamar o JSP apenas para mostrar o resultado.
    req.getRequestDispatcher("mvc/sorteio.jsp").forward(req, resp);
  }

}


