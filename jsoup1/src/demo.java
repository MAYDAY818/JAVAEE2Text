

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
				//��ȡ��Ŀ,��ַ,���,ʱ��
				Document doc = Jsoup.connect("https://www.gcores.com/radios/104740").get();
		        Elements links = doc.select("div.swiper-slide");
		        //ʱ�������
		        System.out.println("ʱ�������:"+links.size());
		        //��̨�׸�ͼƬ,û������,���,ʱ���Ϊ0
		        
		        System.out.println("��̨��ͼ:"+links.get(0).select("img").attr("src"));
		        //forѭ��������ȡ��ÿ�����ŵ��ĸ����ݲ���װ��Newsʵ������
		        for(int j = 1;j < links.size();j++){
		        	//С����
		        	String title = links.get(j).select("h1").text().split( " " )[0];
		        	System.out.println(title);
		        	//ʱ��� ��
		            String time = links.get(j).select("a").attr("data-at");
		            System.out.println(time);
		            //֪ʶ�㽲��
		            String info = links.get(j).select("p").text();
		            System.out.println(info);
		            //֪ʶ������(��һ��ÿ������)
		            String url = links.get(j).select("p").select("a").attr("href");
		            System.out.println(url);
		            //֪ʶ����ͼ
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
