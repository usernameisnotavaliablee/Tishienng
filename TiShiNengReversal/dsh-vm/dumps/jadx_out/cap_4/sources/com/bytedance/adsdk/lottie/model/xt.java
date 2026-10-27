package com.bytedance.adsdk.lottie.model;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public float ae;
    public float cw;

    @com.bytedance.component.sdk.annotation.ColorInt
    public int g;
    public java.lang.String j;
    public android.graphics.PointF jy;

    /* renamed from: m, reason: collision with root package name */
    public float f1859m;
    public float oq;
    public boolean qv;

    /* renamed from: r, reason: collision with root package name */
    public com.bytedance.adsdk.lottie.model.xt.j f1860r;

    @com.bytedance.component.sdk.annotation.ColorInt
    public int tl;
    public int up;
    public android.graphics.PointF vl;
    public java.lang.String xt;

    public enum j extends java.lang.Enum<com.bytedance.adsdk.lottie.model.xt.j> {
        public static final com.bytedance.adsdk.lottie.model.xt.j cw = null;
        public static final com.bytedance.adsdk.lottie.model.xt.j j = null;

        /* renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ com.bytedance.adsdk.lottie.model.xt.j[] f1866r = null;
        public static final com.bytedance.adsdk.lottie.model.xt.j xt = null;

        static {
                com.bytedance.adsdk.lottie.model.xt$j r0 = new com.bytedance.adsdk.lottie.model.xt$j
                java.lang.String r1 = "LEFT_ALIGN"
                r2 = 0
                r0.<init>(r1, r2)
                com.bytedance.adsdk.lottie.model.xt.j.j = r0
                com.bytedance.adsdk.lottie.model.xt$j r1 = new com.bytedance.adsdk.lottie.model.xt$j
                java.lang.String r3 = "RIGHT_ALIGN"
                r4 = 1
                r1.<init>(r3, r4)
                com.bytedance.adsdk.lottie.model.xt.j.xt = r1
                com.bytedance.adsdk.lottie.model.xt$j r3 = new com.bytedance.adsdk.lottie.model.xt$j
                java.lang.String r5 = "CENTER"
                r6 = 2
                r3.<init>(r5, r6)
                com.bytedance.adsdk.lottie.model.xt.j.cw = r3
                r5 = 3
                com.bytedance.adsdk.lottie.model.xt$j[] r5 = new com.bytedance.adsdk.lottie.model.xt.j[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.bytedance.adsdk.lottie.model.xt.j.f1866r = r5
                return
        }

        j(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bytedance.adsdk.lottie.model.xt.j valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.adsdk.lottie.model.xt$j> r0 = com.bytedance.adsdk.lottie.model.xt.j.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.adsdk.lottie.model.xt$j r1 = (com.bytedance.adsdk.lottie.model.xt.j) r1
                return r1
        }

        public static com.bytedance.adsdk.lottie.model.xt.j[] values() {
                com.bytedance.adsdk.lottie.model.xt$j[] r0 = com.bytedance.adsdk.lottie.model.xt.j.f1866r
                java.lang.Object r0 = r0.clone()
                com.bytedance.adsdk.lottie.model.xt$j[] r0 = (com.bytedance.adsdk.lottie.model.xt.j[]) r0
                return r0
        }
    }

    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public xt(java.lang.String r1, java.lang.String r2, float r3, com.bytedance.adsdk.lottie.model.xt.j r4, int r5, float r6, float r7, @com.bytedance.component.sdk.annotation.ColorInt int r8, @com.bytedance.component.sdk.annotation.ColorInt int r9, float r10, boolean r11, android.graphics.PointF r12, android.graphics.PointF r13) {
            r0 = this;
            r0.<init>()
            r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.j
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.xt
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r0 = (float) r0
            float r1 = r5.cw
            float r0 = r0 + r1
            int r0 = (int) r0
            int r0 = r0 * 31
            com.bytedance.adsdk.lottie.model.xt$j r1 = r5.f1860r
            int r1 = r1.ordinal()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r5.up
            int r0 = r0 + r1
            float r1 = r5.f1859m
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = r0 * 31
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.tl
            int r0 = r0 + r1
            return r0
    }

    public void j(java.lang.String r1, java.lang.String r2, float r3, com.bytedance.adsdk.lottie.model.xt.j r4, int r5, float r6, float r7, @com.bytedance.component.sdk.annotation.ColorInt int r8, @com.bytedance.component.sdk.annotation.ColorInt int r9, float r10, boolean r11, android.graphics.PointF r12, android.graphics.PointF r13) {
            r0 = this;
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f1860r = r4
            r0.up = r5
            r0.f1859m = r6
            r0.ae = r7
            r0.tl = r8
            r0.g = r9
            r0.oq = r10
            r0.qv = r11
            r0.vl = r12
            r0.jy = r13
            return
    }
}
