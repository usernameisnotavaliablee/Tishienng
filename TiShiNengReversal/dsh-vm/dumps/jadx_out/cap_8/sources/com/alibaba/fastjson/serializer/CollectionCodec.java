package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CollectionCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.CollectionCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.CollectionCodec r0 = new com.alibaba.fastjson.serializer.CollectionCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.CollectionCodec.instance = r0
            return
    }

    public CollectionCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5) {
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r0 = r3.lexer
            int r0 = r0.token()
            r1 = 8
            if (r0 != r1) goto L13
            com.alibaba.fastjson.parser.JSONLexer r3 = r3.lexer
            r4 = 16
            r3.nextToken(r4)
            r3 = 0
            return r3
        L13:
            java.lang.Class<com.alibaba.fastjson.JSONArray> r0 = com.alibaba.fastjson.JSONArray.class
            if (r4 != r0) goto L20
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            r4.<init>()
            r3.parseArray(r4)
            return r4
        L20:
            java.util.Collection r0 = com.alibaba.fastjson.util.TypeUtils.createCollection(r4)
            java.lang.reflect.Type r4 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemType(r4)
            r3.parseArray(r4, r0, r5)
            return r0
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 14
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r9, java.lang.Object r10, java.lang.Object r11, java.lang.reflect.Type r12, int r13) throws java.io.IOException {
            r8 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r13 = r9.out
            if (r10 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r9 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r13.writeNull(r9)
            return
        La:
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r1 = r13.isEnabled(r0)
            if (r1 == 0) goto L18
            java.lang.reflect.Type r12 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemType(r12)
        L16:
            r5 = r12
            goto L1a
        L18:
            r12 = 0
            goto L16
        L1a:
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12
            com.alibaba.fastjson.serializer.SerialContext r7 = r9.context
            r1 = 0
            r9.setContext(r7, r10, r11, r1)
            boolean r10 = r13.isEnabled(r0)
            if (r10 == 0) goto L44
            java.lang.Class<java.util.HashSet> r10 = java.util.HashSet.class
            java.lang.Class r11 = r12.getClass()
            if (r10 != r11) goto L37
            java.lang.String r10 = "Set"
            r13.append(r10)
            goto L44
        L37:
            java.lang.Class<java.util.TreeSet> r10 = java.util.TreeSet.class
            java.lang.Class r11 = r12.getClass()
            if (r10 != r11) goto L44
            java.lang.String r10 = "TreeSet"
            r13.append(r10)
        L44:
            r10 = 91
            r13.append(r10)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r10 = r12.iterator()     // Catch: java.lang.Throwable -> Lad
        L4d:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r11 == 0) goto Lb0
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> Lad
            int r11 = r1 + 1
            if (r1 == 0) goto L65
            r12 = 44
            r13.append(r12)     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto Lb9
        L65:
            if (r3 != 0) goto L6c
            r13.writeNull()     // Catch: java.lang.Throwable -> L61
        L6a:
            r2 = r9
            goto La7
        L6c:
            java.lang.Class r12 = r3.getClass()     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r12 != r0) goto L7e
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L61
            int r12 = r3.intValue()     // Catch: java.lang.Throwable -> L61
            r13.writeInt(r12)     // Catch: java.lang.Throwable -> L61
            goto L6a
        L7e:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r12 != r0) goto L99
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L61
            long r0 = r3.longValue()     // Catch: java.lang.Throwable -> L61
            r13.writeLong(r0)     // Catch: java.lang.Throwable -> L61
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName     // Catch: java.lang.Throwable -> L61
            boolean r12 = r13.isEnabled(r12)     // Catch: java.lang.Throwable -> L61
            if (r12 == 0) goto L6a
            r12 = 76
            r13.write(r12)     // Catch: java.lang.Throwable -> L61
            goto L6a
        L99:
            com.alibaba.fastjson.serializer.ObjectSerializer r12 = r9.getObjectWriter(r12)     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lad
            r6 = 0
            r2 = r9
            r1 = r12
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Laa
        La7:
            r1 = r11
            r9 = r2
            goto L4d
        Laa:
            r0 = move-exception
        Lab:
            r10 = r0
            goto Lb9
        Lad:
            r0 = move-exception
            r2 = r9
            goto Lab
        Lb0:
            r2 = r9
            r9 = 93
            r13.append(r9)     // Catch: java.lang.Throwable -> Laa
            r2.context = r7
            return
        Lb9:
            r2.context = r7
            throw r10
    }
}
