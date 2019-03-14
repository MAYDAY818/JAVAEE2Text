

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public demo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//获取题目,网址,简介,时间
				Document doc = Jsoup.connect("https://www.gcores.com/radios/104740").get();
		        Elements links = doc.select("div.swiper-slide");
		        //时间段总数
		        System.out.println("时间点总数:"+links.size());
		        //电台首个图片,没有文字,简介,时间点为0
		        
		        System.out.println("电台大图:"+links.get(0).select("img").attr("src"));
		        //for循环遍历获取到每条新闻的四个数据并封装到News实体类中
		        for(int j = 1;j < links.size();j++){
		        	//小标题
		        	String title = links.get(j).select("h1").text().split( " " )[0];
		        	System.out.println(title);
		        	//时间点 秒
		            String time = links.get(j).select("a").attr("data-at");
		            System.out.println(time);
		            //知识点讲解
		            String info = links.get(j).select("p").text();
		            System.out.println(info);
		            //知识点链接(不一定每个都有)
		            String url = links.get(j).select("p").select("a").attr("href");
		            System.out.println(url);
		            //知识点配图
		            String imgUrlTab =Jsoup.parseBodyFragment(links.get(j).select("textarea").text()).body().select("img").attr("src");
		            System.out.println(imgUrlTab);

				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
