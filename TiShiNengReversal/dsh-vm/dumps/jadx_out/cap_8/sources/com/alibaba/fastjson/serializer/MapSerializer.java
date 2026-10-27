package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MapSerializer extends com.alibaba.fastjson.serializer.SerializeFilterable implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static com.alibaba.fastjson.serializer.MapSerializer instance;

    static {
            com.alibaba.fastjson.serializer.MapSerializer r0 = new com.alibaba.fastjson.serializer.MapSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.MapSerializer.instance = r0
            return
    }

    public MapSerializer() {
            r0 = this;
            r0.<init>()
            return
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

    public void write(com.alibaba.fastjson.serializer.JSONSerializer r18, java.lang.Object r19, java.lang.Object r20, java.lang.reflect.Type r21, int r22, boolean r23) throws java.io.IOException {
            r17 = this;
            r1 = r17
            r2 = r18
            r4 = r19
            com.alibaba.fastjson.serializer.SerializeWriter r7 = r2.out
            if (r4 != 0) goto Le
            r7.writeNull()
            return
        Le:
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.MapSortField
            int r3 = r3.mask
            int r5 = r7.features
            r5 = r5 & r3
            if (r5 != 0) goto L1e
            r3 = r22 & r3
            if (r3 == 0) goto L2e
        L1e:
            boolean r3 = r0 instanceof java.util.SortedMap
            if (r3 != 0) goto L2e
            boolean r3 = r0 instanceof java.util.LinkedHashMap
            if (r3 != 0) goto L2e
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch: java.lang.Exception -> L2d
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2d
            r8 = r3
            goto L2f
        L2d:
        L2e:
            r8 = r0
        L2f:
            boolean r0 = r18.containsReference(r19)
            if (r0 == 0) goto L39
            r18.writeReference(r19)
            return
        L39:
            com.alibaba.fastjson.serializer.SerialContext r9 = r2.context
            r10 = 0
            r0 = r20
            r2.setContext(r9, r4, r0, r10)
            if (r23 != 0) goto L4c
            r0 = 123(0x7b, float:1.72E-43)
            r7.write(r0)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r0 = move-exception
            goto L2a8
        L4c:
            r2.incrementIndent()     // Catch: java.lang.Throwable -> L49
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName     // Catch: java.lang.Throwable -> L49
            boolean r0 = r7.isEnabled(r0)     // Catch: java.lang.Throwable -> L49
            r11 = 1
            if (r0 == 0) goto L83
            com.alibaba.fastjson.serializer.SerializeConfig r0 = r2.config     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.typeKey     // Catch: java.lang.Throwable -> L49
            java.lang.Class r3 = r8.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.Class<com.alibaba.fastjson.JSONObject> r5 = com.alibaba.fastjson.JSONObject.class
            if (r3 == r5) goto L6c
            java.lang.Class<java.util.HashMap> r5 = java.util.HashMap.class
            if (r3 == r5) goto L6c
            java.lang.Class<java.util.LinkedHashMap> r5 = java.util.LinkedHashMap.class
            if (r3 != r5) goto L73
        L6c:
            boolean r3 = r8.containsKey(r0)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L73
            goto L83
        L73:
            r7.writeFieldName(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L49
            r7.writeString(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 0
            goto L84
        L83:
            r0 = 1
        L84:
            java.util.Set r3 = r8.entrySet()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r12 = r3.iterator()     // Catch: java.lang.Throwable -> L49
            r3 = 0
            r13 = r3
            r14 = r13
        L8f:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L28a
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> L49
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r3.getValue()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L49
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r5 = r2.propertyPreFilters     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Ld9
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r5 <= 0) goto Ld9
            if (r3 == 0) goto Lce
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Lb4
            goto Lce
        Lb4:
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lc2
            boolean r5 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Ld9
        Lc2:
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.applyName(r2, r4, r5)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Ld9
            goto L209
        Lce:
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.applyName(r2, r4, r5)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Ld9
            goto L209
        Ld9:
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r5 = r1.propertyPreFilters     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L10f
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r5 <= 0) goto L10f
            if (r3 == 0) goto L104
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto Lea
            goto L104
        Lea:
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto Lf8
            boolean r5 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L10f
        Lf8:
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.applyName(r2, r4, r5)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L10f
            goto L209
        L104:
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.applyName(r2, r4, r5)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L10f
            goto L209
        L10f:
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r5 = r2.propertyFilters     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L145
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r5 <= 0) goto L145
            if (r3 == 0) goto L13a
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L120
            goto L13a
        L120:
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L12e
            boolean r5 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L145
        L12e:
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.apply(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L145
            goto L209
        L13a:
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.apply(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L145
            goto L209
        L145:
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r5 = r1.propertyFilters     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L17b
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r5 <= 0) goto L17b
            if (r3 == 0) goto L170
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L156
            goto L170
        L156:
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L164
            boolean r5 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L17b
        L164:
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.apply(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L17b
            goto L209
        L170:
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r1.apply(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L17b
            goto L209
        L17b:
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r5 = r2.nameFilters     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L1a9
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r5 <= 0) goto L1a9
            if (r3 == 0) goto L1a3
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L18c
            goto L1a3
        L18c:
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L19a
            boolean r5 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L1a9
        L19a:
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r1.processKey(r2, r4, r3, r6)     // Catch: java.lang.Throwable -> L49
            goto L1a9
        L1a3:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r1.processKey(r2, r4, r3, r6)     // Catch: java.lang.Throwable -> L49
        L1a9:
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r5 = r1.nameFilters     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L1d0
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r5 <= 0) goto L1d0
            if (r3 == 0) goto L1d2
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L1ba
            goto L1d2
        L1ba:
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L1c8
            boolean r5 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L1d0
        L1c8:
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r1.processKey(r2, r4, r3, r6)     // Catch: java.lang.Throwable -> L49
        L1d0:
            r15 = r3
            goto L1d9
        L1d2:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r1.processKey(r2, r4, r3, r6)     // Catch: java.lang.Throwable -> L49
            goto L1d0
        L1d9:
            if (r15 == 0) goto L1f1
            boolean r3 = r15 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1ec
            if (r3 == 0) goto L1e0
            goto L1f1
        L1e0:
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r15)     // Catch: java.lang.Throwable -> L1ec
            r3 = 0
            java.lang.Object r3 = r1.processValue(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1ec
            r2 = r18
            goto L1ff
        L1ec:
            r0 = move-exception
            r2 = r18
            goto L2a8
        L1f1:
            r5 = r15
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1ec
            r3 = 0
            r1 = r17
            r2 = r18
            r4 = r19
            java.lang.Object r3 = r1.processValue(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
        L1ff:
            if (r3 != 0) goto L20f
            int r1 = com.alibaba.fastjson.serializer.SerializerFeature.WRITE_MAP_NULL_FEATURES     // Catch: java.lang.Throwable -> L49
            boolean r1 = r7.isEnabled(r1)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L20f
        L209:
            r1 = r17
            r4 = r19
            goto L8f
        L20f:
            boolean r1 = r15 instanceof java.lang.String     // Catch: java.lang.Throwable -> L49
            r4 = 44
            if (r1 == 0) goto L22c
            r1 = r15
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L21d
            r7.write(r4)     // Catch: java.lang.Throwable -> L49
        L21d:
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L49
            boolean r0 = r7.isEnabled(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L228
            r2.println()     // Catch: java.lang.Throwable -> L49
        L228:
            r7.writeFieldName(r1, r11)     // Catch: java.lang.Throwable -> L49
            goto L25a
        L22c:
            if (r0 != 0) goto L231
            r7.write(r4)     // Catch: java.lang.Throwable -> L49
        L231:
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible     // Catch: java.lang.Throwable -> L49
            boolean r0 = r7.isEnabled(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L24e
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringKeyAsString     // Catch: java.lang.Throwable -> L49
            boolean r0 = r7.isEnabled(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L24e
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure     // Catch: java.lang.Throwable -> L49
            boolean r0 = r7.isEnabled(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L24a
            goto L24e
        L24a:
            r2.write(r15)     // Catch: java.lang.Throwable -> L49
            goto L255
        L24e:
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r15)     // Catch: java.lang.Throwable -> L49
            r2.write(r0)     // Catch: java.lang.Throwable -> L49
        L255:
            r0 = 58
            r7.write(r0)     // Catch: java.lang.Throwable -> L49
        L25a:
            if (r3 != 0) goto L261
            r7.writeNull()     // Catch: java.lang.Throwable -> L49
        L25f:
            r0 = 0
            goto L209
        L261:
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L49
            if (r6 != r13) goto L276
            r4 = 0
            r5 = 0
            r1 = r2
            r2 = r3
            r0 = r14
            r3 = r15
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L273
            r2 = r1
        L271:
            r14 = r0
            goto L25f
        L273:
            r0 = move-exception
            r2 = r1
            goto L2a8
        L276:
            r0 = r3
            r3 = r15
            com.alibaba.fastjson.serializer.ObjectSerializer r1 = r2.getObjectWriter(r6)     // Catch: java.lang.Throwable -> L49
            r4 = 0
            r5 = 0
            r16 = r2
            r2 = r0
            r0 = r1
            r1 = r16
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L273
            r2 = r1
            r13 = r6
            goto L271
        L28a:
            r2.context = r9
            r2.decrementIdent()
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat
            boolean r0 = r7.isEnabled(r0)
            if (r0 == 0) goto L2a0
            int r0 = r8.size()
            if (r0 <= 0) goto L2a0
            r2.println()
        L2a0:
            if (r23 != 0) goto L2a7
            r0 = 125(0x7d, float:1.75E-43)
            r7.write(r0)
        L2a7:
            return
        L2a8:
            r2.context = r9
            throw r0
    }
}
