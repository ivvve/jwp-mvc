package core.mvc.param.extractor.simple;

public class StringParser implements Parser<String> {
    @Override
    public boolean isParsable(Class<?> clazz) {
        return clazz.equals(String.class);
    }

    @Override
    public String parse(String value) {
        return value;
    }
}
