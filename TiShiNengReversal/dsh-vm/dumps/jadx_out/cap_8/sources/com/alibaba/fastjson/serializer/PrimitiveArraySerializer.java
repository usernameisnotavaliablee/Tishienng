package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PrimitiveArraySerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static com.alibaba.fastjson.serializer.PrimitiveArraySerializer instance;

    static {
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer r0 = new com.alibaba.fastjson.serializer.PrimitiveArraySerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.PrimitiveArraySerializer.instance = r0
            return
    }

    public PrimitiveArraySerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(com.alibaba.fastjson.serializer.JSONSerializer r4, java.lang.Object r5, java.lang.Object r6, java.lang.reflect.Type r7, int r8) throws java.io.IOException {
            r3 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r4 = r4.out
            if (r5 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty
            r4.writeNull(r5)
            return
        La:
            boolean r6 = r5 instanceof int[]
            r7 = 93
            r8 = 44
            r0 = 0
            r1 = 91
            if (r6 == 0) goto L2e
            int[] r5 = (int[]) r5
            r4.write(r1)
        L1a:
            int r6 = r5.length
            if (r0 >= r6) goto L2a
            if (r0 == 0) goto L22
            r4.write(r8)
        L22:
            r6 = r5[r0]
            r4.writeInt(r6)
            int r0 = r0 + 1
            goto L1a
        L2a:
            r4.write(r7)
            return
        L2e:
            boolean r6 = r5 instanceof short[]
            if (r6 == 0) goto L4b
            short[] r5 = (short[]) r5
            r4.write(r1)
        L37:
            int r6 = r5.length
            if (r0 >= r6) goto L47
            if (r0 == 0) goto L3f
            r4.write(r8)
        L3f:
            short r6 = r5[r0]
            r4.writeInt(r6)
            int r0 = r0 + 1
            goto L37
        L47:
            r4.write(r7)
            return
        L4b:
            boolean r6 = r5 instanceof long[]
            if (r6 == 0) goto L68
            long[] r5 = (long[]) r5
            r4.write(r1)
        L54:
            int r6 = r5.length
            if (r0 >= r6) goto L64
            if (r0 == 0) goto L5c
            r4.write(r8)
        L5c:
            r1 = r5[r0]
            r4.writeLong(r1)
            int r0 = r0 + 1
            goto L54
        L64:
            r4.write(r7)
            return
        L68:
            boolean r6 = r5 instanceof boolean[]
            if (r6 == 0) goto L85
            boolean[] r5 = (boolean[]) r5
            r4.write(r1)
        L71:
            int r6 = r5.length
            if (r0 >= r6) goto L81
            if (r0 == 0) goto L79
            r4.write(r8)
        L79:
            boolean r6 = r5[r0]
            r4.write(r6)
            int r0 = r0 + 1
            goto L71
        L81:
            r4.write(r7)
            return
        L85:
            boolean r6 = r5 instanceof float[]
            if (r6 == 0) goto Lb0
            float[] r5 = (float[]) r5
            r4.write(r1)
        L8e:
            int r6 = r5.length
            if (r0 >= r6) goto Lac
            if (r0 == 0) goto L96
            r4.write(r8)
        L96:
            r6 = r5[r0]
            boolean r1 = java.lang.Float.isNaN(r6)
            if (r1 == 0) goto La2
            r4.writeNull()
            goto La9
        La2:
            java.lang.String r6 = java.lang.Float.toString(r6)
            r4.append(r6)
        La9:
            int r0 = r0 + 1
            goto L8e
        Lac:
            r4.write(r7)
            return
        Lb0:
            boolean r6 = r5 instanceof double[]
            if (r6 == 0) goto Ldb
            double[] r5 = (double[]) r5
            r4.write(r1)
        Lb9:
            int r6 = r5.length
            if (r0 >= r6) goto Ld7
            if (r0 == 0) goto Lc1
            r4.write(r8)
        Lc1:
            r1 = r5[r0]
            boolean r6 = java.lang.Double.isNaN(r1)
            if (r6 == 0) goto Lcd
            r4.writeNull()
            goto Ld4
        Lcd:
            java.lang.String r6 = java.lang.Double.toString(r1)
            r4.append(r6)
        Ld4:
            int r0 = r0 + 1
            goto Lb9
        Ld7:
            r4.write(r7)
            return
        Ldb:
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto Le5
            byte[] r5 = (byte[]) r5
            r4.writeByteArray(r5)
            return
        Le5:
            char[] r5 = (char[]) r5
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            r4.writeString(r6)
            return
    }
}
