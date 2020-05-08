package factoryMethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	// ��ȡXML�����ļ��о������������������һ��ʵ������
	public static Object getBean() throws Exception {
		try {
			// �����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("./src/factoryMethod/config.xml"));
			
			// ��ȡ�����������ı��ڵ�
			NodeList nodeList = doc.getElementsByTagName("className");
			Node classNode = nodeList.item(0).getFirstChild();
			String className = classNode.getNodeValue();
			
			// ͨ����������ʵ�����󲢽��䷵��
			Class<?> c = Class.forName(className);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			throw new Exception("Sorry,This kind of product is not found");
		}
	}
}