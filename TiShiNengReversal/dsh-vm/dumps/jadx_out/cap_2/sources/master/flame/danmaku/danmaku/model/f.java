package master.flame.danmaku.danmaku.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f {
    public long a;
    private long b;

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public f(long r1) {
            r0 = this;
            r0.<init>()
            r0.update(r1)
            return
    }

    public long a(long r3) {
            r2 = this;
            long r0 = r2.a
            long r0 = r0 + r3
            long r3 = r2.update(r0)
            return r3
    }

    public long b() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public long update(long r3) {
            r2 = this;
            long r0 = r2.a
            long r0 = r3 - r0
            r2.b = r0
            r2.a = r3
            return r0
    }
}
