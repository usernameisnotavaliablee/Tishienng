package p1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private final java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d> a;
    private final long b;

    public b(java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d> r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.b = r0
            return
    }

    public java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d> a() {
            r1 = this;
            java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d> r0 = r1.a
            return r0
    }

    public boolean b() {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.b
            long r0 = r0 - r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }
}
