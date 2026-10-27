package rx.plugins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class b {
    protected static final java.lang.String a = ".errorRendering";

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public void a(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    public final java.lang.String b(java.lang.Object r2) {
            r1 = this;
            java.lang.String r2 = r1.c(r2)     // Catch: java.lang.Throwable -> L5 java.lang.InterruptedException -> La
            return r2
        L5:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            goto L11
        La:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = ".errorRendering"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    protected java.lang.String c(java.lang.Object r1) throws java.lang.InterruptedException {
            r0 = this;
            r1 = 0
            return r1
    }
}
