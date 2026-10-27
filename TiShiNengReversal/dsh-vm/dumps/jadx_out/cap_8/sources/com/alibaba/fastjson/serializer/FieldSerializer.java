package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FieldSerializer implements java.lang.Comparable<com.alibaba.fastjson.serializer.FieldSerializer> {
    private final java.lang.String double_quoted_fieldPrefix;
    protected int features;
    protected com.alibaba.fastjson.serializer.BeanContext fieldContext;
    public final com.alibaba.fastjson.util.FieldInfo fieldInfo;
    private java.lang.String format;
    protected boolean persistenceOneToMany;
    private com.alibaba.fastjson.serializer.FieldSerializer.RuntimeSerializerInfo runtimeInfo;
    protected boolean serializeUsing;
    private java.lang.String single_quoted_fieldPrefix;
    private java.lang.String un_quoted_fieldPrefix;
    protected boolean writeEnumUsingName;
    protected boolean writeEnumUsingToString;
    protected final boolean writeNull;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RuntimeSerializerInfo {
        final com.alibaba.fastjson.serializer.ObjectSerializer fieldSerializer;
        final java.lang.Class<?> runtimeFieldClass;

        public RuntimeSerializerInfo(com.alibaba.fastjson.serializer.ObjectSerializer r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.fieldSerializer = r1
                r0.runtimeFieldClass = r2
                return
        }
    }

    public FieldSerializer(java.lang.Class<?> r8, com.alibaba.fastjson.util.FieldInfo r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.writeEnumUsingToString = r0
            r7.writeEnumUsingName = r0
            r7.serializeUsing = r0
            r7.persistenceOneToMany = r0
            r7.fieldInfo = r9
            com.alibaba.fastjson.serializer.BeanContext r1 = new com.alibaba.fastjson.serializer.BeanContext
            r1.<init>(r8, r9)
            r7.fieldContext = r1
            r1 = 1
            if (r8 == 0) goto L40
            boolean r2 = r9.isEnum
            if (r2 == 0) goto L40
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r2 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r2)
            com.alibaba.fastjson.annotation.JSONType r8 = (com.alibaba.fastjson.annotation.JSONType) r8
            if (r8 == 0) goto L40
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r8.serialzeFeatures()
            int r2 = r8.length
            r3 = 0
        L2c:
            if (r3 >= r2) goto L40
            r4 = r8[r3]
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            if (r4 != r5) goto L37
            r7.writeEnumUsingToString = r1
            goto L3d
        L37:
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName
            if (r4 != r5) goto L3d
            r7.writeEnumUsingName = r1
        L3d:
            int r3 = r3 + 1
            goto L2c
        L40:
            r9.setAccessible()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r2 = 34
            r8.append(r2)
            java.lang.String r2 = r9.name
            r8.append(r2)
            java.lang.String r2 = "\":"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.double_quoted_fieldPrefix = r8
            com.alibaba.fastjson.annotation.JSONField r8 = r9.getAnnotation()
            if (r8 == 0) goto Lb3
            com.alibaba.fastjson.serializer.SerializerFeature[] r2 = r8.serialzeFeatures()
            int r3 = r2.length
            r4 = 0
        L69:
            if (r4 >= r3) goto L7b
            r5 = r2[r4]
            int r5 = r5.getMask()
            int r6 = com.alibaba.fastjson.serializer.SerializerFeature.WRITE_MAP_NULL_FEATURES
            r5 = r5 & r6
            if (r5 == 0) goto L78
            r2 = 1
            goto L7c
        L78:
            int r4 = r4 + 1
            goto L69
        L7b:
            r2 = 0
        L7c:
            java.lang.String r3 = r8.format()
            r7.format = r3
            java.lang.String r3 = r3.trim()
            int r3 = r3.length()
            if (r3 != 0) goto L8f
            r3 = 0
            r7.format = r3
        L8f:
            com.alibaba.fastjson.serializer.SerializerFeature[] r3 = r8.serialzeFeatures()
            int r4 = r3.length
        L94:
            if (r0 >= r4) goto La8
            r5 = r3[r0]
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString
            if (r5 != r6) goto L9f
            r7.writeEnumUsingToString = r1
            goto La5
        L9f:
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName
            if (r5 != r6) goto La5
            r7.writeEnumUsingName = r1
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r8.serialzeFeatures()
            int r8 = com.alibaba.fastjson.serializer.SerializerFeature.of(r8)
            r7.features = r8
            r0 = r2
        Lb3:
            r7.writeNull = r0
            java.lang.reflect.Method r8 = r9.method
            boolean r8 = com.alibaba.fastjson.util.TypeUtils.isAnnotationPresentOneToMany(r8)
            r7.persistenceOneToMany = r8
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.alibaba.fastjson.serializer.FieldSerializer r2) {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            com.alibaba.fastjson.util.FieldInfo r2 = r2.fieldInfo
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.alibaba.fastjson.serializer.FieldSerializer r1) {
            r0 = this;
            com.alibaba.fastjson.serializer.FieldSerializer r1 = (com.alibaba.fastjson.serializer.FieldSerializer) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public java.lang.Object getPropertyValue(java.lang.Object r3) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r2 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r2.fieldInfo
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r0 = r2.format
            if (r0 == 0) goto L24
            if (r3 == 0) goto L24
            com.alibaba.fastjson.util.FieldInfo r0 = r2.fieldInfo
            java.lang.Class<?> r0 = r0.fieldClass
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L24
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = r2.format
            r0.<init>(r1)
            java.util.TimeZone r1 = com.alibaba.fastjson.JSON.defaultTimeZone
            r0.setTimeZone(r1)
            java.lang.String r3 = r0.format(r3)
        L24:
            return r3
    }

    public java.lang.Object getPropertyValueDirect(java.lang.Object r2) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r1 = this;
            com.alibaba.fastjson.util.FieldInfo r0 = r1.fieldInfo
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r1.persistenceOneToMany
            if (r0 == 0) goto L11
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.isHibernateInitialized(r2)
            if (r0 == 0) goto L11
            r2 = 0
        L11:
            return r2
    }

    public void writePrefix(com.alibaba.fastjson.serializer.JSONSerializer r3) throws java.io.IOException {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r3.out
            boolean r0 = r3.quoteFieldNames
            if (r0 == 0) goto L36
            boolean r0 = r3.useSingleQuotes
            if (r0 == 0) goto L30
            java.lang.String r0 = r2.single_quoted_fieldPrefix
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 39
            r0.append(r1)
            com.alibaba.fastjson.util.FieldInfo r1 = r2.fieldInfo
            java.lang.String r1 = r1.name
            r0.append(r1)
            java.lang.String r1 = "':"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.single_quoted_fieldPrefix = r0
        L2a:
            java.lang.String r0 = r2.single_quoted_fieldPrefix
            r3.write(r0)
            return
        L30:
            java.lang.String r0 = r2.double_quoted_fieldPrefix
            r3.write(r0)
            return
        L36:
            java.lang.String r0 = r2.un_quoted_fieldPrefix
            if (r0 != 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.alibaba.fastjson.util.FieldInfo r1 = r2.fieldInfo
            java.lang.String r1 = r1.name
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.un_quoted_fieldPrefix = r0
        L51:
            java.lang.String r0 = r2.un_quoted_fieldPrefix
            r3.write(r0)
            return
    }

    public void writeValue(com.alibaba.fastjson.serializer.JSONSerializer r10, java.lang.Object r11) throws java.lang.Exception {
            r9 = this;
            com.alibaba.fastjson.serializer.FieldSerializer$RuntimeSerializerInfo r0 = r9.runtimeInfo
            if (r0 != 0) goto L60
            if (r11 != 0) goto Lb
            com.alibaba.fastjson.util.FieldInfo r0 = r9.fieldInfo
            java.lang.Class<?> r0 = r0.fieldClass
            goto Lf
        Lb:
            java.lang.Class r0 = r11.getClass()
        Lf:
            com.alibaba.fastjson.util.FieldInfo r1 = r9.fieldInfo
            com.alibaba.fastjson.annotation.JSONField r1 = r1.getAnnotation()
            if (r1 == 0) goto L2d
            java.lang.Class r2 = r1.serializeUsing()
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r2 == r3) goto L2d
            java.lang.Class r1 = r1.serializeUsing()
            java.lang.Object r1 = r1.newInstance()
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = (com.alibaba.fastjson.serializer.ObjectSerializer) r1
            r2 = 1
            r9.serializeUsing = r2
            goto L59
        L2d:
            java.lang.String r1 = r9.format
            if (r1 == 0) goto L52
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 == r1) goto L4a
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L3a
            goto L4a
        L3a:
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 == r1) goto L42
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L52
        L42:
            com.alibaba.fastjson.serializer.FloatCodec r1 = new com.alibaba.fastjson.serializer.FloatCodec
            java.lang.String r2 = r9.format
            r1.<init>(r2)
            goto L53
        L4a:
            com.alibaba.fastjson.serializer.DoubleSerializer r1 = new com.alibaba.fastjson.serializer.DoubleSerializer
            java.lang.String r2 = r9.format
            r1.<init>(r2)
            goto L53
        L52:
            r1 = 0
        L53:
            if (r1 != 0) goto L59
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = r10.getObjectWriter(r0)
        L59:
            com.alibaba.fastjson.serializer.FieldSerializer$RuntimeSerializerInfo r2 = new com.alibaba.fastjson.serializer.FieldSerializer$RuntimeSerializerInfo
            r2.<init>(r1, r0)
            r9.runtimeInfo = r2
        L60:
            com.alibaba.fastjson.serializer.FieldSerializer$RuntimeSerializerInfo r0 = r9.runtimeInfo
            com.alibaba.fastjson.util.FieldInfo r1 = r9.fieldInfo
            int r7 = r1.serialzeFeatures
            if (r11 != 0) goto Lca
            java.lang.Class<?> r11 = r0.runtimeFieldClass
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r10.out
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            boolean r2 = r2.isAssignableFrom(r11)
            if (r2 == 0) goto L7e
            int r10 = r9.features
            com.alibaba.fastjson.serializer.SerializerFeature r11 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            int r11 = r11.mask
            r1.writeNull(r10, r11)
            return
        L7e:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r2 != r11) goto L8c
            int r10 = r9.features
            com.alibaba.fastjson.serializer.SerializerFeature r11 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty
            int r11 = r11.mask
            r1.writeNull(r10, r11)
            return
        L8c:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r2 != r11) goto L9a
            int r10 = r9.features
            com.alibaba.fastjson.serializer.SerializerFeature r11 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullBooleanAsFalse
            int r11 = r11.mask
            r1.writeNull(r10, r11)
            return
        L9a:
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r11 = r2.isAssignableFrom(r11)
            if (r11 == 0) goto Lac
            int r10 = r9.features
            com.alibaba.fastjson.serializer.SerializerFeature r11 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            int r11 = r11.mask
            r1.writeNull(r10, r11)
            return
        Lac:
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = r0.fieldSerializer
            int r11 = com.alibaba.fastjson.serializer.SerializerFeature.WRITE_MAP_NULL_FEATURES
            boolean r11 = r1.isEnabled(r11)
            if (r11 == 0) goto Lbe
            boolean r11 = r2 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r11 == 0) goto Lbe
            r1.writeNull()
            return
        Lbe:
            com.alibaba.fastjson.util.FieldInfo r11 = r9.fieldInfo
            java.lang.String r5 = r11.name
            java.lang.reflect.Type r6 = r11.fieldType
            r4 = 0
            r3 = r10
            r2.write(r3, r4, r5, r6, r7)
            return
        Lca:
            r3 = r10
            boolean r10 = r1.isEnum
            if (r10 == 0) goto Lef
            boolean r10 = r9.writeEnumUsingName
            if (r10 == 0) goto Ldf
            com.alibaba.fastjson.serializer.SerializeWriter r10 = r3.out
            java.lang.Enum r11 = (java.lang.Enum) r11
            java.lang.String r11 = r11.name()
            r10.writeString(r11)
            return
        Ldf:
            boolean r10 = r9.writeEnumUsingToString
            if (r10 == 0) goto Lef
            com.alibaba.fastjson.serializer.SerializeWriter r10 = r3.out
            java.lang.Enum r11 = (java.lang.Enum) r11
            java.lang.String r11 = r11.toString()
            r10.writeString(r11)
            return
        Lef:
            java.lang.Class r10 = r11.getClass()
            java.lang.Class<?> r1 = r0.runtimeFieldClass
            if (r10 == r1) goto L102
            boolean r1 = r9.serializeUsing
            if (r1 == 0) goto Lfc
            goto L102
        Lfc:
            com.alibaba.fastjson.serializer.ObjectSerializer r10 = r3.getObjectWriter(r10)
        L100:
            r2 = r10
            goto L105
        L102:
            com.alibaba.fastjson.serializer.ObjectSerializer r10 = r0.fieldSerializer
            goto L100
        L105:
            java.lang.String r10 = r9.format
            if (r10 == 0) goto L121
            boolean r0 = r2 instanceof com.alibaba.fastjson.serializer.DoubleSerializer
            if (r0 != 0) goto L121
            boolean r0 = r2 instanceof com.alibaba.fastjson.serializer.FloatCodec
            if (r0 != 0) goto L121
            boolean r0 = r2 instanceof com.alibaba.fastjson.serializer.ContextObjectSerializer
            if (r0 == 0) goto L11d
            com.alibaba.fastjson.serializer.ContextObjectSerializer r2 = (com.alibaba.fastjson.serializer.ContextObjectSerializer) r2
            com.alibaba.fastjson.serializer.BeanContext r10 = r9.fieldContext
            r2.write(r3, r11, r10)
            return
        L11d:
            r3.writeWithFormat(r11, r10)
            return
        L121:
            com.alibaba.fastjson.util.FieldInfo r10 = r9.fieldInfo
            boolean r0 = r10.unwrapped
            if (r0 == 0) goto L147
            boolean r0 = r2 instanceof com.alibaba.fastjson.serializer.JavaBeanSerializer
            if (r0 == 0) goto L137
            com.alibaba.fastjson.serializer.JavaBeanSerializer r2 = (com.alibaba.fastjson.serializer.JavaBeanSerializer) r2
            java.lang.String r5 = r10.name
            java.lang.reflect.Type r6 = r10.fieldType
            r8 = 1
            r4 = r11
            r2.write(r3, r4, r5, r6, r7, r8)
            return
        L137:
            r4 = r11
            boolean r11 = r2 instanceof com.alibaba.fastjson.serializer.MapSerializer
            if (r11 == 0) goto L148
            com.alibaba.fastjson.serializer.MapSerializer r2 = (com.alibaba.fastjson.serializer.MapSerializer) r2
            java.lang.String r5 = r10.name
            java.lang.reflect.Type r6 = r10.fieldType
            r8 = 1
            r2.write(r3, r4, r5, r6, r7, r8)
            return
        L147:
            r4 = r11
        L148:
            java.lang.String r5 = r10.name
            java.lang.reflect.Type r6 = r10.fieldType
            r2.write(r3, r4, r5, r6, r7)
            return
    }
}
