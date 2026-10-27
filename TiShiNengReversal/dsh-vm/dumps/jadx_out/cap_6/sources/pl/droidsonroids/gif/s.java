package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class s implements java.lang.Runnable {
    final pl.droidsonroids.gif.e a;

    s(pl.droidsonroids.gif.e r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            pl.droidsonroids.gif.e r0 = r3.a     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r0.v()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            r3.a()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            goto Lf
        Le:
            return
        Lf:
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r1 == 0) goto L1c
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.uncaughtException(r2, r0)
        L1c:
            throw r0
    }
}
