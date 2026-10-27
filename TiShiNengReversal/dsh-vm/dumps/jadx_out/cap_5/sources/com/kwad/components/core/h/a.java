package com.kwad.components.core.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements java.lang.Runnable {
    private long QB;
    private boolean QC;
    private long QD;
    private com.kwad.components.core.h.a.InterfaceC0074a QE;

    @androidx.annotation.Nullable
    private volatile android.os.Handler iK;
    private float mSpeed;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0074a {
        void D(long r1);
    }

    public a(android.os.Handler r3) {
            r2 = this;
            r2.<init>()
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.QB = r0
            r0 = 1
            r2.QC = r0
            r0 = 0
            r2.QD = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.mSpeed = r0
            r2.iK = r3
            return
    }

    public final void a(com.kwad.components.core.h.a.InterfaceC0074a r1) {
            r0 = this;
            r0.QE = r1
            return
    }

    public final void destroy() {
            r1 = this;
            r1.stop()
            r0 = 0
            r1.iK = r0
            return
    }

    public final void pause() {
            r1 = this;
            r0 = 1
            r1.QC = r0
            return
    }

    public final void resume() {
            r1 = this;
            r0 = 0
            r1.QC = r0
            return
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
            r4 = this;
            monitor-enter(r4)
            android.os.Handler r0 = r4.iK     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L2c
            boolean r0 = r4.QC     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            com.kwad.components.core.h.a$a r0 = r4.QE     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            long r1 = r4.QD     // Catch: java.lang.Throwable -> L1a
            r0.D(r1)     // Catch: java.lang.Throwable -> L1a
            long r0 = r4.QD     // Catch: java.lang.Throwable -> L1a
            long r2 = r4.QB     // Catch: java.lang.Throwable -> L1a
            long r0 = r0 + r2
            r4.QD = r0     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L2e
        L1c:
            android.os.Handler r0 = r4.iK     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L2c
            android.os.Handler r0 = r4.iK     // Catch: java.lang.Throwable -> L1a
            long r1 = r4.QB     // Catch: java.lang.Throwable -> L1a
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L1a
            float r2 = r4.mSpeed     // Catch: java.lang.Throwable -> L1a
            float r1 = r1 / r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L1a
            r0.postDelayed(r4, r1)     // Catch: java.lang.Throwable -> L1a
        L2c:
            monitor-exit(r4)
            return
        L2e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public final void setSpeed(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7
            r1.mSpeed = r2
        L7:
            return
    }

    public final void start() {
            r1 = this;
            r0 = 0
            r1.QC = r0
            android.os.Handler r0 = r1.iK
            if (r0 == 0) goto Lc
            android.os.Handler r0 = r1.iK
            r0.post(r1)
        Lc:
            return
    }

    public final void stop() {
            r1 = this;
            android.os.Handler r0 = r1.iK
            if (r0 == 0) goto L9
            android.os.Handler r0 = r1.iK
            r0.removeCallbacks(r1)
        L9:
            return
    }
}
