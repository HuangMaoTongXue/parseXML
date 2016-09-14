package domParseXML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by huangmao on 2016/9/14.
 */
public class RunParse {
    public static void main(String[] argx) {
        try {
            long beginTime = System.currentTimeMillis();//获取当前时间，用于程序计时
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("student.xml");
            Element root = document.getDocumentElement();
            NodeList studentNodes = root.getElementsByTagName("学生");
            Element student;
            for (int i = 0; i < studentNodes.getLength(); i++) {
                student = (Element) studentNodes.item(i);
                NamedNodeMap atrrMap = student.getAttributes();
                Node stuIdNode = atrrMap.getNamedItem("学号");
                String stuId = stuIdNode.getNodeValue();
                NodeList nameNodes =student.getElementsByTagName("姓名");
                Element nameNode=(Element) nameNodes.item(0);
                String name=nameNode.getFirstChild().getNodeValue();
                System.out.println("学号："+stuId+"，姓名："+name);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
