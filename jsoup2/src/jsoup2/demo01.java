package jsoup2;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class demo01 {
	public static void main(String[] args) throws IOException {

		System.out.println("开始抓取电台时间轴");
		// TODO Auto-generated method stub
		//获取题目,网址,简介,时间
		org.jsoup.nodes.Document doc = Jsoup.connect("https://www.gcores.com/search?keyword=%E6%B7%B7%E6%A0%B8%E7%90%86%E8%AE%BA&page=2").get();
		System.out.println("时间点总数:"+doc.toString());
        Elements links = doc.select("div.img");
        //时间段总数
        System.out.println("时间点总数:"+links.size());
        //电台首个图片,没有文字,简介,时间点为0
        
//        System.out.println("电台大图:"+links.get(0).select("img").attr("src"));
//        //for循环遍历获取到每条新闻的四个数据并封装到News实体类中
        for(int j = 0;j < links.size();j++){
        	String img = links.get(j).select("a").attr("href");
        	System.out.println(img);
//        	//小标题
//        	String title = links.get(j).select("h1").text().split( " " )[0];
//        	System.out.println(title);
//        	//时间点 秒
//            String time = links.get(j).select("a").attr("data-at");
//            System.out.println(time);
//            //知识点讲解
//            String info = links.get(j).select("p").text();
//            System.out.println(info);
//            //知识点链接(不一定每个都有)
//            String url = links.get(j).select("p").select("a").attr("href");
//            System.out.println(url);
//            //知识点配图
//            String imgUrlTab =Jsoup.parseBodyFragment(links.get(j).select("textarea").text()).body().select("img").attr("src");
//            System.out.println(imgUrlTab);

		}
	}
}
