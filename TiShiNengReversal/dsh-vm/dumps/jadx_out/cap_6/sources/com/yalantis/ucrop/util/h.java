package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h {
    private static final int j = -1;
    private float a;
    private float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private com.yalantis.ucrop.util.h.a i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean a(com.yalantis.ucrop.util.h r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.yalantis.ucrop.util.h.a {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.yalantis.ucrop.util.h.a
        public boolean a(com.yalantis.ucrop.util.h r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public h(com.yalantis.ucrop.util.h.a r1) {
            r0 = this;
            r0.<init>()
            r0.i = r1
            r1 = -1
            r0.e = r1
            r0.f = r1
            return
    }

    private float a(float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10) {
            r2 = this;
            float r4 = r4 - r6
            double r0 = (double) r4
            float r3 = r3 - r5
            double r3 = (double) r3
            double r3 = java.lang.Math.atan2(r0, r3)
            float r3 = (float) r3
            double r3 = (double) r3
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            float r8 = r8 - r10
            double r4 = (double) r8
            float r7 = r7 - r9
            double r6 = (double) r7
            double r4 = java.lang.Math.atan2(r4, r6)
            float r4 = (float) r4
            double r4 = (double) r4
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            float r3 = r2.b(r3, r4)
            return r3
    }

    private float b(float r2, float r3) {
            r1 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            float r2 = r2 % r0
            float r3 = r3 - r2
            r1.g = r3
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L11
            float r3 = r3 + r0
            r1.g = r3
            goto L1a
        L11:
            r2 = 1127481344(0x43340000, float:180.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a
            float r3 = r3 - r0
            r1.g = r3
        L1a:
            float r2 = r1.g
            return r2
    }

    public float c() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    public boolean d(@androidx.annotation.NonNull android.view.MotionEvent r14) {
            r13 = this;
            int r0 = r14.getActionMasked()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L8d
            r4 = -1
            if (r0 == r3) goto L89
            r5 = 2
            if (r0 == r5) goto L3a
            r1 = 5
            if (r0 == r1) goto L1b
            r14 = 6
            if (r0 == r14) goto L18
        L15:
            r0 = r13
            goto La8
        L18:
            r13.f = r4
            goto L15
        L1b:
            float r0 = r14.getX()
            r13.a = r0
            float r0 = r14.getY()
            r13.b = r0
            int r0 = r14.getActionIndex()
            int r0 = r14.getPointerId(r0)
            int r14 = r14.findPointerIndex(r0)
            r13.f = r14
            r13.g = r2
            r13.h = r3
            goto L15
        L3a:
            int r0 = r13.e
            if (r0 == r4) goto L15
            int r0 = r13.f
            if (r0 == r4) goto L15
            int r0 = r14.getPointerCount()
            int r4 = r13.f
            if (r0 <= r4) goto L15
            int r0 = r13.e
            float r11 = r14.getX(r0)
            int r0 = r13.e
            float r12 = r14.getY(r0)
            int r0 = r13.f
            float r9 = r14.getX(r0)
            int r0 = r13.f
            float r10 = r14.getY(r0)
            boolean r14 = r13.h
            if (r14 == 0) goto L6c
            r13.g = r2
            r13.h = r1
            r0 = r13
            goto L79
        L6c:
            float r5 = r13.a
            float r6 = r13.b
            float r7 = r13.c
            float r8 = r13.d
            r4 = r13
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r4
        L79:
            com.yalantis.ucrop.util.h$a r14 = r0.i
            if (r14 == 0) goto L80
            r14.a(r13)
        L80:
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.d = r12
            goto La8
        L89:
            r0 = r13
            r0.e = r4
            goto La8
        L8d:
            r0 = r13
            float r4 = r14.getX()
            r0.c = r4
            float r4 = r14.getY()
            r0.d = r4
            int r1 = r14.getPointerId(r1)
            int r14 = r14.findPointerIndex(r1)
            r0.e = r14
            r0.g = r2
            r0.h = r3
        La8:
            return r3
    }
}
