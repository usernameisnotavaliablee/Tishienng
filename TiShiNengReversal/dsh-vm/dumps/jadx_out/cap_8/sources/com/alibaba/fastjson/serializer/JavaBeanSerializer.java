package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JavaBeanSerializer extends com.alibaba.fastjson.serializer.SerializeFilterable implements com.alibaba.fastjson.serializer.ObjectSerializer {
    protected com.alibaba.fastjson.serializer.SerializeBeanInfo beanInfo;
    protected final com.alibaba.fastjson.serializer.FieldSerializer[] getters;
    protected final com.alibaba.fastjson.serializer.FieldSerializer[] sortedGetters;

    public JavaBeanSerializer(com.alibaba.fastjson.serializer.SerializeBeanInfo r7) {
            r6 = this;
            r6.<init>()
            r6.beanInfo = r7
            com.alibaba.fastjson.util.FieldInfo[] r0 = r7.sortedFields
            int r0 = r0.length
            com.alibaba.fastjson.serializer.FieldSerializer[] r0 = new com.alibaba.fastjson.serializer.FieldSerializer[r0]
            r6.sortedGetters = r0
            r0 = 0
            r1 = 0
        Le:
            com.alibaba.fastjson.serializer.FieldSerializer[] r2 = r6.sortedGetters
            int r3 = r2.length
            if (r1 >= r3) goto L23
            com.alibaba.fastjson.serializer.FieldSerializer r3 = new com.alibaba.fastjson.serializer.FieldSerializer
            java.lang.Class<?> r4 = r7.beanType
            com.alibaba.fastjson.util.FieldInfo[] r5 = r7.sortedFields
            r5 = r5[r1]
            r3.<init>(r4, r5)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Le
        L23:
            com.alibaba.fastjson.util.FieldInfo[] r1 = r7.fields
            com.alibaba.fastjson.util.FieldInfo[] r3 = r7.sortedFields
            if (r1 != r3) goto L2c
            r6.getters = r2
            return
        L2c:
            int r1 = r1.length
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = new com.alibaba.fastjson.serializer.FieldSerializer[r1]
            r6.getters = r1
        L31:
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r6.getters
            int r2 = r1.length
            if (r0 >= r2) goto L45
            com.alibaba.fastjson.util.FieldInfo[] r2 = r7.fields
            r2 = r2[r0]
            java.lang.String r2 = r2.name
            com.alibaba.fastjson.serializer.FieldSerializer r2 = r6.getFieldSerializer(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L31
        L45:
            return
    }

    public JavaBeanSerializer(java.lang.Class<?> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public JavaBeanSerializer(java.lang.Class<?> r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson.serializer.SerializeBeanInfo r2 = com.alibaba.fastjson.util.TypeUtils.buildBeanInfo(r2, r3, r0)
            r1.<init>(r2)
            return
    }

    public JavaBeanSerializer(java.lang.Class<?> r1, java.lang.String... r2) {
            r0 = this;
            java.util.Map r2 = createAliasMap(r2)
            r0.<init>(r1, r2)
            return
    }

    static java.util.Map<java.lang.String, java.lang.String> createAliasMap(java.lang.String... r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r4[r2]
            r0.put(r3, r3)
            int r2 = r2 + 1
            goto L7
        L11:
            return r0
    }

    protected boolean applyLabel(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.String r4) {
            r2 = this;
            java.util.List<com.alibaba.fastjson.serializer.LabelFilter> r3 = r3.labelFilters
            r0 = 0
            if (r3 == 0) goto L1c
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            com.alibaba.fastjson.serializer.LabelFilter r1 = (com.alibaba.fastjson.serializer.LabelFilter) r1
            boolean r1 = r1.apply(r4)
            if (r1 != 0) goto L9
            return r0
        L1c:
            java.util.List<com.alibaba.fastjson.serializer.LabelFilter> r3 = r2.labelFilters
            if (r3 == 0) goto L37
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            com.alibaba.fastjson.serializer.LabelFilter r1 = (com.alibaba.fastjson.serializer.LabelFilter) r1
            boolean r1 = r1.apply(r4)
            if (r1 != 0) goto L24
            return r0
        L37:
            r3 = 1
            return r3
    }

    protected com.alibaba.fastjson.serializer.BeanContext getBeanContext(int r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.FieldSerializer[] r0 = r1.sortedGetters
            r2 = r0[r2]
            com.alibaba.fastjson.serializer.BeanContext r2 = r2.fieldContext
            return r2
    }

    public com.alibaba.fastjson.serializer.FieldSerializer getFieldSerializer(java.lang.String r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r5.sortedGetters
            int r1 = r1.length
            int r1 = r1 + (-1)
            r2 = 0
        La:
            if (r2 > r1) goto L2d
            int r3 = r2 + r1
            int r3 = r3 >>> 1
            com.alibaba.fastjson.serializer.FieldSerializer[] r4 = r5.sortedGetters
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
            com.alibaba.fastjson.serializer.FieldSerializer[] r6 = r5.sortedGetters
            r6 = r6[r3]
            return r6
        L2d:
            return r0
    }

    protected java.lang.reflect.Type getFieldType(int r2) {
            r1 = this;
            com.alibaba.fastjson.serializer.FieldSerializer[] r0 = r1.sortedGetters
            r2 = r0[r2]
            com.alibaba.fastjson.util.FieldInfo r2 = r2.fieldInfo
            java.lang.reflect.Type r2 = r2.fieldType
            return r2
    }

    public java.lang.Object getFieldValue(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "getFieldValue error."
            com.alibaba.fastjson.serializer.FieldSerializer r1 = r3.getFieldSerializer(r5)
            if (r1 == 0) goto L39
            java.lang.Object r4 = r1.getPropertyValue(r4)     // Catch: java.lang.IllegalAccessException -> Ld java.lang.reflect.InvocationTargetException -> L23
            return r4
        Ld:
            r4 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r4)
            throw r1
        L23:
            r4 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r4)
            throw r1
        L39:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "field not found. "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public java.util.List<java.lang.Object> getFieldValues(java.lang.Object r6) throws java.lang.Exception {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r5.sortedGetters
            int r1 = r1.length
            r0.<init>(r1)
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r5.sortedGetters
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]
            java.lang.Object r4 = r4.getPropertyValue(r6)
            r0.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1a:
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getFieldValuesMap(java.lang.Object r7) throws java.lang.Exception {
            r6 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r6.sortedGetters
            int r1 = r1.length
            r0.<init>(r1)
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r6.sortedGetters
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            com.alibaba.fastjson.util.FieldInfo r5 = r4.fieldInfo
            java.lang.String r5 = r5.name
            java.lang.Object r4 = r4.getPropertyValue(r7)
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto Lc
        L1e:
            return r0
    }

    public java.util.List<java.lang.Object> getObjectFieldValues(java.lang.Object r8) throws java.lang.Exception {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r7.sortedGetters
            int r1 = r1.length
            r0.<init>(r1)
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r7.sortedGetters
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L32
            r4 = r1[r3]
            com.alibaba.fastjson.util.FieldInfo r5 = r4.fieldInfo
            java.lang.Class<?> r5 = r5.fieldClass
            boolean r6 = r5.isPrimitive()
            if (r6 == 0) goto L1b
            goto L2f
        L1b:
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "java.lang."
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L28
            goto L2f
        L28:
            java.lang.Object r4 = r4.getPropertyValue(r8)
            r0.add(r4)
        L2f:
            int r3 = r3 + 1
            goto Lc
        L32:
            return r0
    }

    public int getSize(java.lang.Object r6) throws java.lang.Exception {
            r5 = this;
            com.alibaba.fastjson.serializer.FieldSerializer[] r0 = r5.sortedGetters
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            java.lang.Object r4 = r4.getPropertyValueDirect(r6)
            if (r4 == 0) goto L11
            int r3 = r3 + 1
        L11:
            int r2 = r2 + 1
            goto L5
        L14:
            return r3
    }

    protected boolean isWriteAsArray(com.alibaba.fastjson.serializer.JSONSerializer r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.isWriteAsArray(r2, r0)
            return r2
    }

    protected boolean isWriteAsArray(com.alibaba.fastjson.serializer.JSONSerializer r3, int r4) {
            r2 = this;
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray
            int r0 = r0.mask
            com.alibaba.fastjson.serializer.SerializeBeanInfo r1 = r2.beanInfo
            int r1 = r1.features
            r1 = r1 & r0
            if (r1 != 0) goto L18
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r3.out
            boolean r3 = r3.beanToArray
            if (r3 != 0) goto L18
            r3 = r4 & r0
            if (r3 == 0) goto L16
            goto L18
        L16:
            r3 = 0
            return r3
        L18:
            r3 = 1
            return r3
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, int r12) throws java.io.IOException {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.write(r1, r2, r3, r4, r5, r6)
            return
    }

    protected void write(com.alibaba.fastjson.serializer.JSONSerializer r28, java.lang.Object r29, java.lang.Object r30, java.lang.reflect.Type r31, int r32, boolean r33) throws java.io.IOException {
            r27 = this;
            r1 = r27
            r2 = r28
            r4 = r29
            r8 = r31
            r7 = r32
            com.alibaba.fastjson.serializer.SerializeWriter r9 = r2.out
            if (r4 != 0) goto L12
            r9.writeNull()
            return
        L12:
            boolean r0 = r1.writeReference(r2, r4, r7)
            if (r0 == 0) goto L19
            return
        L19:
            boolean r0 = r9.sortField
            if (r0 == 0) goto L21
            com.alibaba.fastjson.serializer.FieldSerializer[] r0 = r1.sortedGetters
        L1f:
            r10 = r0
            goto L24
        L21:
            com.alibaba.fastjson.serializer.FieldSerializer[] r0 = r1.getters
            goto L1f
        L24:
            com.alibaba.fastjson.serializer.SerialContext r3 = r2.context
            com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = r1.beanInfo
            int r6 = r0.features
            r5 = r30
            r2.setContext(r3, r4, r5, r6, r7)
            r11 = r3
            r0 = r7
            boolean r12 = r1.isWriteAsArray(r2, r0)
            if (r12 == 0) goto L3a
            r0 = 91
            goto L3c
        L3a:
            r0 = 123(0x7b, float:1.72E-43)
        L3c:
            if (r12 == 0) goto L43
            r3 = 93
            r13 = 93
            goto L47
        L43:
            r3 = 125(0x7d, float:1.75E-43)
            r13 = 125(0x7d, float:1.75E-43)
        L47:
            if (r33 != 0) goto L53
            r9.append(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L53
        L4d:
            r0 = move-exception
            goto L31f
        L50:
            r0 = move-exception
            goto L2c5
        L53:
            int r0 = r10.length     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 <= 0) goto L64
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r0 = r9.isEnabled(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto L64
            r2.incrementIndent()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r2.println()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L64:
            com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = r1.beanInfo     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r0 = r0.features     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r3 = r3.mask     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r0 = r0 & r3
            r14 = 44
            if (r0 != 0) goto L77
            boolean r0 = r2.isWriteClassName(r8, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto L87
        L77:
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == r8) goto L87
            com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = r1.beanInfo     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.String r0 = r0.typeKey     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r1.writeClassName(r2, r0, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r0 = 44
            goto L88
        L87:
            r0 = 0
        L88:
            boolean r3 = r9.quoteFieldNames     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r5 = 1
            if (r3 == 0) goto L94
            boolean r3 = r9.useSingleQuotes     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != 0) goto L94
            r16 = 1
            goto L96
        L94:
            r16 = 0
        L96:
            char r0 = r1.writeBefore(r2, r4, r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 != r14) goto L9e
            r0 = 1
            goto L9f
        L9e:
            r0 = 0
        L9f:
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r17 = r9.isEnabled(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r18 = r9.isEnabled(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r19 = r0
            r3 = 0
        Lae:
            int r0 = r10.length     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 >= r0) goto L2a0
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            com.alibaba.fastjson.util.FieldInfo r15 = r6.fieldInfo     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.reflect.Field r0 = r15.field     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r20 = 1
            java.lang.String r5 = r15.name     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.Class<?> r14 = r15.fieldClass     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r17 == 0) goto Ld1
            if (r0 == 0) goto Ld1
            r21 = r0
            boolean r0 = r15.fieldTransient     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto Ld3
        Lc7:
            r21 = r3
            r22 = r12
        Lcb:
            r3 = 44
            r5 = 1
            r8 = 0
            goto L295
        Ld1:
            r21 = r0
        Ld3:
            if (r18 == 0) goto Ld8
            if (r21 != 0) goto Ld8
            goto Lc7
        Ld8:
            boolean r0 = r1.applyName(r2, r4, r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto Lc7
            java.lang.String r0 = r15.label     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r0 = r1.applyLabel(r2, r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 != 0) goto Le7
            goto Lc7
        Le7:
            com.alibaba.fastjson.serializer.SerializeBeanInfo r0 = r1.beanInfo     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.String r0 = r0.typeKey     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto Lfa
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto Lfa
            boolean r0 = r2.isWriteClassName(r8, r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto Lfa
            goto Lc7
        Lfa:
            java.lang.Object r0 = r6.getPropertyValueDirect(r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> Lff
            goto L10b
        Lff:
            r0 = move-exception
            r21 = r0
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r0 = r9.isEnabled(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto L294
            r0 = 0
        L10b:
            boolean r21 = r1.apply(r2, r4, r5, r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r21 != 0) goto L112
            goto Lc7
        L112:
            java.lang.String r8 = r1.processKey(r2, r4, r5, r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r21 = r3
            com.alibaba.fastjson.serializer.BeanContext r3 = r6.fieldContext     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r22 = r12
            r12 = r6
            r6 = r0
            java.lang.Object r0 = r1.processValue(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 != 0) goto L133
            if (r22 != 0) goto L133
            boolean r3 = r12.writeNull     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != 0) goto L133
            int r3 = com.alibaba.fastjson.serializer.SerializerFeature.WRITE_MAP_NULL_FEATURES     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r3 = r9.isEnabled(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != 0) goto L133
        L132:
            goto Lcb
        L133:
            if (r0 == 0) goto L1de
            boolean r3 = r9.notWriteDefaultValue     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != 0) goto L14f
            int r3 = r15.serialzeFeatures     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r23 = r3
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r3 = r3.mask     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r23 = r23 & r3
            if (r23 != 0) goto L14f
            r23 = r3
            com.alibaba.fastjson.serializer.SerializeBeanInfo r3 = r1.beanInfo     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r3 = r3.features     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r3 = r3 & r23
            if (r3 == 0) goto L1de
        L14f:
            java.lang.Class<?> r3 = r15.fieldClass     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.Class r7 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L163
            boolean r7 = r0 instanceof java.lang.Byte     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L163
            r7 = r0
            java.lang.Byte r7 = (java.lang.Byte) r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            byte r7 = r7.byteValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 != 0) goto L163
            goto L132
        L163:
            java.lang.Class r7 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L175
            boolean r7 = r0 instanceof java.lang.Short     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L175
            r7 = r0
            java.lang.Short r7 = (java.lang.Short) r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            short r7 = r7.shortValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 != 0) goto L175
            goto L132
        L175:
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L187
            boolean r7 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L187
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 != 0) goto L187
            goto L132
        L187:
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L19d
            boolean r7 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L19d
            r7 = r0
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            long r23 = r7.longValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r25 = 0
            int r7 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r7 != 0) goto L19d
        L19c:
            goto L132
        L19d:
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L1b4
            boolean r7 = r0 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L1b4
            r7 = r0
            java.lang.Float r7 = (java.lang.Float) r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r23 = 0
            int r7 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r7 != 0) goto L1b4
            goto L132
        L1b4:
            java.lang.Class r7 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L1cb
            boolean r7 = r0 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L1cb
            r7 = r0
            java.lang.Double r7 = (java.lang.Double) r7     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            double r23 = r7.doubleValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r25 = 0
            int r7 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r7 != 0) goto L1cb
            goto L132
        L1cb:
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != r7) goto L1de
            boolean r3 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 == 0) goto L1de
            r3 = r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != 0) goto L1de
            goto L132
        L1de:
            if (r19 == 0) goto L203
            boolean r3 = r15.unwrapped     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 == 0) goto L1f2
            boolean r3 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 == 0) goto L1f2
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r3 != 0) goto L1f2
            goto L19c
        L1f2:
            r3 = 44
            r9.write(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r7 = r9.isEnabled(r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 == 0) goto L205
            r2.println()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L205
        L203:
            r3 = 44
        L205:
            if (r8 == r5) goto L215
            if (r22 != 0) goto L20e
            r5 = 1
            r9.writeFieldName(r8, r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L20f
        L20e:
            r5 = 1
        L20f:
            r2.write(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L212:
            r8 = 0
            goto L291
        L215:
            r5 = 1
            if (r6 == r0) goto L221
            if (r22 != 0) goto L21d
            r12.writePrefix(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L21d:
            r2.write(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L212
        L221:
            if (r22 != 0) goto L234
            boolean r6 = r15.unwrapped     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r6 != 0) goto L234
            if (r16 == 0) goto L231
            char[] r6 = r15.name_chars     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r7 = r6.length     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r8 = 0
            r9.write(r6, r8, r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L234
        L231:
            r12.writePrefix(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L234:
            if (r22 != 0) goto L28d
            com.alibaba.fastjson.annotation.JSONField r6 = r15.getAnnotation()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r14 != r7) goto L249
            if (r6 == 0) goto L24b
            java.lang.Class r6 = r6.serializeUsing()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
            if (r6 != r7) goto L249
            goto L24b
        L249:
            r8 = 0
            goto L275
        L24b:
            if (r0 != 0) goto L266
            int r0 = r9.features     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            com.alibaba.fastjson.serializer.SerializerFeature r6 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r6 = r6.mask     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r0 = r0 & r6
            if (r0 != 0) goto L260
            int r0 = r12.features     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r0 = r0 & r6
            if (r0 == 0) goto L25c
            goto L260
        L25c:
            r9.writeNull()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L212
        L260:
            java.lang.String r0 = ""
            r9.writeString(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L212
        L266:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r6 = r9.useSingleQuotes     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r6 == 0) goto L270
            r9.writeStringWithSingleQuote(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L212
        L270:
            r8 = 0
            r9.writeStringWithDoubleQuote(r0, r8)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L291
        L275:
            boolean r6 = r15.unwrapped     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r6 == 0) goto L289
            boolean r6 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r6 == 0) goto L289
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r6 != 0) goto L289
            r19 = 0
            goto L295
        L289:
            r12.writeValue(r2, r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            goto L291
        L28d:
            r8 = 0
            r12.writeValue(r2, r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L291:
            r19 = 1
            goto L295
        L294:
            throw r21     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L295:
            int r0 = r21 + 1
            r8 = r31
            r3 = r0
            r12 = r22
            r14 = 44
            goto Lae
        L2a0:
            r3 = 44
            r8 = 0
            if (r19 == 0) goto L2a8
            r14 = 44
            goto L2a9
        L2a8:
            r14 = 0
        L2a9:
            r1.writeAfter(r2, r4, r14)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            int r0 = r10.length     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 <= 0) goto L2bd
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r0 = r9.isEnabled(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r0 == 0) goto L2bd
            r2.decrementIdent()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r2.println()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L2bd:
            if (r33 != 0) goto L2c2
            r9.append(r13)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
        L2c2:
            r2.context = r11
            return
        L2c5:
            java.lang.String r3 = "write javaBean error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4d
            r5.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = ", class "
            r5.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L4d
            r5.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4d
            if (r30 == 0) goto L2fb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            r4.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = ", fieldName : "
            r4.append(r3)     // Catch: java.lang.Throwable -> L4d
            r5 = r30
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L4d
        L2fb:
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L319
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            r4.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = ", "
            r4.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L4d
            r4.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L4d
        L319:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.Throwable -> L4d
        L31f:
            r2.context = r11
            throw r0
    }

    protected char writeAfter(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.Object r4, char r5) {
            r2 = this;
            java.util.List<com.alibaba.fastjson.serializer.AfterFilter> r0 = r3.afterFilters
            if (r0 == 0) goto L19
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.serializer.AfterFilter r1 = (com.alibaba.fastjson.serializer.AfterFilter) r1
            char r5 = r1.writeAfter(r3, r4, r5)
            goto L8
        L19:
            java.util.List<com.alibaba.fastjson.serializer.AfterFilter> r0 = r2.afterFilters
            if (r0 == 0) goto L32
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.serializer.AfterFilter r1 = (com.alibaba.fastjson.serializer.AfterFilter) r1
            char r5 = r1.writeAfter(r3, r4, r5)
            goto L21
        L32:
            return r5
    }

    public void writeAsArray(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            r0.write(r1, r2, r3, r4, r5)
            return
    }

    public void writeAsArrayNonContext(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            r0.write(r1, r2, r3, r4, r5)
            return
    }

    protected char writeBefore(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.Object r4, char r5) {
            r2 = this;
            java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> r0 = r3.beforeFilters
            if (r0 == 0) goto L19
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.serializer.BeforeFilter r1 = (com.alibaba.fastjson.serializer.BeforeFilter) r1
            char r5 = r1.writeBefore(r3, r4, r5)
            goto L8
        L19:
            java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> r0 = r2.beforeFilters
            if (r0 == 0) goto L32
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            com.alibaba.fastjson.serializer.BeforeFilter r1 = (com.alibaba.fastjson.serializer.BeforeFilter) r1
            char r5 = r1.writeBefore(r3, r4, r5)
            goto L21
        L32:
            return r5
    }

    protected void writeClassName(com.alibaba.fastjson.serializer.JSONSerializer r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            if (r4 != 0) goto L6
            com.alibaba.fastjson.serializer.SerializeConfig r4 = r3.config
            java.lang.String r4 = r4.typeKey
        L6:
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r3.out
            r1 = 0
            r0.writeFieldName(r4, r1)
            com.alibaba.fastjson.serializer.SerializeBeanInfo r4 = r2.beanInfo
            java.lang.String r4 = r4.typeName
            if (r4 != 0) goto L24
            java.lang.Class r4 = r5.getClass()
            boolean r5 = com.alibaba.fastjson.util.TypeUtils.isProxy(r4)
            if (r5 == 0) goto L20
            java.lang.Class r4 = r4.getSuperclass()
        L20:
            java.lang.String r4 = r4.getName()
        L24:
            r3.write(r4)
            return
    }

    public void writeDirectNonContext(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            r0.write(r1, r2, r3, r4, r5)
            return
    }

    public boolean writeReference(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, int r6) {
            r3 = this;
            com.alibaba.fastjson.serializer.SerialContext r0 = r4.context
            com.alibaba.fastjson.serializer.SerializerFeature r1 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect
            int r1 = r1.mask
            r2 = 0
            if (r0 == 0) goto L21
            int r0 = r0.features
            r0 = r0 & r1
            if (r0 != 0) goto L21
            r6 = r6 & r1
            if (r6 == 0) goto L12
            goto L21
        L12:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r6 = r4.references
            if (r6 == 0) goto L21
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L21
            r4.writeReference(r5)
            r4 = 1
            return r4
        L21:
            return r2
    }
}
