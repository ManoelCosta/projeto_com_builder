import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ASCIIConverter extends TextConverter{
    @Override
    public String convertCharacter(String s) {
        return "CHAR ASCII";
    }

    @Override
    public String convertFontChange(String s) {
        return "FONT ASCII";
    }

    @Override
    public String convertParagraph(String s) {
        return "PARAGRAPH ASCII";
    }
}
