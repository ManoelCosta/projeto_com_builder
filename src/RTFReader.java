import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class RTFReader {
    private TextConverter builder;

    public RTFReader(TextConverter builder){
        this.builder = builder;
    }

    public void setBuilder(TextConverter builder) {
        this.builder = builder;
    }

    public String parseRTF(String texto){
        String saida = "";
        String[] tokens = texto.split(" ");
        for (String t : tokens){
            switch (t){
                case "char":
                    builder.convertCharacter(t);
                    break;
                case "font":
                    builder.convertFontChange(t);
                    break;
                case "para":
                    builder.convertParagraph(t);
                    break;
            }
        }
        return saida;
    }
}
