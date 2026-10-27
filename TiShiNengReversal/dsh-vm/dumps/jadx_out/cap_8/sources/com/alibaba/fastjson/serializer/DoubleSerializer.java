package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DoubleSerializer implements com.alibaba.fastjson.serializer.ObjectSerializer {
    public static final com.alibaba.fastjson.serializer.DoubleSerializer instance = null;
    private java.text.DecimalFormat decimalFormat;

    static {
            com.alibaba.fastjson.serializer.DoubleSerializer r0 = new com.alibaba.fastjson.serializer.DoubleSerializer
            r0.<init>()
            com.alibaba.fastjson.serializer.DoubleSerializer.instance = r0
            return
    }

    public DoubleSerializer() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.decimalFormat = r0
            return
    }

    public DoubleSerializer(java.lang.String r2) {
            r1 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public DoubleSerializer(java.text.DecimalFormat r1) {
            r0 = this;
            r0.<init>()
            r0.decimalFormat = r1
            return
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) throws java.io.IOException {
            r0 = this;
            com.alibaba.fastjson.serializer.SerializeWriter r1 = r1.out
            if (r2 != 0) goto La
            com.alibaba.fastjson.serializer.SerializerFeature r2 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero
            r1.writeNull(r2)
            return
        La:
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L2e
            boolean r4 = java.lang.Double.isInfinite(r2)
            if (r4 == 0) goto L1d
            goto L2e
        L1d:
            java.text.DecimalFormat r4 = r0.decimalFormat
            if (r4 != 0) goto L26
            r4 = 1
            r1.writeDouble(r2, r4)
            return
        L26:
            java.lang.String r2 = r4.format(r2)
            r1.write(r2)
            return
        L2e:
            r1.writeNull()
            return
    }
}
