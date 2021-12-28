package Calculator;

public enum Type {
    ROMAN("I?[XV]|V?II?I?"),
    ARABIAN("[1-9]|10");

    String value;

    Type(String s) {
        this.value = s;
    }

    String getValue() {
        return this.value;
    }
}

