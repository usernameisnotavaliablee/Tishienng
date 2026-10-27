package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ResolveFieldDeserializer extends com.alibaba.fastjson.parser.deserializer.FieldDeserializer {
    private final java.util.Collection collection;
    private final int index;
    private final java.lang.Object key;
    private final java.util.List list;
    private final java.util.Map map;
    private final com.alibaba.fastjson.parser.DefaultJSONParser parser;

    public ResolveFieldDeserializer(com.alibaba.fastjson.parser.DefaultJSONParser r2, java.util.List r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.parser = r2
            r1.index = r4
            r1.list = r3
            r1.key = r0
            r1.map = r0
            r1.collection = r0
            return
    }

    public ResolveFieldDeserializer(java.util.Collection r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0, r0)
            r2.parser = r0
            r1 = -1
            r2.index = r1
            r2.list = r0
            r2.key = r0
            r2.map = r0
            r2.collection = r3
            return
    }

    public ResolveFieldDeserializer(java.util.Map r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r0, r0)
            r2.parser = r0
            r1 = -1
            r2.index = r1
            r2.list = r0
            r2.key = r4
            r2.map = r3
            r2.collection = r0
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.Object r2, java.lang.reflect.Type r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r0 = this;
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void setValue(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.util.Map r4 = r3.map
            if (r4 == 0) goto La
            java.lang.Object r0 = r3.key
            r4.put(r0, r5)
            return
        La:
            java.util.Collection r4 = r3.collection
            if (r4 == 0) goto L12
            r4.add(r5)
            return
        L12:
            java.util.List r4 = r3.list
            int r0 = r3.index
            r4.set(r0, r5)
            java.util.List r4 = r3.list
            boolean r0 = r4 instanceof com.alibaba.fastjson.JSONArray
            if (r0 == 0) goto L48
            com.alibaba.fastjson.JSONArray r4 = (com.alibaba.fastjson.JSONArray) r4
            java.lang.Object r0 = r4.getRelatedArray()
            if (r0 == 0) goto L48
            int r1 = java.lang.reflect.Array.getLength(r0)
            int r2 = r3.index
            if (r1 <= r2) goto L48
            java.lang.reflect.Type r1 = r4.getComponentType()
            if (r1 == 0) goto L43
            java.lang.reflect.Type r4 = r4.getComponentType()
            com.alibaba.fastjson.parser.DefaultJSONParser r1 = r3.parser
            com.alibaba.fastjson.parser.ParserConfig r1 = r1.getConfig()
            java.lang.Object r5 = com.alibaba.fastjson.util.TypeUtils.cast(r5, r4, r1)
        L43:
            int r4 = r3.index
            java.lang.reflect.Array.set(r0, r4, r5)
        L48:
            return
    }
}
