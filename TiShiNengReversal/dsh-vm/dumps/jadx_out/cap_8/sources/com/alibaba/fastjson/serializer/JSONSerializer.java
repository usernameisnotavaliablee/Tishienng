package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONSerializer extends com.alibaba.fastjson.serializer.SerializeFilterable {
    protected final com.alibaba.fastjson.serializer.SerializeConfig config;
    protected com.alibaba.fastjson.serializer.SerialContext context;
    private java.text.DateFormat dateFormat;
    private java.lang.String dateFormatPattern;
    private java.lang.String indent;
    private int indentCount;
    protected java.util.Locale locale;
    public final com.alibaba.fastjson.serializer.SerializeWriter out;
    protected java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> references;
    protected java.util.TimeZone timeZone;

    public JSONSerializer() {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>()
            com.alibaba.fastjson.serializer.SerializeConfig r1 = com.alibaba.fastjson.serializer.SerializeConfig.getGlobalInstance()
            r2.<init>(r0, r1)
            return
    }

    public JSONSerializer(com.alibaba.fastjson.serializer.SerializeConfig r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>()
            r1.<init>(r0, r2)
            return
    }

    public JSONSerializer(com.alibaba.fastjson.serializer.SerializeWriter r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = com.alibaba.fastjson.serializer.SerializeConfig.getGlobalInstance()
            r1.<init>(r2, r0)
            return
    }

    public JSONSerializer(com.alibaba.fastjson.serializer.SerializeWriter r2, com.alibaba.fastjson.serializer.SerializeConfig r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.indentCount = r0
            java.lang.String r0 = "\t"
            r1.indent = r0
            r0 = 0
            r1.references = r0
            java.util.TimeZone r0 = com.alibaba.fastjson.JSON.defaultTimeZone
            r1.timeZone = r0
            java.util.Locale r0 = com.alibaba.fastjson.JSON.defaultLocale
            r1.locale = r0
            r1.out = r2
            r1.config = r3
            return
    }

    public static void write(com.alibaba.fastjson.serializer.SerializeWriter r1, java.lang.Object r2) {
            com.alibaba.fastjson.serializer.JSONSerializer r0 = new com.alibaba.fastjson.serializer.JSONSerializer
            r0.<init>(r1)
            r0.write(r2)
            return
    }

    public static void write(java.io.Writer r2, java.lang.Object r3) {
            com.alibaba.fastjson.serializer.SerializeWriter r0 = new com.alibaba.fastjson.serializer.SerializeWriter
            r0.<init>()
            com.alibaba.fastjson.serializer.JSONSerializer r1 = new com.alibaba.fastjson.serializer.JSONSerializer     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            r1.write(r3)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            r0.writeTo(r2)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            r0.close()
            return
        L14:
            r2 = move-exception
            goto L21
        L16:
            r2 = move-exception
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L14
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L21:
            r0.close()
            throw r2
    }

    public boolean checkValue(com.alibaba.fastjson.serializer.SerializeFilterable r2) {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r0 = r1.valueFilters
            if (r0 == 0) goto La
            int r0 = r0.size()
            if (r0 > 0) goto L2e
        La:
            java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> r0 = r1.contextValueFilters
            if (r0 == 0) goto L14
            int r0 = r0.size()
            if (r0 > 0) goto L2e
        L14:
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r0 = r2.valueFilters
            if (r0 == 0) goto L1e
            int r0 = r0.size()
            if (r0 > 0) goto L2e
        L1e:
            java.util.List<com.alibaba.fastjson.serializer.ContextValueFilter> r2 = r2.contextValueFilters
            if (r2 == 0) goto L28
            int r2 = r2.size()
            if (r2 > 0) goto L2e
        L28:
            com.alibaba.fastjson.serializer.SerializeWriter r2 = r1.out
            boolean r2 = r2.writeNonStringValueAsString
            if (r2 == 0) goto L30
        L2e:
            r2 = 1
            return r2
        L30:
            r2 = 0
            return r2
    }

    public void close() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            r0.close()
            return
    }

    public void config(com.alibaba.fastjson.serializer.SerializerFeature r2, boolean r3) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            r0.config(r2, r3)
            return
    }

    public boolean containsReference(java.lang.Object r3) {
            r2 = this;
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r0 = r2.references
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r3 = r0.get(r3)
            com.alibaba.fastjson.serializer.SerialContext r3 = (com.alibaba.fastjson.serializer.SerialContext) r3
            if (r3 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r3 = r3.fieldName
            if (r3 == 0) goto L1d
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L1d
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return r1
        L1d:
            r3 = 1
            return r3
    }

    public void decrementIdent() {
            r1 = this;
            int r0 = r1.indentCount
            int r0 = r0 + (-1)
            r1.indentCount = r0
            return
    }

    public com.alibaba.fastjson.serializer.SerialContext getContext() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r1.context
            return r0
    }

    public java.text.DateFormat getDateFormat() {
            r3 = this;
            java.text.DateFormat r0 = r3.dateFormat
            if (r0 != 0) goto L18
            java.lang.String r0 = r3.dateFormatPattern
            if (r0 == 0) goto L18
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = r3.dateFormatPattern
            java.util.Locale r2 = r3.locale
            r0.<init>(r1, r2)
            r3.dateFormat = r0
            java.util.TimeZone r1 = r3.timeZone
            r0.setTimeZone(r1)
        L18:
            java.text.DateFormat r0 = r3.dateFormat
            return r0
    }

    public java.lang.String getDateFormatPattern() {
            r2 = this;
            java.text.DateFormat r0 = r2.dateFormat
            boolean r1 = r0 instanceof java.text.SimpleDateFormat
            if (r1 == 0) goto Ld
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0
            java.lang.String r0 = r0.toPattern()
            return r0
        Ld:
            java.lang.String r0 = r2.dateFormatPattern
            return r0
    }

    public int getIndentCount() {
            r1 = this;
            int r0 = r1.indentCount
            return r0
    }

    public com.alibaba.fastjson.serializer.SerializeConfig getMapping() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r1.config
            return r0
    }

    public com.alibaba.fastjson.serializer.ObjectSerializer getObjectWriter(java.lang.Class<?> r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r1.config
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = r0.getObjectWriter(r2)
            return r2
    }

    public com.alibaba.fastjson.serializer.SerializeWriter getWriter() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            return r0
    }

    public boolean hasNameFilters(com.alibaba.fastjson.serializer.SerializeFilterable r2) {
            r1 = this;
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r0 = r1.nameFilters
            if (r0 == 0) goto La
            int r0 = r0.size()
            if (r0 > 0) goto L14
        La:
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r2 = r2.nameFilters
            if (r2 == 0) goto L16
            int r2 = r2.size()
            if (r2 <= 0) goto L16
        L14:
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public void incrementIndent() {
            r1 = this;
            int r0 = r1.indentCount
            int r0 = r0 + 1
            r1.indentCount = r0
            return
    }

    public boolean isEnabled(com.alibaba.fastjson.serializer.SerializerFeature r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            boolean r2 = r0.isEnabled(r2)
            return r2
    }

    public final boolean isWriteClassName(java.lang.reflect.Type r2, java.lang.Object r3) {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r1.out
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r3 = r3.isEnabled(r0)
            if (r3 == 0) goto L1e
            if (r2 != 0) goto L1c
            com.alibaba.fastjson.serializer.SerializeWriter r2 = r1.out
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteRootClassName
            boolean r2 = r2.isEnabled(r3)
            if (r2 == 0) goto L1c
            com.alibaba.fastjson.serializer.SerialContext r2 = r1.context
            com.alibaba.fastjson.serializer.SerialContext r2 = r2.parent
            if (r2 == 0) goto L1e
        L1c:
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public void popContext() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r1.context
            if (r0 == 0) goto L8
            com.alibaba.fastjson.serializer.SerialContext r0 = r0.parent
            r1.context = r0
        L8:
            return
    }

    public void println() {
            r3 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.out
            r1 = 10
            r0.write(r1)
            r0 = 0
        L8:
            int r1 = r3.indentCount
            if (r0 >= r1) goto L16
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r3.out
            java.lang.String r2 = r3.indent
            r1.write(r2)
            int r0 = r0 + 1
            goto L8
        L16:
            return
    }

    public void setContext(com.alibaba.fastjson.serializer.SerialContext r1) {
            r0 = this;
            r0.context = r1
            return
    }

    public void setContext(com.alibaba.fastjson.serializer.SerialContext r7, java.lang.Object r8, java.lang.Object r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setContext(r1, r2, r3, r4, r5)
            return
    }

    public void setContext(com.alibaba.fastjson.serializer.SerialContext r8, java.lang.Object r9, java.lang.Object r10, int r11, int r12) {
            r7 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r7.out
            boolean r0 = r0.disableCircularReferenceDetect
            if (r0 == 0) goto L7
            return
        L7:
            com.alibaba.fastjson.serializer.SerialContext r1 = new com.alibaba.fastjson.serializer.SerialContext
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.context = r1
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r8 = r7.references
            if (r8 != 0) goto L1e
            java.util.IdentityHashMap r8 = new java.util.IdentityHashMap
            r8.<init>()
            r7.references = r8
        L1e:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r8 = r7.references
            com.alibaba.fastjson.serializer.SerialContext r9 = r7.context
            r8.put(r3, r9)
            return
    }

    public void setContext(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r2.context
            r1 = 0
            r2.setContext(r0, r3, r4, r1)
            return
    }

    public void setDateFormat(java.lang.String r1) {
            r0 = this;
            r0.dateFormatPattern = r1
            java.text.DateFormat r1 = r0.dateFormat
            if (r1 == 0) goto L9
            r1 = 0
            r0.dateFormat = r1
        L9:
            return
    }

    public void setDateFormat(java.text.DateFormat r1) {
            r0 = this;
            r0.dateFormat = r1
            java.lang.String r1 = r0.dateFormatPattern
            if (r1 == 0) goto L9
            r1 = 0
            r0.dateFormatPattern = r1
        L9:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void write(java.lang.Object r8) {
            r7 = this;
            if (r8 != 0) goto L8
            com.alibaba.fastjson.serializer.SerializeWriter r8 = r7.out
            r8.writeNull()
            return
        L8:
            java.lang.Class r0 = r8.getClass()
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = r7.getObjectWriter(r0)
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r7
            r3 = r8
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L19
            return
        L19:
            r0 = move-exception
            r8 = r0
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = r8.getMessage()
            r0.<init>(r1, r8)
            throw r0
    }

    public final void write(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.StringCodec r0 = com.alibaba.fastjson.serializer.StringCodec.instance
            r0.write(r1, r2)
            return
    }

    protected final void writeKeyValue(char r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            if (r2 == 0) goto L7
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            r0.write(r2)
        L7:
            com.alibaba.fastjson.serializer.SerializeWriter r2 = r1.out
            r2.writeFieldName(r3)
            r1.write(r4)
            return
    }

    public void writeNull() {
            r1 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            r0.writeNull()
            return
    }

    public void writeReference(java.lang.Object r3) {
            r2 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r2.context
            java.lang.Object r1 = r0.object
            if (r3 != r1) goto Le
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out
            java.lang.String r0 = "{\"$ref\":\"@\"}"
            r3.write(r0)
            return
        Le:
            com.alibaba.fastjson.serializer.SerialContext r1 = r0.parent
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r1.object
            if (r3 != r1) goto L1e
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out
            java.lang.String r0 = "{\"$ref\":\"..\"}"
            r3.write(r0)
            return
        L1e:
            com.alibaba.fastjson.serializer.SerialContext r1 = r0.parent
            if (r1 != 0) goto L4e
            java.lang.Object r0 = r0.object
            if (r3 != r0) goto L2e
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out
            java.lang.String r0 = "{\"$ref\":\"$\"}"
            r3.write(r0)
            return
        L2e:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r2.out
            java.lang.String r1 = "{\"$ref\":\""
            r0.write(r1)
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r2.out
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r1 = r2.references
            java.lang.Object r3 = r1.get(r3)
            com.alibaba.fastjson.serializer.SerialContext r3 = (com.alibaba.fastjson.serializer.SerialContext) r3
            java.lang.String r3 = r3.toString()
            r0.write(r3)
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out
            java.lang.String r0 = "\"}"
            r3.write(r0)
            return
        L4e:
            r0 = r1
            goto L1e
    }

    public final void writeWithFieldName(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.writeWithFieldName(r3, r4, r0, r1)
            return
    }

    public final void writeWithFieldName(java.lang.Object r8, java.lang.Object r9, java.lang.reflect.Type r10, int r11) {
            r7 = this;
            if (r8 != 0) goto Lb
            com.alibaba.fastjson.serializer.SerializeWriter r8 = r7.out     // Catch: java.io.IOException -> L8
            r8.writeNull()     // Catch: java.io.IOException -> L8
            return
        L8:
            r0 = move-exception
            r8 = r0
            goto L1c
        Lb:
            java.lang.Class r0 = r8.getClass()     // Catch: java.io.IOException -> L8
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = r7.getObjectWriter(r0)     // Catch: java.io.IOException -> L8
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8
            return
        L1c:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.String r10 = r8.getMessage()
            r9.<init>(r10, r8)
            throw r9
    }

    public final void writeWithFormat(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Date
            if (r0 == 0) goto L22
            java.text.DateFormat r0 = r3.getDateFormat()
            if (r0 != 0) goto L16
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = r3.locale
            r0.<init>(r5, r1)
            java.util.TimeZone r5 = r3.timeZone
            r0.setTimeZone(r5)
        L16:
            java.util.Date r4 = (java.util.Date) r4
            java.lang.String r4 = r0.format(r4)
            com.alibaba.fastjson.serializer.SerializeWriter r5 = r3.out
            r5.writeString(r4)
            return
        L22:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L89
            byte[] r4 = (byte[]) r4
            java.lang.String r0 = "gzip"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "gzip,base64"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L39
            goto L4d
        L39:
            java.lang.String r0 = "hex"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L47
            com.alibaba.fastjson.serializer.SerializeWriter r5 = r3.out
            r5.writeHex(r4)
            return
        L47:
            com.alibaba.fastjson.serializer.SerializeWriter r5 = r3.out
            r5.writeByteArray(r4)
            return
        L4d:
            r5 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            int r1 = r4.length     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2 = 512(0x200, float:7.17E-43)
            if (r1 >= r2) goto L64
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            int r2 = r4.length     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
        L5e:
            r5 = r1
            goto L6a
        L60:
            r4 = move-exception
            goto L85
        L62:
            r4 = move-exception
            goto L7d
        L64:
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            goto L5e
        L6a:
            r5.write(r4)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r5.finish()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            com.alibaba.fastjson.serializer.SerializeWriter r4 = r3.out     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r4.writeByteArray(r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            com.alibaba.fastjson.util.IOUtils.close(r5)
            return
        L7d:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "write gzipBytes error"
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L85:
            com.alibaba.fastjson.util.IOUtils.close(r5)
            throw r4
        L89:
            r3.write(r4)
            return
    }
}
