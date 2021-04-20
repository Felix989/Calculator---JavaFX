import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet{




    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println(this.getServletName() + " initted");
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println(this.getServletName() + " service");

    }

    @Override
    public void destroy() {
        System.out.println(this.getServletName() + " destroyed");
       // super.destroy();
    }

      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("doGet");
        //resp.setContentType("text/html");
       // resp.getWriter().append("<p>answer is appended here</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstNumber = Integer.parseInt(req.getParameter("firstNumber"));
        int secondNumber = Integer.parseInt(req.getParameter("secondNumber"));

        int sum = (firstNumber + secondNumber);

        resp.getWriter().println("sum of the first and second number" + sum);
    }
}
