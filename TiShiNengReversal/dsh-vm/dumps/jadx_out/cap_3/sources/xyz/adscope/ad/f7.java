package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class f7 implements xyz.adscope.ad.i4 {
    private final xyz.adscope.ad.i4.b a;

    f7() {
            r1 = this;
            r1.<init>()
            xyz.adscope.ad.i4$b r0 = new xyz.adscope.ad.i4$b
            r0.<init>()
            r1.a = r0
            return
    }

    private float[] a(android.view.View r11, android.view.View r12, float[] r13) {
            r10 = this;
            if (r11 == 0) goto L5a
            if (r12 != 0) goto L5
            goto L5a
        L5:
            if (r13 == 0) goto L5a
            int r0 = r13.length
            r1 = 4
            if (r0 != r1) goto L5a
            r0 = 2
            int[] r2 = new int[r0]
            r11.getLocationOnScreen(r2)
            int r2 = r11.getWidth()
            int r11 = r11.getHeight()
            r3 = 0
            r4 = r13[r3]
            double r4 = (double) r4
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            double r8 = (double) r2
            double r4 = r4 / r8
            int r2 = (int) r4
            float r2 = (float) r2
            r4 = 1
            r13 = r13[r4]
            double r8 = (double) r13
            double r8 = r8 * r6
            double r5 = (double) r11
            double r8 = r8 / r5
            int r11 = (int) r8
            float r11 = (float) r11
            int r13 = r12.getWidth()
            int r5 = r12.getHeight()
            int[] r6 = new int[r0]
            r12.getLocationOnScreen(r6)
            float r12 = (float) r13
            float r12 = r12 * r2
            r13 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r13
            float r2 = (float) r5
            float r2 = r2 * r11
            float r2 = r2 / r13
            r11 = r6[r3]
            float r11 = (float) r11
            float r11 = r11 + r12
            r13 = r6[r4]
            float r13 = (float) r13
            float r13 = r13 + r2
            float[] r1 = new float[r1]
            r1[r3] = r12
            r1[r4] = r2
            r1[r0] = r11
            r11 = 3
            r1[r11] = r13
            return r1
        L5a:
            return r13
    }

    @Override // xyz.adscope.ad.i4
    public xyz.adscope.ad.i4.b a() {
            r1 = this;
            xyz.adscope.ad.i4$b r0 = r1.a
            return r0
    }

    @Override // xyz.adscope.ad.i4
    public void a(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L2a
            r1 = 1
            if (r0 == r1) goto La
            return
        La:
            xyz.adscope.ad.i4$b r0 = r3.a
            r0.p()
            xyz.adscope.ad.i4$b r0 = r3.a
            float r1 = r4.getX()
            float r2 = r4.getY()
            r0.d(r1, r2)
            xyz.adscope.ad.i4$b r0 = r3.a
            float r1 = r4.getRawX()
            float r4 = r4.getRawY()
            r0.c(r1, r4)
            return
        L2a:
            xyz.adscope.ad.i4$b r0 = r3.a
            r0.o()
            xyz.adscope.ad.i4$b r0 = r3.a
            float r1 = r4.getX()
            float r2 = r4.getY()
            r0.b(r1, r2)
            xyz.adscope.ad.i4$b r0 = r3.a
            float r1 = r4.getRawX()
            float r4 = r4.getRawY()
            r0.a(r1, r4)
            return
    }

    @Override // xyz.adscope.ad.i4
    public void a(android.view.View r2) {
            r1 = this;
            xyz.adscope.ad.i4$b r0 = r1.a
            r0.a(r2)
            return
    }

    @Override // xyz.adscope.ad.i4
    public void a(android.view.View r10, android.view.View r11, android.view.MotionEvent r12) {
            r9 = this;
            int r0 = r12.getAction()
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            if (r0 == 0) goto L49
            if (r0 == r5) goto Le
            goto L83
        Le:
            xyz.adscope.ad.i4$b r0 = r9.a
            r0.p()
            float r0 = r12.getX()
            float r6 = r12.getY()
            float r7 = r12.getRawX()
            float r12 = r12.getRawY()
            float[] r8 = new float[r4]
            r8[r3] = r0
            r8[r5] = r6
            r8[r2] = r7
            r8[r1] = r12
            float[] r10 = r9.a(r10, r11, r8)
            if (r10 == 0) goto L83
            int r11 = r10.length
            if (r11 != r4) goto L83
            xyz.adscope.ad.i4$b r11 = r9.a
            r12 = r10[r3]
            r0 = r10[r5]
            r11.b(r12, r0)
            xyz.adscope.ad.i4$b r11 = r9.a
            r12 = r10[r2]
            r10 = r10[r1]
            r11.a(r12, r10)
            return
        L49:
            xyz.adscope.ad.i4$b r0 = r9.a
            r0.o()
            float r0 = r12.getX()
            float r6 = r12.getY()
            float r7 = r12.getRawX()
            float r12 = r12.getRawY()
            float[] r8 = new float[r4]
            r8[r3] = r0
            r8[r5] = r6
            r8[r2] = r7
            r8[r1] = r12
            float[] r10 = r9.a(r10, r11, r8)
            if (r10 == 0) goto L83
            int r11 = r10.length
            if (r11 != r4) goto L83
            xyz.adscope.ad.i4$b r11 = r9.a
            r12 = r10[r3]
            r0 = r10[r5]
            r11.b(r12, r0)
            xyz.adscope.ad.i4$b r11 = r9.a
            r12 = r10[r2]
            r10 = r10[r1]
            r11.a(r12, r10)
        L83:
            return
    }
}
