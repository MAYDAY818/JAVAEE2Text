

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import bean.news;
import dao.newsdao;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/NewsServlet")
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsServlet() {
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
		int fromIndex=Integer.parseInt(request.getParameter("fromIndex"));
		int count=Integer.parseInt(request.getParameter("count"));
		newsdao dao=new newsdao();
		List<news> list=dao.getSomeNews(fromIndex, count);
		JSONArray array=new JSONArray();
		for(news n:list) {
			System.out.println(n.toString());
			JSONObject object1=new JSONObject();
			object1.put("date", n.getDate());
			System.out.println(n.getDate());
			object1.put("id", n.getId());
			object1.put("title", n.getTitle());
			object1.put("info",n.getInfo());
			object1.put("img",n.getImgUrl());
			object1.put("uri", n.getLinkUrl());
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
