package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MiscCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.MiscCodec instance = null;
    private static java.lang.reflect.Method method_paths_get;
    private static boolean method_paths_get_error;

    static {
            com.alibaba.fastjson.serializer.MiscCodec r0 = new com.alibaba.fastjson.serializer.MiscCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.MiscCodec.instance = r0
            r0 = 0
            com.alibaba.fastjson.serializer.MiscCodec.method_paths_get_error = r0
            return
    }

    public MiscCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r11, java.lang.reflect.Type r12, java.lang.Object r13) {
            r10 = this;
            java.lang.String r13 = "Path deserialize erorr"
            com.alibaba.fastjson.parser.JSONLexer r0 = r11.lexer
            java.lang.Class<java.net.InetSocketAddress> r1 = java.net.InetSocketAddress.class
            r2 = 13
            r3 = 16
            r4 = 2
            java.lang.Class<java.net.InetAddress> r5 = java.net.InetAddress.class
            r6 = 0
            r7 = 17
            r8 = 0
            if (r12 != r1) goto L79
            int r12 = r0.token()
            r13 = 8
            if (r12 != r13) goto L1f
            r0.nextToken()
            return r8
        L1f:
            r12 = 12
            r11.accept(r12)
        L24:
            java.lang.String r12 = r0.stringVal()
            r0.nextToken(r7)
            java.lang.String r13 = "address"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L3e
            r11.accept(r7)
            java.lang.Object r12 = r11.parseObject(r5)
            java.net.InetAddress r12 = (java.net.InetAddress) r12
            r8 = r12
            goto L66
        L3e:
            java.lang.String r13 = "port"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L60
            r11.accept(r7)
            int r12 = r0.token()
            if (r12 != r4) goto L58
            int r12 = r0.intValue()
            r0.nextToken()
            r6 = r12
            goto L66
        L58:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.String r12 = "port is not int"
            r11.<init>(r12)
            throw r11
        L60:
            r11.accept(r7)
            r11.parse()
        L66:
            int r12 = r0.token()
            if (r12 != r3) goto L70
            r0.nextToken()
            goto L24
        L70:
            r11.accept(r2)
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r8, r6)
            return r11
        L79:
            int r1 = r11.resolveStatus
            if (r1 != r4) goto Lb1
            r11.resolveStatus = r6
            r11.accept(r3)
            int r1 = r0.token()
            r3 = 4
            java.lang.String r9 = "syntax error"
            if (r1 != r3) goto Lab
            java.lang.String r1 = "val"
            java.lang.String r3 = r0.stringVal()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La5
            r0.nextToken()
            r11.accept(r7)
            java.lang.Object r1 = r11.parse()
            r11.accept(r2)
            goto Lb5
        La5:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            r11.<init>(r9)
            throw r11
        Lab:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            r11.<init>(r9)
            throw r11
        Lb1:
            java.lang.Object r1 = r11.parse()
        Lb5:
            java.lang.Class<java.util.Currency> r2 = java.util.Currency.class
            if (r1 != 0) goto Lbb
            r1 = r8
            goto Lc1
        Lbb:
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L207
            java.lang.String r1 = (java.lang.String) r1
        Lc1:
            if (r1 == 0) goto L206
            int r3 = r1.length()
            if (r3 != 0) goto Lcb
            goto L206
        Lcb:
            java.lang.Class<java.util.UUID> r3 = java.util.UUID.class
            if (r12 != r3) goto Ld4
            java.util.UUID r11 = java.util.UUID.fromString(r1)
            return r11
        Ld4:
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r12 != r3) goto Ldd
            java.net.URI r11 = java.net.URI.create(r1)
            return r11
        Ldd:
            java.lang.Class<java.net.URL> r3 = java.net.URL.class
            if (r12 != r3) goto Lf0
            java.net.URL r11 = new java.net.URL     // Catch: java.net.MalformedURLException -> Le7
            r11.<init>(r1)     // Catch: java.net.MalformedURLException -> Le7
            return r11
        Le7:
            r11 = move-exception
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            java.lang.String r13 = "create url error"
            r12.<init>(r13, r11)
            throw r12
        Lf0:
            java.lang.Class<java.util.regex.Pattern> r3 = java.util.regex.Pattern.class
            if (r12 != r3) goto Lf9
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r1)
            return r11
        Lf9:
            java.lang.Class<java.util.Locale> r3 = java.util.Locale.class
            if (r12 != r3) goto L102
            java.util.Locale r11 = com.alibaba.fastjson.util.TypeUtils.toLocale(r1)
            return r11
        L102:
            java.lang.Class<java.text.SimpleDateFormat> r3 = java.text.SimpleDateFormat.class
            if (r12 != r3) goto L117
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.util.Locale r12 = r0.getLocale()
            r11.<init>(r1, r12)
            java.util.TimeZone r12 = r0.getTimeZone()
            r11.setTimeZone(r12)
            return r11
        L117:
            if (r12 == r5) goto L1f8
            java.lang.Class<java.net.Inet4Address> r0 = java.net.Inet4Address.class
            if (r12 == r0) goto L1f8
            java.lang.Class<java.net.Inet6Address> r0 = java.net.Inet6Address.class
            if (r12 != r0) goto L123
            goto L1f8
        L123:
            java.lang.Class<java.io.File> r0 = java.io.File.class
            if (r12 != r0) goto L12d
            java.io.File r11 = new java.io.File
            r11.<init>(r1)
            return r11
        L12d:
            java.lang.Class<java.util.TimeZone> r0 = java.util.TimeZone.class
            if (r12 != r0) goto L136
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r1)
            return r11
        L136:
            boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L140
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r12 = r12.getRawType()
        L140:
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            if (r12 != r0) goto L151
            com.alibaba.fastjson.parser.ParserConfig r11 = r11.getConfig()
            java.lang.ClassLoader r11 = r11.getDefaultClassLoader()
            java.lang.Class r11 = com.alibaba.fastjson.util.TypeUtils.loadClass(r1, r11)
            return r11
        L151:
            java.lang.Class<java.nio.charset.Charset> r11 = java.nio.charset.Charset.class
            if (r12 != r11) goto L15a
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r1)
            return r11
        L15a:
            if (r12 != r2) goto L161
            java.util.Currency r11 = java.util.Currency.getInstance(r1)
            return r11
        L161:
            java.lang.Class<com.alibaba.fastjson.JSONPath> r11 = com.alibaba.fastjson.JSONPath.class
            if (r12 != r11) goto L16b
            com.alibaba.fastjson.JSONPath r11 = new com.alibaba.fastjson.JSONPath
            r11.<init>(r1)
            return r11
        L16b:
            boolean r11 = r12 instanceof java.lang.Class
            java.lang.String r0 = "MiscCodec not support "
            if (r11 == 0) goto L1df
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.String r11 = r12.getName()
            java.lang.String r12 = "java.nio.file.Path"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L1ca
            r12 = 1
            java.lang.reflect.Method r2 = com.alibaba.fastjson.serializer.MiscCodec.method_paths_get     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            if (r2 != 0) goto L1a5
            boolean r2 = com.alibaba.fastjson.serializer.MiscCodec.method_paths_get_error     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            if (r2 != 0) goto L1a5
            java.lang.String r2 = "java.nio.file.Paths"
            java.lang.Class r2 = com.alibaba.fastjson.util.TypeUtils.loadClass(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            java.lang.String r3 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r5[r6] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r5[r12] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            com.alibaba.fastjson.serializer.MiscCodec.method_paths_get = r2     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            goto L1a5
        L1a1:
            r11 = move-exception
            goto L1bc
        L1a3:
            r11 = move-exception
            goto L1c2
        L1a5:
            java.lang.reflect.Method r2 = com.alibaba.fastjson.serializer.MiscCodec.method_paths_get     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            if (r2 == 0) goto L1b6
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            r4[r6] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            r4[r12] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            java.lang.Object r11 = r2.invoke(r8, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            return r11
        L1b6:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            r1.<init>(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
            throw r1     // Catch: java.lang.reflect.InvocationTargetException -> L1a1 java.lang.IllegalAccessException -> L1a3 java.lang.NoSuchMethodException -> L1c8
        L1bc:
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            r12.<init>(r13, r11)
            throw r12
        L1c2:
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            r12.<init>(r13, r11)
            throw r12
        L1c8:
            com.alibaba.fastjson.serializer.MiscCodec.method_paths_get_error = r12
        L1ca:
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L1df:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r12 = r12.toString()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L1f8:
            java.net.InetAddress r11 = java.net.InetAddress.getByName(r1)     // Catch: java.net.UnknownHostException -> L1fd
            return r11
        L1fd:
            r11 = move-exception
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            java.lang.String r13 = "deserialize inet adress error"
            r12.<init>(r13, r11)
            throw r12
        L206:
            return r8
        L207:
            boolean r11 = r1 instanceof com.alibaba.fastjson.JSONObject
            if (r11 == 0) goto L23a
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            if (r12 != r2) goto L229
            java.lang.String r11 = "currency"
            java.lang.String r11 = r1.getString(r11)
            if (r11 == 0) goto L21c
            java.util.Currency r11 = java.util.Currency.getInstance(r11)
            return r11
        L21c:
            java.lang.String r11 = "symbol"
            java.lang.String r11 = r1.getString(r11)
            if (r11 == 0) goto L229
            java.util.Currency r11 = java.util.Currency.getInstance(r11)
            return r11
        L229:
            java.lang.Class<java.util.Map$Entry> r11 = java.util.Map.Entry.class
            if (r12 != r11) goto L23a
            java.util.Set r11 = r1.entrySet()
            java.util.Iterator r11 = r11.iterator()
            java.lang.Object r11 = r11.next()
            return r11
        L23a:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.String r12 = "expect string"
            r11.<init>(r12)
            throw r11
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, int r9) throws java.io.IOException {
            r4 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r7 = r5.out
            if (r6 != 0) goto L8
            r7.writeNull()
            return
        L8:
            java.lang.Class r9 = r6.getClass()
            java.lang.Class<java.text.SimpleDateFormat> r0 = java.text.SimpleDateFormat.class
            r1 = 44
            r2 = 125(0x7d, float:1.75E-43)
            r3 = 123(0x7b, float:1.72E-43)
            if (r9 != r0) goto L47
            r9 = r6
            java.text.SimpleDateFormat r9 = (java.text.SimpleDateFormat) r9
            java.lang.String r9 = r9.toPattern()
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r0 = r7.isEnabled(r0)
            if (r0 == 0) goto La7
            java.lang.Class r0 = r6.getClass()
            if (r0 == r8) goto La7
            r7.write(r3)
            java.lang.String r8 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            r7.writeFieldName(r8)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r5.write(r6)
            java.lang.String r5 = "val"
            r7.writeFieldValue(r1, r5, r9)
            r7.write(r2)
            return
        L47:
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            if (r9 != r8) goto L52
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.String r9 = r6.getName()
            goto La7
        L52:
            java.lang.Class<java.net.InetSocketAddress> r8 = java.net.InetSocketAddress.class
            if (r9 != r8) goto L7c
            java.net.InetSocketAddress r6 = (java.net.InetSocketAddress) r6
            java.net.InetAddress r8 = r6.getAddress()
            r7.write(r3)
            if (r8 == 0) goto L6c
            java.lang.String r9 = "address"
            r7.writeFieldName(r9)
            r5.write(r8)
            r7.write(r1)
        L6c:
            java.lang.String r5 = "port"
            r7.writeFieldName(r5)
            int r5 = r6.getPort()
            r7.writeInt(r5)
            r7.write(r2)
            return
        L7c:
            boolean r8 = r6 instanceof java.io.File
            if (r8 == 0) goto L87
            java.io.File r6 = (java.io.File) r6
            java.lang.String r9 = r6.getPath()
            goto La7
        L87:
            boolean r8 = r6 instanceof java.net.InetAddress
            if (r8 == 0) goto L92
            java.net.InetAddress r6 = (java.net.InetAddress) r6
            java.lang.String r9 = r6.getHostAddress()
            goto La7
        L92:
            boolean r8 = r6 instanceof java.util.TimeZone
            if (r8 == 0) goto L9d
            java.util.TimeZone r6 = (java.util.TimeZone) r6
            java.lang.String r9 = r6.getID()
            goto La7
        L9d:
            boolean r8 = r6 instanceof java.util.Currency
            if (r8 == 0) goto Lab
            java.util.Currency r6 = (java.util.Currency) r6
            java.lang.String r9 = r6.getCurrencyCode()
        La7:
            r7.writeString(r9)
            return
        Lab:
            boolean r8 = r6 instanceof com.alibaba.fastjson.JSONStreamAware
            if (r8 == 0) goto Lb5
            com.alibaba.fastjson.JSONStreamAware r6 = (com.alibaba.fastjson.JSONStreamAware) r6
            r6.writeJSONString(r7)
            return
        Lb5:
            boolean r8 = r6 instanceof java.util.Iterator
            if (r8 == 0) goto Lbf
            java.util.Iterator r6 = (java.util.Iterator) r6
            r4.writeIterator(r5, r7, r6)
            return
        Lbf:
            boolean r8 = r6 instanceof java.lang.Iterable
            if (r8 == 0) goto Lcd
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r4.writeIterator(r5, r7, r6)
            return
        Lcd:
            boolean r8 = r6 instanceof java.util.Map.Entry
            if (r8 == 0) goto L107
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto Lf5
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r6 instanceof java.lang.String
            if (r9 == 0) goto Leb
            java.lang.String r6 = (java.lang.String) r6
            r7.writeFieldValueStringWithDoubleQuoteCheck(r3, r8, r6)
            goto L103
        Leb:
            r7.write(r3)
            r7.writeFieldName(r8)
            r5.write(r6)
            goto L103
        Lf5:
            r7.write(r3)
            r5.write(r8)
            r8 = 58
            r7.write(r8)
            r5.write(r6)
        L103:
            r7.write(r2)
            return
        L107:
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "net.sf.json.JSONNull"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L11b
            r7.writeNull()
            return
        L11b:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "not support class : "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    protected void writeIterator(com.alibaba.fastjson.serializer.JSONSerializer r3, com.alibaba.fastjson.serializer.SerializeWriter r4, java.util.Iterator<?> r5) {
            r2 = this;
            r0 = 91
            r4.write(r0)
            r0 = 0
        L6:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L1d
            if (r0 == 0) goto L13
            r1 = 44
            r4.write(r1)
        L13:
            java.lang.Object r1 = r5.next()
            r3.write(r1)
            int r0 = r0 + 1
            goto L6
        L1d:
            r3 = 93
            r4.write(r3)
            return
    }
}
