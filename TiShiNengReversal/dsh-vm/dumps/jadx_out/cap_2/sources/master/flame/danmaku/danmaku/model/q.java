package master.flame.danmaku.danmaku.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class q extends master.flame.danmaku.danmaku.model.d {
    protected static final long c0 = 100;
    protected static final long d0 = 40;
    protected float W;
    protected float X;
    protected int Y;
    protected float[] Z;
    protected float a0;
    protected long b0;

    public q(master.flame.danmaku.danmaku.model.g r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.W = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.X = r0
            r0 = 0
            r1.Z = r0
            r1.r = r2
            return
    }

    protected float H(master.flame.danmaku.danmaku.model.n r4, long r5) {
            r3 = this;
            long r0 = r3.b()
            long r5 = r5 - r0
            master.flame.danmaku.danmaku.model.g r0 = r3.r
            long r0 = r0.c
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L11
            float r4 = r3.p
            float r4 = -r4
            return r4
        L11:
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r5 = (float) r5
            float r6 = r3.a0
            float r5 = r5 * r6
            float r4 = r4 - r5
            return r4
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float d() {
            r2 = this;
            float r0 = r2.X
            float r1 = r2.q
            float r0 = r0 + r1
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float g() {
            r1 = this;
            float r0 = r1.W
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public int getType() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float[] h(master.flame.danmaku.danmaku.model.n r2, long r3) {
            r1 = this;
            boolean r0 = r1.q()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            float r2 = r1.H(r2, r3)
            float[] r3 = r1.Z
            if (r3 != 0) goto L15
            r3 = 4
            float[] r3 = new float[r3]
            r1.Z = r3
        L15:
            float[] r3 = r1.Z
            r4 = 0
            r3[r4] = r2
            float r4 = r1.X
            r0 = 1
            r3[r0] = r4
            float r0 = r1.p
            float r2 = r2 + r0
            r0 = 2
            r3[r0] = r2
            float r2 = r1.q
            float r4 = r4 + r2
            r2 = 3
            r3[r2] = r4
            return r3
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float i() {
            r2 = this;
            float r0 = r2.W
            float r1 = r2.p
            float r0 = r0 + r1
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float l() {
            r1 = this;
            float r0 = r1.X
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public void y(master.flame.danmaku.danmaku.model.n r7, float r8, float r9) {
            r6 = this;
            master.flame.danmaku.danmaku.model.f r8 = r6.E
            if (r8 == 0) goto L31
            long r0 = r8.a
            long r2 = r6.b()
            long r2 = r0 - r2
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L2f
            master.flame.danmaku.danmaku.model.g r8 = r6.r
            long r4 = r8.c
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L2f
            float r7 = r6.H(r7, r0)
            r6.W = r7
            boolean r7 = r6.v()
            if (r7 != 0) goto L2c
            r6.X = r9
            r7 = 1
            r6.G(r7)
        L2c:
            r6.b0 = r0
            return
        L2f:
            r6.b0 = r0
        L31:
            r7 = 0
            r6.G(r7)
            return
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public void z(master.flame.danmaku.danmaku.model.n r3, boolean r4) {
            r2 = this;
            super.z(r3, r4)
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r4 = r2.p
            float r3 = r3 + r4
            int r3 = (int) r3
            r2.Y = r3
            float r3 = (float) r3
            master.flame.danmaku.danmaku.model.g r4 = r2.r
            long r0 = r4.c
            float r4 = (float) r0
            float r3 = r3 / r4
            r2.a0 = r3
            return
    }
}
