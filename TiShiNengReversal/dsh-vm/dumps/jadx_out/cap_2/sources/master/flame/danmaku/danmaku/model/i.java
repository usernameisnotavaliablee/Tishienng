package master.flame.danmaku.danmaku.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class i extends master.flame.danmaku.danmaku.model.d {
    private float W;
    protected float X;
    private float[] Y;
    private float Z;
    private float a0;
    private int b0;

    public i(master.flame.danmaku.danmaku.model.g r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.W = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.X = r0
            r0 = 0
            r1.Y = r0
            r1.r = r2
            return
    }

    protected float H(master.flame.danmaku.danmaku.model.n r3) {
            r2 = this;
            int r0 = r2.b0
            int r1 = r3.getWidth()
            if (r0 != r1) goto L13
            float r0 = r2.a0
            float r1 = r2.p
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            float r3 = r2.Z
            return r3
        L13:
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r1 = r2.p
            float r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r3 = r3.getWidth()
            r2.b0 = r3
            float r3 = r2.p
            r2.a0 = r3
            r2.Z = r0
            return r0
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
            r0 = 5
            return r0
    }

    @Override // master.flame.danmaku.danmaku.model.d
    public float[] h(master.flame.danmaku.danmaku.model.n r2, long r3) {
            r1 = this;
            boolean r3 = r1.q()
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            float r2 = r1.H(r2)
            float[] r3 = r1.Y
            if (r3 != 0) goto L15
            r3 = 4
            float[] r3 = new float[r3]
            r1.Y = r3
        L15:
            float[] r3 = r1.Y
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
    public void y(master.flame.danmaku.danmaku.model.n r5, float r6, float r7) {
            r4 = this;
            master.flame.danmaku.danmaku.model.f r6 = r4.E
            if (r6 == 0) goto L3b
            long r0 = r6.a
            long r2 = r4.b()
            long r0 = r0 - r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L2c
            master.flame.danmaku.danmaku.model.g r6 = r4.r
            long r2 = r6.c
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L2c
            boolean r6 = r4.v()
            if (r6 != 0) goto L3b
            float r5 = r4.H(r5)
            r4.W = r5
            r4.X = r7
            r5 = 1
            r4.G(r5)
            return
        L2c:
            r6 = 0
            r4.G(r6)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.X = r6
            int r5 = r5.getWidth()
            float r5 = (float) r5
            r4.W = r5
        L3b:
            return
    }
}
