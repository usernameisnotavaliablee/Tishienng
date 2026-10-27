package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EnumerationSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static com.alibaba.fastjson.serializer.EnumerationSerializer instance;

    static {
            com.alibaba.fastjson.serializer.EnumerationSerializer r0 = new com.alibaba.fastjson.serializer.EnumerationSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.EnumerationSerializer.instance = r0
            return
    }

    public EnumerationSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r10, java.lang.Object r11, java.lang.Object r12, java.lang.reflect.Type r13, int r14) throws java.io.IOException {
            r9 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r14 = r10.out
            if (r11 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r10 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r14.writeNull(r10)
            return
        La:
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r0 = r14.isEnabled(r0)
            r1 = 0
            if (r0 == 0) goto L21
            boolean r0 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L21
            java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13
            java.lang.reflect.Type[] r13 = r13.getActualTypeArguments()
            r13 = r13[r1]
        L1f:
            r6 = r13
            goto L23
        L21:
            r13 = 0
            goto L1f
        L23:
            r13 = r11
            java.util.Enumeration r13 = (java.util.Enumeration) r13
            com.alibaba.fastjson.serializer.SerialContext r8 = r10.context
            r10.setContext(r8, r11, r12, r1)
            r11 = 91
            r14.append(r11)     // Catch: java.lang.Throwable -> L66
        L30:
            boolean r11 = r13.hasMoreElements()     // Catch: java.lang.Throwable -> L66
            if (r11 == 0) goto L69
            java.lang.Object r4 = r13.nextElement()     // Catch: java.lang.Throwable -> L66
            int r11 = r1 + 1
            if (r1 == 0) goto L48
            r12 = 44
            r14.append(r12)     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L72
        L48:
            if (r4 != 0) goto L4f
            r14.writeNull()     // Catch: java.lang.Throwable -> L44
            r3 = r10
            goto L60
        L4f:
            java.lang.Class r12 = r4.getClass()     // Catch: java.lang.Throwable -> L66
            com.alibaba.fastjson.serializer.ObjectSerializer r2 = r10.getObjectWriter(r12)     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L66
            r7 = 0
            r3 = r10
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L63
        L60:
            r1 = r11
            r10 = r3
            goto L30
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L72
        L66:
            r0 = move-exception
            r3 = r10
            goto L64
        L69:
            r3 = r10
            r10 = 93
            r14.append(r10)     // Catch: java.lang.Throwable -> L63
            r3.context = r8
            return
        L72:
            r3.context = r8
            throw r11
    }
}
