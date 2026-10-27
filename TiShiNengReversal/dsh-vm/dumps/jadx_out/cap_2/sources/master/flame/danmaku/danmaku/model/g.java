package master.flame.danmaku.danmaku.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class g {
    private long a;
    private float b;
    public long c;

    public g(long r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.b = r0
            r1.a = r2
            r1.c = r2
            return
    }

    public void a(float r3) {
            r2 = this;
            float r0 = r2.b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L10
            r2.b = r3
            long r0 = r2.a
            float r0 = (float) r0
            float r0 = r0 * r3
            long r0 = (long) r0
            r2.c = r0
        L10:
            return
    }

    public void b(long r1) {
            r0 = this;
            r0.a = r1
            float r1 = (float) r1
            float r2 = r0.b
            float r1 = r1 * r2
            long r1 = (long) r1
            r0.c = r1
            return
    }
}
