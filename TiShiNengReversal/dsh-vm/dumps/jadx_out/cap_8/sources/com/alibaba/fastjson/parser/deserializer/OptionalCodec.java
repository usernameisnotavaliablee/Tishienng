package com.alibaba.fastjson.parser.deserializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OptionalCodec implements com.alibaba.fastjson.serializer.ObjectSerializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer {
    public static com.alibaba.fastjson.parser.deserializer.OptionalCodec instance;

    static {
            com.alibaba.fastjson.parser.deserializer.OptionalCodec r0 = new com.alibaba.fastjson.parser.deserializer.OptionalCodec
            r0.<init>()
            com.alibaba.fastjson.parser.deserializer.OptionalCodec.instance = r0
            return
    }

    public OptionalCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r1, java.lang.reflect.Type r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.p0.a()
            if (r2 != r3) goto L20
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Object r1 = r1.parseObject(r2)
            java.lang.Integer r1 = com.alibaba.fastjson.util.TypeUtils.castToInt(r1)
            if (r1 != 0) goto L17
            java.util.OptionalInt r1 = com.alibaba.fastjson.parser.deserializer.i1.a()
            return r1
        L17:
            int r1 = r1.intValue()
            java.util.OptionalInt r1 = com.alibaba.fastjson.parser.deserializer.j1.a(r1)
            return r1
        L20:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.k1.a()
            if (r2 != r3) goto L40
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r1 = r1.parseObject(r2)
            java.lang.Long r1 = com.alibaba.fastjson.util.TypeUtils.castToLong(r1)
            if (r1 != 0) goto L37
            java.util.OptionalLong r1 = com.alibaba.fastjson.parser.deserializer.l1.a()
            return r1
        L37:
            long r1 = r1.longValue()
            java.util.OptionalLong r1 = com.alibaba.fastjson.parser.deserializer.m1.a(r1)
            return r1
        L40:
            java.lang.Class r3 = com.alibaba.fastjson.parser.deserializer.n1.a()
            if (r2 != r3) goto L60
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            java.lang.Object r1 = r1.parseObject(r2)
            java.lang.Double r1 = com.alibaba.fastjson.util.TypeUtils.castToDouble(r1)
            if (r1 != 0) goto L57
            java.util.OptionalDouble r1 = com.alibaba.fastjson.parser.deserializer.o1.a()
            return r1
        L57:
            double r1 = r1.doubleValue()
            java.util.OptionalDouble r1 = com.alibaba.fastjson.parser.deserializer.p1.a(r1)
            return r1
        L60:
            java.lang.reflect.Type r2 = com.alibaba.fastjson.util.TypeUtils.unwrapOptional(r2)
            java.lang.Object r1 = r1.parseObject(r2)
            if (r1 != 0) goto L6f
            java.util.Optional r1 = com.alibaba.fastjson.parser.deserializer.q0.a()
            return r1
        L6f:
            java.util.Optional r1 = com.alibaba.fastjson.parser.deserializer.a1.a(r1)
            return r1
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            boolean r3 = com.alibaba.fastjson.parser.deserializer.r0.a(r2)
            if (r3 == 0) goto L20
            java.util.Optional r2 = com.alibaba.fastjson.parser.deserializer.y0.a(r2)
            boolean r3 = com.alibaba.fastjson.parser.deserializer.z0.a(r2)
            if (r3 == 0) goto L1b
            java.lang.Object r2 = com.alibaba.fastjson.parser.deserializer.b1.a(r2)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r1.write(r2)
            return
        L20:
            boolean r3 = com.alibaba.fastjson.parser.deserializer.c1.a(r2)
            if (r3 == 0) goto L40
            java.util.OptionalDouble r2 = com.alibaba.fastjson.parser.deserializer.d1.a(r2)
            boolean r3 = com.alibaba.fastjson.parser.deserializer.e1.a(r2)
            if (r3 == 0) goto L3c
            double r2 = com.alibaba.fastjson.parser.deserializer.f1.a(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.write(r2)
            return
        L3c:
            r1.writeNull()
            return
        L40:
            boolean r3 = com.alibaba.fastjson.parser.deserializer.g1.a(r2)
            if (r3 == 0) goto L5e
            java.util.OptionalInt r2 = com.alibaba.fastjson.parser.deserializer.h1.a(r2)
            boolean r3 = com.alibaba.fastjson.parser.deserializer.s0.a(r2)
            if (r3 == 0) goto L5a
            int r2 = com.alibaba.fastjson.parser.deserializer.t0.a(r2)
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            r1.writeInt(r2)
            return
        L5a:
            r1.writeNull()
            return
        L5e:
            boolean r3 = com.alibaba.fastjson.parser.deserializer.u0.a(r2)
            if (r3 == 0) goto L7c
            java.util.OptionalLong r2 = com.alibaba.fastjson.parser.deserializer.v0.a(r2)
            boolean r3 = com.alibaba.fastjson.parser.deserializer.w0.a(r2)
            if (r3 == 0) goto L78
            long r2 = com.alibaba.fastjson.parser.deserializer.x0.a(r2)
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            r1.writeLong(r2)
            return
        L78:
            r1.writeNull()
            return
        L7c:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not support optional : "
            r3.append(r4)
            java.lang.Class r2 = r2.getClass()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }
}
