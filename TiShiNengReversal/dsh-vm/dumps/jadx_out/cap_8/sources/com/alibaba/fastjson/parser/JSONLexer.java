package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface JSONLexer {
    public static final int ARRAY = 2;
    public static final int END = 4;
    public static final char EOI = 26;
    public static final int NOT_MATCH = -1;
    public static final int NOT_MATCH_NAME = -2;
    public static final int OBJECT = 1;
    public static final int UNKNOWN = 0;
    public static final int VALUE = 3;
    public static final int VALUE_NULL = 5;

    byte[] bytesValue();

    void close();

    void config(com.alibaba.fastjson.parser.Feature r1, boolean r2);

    java.lang.Number decimalValue(boolean r1);

    java.math.BigDecimal decimalValue();

    float floatValue();

    char getCurrent();

    java.util.Locale getLocale();

    java.util.TimeZone getTimeZone();

    java.lang.String info();

    int intValue();

    java.lang.Number integerValue();

    boolean isBlankInput();

    boolean isEnabled(int r1);

    boolean isEnabled(com.alibaba.fastjson.parser.Feature r1);

    boolean isRef();

    long longValue();

    char next();

    void nextToken();

    void nextToken(int r1);

    void nextTokenWithColon();

    void nextTokenWithColon(int r1);

    java.lang.String numberString();

    int pos();

    void resetStringPosition();

    boolean scanBoolean(char r1);

    double scanDouble(char r1);

    java.lang.Enum<?> scanEnum(java.lang.Class<?> r1, com.alibaba.fastjson.parser.SymbolTable r2, char r3);

    float scanFloat(char r1);

    int scanInt(char r1);

    long scanLong(char r1);

    void scanNumber();

    java.lang.String scanString(char r1);

    void scanString();

    void scanStringArray(java.util.Collection<java.lang.String> r1, char r2);

    java.lang.String scanSymbol(com.alibaba.fastjson.parser.SymbolTable r1);

    java.lang.String scanSymbol(com.alibaba.fastjson.parser.SymbolTable r1, char r2);

    java.lang.String scanSymbolUnQuoted(com.alibaba.fastjson.parser.SymbolTable r1);

    java.lang.String scanSymbolWithSeperator(com.alibaba.fastjson.parser.SymbolTable r1, char r2);

    void setLocale(java.util.Locale r1);

    void setTimeZone(java.util.TimeZone r1);

    void skipWhitespace();

    java.lang.String stringVal();

    int token();

    java.lang.String tokenName();
}
