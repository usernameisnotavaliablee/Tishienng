package i2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static volatile boolean a;

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void a(android.content.Context r2, java.lang.String r3) {
            java.lang.Class<i2.a> r0 = i2.a.class
            monitor-enter(r0)
            boolean r1 = i2.a.a     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            i2.a.a = r1     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "omesStdSco"
            java.lang.System.loadLibrary(r1)     // Catch: java.lang.Throwable -> L16
            com.oplus.omes.stdsco.auth.AuthClient.a(r2, r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}
