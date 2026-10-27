package master.flame.danmaku.danmaku.model.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d {
    public static final float l = 539.0f;
    public static final float m = 682.0f;
    public static final float n = 385.0f;
    public static final float o = 438.0f;
    public static final long p = 3800;
    public static final int q = 25;
    public static final long r = 4000;
    public static final long s = 9000;
    public int a;
    public int b;
    private float c;
    public long d;
    public long e;
    public master.flame.danmaku.danmaku.model.g f;
    public master.flame.danmaku.danmaku.model.g g;
    public master.flame.danmaku.danmaku.model.g h;
    private master.flame.danmaku.danmaku.model.m i;
    public master.flame.danmaku.danmaku.model.n j;
    private master.flame.danmaku.danmaku.model.android.DanmakuContext k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends master.flame.danmaku.danmaku.model.m.c<master.flame.danmaku.danmaku.model.d> {
        final /* synthetic */ float e;
        final /* synthetic */ float f;
        final /* synthetic */ master.flame.danmaku.danmaku.model.android.d g;

        a(master.flame.danmaku.danmaku.model.android.d r1, float r2, float r3) {
                r0 = this;
                r0.g = r1
                r0.e = r2
                r0.f = r3
                r0.<init>()
                return
        }

        @Override // master.flame.danmaku.danmaku.model.m.b
        public /* bridge */ /* synthetic */ int a(java.lang.Object r1) {
                r0 = this;
                master.flame.danmaku.danmaku.model.d r1 = (master.flame.danmaku.danmaku.model.d) r1
                int r1 = r0.e(r1)
                return r1
        }

        public int e(master.flame.danmaku.danmaku.model.d r13) {
                r12 = this;
                r1 = r13
                master.flame.danmaku.danmaku.model.r r1 = (master.flame.danmaku.danmaku.model.r) r1
                master.flame.danmaku.danmaku.model.android.d r0 = r12.g
                float r2 = r1.W
                float r3 = r1.X
                float r4 = r1.Y
                float r5 = r1.Z
                long r6 = r1.c0
                long r8 = r1.d0
                float r10 = r12.e
                float r11 = r12.f
                r0.i(r1, r2, r3, r4, r5, r6, r8, r10, r11)
                master.flame.danmaku.danmaku.model.r$a[] r13 = r1.o0
                r0 = 0
                if (r13 == 0) goto L51
                int r2 = r13.length
                if (r2 <= 0) goto L51
                int r2 = r13.length
                int r3 = r2 + 1
                r4 = 2
                int[] r5 = new int[r4]
                r6 = 1
                r5[r6] = r4
                r5[r0] = r3
                java.lang.Class r3 = java.lang.Float.TYPE
                java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r5)
                float[][] r3 = (float[][]) r3
                r4 = 0
            L34:
                if (r4 >= r2) goto L4a
                r5 = r13[r4]
                float[] r5 = r5.a()
                r3[r4] = r5
                int r5 = r4 + 1
                r4 = r13[r4]
                float[] r4 = r4.c()
                r3[r5] = r4
                r4 = r5
                goto L34
            L4a:
                float r13 = r12.e
                float r2 = r12.f
                master.flame.danmaku.danmaku.model.android.d.h(r1, r3, r13, r2)
            L51:
                return r0
        }
    }

    protected d() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.c = r0
            r0 = 3800(0xed8, double:1.8774E-320)
            r2.d = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r2.e = r0
            master.flame.danmaku.danmaku.model.android.e r0 = new master.flame.danmaku.danmaku.model.android.e
            r0.<init>()
            r2.i = r0
            return
    }

    static master.flame.danmaku.danmaku.model.android.d a() {
            master.flame.danmaku.danmaku.model.android.d r0 = new master.flame.danmaku.danmaku.model.android.d
            r0.<init>()
            return r0
    }

    public static void h(master.flame.danmaku.danmaku.model.d r5, float[][] r6, float r7, float r8) {
            int r0 = r5.getType()
            r1 = 7
            if (r0 != r1) goto L2d
            int r0 = r6.length
            if (r0 == 0) goto L2d
            r0 = 0
            r1 = r6[r0]
            int r1 = r1.length
            r2 = 2
            if (r1 == r2) goto L12
            goto L2d
        L12:
            r1 = 0
        L13:
            int r2 = r6.length
            if (r1 >= r2) goto L28
            r2 = r6[r1]
            r3 = r2[r0]
            float r3 = r3 * r7
            r2[r0] = r3
            r3 = 1
            r4 = r2[r3]
            float r4 = r4 * r8
            r2[r3] = r4
            int r1 = r1 + 1
            goto L13
        L28:
            master.flame.danmaku.danmaku.model.r r5 = (master.flame.danmaku.danmaku.model.r) r5
            r5.J(r6)
        L2d:
            return
    }

    private synchronized void n(float r3, float r4) {
            r2 = this;
            monitor-enter(r2)
            master.flame.danmaku.danmaku.model.m r0 = r2.i     // Catch: java.lang.Throwable -> Ld
            master.flame.danmaku.danmaku.model.android.d$a r1 = new master.flame.danmaku.danmaku.model.android.d$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
            r0.a(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    private void o(master.flame.danmaku.danmaku.model.d r6) {
            r5 = this;
            master.flame.danmaku.danmaku.model.g r0 = r5.h
            if (r0 == 0) goto L12
            master.flame.danmaku.danmaku.model.g r1 = r6.r
            if (r1 == 0) goto L11
            long r1 = r1.c
            long r3 = r0.c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L11
            goto L12
        L11:
            return
        L12:
            master.flame.danmaku.danmaku.model.g r6 = r6.r
            r5.h = r6
            r5.m()
            return
    }

    public master.flame.danmaku.danmaku.model.d b(int r2) {
            r1 = this;
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r1.k
            master.flame.danmaku.danmaku.model.d r2 = r1.f(r2, r0)
            return r2
    }

    public master.flame.danmaku.danmaku.model.d c(int r6, float r7, float r8, float r9, float r10) {
            r5 = this;
            int r0 = r5.a
            int r1 = r5.b
            boolean r9 = r5.p(r7, r8, r9)
            master.flame.danmaku.danmaku.model.g r2 = r5.f
            if (r2 != 0) goto L19
            master.flame.danmaku.danmaku.model.g r2 = new master.flame.danmaku.danmaku.model.g
            long r3 = r5.d
            r2.<init>(r3)
            r5.f = r2
            r2.a(r10)
            goto L20
        L19:
            if (r9 == 0) goto L20
            long r3 = r5.d
            r2.b(r3)
        L20:
            master.flame.danmaku.danmaku.model.g r10 = r5.g
            if (r10 != 0) goto L2d
            master.flame.danmaku.danmaku.model.g r10 = new master.flame.danmaku.danmaku.model.g
            r2 = 3800(0xed8, double:1.8774E-320)
            r10.<init>(r2)
            r5.g = r10
        L2d:
            if (r9 == 0) goto L4c
            r9 = 0
            int r10 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r10 <= 0) goto L4c
            r5.m()
            if (r0 <= 0) goto L41
            if (r1 <= 0) goto L41
            float r10 = (float) r0
            float r7 = r7 / r10
            float r10 = (float) r1
            float r10 = r8 / r10
            goto L45
        L41:
            r7 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
        L45:
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L4c
            r5.n(r7, r10)
        L4c:
            r7 = 1
            if (r6 == r7) goto L80
            r7 = 4
            if (r6 == r7) goto L78
            r7 = 5
            if (r6 == r7) goto L70
            r7 = 6
            if (r6 == r7) goto L68
            r7 = 7
            if (r6 == r7) goto L5d
            r6 = 0
            return r6
        L5d:
            master.flame.danmaku.danmaku.model.r r6 = new master.flame.danmaku.danmaku.model.r
            r6.<init>()
            master.flame.danmaku.danmaku.model.m r7 = r5.i
            r7.j(r6)
            return r6
        L68:
            master.flame.danmaku.danmaku.model.p r6 = new master.flame.danmaku.danmaku.model.p
            master.flame.danmaku.danmaku.model.g r7 = r5.f
            r6.<init>(r7)
            return r6
        L70:
            master.flame.danmaku.danmaku.model.i r6 = new master.flame.danmaku.danmaku.model.i
            master.flame.danmaku.danmaku.model.g r7 = r5.g
            r6.<init>(r7)
            return r6
        L78:
            master.flame.danmaku.danmaku.model.h r6 = new master.flame.danmaku.danmaku.model.h
            master.flame.danmaku.danmaku.model.g r7 = r5.g
            r6.<init>(r7)
            return r6
        L80:
            master.flame.danmaku.danmaku.model.q r6 = new master.flame.danmaku.danmaku.model.q
            master.flame.danmaku.danmaku.model.g r7 = r5.f
            r6.<init>(r7)
            return r6
    }

    public master.flame.danmaku.danmaku.model.d d(int r7, int r8, int r9, float r10, float r11) {
            r6 = this;
            float r2 = (float) r8
            float r3 = (float) r9
            r0 = r6
            r1 = r7
            r4 = r10
            r5 = r11
            master.flame.danmaku.danmaku.model.d r7 = r0.c(r1, r2, r3, r4, r5)
            return r7
    }

    public master.flame.danmaku.danmaku.model.d e(int r7, master.flame.danmaku.danmaku.model.n r8, float r9, float r10) {
            r6 = this;
            if (r8 != 0) goto L4
            r7 = 0
            return r7
        L4:
            r6.j = r8
            int r2 = r8.getWidth()
            int r3 = r8.getHeight()
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            master.flame.danmaku.danmaku.model.d r7 = r0.d(r1, r2, r3, r4, r5)
            return r7
    }

    public master.flame.danmaku.danmaku.model.d f(int r8, master.flame.danmaku.danmaku.model.android.DanmakuContext r9) {
            r7 = this;
            if (r9 != 0) goto L4
            r8 = 0
            return r8
        L4:
            r7.k = r9
            master.flame.danmaku.danmaku.model.b r0 = r9.g()
            r7.j = r0
            int r3 = r0.getWidth()
            master.flame.danmaku.danmaku.model.n r0 = r7.j
            int r4 = r0.getHeight()
            float r5 = r7.c
            float r6 = r9.l
            r1 = r7
            r2 = r8
            master.flame.danmaku.danmaku.model.d r8 = r1.d(r2, r3, r4, r5, r6)
            return r8
    }

    public void g(master.flame.danmaku.danmaku.model.d r3, int r4, int r5, long r6) {
            r2 = this;
            int r0 = r3.getType()
            r1 = 7
            if (r0 == r1) goto L8
            return
        L8:
            r0 = r3
            master.flame.danmaku.danmaku.model.r r0 = (master.flame.danmaku.danmaku.model.r) r0
            r0.I(r4, r5, r6)
            r2.o(r3)
            return
    }

    public void i(master.flame.danmaku.danmaku.model.d r3, float r4, float r5, float r6, float r7, long r8, long r10, float r12, float r13) {
            r2 = this;
            int r0 = r3.getType()
            r1 = 7
            if (r0 == r1) goto L8
            return
        L8:
            r0 = r4
            r4 = r3
            master.flame.danmaku.danmaku.model.r r4 = (master.flame.danmaku.danmaku.model.r) r4
            float r0 = r0 * r12
            float r5 = r5 * r13
            float r6 = r6 * r12
            float r7 = r7 * r13
            r11 = r10
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r0
            r4.K(r5, r6, r7, r8, r9, r11)
            r2.o(r3)
            return
    }

    public void j(master.flame.danmaku.danmaku.model.android.DanmakuContext r2) {
            r1 = this;
            r1.k = r2
            master.flame.danmaku.danmaku.model.b r0 = r2.g()
            r1.j = r0
            r0 = 1
            r1.f(r0, r2)
            return
    }

    public void k() {
            r2 = this;
            r0 = 0
            r2.j = r0
            r1 = 0
            r2.b = r1
            r2.a = r1
            master.flame.danmaku.danmaku.model.m r1 = r2.i
            r1.clear()
            r2.f = r0
            r2.g = r0
            r2.h = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r2.e = r0
            return
    }

    public void l(float r3) {
            r2 = this;
            master.flame.danmaku.danmaku.model.g r0 = r2.f
            if (r0 == 0) goto Lf
            master.flame.danmaku.danmaku.model.g r1 = r2.g
            if (r1 != 0) goto L9
            goto Lf
        L9:
            r0.a(r3)
            r2.m()
        Lf:
            return
    }

    public void m() {
            r7 = this;
            master.flame.danmaku.danmaku.model.g r0 = r7.f
            r1 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto La
        L8:
            long r3 = r0.c
        La:
            master.flame.danmaku.danmaku.model.g r0 = r7.g
            if (r0 != 0) goto L10
            r5 = r1
            goto L12
        L10:
            long r5 = r0.c
        L12:
            master.flame.danmaku.danmaku.model.g r0 = r7.h
            if (r0 != 0) goto L17
            goto L19
        L17:
            long r1 = r0.c
        L19:
            long r3 = java.lang.Math.max(r3, r5)
            r7.e = r3
            long r0 = java.lang.Math.max(r3, r1)
            r7.e = r0
            r2 = 3800(0xed8, double:1.8774E-320)
            long r0 = java.lang.Math.max(r2, r0)
            r7.e = r0
            long r2 = r7.d
            long r0 = java.lang.Math.max(r2, r0)
            r7.e = r0
            return
    }

    public boolean p(float r7, float r8, float r9) {
            r6 = this;
            int r0 = r6.a
            int r1 = (int) r7
            if (r0 != r1) goto L13
            int r0 = r6.b
            int r2 = (int) r8
            if (r0 != r2) goto L13
            float r0 = r6.c
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L11
            goto L13
        L11:
            r7 = 0
            return r7
        L13:
            float r7 = r7 * r9
            r0 = 1143635968(0x442a8000, float:682.0)
            float r7 = r7 / r0
            r0 = 1164804096(0x456d8000, float:3800.0)
            float r7 = r7 * r0
            long r2 = (long) r7
            r6.d = r2
            r4 = 9000(0x2328, double:4.4466E-320)
            long r2 = java.lang.Math.min(r4, r2)
            r6.d = r2
            r4 = 4000(0xfa0, double:1.9763E-320)
            long r2 = java.lang.Math.max(r4, r2)
            r6.d = r2
            r6.a = r1
            int r7 = (int) r8
            r6.b = r7
            r6.c = r9
            r7 = 1
            return r7
    }
}
