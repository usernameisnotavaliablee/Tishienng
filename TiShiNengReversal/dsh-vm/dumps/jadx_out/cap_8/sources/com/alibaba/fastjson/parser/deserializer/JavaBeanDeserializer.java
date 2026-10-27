package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JavaBeanDeserializer implements com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    private final java.util.Map<java.lang.String, com.alibaba.fastjson.parser.deserializer.FieldDeserializer> alterNameFieldDeserializers;
    public final com.alibaba.fastjson.util.JavaBeanInfo beanInfo;
    protected final java.lang.Class<?> clazz;
    private java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> extraFieldDeserializers;
    private final com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] fieldDeserializers;
    protected final com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] sortedFieldDeserializers;

    public JavaBeanDeserializer(com.alibaba.fastjson.parser.ParserConfig r10, com.alibaba.fastjson.util.JavaBeanInfo r11) {
            r9 = this;
            r9.<init>()
            java.lang.Class<?> r0 = r11.clazz
            r9.clazz = r0
            r9.beanInfo = r11
            com.alibaba.fastjson.util.FieldInfo[] r0 = r11.sortedFields
            int r1 = r0.length
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r1 = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[r1]
            r9.sortedFieldDeserializers = r1
            int r0 = r0.length
            r1 = 0
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r0) goto L3a
            com.alibaba.fastjson.util.FieldInfo[] r4 = r11.sortedFields
            r4 = r4[r3]
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r5 = r10.createFieldDeserializer(r10, r11, r4)
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r6 = r9.sortedFieldDeserializers
            r6[r3] = r5
            java.lang.String[] r4 = r4.alternateNames
            int r6 = r4.length
            r7 = 0
        L26:
            if (r7 >= r6) goto L37
            r8 = r4[r7]
            if (r1 != 0) goto L31
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L31:
            r1.put(r8, r5)
            int r7 = r7 + 1
            goto L26
        L37:
            int r3 = r3 + 1
            goto L14
        L3a:
            r9.alterNameFieldDeserializers = r1
            com.alibaba.fastjson.util.FieldInfo[] r10 = r11.fields
            int r0 = r10.length
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r0 = new com.alibaba.fastjson.parser.deserializer.FieldDeserializer[r0]
            r9.fieldDeserializers = r0
            int r10 = r10.length
        L44:
            if (r2 >= r10) goto L57
            com.alibaba.fastjson.util.FieldInfo[] r0 = r11.fields
            r0 = r0[r2]
            java.lang.String r0 = r0.name
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r0 = r9.getFieldDeserializer(r0)
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r1 = r9.fieldDeserializers
            r1[r2] = r0
            int r2 = r2 + 1
            goto L44
        L57:
            return
    }

    public JavaBeanDeserializer(com.alibaba.fastjson.parser.ParserConfig r1, java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>(r1, r2, r2)
            return
    }

    public JavaBeanDeserializer(com.alibaba.fastjson.parser.ParserConfig r4, java.lang.Class<?> r5, java.lang.reflect.Type r6) {
            r3 = this;
            com.alibaba.fastjson.PropertyNamingStrategy r0 = r4.propertyNamingStrategy
            boolean r1 = r4.fieldBased
            boolean r2 = r4.compatibleWithJavaBean
            com.alibaba.fastjson.util.JavaBeanInfo r5 = com.alibaba.fastjson.util.JavaBeanInfo.build(r5, r6, r0, r1, r2)
            r3.<init>(r4, r5)
            return
    }

    static boolean isSetFlag(int r3, int[] r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3 / 32
            int r3 = r3 % 32
            int r2 = r4.length
            if (r1 >= r2) goto L14
            r4 = r4[r1]
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 & r4
            if (r3 == 0) goto L14
            return r1
        L14:
            return r0
    }

    protected static void parseArray(java.util.Collection r6, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r7, com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.reflect.Type r9, java.lang.Object r10) {
            com.alibaba.fastjson.parser.JSONLexer r10 = r8.lexer
            com.alibaba.fastjson.parser.JSONLexerBase r10 = (com.alibaba.fastjson.parser.JSONLexerBase) r10
            int r0 = r10.token()
            r1 = 8
            r2 = 16
            if (r0 != r1) goto L15
            r10.nextToken(r2)
            r10.token()
            return
        L15:
            r1 = 14
            if (r0 == r1) goto L1c
            r8.throwException(r0)
        L1c:
            char r0 = r10.getCurrent()
            r3 = 91
            if (r0 != r3) goto L2b
            r10.next()
            r10.setToken(r1)
            goto L2e
        L2b:
            r10.nextToken(r1)
        L2e:
            int r0 = r10.token()
            r4 = 15
            if (r0 != r4) goto L3a
            r10.nextToken()
            return
        L3a:
            r0 = 0
        L3b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r7.deserialze(r8, r9, r5)
            r6.add(r5)
            int r0 = r0 + 1
            int r5 = r10.token()
            if (r5 != r2) goto L5f
            char r5 = r10.getCurrent()
            if (r5 != r3) goto L5b
            r10.next()
            r10.setToken(r1)
            goto L3b
        L5b:
            r10.nextToken(r1)
            goto L3b
        L5f:
            int r6 = r10.token()
            if (r6 == r4) goto L68
            r8.throwException(r6)
        L68:
            char r6 = r10.getCurrent()
            r7 = 44
            if (r6 != r7) goto L77
            r10.next()
            r10.setToken(r2)
            return
        L77:
            r10.nextToken(r2)
            return
    }

    protected void check(com.alibaba.fastjson.parser.JSONLexer r1, int r2) {
            r0 = this;
            int r1 = r1.token()
            if (r1 != r2) goto L7
            return
        L7:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = "syntax error"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.Object createInstance(com.alibaba.fastjson.parser.DefaultJSONParser r11, java.lang.reflect.Type r12) {
            r10 = this;
            java.lang.String r0 = "create instance error, class "
            boolean r1 = r12 instanceof java.lang.Class
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            java.lang.Class<?> r1 = r10.clazz
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L28
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r11 = r11.getContextClassLoader()
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r12
            java.lang.Object r11 = java.lang.reflect.Proxy.newProxyInstance(r11, r1, r0)
            return r11
        L28:
            com.alibaba.fastjson.util.JavaBeanInfo r1 = r10.beanInfo
            java.lang.reflect.Constructor<?> r4 = r1.defaultConstructor
            r5 = 0
            if (r4 != 0) goto L34
            java.lang.reflect.Method r6 = r1.factoryMethod
            if (r6 != 0) goto L34
            return r5
        L34:
            java.lang.reflect.Method r6 = r1.factoryMethod
            if (r6 == 0) goto L3d
            int r7 = r1.defaultConstructorParameterSize
            if (r7 <= 0) goto L3d
            return r5
        L3d:
            int r1 = r1.defaultConstructorParameterSize     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r1 != 0) goto L55
            if (r4 == 0) goto L4f
            java.lang.Object r12 = r4.newInstance(r5)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            goto Ld2
        L49:
            r11 = move-exception
            goto L125
        L4c:
            r11 = move-exception
            goto L140
        L4f:
            java.lang.Object r12 = r6.invoke(r5, r5)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            goto Ld2
        L55:
            com.alibaba.fastjson.parser.ParseContext r1 = r11.getContext()     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.String r6 = "can't create non-static inner class instance."
            if (r1 == 0) goto L11f
            java.lang.Object r7 = r1.object     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 == 0) goto L11f
            boolean r7 = r12 instanceof java.lang.Class     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 == 0) goto L119
            java.lang.Class r12 = (java.lang.Class) r12     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            r7 = 36
            int r7 = r12.lastIndexOf(r7)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.String r12 = r12.substring(r3, r7)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.Object r7 = r1.object     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.Class r8 = r7.getClass()     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            boolean r9 = r8.equals(r12)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r9 != 0) goto Lc8
            com.alibaba.fastjson.parser.ParseContext r1 = r1.parent     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r1 == 0) goto Lc7
            java.lang.Object r7 = r1.object     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 == 0) goto Lc7
            java.lang.String r7 = "java.util.ArrayList"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 != 0) goto Lb5
            java.lang.String r7 = "java.util.List"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 != 0) goto Lb5
            java.lang.String r7 = "java.util.Collection"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 != 0) goto Lb5
            java.lang.String r7 = "java.util.Map"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 != 0) goto Lb5
            java.lang.String r7 = "java.util.HashMap"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r7 == 0) goto Lc7
        Lb5:
            java.lang.Object r7 = r1.object     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            boolean r12 = r7.equals(r12)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            if (r12 == 0) goto Lc7
            java.lang.Object r5 = r1.object     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
        Lc7:
            r7 = r5
        Lc8:
            if (r7 == 0) goto L113
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            r12[r3] = r7     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            java.lang.Object r12 = r4.newInstance(r12)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
        Ld2:
            if (r11 == 0) goto L112
            com.alibaba.fastjson.parser.JSONLexer r11 = r11.lexer
            com.alibaba.fastjson.parser.Feature r1 = com.alibaba.fastjson.parser.Feature.InitStringFieldAsEmpty
            boolean r11 = r11.isEnabled(r1)
            if (r11 == 0) goto L112
            com.alibaba.fastjson.util.JavaBeanInfo r11 = r10.beanInfo
            com.alibaba.fastjson.util.FieldInfo[] r11 = r11.fields
            int r1 = r11.length
        Le3:
            if (r3 >= r1) goto L112
            r2 = r11[r3]
            java.lang.Class<?> r4 = r2.fieldClass
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L10f
            java.lang.String r4 = ""
            r2.set(r12, r4)     // Catch: java.lang.Exception -> Lf3
            goto L10f
        Lf3:
            r11 = move-exception
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.Class<?> r0 = r10.clazz
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0, r11)
            throw r12
        L10f:
            int r3 = r3 + 1
            goto Le3
        L112:
            return r12
        L113:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            r11.<init>(r6)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            throw r11     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
        L119:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            r11.<init>(r6)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            throw r11     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
        L11f:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            r11.<init>(r6)     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
            throw r11     // Catch: java.lang.Exception -> L49 com.alibaba.fastjson.JSONException -> L4c
        L125:
            com.alibaba.fastjson.JSONException r12 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.Class<?> r0 = r10.clazz
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0, r11)
            throw r12
        L140:
            throw r11
    }

    public java.lang.Object createInstance(java.util.Map<java.lang.String, java.lang.Object> r6, com.alibaba.fastjson.parser.ParserConfig r7) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r5 = this;
            com.alibaba.fastjson.util.JavaBeanInfo r0 = r5.beanInfo
            java.lang.reflect.Constructor<?> r1 = r0.creatorConstructor
            r2 = 0
            if (r1 != 0) goto L57
            java.lang.reflect.Method r1 = r0.factoryMethod
            if (r1 != 0) goto L57
            java.lang.Class<?> r0 = r5.clazz
            java.lang.Object r0 = r5.createInstance(r2, r0)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L19:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r3 = r5.smartMatch(r3)
            if (r3 != 0) goto L36
            goto L19
        L36:
            com.alibaba.fastjson.util.FieldInfo r4 = r3.fieldInfo
            java.lang.reflect.Type r4 = r4.fieldType
            java.lang.Object r1 = com.alibaba.fastjson.util.TypeUtils.cast(r1, r4, r7)
            r3.setValue(r0, r1)
            goto L19
        L42:
            com.alibaba.fastjson.util.JavaBeanInfo r6 = r5.beanInfo
            java.lang.reflect.Method r6 = r6.buildMethod
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.invoke(r0, r2)     // Catch: java.lang.Exception -> L4d
            return r6
        L4d:
            r6 = move-exception
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "build object error"
            r7.<init>(r0, r6)
            throw r7
        L56:
            return r0
        L57:
            com.alibaba.fastjson.util.FieldInfo[] r7 = r0.fields
            int r0 = r7.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3 = 0
        L5d:
            if (r3 >= r0) goto L6c
            r4 = r7[r3]
            java.lang.String r4 = r4.name
            java.lang.Object r4 = r6.get(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5d
        L6c:
            com.alibaba.fastjson.util.JavaBeanInfo r6 = r5.beanInfo
            java.lang.reflect.Constructor<?> r7 = r6.creatorConstructor
            if (r7 == 0) goto L97
            java.lang.Object r6 = r7.newInstance(r1)     // Catch: java.lang.Exception -> L77
            return r6
        L77:
            r6 = move-exception
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "create instance error, "
            r0.append(r1)
            com.alibaba.fastjson.util.JavaBeanInfo r1 = r5.beanInfo
            java.lang.reflect.Constructor<?> r1 = r1.creatorConstructor
            java.lang.String r1 = r1.toGenericString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        L97:
            java.lang.reflect.Method r6 = r6.factoryMethod
            if (r6 == 0) goto Lc0
            java.lang.Object r6 = r6.invoke(r2, r1)     // Catch: java.lang.Exception -> La0
            return r6
        La0:
            r6 = move-exception
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "create factory method error, "
            r0.append(r1)
            com.alibaba.fastjson.util.JavaBeanInfo r1 = r5.beanInfo
            java.lang.reflect.Method r1 = r1.factoryMethod
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        Lc0:
            return r2
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r2, java.lang.reflect.Type r3, java.lang.Object r4) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.deserialze(r2, r3, r4, r0)
            return r2
    }

    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.reflect.Type r9, java.lang.Object r10, int r11) {
            r7 = this;
            r4 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            java.lang.Object r8 = r0.deserialze(r1, r2, r3, r4, r5, r6)
            return r8
    }

    protected <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r27, java.lang.reflect.Type r28, java.lang.Object r29, java.lang.Object r30, int r31, int[] r32) {
            r26 = this;
            r1 = r26
            r2 = r27
            r5 = r28
            r0 = r29
            java.lang.Class<com.alibaba.fastjson.JSON> r3 = com.alibaba.fastjson.JSON.class
            if (r5 == r3) goto L63b
            java.lang.Class<com.alibaba.fastjson.JSONObject> r3 = com.alibaba.fastjson.JSONObject.class
            if (r5 != r3) goto L12
            goto L63b
        L12:
            com.alibaba.fastjson.parser.JSONLexer r3 = r2.lexer
            r8 = r3
            com.alibaba.fastjson.parser.JSONLexerBase r8 = (com.alibaba.fastjson.parser.JSONLexerBase) r8
            int r3 = r8.token()
            r4 = 8
            r9 = 16
            r10 = 0
            if (r3 != r4) goto L26
            r8.nextToken(r9)
            return r10
        L26:
            com.alibaba.fastjson.parser.ParseContext r4 = r2.getContext()
            if (r30 == 0) goto L30
            if (r4 == 0) goto L30
            com.alibaba.fastjson.parser.ParseContext r4 = r4.parent
        L30:
            r11 = r4
            r12 = 13
            if (r3 != r12) goto L4a
            r8.nextToken(r9)     // Catch: java.lang.Throwable -> L3f
            if (r30 != 0) goto L44
            java.lang.Object r0 = r26.createInstance(r27, r28)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r0 = move-exception
        L40:
            r4 = r30
            goto L633
        L44:
            r0 = r30
        L46:
            r2.setContext(r11)
            return r0
        L4a:
            r4 = 14
            if (r3 != r4) goto L6b
            com.alibaba.fastjson.parser.Feature r6 = com.alibaba.fastjson.parser.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> L3f
            int r7 = r6.mask     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson.util.JavaBeanInfo r13 = r1.beanInfo     // Catch: java.lang.Throwable -> L3f
            int r13 = r13.parserFeatures     // Catch: java.lang.Throwable -> L3f
            r13 = r13 & r7
            if (r13 != 0) goto L63
            boolean r6 = r8.isEnabled(r6)     // Catch: java.lang.Throwable -> L3f
            if (r6 != 0) goto L63
            r6 = r31 & r7
            if (r6 == 0) goto L6b
        L63:
            java.lang.Object r0 = r26.deserialzeArrayMapping(r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L3f
            r2.setContext(r11)
            return r0
        L6b:
            r6 = 12
            r13 = 4
            if (r3 == r6) goto Le0
            if (r3 == r9) goto Le0
            boolean r5 = r8.isBlankInput()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7c
            r2.setContext(r11)
            return r10
        L7c:
            if (r3 != r13) goto L8f
            java.lang.String r5 = r8.stringVal()     // Catch: java.lang.Throwable -> L3f
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L8f
            r8.nextToken()     // Catch: java.lang.Throwable -> L3f
            r2.setContext(r11)
            return r10
        L8f:
            if (r3 != r4) goto La3
            char r3 = r8.getCurrent()     // Catch: java.lang.Throwable -> L3f
            r4 = 93
            if (r3 != r4) goto La3
            r8.next()     // Catch: java.lang.Throwable -> L3f
            r8.nextToken()     // Catch: java.lang.Throwable -> L3f
            r2.setContext(r11)
            return r10
        La3:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "syntax error, expect {, actual "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r8.tokenName()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = ", pos "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            int r4 = r8.pos()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto Lcc
            java.lang.String r4 = ", fieldName "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            r3.append(r0)     // Catch: java.lang.Throwable -> L3f
        Lcc:
            java.lang.String r0 = ", fastjson-version "
            r3.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "1.2.33"
            r3.append(r0)     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        Le0:
            int r3 = r2.resolveStatus     // Catch: java.lang.Throwable -> L62f
            r4 = 2
            r14 = 0
            if (r3 != r4) goto Le8
            r2.resolveStatus = r14     // Catch: java.lang.Throwable -> L3f
        Le8:
            com.alibaba.fastjson.util.JavaBeanInfo r3 = r1.beanInfo     // Catch: java.lang.Throwable -> L62f
            java.lang.String r15 = r3.typeKey     // Catch: java.lang.Throwable -> L62f
            r3 = r30
            r4 = r32
            r7 = r10
            r16 = r7
            r31 = 0
            r6 = 0
        Lf6:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r14 = r1.sortedFieldDeserializers     // Catch: java.lang.Throwable -> L62b
            int r10 = r14.length     // Catch: java.lang.Throwable -> L62b
            if (r6 >= r10) goto L10b
            r10 = r14[r6]     // Catch: java.lang.Throwable -> L106
            com.alibaba.fastjson.util.FieldInfo r14 = r10.fieldInfo     // Catch: java.lang.Throwable -> L106
            java.lang.Class<?> r13 = r14.fieldClass     // Catch: java.lang.Throwable -> L106
            com.alibaba.fastjson.annotation.JSONField r18 = r14.getAnnotation()     // Catch: java.lang.Throwable -> L106
            goto L110
        L106:
            r0 = move-exception
            r4 = r3
        L108:
            r10 = r7
            goto L633
        L10b:
            r10 = 0
            r13 = 0
            r14 = 0
            r18 = 0
        L110:
            java.lang.Class r9 = java.lang.Double.TYPE
            java.lang.Class r12 = java.lang.Float.TYPE
            r30 = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r32 = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            java.lang.Class r5 = java.lang.Integer.TYPE
            r19 = r3
            if (r10 == 0) goto L257
            char[] r3 = r14.name_chars     // Catch: java.lang.Throwable -> L15d
            r21 = r14
            if (r13 == r5) goto L12c
            java.lang.Class<java.lang.Integer> r14 = java.lang.Integer.class
            if (r13 != r14) goto L130
        L12c:
            r18 = r4
            goto L244
        L130:
            if (r13 == r6) goto L136
            java.lang.Class<java.lang.Long> r14 = java.lang.Long.class
            if (r13 != r14) goto L13a
        L136:
            r18 = r4
            goto L232
        L13a:
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            if (r13 != r14) goto L163
            java.lang.String r3 = r8.scanFieldString(r3)     // Catch: java.lang.Throwable -> L15d
            int r14 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r14 <= 0) goto L14c
            r18 = r4
        L148:
            r4 = 1
            r14 = 1
            goto L25e
        L14c:
            r18 = r3
            r3 = -2
            if (r14 != r3) goto L155
        L151:
            r9 = r19
            goto L3c9
        L155:
            r3 = r18
            r14 = 0
            r18 = r4
            r4 = 0
            goto L25e
        L15d:
            r0 = move-exception
            r10 = r7
            r4 = r19
            goto L633
        L163:
            if (r13 == r4) goto L169
            java.lang.Class<java.lang.Boolean> r14 = java.lang.Boolean.class
            if (r13 != r14) goto L16d
        L169:
            r18 = r4
            goto L220
        L16d:
            if (r13 == r12) goto L173
            java.lang.Class<java.lang.Float> r14 = java.lang.Float.class
            if (r13 != r14) goto L177
        L173:
            r18 = r4
            goto L20e
        L177:
            if (r13 == r9) goto L17d
            java.lang.Class<java.lang.Double> r14 = java.lang.Double.class
            if (r13 != r14) goto L181
        L17d:
            r18 = r4
            goto L1fc
        L181:
            boolean r14 = r13.isEnum()     // Catch: java.lang.Throwable -> L15d
            if (r14 == 0) goto L1b8
            com.alibaba.fastjson.parser.ParserConfig r14 = r2.getConfig()     // Catch: java.lang.Throwable -> L15d
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r14 = r14.getDeserializer(r13)     // Catch: java.lang.Throwable -> L15d
            boolean r14 = r14 instanceof com.alibaba.fastjson.parser.deserializer.EnumDeserializer     // Catch: java.lang.Throwable -> L15d
            if (r14 == 0) goto L1b8
            if (r18 == 0) goto L1a0
            java.lang.Class r14 = r18.deserializeUsing()     // Catch: java.lang.Throwable -> L15d
            r18 = r4
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            if (r14 != r4) goto L1ba
            goto L1a2
        L1a0:
            r18 = r4
        L1a2:
            boolean r4 = r10 instanceof com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer     // Catch: java.lang.Throwable -> L15d
            if (r4 == 0) goto L25b
            r4 = r10
            com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer r4 = (com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer) r4     // Catch: java.lang.Throwable -> L15d
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r4 = r4.fieldValueDeserilizer     // Catch: java.lang.Throwable -> L15d
            java.lang.Enum r3 = r1.scanEnum(r8, r3, r4)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L1b4
            goto L1c6
        L1b4:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L1b8:
            r18 = r4
        L1ba:
            java.lang.Class<int[]> r4 = int[].class
            if (r13 != r4) goto L1cf
            int[] r3 = r8.scanFieldIntArray(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L1c7
        L1c6:
            goto L148
        L1c7:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L1cb:
            r4 = 0
        L1cc:
            r14 = 0
            goto L25e
        L1cf:
            java.lang.Class<float[]> r4 = float[].class
            if (r13 != r4) goto L1e1
            float[] r3 = r8.scanFieldFloatArray(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L1dc
            goto L1c6
        L1dc:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L1e1:
            java.lang.Class<float[][]> r4 = float[][].class
            if (r13 != r4) goto L1f3
            float[][] r3 = r8.scanFieldFloatArray2(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L1ee
            goto L1c6
        L1ee:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L1f3:
            boolean r3 = r8.matchField(r3)     // Catch: java.lang.Throwable -> L15d
            if (r3 == 0) goto L151
            r3 = 0
            r4 = 1
            goto L1cc
        L1fc:
            double r3 = r8.scanFieldDouble(r3)     // Catch: java.lang.Throwable -> L15d
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L209
            goto L1c6
        L209:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L20e:
            float r3 = r8.scanFieldFloat(r3)     // Catch: java.lang.Throwable -> L15d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L21b
            goto L1c6
        L21b:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L220:
            boolean r3 = r8.scanFieldBoolean(r3)     // Catch: java.lang.Throwable -> L15d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L22d
            goto L1c6
        L22d:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L232:
            long r3 = r8.scanFieldLong(r3)     // Catch: java.lang.Throwable -> L15d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L23f
            goto L1c6
        L23f:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L244:
            int r3 = r8.scanFieldInt(r3)     // Catch: java.lang.Throwable -> L15d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L15d
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L15d
            if (r4 <= 0) goto L252
            goto L1c6
        L252:
            r14 = -2
            if (r4 != r14) goto L1cb
            goto L151
        L257:
            r18 = r4
            r21 = r14
        L25b:
            r3 = 0
            goto L1cb
        L25e:
            if (r4 != 0) goto L3e8
            r22 = r4
            com.alibaba.fastjson.parser.SymbolTable r4 = r2.symbolTable     // Catch: java.lang.Throwable -> L3aa
            java.lang.String r4 = r8.scanSymbol(r4)     // Catch: java.lang.Throwable -> L3aa
            if (r4 != 0) goto L28d
            r23 = r14
            int r14 = r8.token()     // Catch: java.lang.Throwable -> L15d
            r24 = r9
            r9 = 13
            if (r14 != r9) goto L27f
            r9 = 16
            r8.nextToken(r9)     // Catch: java.lang.Throwable -> L15d
            r9 = r19
            goto L3bc
        L27f:
            r9 = 16
            if (r14 != r9) goto L291
            com.alibaba.fastjson.parser.Feature r9 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas     // Catch: java.lang.Throwable -> L15d
            boolean r9 = r8.isEnabled(r9)     // Catch: java.lang.Throwable -> L15d
            if (r9 == 0) goto L291
            goto L151
        L28d:
            r24 = r9
            r23 = r14
        L291:
            java.lang.String r9 = "$ref"
            if (r9 != r4) goto L338
            if (r11 == 0) goto L338
            r9 = 4
            r8.nextTokenWithColon(r9)     // Catch: java.lang.Throwable -> L15d
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L15d
            if (r3 != r9) goto L31d
            java.lang.String r3 = r8.stringVal()     // Catch: java.lang.Throwable -> L15d
            java.lang.String r4 = "@"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L15d
            if (r4 == 0) goto L2b2
            java.lang.Object r3 = r11.object     // Catch: java.lang.Throwable -> L15d
        L2af:
            r9 = 13
            goto L2fc
        L2b2:
            java.lang.String r4 = ".."
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L15d
            if (r4 == 0) goto L2ce
            com.alibaba.fastjson.parser.ParseContext r4 = r11.parent     // Catch: java.lang.Throwable -> L15d
            java.lang.Object r5 = r4.object     // Catch: java.lang.Throwable -> L15d
            if (r5 == 0) goto L2c2
        L2c0:
            r3 = r5
            goto L2af
        L2c2:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r5 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L15d
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L15d
            r2.addResolveTask(r5)     // Catch: java.lang.Throwable -> L15d
            r3 = 1
            r2.resolveStatus = r3     // Catch: java.lang.Throwable -> L15d
            goto L2f9
        L2ce:
            java.lang.String r4 = "$"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L15d
            if (r4 == 0) goto L2ee
            r4 = r11
        L2d7:
            com.alibaba.fastjson.parser.ParseContext r5 = r4.parent     // Catch: java.lang.Throwable -> L15d
            if (r5 == 0) goto L2dd
            r4 = r5
            goto L2d7
        L2dd:
            java.lang.Object r5 = r4.object     // Catch: java.lang.Throwable -> L15d
            if (r5 == 0) goto L2e2
            goto L2c0
        L2e2:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r5 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L15d
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L15d
            r2.addResolveTask(r5)     // Catch: java.lang.Throwable -> L15d
            r3 = 1
            r2.resolveStatus = r3     // Catch: java.lang.Throwable -> L15d
            goto L2f9
        L2ee:
            com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask r4 = new com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask     // Catch: java.lang.Throwable -> L15d
            r4.<init>(r11, r3)     // Catch: java.lang.Throwable -> L15d
            r2.addResolveTask(r4)     // Catch: java.lang.Throwable -> L15d
            r3 = 1
            r2.resolveStatus = r3     // Catch: java.lang.Throwable -> L15d
        L2f9:
            r3 = r19
            goto L2af
        L2fc:
            r8.nextToken(r9)     // Catch: java.lang.Throwable -> L106
            int r4 = r8.token()     // Catch: java.lang.Throwable -> L106
            if (r4 != r9) goto L315
            r9 = 16
            r8.nextToken(r9)     // Catch: java.lang.Throwable -> L106
            r2.setContext(r11, r3, r0)     // Catch: java.lang.Throwable -> L106
            if (r7 == 0) goto L311
            r7.object = r3
        L311:
            r2.setContext(r11)
            return r3
        L315:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L106
            java.lang.String r4 = "illegal ref"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L106
            throw r0     // Catch: java.lang.Throwable -> L106
        L31d:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L15d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15d
            r4.<init>()     // Catch: java.lang.Throwable -> L15d
            java.lang.String r5 = "illegal ref, "
            r4.append(r5)     // Catch: java.lang.Throwable -> L15d
            java.lang.String r3 = com.alibaba.fastjson.parser.JSONToken.name(r3)     // Catch: java.lang.Throwable -> L15d
            r4.append(r3)     // Catch: java.lang.Throwable -> L15d
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L15d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L15d
            throw r0     // Catch: java.lang.Throwable -> L15d
        L338:
            if (r15 == 0) goto L343
            boolean r9 = r15.equals(r4)     // Catch: java.lang.Throwable -> L15d
            if (r9 != 0) goto L341
            goto L343
        L341:
            r9 = 4
            goto L348
        L343:
            java.lang.String r9 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY     // Catch: java.lang.Throwable -> L3aa
            if (r9 != r4) goto L3e0
            goto L341
        L348:
            r8.nextTokenWithColon(r9)     // Catch: java.lang.Throwable -> L3aa
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L3aa
            if (r3 != r9) goto L3d6
            java.lang.String r3 = r8.stringVal()     // Catch: java.lang.Throwable -> L3aa
            r9 = 16
            r8.nextToken(r9)     // Catch: java.lang.Throwable -> L3aa
            com.alibaba.fastjson.util.JavaBeanInfo r4 = r1.beanInfo     // Catch: java.lang.Throwable -> L3aa
            java.lang.String r4 = r4.typeName     // Catch: java.lang.Throwable -> L3aa
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L3aa
            if (r4 != 0) goto L36c
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.IgnoreAutoType     // Catch: java.lang.Throwable -> L3aa
            boolean r4 = r2.isEnabled(r4)     // Catch: java.lang.Throwable -> L3aa
            if (r4 == 0) goto L36f
        L36c:
            r9 = r19
            goto L3b1
        L36f:
            com.alibaba.fastjson.parser.ParserConfig r4 = r2.getConfig()     // Catch: java.lang.Throwable -> L3aa
            com.alibaba.fastjson.util.JavaBeanInfo r5 = r1.beanInfo     // Catch: java.lang.Throwable -> L3aa
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r5 = r1.getSeeAlso(r4, r5, r3)     // Catch: java.lang.Throwable -> L3aa
            if (r5 != 0) goto L38c
            java.lang.Class r5 = com.alibaba.fastjson.util.TypeUtils.getClass(r28)     // Catch: java.lang.Throwable -> L15d
            java.lang.Class r10 = r4.checkAutoType(r3, r5)     // Catch: java.lang.Throwable -> L15d
            com.alibaba.fastjson.parser.ParserConfig r4 = r2.getConfig()     // Catch: java.lang.Throwable -> L15d
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r5 = r4.getDeserializer(r10)     // Catch: java.lang.Throwable -> L15d
            goto L38d
        L38c:
            r10 = 0
        L38d:
            java.lang.Object r0 = r5.deserialze(r2, r10, r0)     // Catch: java.lang.Throwable -> L3aa
            boolean r4 = r5 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer     // Catch: java.lang.Throwable -> L3aa
            if (r4 == 0) goto L3a0
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r5 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r5     // Catch: java.lang.Throwable -> L15d
            if (r15 == 0) goto L3a0
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r4 = r5.getFieldDeserializer(r15)     // Catch: java.lang.Throwable -> L15d
            r4.setValue(r0, r3)     // Catch: java.lang.Throwable -> L15d
        L3a0:
            if (r7 == 0) goto L3a6
            r9 = r19
            r7.object = r9
        L3a6:
            r2.setContext(r11)
            return r0
        L3aa:
            r0 = move-exception
            r9 = r19
        L3ad:
            r10 = r7
            r4 = r9
            goto L633
        L3b1:
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L3c7
            r4 = 13
            if (r3 != r4) goto L3c9
            r8.nextToken()     // Catch: java.lang.Throwable -> L3c7
        L3bc:
            r14 = r5
            r4 = r9
            r10 = r18
            r13 = r24
            r9 = r6
            r6 = r16
            goto L4ee
        L3c7:
            r0 = move-exception
            goto L3ad
        L3c9:
            r4 = r30
            r6 = r16
            r3 = 0
            r5 = 16
            r16 = r15
            r15 = 13
            goto L5f2
        L3d6:
            r9 = r19
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L3c7
            java.lang.String r3 = "syntax error"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3c7
            throw r0     // Catch: java.lang.Throwable -> L3c7
        L3e0:
            r25 = r4
            r4 = r3
            r3 = r25
        L3e5:
            r9 = r19
            goto L3f1
        L3e8:
            r22 = r4
            r24 = r9
            r23 = r14
            r4 = r3
            r3 = 0
            goto L3e5
        L3f1:
            if (r9 != 0) goto L426
            if (r16 != 0) goto L426
            java.lang.Object r9 = r26.createInstance(r27, r28)     // Catch: java.lang.Throwable -> L3c7
            if (r9 != 0) goto L408
            java.util.HashMap r14 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3c7
            r19 = r3
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r3 = r1.fieldDeserializers     // Catch: java.lang.Throwable -> L3c7
            int r3 = r3.length     // Catch: java.lang.Throwable -> L3c7
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L3c7
            r16 = r14
            goto L40a
        L408:
            r19 = r3
        L40a:
            com.alibaba.fastjson.parser.ParseContext r7 = r2.setContext(r11, r9, r0)     // Catch: java.lang.Throwable -> L3c7
            if (r30 != 0) goto L420
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r3 = r1.fieldDeserializers     // Catch: java.lang.Throwable -> L3c7
            int r3 = r3.length     // Catch: java.lang.Throwable -> L3c7
            int r3 = r3 / 32
            r20 = 1
            int r3 = r3 + 1
            int[] r3 = new int[r3]     // Catch: java.lang.Throwable -> L3c7
            r14 = r7
            r7 = r3
            r3 = r16
            goto L429
        L420:
            r14 = r7
            r3 = r16
            r7 = r30
            goto L429
        L426:
            r19 = r3
            goto L420
        L429:
            if (r22 == 0) goto L4a0
            if (r23 != 0) goto L44a
            r1 = r28
            r10.parseField(r2, r9, r1, r3)     // Catch: java.lang.Throwable -> L443
            r1 = r26
            r4 = r9
            r30 = r14
            r16 = r15
            r10 = r18
            r13 = r24
            r15 = 1
        L43e:
            r14 = r5
            r9 = r6
            r6 = r3
            goto L4d7
        L443:
            r0 = move-exception
            r1 = r26
            r4 = r9
            r10 = r14
            goto L633
        L44a:
            r1 = r28
            if (r9 != 0) goto L458
            r1 = r21
            java.lang.String r1 = r1.name     // Catch: java.lang.Throwable -> L443
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L443
        L455:
            r1 = r18
            goto L471
        L458:
            if (r4 != 0) goto L46c
            if (r13 == r5) goto L455
            if (r13 == r6) goto L455
            if (r13 == r12) goto L455
            r1 = r24
            if (r13 == r1) goto L455
            r1 = r18
            if (r13 == r1) goto L471
            r10.setValue(r9, r4)     // Catch: java.lang.Throwable -> L443
            goto L471
        L46c:
            r1 = r18
            r10.setValue(r9, r4)     // Catch: java.lang.Throwable -> L443
        L471:
            if (r7 == 0) goto L481
            int r4 = r32 / 32
            int r10 = r32 % 32
            r13 = r7[r4]     // Catch: java.lang.Throwable -> L443
            r20 = 1
            int r10 = r20 >> r10
            r10 = r10 | r13
            r7[r4] = r10     // Catch: java.lang.Throwable -> L443
            goto L483
        L481:
            r20 = 1
        L483:
            int r4 = r8.matchStat     // Catch: java.lang.Throwable -> L443
            r10 = 4
            if (r4 != r10) goto L494
            r10 = r1
            r4 = r9
            r30 = r14
            r13 = r24
            r1 = r26
            r14 = r5
            r9 = r6
            r6 = r3
            goto L4ec
        L494:
            r10 = r1
            r4 = r9
            r30 = r14
            r16 = r15
            r13 = r24
            r15 = 1
            r1 = r26
            goto L43e
        L4a0:
            r4 = r9
            r30 = r14
            r16 = r15
            r10 = r18
            r13 = r24
            r15 = 1
            r14 = r5
            r9 = r6
            r5 = r28
            r6 = r3
            r3 = r19
            boolean r3 = r1.parseField(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4c3
            if (r3 != 0) goto L4cf
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            r5 = 13
            if (r3 != r5) goto L4c8
            r8.nextToken()     // Catch: java.lang.Throwable -> L4c3
            goto L4ec
        L4c3:
            r0 = move-exception
            r10 = r30
            goto L633
        L4c8:
            r3 = 0
            r5 = 16
        L4cb:
            r15 = 13
            goto L5ee
        L4cf:
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            r5 = 17
            if (r3 == r5) goto L623
        L4d7:
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            r5 = 16
            if (r3 != r5) goto L4e1
            r3 = 0
            goto L4cb
        L4e1:
            int r3 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            r15 = 13
            if (r3 != r15) goto L5de
            r8.nextToken(r5)     // Catch: java.lang.Throwable -> L4c3
        L4ec:
            r7 = r30
        L4ee:
            if (r4 != 0) goto L5ba
            if (r6 != 0) goto L507
            java.lang.Object r3 = r26.createInstance(r27, r28)     // Catch: java.lang.Throwable -> L504
            if (r7 != 0) goto L4fc
            com.alibaba.fastjson.parser.ParseContext r7 = r2.setContext(r11, r3, r0)     // Catch: java.lang.Throwable -> L106
        L4fc:
            if (r7 == 0) goto L500
            r7.object = r3
        L500:
            r2.setContext(r11)
            return r3
        L504:
            r0 = move-exception
            goto L108
        L507:
            com.alibaba.fastjson.util.JavaBeanInfo r0 = r1.beanInfo     // Catch: java.lang.Throwable -> L504
            com.alibaba.fastjson.util.FieldInfo[] r0 = r0.fields     // Catch: java.lang.Throwable -> L504
            int r3 = r0.length     // Catch: java.lang.Throwable -> L504
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L504
            r8 = 0
        L50f:
            if (r8 >= r3) goto L564
            r15 = r0[r8]     // Catch: java.lang.Throwable -> L504
            r16 = r0
            java.lang.String r0 = r15.name     // Catch: java.lang.Throwable -> L504
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L504
            if (r0 != 0) goto L559
            java.lang.reflect.Type r15 = r15.fieldType     // Catch: java.lang.Throwable -> L504
            r28 = r0
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L504
            if (r15 != r0) goto L52a
            java.lang.Byte r0 = java.lang.Byte.valueOf(r31)     // Catch: java.lang.Throwable -> L504
            goto L55d
        L52a:
            java.lang.Class r0 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> L504
            if (r15 != r0) goto L533
            java.lang.Short r0 = java.lang.Short.valueOf(r31)     // Catch: java.lang.Throwable -> L504
            goto L55d
        L533:
            if (r15 != r14) goto L53a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r31)     // Catch: java.lang.Throwable -> L504
            goto L55d
        L53a:
            if (r15 != r9) goto L543
            r17 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> L504
            goto L55d
        L543:
            if (r15 != r12) goto L54b
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L504
            goto L55d
        L54b:
            if (r15 != r13) goto L554
            r17 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r17)     // Catch: java.lang.Throwable -> L504
            goto L55d
        L554:
            if (r15 != r10) goto L55b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L504
            goto L55d
        L559:
            r28 = r0
        L55b:
            r0 = r28
        L55d:
            r5[r8] = r0     // Catch: java.lang.Throwable -> L504
            int r8 = r8 + 1
            r0 = r16
            goto L50f
        L564:
            com.alibaba.fastjson.util.JavaBeanInfo r0 = r1.beanInfo     // Catch: java.lang.Throwable -> L504
            java.lang.reflect.Constructor<?> r3 = r0.creatorConstructor     // Catch: java.lang.Throwable -> L504
            if (r3 == 0) goto L590
            java.lang.Object r0 = r3.newInstance(r5)     // Catch: java.lang.Throwable -> L504 java.lang.Exception -> L570
        L56e:
            r4 = r0
            goto L5ba
        L570:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L504
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L504
            r5.<init>()     // Catch: java.lang.Throwable -> L504
            java.lang.String r6 = "create instance error, "
            r5.append(r6)     // Catch: java.lang.Throwable -> L504
            com.alibaba.fastjson.util.JavaBeanInfo r6 = r1.beanInfo     // Catch: java.lang.Throwable -> L504
            java.lang.reflect.Constructor<?> r6 = r6.creatorConstructor     // Catch: java.lang.Throwable -> L504
            java.lang.String r6 = r6.toGenericString()     // Catch: java.lang.Throwable -> L504
            r5.append(r6)     // Catch: java.lang.Throwable -> L504
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L504
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L504
            throw r3     // Catch: java.lang.Throwable -> L504
        L590:
            java.lang.reflect.Method r0 = r0.factoryMethod     // Catch: java.lang.Throwable -> L504
            if (r0 == 0) goto L5ba
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r5)     // Catch: java.lang.Throwable -> L504 java.lang.Exception -> L59a
            goto L56e
        L59a:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L504
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L504
            r5.<init>()     // Catch: java.lang.Throwable -> L504
            java.lang.String r6 = "create factory method error, "
            r5.append(r6)     // Catch: java.lang.Throwable -> L504
            com.alibaba.fastjson.util.JavaBeanInfo r6 = r1.beanInfo     // Catch: java.lang.Throwable -> L504
            java.lang.reflect.Method r6 = r6.factoryMethod     // Catch: java.lang.Throwable -> L504
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L504
            r5.append(r6)     // Catch: java.lang.Throwable -> L504
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L504
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L504
            throw r3     // Catch: java.lang.Throwable -> L504
        L5ba:
            com.alibaba.fastjson.util.JavaBeanInfo r0 = r1.beanInfo     // Catch: java.lang.Throwable -> L504
            java.lang.reflect.Method r0 = r0.buildMethod     // Catch: java.lang.Throwable -> L504
            if (r0 != 0) goto L5c8
            if (r7 == 0) goto L5c4
            r7.object = r4
        L5c4:
            r2.setContext(r11)
            return r4
        L5c8:
            r3 = 0
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch: java.lang.Throwable -> L504 java.lang.Exception -> L5d5
            if (r7 == 0) goto L5d1
            r7.object = r4
        L5d1:
            r2.setContext(r11)
            return r0
        L5d5:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r3 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L504
            java.lang.String r5 = "build object error"
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L504
            throw r3     // Catch: java.lang.Throwable -> L504
        L5de:
            r3 = 0
            int r9 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            r10 = 18
            if (r9 == r10) goto L604
            int r9 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            r10 = 1
            if (r9 == r10) goto L604
        L5ee:
            r9 = r4
            r4 = r7
            r7 = r30
        L5f2:
            int r10 = r32 + 1
            r5 = r28
            r15 = r16
            r12 = 13
            r13 = 4
            r16 = r6
            r6 = r10
            r10 = r3
            r3 = r9
            r9 = 16
            goto Lf6
        L604:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L4c3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c3
            r3.<init>()     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r5 = "syntax error, unexpect token "
            r3.append(r5)     // Catch: java.lang.Throwable -> L4c3
            int r5 = r8.token()     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r5 = com.alibaba.fastjson.parser.JSONToken.name(r5)     // Catch: java.lang.Throwable -> L4c3
            r3.append(r5)     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c3
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L623:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r3 = "syntax error, unexpect token ':'"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L62b:
            r0 = move-exception
            r9 = r3
            goto L3ad
        L62f:
            r0 = move-exception
            r3 = r10
            goto L40
        L633:
            if (r10 == 0) goto L637
            r10.object = r4
        L637:
            r2.setContext(r11)
            throw r0
        L63b:
            java.lang.Object r0 = r2.parse()
            return r0
    }

    public <T> T deserialzeArrayMapping(com.alibaba.fastjson.parser.DefaultJSONParser r9, java.lang.reflect.Type r10, java.lang.Object r11, java.lang.Object r12) {
            r8 = this;
            com.alibaba.fastjson.parser.JSONLexer r11 = r9.lexer
            int r12 = r11.token()
            r0 = 14
            if (r12 != r0) goto Lf4
            java.lang.Object r10 = r8.createInstance(r9, r10)
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r12 = r8.sortedFieldDeserializers
            int r12 = r12.length
            r1 = 0
        L12:
            r2 = 16
            if (r1 >= r12) goto Lf0
            int r3 = r12 + (-1)
            r4 = 93
            if (r1 != r3) goto L1f
            r3 = 93
            goto L21
        L1f:
            r3 = 44
        L21:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r5 = r8.sortedFieldDeserializers
            r5 = r5[r1]
            com.alibaba.fastjson.util.FieldInfo r6 = r5.fieldInfo
            java.lang.Class<?> r6 = r6.fieldClass
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r6 != r7) goto L36
            int r2 = r11.scanInt(r3)
            r5.setValue(r10, r2)
            goto Lec
        L36:
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r6 != r7) goto L43
            java.lang.String r2 = r11.scanString(r3)
            r5.setValue(r10, r2)
            goto Lec
        L43:
            java.lang.Class r7 = java.lang.Long.TYPE
            if (r6 != r7) goto L50
            long r2 = r11.scanLong(r3)
            r5.setValue(r10, r2)
            goto Lec
        L50:
            boolean r7 = r6.isEnum()
            if (r7 == 0) goto L92
            char r2 = r11.getCurrent()
            r4 = 34
            if (r2 == r4) goto L86
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 != r4) goto L63
            goto L86
        L63:
            r4 = 48
            if (r2 < r4) goto L81
            r4 = 57
            if (r2 > r4) goto L81
            int r2 = r11.scanInt(r3)
            r3 = r5
            com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer r3 = (com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer) r3
            com.alibaba.fastjson.parser.ParserConfig r4 = r9.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r3.getFieldValueDeserilizer(r4)
            com.alibaba.fastjson.parser.deserializer.EnumDeserializer r3 = (com.alibaba.fastjson.parser.deserializer.EnumDeserializer) r3
            java.lang.Enum r2 = r3.valueOf(r2)
            goto L8e
        L81:
            java.lang.Enum r2 = r8.scanEnum(r11, r3)
            goto L8e
        L86:
            com.alibaba.fastjson.parser.SymbolTable r2 = r9.getSymbolTable()
            java.lang.Enum r2 = r11.scanEnum(r6, r2, r3)
        L8e:
            r5.setValue(r10, r2)
            goto Lec
        L92:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            if (r6 != r7) goto L9e
            boolean r2 = r11.scanBoolean(r3)
            r5.setValue(r10, r2)
            goto Lec
        L9e:
            java.lang.Class r7 = java.lang.Float.TYPE
            if (r6 != r7) goto Lae
            float r2 = r11.scanFloat(r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r5.setValue(r10, r2)
            goto Lec
        Lae:
            java.lang.Class r7 = java.lang.Double.TYPE
            if (r6 != r7) goto Lbe
            double r2 = r11.scanDouble(r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r5.setValue(r10, r2)
            goto Lec
        Lbe:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            if (r6 != r7) goto Ld7
            char r6 = r11.getCurrent()
            r7 = 49
            if (r6 != r7) goto Ld7
            long r2 = r11.scanLong(r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            r5.setValue(r10, r4)
            goto Lec
        Ld7:
            r11.nextToken(r0)
            com.alibaba.fastjson.util.FieldInfo r6 = r5.fieldInfo
            java.lang.reflect.Type r6 = r6.fieldType
            java.lang.Object r6 = r9.parseObject(r6)
            r5.setValue(r10, r6)
            if (r3 != r4) goto Le9
            r2 = 15
        Le9:
            r8.check(r11, r2)
        Lec:
            int r1 = r1 + 1
            goto L12
        Lf0:
            r11.nextToken(r2)
            return r10
        Lf4:
            com.alibaba.fastjson.JSONException r9 = new com.alibaba.fastjson.JSONException
            java.lang.String r10 = "error"
            r9.<init>(r10)
            throw r9
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }

    public com.alibaba.fastjson.parser.deserializer.FieldDeserializer getFieldDeserializer(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r2 = r1.getFieldDeserializer(r2, r0)
            return r2
    }

    public com.alibaba.fastjson.parser.deserializer.FieldDeserializer getFieldDeserializer(java.lang.String r6, int[] r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r1 = r5.sortedFieldDeserializers
            int r1 = r1.length
            int r1 = r1 + (-1)
            r2 = 0
        La:
            if (r2 > r1) goto L34
            int r3 = r2 + r1
            int r3 = r3 >>> 1
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r4 = r5.sortedFieldDeserializers
            r4 = r4[r3]
            com.alibaba.fastjson.util.FieldInfo r4 = r4.fieldInfo
            java.lang.String r4 = r4.name
            int r4 = r4.compareTo(r6)
            if (r4 >= 0) goto L22
            int r3 = r3 + 1
            r2 = r3
            goto La
        L22:
            if (r4 <= 0) goto L28
            int r3 = r3 + (-1)
            r1 = r3
            goto La
        L28:
            boolean r6 = isSetFlag(r3, r7)
            if (r6 == 0) goto L2f
            return r0
        L2f:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r6 = r5.sortedFieldDeserializers
            r6 = r6[r3]
            return r6
        L34:
            return r0
    }

    public java.lang.reflect.Type getFieldType(int r2) {
            r1 = this;
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r0 = r1.sortedFieldDeserializers
            r2 = r0[r2]
            com.alibaba.fastjson.util.FieldInfo r2 = r2.fieldInfo
            java.lang.reflect.Type r2 = r2.fieldType
            return r2
    }

    protected com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer getSeeAlso(com.alibaba.fastjson.parser.ParserConfig r7, com.alibaba.fastjson.util.JavaBeanInfo r8, java.lang.String r9) {
            r6 = this;
            com.alibaba.fastjson.annotation.JSONType r8 = r8.jsonType
            r0 = 0
            if (r8 != 0) goto L6
            return r0
        L6:
            java.lang.Class[] r8 = r8.seeAlso()
            int r1 = r8.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L2f
            r3 = r8[r2]
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r3 = r7.getDeserializer(r3)
            boolean r4 = r3 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            if (r4 == 0) goto L2c
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r3 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r3
            com.alibaba.fastjson.util.JavaBeanInfo r4 = r3.beanInfo
            java.lang.String r5 = r4.typeName
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L25
            return r3
        L25:
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r3 = r6.getSeeAlso(r7, r4, r9)
            if (r3 == 0) goto L2c
            return r3
        L2c:
            int r2 = r2 + 1
            goto Lc
        L2f:
            return r0
    }

    public boolean parseField(com.alibaba.fastjson.parser.DefaultJSONParser r8, java.lang.String r9, java.lang.Object r10, java.lang.reflect.Type r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r8 = r0.parseField(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public boolean parseField(com.alibaba.fastjson.parser.DefaultJSONParser r20, java.lang.String r21, java.lang.Object r22, java.lang.reflect.Type r23, java.util.Map<java.lang.String, java.lang.Object> r24, int[] r25) {
            r19 = this;
            r1 = r19
            r0 = r20
            r3 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            com.alibaba.fastjson.parser.JSONLexer r15 = r0.lexer
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.DisableFieldSmartMatch
            int r2 = r2.mask
            boolean r4 = r15.isEnabled(r2)
            if (r4 != 0) goto L27
            com.alibaba.fastjson.util.JavaBeanInfo r4 = r1.beanInfo
            int r4 = r4.parserFeatures
            r2 = r2 & r4
            if (r2 == 0) goto L22
            goto L27
        L22:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r2 = r1.smartMatch(r3, r14)
            goto L2b
        L27:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r2 = r1.getFieldDeserializer(r3)
        L2b:
            com.alibaba.fastjson.parser.Feature r4 = com.alibaba.fastjson.parser.Feature.SupportNonPublicField
            int r4 = r4.mask
            r16 = 0
            r5 = 1
            if (r2 != 0) goto L87
            boolean r6 = r15.isEnabled(r4)
            if (r6 != 0) goto L41
            com.alibaba.fastjson.util.JavaBeanInfo r6 = r1.beanInfo
            int r6 = r6.parserFeatures
            r4 = r4 & r6
            if (r4 == 0) goto L87
        L41:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r4 = r1.extraFieldDeserializers
            if (r4 != 0) goto L78
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r6 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r5, r6, r5)
            java.lang.Class<?> r6 = r1.clazz
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()
            int r7 = r6.length
            r8 = 0
        L54:
            if (r8 >= r7) goto L76
            r9 = r6[r8]
            java.lang.String r10 = r9.getName()
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r17 = r1.getFieldDeserializer(r10)
            if (r17 == 0) goto L63
            goto L73
        L63:
            int r17 = r9.getModifiers()
            r18 = r17 & 16
            if (r18 != 0) goto L73
            r17 = r17 & 8
            if (r17 == 0) goto L70
            goto L73
        L70:
            r4.put(r10, r9)
        L73:
            int r8 = r8 + 1
            goto L54
        L76:
            r1.extraFieldDeserializers = r4
        L78:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r4 = r1.extraFieldDeserializers
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L87
            boolean r2 = r4 instanceof com.alibaba.fastjson.parser.deserializer.FieldDeserializer
            if (r2 == 0) goto L8a
            r2 = r4
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r2 = (com.alibaba.fastjson.parser.deserializer.FieldDeserializer) r2
        L87:
            r17 = 1
            goto Lb9
        L8a:
            r7 = r4
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r7.setAccessible(r5)
            com.alibaba.fastjson.util.FieldInfo r2 = new com.alibaba.fastjson.util.FieldInfo
            java.lang.Class r4 = r7.getDeclaringClass()
            r6 = 1
            java.lang.Class r5 = r7.getType()
            r8 = 1
            java.lang.reflect.Type r6 = r7.getGenericType()
            r9 = 0
            r10 = 0
            r17 = 1
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer r4 = new com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer
            com.alibaba.fastjson.parser.ParserConfig r5 = r0.getConfig()
            java.lang.Class<?> r6 = r1.clazz
            r4.<init>(r5, r6, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r2 = r1.extraFieldDeserializers
            r2.put(r3, r4)
            r2 = r4
        Lb9:
            if (r2 != 0) goto L198
            com.alibaba.fastjson.parser.Feature r2 = com.alibaba.fastjson.parser.Feature.IgnoreNotMatch
            boolean r2 = r15.isEnabled(r2)
            if (r2 == 0) goto L173
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r2 = r1.sortedFieldDeserializers
            int r4 = r2.length
            r5 = 0
        Lc7:
            if (r5 >= r4) goto L16f
            r6 = r2[r5]
            com.alibaba.fastjson.util.FieldInfo r7 = r6.fieldInfo
            boolean r8 = r7.unwrapped
            if (r8 == 0) goto L16b
            boolean r8 = r6 instanceof com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer
            if (r8 == 0) goto L16b
            java.lang.reflect.Field r8 = r7.field
            java.lang.String r9 = "parse unwrapped field error."
            if (r8 == 0) goto L147
            r8 = r6
            com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer r8 = (com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer) r8
            com.alibaba.fastjson.parser.ParserConfig r10 = r0.getConfig()
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r10 = r8.getFieldValueDeserilizer(r10)
            boolean r14 = r10 instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer
            if (r14 == 0) goto L11a
            r14 = r10
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r14 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r14
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r14 = r14.getFieldDeserializer(r3)
            if (r14 == 0) goto L16b
            java.lang.reflect.Field r2 = r7.field     // Catch: java.lang.Exception -> L107
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Exception -> L107
            if (r2 != 0) goto L109
            com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer r10 = (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) r10     // Catch: java.lang.Exception -> L107
            java.lang.reflect.Type r2 = r7.fieldType     // Catch: java.lang.Exception -> L107
            java.lang.Object r2 = r10.createInstance(r0, r2)     // Catch: java.lang.Exception -> L107
            r6.setValue(r11, r2)     // Catch: java.lang.Exception -> L107
            goto L109
        L107:
            r0 = move-exception
            goto L114
        L109:
            int r3 = r8.getFastMatchToken()     // Catch: java.lang.Exception -> L107
            r15.nextTokenWithColon(r3)     // Catch: java.lang.Exception -> L107
            r14.parseField(r0, r2, r12, r13)     // Catch: java.lang.Exception -> L107
            return r17
        L114:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            r2.<init>(r9, r0)
            throw r2
        L11a:
            boolean r8 = r10 instanceof com.alibaba.fastjson.parser.deserializer.MapDeserializer
            if (r8 == 0) goto L16b
            com.alibaba.fastjson.parser.deserializer.MapDeserializer r10 = (com.alibaba.fastjson.parser.deserializer.MapDeserializer) r10
            java.lang.reflect.Field r2 = r7.field     // Catch: java.lang.Exception -> L134
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Exception -> L134
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L134
            if (r2 != 0) goto L136
            java.lang.reflect.Type r2 = r7.fieldType     // Catch: java.lang.Exception -> L134
            java.util.Map r2 = r10.createMap(r2)     // Catch: java.lang.Exception -> L134
            r6.setValue(r11, r2)     // Catch: java.lang.Exception -> L134
            goto L136
        L134:
            r0 = move-exception
            goto L141
        L136:
            r15.nextTokenWithColon()     // Catch: java.lang.Exception -> L134
            java.lang.Object r0 = r20.parse(r21)     // Catch: java.lang.Exception -> L134
            r2.put(r3, r0)     // Catch: java.lang.Exception -> L134
            return r17
        L141:
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            r2.<init>(r9, r0)
            throw r2
        L147:
            java.lang.reflect.Method r6 = r7.method
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r6 = r6.length
            r8 = 2
            if (r6 != r8) goto L16b
            r15.nextTokenWithColon()
            java.lang.Object r0 = r20.parse(r21)
            java.lang.reflect.Method r2 = r7.method     // Catch: java.lang.Exception -> L164
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L164
            r4[r16] = r3     // Catch: java.lang.Exception -> L164
            r4[r17] = r0     // Catch: java.lang.Exception -> L164
            r2.invoke(r11, r4)     // Catch: java.lang.Exception -> L164
            return r17
        L164:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            r2.<init>(r9, r0)
            throw r2
        L16b:
            int r5 = r5 + 1
            goto Lc7
        L16f:
            r0.parseExtra(r11, r3)
            return r16
        L173:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "setter not found, class "
            r2.append(r4)
            java.lang.Class<?> r4 = r1.clazz
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = ", property "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L198:
            r4 = 0
        L199:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r5 = r1.sortedFieldDeserializers
            int r6 = r5.length
            r7 = -1
            if (r4 >= r6) goto L1a7
            r5 = r5[r4]
            if (r5 != r2) goto L1a4
            goto L1a8
        L1a4:
            int r4 = r4 + 1
            goto L199
        L1a7:
            r4 = -1
        L1a8:
            if (r4 == r7) goto L1be
            if (r14 == 0) goto L1be
            java.lang.String r5 = "_"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L1be
            boolean r4 = isSetFlag(r4, r14)
            if (r4 == 0) goto L1be
            r0.parseExtra(r11, r3)
            return r16
        L1be:
            int r3 = r2.getFastMatchToken()
            r15.nextTokenWithColon(r3)
            r2.parseField(r0, r11, r12, r13)
            return r17
    }

    protected java.lang.Object parseRest(com.alibaba.fastjson.parser.DefaultJSONParser r9, java.lang.reflect.Type r10, java.lang.Object r11, java.lang.Object r12, int r13) {
            r8 = this;
            r0 = 0
            int[] r7 = new int[r0]
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r9 = r1.parseRest(r2, r3, r4, r5, r6, r7)
            return r9
    }

    protected java.lang.Object parseRest(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.reflect.Type r2, java.lang.Object r3, java.lang.Object r4, int r5, int[] r6) {
            r0 = this;
            java.lang.Object r1 = r0.deserialze(r1, r2, r3, r4, r5, r6)
            return r1
    }

    protected java.lang.Enum<?> scanEnum(com.alibaba.fastjson.parser.JSONLexer r3, char r4) {
            r2 = this;
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "illegal enum. "
            r0.append(r1)
            java.lang.String r3 = r3.info()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    protected java.lang.Enum scanEnum(com.alibaba.fastjson.parser.JSONLexerBase r5, char[] r6, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r7) {
            r4 = this;
            boolean r0 = r7 instanceof com.alibaba.fastjson.parser.deserializer.EnumDeserializer
            r1 = 0
            if (r0 == 0) goto L8
            com.alibaba.fastjson.parser.deserializer.EnumDeserializer r7 = (com.alibaba.fastjson.parser.deserializer.EnumDeserializer) r7
            goto L9
        L8:
            r7 = r1
        L9:
            if (r7 != 0) goto Lf
            r6 = -1
            r5.matchStat = r6
            return r1
        Lf:
            long r2 = r5.scanFieldSymbol(r6)
            int r5 = r5.matchStat
            if (r5 <= 0) goto L1c
            java.lang.Enum r5 = r7.getEnumByHashCode(r2)
            return r5
        L1c:
            return r1
    }

    public com.alibaba.fastjson.parser.deserializer.FieldDeserializer smartMatch(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r2 = r1.smartMatch(r2, r0)
            return r2
    }

    public com.alibaba.fastjson.parser.deserializer.FieldDeserializer smartMatch(java.lang.String r10, int[] r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r1 = r9.getFieldDeserializer(r10, r11)
            r2 = 0
            if (r1 != 0) goto L53
            java.lang.String r3 = "is"
            boolean r3 = r10.startsWith(r3)
            r4 = 0
        L12:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r5 = r9.sortedFieldDeserializers
            int r5 = r5.length
            if (r4 >= r5) goto L53
            boolean r5 = isSetFlag(r4, r11)
            if (r5 == 0) goto L1e
            goto L50
        L1e:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r5 = r9.sortedFieldDeserializers
            r5 = r5[r4]
            com.alibaba.fastjson.util.FieldInfo r6 = r5.fieldInfo
            int r7 = r6.parserFeatures
            com.alibaba.fastjson.parser.Feature r8 = com.alibaba.fastjson.parser.Feature.DisableFieldSmartMatch
            int r8 = r8.mask
            r7 = r7 & r8
            if (r7 == 0) goto L2e
            return r0
        L2e:
            java.lang.Class<?> r7 = r6.fieldClass
            java.lang.String r6 = r6.name
            boolean r8 = r6.equalsIgnoreCase(r10)
            if (r8 == 0) goto L39
            goto L4e
        L39:
            if (r3 == 0) goto L50
            java.lang.Class r8 = java.lang.Boolean.TYPE
            if (r7 == r8) goto L43
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            if (r7 != r8) goto L50
        L43:
            r7 = 2
            java.lang.String r7 = r10.substring(r7)
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L50
        L4e:
            r1 = r5
            goto L53
        L50:
            int r4 = r4 + 1
            goto L12
        L53:
            if (r1 != 0) goto La4
            r3 = 0
        L56:
            int r4 = r10.length()
            if (r3 >= r4) goto L7c
            char r4 = r10.charAt(r3)
            r5 = 95
            java.lang.String r6 = ""
            r7 = 1
            if (r4 != r5) goto L6e
            java.lang.String r0 = "_"
            java.lang.String r0 = r10.replaceAll(r0, r6)
            goto L7d
        L6e:
            r5 = 45
            if (r4 != r5) goto L79
            java.lang.String r0 = "-"
            java.lang.String r0 = r10.replaceAll(r0, r6)
            goto L7d
        L79:
            int r3 = r3 + 1
            goto L56
        L7c:
            r7 = 0
        L7d:
            if (r7 == 0) goto La4
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r1 = r9.getFieldDeserializer(r0, r11)
            if (r1 != 0) goto La4
        L85:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r3 = r9.sortedFieldDeserializers
            int r3 = r3.length
            if (r2 >= r3) goto La4
            boolean r3 = isSetFlag(r2, r11)
            if (r3 == 0) goto L91
            goto La1
        L91:
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer[] r3 = r9.sortedFieldDeserializers
            r3 = r3[r2]
            com.alibaba.fastjson.util.FieldInfo r4 = r3.fieldInfo
            java.lang.String r4 = r4.name
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto La1
            r1 = r3
            goto La4
        La1:
            int r2 = r2 + 1
            goto L85
        La4:
            if (r1 != 0) goto Lb1
            java.util.Map<java.lang.String, com.alibaba.fastjson.parser.deserializer.FieldDeserializer> r11 = r9.alterNameFieldDeserializers
            if (r11 == 0) goto Lb1
            java.lang.Object r10 = r11.get(r10)
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r10 = (com.alibaba.fastjson.parser.deserializer.FieldDeserializer) r10
            return r10
        Lb1:
            return r1
    }
}
