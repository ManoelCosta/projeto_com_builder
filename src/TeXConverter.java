public class TeXConverter extends TextConverter {
    @Override
    public String convertParagraph(String s) {
        return "CHAR TeX";
    }

    @Override
    public String convertFontChange(String s) {
        return "FONT TeX";
    }

    @Override
    public String convertCharacter(String s) {
        return "PARAGRAPH TeX";
    }
}
