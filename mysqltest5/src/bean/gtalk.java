package bean;

public class gtalk {
	private int id;
	private String icon;
	private String name;
	private String date;
	private String title;
	private String img;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public gtalk(int id, String icon, String name, String date, String title, String img, String content) {
		super();
		this.id = id;
		this.icon = icon;
		this.name = name;
		this.date = date;
		this.title = title;
		this.img = img;
		this.content = content;
	}
	public gtalk() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "gtalk [id=" + id + ", icon=" + icon + ", name=" + name + ", date=" + date + ", title=" + title
				+ ", img=" + img + ", content=" + content + "]";
	}
	

}
