package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l implements com.bytedance.adsdk.lottie.r.nd<android.graphics.PointF> {
    public static final com.bytedance.adsdk.lottie.r.l j = null;

    static {
            com.bytedance.adsdk.lottie.r.l r0 = new com.bytedance.adsdk.lottie.r.l
            r0.<init>()
            com.bytedance.adsdk.lottie.r.l.j = r0
            return
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.graphics.PointF j(android.util.JsonReader r5, float r6) throws java.io.IOException {
            r4 = this;
            android.util.JsonToken r0 = r5.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY
            if (r0 != r1) goto Ld
            android.graphics.PointF r5 = com.bytedance.adsdk.lottie.r.mi.xt(r5, r6)
            return r5
        Ld:
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT
            if (r0 != r1) goto L16
            android.graphics.PointF r5 = com.bytedance.adsdk.lottie.r.mi.xt(r5, r6)
            return r5
        L16:
            android.util.JsonToken r1 = android.util.JsonToken.NUMBER
            if (r0 != r1) goto L38
            android.graphics.PointF r0 = new android.graphics.PointF
            double r1 = r5.nextDouble()
            float r1 = (float) r1
            float r1 = r1 * r6
            double r2 = r5.nextDouble()
            float r2 = (float) r2
            float r2 = r2 * r6
            r0.<init>(r1, r2)
        L2d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L37
            r5.skipValue()
            goto L2d
        L37:
            return r0
        L38:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Cannot convert json to point. Next token is "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r6 = r6.concat(r0)
            r5.<init>(r6)
            throw r5
    }

    @Override // com.bytedance.adsdk.lottie.r.nd
    public /* synthetic */ android.graphics.PointF xt(android.util.JsonReader r1, float r2) throws java.io.IOException {
            r0 = this;
            android.graphics.PointF r1 = r0.j(r1, r2)
            return r1
    }
}
