package master.flame.danmaku.danmaku.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class r extends master.flame.danmaku.danmaku.model.d {
    public float W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public long c0;
    public long d0;
    public boolean e0;
    public int f0;
    public int g0;
    public int h0;
    public long i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    private float[] n0;
    public master.flame.danmaku.danmaku.model.r.a[] o0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        master.flame.danmaku.danmaku.model.r.b a;
        master.flame.danmaku.danmaku.model.r.b b;
        public long c;
        public long d;
        public long e;
        float f;
        float g;
        final /* synthetic */ master.flame.danmaku.danmaku.model.r h;

        public a(master.flame.danmaku.danmaku.model.r r1) {
                r0 = this;
                r0.h = r1
                r0.<init>()
                return
        }

        public float[] a() {
                r4 = this;
                master.flame.danmaku.danmaku.model.r$b r0 = r4.a
                float r1 = r0.a
                float r0 = r0.b
                r2 = 2
                float[] r2 = new float[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r0
                return r2
        }

        public float b() {
                r2 = this;
                master.flame.danmaku.danmaku.model.r$b r0 = r2.b
                master.flame.danmaku.danmaku.model.r$b r1 = r2.a
                float r0 = r0.a(r1)
                return r0
        }

        public float[] c() {
                r4 = this;
                master.flame.danmaku.danmaku.model.r$b r0 = r4.b
                float r1 = r0.a
                float r0 = r0.b
                r2 = 2
                float[] r2 = new float[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r0
                return r2
        }

        public void d(master.flame.danmaku.danmaku.model.r.b r3, master.flame.danmaku.danmaku.model.r.b r4) {
                r2 = this;
                r2.a = r3
                r2.b = r4
                float r0 = r4.a
                float r1 = r3.a
                float r0 = r0 - r1
                r2.f = r0
                float r4 = r4.b
                float r3 = r3.b
                float r4 = r4 - r3
                r2.g = r4
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b {
        float a;
        float b;
        final /* synthetic */ master.flame.danmaku.danmaku.model.r c;

        public b(master.flame.danmaku.danmaku.model.r r1, float r2, float r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        public float a(master.flame.danmaku.danmaku.model.r.b r3) {
                r2 = this;
                float r0 = r2.a
                float r1 = r3.a
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                float r1 = r2.b
                float r3 = r3.b
                float r1 = r1 - r3
                float r3 = java.lang.Math.abs(r1)
                float r0 = r0 * r0
                float r3 = r3 * r3
                float r0 = r0 + r3
                double r0 = (double) r0
                double r0 = java.lang.Math.sqrt(r0)
                float r3 = (float) r0
                return r3
        }
    }

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.e0 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r1.n0 = r0
            return
    }

    private static final float H(long r0, long r2) {
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 - r2
            float r1 = r1 * r0
            return r1
    }

    public void I(int r1, int r2, long r3) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            int r2 = r2 - r1
            r0.h0 = r2
            r0.i0 = r3
            int r2 = master.flame.danmaku.danmaku.model.c.a
            if (r1 == r2) goto Lf
            r0.F = r1
        Lf:
            return
    }

    public void J(float[][] r10) {
            r9 = this;
            if (r10 == 0) goto L84
            int r0 = r10.length
            r1 = 0
            r2 = r10[r1]
            r3 = r2[r1]
            r9.W = r3
            r3 = 1
            r2 = r2[r3]
            r9.X = r2
            int r0 = r0 - r3
            r0 = r10[r0]
            r2 = r0[r1]
            r9.Y = r2
            r0 = r0[r3]
            r9.Z = r0
            int r0 = r10.length
            if (r0 <= r3) goto L84
            int r0 = r10.length
            int r0 = r0 - r3
            master.flame.danmaku.danmaku.model.r$a[] r0 = new master.flame.danmaku.danmaku.model.r.a[r0]
            r9.o0 = r0
            r0 = 0
        L24:
            master.flame.danmaku.danmaku.model.r$a[] r2 = r9.o0
            int r4 = r2.length
            if (r0 >= r4) goto L50
            master.flame.danmaku.danmaku.model.r$a r4 = new master.flame.danmaku.danmaku.model.r$a
            r4.<init>(r9)
            r2[r0] = r4
            master.flame.danmaku.danmaku.model.r$a[] r2 = r9.o0
            r2 = r2[r0]
            master.flame.danmaku.danmaku.model.r$b r4 = new master.flame.danmaku.danmaku.model.r$b
            r5 = r10[r0]
            r6 = r5[r1]
            r5 = r5[r3]
            r4.<init>(r9, r6, r5)
            master.flame.danmaku.danmaku.model.r$b r5 = new master.flame.danmaku.danmaku.model.r$b
            int r0 = r0 + 1
            r6 = r10[r0]
            r7 = r6[r1]
            r6 = r6[r3]
            r5.<init>(r9, r7, r6)
            r2.d(r4, r5)
            goto L24
        L50:
            int r10 = r2.length
            r0 = 0
            r3 = 0
        L53:
            if (r3 >= r10) goto L5f
            r4 = r2[r3]
            float r4 = r4.b()
            float r0 = r0 + r4
            int r3 = r3 + 1
            goto L53
        L5f:
            master.flame.danmaku.danmaku.model.r$a[] r10 = r9.o0
            int r2 = r10.length
            r3 = 0
        L63:
            if (r1 >= r2) goto L84
            r4 = r10[r1]
            float r5 = r4.b()
            float r5 = r5 / r0
            long r6 = r9.c0
            float r6 = (float) r6
            float r5 = r5 * r6
            long r5 = (long) r5
            r4.c = r5
            if (r3 != 0) goto L79
            r7 = 0
            goto L7b
        L79:
            long r7 = r3.e
        L7b:
            r4.d = r7
            long r7 = r7 + r5
            r4.e = r7
            int r1 = r1 + 1
            r3 = r4
            goto L63
        L84:
            return
    }

    public void K(float r1, float r2, float r3, float r4, long r5, long r7) {
            r0 = this;
            r0.W = r1
            r0.X = r2
            r0.Y = r3
            r0.Z = r4
            float r3 = r3 - r1
            r0.a0 = r3
            float r4 = r4 - r2
            r0.b0 = r4
            r0.c0 = r5
            r0.d0 = r7
            return
    }

    public void L(float r1) {
            r0 = this;
            return
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float d() {
            r2 = this;
            float[] r0 = r2.n0
            r1 = 3
            r0 = r0[r1]
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float g() {
            r2 = this;
            float[] r0 = r2.n0
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public int getType() {
            r1 = this;
            r0 = 7
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float[] h(master.flame.danmaku.danmaku.model.n r19, long r20) {
            r18 = this;
            r0 = r18
            boolean r1 = r0.q()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            long r3 = r0.b()
            long r3 = r20 - r3
            long r5 = r0.i0
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L31
            int r1 = r0.h0
            if (r1 == 0) goto L31
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L25
            int r1 = r0.g0
            r0.F = r1
            goto L31
        L25:
            float r9 = (float) r3
            float r5 = (float) r5
            float r9 = r9 / r5
            float r1 = (float) r1
            float r1 = r1 * r9
            int r1 = (int) r1
            int r5 = r0.f0
            int r5 = r5 + r1
            r0.F = r5
        L31:
            float r1 = r0.W
            float r5 = r0.X
            long r9 = r0.d0
            long r9 = r3 - r9
            long r11 = r0.c0
            r6 = 0
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 <= 0) goto Lb8
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 < 0) goto Lb8
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto Lb8
            master.flame.danmaku.danmaku.model.r$a[] r7 = r0.o0
            r8 = 0
            if (r7 == 0) goto L94
            int r11 = r7.length
            r12 = 0
        L4f:
            if (r12 >= r11) goto L6f
            r13 = r7[r12]
            long r14 = r13.d
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 < 0) goto L61
            long r14 = r13.e
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 >= 0) goto L61
            r2 = r13
            goto L6f
        L61:
            master.flame.danmaku.danmaku.model.r$b r1 = r13.b
            float r5 = r1.a
            float r1 = r1.b
            int r12 = r12 + 1
            r17 = r5
            r5 = r1
            r1 = r17
            goto L4f
        L6f:
            if (r2 == 0) goto Lc0
            float r7 = r2.f
            float r9 = r2.g
            long r10 = r2.d
            long r3 = r3 - r10
            float r3 = (float) r3
            long r10 = r2.c
            float r4 = (float) r10
            float r3 = r3 / r4
            master.flame.danmaku.danmaku.model.r$b r2 = r2.a
            float r4 = r2.a
            float r2 = r2.b
            int r10 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r10 == 0) goto L8b
            float r7 = r7 * r3
            float r1 = r4 + r7
        L8b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 == 0) goto Lc0
            float r9 = r9 * r3
            float r2 = r2 + r9
            r5 = r2
            goto Lc0
        L94:
            boolean r2 = r0.e0
            if (r2 == 0) goto L9d
            float r2 = H(r9, r11)
            goto La0
        L9d:
            float r2 = (float) r9
            float r3 = (float) r11
            float r2 = r2 / r3
        La0:
            float r3 = r0.a0
            int r4 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r4 == 0) goto Lab
            float r3 = r3 * r2
            float r1 = r0.W
            float r1 = r1 + r3
        Lab:
            float r3 = r0.b0
            int r4 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r4 == 0) goto Lc0
            float r3 = r3 * r2
            float r2 = r0.X
            float r5 = r2 + r3
            goto Lc0
        Lb8:
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto Lc0
            float r1 = r0.Y
            float r5 = r0.Z
        Lc0:
            float[] r2 = r0.n0
            r2[r6] = r1
            r3 = 1
            r2[r3] = r5
            float r4 = r0.p
            float r1 = r1 + r4
            r4 = 2
            r2[r4] = r1
            float r1 = r0.q
            float r5 = r5 + r1
            r1 = 3
            r2[r1] = r5
            boolean r1 = r0.s()
            r1 = r1 ^ r3
            r0.G(r1)
            float[] r1 = r0.n0
            return r1
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float i() {
            r2 = this;
            float[] r0 = r2.n0
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float l() {
            r2 = this;
            float[] r0 = r2.n0
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public void y(master.flame.danmaku.danmaku.model.n r1, float r2, float r3) {
            r0 = this;
            master.flame.danmaku.danmaku.model.f r2 = r0.E
            long r2 = r2.a
            r0.h(r1, r2)
            return
    }
}
