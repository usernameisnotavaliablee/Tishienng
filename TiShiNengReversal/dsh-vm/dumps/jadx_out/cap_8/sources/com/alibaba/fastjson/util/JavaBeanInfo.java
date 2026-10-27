package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JavaBeanInfo {
    public final java.lang.reflect.Method buildMethod;
    public final java.lang.Class<?> builderClass;
    public final java.lang.Class<?> clazz;
    public final java.lang.reflect.Constructor<?> creatorConstructor;
    public final java.lang.reflect.Constructor<?> defaultConstructor;
    public final int defaultConstructorParameterSize;
    public final java.lang.reflect.Method factoryMethod;
    public final com.alibaba.fastjson.util.FieldInfo[] fields;
    public final com.alibaba.fastjson.annotation.JSONType jsonType;
    public final int parserFeatures;
    public final com.alibaba.fastjson.util.FieldInfo[] sortedFields;
    public final java.lang.String typeKey;
    public final java.lang.String typeName;

    public JavaBeanInfo(java.lang.Class<?> r1, java.lang.Class<?> r2, java.lang.reflect.Constructor<?> r3, java.lang.reflect.Constructor<?> r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6, com.alibaba.fastjson.annotation.JSONType r7, java.util.List<com.alibaba.fastjson.util.FieldInfo> r8) {
            r0 = this;
            r0.<init>()
            r0.clazz = r1
            r0.builderClass = r2
            r0.defaultConstructor = r3
            r0.creatorConstructor = r4
            r0.factoryMethod = r5
            int r2 = com.alibaba.fastjson.util.TypeUtils.getParserFeatures(r1)
            r0.parserFeatures = r2
            r0.buildMethod = r6
            r0.jsonType = r7
            r2 = 0
            if (r7 == 0) goto L3b
            java.lang.String r4 = r7.typeName()
            java.lang.String r6 = r7.typeKey()
            int r7 = r6.length()
            if (r7 <= 0) goto L29
            r2 = r6
        L29:
            r0.typeKey = r2
            int r2 = r4.length()
            if (r2 == 0) goto L34
            r0.typeName = r4
            goto L43
        L34:
            java.lang.String r1 = r1.getName()
            r0.typeName = r1
            goto L43
        L3b:
            java.lang.String r1 = r1.getName()
            r0.typeName = r1
            r0.typeKey = r2
        L43:
            int r1 = r8.size()
            com.alibaba.fastjson.util.FieldInfo[] r1 = new com.alibaba.fastjson.util.FieldInfo[r1]
            r0.fields = r1
            r8.toArray(r1)
            int r2 = r1.length
            com.alibaba.fastjson.util.FieldInfo[] r2 = new com.alibaba.fastjson.util.FieldInfo[r2]
            int r4 = r1.length
            r6 = 0
            java.lang.System.arraycopy(r1, r6, r2, r6, r4)
            java.util.Arrays.sort(r2)
            boolean r4 = java.util.Arrays.equals(r1, r2)
            if (r4 == 0) goto L60
            goto L61
        L60:
            r1 = r2
        L61:
            r0.sortedFields = r1
            if (r3 == 0) goto L6d
            java.lang.Class[] r1 = r3.getParameterTypes()
            int r1 = r1.length
            r0.defaultConstructorParameterSize = r1
            return
        L6d:
            if (r5 == 0) goto L77
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r1 = r1.length
            r0.defaultConstructorParameterSize = r1
            return
        L77:
            r0.defaultConstructorParameterSize = r6
            return
    }

    static boolean add(java.util.List<com.alibaba.fastjson.util.FieldInfo> r5, com.alibaba.fastjson.util.FieldInfo r6) {
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L3e
            java.lang.Object r2 = r5.get(r0)
            com.alibaba.fastjson.util.FieldInfo r2 = (com.alibaba.fastjson.util.FieldInfo) r2
            java.lang.String r3 = r2.name
            java.lang.String r4 = r6.name
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3b
            boolean r3 = r2.getOnly
            if (r3 == 0) goto L21
            boolean r3 = r6.getOnly
            if (r3 != 0) goto L21
            goto L3b
        L21:
            java.lang.Class<?> r3 = r2.fieldClass
            java.lang.Class<?> r4 = r6.fieldClass
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L2f
            r5.remove(r0)
            goto L3e
        L2f:
            int r2 = r2.compareTo2(r6)
            if (r2 >= 0) goto L39
            r5.remove(r0)
            goto L3e
        L39:
            r5 = 0
            return r5
        L3b:
            int r0 = r0 + (-1)
            goto L6
        L3e:
            r5.add(r6)
            return r1
    }

    public static com.alibaba.fastjson.util.JavaBeanInfo build(java.lang.Class<?> r2, java.lang.reflect.Type r3, com.alibaba.fastjson.PropertyNamingStrategy r4) {
            r0 = 0
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean
            com.alibaba.fastjson.util.JavaBeanInfo r2 = build(r2, r3, r4, r0, r1)
            return r2
    }

    public static com.alibaba.fastjson.util.JavaBeanInfo build(java.lang.Class<?> r32, java.lang.reflect.Type r33, com.alibaba.fastjson.PropertyNamingStrategy r34, boolean r35, boolean r36) {
            r4 = r32
            r5 = r33
            r12 = r34
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r0)
            r7 = r0
            com.alibaba.fastjson.annotation.JSONType r7 = (com.alibaba.fastjson.annotation.JSONType) r7
            java.lang.Class r2 = getBuilderClass(r7)
            java.lang.reflect.Field[] r13 = r4.getDeclaredFields()
            java.lang.reflect.Method[] r14 = r4.getMethods()
            if (r2 != 0) goto L1f
            r0 = r4
            goto L20
        L1f:
            r0 = r2
        L20:
            java.lang.reflect.Constructor r3 = getDefaultConstructor(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r6 = 0
            r0 = 0
            if (r35 == 0) goto L46
            r1 = r4
        L2e:
            if (r1 == 0) goto L3c
            java.lang.reflect.Field[] r9 = r1.getDeclaredFields()
            computeFields(r4, r5, r12, r8, r9)
            java.lang.Class r1 = r1.getSuperclass()
            goto L2e
        L3c:
            r5 = r0
            com.alibaba.fastjson.util.JavaBeanInfo r0 = new com.alibaba.fastjson.util.JavaBeanInfo
            r4 = 0
            r1 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L46:
            r5 = r0
            r10 = r2
            r16 = r3
            r15 = r6
            r9 = r7
            r11 = r8
            boolean r0 = r4.isInterface()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L62
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L60
            goto L62
        L60:
            r0 = 0
            goto L63
        L62:
            r0 = 1
        L63:
            r3 = 0
            if (r16 == 0) goto L71
            if (r0 == 0) goto L69
            goto L71
        L69:
            r17 = r9
            r2 = r10
            r8 = r11
        L6d:
            r18 = r5
            goto L1a1
        L71:
            java.lang.reflect.Constructor r17 = getCreatorConstructor(r4)
            java.lang.String r5 = "illegal json creator"
            if (r17 == 0) goto L105
            if (r0 != 0) goto L105
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r17)
            java.lang.Class[] r12 = r17.getParameterTypes()
            int r0 = r12.length
            if (r0 <= 0) goto Lf2
            java.lang.annotation.Annotation[][] r14 = r17.getParameterAnnotations()
            r15 = 0
        L8a:
            int r0 = r12.length
            if (r15 >= r0) goto Lf2
            r0 = r14[r15]
            int r1 = r0.length
            r6 = 0
        L91:
            if (r6 >= r1) goto L9f
            r7 = r0[r6]
            boolean r8 = r7 instanceof com.alibaba.fastjson.annotation.JSONField
            if (r8 == 0) goto L9c
            com.alibaba.fastjson.annotation.JSONField r7 = (com.alibaba.fastjson.annotation.JSONField) r7
            goto La0
        L9c:
            int r6 = r6 + 1
            goto L91
        L9f:
            r7 = r3
        La0:
            if (r7 == 0) goto Leb
            r0 = r3
            r3 = r12[r15]
            java.lang.reflect.Type[] r1 = r17.getGenericParameterTypes()
            r1 = r1[r15]
            java.lang.String r6 = r7.name()
            java.lang.reflect.Field r6 = com.alibaba.fastjson.util.TypeUtils.getField(r4, r6, r13)
            r8 = r5
            r5 = r6
            int r6 = r7.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r16 = r7.serialzeFeatures()
            int r16 = com.alibaba.fastjson.serializer.SerializerFeature.of(r16)
            com.alibaba.fastjson.parser.Feature[] r18 = r7.parseFeatures()
            int r18 = com.alibaba.fastjson.parser.Feature.of(r18)
            r19 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            java.lang.String r7 = r7.name()
            r2 = r4
            r35 = r9
            r4 = r1
            r1 = r7
            r9 = r8
            r7 = r16
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            add(r11, r0)
            int r15 = r15 + 1
            r4 = r32
            r5 = r9
            r2 = 0
            r3 = 0
            r9 = r35
            goto L8a
        Leb:
            r9 = r5
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r9)
            throw r0
        Lf2:
            r35 = r9
            com.alibaba.fastjson.util.JavaBeanInfo r0 = new com.alibaba.fastjson.util.JavaBeanInfo
            r5 = 0
            r6 = 0
            r3 = 0
            r1 = r32
            r7 = r35
            r2 = r10
            r8 = r11
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L105:
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r5
            java.lang.reflect.Method r17 = getFactoryMethod(r4, r14)
            if (r17 == 0) goto L198
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r17)
            java.lang.Class[] r0 = r17.getParameterTypes()
            int r2 = r0.length
            if (r2 <= 0) goto L192
            java.lang.annotation.Annotation[][] r12 = r17.getParameterAnnotations()
            r14 = 0
        L11e:
            int r1 = r0.length
            if (r14 >= r1) goto L182
            r1 = r12[r14]
            int r2 = r1.length
            r3 = 0
        L125:
            if (r3 >= r2) goto L134
            r5 = r1[r3]
            boolean r6 = r5 instanceof com.alibaba.fastjson.annotation.JSONField
            if (r6 == 0) goto L131
            r3 = r5
            com.alibaba.fastjson.annotation.JSONField r3 = (com.alibaba.fastjson.annotation.JSONField) r3
            goto L135
        L131:
            int r3 = r3 + 1
            goto L125
        L134:
            r3 = 0
        L135:
            if (r3 == 0) goto L17c
            r1 = r3
            r3 = r0[r14]
            java.lang.reflect.Type[] r2 = r17.getGenericParameterTypes()
            r2 = r2[r14]
            java.lang.String r5 = r1.name()
            java.lang.reflect.Field r5 = com.alibaba.fastjson.util.TypeUtils.getField(r4, r5, r13)
            int r6 = r1.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = r1.serialzeFeatures()
            int r7 = com.alibaba.fastjson.serializer.SerializerFeature.of(r7)
            com.alibaba.fastjson.parser.Feature[] r15 = r1.parseFeatures()
            int r15 = com.alibaba.fastjson.parser.Feature.of(r15)
            r16 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            java.lang.String r1 = r1.name()
            r31 = r4
            r4 = r2
            r2 = r31
            r31 = r15
            r15 = r8
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            add(r15, r0)
            int r14 = r14 + 1
            r4 = r32
            r8 = r15
            r0 = r16
            goto L11e
        L17c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r9)
            throw r0
        L182:
            r15 = r8
            com.alibaba.fastjson.util.JavaBeanInfo r0 = new com.alibaba.fastjson.util.JavaBeanInfo
            r4 = 0
            r6 = 0
            r3 = 0
            r1 = r32
            r7 = r10
            r2 = r11
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L192:
            r2 = r11
            r5 = r17
            r17 = r10
            goto L19f
        L198:
            r2 = r11
            r5 = r17
            r17 = r10
            if (r0 == 0) goto L6b3
        L19f:
            goto L6d
        L1a1:
            if (r16 == 0) goto L1a6
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r16)
        L1a6:
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r0 = com.alibaba.fastjson.annotation.JSONField.class
            if (r2 == 0) goto L344
            java.lang.Class<com.alibaba.fastjson.annotation.JSONPOJOBuilder> r3 = com.alibaba.fastjson.annotation.JSONPOJOBuilder.class
            java.lang.annotation.Annotation r5 = r2.getAnnotation(r3)
            com.alibaba.fastjson.annotation.JSONPOJOBuilder r5 = (com.alibaba.fastjson.annotation.JSONPOJOBuilder) r5
            if (r5 == 0) goto L1b9
            java.lang.String r5 = r5.withPrefix()
            goto L1ba
        L1b9:
            r5 = 0
        L1ba:
            if (r5 == 0) goto L1c2
            int r6 = r5.length()
            if (r6 != 0) goto L1c4
        L1c2:
            java.lang.String r5 = "with"
        L1c4:
            java.lang.reflect.Method[] r6 = r2.getMethods()
            int r7 = r6.length
            r9 = 0
        L1ca:
            if (r9 >= r7) goto L2fa
            r10 = r6[r9]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 == 0) goto L1ec
        L1d8:
            r29 = r0
            r15 = r2
            r24 = r5
            r19 = r6
            r22 = r7
            r12 = r8
            r27 = r9
            r36 = r13
            r23 = r14
            r13 = 0
            r14 = r3
            goto L2e1
        L1ec:
            java.lang.Class r11 = r10.getReturnType()
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L1f7
            goto L1d8
        L1f7:
            java.lang.annotation.Annotation r11 = r10.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONField r11 = (com.alibaba.fastjson.annotation.JSONField) r11
            if (r11 != 0) goto L203
            com.alibaba.fastjson.annotation.JSONField r11 = com.alibaba.fastjson.util.TypeUtils.getSuperMethodAnnotation(r4, r10)
        L203:
            if (r11 == 0) goto L279
            boolean r19 = r11.deserialize()
            if (r19 != 0) goto L20c
            goto L1d8
        L20c:
            r19 = r6
            int r6 = r11.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r22 = r11.serialzeFeatures()
            int r22 = com.alibaba.fastjson.serializer.SerializerFeature.of(r22)
            com.alibaba.fastjson.parser.Feature[] r23 = r11.parseFeatures()
            int r23 = com.alibaba.fastjson.parser.Feature.of(r23)
            java.lang.String r24 = r11.name()
            int r24 = r24.length()
            if (r24 == 0) goto L262
            r24 = 1
            java.lang.String r1 = r11.name()
            r25 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r26 = r2
            r2 = r10
            r10 = 0
            r27 = r9
            r9 = r11
            r11 = 0
            r28 = r3
            r3 = 0
            r36 = r22
            r22 = r7
            r7 = r36
            r12 = r8
            r36 = r13
            r8 = r23
            r29 = r25
            r15 = r26
            r13 = r5
            r23 = r14
            r14 = r28
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            add(r12, r0)
        L25d:
            r24 = r13
            r13 = 0
            goto L2e1
        L262:
            r36 = r22
            r22 = r7
            r7 = r36
            r12 = r8
            r8 = r23
            r29 = r0
            r15 = r2
            r27 = r9
            r2 = r10
            r9 = r11
            r36 = r13
            r13 = r5
            r23 = r14
            r14 = r3
            goto L28e
        L279:
            r19 = r6
            r22 = r7
            r12 = r8
            r6 = 0
            r7 = 0
            r8 = 0
            r29 = r0
            r15 = r2
            r27 = r9
            r2 = r10
            r9 = r11
            r36 = r13
            r23 = r14
            r14 = r3
            r13 = r5
        L28e:
            java.lang.String r0 = r2.getName()
            boolean r1 = r0.startsWith(r13)
            if (r1 != 0) goto L299
        L298:
            goto L25d
        L299:
            int r1 = r0.length()
            int r3 = r13.length()
            if (r1 > r3) goto L2a4
            goto L298
        L2a4:
            int r1 = r13.length()
            char r1 = r0.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r1)
            if (r3 != 0) goto L2b3
            goto L298
        L2b3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r13.length()
            java.lang.String r0 = r0.substring(r4)
            r3.<init>(r0)
            char r0 = java.lang.Character.toLowerCase(r1)
            r1 = 0
            r3.setCharAt(r1, r0)
            java.lang.String r0 = r3.toString()
            r1 = r0
            r20 = 0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r10 = 0
            r11 = 0
            r3 = 0
            r4 = r32
            r5 = r33
            r24 = r13
            r13 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            add(r12, r0)
        L2e1:
            int r9 = r27 + 1
            r4 = r32
            r13 = r36
            r8 = r12
            r3 = r14
            r2 = r15
            r6 = r19
            r7 = r22
            r14 = r23
            r5 = r24
            r0 = r29
            r1 = 1
            r15 = 0
            r12 = r34
            goto L1ca
        L2fa:
            r29 = r0
            r15 = r2
            r12 = r8
            r36 = r13
            r23 = r14
            r13 = 0
            r14 = r3
            java.lang.annotation.Annotation r0 = r15.getAnnotation(r14)
            com.alibaba.fastjson.annotation.JSONPOJOBuilder r0 = (com.alibaba.fastjson.annotation.JSONPOJOBuilder) r0
            if (r0 == 0) goto L311
            java.lang.String r3 = r0.buildMethod()
            goto L312
        L311:
            r3 = 0
        L312:
            if (r3 == 0) goto L31d
            int r0 = r3.length()
            if (r0 != 0) goto L31b
            goto L31d
        L31b:
            r14 = 0
            goto L320
        L31d:
            java.lang.String r3 = "build"
            goto L31b
        L320:
            java.lang.reflect.Method r6 = r15.getMethod(r3, r14)     // Catch: java.lang.Throwable -> L325
            goto L327
        L325:
            r6 = 0
        L327:
            if (r6 != 0) goto L332
            java.lang.String r0 = "create"
            java.lang.reflect.Method r0 = r15.getMethod(r0, r14)     // Catch: java.lang.Throwable -> L331
            r6 = r0
            goto L332
        L331:
        L332:
            if (r6 == 0) goto L33c
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r6)
            r19 = r6
        L339:
            r0 = r23
            goto L351
        L33c:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "buildMethod not found."
            r0.<init>(r1)
            throw r0
        L344:
            r29 = r0
            r15 = r2
            r12 = r8
            r36 = r13
            r23 = r14
            r13 = 0
            r14 = 0
            r19 = 0
            goto L339
        L351:
            int r1 = r0.length
            r2 = 0
        L353:
            r3 = 4
            r4 = 3
            if (r2 >= r1) goto L58a
            r5 = r2
            r2 = r0[r5]
            java.lang.String r6 = r2.getName()
            int r7 = r2.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L37e
        L368:
            r13 = r36
            r23 = r0
            r20 = r1
            r21 = r5
            r26 = r15
            r14 = r29
            r24 = 0
            r1 = r32
            r5 = r33
        L37a:
            r15 = r34
            goto L57a
        L37e:
            java.lang.Class r7 = r2.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L395
            java.lang.Class r8 = r2.getDeclaringClass()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L395
            goto L368
        L395:
            java.lang.Class r7 = r2.getDeclaringClass()
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            if (r7 != r8) goto L39e
            goto L368
        L39e:
            java.lang.Class[] r7 = r2.getParameterTypes()
            int r9 = r7.length
            if (r9 == 0) goto L368
            int r9 = r7.length
            r10 = 2
            if (r9 <= r10) goto L3aa
            goto L368
        L3aa:
            r9 = r29
            java.lang.annotation.Annotation r11 = r2.getAnnotation(r9)
            com.alibaba.fastjson.annotation.JSONField r11 = (com.alibaba.fastjson.annotation.JSONField) r11
            r35 = r6
            r20 = 0
            r21 = 0
            if (r11 == 0) goto L3f3
            int r6 = r7.length
            if (r6 != r10) goto L3f3
            r6 = r7[r13]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r6 != r10) goto L3f3
            r30 = 1
            r6 = r7[r30]
            if (r6 != r8) goto L3f3
            r23 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r10 = 0
            r29 = r9
            r9 = r11
            r11 = 0
            r3 = r1
            java.lang.String r1 = ""
            r4 = r3
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r13 = 1
            r24 = 0
            r20 = r4
            r21 = r5
            r14 = r29
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r4
            add(r12, r0)
        L3ee:
            r13 = r36
        L3f0:
            r26 = r15
            goto L37a
        L3f3:
            r23 = r0
            r20 = r1
            r21 = r5
            r14 = r9
            r9 = r11
            r0 = 0
            r6 = 0
            r8 = 0
            r13 = 1
            r24 = 0
            r1 = r32
            int r5 = r7.length
            if (r5 == r13) goto L409
        L406:
            r5 = r33
            goto L3ee
        L409:
            if (r9 != 0) goto L410
            com.alibaba.fastjson.annotation.JSONField r11 = com.alibaba.fastjson.util.TypeUtils.getSuperMethodAnnotation(r1, r2)
            r9 = r11
        L410:
            if (r9 != 0) goto L419
            int r5 = r35.length()
            if (r5 >= r3) goto L419
            goto L406
        L419:
            if (r9 == 0) goto L456
            boolean r0 = r9.deserialize()
            if (r0 != 0) goto L422
            goto L406
        L422:
            int r6 = r9.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r9.serialzeFeatures()
            int r0 = com.alibaba.fastjson.serializer.SerializerFeature.of(r0)
            com.alibaba.fastjson.parser.Feature[] r5 = r9.parseFeatures()
            int r8 = com.alibaba.fastjson.parser.Feature.of(r5)
            java.lang.String r5 = r9.name()
            int r5 = r5.length()
            if (r5 == 0) goto L456
            java.lang.String r1 = r9.name()
            r7 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r10 = 0
            r11 = 0
            r3 = 0
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r4
            add(r12, r0)
            goto L3ee
        L456:
            if (r9 != 0) goto L463
            java.lang.String r5 = "set"
            r10 = r35
            boolean r5 = r10.startsWith(r5)
            if (r5 != 0) goto L465
            goto L406
        L463:
            r10 = r35
        L465:
            char r5 = r10.charAt(r4)
            boolean r11 = java.lang.Character.isUpperCase(r5)
            if (r11 != 0) goto L4a2
            r11 = 512(0x200, float:7.17E-43)
            if (r5 <= r11) goto L474
            goto L4a2
        L474:
            r11 = 95
            if (r5 != r11) goto L47f
            java.lang.String r3 = r10.substring(r3)
        L47c:
            r4 = r36
            goto L4cb
        L47f:
            r11 = 102(0x66, float:1.43E-43)
            if (r5 != r11) goto L488
            java.lang.String r3 = r10.substring(r4)
            goto L47c
        L488:
            int r5 = r10.length()
            r11 = 5
            if (r5 < r11) goto L406
            char r3 = r10.charAt(r3)
            boolean r3 = java.lang.Character.isUpperCase(r3)
            if (r3 == 0) goto L406
            java.lang.String r3 = r10.substring(r4)
            java.lang.String r3 = com.alibaba.fastjson.util.TypeUtils.decapitalize(r3)
            goto L47c
        L4a2:
            boolean r5 = com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean
            if (r5 == 0) goto L4af
            java.lang.String r3 = r10.substring(r4)
            java.lang.String r3 = com.alibaba.fastjson.util.TypeUtils.decapitalize(r3)
            goto L47c
        L4af:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            char r4 = r10.charAt(r4)
            char r4 = java.lang.Character.toLowerCase(r4)
            r5.append(r4)
            java.lang.String r3 = r10.substring(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            goto L47c
        L4cb:
            java.lang.reflect.Field r5 = com.alibaba.fastjson.util.TypeUtils.getField(r1, r3, r4)
            if (r5 != 0) goto L4fd
            r7 = r7[r24]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            if (r7 != r10) goto L4fd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "is"
            r5.append(r7)
            r7 = 0
            char r10 = r3.charAt(r7)
            char r10 = java.lang.Character.toUpperCase(r10)
            r5.append(r10)
            java.lang.String r10 = r3.substring(r13)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.reflect.Field r5 = com.alibaba.fastjson.util.TypeUtils.getField(r1, r5, r4)
            goto L4fe
        L4fd:
            r7 = 0
        L4fe:
            if (r5 == 0) goto L559
            java.lang.annotation.Annotation r10 = r5.getAnnotation(r14)
            com.alibaba.fastjson.annotation.JSONField r10 = (com.alibaba.fastjson.annotation.JSONField) r10
            if (r10 == 0) goto L554
            boolean r0 = r10.deserialize()
            if (r0 != 0) goto L517
            r5 = r33
            r13 = r4
            r26 = r15
            r24 = 0
            goto L37a
        L517:
            int r6 = r10.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r10.serialzeFeatures()
            int r0 = com.alibaba.fastjson.serializer.SerializerFeature.of(r0)
            com.alibaba.fastjson.parser.Feature[] r8 = r10.parseFeatures()
            int r8 = com.alibaba.fastjson.parser.Feature.of(r8)
            java.lang.String r11 = r10.name()
            int r11 = r11.length()
            if (r11 == 0) goto L54f
            java.lang.String r1 = r10.name()
            r7 = r0
            r24 = 0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r11 = 0
            r13 = r4
            r3 = r5
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            add(r12, r0)
            r1 = r32
            goto L3f0
        L54f:
            r7 = r0
            r13 = r4
            r24 = 0
            goto L55e
        L554:
            r13 = r4
            r24 = 0
            r7 = r0
            goto L55e
        L559:
            r13 = r4
            r24 = 0
            r7 = r0
            r10 = 0
        L55e:
            r0 = r34
            if (r34 == 0) goto L566
            java.lang.String r3 = r0.translate(r3)
        L566:
            r1 = r3
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r11 = 0
            r4 = r32
            r3 = r5
            r26 = r15
            r5 = r33
            r15 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r4
            add(r12, r0)
        L57a:
            int r2 = r21 + 1
            r36 = r13
            r29 = r14
            r1 = r20
            r0 = r23
            r15 = r26
            r13 = 0
            r14 = 0
            goto L353
        L58a:
            r1 = r32
            r5 = r33
            r13 = r36
            r26 = r15
            r14 = r29
            r24 = 0
            r15 = r34
            java.lang.reflect.Field[] r0 = r1.getFields()
            computeFields(r1, r5, r15, r12, r0)
            java.lang.reflect.Method[] r0 = r1.getMethods()
            int r2 = r0.length
            r6 = 0
        L5a5:
            if (r6 >= r2) goto L69f
            r7 = r2
            r2 = r0[r6]
            java.lang.String r8 = r2.getName()
            int r9 = r8.length()
            if (r9 >= r3) goto L5c0
        L5b4:
            r20 = r0
            r24 = r6
            r22 = r7
            r21 = 4
            r23 = 3
            goto L691
        L5c0:
            int r9 = r2.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L5cb
            goto L5b4
        L5cb:
            java.lang.String r9 = "get"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L5b4
            char r9 = r8.charAt(r4)
            boolean r9 = java.lang.Character.isUpperCase(r9)
            if (r9 == 0) goto L5b4
            java.lang.Class[] r9 = r2.getParameterTypes()
            int r9 = r9.length
            if (r9 == 0) goto L5e5
            goto L5b4
        L5e5:
            java.lang.Class<java.util.Collection> r9 = java.util.Collection.class
            java.lang.Class r10 = r2.getReturnType()
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 != 0) goto L615
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            java.lang.Class r10 = r2.getReturnType()
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 != 0) goto L615
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r9 = java.util.concurrent.atomic.AtomicBoolean.class
            java.lang.Class r10 = r2.getReturnType()
            if (r9 == r10) goto L615
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r9 = java.util.concurrent.atomic.AtomicInteger.class
            java.lang.Class r10 = r2.getReturnType()
            if (r9 == r10) goto L615
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r9 = java.util.concurrent.atomic.AtomicLong.class
            java.lang.Class r10 = r2.getReturnType()
            if (r9 != r10) goto L5b4
        L615:
            java.lang.annotation.Annotation r9 = r2.getAnnotation(r14)
            com.alibaba.fastjson.annotation.JSONField r9 = (com.alibaba.fastjson.annotation.JSONField) r9
            if (r9 == 0) goto L624
            boolean r10 = r9.deserialize()
            if (r10 == 0) goto L624
            goto L5b4
        L624:
            if (r9 == 0) goto L635
            java.lang.String r10 = r9.name()
            int r10 = r10.length()
            if (r10 <= 0) goto L635
            java.lang.String r8 = r9.name()
            goto L666
        L635:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            char r11 = r8.charAt(r4)
            char r11 = java.lang.Character.toLowerCase(r11)
            r10.append(r11)
            java.lang.String r8 = r8.substring(r3)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.reflect.Field r10 = com.alibaba.fastjson.util.TypeUtils.getField(r1, r8, r13)
            if (r10 == 0) goto L666
            java.lang.annotation.Annotation r10 = r10.getAnnotation(r14)
            com.alibaba.fastjson.annotation.JSONField r10 = (com.alibaba.fastjson.annotation.JSONField) r10
            if (r10 == 0) goto L666
            boolean r10 = r10.deserialize()
            if (r10 != 0) goto L666
            goto L5b4
        L666:
            com.alibaba.fastjson.util.FieldInfo r10 = getField(r12, r8)
            if (r10 == 0) goto L66e
            goto L5b4
        L66e:
            if (r15 == 0) goto L674
            java.lang.String r8 = r15.translate(r8)
        L674:
            r10 = r0
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r11 = r10
            r10 = 0
            r20 = r11
            r11 = 0
            r21 = 4
            r3 = 0
            r24 = r6
            r6 = 0
            r22 = r7
            r7 = 0
            r1 = r8
            r8 = 0
            r23 = 3
            r4 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            add(r12, r0)
        L691:
            int r6 = r24 + 1
            r3 = 4
            r4 = 3
            r1 = r32
            r5 = r33
            r0 = r20
            r2 = r22
            goto L5a5
        L69f:
            com.alibaba.fastjson.util.JavaBeanInfo r0 = new com.alibaba.fastjson.util.JavaBeanInfo
            r4 = 0
            r1 = r32
            r8 = r12
            r3 = r16
            r7 = r17
            r5 = r18
            r6 = r19
            r2 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L6b3:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "default constructor not found. "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static void computeFields(java.lang.Class<?> r17, java.lang.reflect.Type r18, com.alibaba.fastjson.PropertyNamingStrategy r19, java.util.List<com.alibaba.fastjson.util.FieldInfo> r20, java.lang.reflect.Field[] r21) {
            r0 = r19
            r1 = r21
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L7:
            if (r4 >= r2) goto Lc1
            r8 = r1[r4]
            int r5 = r8.getModifiers()
            r6 = r5 & 8
            if (r6 == 0) goto L17
        L13:
            r5 = r20
            goto Lbd
        L17:
            r5 = r5 & 16
            if (r5 == 0) goto L47
            java.lang.Class r5 = r8.getType()
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 != 0) goto L47
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 != 0) goto L47
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r6 = java.util.concurrent.atomic.AtomicLong.class
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L47
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r6 = java.util.concurrent.atomic.AtomicInteger.class
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L47
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r6 = java.util.concurrent.atomic.AtomicBoolean.class
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L13
        L47:
            java.util.Iterator r5 = r20.iterator()
        L4b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L64
            java.lang.Object r6 = r5.next()
            com.alibaba.fastjson.util.FieldInfo r6 = (com.alibaba.fastjson.util.FieldInfo) r6
            java.lang.String r6 = r6.name
            java.lang.String r7 = r8.getName()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L4b
            goto L13
        L64:
            java.lang.String r5 = r8.getName()
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r6 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r6 = r8.getAnnotation(r6)
            r15 = r6
            com.alibaba.fastjson.annotation.JSONField r15 = (com.alibaba.fastjson.annotation.JSONField) r15
            if (r15 == 0) goto La0
            boolean r6 = r15.deserialize()
            if (r6 != 0) goto L7a
            goto L13
        L7a:
            int r6 = r15.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = r15.serialzeFeatures()
            int r7 = com.alibaba.fastjson.serializer.SerializerFeature.of(r7)
            com.alibaba.fastjson.parser.Feature[] r9 = r15.parseFeatures()
            int r9 = com.alibaba.fastjson.parser.Feature.of(r9)
            java.lang.String r10 = r15.name()
            int r10 = r10.length()
            if (r10 == 0) goto L9c
            java.lang.String r5 = r15.name()
        L9c:
            r11 = r6
            r12 = r7
            r13 = r9
            goto La3
        La0:
            r11 = 0
            r12 = 0
            r13 = 0
        La3:
            if (r0 == 0) goto La9
            java.lang.String r5 = r0.translate(r5)
        La9:
            r6 = r5
            com.alibaba.fastjson.util.FieldInfo r5 = new com.alibaba.fastjson.util.FieldInfo
            r14 = 0
            r16 = 0
            r7 = 0
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6 = r5
            r5 = r20
            add(r5, r6)
        Lbd:
            int r4 = r4 + 1
            goto L7
        Lc1:
            return
    }

    public static java.lang.Class<?> getBuilderClass(com.alibaba.fastjson.annotation.JSONType r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Class r2 = r2.builder()
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            if (r2 != r1) goto Ld
            return r0
        Ld:
            return r2
    }

    public static java.lang.reflect.Constructor<?> getCreatorConstructor(java.lang.Class<?> r5) {
            java.lang.reflect.Constructor[] r5 = r5.getDeclaredConstructors()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L24
            r3 = r5[r2]
            java.lang.Class<com.alibaba.fastjson.annotation.JSONCreator> r4 = com.alibaba.fastjson.annotation.JSONCreator.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            com.alibaba.fastjson.annotation.JSONCreator r4 = (com.alibaba.fastjson.annotation.JSONCreator) r4
            if (r4 == 0) goto L21
            if (r1 != 0) goto L19
            r1 = r3
            goto L21
        L19:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r0 = "multi-JSONCreator"
            r5.<init>(r0)
            throw r5
        L21:
            int r2 = r2 + 1
            goto L7
        L24:
            return r1
    }

    static java.lang.reflect.Constructor<?> getDefaultConstructor(java.lang.Class<?> r9) {
            int r0 = r9.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.reflect.Constructor[] r0 = r9.getDeclaredConstructors()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L13:
            if (r4 >= r2) goto L23
            r5 = r0[r4]
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != 0) goto L20
            r1 = r5
            goto L23
        L20:
            int r4 = r4 + 1
            goto L13
        L23:
            if (r1 != 0) goto L53
            boolean r2 = r9.isMemberClass()
            if (r2 == 0) goto L53
            int r2 = r9.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L53
            int r2 = r0.length
            r4 = 0
        L37:
            if (r4 >= r2) goto L53
            r5 = r0[r4]
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto L50
            r6 = r6[r3]
            java.lang.Class r7 = r9.getDeclaringClass()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L50
            return r5
        L50:
            int r4 = r4 + 1
            goto L37
        L53:
            return r1
    }

    private static java.lang.reflect.Method getFactoryMethod(java.lang.Class<?> r5, java.lang.reflect.Method[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L36
            r3 = r6[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L12
            goto L33
        L12:
            java.lang.Class r4 = r3.getReturnType()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 != 0) goto L1d
            goto L33
        L1d:
            java.lang.Class<com.alibaba.fastjson.annotation.JSONCreator> r4 = com.alibaba.fastjson.annotation.JSONCreator.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            com.alibaba.fastjson.annotation.JSONCreator r4 = (com.alibaba.fastjson.annotation.JSONCreator) r4
            if (r4 == 0) goto L33
            if (r1 != 0) goto L2b
            r1 = r3
            goto L33
        L2b:
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r6 = "multi-JSONCreator"
            r5.<init>(r6)
            throw r5
        L33:
            int r2 = r2 + 1
            goto L3
        L36:
            return r1
    }

    private static com.alibaba.fastjson.util.FieldInfo getField(java.util.List<com.alibaba.fastjson.util.FieldInfo> r3, java.lang.String r4) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            com.alibaba.fastjson.util.FieldInfo r0 = (com.alibaba.fastjson.util.FieldInfo) r0
            java.lang.String r1 = r0.name
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L19
            goto L2d
        L19:
            java.lang.reflect.Field r1 = r0.field
            if (r1 == 0) goto L4
            com.alibaba.fastjson.annotation.JSONField r2 = r0.getAnnotation()
            if (r2 == 0) goto L4
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L4
        L2d:
            return r0
        L2e:
            r3 = 0
            return r3
    }
}
