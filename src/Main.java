import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, SAXException {
        XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
        gestionContenido gestor = new gestionContenido();
        procesadorXML.setContentHandler(gestor);
        InputSource fileXML = new InputSource("factura.xml");
        procesadorXML.parse(fileXML);
    }
}