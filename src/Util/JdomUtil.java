package Util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class JdomUtil {
	private List<Book>bookList=new ArrayList<Book>();
	private Book newBook;
	/**
	 * 解析XML文件
	 *
	 *10:20:21 PM
	 *@method:  readXMLFile
	 *@param path
	 *@return
	 *@throws JDOMException
	 *@throws IOException List<Book>
	 */
	public List<Book> readXMLFile(String path) throws JDOMException, IOException{
		//构造器
		SAXBuilder saxBulider=new SAXBuilder();
		//获得文档
		Document document=saxBulider.build(new File(path));
		//得到根元素
		Element bookstore=document.getRootElement();
		//得到根元素的子元素
		List<Element>books=bookstore.getChildren();
		for(int i=0;i<books.size();i++){
			newBook=new Book();
			Element book=books.get(i);
			//获取属性
			List<Attribute>attributes=new ArrayList<Attribute>();
			for(int j=0;j<attributes.size();j++){
				Attribute bookAttribute=attributes.get(j);
				if(bookAttribute.getName().equals("id")){
					newBook.setBookId(Integer.parseInt(bookAttribute.getValue()));
				}
				if(bookAttribute.getName().equals("other")){
					newBook.setBookOther(bookAttribute.getValue());
				}
			}
			
			//获得book的子元素
			List<Element>bookChilds=book.getChildren();
			for(int j=0;j<bookChilds.size();j++){
				if(bookChilds.get(j).getName().equals("Author")){
					newBook.setBookAuthor(bookChilds.get(j).getValue());
				}
				if(bookChilds.get(j).getName().equals("Name")){
					newBook.setBookName(bookChilds.get(j).getValue());
				}
				if(bookChilds.get(j).getName().equals("Price")){
					newBook.setBookPrice(bookChilds.get(j).getValue());
				}
				if(bookChilds.get(j).getName().equals("Type")){
					newBook.setBookType(bookChilds.get(j).getValue());
				}
				
			}
			
		}
		bookList.add(newBook);
		return bookList;		
	}
	/**
	 * 创建XML文件
	 *
	 *10:21:37 PM
	 *@method:  createXML void
	 */
	
	public void createXML(){
		//创建根元素
		Element bookStore=new Element("BookStore");
		//创建文档
		Document document=new Document(bookStore);
		//创建子元素
		Element book1=new Element("book");
		//创建子元素属性
		book1.setAttribute("id","book1");
		book1.setAttribute("other","第一本书");
		//添加元素
		bookStore.addContent(book1);
		//创建子元素下的元素
		//书名
		Element bookName=new Element("Name");
		//作者
		Element bookAuthor=new Element("Author");
		//价钱
		Element bookPrice=new Element("Price");
		//类型
		Element bookType=new Element("Type");
		
		bookName.setText("Lost");
		bookAuthor.setText("张岩");
		bookPrice.setText("$20");
		bookType.setText("励志");
		
		book1.addContent(bookName);
		book1.addContent(bookAuthor);
		book1.addContent(bookPrice);
		book1.addContent(bookType);
		
		XMLOutputter xmlOutputter=new XMLOutputter();
		xmlOutputter.setFormat(Format.getPrettyFormat());
		try {
			xmlOutputter.output(document, System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
