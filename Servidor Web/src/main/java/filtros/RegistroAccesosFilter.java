package filtros;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import clienteWS.IctrlServicio;
import clienteWS.IctrlServicioService;

@WebFilter("/*") // intercepta todas las URLs del sitio
public class RegistroAccesosFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
                    // === Crear cliente del Web Service ===
            System.setProperty("file.encoding", "UTF-8");
            IctrlServicioService service = new IctrlServicioService();
            IctrlServicio port = service.getIctrlServicioPort();
        
        if (request instanceof HttpServletRequest) {
            HttpServletRequest req = (HttpServletRequest) request;

            String ip = request.getRemoteAddr();
            String url = req.getRequestURL().toString();
            String agente = req.getHeader("User-Agent"); // contiene navegador + SO

            String browser = detectarBrowser(agente);
            String so = detectarSO(agente);

            // Registrar el acceso
            port.registrarAcceso(ip, url, browser, so);
        }

        // continuar con la cadena (no olvides esto)
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}

    private String detectarBrowser(String agent) {
        if (agent == null) return "Desconocido";
        agent = agent.toLowerCase();
        if (agent.contains("chrome")) return "Chrome";
        if (agent.contains("firefox")) return "Firefox";
        if (agent.contains("safari") && !agent.contains("chrome")) return "Safari";
        if (agent.contains("edge")) return "Edge";
        if (agent.contains("opera") || agent.contains("opr")) return "Opera";
        if (agent.contains("msie") || agent.contains("trident")) return "Internet Explorer";
        return "Otro";
    }

    private String detectarSO(String agent) {
        if (agent == null) return "Desconocido";
        agent = agent.toLowerCase();
        if (agent.contains("windows")) return "Windows";
        if (agent.contains("mac")) return "Mac";
        if (agent.contains("x11") || agent.contains("linux")) return "Linux";
        if (agent.contains("android")) return "Android";
        if (agent.contains("iphone")) return "iOS";
        return "Otro";
    }
}
