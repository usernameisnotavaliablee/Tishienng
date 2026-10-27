package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AtomicCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static final com.alibaba.fastjson.serializer.AtomicCodec instance = null;

    static {
            com.alibaba.fastjson.serializer.AtomicCodec r0 = new com.alibaba.fastjson.serializer.AtomicCodec
            r0.<init>()
            com.alibaba.fastjson.serializer.AtomicCodec.instance = r0
            return
    }

    public AtomicCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r4, java.lang.reflect.Type r5, java.lang.Object r6) {
            r3 = this;
            com.alibaba.fastjson.parser.JSONLexer r6 = r4.lexer
            int r6 = r6.token()
            r0 = 8
            if (r6 != r0) goto L13
            com.alibaba.fastjson.parser.JSONLexer r4 = r4.lexer
            r5 = 16
            r4.nextToken(r5)
            r4 = 0
            return r4
        L13:
            com.alibaba.fastjson.JSONArray r6 = new com.alibaba.fastjson.JSONArray
            r6.<init>()
            r4.parseArray(r6)
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r4 = java.util.concurrent.atomic.AtomicIntegerArray.class
            r0 = 0
            if (r5 != r4) goto L3e
            java.util.concurrent.atomic.AtomicIntegerArray r4 = new java.util.concurrent.atomic.AtomicIntegerArray
            int r5 = r6.size()
            r4.<init>(r5)
        L29:
            int r5 = r6.size()
            if (r0 >= r5) goto L3d
            java.lang.Integer r5 = r6.getInteger(r0)
            int r5 = r5.intValue()
            r4.set(r0, r5)
            int r0 = r0 + 1
            goto L29
        L3d:
            return r4
        L3e:
            java.util.concurrent.atomic.AtomicLongArray r4 = new java.util.concurrent.atomic.AtomicLongArray
            int r5 = r6.size()
            r4.<init>(r5)
        L47:
            int r5 = r6.size()
            if (r0 >= r5) goto L5b
            java.lang.Long r5 = r6.getLong(r0)
            long r1 = r5.longValue()
            r4.set(r0, r1)
            int r0 = r0 + 1
            goto L47
        L5b:
            return r4
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 14
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, java.lang.Object r6, java.lang.reflect.Type r7, int r8) throws java.io.IOException {
            r3 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r4 = r4.out
            boolean r6 = r5 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r6 == 0) goto L10
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.get()
            r4.writeInt(r5)
            return
        L10:
            boolean r6 = r5 instanceof java.util.concurrent.atomic.AtomicLong
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicLong r5 = (java.util.concurrent.atomic.AtomicLong) r5
            long r5 = r5.get()
            r4.writeLong(r5)
            return
        L1e:
            boolean r6 = r5 instanceof java.util.concurrent.atomic.AtomicBoolean
            if (r6 == 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            boolean r5 = r5.get()
            if (r5 == 0) goto L2d
            java.lang.String r5 = "true"
            goto L2f
        L2d:
            java.lang.String r5 = "false"
        L2f:
            r4.append(r5)
            return
        L33:
            if (r5 != 0) goto L3b
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r4.writeNull(r5)
            return
        L3b:
            boolean r6 = r5 instanceof java.util.concurrent.atomic.AtomicIntegerArray
            r7 = 93
            r8 = 44
            r0 = 0
            r1 = 91
            if (r6 == 0) goto L64
            java.util.concurrent.atomic.AtomicIntegerArray r5 = (java.util.concurrent.atomic.AtomicIntegerArray) r5
            int r6 = r5.length()
            r4.write(r1)
        L4f:
            if (r0 >= r6) goto L60
            int r1 = r5.get(r0)
            if (r0 == 0) goto L5a
            r4.write(r8)
        L5a:
            r4.writeInt(r1)
            int r0 = r0 + 1
            goto L4f
        L60:
            r4.write(r7)
            return
        L64:
            java.util.concurrent.atomic.AtomicLongArray r5 = (java.util.concurrent.atomic.AtomicLongArray) r5
            int r6 = r5.length()
            r4.write(r1)
        L6d:
            if (r0 >= r6) goto L7e
            long r1 = r5.get(r0)
            if (r0 == 0) goto L78
            r4.write(r8)
        L78:
            r4.writeLong(r1)
            int r0 = r0 + 1
            goto L6d
        L7e:
            r4.write(r7)
            return
    }
}
