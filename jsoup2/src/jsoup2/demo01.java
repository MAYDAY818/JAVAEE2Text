package jsoup2;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class demo01 {
	public static void main(String[] args) throws IOException {

		System.out.println("��ʼץȡ��̨ʱ����");
		// TODO Auto-generated method stub
		//��ȡ��Ŀ,��ַ,���,ʱ��
		org.jsoup.nodes.Document doc = Jsoup.connect("https://www.gcores.com/search?keyword=%E6%B7%B7%E6%A0%B8%E7%90%86%E8%AE%BA&page=2").get();
		System.out.println("ʱ�������:"+doc.toString());
        Elements links = doc.select("div.img");
        //ʱ�������
        System.out.println("ʱ�������:"+links.size());
        //��̨�׸�ͼƬ,û������,���,ʱ���Ϊ0
        
//        System.out.println("��̨��ͼ:"+links.get(0).select("img").attr("src"));
//        //forѭ��������ȡ��ÿ�����ŵ��ĸ����ݲ���װ��Newsʵ������
        for(int j = 0;j < links.size();j++){
        	String img = links.get(j).select("a").attr("href");
        	System.out.println(img);
//        	//С����
//        	String title = links.get(j).select("h1").text().split( " " )[0];
//        	System.out.println(title);
//        	//ʱ��� ��
//            String time = links.get(j).select("a").attr("data-at");
//            System.out.println(time);
//            //֪ʶ�㽲��
//            String info = links.get(j).select("p").text();
//            System.out.println(info);
//            //֪ʶ������(��һ��ÿ������)
//            String url = links.get(j).select("p").select("a").attr("href");
//            System.out.println(url);
//            //֪ʶ����ͼ
//            String imgUrlTab =Jsoup.parseBodyFragment(links.get(j).select("textarea").text()).body().select("img").attr("src");
//            System.out.println(imgUrlTab);

		}
	}
}