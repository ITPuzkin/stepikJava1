import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by qwerty on 05.07.2017.
 */
public class MainServer {

    public static void main(String[] args) throws Exception{

        AllServletRequest allServletRequest = new AllServletRequest();
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.addServlet(new ServletHolder(allServletRequest),"/mirror");

        Server server = new Server(8080);
        server.setHandler(contextHandler);
        server.start();
        System.out.println("Server started");
        server.join();

    }
}
