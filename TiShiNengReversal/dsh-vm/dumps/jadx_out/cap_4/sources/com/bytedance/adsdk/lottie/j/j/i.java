package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i implements com.bytedance.adsdk.lottie.j.j.mi, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> cw;
    private final com.bytedance.adsdk.lottie.tl j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.model.xt.ws f1776r;
    private final java.lang.String xt;

    public i(com.bytedance.adsdk.lottie.tl r1, com.bytedance.adsdk.lottie.model.layer.cw r2, com.bytedance.adsdk.lottie.model.xt.jy r3) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            java.lang.String r1 = r3.j()
            r0.xt = r1
            com.bytedance.adsdk.lottie.model.j.jy r1 = r3.xt()
            com.bytedance.adsdk.lottie.j.xt.j r1 = r1.j()
            r0.cw = r1
            r2.j(r1)
            r1.j(r0)
            return
    }

    private static int j(int r1, int r2) {
            int r0 = xt(r1, r2)
            int r0 = r0 * r2
            int r1 = r1 - r0
            return r1
    }

    private static int xt(int r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r3 = r3 * r0
            if (r3 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private com.bytedance.adsdk.lottie.model.xt.ws xt(com.bytedance.adsdk.lottie.model.xt.ws r11) {
            r10 = this;
            java.util.List r0 = r11.cw()
            boolean r1 = r11.xt()
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 0
        L10:
            if (r2 < 0) goto L6b
            java.lang.Object r6 = r0.get(r2)
            com.bytedance.adsdk.lottie.model.j r6 = (com.bytedance.adsdk.lottie.model.j) r6
            int r7 = r2 + (-1)
            int r8 = r0.size()
            int r7 = j(r7, r8)
            java.lang.Object r7 = r0.get(r7)
            com.bytedance.adsdk.lottie.model.j r7 = (com.bytedance.adsdk.lottie.model.j) r7
            if (r2 != 0) goto L31
            if (r1 != 0) goto L31
            android.graphics.PointF r8 = r11.j()
            goto L35
        L31:
            android.graphics.PointF r8 = r7.cw()
        L35:
            if (r2 != 0) goto L3b
            if (r1 != 0) goto L3b
            r7 = r8
            goto L3f
        L3b:
            android.graphics.PointF r7 = r7.xt()
        L3f:
            android.graphics.PointF r6 = r6.j()
            boolean r9 = r11.xt()
            if (r9 != 0) goto L54
            if (r2 != 0) goto L54
            int r9 = r0.size()
            int r9 = r9 - r3
            if (r2 != r9) goto L54
            r9 = 1
            goto L55
        L54:
            r9 = 0
        L55:
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L66
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L66
            if (r9 != 0) goto L66
            int r5 = r5 + 2
            goto L68
        L66:
            int r5 = r5 + 1
        L68:
            int r2 = r2 + (-1)
            goto L10
        L6b:
            com.bytedance.adsdk.lottie.model.xt.ws r11 = r10.f1776r
            if (r11 == 0) goto L79
            java.util.List r11 = r11.cw()
            int r11 = r11.size()
            if (r11 == r5) goto L99
        L79:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
            r0 = 0
        L7f:
            if (r0 >= r5) goto L8c
            com.bytedance.adsdk.lottie.model.j r2 = new com.bytedance.adsdk.lottie.model.j
            r2.<init>()
            r11.add(r2)
            int r0 = r0 + 1
            goto L7f
        L8c:
            com.bytedance.adsdk.lottie.model.xt.ws r0 = new com.bytedance.adsdk.lottie.model.xt.ws
            android.graphics.PointF r2 = new android.graphics.PointF
            r3 = 0
            r2.<init>(r3, r3)
            r0.<init>(r2, r4, r11)
            r10.f1776r = r0
        L99:
            com.bytedance.adsdk.lottie.model.xt.ws r11 = r10.f1776r
            r11.j(r1)
            com.bytedance.adsdk.lottie.model.xt.ws r11 = r10.f1776r
            return r11
    }

    @Override // com.bytedance.adsdk.lottie.j.j.mi
    public com.bytedance.adsdk.lottie.model.xt.ws j(com.bytedance.adsdk.lottie.model.xt.ws r19) {
            r18 = this;
            java.util.List r0 = r19.cw()
            int r1 = r0.size()
            r2 = 2
            if (r1 > r2) goto Le
            r1 = r18
            goto L21
        Le:
            r1 = r18
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r2 = r1.cw
            java.lang.Object r2 = r2.ae()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L22
        L21:
            return r19
        L22:
            com.bytedance.adsdk.lottie.model.xt.ws r3 = r18.xt(r19)
            android.graphics.PointF r4 = r19.j()
            float r4 = r4.x
            android.graphics.PointF r5 = r19.j()
            float r5 = r5.y
            r3.j(r4, r5)
            java.util.List r4 = r3.cw()
            boolean r5 = r19.xt()
            r7 = 0
            r8 = 0
        L3f:
            int r9 = r0.size()
            if (r7 >= r9) goto L19f
            java.lang.Object r9 = r0.get(r7)
            com.bytedance.adsdk.lottie.model.j r9 = (com.bytedance.adsdk.lottie.model.j) r9
            int r10 = r7 + (-1)
            int r11 = r0.size()
            int r10 = j(r10, r11)
            java.lang.Object r10 = r0.get(r10)
            com.bytedance.adsdk.lottie.model.j r10 = (com.bytedance.adsdk.lottie.model.j) r10
            int r11 = r7 + (-2)
            int r12 = r0.size()
            int r11 = j(r11, r12)
            java.lang.Object r11 = r0.get(r11)
            com.bytedance.adsdk.lottie.model.j r11 = (com.bytedance.adsdk.lottie.model.j) r11
            if (r7 != 0) goto L74
            if (r5 != 0) goto L74
            android.graphics.PointF r12 = r19.j()
            goto L78
        L74:
            android.graphics.PointF r12 = r10.cw()
        L78:
            if (r7 != 0) goto L7e
            if (r5 != 0) goto L7e
            r13 = r12
            goto L82
        L7e:
            android.graphics.PointF r13 = r10.xt()
        L82:
            android.graphics.PointF r14 = r9.j()
            android.graphics.PointF r11 = r11.cw()
            android.graphics.PointF r15 = r9.cw()
            boolean r16 = r19.xt()
            if (r16 != 0) goto La1
            if (r7 != 0) goto La1
            int r16 = r0.size()
            r17 = 1
            int r6 = r16 + (-1)
            if (r7 != r6) goto La1
            goto La3
        La1:
            r17 = 0
        La3:
            boolean r6 = r13.equals(r12)
            if (r6 == 0) goto L150
            boolean r6 = r14.equals(r12)
            if (r6 == 0) goto L150
            if (r17 != 0) goto L150
            float r6 = r12.x
            float r9 = r11.x
            float r9 = r6 - r9
            float r10 = r12.y
            float r13 = r11.y
            float r13 = r10 - r13
            float r14 = r15.x
            float r14 = r14 - r6
            float r6 = r15.y
            float r6 = r6 - r10
            double r9 = (double) r9
            r16 = r0
            double r0 = (double) r13
            double r0 = java.lang.Math.hypot(r9, r0)
            float r0 = (float) r0
            double r9 = (double) r14
            double r13 = (double) r6
            double r9 = java.lang.Math.hypot(r9, r13)
            float r1 = (float) r9
            float r0 = r2 / r0
            r6 = 1056964608(0x3f000000, float:0.5)
            float r0 = java.lang.Math.min(r0, r6)
            float r1 = r2 / r1
            float r1 = java.lang.Math.min(r1, r6)
            float r6 = r12.x
            float r9 = r11.x
            float r9 = r9 - r6
            float r9 = r9 * r0
            float r9 = r9 + r6
            float r10 = r12.y
            float r11 = r11.y
            float r11 = r11 - r10
            float r11 = r11 * r0
            float r11 = r11 + r10
            float r0 = r15.x
            float r0 = r0 - r6
            float r0 = r0 * r1
            float r0 = r0 + r6
            float r12 = r15.y
            float r12 = r12 - r10
            float r12 = r12 * r1
            float r12 = r12 + r10
            float r1 = r9 - r6
            r13 = 1057835346(0x3f0d4952, float:0.5519)
            float r1 = r1 * r13
            float r1 = r9 - r1
            float r14 = r11 - r10
            float r14 = r14 * r13
            float r14 = r11 - r14
            float r6 = r0 - r6
            float r6 = r6 * r13
            float r6 = r0 - r6
            float r10 = r12 - r10
            float r10 = r10 * r13
            float r10 = r12 - r10
            int r13 = r8 + (-1)
            int r15 = r4.size()
            int r13 = j(r13, r15)
            java.lang.Object r13 = r4.get(r13)
            com.bytedance.adsdk.lottie.model.j r13 = (com.bytedance.adsdk.lottie.model.j) r13
            java.lang.Object r15 = r4.get(r8)
            com.bytedance.adsdk.lottie.model.j r15 = (com.bytedance.adsdk.lottie.model.j) r15
            r13.xt(r9, r11)
            r13.cw(r9, r11)
            if (r7 != 0) goto L139
            r3.j(r9, r11)
        L139:
            r15.j(r1, r14)
            int r1 = r8 + 1
            java.lang.Object r1 = r4.get(r1)
            com.bytedance.adsdk.lottie.model.j r1 = (com.bytedance.adsdk.lottie.model.j) r1
            r15.xt(r6, r10)
            r15.cw(r0, r12)
            r1.j(r0, r12)
            int r8 = r8 + 2
            goto L197
        L150:
            r16 = r0
            int r0 = r8 + (-1)
            int r1 = r4.size()
            int r0 = j(r0, r1)
            java.lang.Object r0 = r4.get(r0)
            com.bytedance.adsdk.lottie.model.j r0 = (com.bytedance.adsdk.lottie.model.j) r0
            java.lang.Object r1 = r4.get(r8)
            com.bytedance.adsdk.lottie.model.j r1 = (com.bytedance.adsdk.lottie.model.j) r1
            android.graphics.PointF r6 = r10.xt()
            float r6 = r6.x
            android.graphics.PointF r11 = r10.xt()
            float r11 = r11.y
            r0.xt(r6, r11)
            android.graphics.PointF r6 = r10.cw()
            float r6 = r6.x
            android.graphics.PointF r10 = r10.cw()
            float r10 = r10.y
            r0.cw(r6, r10)
            android.graphics.PointF r0 = r9.j()
            float r0 = r0.x
            android.graphics.PointF r6 = r9.j()
            float r6 = r6.y
            r1.j(r0, r6)
            int r8 = r8 + 1
        L197:
            int r7 = r7 + 1
            r1 = r18
            r0 = r16
            goto L3f
        L19f:
            return r3
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.j
            r0.invalidateSelf()
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r2) {
            r0 = this;
            return
    }

    public com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> xt() {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r1.cw
            return r0
    }
}
