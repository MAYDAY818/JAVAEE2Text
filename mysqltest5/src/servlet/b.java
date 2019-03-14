package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import bean.gtalk;
import bean.produce;
import dao.producedao;

/**
 * Servlet implementation class b
 */
@WebServlet("/b")
public class b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		producedao dao=new producedao();
		List<produce> list=dao.getproduce();
	
		JSONArray array=new JSONArray();
		
		for(produce n:list) {
			System.out.println(n.toString());
			JSONObject object1=new JSONObject();
			object1.put("id", n.getId());
			System.out.println(n.getId());
			object1.put("img", n.getImg());
			object1.put("info", n.getInfo());
			object1.put("price",n.getPrice());
			object1.put("uri",n.getUri());
			array.put(object1);
			
			
		}
		
		response.getWriter().append(array.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
