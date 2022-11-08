import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class gestionContenido extends DefaultHandler{

    public gestionContenido() {
        super();
    }
    public void startDocument() {
        System.out.println("Comienzo del Documento XML");
    }
    public void endDocument() {
        System.out.println("Final del Docmento XML");
    }
    public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
        System.out.println("\tPrincipio elemento:" + nombre);
    }
    public void endElement(String uri, String nombre, String nombreC) {
        System.out.println("\tFin Elemento: " + nombre);
    }
    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
        String car = new String (ch, inicio, longitud);
        car = car.replaceAll("[\t\n]", "");
        System.out.println("\tCaracteres: " + car);
    }

}