import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class gestionContenido extends DefaultHandler{

    boolean booleanPreu;
    int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, total=0;
    public gestionContenido() {
        super();
    }
    public void startDocument() {
        System.out.println("Inici de la lectura del XML");
    }
    public void endDocument() {
        System.out.println("Final de la lectura del XML");
        System.out.println("\nEl valor total és: " + total);
        System.out.println("El valor més gran és el: " + max);
        System.out.println("El valor més petit és el: " + min);
    }
    public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
        if(nombre.equals("Precio")){
            booleanPreu = true;
        }
    }
    public void endElement(String uri, String nombre, String nombreC) {
        booleanPreu = false;
    }
    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
        String car = new String (ch, inicio, longitud);

        car = car.replaceAll("[\t\n]", "");
        if (booleanPreu == true){
            car = car.replaceAll("€", "");
            int Comparator = Integer.parseInt(car);

            if(max < Comparator){
                max = Comparator;
            }else if(min > Comparator){
                min = Comparator;
            }
            total += Comparator;
            System.out.println("\tPrecio: " + car + "€");
        }
    }

}