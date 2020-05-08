package factoryMethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	// 读取XML配置文件中具体类的类名，并返回一个实例对象
	public static Object getBean() throws Exception {
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("./src/factoryMethod/config.xml"));
			
			// 获取包含类名的文本节点
			NodeList nodeList = doc.getElementsByTagName("className");
			Node classNode = nodeList.item(0).getFirstChild();
			String className = classNode.getNodeValue();
			
			// 通过类名生成实例对象并将其返回
			Class<?> c = Class.forName(className);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			throw new Exception("Sorry,This kind of product is not found");
		}
	}
}