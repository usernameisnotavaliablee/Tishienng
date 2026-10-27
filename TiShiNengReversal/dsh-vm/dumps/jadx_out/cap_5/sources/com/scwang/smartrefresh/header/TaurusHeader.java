package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TaurusHeader extends android.view.View implements l2.e {
    private static final int A = 4;
    private static final int B = 2;
    private static final int C = 50;
    private static final int D = 300;
    private static final int E = 1000;
    private static final int F = 2000;
    private static final int G = 5;
    private static final float q = 0.5f;
    private static final int r = 1000;
    private static final float s = 0.6f;
    private static final float t = 1.0f;
    private static final float u = 0.8f;
    private static final float v = 1.0f;
    private static final android.view.animation.Interpolator w = null;
    private static final int x = 80;
    private static final int y = 6;
    private static final int z = 10;
    private com.scwang.smartrefresh.layout.internal.pathview.b a;
    private com.scwang.smartrefresh.layout.internal.pathview.b b;
    private android.graphics.Matrix c;
    private float d;
    private int e;
    private android.view.animation.Animation f;
    private boolean g;
    private float h;
    private float i;
    private java.util.Random j;
    private boolean k;
    private java.util.Map<java.lang.Float, java.lang.Float> l;
    private android.graphics.Paint m;
    private float n;
    private boolean o;
    private boolean p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.view.animation.Animation {
        final /* synthetic */ com.scwang.smartrefresh.header.TaurusHeader a;

        a(com.scwang.smartrefresh.header.TaurusHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r1, @androidx.annotation.NonNull android.view.animation.Transformation r2) {
                r0 = this;
                com.scwang.smartrefresh.header.TaurusHeader r2 = r0.a
                com.scwang.smartrefresh.header.TaurusHeader.m(r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a = null;

        static {
                com.scwang.smartrefresh.header.TaurusHeader$c[] r0 = com.scwang.smartrefresh.header.TaurusHeader.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.header.TaurusHeader.b.a = r0
                com.scwang.smartrefresh.header.TaurusHeader$c r1 = com.scwang.smartrefresh.header.TaurusHeader.c.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.scwang.smartrefresh.header.TaurusHeader.b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.scwang.smartrefresh.header.TaurusHeader$c r1 = com.scwang.smartrefresh.header.TaurusHeader.c.b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.scwang.smartrefresh.header.TaurusHeader.b.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.scwang.smartrefresh.header.TaurusHeader$c r1 = com.scwang.smartrefresh.header.TaurusHeader.c.c     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.scwang.smartrefresh.header.TaurusHeader.b.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.scwang.smartrefresh.header.TaurusHeader$c r1 = com.scwang.smartrefresh.header.TaurusHeader.c.d     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum c extends java.lang.Enum<com.scwang.smartrefresh.header.TaurusHeader.c> {
        public static final com.scwang.smartrefresh.header.TaurusHeader.c a = null;
        public static final com.scwang.smartrefresh.header.TaurusHeader.c b = null;
        public static final com.scwang.smartrefresh.header.TaurusHeader.c c = null;
        public static final com.scwang.smartrefresh.header.TaurusHeader.c d = null;
        private static final /* synthetic */ com.scwang.smartrefresh.header.TaurusHeader.c[] e = null;

        static {
                com.scwang.smartrefresh.header.TaurusHeader$c r0 = new com.scwang.smartrefresh.header.TaurusHeader$c
                java.lang.String r1 = "FIRST"
                r2 = 0
                r0.<init>(r1, r2)
                com.scwang.smartrefresh.header.TaurusHeader.c.a = r0
                com.scwang.smartrefresh.header.TaurusHeader$c r1 = new com.scwang.smartrefresh.header.TaurusHeader$c
                java.lang.String r3 = "SECOND"
                r4 = 1
                r1.<init>(r3, r4)
                com.scwang.smartrefresh.header.TaurusHeader.c.b = r1
                com.scwang.smartrefresh.header.TaurusHeader$c r3 = new com.scwang.smartrefresh.header.TaurusHeader$c
                java.lang.String r5 = "THIRD"
                r6 = 2
                r3.<init>(r5, r6)
                com.scwang.smartrefresh.header.TaurusHeader.c.c = r3
                com.scwang.smartrefresh.header.TaurusHeader$c r5 = new com.scwang.smartrefresh.header.TaurusHeader$c
                java.lang.String r7 = "FOURTH"
                r8 = 3
                r5.<init>(r7, r8)
                com.scwang.smartrefresh.header.TaurusHeader.c.d = r5
                r7 = 4
                com.scwang.smartrefresh.header.TaurusHeader$c[] r7 = new com.scwang.smartrefresh.header.TaurusHeader.c[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.scwang.smartrefresh.header.TaurusHeader.c.e = r7
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.scwang.smartrefresh.header.TaurusHeader.c valueOf(java.lang.String r1) {
                java.lang.Class<com.scwang.smartrefresh.header.TaurusHeader$c> r0 = com.scwang.smartrefresh.header.TaurusHeader.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.scwang.smartrefresh.header.TaurusHeader$c r1 = (com.scwang.smartrefresh.header.TaurusHeader.c) r1
                return r1
        }

        public static com.scwang.smartrefresh.header.TaurusHeader.c[] values() {
                com.scwang.smartrefresh.header.TaurusHeader$c[] r0 = com.scwang.smartrefresh.header.TaurusHeader.c.e
                java.lang.Object r0 = r0.clone()
                com.scwang.smartrefresh.header.TaurusHeader$c[] r0 = (com.scwang.smartrefresh.header.TaurusHeader.c[]) r0
                return r0
        }
    }

    static {
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            com.scwang.smartrefresh.header.TaurusHeader.w = r0
            return
    }

    public TaurusHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.g = r0
            r0 = 0
            r1.F(r2, r0)
            return
    }

    public TaurusHeader(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.g = r0
            r1.F(r2, r3)
            return
    }

    public TaurusHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 0
            r0.g = r3
            r0.F(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public TaurusHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 0
            r0.g = r3
            r0.F(r1, r2)
            return
    }

    private void A(android.graphics.Canvas r12, int r13, int r14) {
            r11 = this;
            android.graphics.Matrix r0 = r11.c
            r0.reset()
            float r1 = r11.d
            float r1 = java.lang.Math.abs(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r2, r1)
            boolean r3 = r11.isInEditMode()
            if (r3 == 0) goto L1b
            r11.e = r14
            r1 = 1065353216(0x3f800000, float:1.0)
        L1b:
            float r3 = r11.d
            r4 = 1
            r5 = 0
            r6 = 0
            int r7 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r7 <= 0) goto L2b
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            r3 = 1
            goto L2d
        L2b:
            r2 = 0
            r3 = 0
        L2d:
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r1 - r7
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L3f
            float r8 = r8 / r7
            r7 = 1045220556(0x3e4ccccc, float:0.19999999)
            float r8 = r8 * r7
            float r9 = r9 + r8
        L3f:
            int r7 = r11.e
            float r8 = (float) r7
            float r8 = r8 * r1
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r11.b
            int r1 = r1.f()
            int r1 = r1 / 2
            int r7 = r7 - r1
            float r1 = (float) r7
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 <= 0) goto L55
            float r1 = r8 - r1
            goto L57
        L55:
            r1 = 0
            r4 = 0
        L57:
            int r13 = r13 / 2
            com.scwang.smartrefresh.layout.internal.pathview.b r5 = r11.b
            int r5 = r5.n()
            int r5 = r5 / 2
            int r13 = r13 - r5
            float r13 = (float) r13
            if (r4 == 0) goto L70
            com.scwang.smartrefresh.layout.internal.pathview.b r4 = r11.b
            int r4 = r4.f()
            int r4 = r4 / 2
            float r4 = (float) r4
            float r4 = r4 + r1
            goto L79
        L70:
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r11.b
            int r1 = r1.f()
            int r1 = r1 / 2
            float r4 = (float) r1
        L79:
            float r8 = r8 - r4
            if (r3 == 0) goto L82
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = r2 / r1
            float r1 = r1 + r9
            goto L83
        L82:
            r1 = r9
        L83:
            if (r3 == 0) goto L8a
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r2 = r2 + r9
            goto L8b
        L8a:
            r2 = r9
        L8b:
            boolean r4 = r11.g
            if (r4 == 0) goto Ld3
            if (r3 != 0) goto Ld3
            com.scwang.smartrefresh.header.TaurusHeader$c r2 = com.scwang.smartrefresh.header.TaurusHeader.c.a
            boolean r3 = r11.n(r2)
            r4 = 1090519040(0x41000000, float:8.0)
            r5 = 1117782016(0x42a00000, float:80.0)
            if (r3 == 0) goto La6
            float r1 = r11.D(r2)
        La1:
            float r1 = r1 / r5
            float r1 = r1 / r4
            float r1 = r9 - r1
            goto Ld2
        La6:
            com.scwang.smartrefresh.header.TaurusHeader$c r2 = com.scwang.smartrefresh.header.TaurusHeader.c.b
            boolean r3 = r11.n(r2)
            if (r3 == 0) goto Lb3
            float r1 = r11.D(r2)
            goto La1
        Lb3:
            com.scwang.smartrefresh.header.TaurusHeader$c r2 = com.scwang.smartrefresh.header.TaurusHeader.c.c
            boolean r3 = r11.n(r2)
            r4 = 1086324736(0x40c00000, float:6.0)
            if (r3 == 0) goto Lc5
            float r1 = r11.D(r2)
        Lc1:
            float r1 = r1 / r5
            float r1 = r1 / r4
            float r1 = r1 + r9
            goto Ld2
        Lc5:
            com.scwang.smartrefresh.header.TaurusHeader$c r2 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            boolean r3 = r11.n(r2)
            if (r3 == 0) goto Ld2
            float r1 = r11.D(r2)
            goto Lc1
        Ld2:
            r2 = r1
        Ld3:
            com.scwang.smartrefresh.layout.internal.pathview.b r3 = r11.b
            int r3 = r3.n()
            int r3 = r3 / 2
            float r3 = (float) r3
            r0.postScale(r1, r2, r3, r6)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r11.b
            int r1 = r1.f()
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r8
            int r14 = r14 + 2
            float r14 = (float) r14
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 >= 0) goto Lfb
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r11.b
            int r1 = r1.f()
            float r1 = (float) r1
            float r2 = r2 * r1
            float r8 = r14 - r2
        Lfb:
            int r14 = r12.getSaveCount()
            r12.save()
            r12.translate(r13, r8)
            r12.concat(r0)
            com.scwang.smartrefresh.layout.internal.pathview.b r13 = r11.b
            r13.draw(r12)
            r12.restoreToCount(r14)
            return
    }

    private void B(android.graphics.Canvas r11, int r12, int r13) {
            r10 = this;
            android.graphics.Matrix r0 = r10.c
            r0.reset()
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r10.b
            float r2 = r10.d
            float r2 = java.lang.Math.abs(r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            boolean r4 = r10.isInEditMode()
            if (r4 == 0) goto L1d
            r10.e = r13
            r2 = 1065353216(0x3f800000, float:1.0)
        L1d:
            r4 = 1056964608(0x3f000000, float:0.5)
            float r5 = r2 - r4
            r6 = 1058642330(0x3f19999a, float:0.6)
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 <= 0) goto L30
            float r5 = r5 / r4
            r4 = 1053609164(0x3ecccccc, float:0.39999998)
            float r5 = r5 * r4
            float r6 = r6 + r5
        L30:
            int r4 = r10.e
            float r4 = (float) r4
            float r3 = r3 - r2
            float r4 = r4 * r3
            int r2 = r1.n()
            int r2 = r2 / 2
            int r2 = 0 - r2
            float r2 = (float) r2
            int r3 = r1.n()
            int r3 = r3 / 2
            int r12 = r12 - r3
            float r12 = (float) r12
            boolean r3 = r10.g
            if (r3 == 0) goto La6
            com.scwang.smartrefresh.header.TaurusHeader$c r3 = com.scwang.smartrefresh.header.TaurusHeader.c.a
            boolean r5 = r10.n(r3)
            r8 = 1082130432(0x40800000, float:4.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L66
            float r5 = r10.D(r3)
            float r5 = r5 * r9
            float r5 = r5 / r8
            float r2 = r2 - r5
            float r3 = r10.D(r3)
        L63:
            float r3 = r3 / r9
        L64:
            float r12 = r12 + r3
            goto La6
        L66:
            com.scwang.smartrefresh.header.TaurusHeader$c r3 = com.scwang.smartrefresh.header.TaurusHeader.c.b
            boolean r5 = r10.n(r3)
            if (r5 == 0) goto L7b
            float r5 = r10.D(r3)
            float r5 = r5 * r9
            float r5 = r5 / r8
            float r2 = r2 - r5
            float r3 = r10.D(r3)
            goto L63
        L7b:
            com.scwang.smartrefresh.header.TaurusHeader$c r3 = com.scwang.smartrefresh.header.TaurusHeader.c.c
            boolean r5 = r10.n(r3)
            if (r5 == 0) goto L90
            float r5 = r10.D(r3)
            float r5 = r5 / r8
            float r2 = r2 - r5
            float r3 = r10.D(r3)
            float r3 = r3 * r9
            goto L63
        L90:
            com.scwang.smartrefresh.header.TaurusHeader$c r3 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            boolean r5 = r10.n(r3)
            if (r5 == 0) goto La6
            float r5 = r10.D(r3)
            float r5 = r5 / r9
            float r2 = r2 - r5
            float r3 = r10.D(r3)
            float r3 = r3 * r9
            float r3 = r3 / r8
            goto L64
        La6:
            int r3 = r1.f()
            float r3 = (float) r3
            float r3 = r3 * r6
            float r3 = r3 + r4
            int r13 = r13 + 2
            float r13 = (float) r13
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto Lbf
            int r3 = r1.f()
            float r3 = (float) r3
            float r3 = r3 * r6
            float r3 = r13 - r3
            goto Lc0
        Lbf:
            r3 = r4
        Lc0:
            int r5 = r1.f()
            float r5 = (float) r5
            float r5 = r5 * r6
            float r5 = r5 + r4
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 >= 0) goto Ld5
            int r4 = r1.f()
            float r4 = (float) r4
            float r4 = r4 * r6
            float r4 = r13 - r4
        Ld5:
            int r13 = r11.getSaveCount()
            r11.save()
            r11.translate(r2, r3)
            int r2 = r1.n()
            int r2 = r2 * 3
            int r2 = r2 / 4
            float r2 = (float) r2
            int r3 = r1.f()
            float r3 = (float) r3
            r0.postScale(r6, r6, r2, r3)
            r11.concat(r0)
            r2 = 100
            r1.setAlpha(r2)
            r1.draw(r11)
            r3 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r3)
            r11.restoreToCount(r13)
            r11.save()
            r11.translate(r12, r4)
            int r12 = r1.f()
            float r12 = (float) r12
            r0.postScale(r6, r6, r7, r12)
            r11.concat(r0)
            r1.setAlpha(r2)
            r1.draw(r11)
            r1.setAlpha(r3)
            r11.restoreToCount(r13)
            return
    }

    private void C(android.graphics.Canvas r7, float r8, float r9, int r10) {
            r6 = this;
            float r10 = (float) r10
            float r0 = r10 + r9
            r1 = 1095761920(0x41500000, float:13.0)
            float r0 = r0 / r1
            float r2 = r6.h
            float r3 = r6.i
            float r3 = r3 - r2
            r4 = 0
            r5 = 1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L16
            r6.p = r5
            float r2 = r1 - r2
            goto L1b
        L16:
            r6.o = r5
            r1 = 0
            r6.p = r1
        L1b:
            float r2 = r2 * r0
            float r10 = r10 - r2
            float r10 = r10 + r9
            float r9 = r6.n
            float r1 = r10 - r9
            float r3 = r1 + r9
            android.graphics.Paint r5 = r6.m
            r4 = r8
            r0 = r7
            r2 = r8
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    private float D(com.scwang.smartrefresh.header.TaurusHeader.c r3) {
            r2 = this;
            int[] r0 = com.scwang.smartrefresh.header.TaurusHeader.b.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L44
            r0 = 2
            if (r3 == r0) goto L33
            r0 = 3
            if (r3 == r0) goto L29
            r0 = 4
            if (r3 == r0) goto L16
            r3 = 0
            return r3
        L16:
            com.scwang.smartrefresh.header.TaurusHeader$c r3 = com.scwang.smartrefresh.header.TaurusHeader.c.c
            int r3 = r2.E(r3)
            float r3 = (float) r3
            float r0 = r2.h
            com.scwang.smartrefresh.header.TaurusHeader$c r1 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            int r1 = r2.E(r1)
            float r1 = (float) r1
            float r0 = r0 - r1
        L27:
            float r3 = r3 - r0
            return r3
        L29:
            float r3 = r2.h
            com.scwang.smartrefresh.header.TaurusHeader$c r0 = com.scwang.smartrefresh.header.TaurusHeader.c.b
            int r0 = r2.E(r0)
            float r0 = (float) r0
            goto L27
        L33:
            com.scwang.smartrefresh.header.TaurusHeader$c r3 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            int r0 = r2.E(r3)
            float r0 = (float) r0
            float r1 = r2.h
            int r3 = r2.E(r3)
            float r3 = (float) r3
            float r1 = r1 - r3
            float r0 = r0 - r1
            return r0
        L44:
            float r3 = r2.h
            return r3
    }

    private int E(com.scwang.smartrefresh.header.TaurusHeader.c r2) {
            r1 = this;
            int[] r0 = com.scwang.smartrefresh.header.TaurusHeader.b.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 2
            if (r2 == r0) goto L1f
            r0 = 3
            if (r2 == r0) goto L16
            r0 = 4
            if (r2 == r0) goto L13
            r2 = 0
            return r2
        L13:
            r2 = 20
            return r2
        L16:
            com.scwang.smartrefresh.header.TaurusHeader$c r2 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            int r2 = r1.E(r2)
            int r2 = r2 * 3
            return r2
        L1f:
            r2 = 40
            return r2
    }

    private void F(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = com.scwang.smartrefresh.layout.util.c.b(r0)
            r2.setMinimumHeight(r0)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.l = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.j = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.m = r0
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.m
            r1 = 1077936128(0x40400000, float:3.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.m
            r1 = 50
            r0.setAlpha(r1)
            r2.H()
            r2.I()
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.TaurusHeader
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = com.scwang.smartrefresh.header.R.styleable.TaurusHeader_thPrimaryColor
            r0 = 0
            int r4 = r3.getColor(r4, r0)
            if (r4 == 0) goto L55
            r2.setBackgroundColor(r4)
            goto L5b
        L55:
            r4 = -15614977(0xffffffffff11bbff, float:-1.937142E38)
            r2.setBackgroundColor(r4)
        L5b:
            r3.recycle()
            return
    }

    private float G(int r2, int r3) {
            r1 = this;
            java.util.Random r0 = r1.j
            int r3 = r3 - r2
            int r3 = r3 + 1
            int r3 = r0.nextInt(r3)
            int r3 = r3 + r2
            float r2 = (float) r3
            return r2
    }

    private void H() {
            r3 = this;
            com.scwang.smartrefresh.header.TaurusHeader$a r0 = new com.scwang.smartrefresh.header.TaurusHeader$a
            r0.<init>(r3)
            r3.f = r0
            r1 = -1
            r0.setRepeatCount(r1)
            android.view.animation.Animation r0 = r3.f
            r1 = 2
            r0.setRepeatMode(r1)
            android.view.animation.Animation r0 = r3.f
            android.view.animation.Interpolator r1 = com.scwang.smartrefresh.header.TaurusHeader.w
            r0.setInterpolator(r1)
            android.view.animation.Animation r0 = r3.f
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setDuration(r1)
            return
    }

    private void I() {
            r6 = this;
            com.scwang.smartrefresh.layout.util.c r0 = new com.scwang.smartrefresh.layout.util.c
            r0.<init>()
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r1.<init>()
            r6.a = r1
            java.lang.String r2 = "m23.01,81.48c-0.21,-0.3 -0.38,-0.83 -0.38,-1.19 0,-0.55 0.24,-0.78 1.5,-1.48 1.78,-0.97 2.62,-1.94 2.24,-2.57 -0.57,-0.93 -1.97,-1.24 -11.64,-2.59 -5.35,-0.74 -10.21,-1.44 -10.82,-1.54l-1.09,-0.18 1.19,-0.91c0.99,-0.76 1.38,-0.91 2.35,-0.91 0.64,0 6.39,0.33 12.79,0.74 6.39,0.41 12.09,0.71 12.65,0.67l1.03,-0.07 -1.24,-2.19C30.18,66.77 15.91,42 15.13,40.68l-0.51,-0.87 4.19,-1.26c2.3,-0.69 4.27,-1.26 4.37,-1.26 0.1,0 5.95,3.85 13,8.55 14.69,9.81 17.1,11.31 19.7,12.31 4.63,1.78 6.45,1.69 12.94,-0.64 13.18,-4.73 25.22,-9.13 25.75,-9.4 0.69,-0.36 3.6,1.33 -24.38,-14.22L50.73,23.07 46.74,16.42 42.75,9.77 43.63,8.89c0.83,-0.83 0.91,-0.86 1.46,-0.52 0.32,0.2 3.72,3.09 7.55,6.44 3.83,3.34 7.21,6.16 7.5,6.27 0.29,0.11 13.6,2.82 29.58,6.03 15.98,3.21 31.86,6.4 35.3,7.1l6.26,1.26 3.22,-1.13c41.63,-14.63 67.88,-23.23 85.38,-28 14.83,-4.04 23.75,-4.75 32.07,-2.57 7.04,1.84 9.87,4.88 7.71,8.27 -1.6,2.5 -4.6,4.63 -10.61,7.54 -5.94,2.88 -10.22,4.46 -25.4,9.41 -8.15,2.66 -16.66,5.72 -39.01,14.02 -66.79,24.82 -88.49,31.25 -121.66,36.07 -14.56,2.11 -24.17,2.95 -34.08,2.95 -5.43,0 -5.52,-0.01 -5.89,-0.54z"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r1.i(r2)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r6.a
            r2 = 1115815936(0x42820000, float:65.0)
            int r2 = r0.a(r2)
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = r0.a(r3)
            r4 = 0
            r1.setBounds(r4, r4, r2, r3)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r6.a
            r2 = -1
            int[] r2 = new int[]{r2}
            r1.h(r2)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r1.<init>()
            r6.b = r1
            java.lang.String r2 = "m506.71,31.37a53.11,53.11 0,0 0,-53.11 53.11,53.11 53.11,0 0,0 15.55,37.5h75.12a53.11,53.11 0,0 0,1.88 -2.01,28.49 28.49,0 0,0 0.81,2.01h212.96a96.72,96.72 0,0 0,-87.09 -54.85,96.72 96.72,0 0,0 -73.14,33.52 28.49,28.49 0,0 0,-26.74 -18.74,28.49 28.49,0 0,0 -13.16,3.23 53.11,53.11 0,0 0,0.03 -0.66,53.11 53.11,0 0,0 -53.11,-53.11zM206.23,31.81a53.81,53.81 0,0 0,-49.99 34.03,74.91 74.91,0 0,0 -47.45,-17 74.91,74.91 0,0 0,-73.54 60.82,31.3 31.3,0 0,0 -10.17,-1.73 31.3,31.3 0,0 0,-26.09 14.05L300.86,121.98a37.63,37.63 0,0 0,0.2 -3.85,37.63 37.63,0 0,0 -37.63,-37.63 37.63,37.63 0,0 0,-3.65 0.21,53.81 53.81,0 0,0 -53.54,-48.9z"
            java.lang.String r3 = "m424.05,36.88a53.46,53.46 0,0 0,-40.89 19.02,53.46 53.46,0 0,0 -1.34,1.76 62.6,62.6 0,0 0,-5.39 -0.27,62.6 62.6,0 0,0 -61.36,50.17 62.6,62.6 0,0 0,-0.53 3.51,15.83 15.83,0 0,0 -10.33,-3.84 15.83,15.83 0,0 0,-8.06 2.23,21.1 21.1,0 0,0 -18.31,-10.67 21.1,21.1 0,0 0,-19.47 12.97,21.81 21.81,0 0,0 -6.56,-1.01 21.81,21.81 0,0 0,-19.09 11.32L522.84,122.07a43.61,43.61 0,0 0,-43.11 -37.35,43.61 43.61,0 0,0 -2.57,0.09 53.46,53.46 0,0 0,-53.11 -47.93zM129.08,38.4a50.29,50.29 0,0 0,-50.29 50.29,50.29 50.29,0 0,0 2.37,15.06 15.48,15.83 0,0 0,-5.87 1.68,15.48 15.83,0 0,0 -0.98,0.58 16.53,16.18 0,0 0,-0.19 -0.21,16.53 16.18,0 0,0 -11.86,-4.91 16.53,16.18 0,0 0,-16.38 14.13,20.05 16.18,0 0,0 -14.97,7.04L223.95,122.07a42.56,42.56 0,0 0,1.14 -9.56,42.56 42.56,0 0,0 -42.56,-42.56 42.56,42.56 0,0 0,-6.58 0.54,50.29 50.29,0 0,0 -0,-0.01 50.29,50.29 0,0 0,-46.88 -32.07zM631.67,82.61a64.01,64.01 0,0 0,-44.9 18.42,26.73 26.73,0 0,0 -10.67,-2.24 26.73,26.73 0,0 0,-22.72 12.71,16.88 16.88,0 0,0 -0.25,-0.12 16.88,16.88 0,0 0,-6.57 -1.33,16.88 16.88,0 0,0 -16.15,12.03h160.36a64.01,64.01 0,0 0,-59.1 -39.46z"
            java.lang.String r5 = "M551.81,1.01A65.42,65.42 0,0 0,504.38 21.5A50.65,50.65 0,0 0,492.4 20A50.65,50.65 0,0 0,441.75 70.65A50.65,50.65 0,0 0,492.4 121.3A50.65,50.65 0,0 0,511.22 117.64A65.42,65.42 0,0 0,517.45 122L586.25,122A65.42,65.42 0,0 0,599.79 110.78A59.79,59.79 0,0 0,607.81 122L696.34,122A59.79,59.79 0,0 0,711.87 81.9A59.79,59.79 0,0 0,652.07 22.11A59.79,59.79 0,0 0,610.93 38.57A65.42,65.42 0,0 0,551.81 1.01zM246.2,1.71A54.87,54.87 0,0 0,195.14 36.64A46.78,46.78 0,0 0,167.77 27.74A46.78,46.78 0,0 0,120.99 74.52A46.78,46.78 0,0 0,167.77 121.3A46.78,46.78 0,0 0,208.92 96.74A54.87,54.87 0,0 0,246.2 111.45A54.87,54.87 0,0 0,268.71 106.54A39.04,39.04 0,0 0,281.09 122L327.6,122A39.04,39.04 0,0 0,343.38 90.7A39.04,39.04 0,0 0,304.34 51.66A39.04,39.04 0,0 0,300.82 51.85A54.87,54.87 0,0 0,246.2 1.71z"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r3}
            r1.i(r2)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r6.b
            r2 = -571935747(0xffffffffdde8f3fd, float:-2.0982548E18)
            r3 = -131587(0xfffffffffffdfdfd, float:NaN)
            r5 = -1429742351(0xffffffffaac7dcf1, float:-3.550281E-13)
            int[] r2 = new int[]{r5, r2, r3}
            r1.h(r2)
            com.scwang.smartrefresh.layout.internal.pathview.b r1 = r6.b
            r2 = 1132593152(0x43820000, float:260.0)
            int r2 = r0.a(r2)
            r3 = 1110704128(0x42340000, float:45.0)
            int r0 = r0.a(r3)
            r1.setBounds(r4, r4, r2, r0)
            return
    }

    static /* synthetic */ void m(com.scwang.smartrefresh.header.TaurusHeader r0, float r1) {
            r0.setLoadingAnimationTime(r1)
            return
    }

    private boolean n(com.scwang.smartrefresh.header.TaurusHeader.c r5) {
            r4 = this;
            int[] r0 = com.scwang.smartrefresh.header.TaurusHeader.b.a
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L32
            r3 = 2
            if (r0 == r3) goto L25
            r3 = 3
            if (r0 == r3) goto L25
            r5 = 4
            if (r0 == r5) goto L16
            return r1
        L16:
            float r5 = r4.h
            com.scwang.smartrefresh.header.TaurusHeader$c r0 = com.scwang.smartrefresh.header.TaurusHeader.c.c
            int r0 = r4.E(r0)
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L24
            return r2
        L24:
            return r1
        L25:
            float r0 = r4.h
            int r5 = r4.E(r5)
            float r5 = (float) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L31
            return r2
        L31:
            return r1
        L32:
            float r5 = r4.h
            com.scwang.smartrefresh.header.TaurusHeader$c r0 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            int r0 = r4.E(r0)
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L40
            return r2
        L40:
            return r1
    }

    private void setLoadingAnimationTime(float r2) {
            r1 = this;
            r0 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 / r0
            r0 = 1117782016(0x42a00000, float:80.0)
            float r2 = r2 * r0
            r1.h = r2
            r1.invalidate()
            return
    }

    private void z(android.graphics.Canvas r10, int r11, int r12) {
            r9 = this;
            android.graphics.Matrix r0 = r9.c
            r0.reset()
            float r1 = r9.d
            boolean r2 = r9.isInEditMode()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L13
            r9.e = r12
            r1 = 1065353216(0x3f800000, float:1.0)
        L13:
            r12 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L30
            float r1 = r1 - r3
            float r1 = -r1
            float r1 = r1 / r12
            double r4 = (double) r1
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = java.lang.Math.pow(r6, r4)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r4
            float r1 = (float) r6
            r4 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 * r4
            r4 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L31
        L30:
            r4 = 0
        L31:
            float r5 = (float) r11
            float r6 = r5 * r1
            float r6 = r6 / r12
            com.scwang.smartrefresh.layout.internal.pathview.b r7 = r9.a
            int r7 = r7.n()
            int r7 = r7 / 2
            float r7 = (float) r7
            float r6 = r6 - r7
            int r7 = r9.e
            float r7 = (float) r7
            float r8 = r1 / r12
            float r8 = r3 - r8
            float r7 = r7 * r8
            com.scwang.smartrefresh.layout.internal.pathview.b r8 = r9.a
            int r8 = r8.f()
            int r8 = r8 / 2
            float r8 = (float) r8
            float r7 = r7 - r8
            boolean r8 = r9.k
            if (r8 == 0) goto L86
            int r11 = r11 / 2
            float r11 = (float) r11
            float r3 = r3 - r1
            float r5 = r5 * r3
            float r5 = r5 / r12
            float r11 = r11 + r5
            com.scwang.smartrefresh.layout.internal.pathview.b r12 = r9.a
            int r12 = r12.n()
            int r12 = r12 / 2
            float r12 = (float) r12
            float r6 = r11 - r12
            int r11 = r9.e
            int r11 = r11 / 2
            com.scwang.smartrefresh.layout.internal.pathview.b r12 = r9.a
            int r12 = r12.f()
            int r12 = r12 * 3
            int r12 = r12 / 2
            int r11 = r11 + r12
            float r11 = (float) r11
            float r1 = r1 * r11
            com.scwang.smartrefresh.layout.internal.pathview.b r11 = r9.a
            int r11 = r11.f()
            int r11 = r11 * 2
            float r11 = (float) r11
            float r7 = r1 - r11
        L86:
            boolean r11 = r9.g
            if (r11 == 0) goto Lc0
            com.scwang.smartrefresh.header.TaurusHeader$c r11 = com.scwang.smartrefresh.header.TaurusHeader.c.a
            boolean r12 = r9.n(r11)
            if (r12 == 0) goto L98
            float r11 = r9.D(r11)
        L96:
            float r7 = r7 - r11
            goto Lc0
        L98:
            com.scwang.smartrefresh.header.TaurusHeader$c r11 = com.scwang.smartrefresh.header.TaurusHeader.c.b
            boolean r12 = r9.n(r11)
            if (r12 == 0) goto La5
            float r11 = r9.D(r11)
            goto L96
        La5:
            com.scwang.smartrefresh.header.TaurusHeader$c r11 = com.scwang.smartrefresh.header.TaurusHeader.c.c
            boolean r12 = r9.n(r11)
            if (r12 == 0) goto Lb3
            float r11 = r9.D(r11)
        Lb1:
            float r7 = r7 + r11
            goto Lc0
        Lb3:
            com.scwang.smartrefresh.header.TaurusHeader$c r11 = com.scwang.smartrefresh.header.TaurusHeader.c.d
            boolean r12 = r9.n(r11)
            if (r12 == 0) goto Lc0
            float r11 = r9.D(r11)
            goto Lb1
        Lc0:
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 <= 0) goto Ld9
            com.scwang.smartrefresh.layout.internal.pathview.b r11 = r9.a
            int r11 = r11.n()
            int r11 = r11 / 2
            float r11 = (float) r11
            com.scwang.smartrefresh.layout.internal.pathview.b r12 = r9.a
            int r12 = r12.f()
            int r12 = r12 / 2
            float r12 = (float) r12
            r0.postRotate(r4, r11, r12)
        Ld9:
            int r11 = r10.getSaveCount()
            r10.save()
            r10.translate(r6, r7)
            r10.concat(r0)
            com.scwang.smartrefresh.layout.internal.pathview.b r12 = r9.a
            r12.draw(r10)
            r10.restoreToCount(r11)
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            r0.d = r1
            r0.e = r3
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r13) {
            r12 = this;
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            boolean r2 = r12.g
            if (r2 == 0) goto Ldb
        Lc:
            java.util.Map<java.lang.Float, java.lang.Float> r2 = r12.l
            int r2 = r2.size()
            r3 = 10
            if (r2 >= r3) goto L87
            int r2 = r12.e
            double r2 = (double) r2
            double r4 = java.lang.Math.random()
            r6 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r4 = r4 * r6
            double r2 = r2 / r4
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 2000(0x7d0, float:2.803E-42)
            float r3 = r12.G(r3, r4)
            java.util.Map<java.lang.Float, java.lang.Float> r4 = r12.l
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L76
            r2 = 0
        L35:
            r4 = 0
        L36:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L75
            int r5 = r12.e
            double r8 = (double) r5
            double r10 = java.lang.Math.random()
            double r10 = r10 * r6
            double r8 = r8 / r10
            float r5 = (float) r8
            java.util.Map<java.lang.Float, java.lang.Float> r8 = r12.l
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L4f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L36
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            int r9 = r12.e
            int r9 = r9 / 5
            float r9 = (float) r9
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L35
            r4 = r5
            goto L4f
        L75:
            r2 = r4
        L76:
            java.util.Map<java.lang.Float, java.lang.Float> r4 = r12.l
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            r4.put(r5, r6)
            r12.C(r13, r2, r3, r0)
            goto Lc
        L87:
            java.util.Map<java.lang.Float, java.lang.Float> r2 = r12.l
            int r2 = r2.size()
            if (r2 < r3) goto Lbd
            java.util.Map<java.lang.Float, java.lang.Float> r2 = r12.l
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L99:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r12.C(r13, r4, r3, r0)
            goto L99
        Lbd:
            boolean r2 = r12.p
            if (r2 == 0) goto Ld7
            boolean r2 = r12.o
            if (r2 == 0) goto Ld7
            java.util.Map<java.lang.Float, java.lang.Float> r2 = r12.l
            r2.clear()
            r2 = 0
            r12.o = r2
            r2 = 50
            r3 = 300(0x12c, float:4.2E-43)
            float r2 = r12.G(r2, r3)
            r12.n = r2
        Ld7:
            float r2 = r12.h
            r12.i = r2
        Ldb:
            r12.z(r13, r0, r1)
            r12.B(r13, r0, r1)
            r12.A(r13, r0, r1)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r2) {
            r1 = this;
            r0 = 0
            r2 = r2[r0]
            r1.setBackgroundColor(r2)
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.g = r1
            android.view.animation.Animation r1 = r0.f
            r0.startAnimation(r1)
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            r1 = 0
            r0.g = r1
            r2 = 1
            r0.k = r2
            r0.clearAnimation()
            return r1
    }

    public void x(float r1, int r2, int r3, int r4) {
            r0 = this;
            r0.d = r1
            r1 = 0
            r0.k = r1
            r0.e = r3
            return
    }
}
