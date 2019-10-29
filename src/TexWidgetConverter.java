public class TexWidgetConverter extends TextConverter{
    @Override
    public String convertCharacter(String s) {
        return "CHAR TexWidget";
    }

    @Override
    public String convertFontChange(String s) {
        return "FONT TexWidget";
    }

    @Override
    public String convertParagraph(String s) {
        return "PARAGRAPH TexWidget";
    }
}
