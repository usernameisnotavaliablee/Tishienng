package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae implements com.bytedance.adsdk.lottie.r.nd<java.lang.Integer> {
    public static final com.bytedance.adsdk.lottie.r.ae j = null;

    static {
            com.bytedance.adsdk.lottie.r.ae r0 = new com.bytedance.adsdk.lottie.r.ae
            r0.<init>()
            com.bytedance.adsdk.lottie.r.ae.j = r0
            return
    }

    private ae() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.Integer j(android.util.JsonReader r12, float r13) throws java.io.IOException {
            r11 = this;
            android.util.JsonToken r13 = r12.peek()
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_ARRAY
            if (r13 != r0) goto La
            r13 = 1
            goto Lb
        La:
            r13 = 0
        Lb:
            if (r13 == 0) goto L10
            r12.beginArray()
        L10:
            double r0 = r12.nextDouble()
            double r2 = r12.nextDouble()
            double r4 = r12.nextDouble()
            android.util.JsonToken r6 = r12.peek()
            android.util.JsonToken r7 = android.util.JsonToken.NUMBER
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r6 != r7) goto L2b
            double r6 = r12.nextDouble()
            goto L2c
        L2b:
            r6 = r8
        L2c:
            if (r13 == 0) goto L31
            r12.endArray()
        L31:
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 > 0) goto L4e
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 > 0) goto L4e
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 > 0) goto L4e
            r12 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r12
            double r2 = r2 * r12
            double r4 = r4 * r12
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L4e
            double r6 = r6 * r12
        L4e:
            int r12 = (int) r6
            int r13 = (int) r0
            int r0 = (int) r2
            int r1 = (int) r4
            int r12 = android.graphics.Color.argb(r12, r13, r0, r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
    }

    @Override // com.bytedance.adsdk.lottie.r.nd
    public /* synthetic */ java.lang.Integer xt(android.util.JsonReader r1, float r2) throws java.io.IOException {
            r0 = this;
            java.lang.Integer r1 = r0.j(r1, r2)
            return r1
    }
}
