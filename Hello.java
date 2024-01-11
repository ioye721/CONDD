import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloJapan extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
    res.setContentType("text/plain; charset=Shift_JIS");
    PrintWriter out = res.getWriter();
    res.setHeader("Content-Language", "ja");

    Locale locale = new Locale("ja", "");
    DateFormat full = DateFormat.getDateTimeInstance(DateFormat.LONG,
                                                     DateFormat.LONG,
                                                     locale);
    out.println("In Japanese:");
    out.println("\u4eca\u65e5\u306f\u4e16\u754c");  // Hello World
    out.println(full.format(new Date()));
  }
}
