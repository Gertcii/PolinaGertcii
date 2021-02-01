package homework8.entities.dto;

import java.util.Objects;

public class DataForText {
    private String text;
    private String lang;
    private String options;
    private String word;
    private String s;
    private String code;

    public String getText() {
        return text;
    }

    public String getLang() {
        return lang;
    }

    public String getOptions() {
        return options;
    }

    public String getWord() {
        return word;
    }

    public String getS() {
        return s;
    }

    public String getCode() {
        return code;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DataForText{" +
                "text='" + text + '\'' +
                ", lang='" + lang + '\'' +
                ", options='" + options + '\'' +
                ", word='" + word + '\'' +
                ", s=" + s +
                ", code='" + code + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataForText that = (DataForText) o;
        return Objects.equals(text, that.text) && Objects.equals(lang, that.lang) && Objects.equals(options, that.options) && Objects.equals(word, that.word) && Objects.equals(s, that.s) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, lang, options, word, s, code);
    }
}
