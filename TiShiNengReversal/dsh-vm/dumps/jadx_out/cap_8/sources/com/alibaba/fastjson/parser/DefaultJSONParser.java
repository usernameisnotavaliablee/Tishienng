package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DefaultJSONParser implements java.io.Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    private static final java.util.Set<java.lang.Class<?>> primitiveClasses = null;
    private java.lang.String[] autoTypeAccept;
    private boolean autoTypeEnable;
    protected com.alibaba.fastjson.parser.ParserConfig config;
    protected com.alibaba.fastjson.parser.ParseContext context;
    private com.alibaba.fastjson.parser.ParseContext[] contextArray;
    private int contextArrayIndex;
    private java.text.DateFormat dateFormat;
    private java.lang.String dateFormatPattern;
    private java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraProcessor> extraProcessors;
    private java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider> extraTypeProviders;
    protected com.alibaba.fastjson.parser.deserializer.FieldTypeResolver fieldTypeResolver;
    public final java.lang.Object input;
    protected transient com.alibaba.fastjson.serializer.BeanContext lastBeanContext;
    public final com.alibaba.fastjson.parser.JSONLexer lexer;
    public int resolveStatus;
    private java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask> resolveTaskList;
    public final com.alibaba.fastjson.parser.SymbolTable symbolTable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ResolveTask {
        public final com.alibaba.fastjson.parser.ParseContext context;
        public com.alibaba.fastjson.parser.deserializer.FieldDeserializer fieldDeserializer;
        public com.alibaba.fastjson.parser.ParseContext ownerContext;
        public final java.lang.String referenceValue;

        public ResolveTask(com.alibaba.fastjson.parser.ParseContext r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.referenceValue = r2
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.alibaba.fastjson.parser.DefaultJSONParser.primitiveClasses = r0
            r0 = 17
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r1[r2] = r3
            java.lang.Class r3 = java.lang.Byte.TYPE
            r4 = 1
            r1[r4] = r3
            java.lang.Class r3 = java.lang.Short.TYPE
            r4 = 2
            r1[r4] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r4 = 3
            r1[r4] = r3
            java.lang.Class r3 = java.lang.Long.TYPE
            r4 = 4
            r1[r4] = r3
            java.lang.Class r3 = java.lang.Float.TYPE
            r4 = 5
            r1[r4] = r3
            java.lang.Class r3 = java.lang.Double.TYPE
            r4 = 6
            r1[r4] = r3
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r4 = 7
            r1[r4] = r3
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            r4 = 8
            r1[r4] = r3
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            r4 = 9
            r1[r4] = r3
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            r4 = 10
            r1[r4] = r3
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            r4 = 11
            r1[r4] = r3
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            r4 = 12
            r1[r4] = r3
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            r4 = 13
            r1[r4] = r3
            java.lang.Class<java.math.BigInteger> r3 = java.math.BigInteger.class
            r4 = 14
            r1[r4] = r3
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            r4 = 15
            r1[r4] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 16
            r1[r4] = r3
        L69:
            if (r2 >= r0) goto L75
            r3 = r1[r2]
            java.util.Set<java.lang.Class<?>> r4 = com.alibaba.fastjson.parser.DefaultJSONParser.primitiveClasses
            r4.add(r3)
            int r2 = r2 + 1
            goto L69
        L75:
            return
    }

    public DefaultJSONParser(com.alibaba.fastjson.parser.JSONLexer r2) {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            r1.<init>(r2, r0)
            return
    }

    public DefaultJSONParser(com.alibaba.fastjson.parser.JSONLexer r2, com.alibaba.fastjson.parser.ParserConfig r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public DefaultJSONParser(java.lang.Object r2, com.alibaba.fastjson.parser.JSONLexer r3, com.alibaba.fastjson.parser.ParserConfig r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT
            r1.dateFormatPattern = r0
            r0 = 0
            r1.contextArrayIndex = r0
            r1.resolveStatus = r0
            r0 = 0
            r1.extraTypeProviders = r0
            r1.extraProcessors = r0
            r1.fieldTypeResolver = r0
            r1.autoTypeAccept = r0
            r1.lexer = r3
            r1.input = r2
            r1.config = r4
            com.alibaba.fastjson.parser.SymbolTable r2 = r4.symbolTable
            r1.symbolTable = r2
            char r2 = r3.getCurrent()
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 != r4) goto L31
            r3.next()
            com.alibaba.fastjson.parser.JSONLexerBase r3 = (com.alibaba.fastjson.parser.JSONLexerBase) r3
            r2 = 12
            r3.token = r2
            return
        L31:
            r4 = 91
            if (r2 != r4) goto L3f
            r3.next()
            com.alibaba.fastjson.parser.JSONLexerBase r3 = (com.alibaba.fastjson.parser.JSONLexerBase) r3
            r2 = 14
            r3.token = r2
            return
        L3f:
            r3.nextToken()
            return
    }

    public DefaultJSONParser(java.lang.String r3) {
            r2 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()
            int r1 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r2.<init>(r3, r0, r1)
            return
    }

    public DefaultJSONParser(java.lang.String r3, com.alibaba.fastjson.parser.ParserConfig r4) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            int r1 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE
            r0.<init>(r3, r1)
            r2.<init>(r3, r0, r4)
            return
    }

    public DefaultJSONParser(java.lang.String r2, com.alibaba.fastjson.parser.ParserConfig r3, int r4) {
            r1 = this;
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            r0.<init>(r2, r4)
            r1.<init>(r2, r0, r3)
            return
    }

    public DefaultJSONParser(char[] r2, int r3, com.alibaba.fastjson.parser.ParserConfig r4, int r5) {
            r1 = this;
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            r0.<init>(r2, r3, r5)
            r1.<init>(r2, r0, r4)
            return
    }

    private void addContext(com.alibaba.fastjson.parser.ParseContext r6) {
            r5 = this;
            int r0 = r5.contextArrayIndex
            int r1 = r0 + 1
            r5.contextArrayIndex = r1
            com.alibaba.fastjson.parser.ParseContext[] r1 = r5.contextArray
            if (r1 != 0) goto L11
            r1 = 8
            com.alibaba.fastjson.parser.ParseContext[] r1 = new com.alibaba.fastjson.parser.ParseContext[r1]
            r5.contextArray = r1
            goto L22
        L11:
            int r2 = r1.length
            if (r0 < r2) goto L22
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            com.alibaba.fastjson.parser.ParseContext[] r2 = new com.alibaba.fastjson.parser.ParseContext[r2]
            int r3 = r1.length
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            r5.contextArray = r2
        L22:
            com.alibaba.fastjson.parser.ParseContext[] r1 = r5.contextArray
            r1[r0] = r6
            return
    }

    public final void accept(int r5) {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            int r1 = r0.token()
            if (r1 != r5) goto Lc
            r0.nextToken()
            return
        Lc:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "syntax error, expect "
            r2.append(r3)
            java.lang.String r5 = com.alibaba.fastjson.parser.JSONToken.name(r5)
            r2.append(r5)
            java.lang.String r5 = ", actual "
            r2.append(r5)
            int r5 = r0.token()
            java.lang.String r5 = com.alibaba.fastjson.parser.JSONToken.name(r5)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    public final void accept(int r3, int r4) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r2.lexer
            int r1 = r0.token()
            if (r1 != r3) goto Lc
            r0.nextToken(r4)
            return
        Lc:
            r2.throwException(r3)
            return
    }

    public void acceptType(java.lang.String r5) {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            r0.nextTokenWithColon()
            int r1 = r0.token()
            r2 = 4
            java.lang.String r3 = "type not match error"
            if (r1 != r2) goto L2d
            java.lang.String r1 = r0.stringVal()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L27
            r0.nextToken()
            int r5 = r0.token()
            r1 = 16
            if (r5 != r1) goto L26
            r0.nextToken()
        L26:
            return
        L27:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r3)
            throw r5
        L2d:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            r5.<init>(r3)
            throw r5
    }

    public void addResolveTask(com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask r3) {
            r2 = this;
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r0 = r2.resolveTaskList
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.resolveTaskList = r0
        Lc:
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r0 = r2.resolveTaskList
            r0.add(r3)
            return
    }

    public void checkListResolve(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.resolveStatus
            r1 = 1
            if (r0 != r1) goto L36
            boolean r0 = r5 instanceof java.util.List
            r2 = 0
            if (r0 == 0) goto L24
            int r0 = r5.size()
            int r0 = r0 - r1
            java.util.List r5 = (java.util.List) r5
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r1 = r4.getLastResolveTask()
            com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer r3 = new com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer
            r3.<init>(r4, r5, r0)
            r1.fieldDeserializer = r3
            com.alibaba.fastjson.parser.ParseContext r5 = r4.context
            r1.ownerContext = r5
            r4.setResolveStatus(r2)
            return
        L24:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r0 = r4.getLastResolveTask()
            com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer r1 = new com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer
            r1.<init>(r5)
            r0.fieldDeserializer = r1
            com.alibaba.fastjson.parser.ParseContext r5 = r4.context
            r0.ownerContext = r5
            r4.setResolveStatus(r2)
        L36:
            return
    }

    public void checkMapResolve(java.util.Map r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.resolveStatus
            r1 = 1
            if (r0 != r1) goto L18
            com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer r0 = new com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer
            r0.<init>(r3, r4)
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r3 = r2.getLastResolveTask()
            r3.fieldDeserializer = r0
            com.alibaba.fastjson.parser.ParseContext r4 = r2.context
            r3.ownerContext = r4
            r3 = 0
            r2.setResolveStatus(r3)
        L18:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.AutoCloseSource     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0.isEnabled(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            int r1 = r0.token()     // Catch: java.lang.Throwable -> L32
            r2 = 20
            if (r1 != r2) goto L13
            goto L34
        L13:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "not close json text, token : "
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            int r3 = r0.token()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = com.alibaba.fastjson.parser.JSONToken.name(r3)     // Catch: java.lang.Throwable -> L32
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L32
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r1 = move-exception
            goto L38
        L34:
            r0.close()
            return
        L38:
            r0.close()
            throw r1
    }

    public void config(com.alibaba.fastjson.parser.Feature r2, boolean r3) {
            r1 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            r0.config(r2, r3)
            return
    }

    public com.alibaba.fastjson.parser.ParserConfig getConfig() {
            r1 = this;
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.config
            return r0
    }

    public com.alibaba.fastjson.parser.ParseContext getContext() {
            r1 = this;
            com.alibaba.fastjson.parser.ParseContext r0 = r1.context
            return r0
    }

    public java.lang.String getDateFomartPattern() {
            r1 = this;
            java.lang.String r0 = r1.dateFormatPattern
            return r0
    }

    public java.text.DateFormat getDateFormat() {
            r3 = this;
            java.text.DateFormat r0 = r3.dateFormat
            if (r0 != 0) goto L1c
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = r3.dateFormatPattern
            com.alibaba.fastjson.parser.JSONLexer r2 = r3.lexer
            java.util.Locale r2 = r2.getLocale()
            r0.<init>(r1, r2)
            r3.dateFormat = r0
            com.alibaba.fastjson.parser.JSONLexer r1 = r3.lexer
            java.util.TimeZone r1 = r1.getTimeZone()
            r0.setTimeZone(r1)
        L1c:
            java.text.DateFormat r0 = r3.dateFormat
            return r0
    }

    public java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraProcessor> getExtraProcessors() {
            r2 = this;
            java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraProcessor> r0 = r2.extraProcessors
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.extraProcessors = r0
        Lc:
            java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraProcessor> r0 = r2.extraProcessors
            return r0
    }

    public java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider> getExtraTypeProviders() {
            r2 = this;
            java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider> r0 = r2.extraTypeProviders
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.extraTypeProviders = r0
        Lc:
            java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider> r0 = r2.extraTypeProviders
            return r0
    }

    public com.alibaba.fastjson.parser.deserializer.FieldTypeResolver getFieldTypeResolver() {
            r1 = this;
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r0 = r1.fieldTypeResolver
            return r0
    }

    public java.lang.String getInput() {
            r2 = this;
            java.lang.Object r0 = r2.input
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto Le
            java.lang.String r1 = new java.lang.String
            char[] r0 = (char[]) r0
            r1.<init>(r0)
            return r1
        Le:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask getLastResolveTask() {
            r2 = this;
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r0 = r2.resolveTaskList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r0 = (com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask) r0
            return r0
    }

    public com.alibaba.fastjson.parser.JSONLexer getLexer() {
            r1 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            return r0
    }

    public java.lang.Object getObject(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.contextArrayIndex
            if (r0 >= r1) goto L1d
            com.alibaba.fastjson.parser.ParseContext[] r1 = r2.contextArray
            r1 = r1[r0]
            java.lang.String r1 = r1.toString()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1a
            com.alibaba.fastjson.parser.ParseContext[] r3 = r2.contextArray
            r3 = r3[r0]
            java.lang.Object r3 = r3.object
            return r3
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            r3 = 0
            return r3
    }

    public int getResolveStatus() {
            r1 = this;
            int r0 = r1.resolveStatus
            return r0
    }

    public java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask> getResolveTaskList() {
            r2 = this;
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r0 = r2.resolveTaskList
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.resolveTaskList = r0
        Lc:
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r0 = r2.resolveTaskList
            return r0
    }

    public com.alibaba.fastjson.parser.SymbolTable getSymbolTable() {
            r1 = this;
            com.alibaba.fastjson.parser.SymbolTable r0 = r1.symbolTable
            return r0
    }

    public void handleResovleTask(java.lang.Object r9) {
            r8 = this;
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r9 = r8.resolveTaskList
            if (r9 != 0) goto L5
            goto L5c
        L5:
            int r9 = r9.size()
            r0 = 0
            r1 = 0
        Lb:
            if (r1 >= r9) goto L5c
            java.util.List<com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask> r2 = r8.resolveTaskList
            java.lang.Object r2 = r2.get(r1)
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r2 = (com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask) r2
            java.lang.String r3 = r2.referenceValue
            com.alibaba.fastjson.parser.ParseContext r4 = r2.ownerContext
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r4.object
            goto L1f
        L1e:
            r4 = 0
        L1f:
            java.lang.String r5 = "$"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L2c
            java.lang.Object r5 = r8.getObject(r3)
            goto L30
        L2c:
            com.alibaba.fastjson.parser.ParseContext r5 = r2.context
            java.lang.Object r5 = r5.object
        L30:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r2 = r2.fieldDeserializer
            if (r2 == 0) goto L59
            if (r5 == 0) goto L56
            java.lang.Class r6 = r5.getClass()
            java.lang.Class<com.alibaba.fastjson.JSONObject> r7 = com.alibaba.fastjson.JSONObject.class
            if (r6 != r7) goto L56
            com.alibaba.fastjson.util.FieldInfo r6 = r2.fieldInfo
            if (r6 == 0) goto L56
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Class<?> r6 = r6.fieldClass
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 != 0) goto L56
            com.alibaba.fastjson.parser.ParseContext[] r5 = r8.contextArray
            r5 = r5[r0]
            java.lang.Object r5 = r5.object
            java.lang.Object r5 = com.alibaba.fastjson.JSONPath.eval(r5, r3)
        L56:
            r2.setValue(r4, r5)
        L59:
            int r1 = r1 + 1
            goto Lb
        L5c:
            return
    }

    public boolean isEnabled(com.alibaba.fastjson.parser.Feature r2) {
            r1 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r1.lexer
            boolean r2 = r0.isEnabled(r2)
            return r2
    }

    public java.lang.Object parse() {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.parse(r0)
            return r0
    }

    public java.lang.Object parse(java.lang.Object r5) {
            r4 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r4.lexer
            int r1 = r0.token()
            r2 = 2
            if (r1 == r2) goto L12b
            r3 = 3
            if (r1 == r3) goto L11d
            r3 = 4
            if (r1 == r3) goto Lea
            r3 = 12
            if (r1 == r3) goto Lda
            r3 = 14
            if (r1 == r3) goto Lc4
            r3 = 26
            if (r1 == r3) goto Lbc
            r3 = 0
            switch(r1) {
                case 6: goto Lb6;
                case 7: goto Lb0;
                case 8: goto Lac;
                case 9: goto L7b;
                default: goto L1f;
            }
        L1f:
            switch(r1) {
                case 20: goto L59;
                case 21: goto L4d;
                case 22: goto L41;
                case 23: goto L3d;
                default: goto L22;
            }
        L22:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "syntax error, "
            r1.append(r2)
            java.lang.String r0 = r0.info()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L3d:
            r0.nextToken()
            return r3
        L41:
            r0.nextToken()
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r4.parseArray(r0, r5)
            return r0
        L4d:
            r0.nextToken()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.parseArray(r0, r5)
            return r0
        L59:
            boolean r5 = r0.isBlankInput()
            if (r5 == 0) goto L60
            return r3
        L60:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unterminated json string, "
            r1.append(r2)
            java.lang.String r0 = r0.info()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L7b:
            r5 = 18
            r0.nextToken(r5)
            int r1 = r0.token()
            if (r1 != r5) goto La4
            r5 = 10
            r0.nextToken(r5)
            r4.accept(r5)
            java.lang.Number r5 = r0.integerValue()
            long r0 = r5.longValue()
            r4.accept(r2)
            r5 = 11
            r4.accept(r5)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r0)
            return r5
        La4:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "syntax error"
            r5.<init>(r0)
            throw r5
        Lac:
            r0.nextToken()
            return r3
        Lb0:
            r0.nextToken()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        Lb6:
            r0.nextToken()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        Lbc:
            byte[] r5 = r0.bytesValue()
            r0.nextToken()
            return r5
        Lc4:
            com.alibaba.fastjson.JSONArray r1 = new com.alibaba.fastjson.JSONArray
            r1.<init>()
            r4.parseArray(r1, r5)
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.UseObjectArray
            boolean r5 = r0.isEnabled(r5)
            if (r5 == 0) goto Ld9
            java.lang.Object[] r5 = r1.toArray()
            return r5
        Ld9:
            return r1
        Lda:
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.OrderedField
            boolean r0 = r0.isEnabled(r2)
            r1.<init>(r0)
            java.lang.Object r5 = r4.parseObject(r1, r5)
            return r5
        Lea:
            java.lang.String r5 = r0.stringVal()
            r1 = 16
            r0.nextToken(r1)
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L11c
            com.alibaba.fastjson.parser.JSONScanner r0 = new com.alibaba.fastjson.parser.JSONScanner
            r0.<init>(r5)
            boolean r1 = r0.scanISO8601DateIfMatch()     // Catch: java.lang.Throwable -> L112
            if (r1 == 0) goto L114
            java.util.Calendar r5 = r0.getCalendar()     // Catch: java.lang.Throwable -> L112
            java.util.Date r5 = r5.getTime()     // Catch: java.lang.Throwable -> L112
            r0.close()
            return r5
        L112:
            r5 = move-exception
            goto L118
        L114:
            r0.close()
            return r5
        L118:
            r0.close()
            throw r5
        L11c:
            return r5
        L11d:
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.UseBigDecimal
            boolean r5 = r0.isEnabled(r5)
            java.lang.Number r5 = r0.decimalValue(r5)
            r0.nextToken()
            return r5
        L12b:
            java.lang.Number r5 = r0.integerValue()
            r0.nextToken()
            return r5
    }

    public <T> java.util.List<T> parseArray(java.lang.Class<T> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.parseArray(r2, r0)
            return r0
    }

    public void parseArray(java.lang.Class<?> r1, java.util.Collection r2) {
            r0 = this;
            r0.parseArray(r1, r2)
            return
    }

    public void parseArray(java.lang.reflect.Type r2, java.util.Collection r3) {
            r1 = this;
            r0 = 0
            r1.parseArray(r2, r3, r0)
            return
    }

    public void parseArray(java.lang.reflect.Type r10, java.util.Collection r11, java.lang.Object r12) {
            r9 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r9.lexer
            int r0 = r0.token()
            r1 = 21
            if (r0 == r1) goto Le
            r1 = 22
            if (r0 != r1) goto L19
        Le:
            com.alibaba.fastjson.parser.JSONLexer r0 = r9.lexer
            r0.nextToken()
            com.alibaba.fastjson.parser.JSONLexer r0 = r9.lexer
            int r0 = r0.token()
        L19:
            r1 = 14
            if (r0 != r1) goto Le5
            r0 = 4
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r2 != r10) goto L2d
            com.alibaba.fastjson.serializer.IntegerCodec r3 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            com.alibaba.fastjson.parser.JSONLexer r4 = r9.lexer
            r5 = 2
            r4.nextToken(r5)
            goto L46
        L2d:
            if (r1 != r10) goto L37
            com.alibaba.fastjson.serializer.StringCodec r3 = com.alibaba.fastjson.serializer.StringCodec.instance
            com.alibaba.fastjson.parser.JSONLexer r4 = r9.lexer
            r4.nextToken(r0)
            goto L46
        L37:
            com.alibaba.fastjson.parser.ParserConfig r3 = r9.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r3.getDeserializer(r10)
            com.alibaba.fastjson.parser.JSONLexer r4 = r9.lexer
            int r5 = r3.getFastMatchToken()
            r4.nextToken(r5)
        L46:
            com.alibaba.fastjson.parser.ParseContext r4 = r9.context
            r9.setContext(r11, r12)
            r12 = 0
        L4c:
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            com.alibaba.fastjson.parser.Feature r6 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas     // Catch: java.lang.Throwable -> L66
            boolean r5 = r5.isEnabled(r6)     // Catch: java.lang.Throwable -> L66
            r6 = 16
            if (r5 == 0) goto L69
        L58:
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            int r5 = r5.token()     // Catch: java.lang.Throwable -> L66
            if (r5 != r6) goto L69
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            r5.nextToken()     // Catch: java.lang.Throwable -> L66
            goto L58
        L66:
            r10 = move-exception
            goto Le1
        L69:
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            int r5 = r5.token()     // Catch: java.lang.Throwable -> L66
            r7 = 15
            if (r5 != r7) goto L7c
            r9.setContext(r4)
            com.alibaba.fastjson.parser.JSONLexer r10 = r9.lexer
            r10.nextToken(r6)
            return
        L7c:
            r5 = 0
            if (r2 != r10) goto L89
            com.alibaba.fastjson.serializer.IntegerCodec r7 = com.alibaba.fastjson.serializer.IntegerCodec.instance     // Catch: java.lang.Throwable -> L66
            java.lang.Object r5 = r7.deserialze(r9, r5, r5)     // Catch: java.lang.Throwable -> L66
            r11.add(r5)     // Catch: java.lang.Throwable -> L66
            goto Lcc
        L89:
            if (r1 != r10) goto Lae
            com.alibaba.fastjson.parser.JSONLexer r7 = r9.lexer     // Catch: java.lang.Throwable -> L66
            int r7 = r7.token()     // Catch: java.lang.Throwable -> L66
            if (r7 != r0) goto L9f
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = r5.stringVal()     // Catch: java.lang.Throwable -> L66
            com.alibaba.fastjson.parser.JSONLexer r7 = r9.lexer     // Catch: java.lang.Throwable -> L66
            r7.nextToken(r6)     // Catch: java.lang.Throwable -> L66
            goto Laa
        L9f:
            java.lang.Object r7 = r9.parse()     // Catch: java.lang.Throwable -> L66
            if (r7 != 0) goto La6
            goto Laa
        La6:
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L66
        Laa:
            r11.add(r5)     // Catch: java.lang.Throwable -> L66
            goto Lcc
        Lae:
            com.alibaba.fastjson.parser.JSONLexer r7 = r9.lexer     // Catch: java.lang.Throwable -> L66
            int r7 = r7.token()     // Catch: java.lang.Throwable -> L66
            r8 = 8
            if (r7 != r8) goto Lbe
            com.alibaba.fastjson.parser.JSONLexer r7 = r9.lexer     // Catch: java.lang.Throwable -> L66
            r7.nextToken()     // Catch: java.lang.Throwable -> L66
            goto Lc6
        Lbe:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r5 = r3.deserialze(r9, r10, r5)     // Catch: java.lang.Throwable -> L66
        Lc6:
            r11.add(r5)     // Catch: java.lang.Throwable -> L66
            r9.checkListResolve(r11)     // Catch: java.lang.Throwable -> L66
        Lcc:
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            int r5 = r5.token()     // Catch: java.lang.Throwable -> L66
            if (r5 != r6) goto Ldd
            com.alibaba.fastjson.parser.JSONLexer r5 = r9.lexer     // Catch: java.lang.Throwable -> L66
            int r6 = r3.getFastMatchToken()     // Catch: java.lang.Throwable -> L66
            r5.nextToken(r6)     // Catch: java.lang.Throwable -> L66
        Ldd:
            int r12 = r12 + 1
            goto L4c
        Le1:
            r9.setContext(r4)
            throw r10
        Le5:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "exepct '[', but "
            r11.append(r12)
            java.lang.String r12 = com.alibaba.fastjson.parser.JSONToken.name(r0)
            r11.append(r12)
            java.lang.String r12 = ", "
            r11.append(r12)
            com.alibaba.fastjson.parser.JSONLexer r12 = r9.lexer
            java.lang.String r12 = r12.info()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public final void parseArray(java.util.Collection r2) {
            r1 = this;
            r0 = 0
            r1.parseArray(r2, r0)
            return
    }

    public final void parseArray(java.util.Collection r10, java.lang.Object r11) {
            r9 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r9.lexer
            int r1 = r0.token()
            r2 = 21
            if (r1 == r2) goto L12
            int r1 = r0.token()
            r2 = 22
            if (r1 != r2) goto L15
        L12:
            r0.nextToken()
        L15:
            int r1 = r0.token()
            r2 = 14
            if (r1 != r2) goto L11d
            r1 = 4
            r0.nextToken(r1)
            com.alibaba.fastjson.parser.ParseContext r3 = r9.context
            r9.setContext(r10, r11)
            r11 = 0
            r4 = 0
        L28:
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r0.isEnabled(r5)     // Catch: java.lang.Throwable -> L3c
            r6 = 16
            if (r5 == 0) goto L3f
        L32:
            int r5 = r0.token()     // Catch: java.lang.Throwable -> L3c
            if (r5 != r6) goto L3f
            r0.nextToken()     // Catch: java.lang.Throwable -> L3c
            goto L32
        L3c:
            r10 = move-exception
            goto L119
        L3f:
            int r5 = r0.token()     // Catch: java.lang.Throwable -> L3c
            r7 = 2
            if (r5 == r7) goto Lff
            r7 = 3
            if (r5 == r7) goto Le7
            if (r5 == r1) goto Lc0
            r7 = 6
            if (r5 == r7) goto Lba
            r7 = 7
            if (r5 == r7) goto Lb4
            r7 = 8
            r8 = 0
            if (r5 == r7) goto Lb0
            r7 = 12
            if (r5 == r7) goto L9c
            r7 = 20
            if (r5 == r7) goto L94
            r7 = 23
            if (r5 == r7) goto L8f
            if (r5 == r2) goto L75
            r7 = 15
            if (r5 == r7) goto L6e
            java.lang.Object r8 = r9.parse()     // Catch: java.lang.Throwable -> L3c
            goto L106
        L6e:
            r0.nextToken(r6)     // Catch: java.lang.Throwable -> L3c
            r9.setContext(r3)
            return
        L75:
            com.alibaba.fastjson.JSONArray r8 = new com.alibaba.fastjson.JSONArray     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3c
            r9.parseArray(r8, r5)     // Catch: java.lang.Throwable -> L3c
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.UseObjectArray     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r0.isEnabled(r5)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L106
            java.lang.Object[] r8 = r8.toArray()     // Catch: java.lang.Throwable -> L3c
            goto L106
        L8f:
            r0.nextToken(r1)     // Catch: java.lang.Throwable -> L3c
            goto L106
        L94:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r11 = "unclosed jsonArray"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L3c
            throw r10     // Catch: java.lang.Throwable -> L3c
        L9c:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Throwable -> L3c
            com.alibaba.fastjson.parser.Feature r7 = com.alibaba.fastjson.parser.Feature.OrderedField     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r0.isEnabled(r7)     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r9.parseObject(r5, r7)     // Catch: java.lang.Throwable -> L3c
            goto L106
        Lb0:
            r0.nextToken(r1)     // Catch: java.lang.Throwable -> L3c
            goto L106
        Lb4:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3c
            r0.nextToken(r6)     // Catch: java.lang.Throwable -> L3c
            goto L106
        Lba:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3c
            r0.nextToken(r6)     // Catch: java.lang.Throwable -> L3c
            goto L106
        Lc0:
            java.lang.String r8 = r0.stringVal()     // Catch: java.lang.Throwable -> L3c
            r0.nextToken(r6)     // Catch: java.lang.Throwable -> L3c
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r0.isEnabled(r5)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L106
            com.alibaba.fastjson.parser.JSONScanner r5 = new com.alibaba.fastjson.parser.JSONScanner     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r5.scanISO8601DateIfMatch()     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto Le3
            java.util.Calendar r7 = r5.getCalendar()     // Catch: java.lang.Throwable -> L3c
            java.util.Date r7 = r7.getTime()     // Catch: java.lang.Throwable -> L3c
            r8 = r7
        Le3:
            r5.close()     // Catch: java.lang.Throwable -> L3c
            goto L106
        Le7:
            com.alibaba.fastjson.parser.Feature r5 = com.alibaba.fastjson.parser.Feature.UseBigDecimal     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r0.isEnabled(r5)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto Lf6
            r5 = 1
            java.lang.Number r5 = r0.decimalValue(r5)     // Catch: java.lang.Throwable -> L3c
        Lf4:
            r8 = r5
            goto Lfb
        Lf6:
            java.lang.Number r5 = r0.decimalValue(r11)     // Catch: java.lang.Throwable -> L3c
            goto Lf4
        Lfb:
            r0.nextToken(r6)     // Catch: java.lang.Throwable -> L3c
            goto L106
        Lff:
            java.lang.Number r8 = r0.integerValue()     // Catch: java.lang.Throwable -> L3c
            r0.nextToken(r6)     // Catch: java.lang.Throwable -> L3c
        L106:
            r10.add(r8)     // Catch: java.lang.Throwable -> L3c
            r9.checkListResolve(r10)     // Catch: java.lang.Throwable -> L3c
            int r5 = r0.token()     // Catch: java.lang.Throwable -> L3c
            if (r5 != r6) goto L115
            r0.nextToken(r1)     // Catch: java.lang.Throwable -> L3c
        L115:
            int r4 = r4 + 1
            goto L28
        L119:
            r9.setContext(r3)
            throw r10
        L11d:
            com.alibaba.fastjson.JSONException r10 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "syntax error, expect [, actual "
            r11.append(r1)
            int r1 = r0.token()
            java.lang.String r1 = com.alibaba.fastjson.parser.JSONToken.name(r1)
            r11.append(r1)
            java.lang.String r1 = ", pos "
            r11.append(r1)
            int r0 = r0.pos()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public java.lang.Object[] parseArray(java.lang.reflect.Type[] r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.alibaba.fastjson.parser.JSONLexer r2 = r0.lexer
            int r2 = r2.token()
            r3 = 0
            r4 = 16
            r5 = 8
            if (r2 != r5) goto L17
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            r1.nextToken(r4)
            return r3
        L17:
            com.alibaba.fastjson.parser.JSONLexer r2 = r0.lexer
            int r2 = r2.token()
            r6 = 14
            if (r2 != r6) goto L19c
            int r2 = r1.length
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r7 = r1.length
            java.lang.String r8 = "syntax error"
            r9 = 0
            r10 = 15
            if (r7 != 0) goto L47
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            r1.nextToken(r10)
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            int r1 = r1.token()
            if (r1 != r10) goto L41
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            r1.nextToken(r4)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            return r1
        L41:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            r1.<init>(r8)
            throw r1
        L47:
            com.alibaba.fastjson.parser.JSONLexer r7 = r0.lexer
            r11 = 2
            r7.nextToken(r11)
            r7 = 0
        L4e:
            int r12 = r1.length
            if (r7 >= r12) goto L188
            com.alibaba.fastjson.parser.JSONLexer r12 = r0.lexer
            int r12 = r12.token()
            java.lang.String r13 = "syntax error :"
            if (r12 != r5) goto L63
            com.alibaba.fastjson.parser.JSONLexer r12 = r0.lexer
            r12.nextToken(r4)
            r12 = r3
            goto L13e
        L63:
            r12 = r1[r7]
            java.lang.Class r14 = java.lang.Integer.TYPE
            if (r12 == r14) goto L11c
            java.lang.Class<java.lang.Integer> r14 = java.lang.Integer.class
            if (r12 != r14) goto L6f
            goto L11c
        L6f:
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            if (r12 != r14) goto L95
            com.alibaba.fastjson.parser.JSONLexer r14 = r0.lexer
            int r14 = r14.token()
            r15 = 4
            if (r14 != r15) goto L89
            com.alibaba.fastjson.parser.JSONLexer r12 = r0.lexer
            java.lang.String r12 = r12.stringVal()
            com.alibaba.fastjson.parser.JSONLexer r14 = r0.lexer
            r14.nextToken(r4)
            goto L13e
        L89:
            java.lang.Object r14 = r0.parse()
            com.alibaba.fastjson.parser.ParserConfig r15 = r0.config
            java.lang.Object r12 = com.alibaba.fastjson.util.TypeUtils.cast(r14, r12, r15)
            goto L13e
        L95:
            int r14 = r1.length
            int r14 = r14 + (-1)
            if (r7 != r14) goto Laa
            boolean r14 = r12 instanceof java.lang.Class
            if (r14 == 0) goto Laa
            r14 = r12
            java.lang.Class r14 = (java.lang.Class) r14
            boolean r15 = r14.isArray()
            java.lang.Class r14 = r14.getComponentType()
            goto Lac
        Laa:
            r14 = r3
            r15 = 0
        Lac:
            if (r15 == 0) goto L111
            com.alibaba.fastjson.parser.JSONLexer r15 = r0.lexer
            int r15 = r15.token()
            if (r15 == r6) goto L111
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.alibaba.fastjson.parser.ParserConfig r5 = r0.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r5 = r5.getDeserializer(r14)
            int r14 = r5.getFastMatchToken()
            com.alibaba.fastjson.parser.JSONLexer r6 = r0.lexer
            int r6 = r6.token()
            if (r6 == r10) goto L10a
        Lcd:
            java.lang.Object r6 = r5.deserialze(r0, r12, r3)
            r15.add(r6)
            com.alibaba.fastjson.parser.JSONLexer r6 = r0.lexer
            int r6 = r6.token()
            if (r6 != r4) goto Le2
            com.alibaba.fastjson.parser.JSONLexer r6 = r0.lexer
            r6.nextToken(r14)
            goto Lcd
        Le2:
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            int r5 = r5.token()
            if (r5 != r10) goto Leb
            goto L10a
        Leb:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            com.alibaba.fastjson.parser.JSONLexer r3 = r0.lexer
            int r3 = r3.token()
            java.lang.String r3 = com.alibaba.fastjson.parser.JSONToken.name(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L10a:
            com.alibaba.fastjson.parser.ParserConfig r5 = r0.config
            java.lang.Object r12 = com.alibaba.fastjson.util.TypeUtils.cast(r15, r12, r5)
            goto L13e
        L111:
            com.alibaba.fastjson.parser.ParserConfig r5 = r0.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r5 = r5.getDeserializer(r12)
            java.lang.Object r12 = r5.deserialze(r0, r12, r3)
            goto L13e
        L11c:
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            int r5 = r5.token()
            if (r5 != r11) goto L134
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            int r5 = r5.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            r5.nextToken(r4)
            goto L13e
        L134:
            java.lang.Object r5 = r0.parse()
            com.alibaba.fastjson.parser.ParserConfig r6 = r0.config
            java.lang.Object r12 = com.alibaba.fastjson.util.TypeUtils.cast(r5, r12, r6)
        L13e:
            r2[r7] = r12
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            int r5 = r5.token()
            if (r5 != r10) goto L149
            goto L188
        L149:
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            int r5 = r5.token()
            if (r5 != r4) goto L169
            int r5 = r1.length
            int r5 = r5 + (-1)
            if (r7 != r5) goto L15c
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            r5.nextToken(r10)
            goto L161
        L15c:
            com.alibaba.fastjson.parser.JSONLexer r5 = r0.lexer
            r5.nextToken(r11)
        L161:
            int r7 = r7 + 1
            r5 = 8
            r6 = 14
            goto L4e
        L169:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            com.alibaba.fastjson.parser.JSONLexer r3 = r0.lexer
            int r3 = r3.token()
            java.lang.String r3 = com.alibaba.fastjson.parser.JSONToken.name(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L188:
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            int r1 = r1.token()
            if (r1 != r10) goto L196
            com.alibaba.fastjson.parser.JSONLexer r1 = r0.lexer
            r1.nextToken(r4)
            return r2
        L196:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            r1.<init>(r8)
            throw r1
        L19c:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "syntax error : "
            r2.append(r3)
            com.alibaba.fastjson.parser.JSONLexer r3 = r0.lexer
            java.lang.String r3 = r3.tokenName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public java.lang.Object parseArrayWithType(java.lang.reflect.Type r7) {
            r6 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r6.lexer
            int r0 = r0.token()
            r1 = 8
            if (r0 != r1) goto L11
            com.alibaba.fastjson.parser.JSONLexer r7 = r6.lexer
            r7.nextToken()
            r7 = 0
            return r7
        L11:
            r0 = r7
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto Lcc
            r1 = 0
            r0 = r0[r1]
            boolean r3 = r0 instanceof java.lang.Class
            if (r3 == 0) goto L2e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Class r0 = (java.lang.Class) r0
            r6.parseArray(r0, r7)
            return r7
        L2e:
            boolean r3 = r0 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L70
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r2 = r0.getUpperBounds()
            r1 = r2[r1]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L65
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            int r0 = r0.length
            if (r0 != 0) goto L4e
            java.lang.Object r7 = r6.parse()
            return r7
        L4e:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not support type : "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L65:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Class r1 = (java.lang.Class) r1
            r6.parseArray(r1, r7)
            return r7
        L70:
            boolean r3 = r0 instanceof java.lang.reflect.TypeVariable
            if (r3 == 0) goto La6
            r3 = r0
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.reflect.Type[] r4 = r3.getBounds()
            int r5 = r4.length
            if (r5 != r2) goto L8f
            r1 = r4[r1]
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto La6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Class r1 = (java.lang.Class) r1
            r6.parseArray(r1, r7)
            return r7
        L8f:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not support : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        La6:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto Lb5
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.parseArray(r0, r7)
            return r7
        Lb5:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TODO : "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        Lcc:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not support type "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    public void parseExtra(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            r0.nextTokenWithColon()
            java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider> r0 = r3.extraTypeProviders
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider r1 = (com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider) r1
            java.lang.reflect.Type r1 = r1.getExtraType(r4, r5)
            goto Le
        L1f:
            if (r1 != 0) goto L26
            java.lang.Object r0 = r3.parse()
            goto L2a
        L26:
            java.lang.Object r0 = r3.parseObject(r1)
        L2a:
            boolean r1 = r4 instanceof com.alibaba.fastjson.parser.deserializer.ExtraProcessable
            if (r1 == 0) goto L34
            com.alibaba.fastjson.parser.deserializer.ExtraProcessable r4 = (com.alibaba.fastjson.parser.deserializer.ExtraProcessable) r4
            r4.processExtra(r5, r0)
            return
        L34:
            java.util.List<com.alibaba.fastjson.parser.deserializer.ExtraProcessor> r1 = r3.extraProcessors
            if (r1 == 0) goto L4c
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            com.alibaba.fastjson.parser.deserializer.ExtraProcessor r2 = (com.alibaba.fastjson.parser.deserializer.ExtraProcessor) r2
            r2.processExtra(r4, r5, r0)
            goto L3c
        L4c:
            int r4 = r3.resolveStatus
            r5 = 1
            if (r4 != r5) goto L54
            r4 = 0
            r3.resolveStatus = r4
        L54:
            return
    }

    public java.lang.Object parseKey() {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            int r0 = r0.token()
            r1 = 18
            if (r0 != r1) goto L18
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            java.lang.String r0 = r0.stringVal()
            com.alibaba.fastjson.parser.JSONLexer r1 = r3.lexer
            r2 = 16
            r1.nextToken(r2)
            return r0
        L18:
            r0 = 0
            java.lang.Object r0 = r3.parse(r0)
            return r0
    }

    public com.alibaba.fastjson.JSONObject parseObject() {
            r3 = this;
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            com.alibaba.fastjson.parser.JSONLexer r1 = r3.lexer
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.OrderedField
            boolean r1 = r1.isEnabled(r2)
            r0.<init>(r1)
            java.lang.Object r0 = r3.parseObject(r0)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
    }

    public <T> T parseObject(java.lang.Class<T> r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.parseObject(r2, r0)
            return r2
    }

    public <T> T parseObject(java.lang.reflect.Type r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.parseObject(r2, r0)
            return r2
    }

    public <T> T parseObject(java.lang.reflect.Type r3, java.lang.Object r4) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r2.lexer
            int r0 = r0.token()
            r1 = 8
            if (r0 != r1) goto L11
            com.alibaba.fastjson.parser.JSONLexer r3 = r2.lexer
            r3.nextToken()
            r3 = 0
            return r3
        L11:
            r1 = 4
            if (r0 != r1) goto L38
            java.lang.Class<byte[]> r0 = byte[].class
            if (r3 != r0) goto L24
            com.alibaba.fastjson.parser.JSONLexer r3 = r2.lexer
            byte[] r3 = r3.bytesValue()
            com.alibaba.fastjson.parser.JSONLexer r4 = r2.lexer
            r4.nextToken()
            return r3
        L24:
            java.lang.Class<char[]> r0 = char[].class
            if (r3 != r0) goto L38
            com.alibaba.fastjson.parser.JSONLexer r3 = r2.lexer
            java.lang.String r3 = r3.stringVal()
            com.alibaba.fastjson.parser.JSONLexer r4 = r2.lexer
            r4.nextToken()
            char[] r3 = r3.toCharArray()
            return r3
        L38:
            com.alibaba.fastjson.parser.ParserConfig r0 = r2.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r3)
            java.lang.Object r3 = r0.deserialze(r2, r3, r4)     // Catch: java.lang.Throwable -> L43 com.alibaba.fastjson.JSONException -> L4e
            return r3
        L43:
            r3 = move-exception
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = r3.getMessage()
            r4.<init>(r0, r3)
            throw r4
        L4e:
            r3 = move-exception
            throw r3
    }

    public java.lang.Object parseObject(java.util.Map r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.parseObject(r2, r0)
            return r2
    }

    public final java.lang.Object parseObject(java.util.Map r18, java.lang.Object r19) {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "parse number key error"
            com.alibaba.fastjson.parser.JSONLexer r4 = r1.lexer
            int r5 = r4.token()
            r6 = 8
            r7 = 0
            if (r5 != r6) goto L17
            r4.nextToken()
            return r7
        L17:
            int r5 = r4.token()
            r6 = 13
            if (r5 != r6) goto L23
            r4.nextToken()
            return r0
        L23:
            int r5 = r4.token()
            r8 = 12
            r9 = 16
            if (r5 == r8) goto L5b
            int r5 = r4.token()
            if (r5 != r9) goto L34
            goto L5b
        L34:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "syntax error, expect {, actual "
            r2.append(r3)
            java.lang.String r3 = r4.tokenName()
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r3 = r4.info()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L5b:
            com.alibaba.fastjson.parser.ParseContext r5 = r1.context
            r10 = 0
        L5e:
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
            char r11 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.Feature r12 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas     // Catch: java.lang.Throwable -> L7c
            boolean r12 = r4.isEnabled(r12)     // Catch: java.lang.Throwable -> L7c
            r13 = 44
            if (r12 == 0) goto L7f
        L6f:
            if (r11 != r13) goto L7f
            r4.next()     // Catch: java.lang.Throwable -> L7c
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
            char r11 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            goto L6f
        L7c:
            r0 = move-exception
            goto L566
        L7f:
            r9 = 125(0x7d, float:1.75E-43)
            java.lang.String r12 = ", name "
            java.lang.String r14 = "expect ':' at "
            r7 = 58
            r15 = 34
            java.lang.String r8 = "syntax error"
            r6 = 1
            if (r11 != r15) goto Lbf
            com.alibaba.fastjson.parser.SymbolTable r11 = r1.symbolTable     // Catch: java.lang.Throwable -> L7c
            java.lang.String r11 = r4.scanSymbol(r11, r15)     // Catch: java.lang.Throwable -> L7c
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
            char r15 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            if (r15 != r7) goto La0
        L9d:
            r7 = 0
            goto L1d3
        La0:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            r2.append(r14)     // Catch: java.lang.Throwable -> L7c
            int r3 = r4.pos()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            r2.append(r12)     // Catch: java.lang.Throwable -> L7c
            r2.append(r11)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        Lbf:
            if (r11 != r9) goto Le5
            r4.next()     // Catch: java.lang.Throwable -> L7c
            r4.resetStringPosition()     // Catch: java.lang.Throwable -> L7c
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            if (r10 != 0) goto Le1
            com.alibaba.fastjson.parser.ParseContext r3 = r1.context     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto Lda
            java.lang.Object r4 = r3.fieldName     // Catch: java.lang.Throwable -> L7c
            if (r2 != r4) goto Lda
            java.lang.Object r4 = r3.object     // Catch: java.lang.Throwable -> L7c
            if (r0 != r4) goto Lda
            r5 = r3
            goto Le1
        Lda:
            com.alibaba.fastjson.parser.ParseContext r2 = r17.setContext(r18, r19)     // Catch: java.lang.Throwable -> L7c
            if (r5 != 0) goto Le1
            r5 = r2
        Le1:
            r1.setContext(r5)
            return r0
        Le5:
            r15 = 39
            if (r11 != r15) goto L120
            com.alibaba.fastjson.parser.Feature r11 = com.alibaba.fastjson.parser.Feature.AllowSingleQuotes     // Catch: java.lang.Throwable -> L7c
            boolean r11 = r4.isEnabled(r11)     // Catch: java.lang.Throwable -> L7c
            if (r11 == 0) goto L11a
            com.alibaba.fastjson.parser.SymbolTable r11 = r1.symbolTable     // Catch: java.lang.Throwable -> L7c
            java.lang.String r11 = r4.scanSymbol(r11, r15)     // Catch: java.lang.Throwable -> L7c
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
            char r15 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            if (r15 != r7) goto L101
            goto L9d
        L101:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            r2.append(r14)     // Catch: java.lang.Throwable -> L7c
            int r3 = r4.pos()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L11a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L120:
            r15 = 26
            if (r11 == r15) goto L560
            if (r11 == r13) goto L55a
            r15 = 48
            if (r11 < r15) goto L12e
            r15 = 57
            if (r11 <= r15) goto L132
        L12e:
            r15 = 45
            if (r11 != r15) goto L182
        L132:
            r4.resetStringPosition()     // Catch: java.lang.Throwable -> L7c
            r4.scanNumber()     // Catch: java.lang.Throwable -> L7c
            int r11 = r4.token()     // Catch: java.lang.Throwable -> L7c java.lang.NumberFormatException -> L169
            r14 = 2
            if (r11 != r14) goto L144
            java.lang.Number r11 = r4.integerValue()     // Catch: java.lang.Throwable -> L7c java.lang.NumberFormatException -> L169
            goto L148
        L144:
            java.lang.Number r11 = r4.decimalValue(r6)     // Catch: java.lang.Throwable -> L7c java.lang.NumberFormatException -> L169
        L148:
            char r14 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            if (r14 != r7) goto L150
            goto L9d
        L150:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r4.info()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L169:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r4.info()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L182:
            r15 = 123(0x7b, float:1.72E-43)
            if (r11 == r15) goto L1cb
            r15 = 91
            if (r11 != r15) goto L18b
            goto L1cb
        L18b:
            com.alibaba.fastjson.parser.Feature r11 = com.alibaba.fastjson.parser.Feature.AllowUnQuotedFieldNames     // Catch: java.lang.Throwable -> L7c
            boolean r11 = r4.isEnabled(r11)     // Catch: java.lang.Throwable -> L7c
            if (r11 == 0) goto L1c5
            com.alibaba.fastjson.parser.SymbolTable r11 = r1.symbolTable     // Catch: java.lang.Throwable -> L7c
            java.lang.String r11 = r4.scanSymbolUnQuoted(r11)     // Catch: java.lang.Throwable -> L7c
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
            char r15 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            if (r15 != r7) goto L1a4
            goto L9d
        L1a4:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            r2.append(r14)     // Catch: java.lang.Throwable -> L7c
            int r3 = r4.pos()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = ", actual "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            r2.append(r15)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L1c5:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L1cb:
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r11 = r1.parse()     // Catch: java.lang.Throwable -> L7c
            r7 = 1
        L1d3:
            if (r7 != 0) goto L1db
            r4.next()     // Catch: java.lang.Throwable -> L7c
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
        L1db:
            char r7 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            r4.resetStringPosition()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r14 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY     // Catch: java.lang.Throwable -> L7c
            if (r11 != r14) goto L28c
            com.alibaba.fastjson.parser.Feature r14 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch: java.lang.Throwable -> L7c
            boolean r14 = r4.isEnabled(r14)     // Catch: java.lang.Throwable -> L7c
            if (r14 != 0) goto L28c
            com.alibaba.fastjson.parser.SymbolTable r6 = r1.symbolTable     // Catch: java.lang.Throwable -> L7c
            r7 = 34
            java.lang.String r6 = r4.scanSymbol(r6, r7)     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.ParserConfig r7 = r1.config     // Catch: java.lang.Throwable -> L7c
            r14 = 0
            java.lang.Class r7 = r7.checkAutoType(r6, r14)     // Catch: java.lang.Throwable -> L7c
            if (r7 != 0) goto L20b
            java.lang.String r7 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY     // Catch: java.lang.Throwable -> L7c
            r0.put(r7, r6)     // Catch: java.lang.Throwable -> L7c
        L204:
            r7 = r14
            r6 = 13
            r9 = 16
            goto L5e
        L20b:
            r3 = 16
            r4.nextToken(r3)     // Catch: java.lang.Throwable -> L7c
            int r8 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r9 = 13
            if (r8 != r9) goto L256
            r4.nextToken(r3)     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.config     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            boolean r2 = r0 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            if (r2 == 0) goto L22f
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r0 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r0     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            java.lang.Object r0 = r0.createInstance(r1, r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            r14 = r0
            goto L22f
        L22d:
            r0 = move-exception
            goto L24e
        L22f:
            if (r14 != 0) goto L24a
            java.lang.Class<java.lang.Cloneable> r0 = java.lang.Cloneable.class
            if (r7 != r0) goto L23b
            java.util.HashMap r14 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            r14.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            goto L24a
        L23b:
            java.lang.String r0 = "java.util.Collections$EmptyMap"
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            if (r0 == 0) goto L246
            java.util.Map r14 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
            goto L24a
        L246:
            java.lang.Object r14 = r7.newInstance()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L22d
        L24a:
            r1.setContext(r5)
            return r14
        L24e:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "create instance error"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7c
            throw r2     // Catch: java.lang.Throwable -> L7c
        L256:
            r14 = 2
            r1.setResolveStatus(r14)     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.ParseContext r3 = r1.context     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L26b
            boolean r4 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L7c
            if (r4 != 0) goto L26b
            java.lang.Object r3 = r3.fieldName     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L26b
            r1.popContext()     // Catch: java.lang.Throwable -> L7c
        L26b:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L7c
            if (r3 <= 0) goto L27e
            com.alibaba.fastjson.parser.ParserConfig r2 = r1.config     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = com.alibaba.fastjson.util.TypeUtils.cast(r0, r7, r2)     // Catch: java.lang.Throwable -> L7c
            r1.parseObject(r0)     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r0
        L27e:
            com.alibaba.fastjson.parser.ParserConfig r0 = r1.config     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.deserialze(r1, r7, r2)     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r0
        L28c:
            r14 = 0
            java.lang.String r15 = "$ref"
            if (r11 != r15) goto L349
            if (r5 == 0) goto L349
            com.alibaba.fastjson.parser.Feature r15 = com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect     // Catch: java.lang.Throwable -> L7c
            boolean r15 = r4.isEnabled(r15)     // Catch: java.lang.Throwable -> L7c
            if (r15 != 0) goto L349
            r0 = 4
            r4.nextToken(r0)     // Catch: java.lang.Throwable -> L7c
            int r2 = r4.token()     // Catch: java.lang.Throwable -> L7c
            if (r2 != r0) goto L32a
            java.lang.String r0 = r4.stringVal()     // Catch: java.lang.Throwable -> L7c
            r9 = 13
            r4.nextToken(r9)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = "@"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L2cc
            com.alibaba.fastjson.parser.ParseContext r0 = r1.context     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L312
            java.lang.Object r2 = r0.object     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r2 instanceof java.lang.Object[]     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L2d8
            boolean r3 = r2 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L2c5
            goto L2d8
        L2c5:
            com.alibaba.fastjson.parser.ParseContext r0 = r0.parent     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L312
            java.lang.Object r7 = r0.object     // Catch: java.lang.Throwable -> L7c
            goto L313
        L2cc:
            java.lang.String r2 = ".."
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L2e6
            java.lang.Object r2 = r5.object     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L2da
        L2d8:
            r7 = r2
            goto L313
        L2da:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r2 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L7c
            r1.addResolveTask(r2)     // Catch: java.lang.Throwable -> L7c
            r1.setResolveStatus(r6)     // Catch: java.lang.Throwable -> L7c
            goto L312
        L2e6:
            java.lang.String r2 = "$"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L307
            r2 = r5
        L2ef:
            com.alibaba.fastjson.parser.ParseContext r3 = r2.parent     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L2f5
            r2 = r3
            goto L2ef
        L2f5:
            java.lang.Object r3 = r2.object     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L2fb
            r7 = r3
            goto L313
        L2fb:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r3 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L7c
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L7c
            r1.addResolveTask(r3)     // Catch: java.lang.Throwable -> L7c
            r1.setResolveStatus(r6)     // Catch: java.lang.Throwable -> L7c
            goto L312
        L307:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r2 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L7c
            r1.addResolveTask(r2)     // Catch: java.lang.Throwable -> L7c
            r1.setResolveStatus(r6)     // Catch: java.lang.Throwable -> L7c
        L312:
            r7 = r14
        L313:
            int r0 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r9 = 13
            if (r0 != r9) goto L324
            r3 = 16
            r4.nextToken(r3)     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r7
        L324:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L32a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "illegal ref, "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r3 = r4.token()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = com.alibaba.fastjson.parser.JSONToken.name(r3)     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L349:
            if (r10 != 0) goto L361
            com.alibaba.fastjson.parser.ParseContext r15 = r1.context     // Catch: java.lang.Throwable -> L7c
            if (r15 == 0) goto L359
            java.lang.Object r6 = r15.fieldName     // Catch: java.lang.Throwable -> L7c
            if (r2 != r6) goto L359
            java.lang.Object r6 = r15.object     // Catch: java.lang.Throwable -> L7c
            if (r0 != r6) goto L359
            r5 = r15
            goto L361
        L359:
            com.alibaba.fastjson.parser.ParseContext r6 = r17.setContext(r18, r19)     // Catch: java.lang.Throwable -> L7c
            if (r5 != 0) goto L360
            r5 = r6
        L360:
            r10 = 1
        L361:
            java.lang.Class r6 = r0.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<com.alibaba.fastjson.JSONObject> r15 = com.alibaba.fastjson.JSONObject.class
            if (r6 != r15) goto L374
            if (r11 != 0) goto L36f
            java.lang.String r6 = "null"
        L36d:
            r11 = r6
            goto L374
        L36f:
            java.lang.String r6 = r11.toString()     // Catch: java.lang.Throwable -> L7c
            goto L36d
        L374:
            r6 = 34
            if (r7 != r6) goto L3a1
            r4.scanString()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = r4.stringVal()     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.Feature r7 = com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat     // Catch: java.lang.Throwable -> L7c
            boolean r7 = r4.isEnabled(r7)     // Catch: java.lang.Throwable -> L7c
            if (r7 == 0) goto L39d
            com.alibaba.fastjson.parser.JSONScanner r7 = new com.alibaba.fastjson.parser.JSONScanner     // Catch: java.lang.Throwable -> L7c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            boolean r8 = r7.scanISO8601DateIfMatch()     // Catch: java.lang.Throwable -> L7c
            if (r8 == 0) goto L39a
            java.util.Calendar r6 = r7.getCalendar()     // Catch: java.lang.Throwable -> L7c
            java.util.Date r6 = r6.getTime()     // Catch: java.lang.Throwable -> L7c
        L39a:
            r7.close()     // Catch: java.lang.Throwable -> L7c
        L39d:
            r0.put(r11, r6)     // Catch: java.lang.Throwable -> L7c
            goto L3c9
        L3a1:
            r6 = 48
            if (r7 < r6) goto L3a9
            r6 = 57
            if (r7 <= r6) goto L3ad
        L3a9:
            r6 = 45
            if (r7 != r6) goto L40e
        L3ad:
            r4.scanNumber()     // Catch: java.lang.Throwable -> L7c
            int r6 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r7 = 2
            if (r6 != r7) goto L3bc
            java.lang.Number r6 = r4.integerValue()     // Catch: java.lang.Throwable -> L7c
            goto L3c6
        L3bc:
            com.alibaba.fastjson.parser.Feature r6 = com.alibaba.fastjson.parser.Feature.UseBigDecimal     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r4.isEnabled(r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Number r6 = r4.decimalValue(r6)     // Catch: java.lang.Throwable -> L7c
        L3c6:
            r0.put(r11, r6)     // Catch: java.lang.Throwable -> L7c
        L3c9:
            r4.skipWhitespace()     // Catch: java.lang.Throwable -> L7c
            char r7 = r4.getCurrent()     // Catch: java.lang.Throwable -> L7c
            if (r7 != r13) goto L3db
            r4.next()     // Catch: java.lang.Throwable -> L7c
        L3d5:
            r7 = 16
        L3d7:
            r9 = 13
            goto L537
        L3db:
            if (r7 != r9) goto L3ed
            r4.next()     // Catch: java.lang.Throwable -> L7c
            r4.resetStringPosition()     // Catch: java.lang.Throwable -> L7c
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r6, r11)     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r0
        L3ed:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "syntax error, position at "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r3 = r4.pos()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            r2.append(r12)     // Catch: java.lang.Throwable -> L7c
            r2.append(r11)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L40e:
            r6 = 91
            if (r7 != r6) goto L457
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.JSONArray r6 = new com.alibaba.fastjson.JSONArray     // Catch: java.lang.Throwable -> L7c
            r6.<init>()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L422
            java.lang.Class r7 = r2.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
        L422:
            if (r2 != 0) goto L427
            r1.setContext(r5)     // Catch: java.lang.Throwable -> L7c
        L427:
            r1.parseArray(r6, r11)     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.Feature r7 = com.alibaba.fastjson.parser.Feature.UseObjectArray     // Catch: java.lang.Throwable -> L7c
            boolean r7 = r4.isEnabled(r7)     // Catch: java.lang.Throwable -> L7c
            if (r7 == 0) goto L436
            java.lang.Object[] r6 = r6.toArray()     // Catch: java.lang.Throwable -> L7c
        L436:
            r0.put(r11, r6)     // Catch: java.lang.Throwable -> L7c
            int r6 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r9 = 13
            if (r6 != r9) goto L448
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r0
        L448:
            int r6 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r7 = 16
            if (r6 != r7) goto L451
            goto L3d7
        L451:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L457:
            r6 = 123(0x7b, float:1.72E-43)
            if (r7 != r6) goto L50c
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L46a
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            if (r6 != r7) goto L46a
            r6 = 1
            goto L46b
        L46a:
            r6 = 0
        L46b:
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.Feature r8 = com.alibaba.fastjson.parser.Feature.OrderedField     // Catch: java.lang.Throwable -> L7c
            boolean r8 = r4.isEnabled(r8)     // Catch: java.lang.Throwable -> L7c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            if (r6 != 0) goto L47d
            com.alibaba.fastjson.parser.ParseContext r8 = r1.setContext(r5, r7, r11)     // Catch: java.lang.Throwable -> L7c
            goto L47e
        L47d:
            r8 = r14
        L47e:
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r9 = r1.fieldTypeResolver     // Catch: java.lang.Throwable -> L7c
            if (r9 == 0) goto L49f
            if (r11 == 0) goto L489
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L7c
            goto L48a
        L489:
            r9 = r14
        L48a:
            com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r12 = r1.fieldTypeResolver     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Type r9 = r12.resolve(r0, r9)     // Catch: java.lang.Throwable -> L7c
            if (r9 == 0) goto L49f
            com.alibaba.fastjson.parser.ParserConfig r12 = r1.config     // Catch: java.lang.Throwable -> L7c
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r12 = r12.getDeserializer(r9)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r9 = r12.deserialze(r1, r9, r11)     // Catch: java.lang.Throwable -> L7c
            r16 = 1
            goto L4a2
        L49f:
            r9 = r14
            r16 = 0
        L4a2:
            if (r16 != 0) goto L4a8
            java.lang.Object r9 = r1.parseObject(r7, r11)     // Catch: java.lang.Throwable -> L7c
        L4a8:
            if (r8 == 0) goto L4ae
            if (r7 == r9) goto L4ae
            r8.object = r0     // Catch: java.lang.Throwable -> L7c
        L4ae:
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L7c
            r1.checkMapResolve(r0, r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L7c
            if (r7 != r15) goto L4c3
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L7c
            r0.put(r7, r9)     // Catch: java.lang.Throwable -> L7c
            goto L4c6
        L4c3:
            r0.put(r11, r9)     // Catch: java.lang.Throwable -> L7c
        L4c6:
            if (r6 == 0) goto L4cb
            r1.setContext(r9, r11)     // Catch: java.lang.Throwable -> L7c
        L4cb:
            int r7 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r9 = 13
            if (r7 != r9) goto L4dd
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r0
        L4dd:
            int r7 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r8 = 16
            if (r7 != r8) goto L4f1
            if (r6 == 0) goto L4ec
            r1.popContext()     // Catch: java.lang.Throwable -> L7c
            goto L3d5
        L4ec:
            r1.setContext(r5)     // Catch: java.lang.Throwable -> L7c
            goto L3d5
        L4f1:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "syntax error, "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r4.tokenName()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L50c:
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r6 = r1.parse()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L7c
            if (r7 != r15) goto L51d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L7c
        L51d:
            r0.put(r11, r6)     // Catch: java.lang.Throwable -> L7c
            int r6 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r9 = 13
            if (r6 != r9) goto L52f
            r4.nextToken()     // Catch: java.lang.Throwable -> L7c
            r1.setContext(r5)
            return r0
        L52f:
            int r6 = r4.token()     // Catch: java.lang.Throwable -> L7c
            r7 = 16
            if (r6 != r7) goto L539
        L537:
            goto L204
        L539:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "syntax error, position at "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r3 = r4.pos()     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            r2.append(r12)     // Catch: java.lang.Throwable -> L7c
            r2.append(r11)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L55a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L560:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L7c
        L566:
            r1.setContext(r5)
            throw r0
    }

    public void parseObject(java.lang.Object r11) {
            r10 = this;
            java.lang.Class r0 = r11.getClass()
            com.alibaba.fastjson.parser.ParserConfig r1 = r10.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r1 = r1.getDeserializer(r0)
            boolean r2 = r1 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            r3 = 0
            if (r2 == 0) goto L12
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r1 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r1
            goto L13
        L12:
            r1 = r3
        L13:
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            int r2 = r2.token()
            r4 = 12
            r5 = 16
            if (r2 == r4) goto L45
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            int r2 = r2.token()
            if (r2 != r5) goto L28
            goto L45
        L28:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "syntax error, expect {, actual "
            r0.append(r1)
            com.alibaba.fastjson.parser.JSONLexer r1 = r10.lexer
            java.lang.String r1 = r1.tokenName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L45:
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            com.alibaba.fastjson.parser.SymbolTable r4 = r10.symbolTable
            java.lang.String r2 = r2.scanSymbol(r4)
            r4 = 13
            if (r2 != 0) goto L72
            com.alibaba.fastjson.parser.JSONLexer r6 = r10.lexer
            int r6 = r6.token()
            if (r6 != r4) goto L5f
            com.alibaba.fastjson.parser.JSONLexer r11 = r10.lexer
            r11.nextToken(r5)
            return
        L5f:
            com.alibaba.fastjson.parser.JSONLexer r6 = r10.lexer
            int r6 = r6.token()
            if (r6 != r5) goto L72
            com.alibaba.fastjson.parser.JSONLexer r6 = r10.lexer
            com.alibaba.fastjson.parser.Feature r7 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas
            boolean r6 = r6.isEnabled(r7)
            if (r6 == 0) goto L72
            goto L45
        L72:
            if (r1 == 0) goto L79
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r6 = r1.getFieldDeserializer(r2)
            goto L7a
        L79:
            r6 = r3
        L7a:
            if (r6 != 0) goto Lbf
            com.alibaba.fastjson.parser.JSONLexer r6 = r10.lexer
            com.alibaba.fastjson.parser.Feature r7 = com.alibaba.fastjson.parser.Feature.IgnoreNotMatch
            boolean r6 = r6.isEnabled(r7)
            if (r6 == 0) goto L9c
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            r2.nextTokenWithColon()
            r10.parse()
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            int r2 = r2.token()
            if (r2 != r4) goto L45
            com.alibaba.fastjson.parser.JSONLexer r11 = r10.lexer
            r11.nextToken()
            return
        L9c:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "setter not found, class "
            r1.append(r3)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = ", property "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        Lbf:
            com.alibaba.fastjson.util.FieldInfo r2 = r6.fieldInfo
            java.lang.Class<?> r7 = r2.fieldClass
            java.lang.reflect.Type r2 = r2.fieldType
            java.lang.Class r8 = java.lang.Integer.TYPE
            r9 = 2
            if (r7 != r8) goto Ld6
            com.alibaba.fastjson.parser.JSONLexer r7 = r10.lexer
            r7.nextTokenWithColon(r9)
            com.alibaba.fastjson.serializer.IntegerCodec r7 = com.alibaba.fastjson.serializer.IntegerCodec.instance
            java.lang.Object r2 = r7.deserialze(r10, r2, r3)
            goto L108
        Ld6:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 != r8) goto Le5
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            r7 = 4
            r2.nextTokenWithColon(r7)
            java.lang.Object r2 = com.alibaba.fastjson.serializer.StringCodec.deserialze(r10)
            goto L108
        Le5:
            java.lang.Class r8 = java.lang.Long.TYPE
            if (r7 != r8) goto Lf5
            com.alibaba.fastjson.parser.JSONLexer r7 = r10.lexer
            r7.nextTokenWithColon(r9)
            com.alibaba.fastjson.serializer.LongCodec r7 = com.alibaba.fastjson.serializer.LongCodec.instance
            java.lang.Object r2 = r7.deserialze(r10, r2, r3)
            goto L108
        Lf5:
            com.alibaba.fastjson.parser.ParserConfig r8 = r10.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r7 = r8.getDeserializer(r7, r2)
            com.alibaba.fastjson.parser.JSONLexer r8 = r10.lexer
            int r9 = r7.getFastMatchToken()
            r8.nextTokenWithColon(r9)
            java.lang.Object r2 = r7.deserialze(r10, r2, r3)
        L108:
            r6.setValue(r11, r2)
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            int r2 = r2.token()
            if (r2 != r5) goto L115
            goto L45
        L115:
            com.alibaba.fastjson.parser.JSONLexer r2 = r10.lexer
            int r2 = r2.token()
            if (r2 != r4) goto L45
            com.alibaba.fastjson.parser.JSONLexer r11 = r10.lexer
            r11.nextToken(r5)
            return
    }

    public void popContext() {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.DisableCircularReferenceDetect
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            com.alibaba.fastjson.parser.ParseContext r0 = r3.context
            com.alibaba.fastjson.parser.ParseContext r0 = r0.parent
            r3.context = r0
            int r0 = r3.contextArrayIndex
            if (r0 > 0) goto L16
        L15:
            return
        L16:
            int r0 = r0 + (-1)
            r3.contextArrayIndex = r0
            com.alibaba.fastjson.parser.ParseContext[] r1 = r3.contextArray
            r2 = 0
            r1[r0] = r2
            return
    }

    public void setConfig(com.alibaba.fastjson.parser.ParserConfig r1) {
            r0 = this;
            r0.config = r1
            return
    }

    public com.alibaba.fastjson.parser.ParseContext setContext(com.alibaba.fastjson.parser.ParseContext r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r2.lexer
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.DisableCircularReferenceDetect
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.alibaba.fastjson.parser.ParseContext r0 = new com.alibaba.fastjson.parser.ParseContext
            r0.<init>(r3, r4, r5)
            r2.context = r0
            r2.addContext(r0)
            com.alibaba.fastjson.parser.ParseContext r3 = r2.context
            return r3
    }

    public com.alibaba.fastjson.parser.ParseContext setContext(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r2.lexer
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.DisableCircularReferenceDetect
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.alibaba.fastjson.parser.ParseContext r0 = r2.context
            com.alibaba.fastjson.parser.ParseContext r3 = r2.setContext(r0, r3, r4)
            return r3
    }

    public void setContext(com.alibaba.fastjson.parser.ParseContext r3) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r2.lexer
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.DisableCircularReferenceDetect
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            r2.context = r3
            return
    }

    public void setDateFomrat(java.text.DateFormat r1) {
            r0 = this;
            r0.dateFormat = r1
            return
    }

    public void setDateFormat(java.lang.String r1) {
            r0 = this;
            r0.dateFormatPattern = r1
            r1 = 0
            r0.dateFormat = r1
            return
    }

    public void setFieldTypeResolver(com.alibaba.fastjson.parser.deserializer.FieldTypeResolver r1) {
            r0 = this;
            r0.fieldTypeResolver = r1
            return
    }

    public void setResolveStatus(int r1) {
            r0 = this;
            r0.resolveStatus = r1
            return
    }

    public void throwException(int r4) {
            r3 = this;
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "syntax error, expect "
            r1.append(r2)
            java.lang.String r4 = com.alibaba.fastjson.parser.JSONToken.name(r4)
            r1.append(r4)
            java.lang.String r4 = ", actual "
            r1.append(r4)
            com.alibaba.fastjson.parser.JSONLexer r4 = r3.lexer
            int r4 = r4.token()
            java.lang.String r4 = com.alibaba.fastjson.parser.JSONToken.name(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
