package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ListSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static final com.alibaba.fastjson.serializer.ListSerializer instance = null;

    static {
            com.alibaba.fastjson.serializer.ListSerializer r0 = new com.alibaba.fastjson.serializer.ListSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.ListSerializer.instance = r0
            return
    }

    public ListSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(com.alibaba.fastjson.serializer.JSONSerializer r17, java.lang.Object r18, java.lang.Object r19, java.lang.reflect.Type r20, int r21) throws java.io.IOException {
            r16 = this;
            r1 = r17
            r2 = r18
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r1.out
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName
            boolean r6 = r0.isEnabled(r3)
            com.alibaba.fastjson.serializer.SerializeWriter r8 = r1.out
            if (r6 == 0) goto L15
            java.lang.reflect.Type r0 = com.alibaba.fastjson.util.TypeUtils.getCollectionItemType(r20)
            goto L16
        L15:
            r0 = 0
        L16:
            if (r2 != 0) goto L1e
            com.alibaba.fastjson.serializer.SerializerFeature r0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r8.writeNull(r0)
            return
        L1e:
            r7 = r2
            java.util.List r7 = (java.util.List) r7
            int r3 = r7.size()
            if (r3 != 0) goto L2d
            java.lang.String r0 = "[]"
            r8.append(r0)
            return
        L2d:
            com.alibaba.fastjson.serializer.SerialContext r3 = r1.context
            r4 = 0
            r5 = r19
            r1.setContext(r3, r2, r5, r4)
            com.alibaba.fastjson.serializer.SerializerFeature r9 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: java.lang.Throwable -> L5e
            boolean r9 = r8.isEnabled(r9)     // Catch: java.lang.Throwable -> L5e
            r10 = 93
            r11 = 44
            r12 = 91
            if (r9 == 0) goto Lc1
            r8.append(r12)     // Catch: java.lang.Throwable -> L9a
            r1.incrementIndent()     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L9a
            r12 = 0
        L4e:
            boolean r4 = r9.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto Lb3
            java.lang.Object r13 = r9.next()     // Catch: java.lang.Throwable -> L9a
            if (r12 == 0) goto L62
            r8.append(r11)     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r0 = move-exception
        L5f:
            r15 = r3
            goto L157
        L62:
            r1.println()     // Catch: java.lang.Throwable -> L9a
            if (r13 == 0) goto L9d
            boolean r4 = r1.containsReference(r13)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L74
            r1.writeReference(r13)     // Catch: java.lang.Throwable -> L5e
            r14 = r0
            r13 = r1
            r15 = r3
            goto La5
        L74:
            java.lang.Class r4 = r13.getClass()     // Catch: java.lang.Throwable -> L9a
            com.alibaba.fastjson.serializer.ObjectSerializer r14 = r1.getObjectWriter(r4)     // Catch: java.lang.Throwable -> L9a
            com.alibaba.fastjson.serializer.SerialContext r2 = new com.alibaba.fastjson.serializer.SerialContext     // Catch: java.lang.Throwable -> L9a
            r6 = 0
            r7 = 0
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9a
            r15 = r3
            r1.context = r2     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r4 = r0
            r2 = r13
            r0 = r14
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L96
            r13 = r1
            r14 = r4
            goto La5
        L96:
            r0 = move-exception
            r13 = r1
            goto L157
        L9a:
            r0 = move-exception
            r13 = r1
            goto L5f
        L9d:
            r14 = r0
            r13 = r1
            r15 = r3
            com.alibaba.fastjson.serializer.SerializeWriter r0 = r13.out     // Catch: java.lang.Throwable -> Laf
            r0.writeNull()     // Catch: java.lang.Throwable -> Laf
        La5:
            int r12 = r12 + 1
            r2 = r18
            r5 = r19
            r1 = r13
            r0 = r14
            r3 = r15
            goto L4e
        Laf:
            r0 = move-exception
        Lb0:
            r1 = r13
            goto L157
        Lb3:
            r13 = r1
            r15 = r3
            r13.decrementIdent()     // Catch: java.lang.Throwable -> Laf
            r13.println()     // Catch: java.lang.Throwable -> Laf
            r8.append(r10)     // Catch: java.lang.Throwable -> Laf
            r13.context = r15
            return
        Lc1:
            r14 = r0
            r13 = r1
            r15 = r3
            r8.append(r12)     // Catch: java.lang.Throwable -> Laf
            int r9 = r7.size()     // Catch: java.lang.Throwable -> Laf
            r12 = 0
        Lcc:
            if (r12 >= r9) goto L150
            java.lang.Object r2 = r7.get(r12)     // Catch: java.lang.Throwable -> Laf
            if (r12 == 0) goto Ld7
            r8.append(r11)     // Catch: java.lang.Throwable -> Laf
        Ld7:
            if (r2 != 0) goto Le2
            java.lang.String r0 = "null"
            r8.append(r0)     // Catch: java.lang.Throwable -> Laf
        Lde:
            r1 = r13
            r4 = r14
            goto L148
        Le2:
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto Lf4
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Laf
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> Laf
            r8.writeInt(r0)     // Catch: java.lang.Throwable -> Laf
            goto Lde
        Lf4:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L10d
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Laf
            long r0 = r2.longValue()     // Catch: java.lang.Throwable -> Laf
            if (r6 == 0) goto L109
            r8.writeLong(r0)     // Catch: java.lang.Throwable -> Laf
            r0 = 76
            r8.write(r0)     // Catch: java.lang.Throwable -> Laf
            goto Lde
        L109:
            r8.writeLong(r0)     // Catch: java.lang.Throwable -> Laf
            goto Lde
        L10d:
            boolean r0 = r8.disableCircularReferenceDetect     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto L127
            com.alibaba.fastjson.serializer.SerialContext r0 = new com.alibaba.fastjson.serializer.SerialContext     // Catch: java.lang.Throwable -> L124
            r4 = 0
            r5 = 0
            r3 = r19
            r1 = r15
            r15 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L121
            r13.context = r0     // Catch: java.lang.Throwable -> L121
            goto L129
        L121:
            r0 = move-exception
            r15 = r1
            goto Lb0
        L124:
            r0 = move-exception
            r1 = r15
            goto Lb0
        L127:
            r1 = r15
            r15 = r2
        L129:
            boolean r0 = r13.containsReference(r15)     // Catch: java.lang.Throwable -> L121
            if (r0 == 0) goto L134
            r13.writeReference(r15)     // Catch: java.lang.Throwable -> L121
            r15 = r1
            goto Lde
        L134:
            java.lang.Class r0 = r15.getClass()     // Catch: java.lang.Throwable -> L121
            com.alibaba.fastjson.serializer.ObjectSerializer r0 = r13.getObjectWriter(r0)     // Catch: java.lang.Throwable -> L121
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L121
            r5 = 0
            r4 = r14
            r2 = r15
            r15 = r1
            r1 = r13
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L14e
        L148:
            int r12 = r12 + 1
            r13 = r1
            r14 = r4
            goto Lcc
        L14e:
            r0 = move-exception
            goto L157
        L150:
            r1 = r13
            r8.append(r10)     // Catch: java.lang.Throwable -> L14e
            r1.context = r15
            return
        L157:
            r1.context = r15
            throw r0
    }
}
