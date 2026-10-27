package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JSON implements com.alibaba.fastjson.JSONStreamAware, com.alibaba.fastjson.JSONAware {
    public static int DEFAULT_GENERATE_FEATURE = 0;
    public static int DEFAULT_PARSER_FEATURE = 0;
    public static java.lang.String DEFAULT_TYPE_KEY = null;
    public static java.lang.String DEFFAULT_DATE_FORMAT = null;
    public static final java.lang.String VERSION = "1.2.33";
    private static final java.lang.ThreadLocal<byte[]> bytesLocal = null;
    private static final java.lang.ThreadLocal<char[]> charsLocal = null;
    public static java.util.Locale defaultLocale;
    public static java.util.TimeZone defaultTimeZone;
    static final com.alibaba.fastjson.serializer.SerializeFilter[] emptyFilters = null;

    static {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            com.alibaba.fastjson.JSON.defaultTimeZone = r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            com.alibaba.fastjson.JSON.defaultLocale = r0
            java.lang.String r0 = "@type"
            com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY = r0
            r0 = 0
            com.alibaba.fastjson.serializer.SerializeFilter[] r0 = new com.alibaba.fastjson.serializer.SerializeFilter[r0]
            com.alibaba.fastjson.JSON.emptyFilters = r0
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT = r0
            com.alibaba.fastjson.parser.Feature r0 = com.alibaba.fastjson.parser.Feature.AutoCloseSource
            int r0 = r0.getMask()
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.InternFieldNames
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.UseBigDecimal
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.AllowUnQuotedFieldNames
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.AllowSingleQuotes
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.SortFeidFastMatch
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.IgnoreNotMatch
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE = r0
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames
            int r0 = r0.getMask()
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName
            int r1 = r1.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.SortField
            int r1 = r1.getMask()
            r0 = r0 | r1
            java.lang.String r1 = "fastjson.serializerFeatures.MapSortField"
            java.lang.String r1 = com.alibaba.fastjson.util.IOUtils.getStringProperty(r1)
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.MapSortField
            int r2 = r2.getMask()
            java.lang.String r3 = "true"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L83
            r0 = r0 | r2
            goto L8d
        L83:
            java.lang.String r3 = "false"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L8d
            int r1 = ~r2
            r0 = r0 & r1
        L8d:
            com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.JSON.bytesLocal = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson.JSON.charsLocal = r0
            return
    }

    public JSON() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] allocateBytes(int r2) {
            java.lang.ThreadLocal<byte[]> r0 = com.alibaba.fastjson.JSON.bytesLocal
            java.lang.Object r1 = r0.get()
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L17
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r2 > r1) goto L14
            byte[] r2 = new byte[r1]
            r0.set(r2)
            return r2
        L14:
            byte[] r2 = new byte[r2]
            return r2
        L17:
            int r0 = r1.length
            if (r0 >= r2) goto L1d
            byte[] r2 = new byte[r2]
            return r2
        L1d:
            return r1
    }

    private static char[] allocateChars(int r2) {
            java.lang.ThreadLocal<char[]> r0 = com.alibaba.fastjson.JSON.charsLocal
            java.lang.Object r1 = r0.get()
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L17
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r2 > r1) goto L14
            char[] r2 = new char[r1]
            r0.set(r2)
            return r2
        L14:
            char[] r2 = new char[r2]
            return r2
        L17:
            int r0 = r1.length
            if (r0 >= r2) goto L1d
            char[] r2 = new char[r2]
            return r2
        L1d:
            return r1
    }

    public static <T> void handleResovleTask(com.alibaba.fastjson.parser.DefaultJSONParser r0, T r1) {
            r0.handleResovleTask(r1)
            return
    }

    public static java.lang.Object parse(java.lang.String r1) {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            java.lang.Object r1 = parse(r1, r0)
            return r1
    }

    public static java.lang.Object parse(java.lang.String r2, int r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.alibaba.fastjson.parser.DefaultJSONParser r0 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r1 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r0.<init>(r2, r1, r3)
            java.lang.Object r2 = r0.parse()
            r0.handleResovleTask(r2)
            r0.close()
            return r2
    }

    public static java.lang.Object parse(java.lang.String r5, com.alibaba.fastjson.parser.Feature... r6) {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            int r1 = r6.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r6[r2]
            r4 = 1
            int r0 = com.alibaba.fastjson.parser.Feature.config(r0, r3, r4)
            int r2 = r2 + 1
            goto L4
        L10:
            java.lang.Object r5 = parse(r5, r0)
            return r5
    }

    public static java.lang.Object parse(byte[] r4, int r5, int r6, java.nio.charset.CharsetDecoder r7, int r8) {
            r7.reset()
            double r0 = (double) r6
            float r2 = r7.maxCharsPerByte()
            double r2 = (double) r2
            double r0 = r0 * r2
            int r0 = (int) r0
            char[] r0 = allocateChars(r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4, r5, r6)
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r0)
            com.alibaba.fastjson.util.IOUtils.decode(r7, r4, r5)
            int r4 = r5.position()
            com.alibaba.fastjson.parser.DefaultJSONParser r5 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r5.<init>(r0, r4, r6, r8)
            java.lang.Object r4 = r5.parse()
            r5.handleResovleTask(r4)
            r5.close()
            return r4
    }

    public static java.lang.Object parse(byte[] r5, int r6, int r7, java.nio.charset.CharsetDecoder r8, com.alibaba.fastjson.parser.Feature... r9) {
            if (r5 == 0) goto L1b
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L1b
        L6:
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            int r1 = r9.length
            r2 = 0
        La:
            if (r2 >= r1) goto L16
            r3 = r9[r2]
            r4 = 1
            int r0 = com.alibaba.fastjson.parser.Feature.config(r0, r3, r4)
            int r2 = r2 + 1
            goto La
        L16:
            java.lang.Object r5 = parse(r5, r6, r7, r8, r0)
            return r5
        L1b:
            r5 = 0
            return r5
    }

    public static java.lang.Object parse(byte[] r3, com.alibaba.fastjson.parser.Feature... r4) {
            int r0 = r3.length
            char[] r0 = allocateChars(r0)
            int r1 = r3.length
            r2 = 0
            int r3 = com.alibaba.fastjson.util.IOUtils.decodeUTF8(r3, r2, r1, r0)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0, r2, r3)
            java.lang.Object r3 = parse(r1, r4)
            return r3
    }

    public static com.alibaba.fastjson.JSONArray parseArray(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson.parser.DefaultJSONParser r1 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r1.<init>(r4, r2)
            com.alibaba.fastjson.parser.JSONLexer r4 = r1.lexer
            int r2 = r4.token()
            r3 = 8
            if (r2 != r3) goto L1b
            r4.nextToken()
            goto L2f
        L1b:
            int r4 = r4.token()
            r2 = 20
            if (r4 != r2) goto L24
            goto L2f
        L24:
            com.alibaba.fastjson.JSONArray r0 = new com.alibaba.fastjson.JSONArray
            r0.<init>()
            r1.parseArray(r0)
            r1.handleResovleTask(r0)
        L2f:
            r1.close()
            return r0
    }

    public static <T> java.util.List<T> parseArray(java.lang.String r4, java.lang.Class<T> r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson.parser.DefaultJSONParser r1 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r1.<init>(r4, r2)
            com.alibaba.fastjson.parser.JSONLexer r4 = r1.lexer
            int r2 = r4.token()
            r3 = 8
            if (r2 != r3) goto L1b
            r4.nextToken()
            goto L31
        L1b:
            r3 = 20
            if (r2 != r3) goto L26
            boolean r4 = r4.isBlankInput()
            if (r4 == 0) goto L26
            goto L31
        L26:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.parseArray(r5, r0)
            r1.handleResovleTask(r0)
        L31:
            r1.close()
            return r0
    }

    public static java.util.List<java.lang.Object> parseArray(java.lang.String r3, java.lang.reflect.Type[] r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson.parser.DefaultJSONParser r1 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r1.<init>(r3, r2)
            java.lang.Object[] r3 = r1.parseArray(r4)
            if (r3 != 0) goto L14
            goto L18
        L14:
            java.util.List r0 = java.util.Arrays.asList(r3)
        L18:
            r1.handleResovleTask(r0)
            r1.close()
            return r0
    }

    public static com.alibaba.fastjson.JSONObject parseObject(java.lang.String r1) {
            java.lang.Object r1 = parse(r1)
            boolean r0 = r1 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto Lb
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            return r1
        Lb:
            java.lang.Object r1 = toJSON(r1)
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            return r1
    }

    public static com.alibaba.fastjson.JSONObject parseObject(java.lang.String r0, com.alibaba.fastjson.parser.Feature... r1) {
            java.lang.Object r0 = parse(r0, r1)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
    }

    public static <T> T parseObject(java.io.InputStream r1, java.lang.reflect.Type r2, com.alibaba.fastjson.parser.Feature... r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = com.alibaba.fastjson.util.IOUtils.UTF8
            java.lang.Object r1 = parseObject(r1, r0, r2, r3)
            return r1
    }

    public static <T> T parseObject(java.io.InputStream r6, java.nio.charset.Charset r7, java.lang.reflect.Type r8, com.alibaba.fastjson.parser.Feature... r9) throws java.io.IOException {
            if (r7 != 0) goto L4
            java.nio.charset.Charset r7 = com.alibaba.fastjson.util.IOUtils.UTF8
        L4:
            r3 = r7
            r7 = 65536(0x10000, float:9.1835E-41)
            byte[] r7 = allocateBytes(r7)
            r0 = 0
            r2 = 0
        Ld:
            int r1 = r7.length
            int r1 = r1 - r2
            int r1 = r6.read(r7, r2, r1)
            r4 = -1
            if (r1 != r4) goto L1f
            r1 = 0
            r0 = r7
            r4 = r8
            r5 = r9
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
        L1f:
            r4 = r8
            r5 = r9
            int r2 = r2 + r1
            int r8 = r7.length
            if (r2 != r8) goto L31
            int r8 = r7.length
            int r8 = r8 * 3
            int r8 = r8 / 2
            byte[] r8 = new byte[r8]
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r0, r8, r0, r9)
            r7 = r8
        L31:
            r8 = r4
            r9 = r5
            goto Ld
    }

    public static <T> T parseObject(java.lang.String r2, com.alibaba.fastjson.TypeReference<T> r3, com.alibaba.fastjson.parser.Feature... r4) {
            java.lang.reflect.Type r3 = r3.type
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.global
            int r1 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            java.lang.Object r2 = parseObject(r2, r3, r0, r1, r4)
            return r2
    }

    public static <T> T parseObject(java.lang.String r1, java.lang.Class<T> r2) {
            r0 = 0
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r0]
            java.lang.Object r1 = parseObject(r1, r2, r0)
            return r1
    }

    public static <T> T parseObject(java.lang.String r6, java.lang.Class<T> r7, com.alibaba.fastjson.parser.deserializer.ParseProcess r8, com.alibaba.fastjson.parser.Feature... r9) {
            com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.parser.ParserConfig.global
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r0 = r6
            r1 = r7
            r3 = r8
            r5 = r9
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T parseObject(java.lang.String r6, java.lang.Class<T> r7, com.alibaba.fastjson.parser.Feature... r8) {
            com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.parser.ParserConfig.global
            r3 = 0
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r0 = r6
            r1 = r7
            r5 = r8
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T parseObject(java.lang.String r4, java.lang.reflect.Type r5, int r6, com.alibaba.fastjson.parser.Feature... r7) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r7.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L12
            r2 = r7[r1]
            r3 = 1
            int r6 = com.alibaba.fastjson.parser.Feature.config(r6, r2, r3)
            int r1 = r1 + 1
            goto L6
        L12:
            com.alibaba.fastjson.parser.DefaultJSONParser r7 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r7.<init>(r4, r0, r6)
            java.lang.Object r4 = r7.parseObject(r5)
            r7.handleResovleTask(r4)
            r7.close()
            return r4
    }

    public static <T> T parseObject(java.lang.String r6, java.lang.reflect.Type r7, com.alibaba.fastjson.parser.ParserConfig r8, int r9, com.alibaba.fastjson.parser.Feature... r10) {
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T parseObject(java.lang.String r4, java.lang.reflect.Type r5, com.alibaba.fastjson.parser.ParserConfig r6, com.alibaba.fastjson.parser.deserializer.ParseProcess r7, int r8, com.alibaba.fastjson.parser.Feature... r9) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            if (r9 == 0) goto L12
            int r1 = r9.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r9[r2]
            int r3 = r3.mask
            r8 = r8 | r3
            int r2 = r2 + 1
            goto L8
        L12:
            com.alibaba.fastjson.parser.DefaultJSONParser r9 = new com.alibaba.fastjson.parser.DefaultJSONParser
            r9.<init>(r4, r6, r8)
            if (r7 == 0) goto L3e
            boolean r4 = r7 instanceof com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider
            if (r4 == 0) goto L27
            java.util.List r4 = r9.getExtraTypeProviders()
            r6 = r7
            com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider r6 = (com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider) r6
            r4.add(r6)
        L27:
            boolean r4 = r7 instanceof com.alibaba.fastjson.parser.deserializer.ExtraProcessor
            if (r4 == 0) goto L35
            java.util.List r4 = r9.getExtraProcessors()
            r6 = r7
            com.alibaba.fastjson.parser.deserializer.ExtraProcessor r6 = (com.alibaba.fastjson.parser.deserializer.ExtraProcessor) r6
            r4.add(r6)
        L35:
            boolean r4 = r7 instanceof com.alibaba.fastjson.parser.deserializer.FieldTypeResolver
            if (r4 == 0) goto L3e
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r7 = (com.alibaba.fastjson.parser.deserializer.FieldTypeResolver) r7
            r9.setFieldTypeResolver(r7)
        L3e:
            java.lang.Object r4 = r9.parseObject(r5, r0)
            r9.handleResovleTask(r4)
            r9.close()
            return r4
    }

    public static <T> T parseObject(java.lang.String r6, java.lang.reflect.Type r7, com.alibaba.fastjson.parser.ParserConfig r8, com.alibaba.fastjson.parser.Feature... r9) {
            r3 = 0
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T parseObject(java.lang.String r6, java.lang.reflect.Type r7, com.alibaba.fastjson.parser.deserializer.ParseProcess r8, com.alibaba.fastjson.parser.Feature... r9) {
            com.alibaba.fastjson.parser.ParserConfig r2 = com.alibaba.fastjson.parser.ParserConfig.global
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r0 = r6
            r1 = r7
            r3 = r8
            r5 = r9
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T parseObject(java.lang.String r2, java.lang.reflect.Type r3, com.alibaba.fastjson.parser.Feature... r4) {
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.global
            int r1 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            java.lang.Object r2 = parseObject(r2, r3, r0, r1, r4)
            return r2
    }

    public static <T> T parseObject(byte[] r1, int r2, int r3, java.nio.charset.Charset r4, java.lang.reflect.Type r5, com.alibaba.fastjson.parser.Feature... r6) {
            if (r4 != 0) goto L4
            java.nio.charset.Charset r4 = com.alibaba.fastjson.util.IOUtils.UTF8
        L4:
            java.nio.charset.Charset r0 = com.alibaba.fastjson.util.IOUtils.UTF8
            if (r4 != r0) goto L18
            int r4 = r1.length
            char[] r4 = allocateChars(r4)
            int r1 = com.alibaba.fastjson.util.IOUtils.decodeUTF8(r1, r2, r3, r4)
            java.lang.String r2 = new java.lang.String
            r3 = 0
            r2.<init>(r4, r3, r1)
            goto L1e
        L18:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3, r4)
            r2 = r0
        L1e:
            java.lang.Object r1 = parseObject(r2, r5, r6)
            return r1
    }

    public static <T> T parseObject(byte[] r4, int r5, int r6, java.nio.charset.CharsetDecoder r7, java.lang.reflect.Type r8, com.alibaba.fastjson.parser.Feature... r9) {
            r7.reset()
            double r0 = (double) r6
            float r2 = r7.maxCharsPerByte()
            double r2 = (double) r2
            double r0 = r0 * r2
            int r0 = (int) r0
            char[] r0 = allocateChars(r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4, r5, r6)
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r0)
            com.alibaba.fastjson.util.IOUtils.decode(r7, r4, r5)
            int r4 = r5.position()
            java.lang.Object r4 = parseObject(r0, r4, r8, r9)
            return r4
    }

    public static <T> T parseObject(byte[] r6, java.lang.reflect.Type r7, com.alibaba.fastjson.parser.Feature... r8) {
            int r2 = r6.length
            java.nio.charset.Charset r3 = com.alibaba.fastjson.util.IOUtils.UTF8
            r1 = 0
            r0 = r6
            r4 = r7
            r5 = r8
            java.lang.Object r6 = parseObject(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T parseObject(char[] r5, int r6, java.lang.reflect.Type r7, com.alibaba.fastjson.parser.Feature... r8) {
            if (r5 == 0) goto L2a
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L2a
        L6:
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            int r1 = r8.length
            r2 = 0
        La:
            if (r2 >= r1) goto L16
            r3 = r8[r2]
            r4 = 1
            int r0 = com.alibaba.fastjson.parser.Feature.config(r0, r3, r4)
            int r2 = r2 + 1
            goto La
        L16:
            com.alibaba.fastjson.parser.DefaultJSONParser r8 = new com.alibaba.fastjson.parser.DefaultJSONParser
            com.alibaba.fastjson.parser.ParserConfig r1 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r8.<init>(r5, r6, r1, r0)
            java.lang.Object r5 = r8.parseObject(r7)
            r8.handleResovleTask(r5)
            r8.close()
            return r5
        L2a:
            r5 = 0
            return r5
    }

    public static void setDefaultTypeKey(java.lang.String r4) {
            com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY = r4
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.global
            com.alibaba.fastjson.parser.SymbolTable r0 = r0.symbolTable
            int r1 = r4.length()
            int r2 = r4.hashCode()
            r3 = 0
            r0.addSymbol(r4, r3, r1, r2)
            return
    }

    public static java.lang.Object toJSON(java.lang.Object r1) {
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            java.lang.Object r1 = toJSON(r1, r0)
            return r1
    }

    public static java.lang.Object toJSON(java.lang.Object r0, com.alibaba.fastjson.parser.ParserConfig r1) {
            com.alibaba.fastjson.serializer.SerializeConfig r1 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            java.lang.Object r0 = toJSON(r0, r1)
            return r0
    }

    public static java.lang.Object toJSON(java.lang.Object r3, com.alibaba.fastjson.serializer.SerializeConfig r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r3 instanceof com.alibaba.fastjson.JSON
            if (r0 == 0) goto L9
            return r3
        L9:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L41
            java.util.Map r3 = (java.util.Map) r3
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            int r0 = r3.size()
            r4.<init>(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = com.alibaba.fastjson.util.TypeUtils.castToString(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = toJSON(r0)
            r4.put2(r1, r0)
            goto L20
        L40:
            return r4
        L41:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L67
            java.util.Collection r3 = (java.util.Collection) r3
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            int r0 = r3.size()
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = toJSON(r0)
            r4.add(r0)
            goto L54
        L66:
            return r4
        L67:
            java.lang.Class r0 = r3.getClass()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L78
            java.lang.Enum r3 = (java.lang.Enum) r3
            java.lang.String r3 = r3.name()
            return r3
        L78:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L99
            int r4 = java.lang.reflect.Array.getLength(r3)
            com.alibaba.fastjson.JSONArray r0 = new com.alibaba.fastjson.JSONArray
            r0.<init>(r4)
            r1 = 0
        L88:
            if (r1 >= r4) goto L98
            java.lang.Object r2 = java.lang.reflect.Array.get(r3, r1)
            java.lang.Object r2 = toJSON(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L88
        L98:
            return r0
        L99:
            boolean r1 = com.alibaba.fastjson.parser.ParserConfig.isPrimitive2(r0)
            if (r1 == 0) goto La0
            return r3
        La0:
            com.alibaba.fastjson.serializer.ObjectSerializer r4 = r4.getObjectWriter(r0)
            boolean r0 = r4 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r0 == 0) goto Le3
            com.alibaba.fastjson.serializer.JavaBeanSerializer r4 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r4
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.util.Map r3 = r4.getFieldValuesMap(r3)     // Catch: java.lang.Exception -> Lda
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Exception -> Lda
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Lda
        Lbb:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Ld9
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> Lda
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Exception -> Lda
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Exception -> Lda
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lda
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> Lda
            java.lang.Object r4 = toJSON(r4)     // Catch: java.lang.Exception -> Lda
            r0.put2(r1, r4)     // Catch: java.lang.Exception -> Lda
            goto Lbb
        Ld9:
            return r0
        Lda:
            r3 = move-exception
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "toJSON error"
            r4.<init>(r0, r3)
            throw r4
        Le3:
            java.lang.String r3 = toJSONString(r3)
            java.lang.Object r3 = parse(r3)
            return r3
    }

    public static byte[] toJSONBytes(java.lang.Object r1, int r2, com.alibaba.fastjson.serializer.SerializerFeature... r3) {
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            byte[] r1 = toJSONBytes(r1, r0, r2, r3)
            return r1
    }

    public static byte[] toJSONBytes(java.lang.Object r2, com.alibaba.fastjson.serializer.SerializeConfig r3, int r4, com.alibaba.fastjson.serializer.SerializerFeature... r5) {
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r1 = 0
            r0.<init>(r1, r4, r5)
            com.alibaba.fastjson.serializer.JSONSerializer r4 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L18
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L18
            r4.write(r2)     // Catch: java.lang.Throwable -> L18
            java.nio.charset.Charset r2 = com.alibaba.fastjson.util.IOUtils.UTF8     // Catch: java.lang.Throwable -> L18
            byte[] r2 = r0.toBytes(r2)     // Catch: java.lang.Throwable -> L18
            r0.close()
            return r2
        L18:
            r2 = move-exception
            r0.close()
            throw r2
    }

    public static byte[] toJSONBytes(java.lang.Object r1, com.alibaba.fastjson.serializer.SerializeConfig r2, com.alibaba.fastjson.serializer.SerializerFeature... r3) {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            byte[] r1 = toJSONBytes(r1, r2, r0, r3)
            return r1
    }

    public static byte[] toJSONBytes(java.lang.Object r1, com.alibaba.fastjson.serializer.SerializerFeature... r2) {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            byte[] r1 = toJSONBytes(r1, r0, r2)
            return r1
    }

    public static java.lang.String toJSONString(java.lang.Object r2) {
            com.alibaba.fastjson.serializer.SerializeFilter[] r0 = com.alibaba.fastjson.JSON.emptyFilters
            r1 = 0
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = new com.alibaba.fastjson.serializer.SerializerFeature[r1]
            java.lang.String r2 = toJSONString(r2, r0, r1)
            return r2
    }

    public static java.lang.String toJSONString(java.lang.Object r2, int r3, com.alibaba.fastjson.serializer.SerializerFeature... r4) {
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r1 = 0
            r0.<init>(r1, r3, r4)
            com.alibaba.fastjson.serializer.JSONSerializer r3 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L16
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r3.write(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L16
            r0.close()
            return r2
        L16:
            r2 = move-exception
            r0.close()
            throw r2
    }

    public static java.lang.String toJSONString(java.lang.Object r7, com.alibaba.fastjson.serializer.SerializeConfig r8, com.alibaba.fastjson.serializer.SerializeFilter r9, com.alibaba.fastjson.serializer.SerializerFeature... r10) {
            r0 = 1
            com.alibaba.fastjson.serializer.SerializeFilter[] r3 = new com.alibaba.fastjson.serializer.SerializeFilter[r0]
            r0 = 0
            r3[r0] = r9
            r4 = 0
            int r5 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            r1 = r7
            r2 = r8
            r6 = r10
            java.lang.String r7 = toJSONString(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String toJSONString(java.lang.Object r2, com.alibaba.fastjson.serializer.SerializeConfig r3, com.alibaba.fastjson.serializer.SerializeFilter[] r4, java.lang.String r5, int r6, com.alibaba.fastjson.serializer.SerializerFeature... r7) {
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r1 = 0
            r0.<init>(r1, r6, r7)
            com.alibaba.fastjson.serializer.JSONSerializer r6 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L1d
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1f
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1f
            r6.setDateFormat(r5)     // Catch: java.lang.Throwable -> L1d
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat     // Catch: java.lang.Throwable -> L1d
            r5 = 1
            r6.config(r3, r5)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L38
        L1f:
            if (r4 == 0) goto L2d
            int r3 = r4.length     // Catch: java.lang.Throwable -> L1d
            r5 = 0
        L23:
            if (r5 >= r3) goto L2d
            r7 = r4[r5]     // Catch: java.lang.Throwable -> L1d
            r6.addFilter(r7)     // Catch: java.lang.Throwable -> L1d
            int r5 = r5 + 1
            goto L23
        L2d:
            r6.write(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r0.close()
            return r2
        L38:
            r0.close()
            throw r2
    }

    public static java.lang.String toJSONString(java.lang.Object r6, com.alibaba.fastjson.serializer.SerializeConfig r7, com.alibaba.fastjson.serializer.SerializeFilter[] r8, com.alibaba.fastjson.serializer.SerializerFeature... r9) {
            r3 = 0
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            java.lang.String r6 = toJSONString(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String toJSONString(java.lang.Object r1, com.alibaba.fastjson.serializer.SerializeConfig r2, com.alibaba.fastjson.serializer.SerializerFeature... r3) {
            r0 = 0
            java.lang.String r1 = toJSONString(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String toJSONString(java.lang.Object r6, com.alibaba.fastjson.serializer.SerializeFilter r7, com.alibaba.fastjson.serializer.SerializerFeature... r8) {
            com.alibaba.fastjson.serializer.SerializeConfig r1 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            r0 = 1
            com.alibaba.fastjson.serializer.SerializeFilter[] r2 = new com.alibaba.fastjson.serializer.SerializeFilter[r0]
            r0 = 0
            r2[r0] = r7
            r3 = 0
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            r0 = r6
            r5 = r8
            java.lang.String r6 = toJSONString(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String toJSONString(java.lang.Object r2, boolean r3) {
            if (r3 != 0) goto L7
            java.lang.String r2 = toJSONString(r2)
            return r2
        L7:
            r3 = 1
            com.alibaba.fastjson.serializer.SerializerFeature[] r3 = new com.alibaba.fastjson.serializer.SerializerFeature[r3]
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat
            r1 = 0
            r3[r1] = r0
            java.lang.String r2 = toJSONString(r2, r3)
            return r2
    }

    public static java.lang.String toJSONString(java.lang.Object r6, com.alibaba.fastjson.serializer.SerializeFilter[] r7, com.alibaba.fastjson.serializer.SerializerFeature... r8) {
            com.alibaba.fastjson.serializer.SerializeConfig r1 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            r3 = 0
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            r0 = r6
            r2 = r7
            r5 = r8
            java.lang.String r6 = toJSONString(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String toJSONString(java.lang.Object r1, com.alibaba.fastjson.serializer.SerializerFeature... r2) {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            java.lang.String r1 = toJSONString(r1, r0, r2)
            return r1
    }

    public static java.lang.String toJSONStringWithDateFormat(java.lang.Object r6, java.lang.String r7, com.alibaba.fastjson.serializer.SerializerFeature... r8) {
            com.alibaba.fastjson.serializer.SerializeConfig r1 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            r2 = 0
            int r4 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            r0 = r6
            r3 = r7
            r5 = r8
            java.lang.String r6 = toJSONString(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String toJSONStringZ(java.lang.Object r6, com.alibaba.fastjson.serializer.SerializeConfig r7, com.alibaba.fastjson.serializer.SerializerFeature... r8) {
            com.alibaba.fastjson.serializer.SerializeFilter[] r2 = com.alibaba.fastjson.JSON.emptyFilters
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r5 = r8
            java.lang.String r6 = toJSONString(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static <T> T toJavaObject(com.alibaba.fastjson.JSON r1, java.lang.Class<T> r2) {
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r1 = com.alibaba.fastjson.util.TypeUtils.cast(r1, r2, r0)
            return r1
    }

    public static final int writeJSONString(java.io.OutputStream r8, java.lang.Object r9, int r10, com.alibaba.fastjson.serializer.SerializerFeature... r11) throws java.io.IOException {
            java.nio.charset.Charset r1 = com.alibaba.fastjson.util.IOUtils.UTF8
            com.alibaba.fastjson.serializer.SerializeConfig r3 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r6 = r10
            r7 = r11
            int r8 = writeJSONString(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static final int writeJSONString(java.io.OutputStream r1, java.lang.Object r2, com.alibaba.fastjson.serializer.SerializerFeature... r3) throws java.io.IOException {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            int r1 = writeJSONString(r1, r2, r0, r3)
            return r1
    }

    public static final int writeJSONString(java.io.OutputStream r2, java.nio.charset.Charset r3, java.lang.Object r4, com.alibaba.fastjson.serializer.SerializeConfig r5, com.alibaba.fastjson.serializer.SerializeFilter[] r6, java.lang.String r7, int r8, com.alibaba.fastjson.serializer.SerializerFeature... r9) throws java.io.IOException {
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r1 = 0
            r0.<init>(r1, r8, r9)
            com.alibaba.fastjson.serializer.JSONSerializer r8 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r0, r5)     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L1f
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1f
            r8.setDateFormat(r7)     // Catch: java.lang.Throwable -> L1d
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat     // Catch: java.lang.Throwable -> L1d
            r7 = 1
            r8.config(r5, r7)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L38
        L1f:
            if (r6 == 0) goto L2d
            int r5 = r6.length     // Catch: java.lang.Throwable -> L1d
            r7 = 0
        L23:
            if (r7 >= r5) goto L2d
            r9 = r6[r7]     // Catch: java.lang.Throwable -> L1d
            r8.addFilter(r9)     // Catch: java.lang.Throwable -> L1d
            int r7 = r7 + 1
            goto L23
        L2d:
            r8.write(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.writeToEx(r2, r3)     // Catch: java.lang.Throwable -> L1d
            r0.close()
            return r2
        L38:
            r0.close()
            throw r2
    }

    public static final int writeJSONString(java.io.OutputStream r8, java.nio.charset.Charset r9, java.lang.Object r10, com.alibaba.fastjson.serializer.SerializerFeature... r11) throws java.io.IOException {
            com.alibaba.fastjson.serializer.SerializeConfig r3 = com.alibaba.fastjson.serializer.SerializeConfig.globalInstance
            r5 = 0
            int r6 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r7 = r11
            int r8 = writeJSONString(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static void writeJSONString(java.io.Writer r1, java.lang.Object r2, int r3, com.alibaba.fastjson.serializer.SerializerFeature... r4) {
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>(r1, r3, r4)
            com.alibaba.fastjson.serializer.JSONSerializer r1 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L11
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r1.write(r2)     // Catch: java.lang.Throwable -> L11
            r0.close()
            return
        L11:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public static void writeJSONString(java.io.Writer r1, java.lang.Object r2, com.alibaba.fastjson.serializer.SerializerFeature... r3) {
            int r0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE
            writeJSONString(r1, r2, r0, r3)
            return
    }

    public static void writeJSONStringTo(java.lang.Object r0, java.io.Writer r1, com.alibaba.fastjson.serializer.SerializerFeature... r2) {
            writeJSONString(r1, r0, r2)
            return
    }

    @Override // com.alibaba.fastjson.JSONAware
    public java.lang.String toJSONString() {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>()
            com.alibaba.fastjson.serializer.JSONSerializer r1 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r1.write(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L15
            r0.close()
            return r1
        L15:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public <T> T toJavaObject(com.alibaba.fastjson.TypeReference r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.reflect.Type r2 = r2.getType()
            goto L8
        L7:
            r2 = 0
        L8:
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.cast(r1, r2, r0)
            return r2
    }

    public <T> T toJavaObject(java.lang.Class<T> r2) {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.cast(r1, r2, r0)
            return r2
    }

    public <T> T toJavaObject(java.lang.reflect.Type r2) {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            java.lang.Object r2 = com.alibaba.fastjson.util.TypeUtils.cast(r1, r2, r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toJSONString()
            return r0
    }

    @Override // com.alibaba.fastjson.JSONStreamAware
    public void writeJSONString(java.lang.Appendable r4) {
            r3 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>()
            com.alibaba.fastjson.serializer.JSONSerializer r1 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r1.write(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r4.append(r1)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r0.close()
            return
        L18:
            r4 = move-exception
            goto L25
        L1a:
            r4 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Throwable -> L18
        L25:
            r0.close()
            throw r4
    }
}
