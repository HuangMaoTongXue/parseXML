import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by huangmao on 2016/9/14.
 */
public class Run {
    public static void main(String[] args){
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File("student.xml"));
            Element root=document.getRootElement();
            List<Element> elements=root.elements();
            for (Element element:
                 elements) {
              while (element!=null)
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
