package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ArraySerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    private final com.alibaba.fastjson.serializer.ObjectSerializer compObjectSerializer;
    private final java.lang.Class<?> componentType;

    public ArraySerializer(java.lang.Class<?> r1, com.alibaba.fastjson.serializer.ObjectSerializer r2) {
            r0 = this;
            r0.<init>()
            r0.componentType = r1
            r0.compObjectSerializer = r2
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(com.alibaba.fastjson.serializer.JSONSerializer r10, java.lang.Object r11, java.lang.Object r12, java.lang.reflect.Type r13, int r14) throws java.io.IOException {
            r9 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r13 = r10.out
            if (r11 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r10 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r13.writeNull(r10)
            return
        La:
            r14 = r11
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            int r0 = r14.length
            com.alibaba.fastjson.serializer.SerialContext r1 = r10.context
            r2 = 0
            r10.setContext(r1, r11, r12, r2)
            r12 = 91
            r13.append(r12)     // Catch: java.lang.Throwable -> L5c
        L19:
            if (r2 >= r0) goto L75
            if (r2 == 0) goto L27
            r12 = 44
            r13.append(r12)     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7e
        L27:
            r5 = r14[r2]     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L44
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty     // Catch: java.lang.Throwable -> L23
            boolean r12 = r13.isEnabled(r12)     // Catch: java.lang.Throwable -> L23
            if (r12 == 0) goto L3e
            boolean r12 = r11 instanceof java.lang.String[]     // Catch: java.lang.Throwable -> L23
            if (r12 == 0) goto L3e
            java.lang.String r12 = ""
            r13.writeString(r12)     // Catch: java.lang.Throwable -> L23
        L3c:
            r4 = r10
            goto L71
        L3e:
            java.lang.String r12 = "null"
            r13.append(r12)     // Catch: java.lang.Throwable -> L23
            goto L3c
        L44:
            java.lang.Class r12 = r5.getClass()     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<?> r3 = r9.componentType     // Catch: java.lang.Throwable -> L5c
            if (r12 != r3) goto L5f
            com.alibaba.fastjson.serializer.ObjectSerializer r3 = r9.compObjectSerializer     // Catch: java.lang.Throwable -> L5c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5c
            r7 = 0
            r8 = 0
            r4 = r10
            r3.write(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L59
            goto L71
        L59:
            r0 = move-exception
        L5a:
            r11 = r0
            goto L7e
        L5c:
            r0 = move-exception
            r4 = r10
            goto L5a
        L5f:
            r4 = r10
            java.lang.Class r10 = r5.getClass()     // Catch: java.lang.Throwable -> L59
            com.alibaba.fastjson.serializer.ObjectSerializer r3 = r4.getObjectWriter(r10)     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r7 = 0
            r8 = 0
            r3.write(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L59
        L71:
            int r2 = r2 + 1
            r10 = r4
            goto L19
        L75:
            r4 = r10
            r10 = 93
            r13.append(r10)     // Catch: java.lang.Throwable -> L59
            r4.context = r1
            return
        L7e:
            r4.context = r1
            throw r11
    }
}
