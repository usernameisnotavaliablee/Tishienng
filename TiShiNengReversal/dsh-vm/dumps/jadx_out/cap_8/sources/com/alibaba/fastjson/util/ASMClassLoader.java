package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ASMClassLoader extends java.lang.ClassLoader {
    private static java.security.ProtectionDomain DOMAIN;
    private static java.util.Map<java.lang.String, java.lang.Class<?>> classMapping;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.alibaba.fastjson.util.ASMClassLoader.classMapping = r0
            com.alibaba.fastjson.util.ASMClassLoader$1 r0 = new com.alibaba.fastjson.util.ASMClassLoader$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.security.ProtectionDomain r0 = (java.security.ProtectionDomain) r0
            com.alibaba.fastjson.util.ASMClassLoader.DOMAIN = r0
            r0 = 56
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            java.lang.Class<com.alibaba.fastjson.JSON> r3 = com.alibaba.fastjson.JSON.class
            r1[r2] = r3
            java.lang.Class<com.alibaba.fastjson.JSONObject> r3 = com.alibaba.fastjson.JSONObject.class
            r4 = 1
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONArray> r3 = com.alibaba.fastjson.JSONArray.class
            r4 = 2
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONPath> r3 = com.alibaba.fastjson.JSONPath.class
            r4 = 3
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONAware> r3 = com.alibaba.fastjson.JSONAware.class
            r4 = 4
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONException> r3 = com.alibaba.fastjson.JSONException.class
            r4 = 5
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONPathException> r3 = com.alibaba.fastjson.JSONPathException.class
            r4 = 6
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONReader> r3 = com.alibaba.fastjson.JSONReader.class
            r4 = 7
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONStreamAware> r3 = com.alibaba.fastjson.JSONStreamAware.class
            r4 = 8
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.JSONWriter> r3 = com.alibaba.fastjson.JSONWriter.class
            r4 = 9
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.TypeReference> r3 = com.alibaba.fastjson.TypeReference.class
            r4 = 10
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.util.FieldInfo> r3 = com.alibaba.fastjson.util.FieldInfo.class
            r4 = 11
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.util.TypeUtils> r3 = com.alibaba.fastjson.util.TypeUtils.class
            r4 = 12
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.util.IOUtils> r3 = com.alibaba.fastjson.util.IOUtils.class
            r4 = 13
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.util.IdentityHashMap> r3 = com.alibaba.fastjson.util.IdentityHashMap.class
            r4 = 14
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.util.ParameterizedTypeImpl> r3 = com.alibaba.fastjson.util.ParameterizedTypeImpl.class
            r4 = 15
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.util.JavaBeanInfo> r3 = com.alibaba.fastjson.util.JavaBeanInfo.class
            r4 = 16
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.ObjectSerializer> r3 = com.alibaba.fastjson.serializer.ObjectSerializer.class
            r4 = 17
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.JavaBeanSerializer> r3 = com.alibaba.fastjson.serializer.JavaBeanSerializer.class
            r4 = 18
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeFilterable> r3 = com.alibaba.fastjson.serializer.SerializeFilterable.class
            r4 = 19
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeBeanInfo> r3 = com.alibaba.fastjson.serializer.SerializeBeanInfo.class
            r4 = 20
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.JSONSerializer> r3 = com.alibaba.fastjson.serializer.JSONSerializer.class
            r4 = 21
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeWriter> r3 = com.alibaba.fastjson.serializer.SerializeWriter.class
            r4 = 22
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeFilter> r3 = com.alibaba.fastjson.serializer.SerializeFilter.class
            r4 = 23
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.Labels> r3 = com.alibaba.fastjson.serializer.Labels.class
            r4 = 24
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.LabelFilter> r3 = com.alibaba.fastjson.serializer.LabelFilter.class
            r4 = 25
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.ContextValueFilter> r3 = com.alibaba.fastjson.serializer.ContextValueFilter.class
            r4 = 26
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.AfterFilter> r3 = com.alibaba.fastjson.serializer.AfterFilter.class
            r4 = 27
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.BeforeFilter> r3 = com.alibaba.fastjson.serializer.BeforeFilter.class
            r4 = 28
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.NameFilter> r3 = com.alibaba.fastjson.serializer.NameFilter.class
            r4 = 29
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.PropertyFilter> r3 = com.alibaba.fastjson.serializer.PropertyFilter.class
            r4 = 30
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.PropertyPreFilter> r3 = com.alibaba.fastjson.serializer.PropertyPreFilter.class
            r4 = 31
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.ValueFilter> r3 = com.alibaba.fastjson.serializer.ValueFilter.class
            r4 = 32
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerializerFeature> r3 = com.alibaba.fastjson.serializer.SerializerFeature.class
            r4 = 33
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.ContextObjectSerializer> r3 = com.alibaba.fastjson.serializer.ContextObjectSerializer.class
            r4 = 34
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerialContext> r3 = com.alibaba.fastjson.serializer.SerialContext.class
            r4 = 35
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.SerializeConfig> r3 = com.alibaba.fastjson.serializer.SerializeConfig.class
            r4 = 36
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class
            r4 = 37
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.ParserConfig> r3 = com.alibaba.fastjson.parser.ParserConfig.class
            r4 = 38
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.DefaultJSONParser> r3 = com.alibaba.fastjson.parser.DefaultJSONParser.class
            r4 = 39
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.JSONLexer> r3 = com.alibaba.fastjson.parser.JSONLexer.class
            r4 = 40
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.JSONLexerBase> r3 = com.alibaba.fastjson.parser.JSONLexerBase.class
            r4 = 41
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.ParseContext> r3 = com.alibaba.fastjson.parser.ParseContext.class
            r4 = 42
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.JSONToken> r3 = com.alibaba.fastjson.parser.JSONToken.class
            r4 = 43
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.SymbolTable> r3 = com.alibaba.fastjson.parser.SymbolTable.class
            r4 = 44
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.Feature> r3 = com.alibaba.fastjson.parser.Feature.class
            r4 = 45
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.JSONScanner> r3 = com.alibaba.fastjson.parser.JSONScanner.class
            r4 = 46
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.JSONReaderScanner> r3 = com.alibaba.fastjson.parser.JSONReaderScanner.class
            r4 = 47
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer.class
            r4 = 48
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ObjectDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.ObjectDeserializer.class
            r4 = 49
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ExtraProcessor> r3 = com.alibaba.fastjson.parser.deserializer.ExtraProcessor.class
            r4 = 50
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ExtraProcessable> r3 = com.alibaba.fastjson.parser.deserializer.ExtraProcessable.class
            r4 = 51
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider> r3 = com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider.class
            r4 = 52
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.serializer.BeanContext> r3 = com.alibaba.fastjson.serializer.BeanContext.class
            r4 = 53
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.FieldDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.FieldDeserializer.class
            r4 = 54
            r1[r4] = r3
            java.lang.Class<com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer> r3 = com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer.class
            r4 = 55
            r1[r4] = r3
        L160:
            if (r2 >= r0) goto L170
            r3 = r1[r2]
            java.util.Map<java.lang.String, java.lang.Class<?>> r4 = com.alibaba.fastjson.util.ASMClassLoader.classMapping
            java.lang.String r5 = r3.getName()
            r4.put(r5, r3)
            int r2 = r2 + 1
            goto L160
        L170:
            return
    }

    public ASMClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = getParentClassLoader()
            r1.<init>(r0)
            return
    }

    public ASMClassLoader(java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static java.lang.ClassLoader getParentClassLoader() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.lang.Class<com.alibaba.fastjson.JSON> r1 = com.alibaba.fastjson.JSON.class
            if (r0 == 0) goto L14
            java.lang.String r2 = r1.getName()     // Catch: java.lang.ClassNotFoundException -> L14
            r0.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L14
            return r0
        L14:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            return r0
    }

    public java.lang.Class<?> defineClassPublic(java.lang.String r7, byte[] r8, int r9, int r10) throws java.lang.ClassFormatError {
            r6 = this;
            java.security.ProtectionDomain r5 = com.alibaba.fastjson.util.ASMClassLoader.DOMAIN
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Class r7 = r0.defineClass(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean isExternalClass(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            r1 = r2
        L9:
            if (r1 == 0) goto L13
            if (r1 != r3) goto Le
            return r0
        Le:
            java.lang.ClassLoader r1 = r1.getParent()
            goto L9
        L13:
            r3 = 1
            return r3
    }

    @Override // java.lang.ClassLoader
    protected java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = com.alibaba.fastjson.util.ASMClassLoader.classMapping
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.Class r2 = super.loadClass(r2, r3)
            return r2
    }
}
