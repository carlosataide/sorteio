
package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Sorteio")
public class SorteioNumeroControle extends HttpServlet{
    protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    String paramNumero1 = req.getParameter("numero1");
    int numero1 = (int) (paramNumero1 == null ? 0.0 : Integer.parseInt(paramNumero1));
    
    String paramNumero2 = req.getParameter("numero2");
    int numero2 = (int) (paramNumero2 == null ? 0.0 : Integer.parseInt(paramNumero2));

    SorteioNumeroModel cSorteio = new SorteioNumeroModel();
    cSorteio.getNumero1();
    cSorteio.getNumero2();
    cSorteio.getSorteio();
    
    req.setAttribute("sorteio", cSorteio); //Passando um objeto para o JSP.
    
    //Chamar o JSP apenas para mostrar o resultado.
    req.getRequestDispatcher("mvc/sorteio.jsp").forward(req, resp);
  }

}


