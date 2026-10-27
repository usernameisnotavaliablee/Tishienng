package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class rn implements com.bytedance.adsdk.lottie.r.nd<com.bytedance.adsdk.lottie.m.r> {
    public static final com.bytedance.adsdk.lottie.r.rn j = null;

    static {
            com.bytedance.adsdk.lottie.r.rn r0 = new com.bytedance.adsdk.lottie.r.rn
            r0.<init>()
            com.bytedance.adsdk.lottie.r.rn.j = r0
            return
    }

    private rn() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.bytedance.adsdk.lottie.m.r j(android.util.JsonReader r5, float r6) throws java.io.IOException {
            r4 = this;
            android.util.JsonToken r0 = r5.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L10
            r5.beginArray()
        L10:
            double r1 = r5.nextDouble()
            float r1 = (float) r1
            double r2 = r5.nextDouble()
            float r2 = (float) r2
        L1a:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L24
            r5.skipValue()
            goto L1a
        L24:
            if (r0 == 0) goto L29
            r5.endArray()
        L29:
            com.bytedance.adsdk.lottie.m.r r5 = new com.bytedance.adsdk.lottie.m.r
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            float r1 = r1 * r6
            float r2 = r2 / r0
            float r2 = r2 * r6
            r5.<init>(r1, r2)
            return r5
    }

    @Override // com.bytedance.adsdk.lottie.r.nd
    public /* synthetic */ com.bytedance.adsdk.lottie.m.r xt(android.util.JsonReader r1, float r2) throws java.io.IOException {
            r0 = this;
            com.bytedance.adsdk.lottie.m.r r1 = r0.j(r1, r2)
            return r1
    }
}
