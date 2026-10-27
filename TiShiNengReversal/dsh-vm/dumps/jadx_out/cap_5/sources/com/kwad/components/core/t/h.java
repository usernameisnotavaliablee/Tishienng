package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h {
    private long Ek;
    private boolean QC;
    private long YL;
    private long YM;
    private com.kwad.components.core.t.h.a YN;

    @androidx.annotation.Nullable
    private android.os.Handler YO;
    private java.lang.Runnable YP;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onProgress(long r1, long r3);
    }

    public h(long r3) {
            r2 = this;
            r2.<init>()
            r0 = 100
            r2.YL = r0
            r0 = 0
            r2.YM = r0
            r0 = 0
            r2.QC = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.YO = r0
            com.kwad.components.core.t.h$1 r0 = new com.kwad.components.core.t.h$1
            r0.<init>(r2)
            r2.YP = r0
            r2.Ek = r3
            return
    }

    static /* synthetic */ android.os.Handler a(com.kwad.components.core.t.h r0) {
            android.os.Handler r0 = r0.YO
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.t.h r0) {
            boolean r0 = r0.QC
            return r0
    }

    static /* synthetic */ long c(com.kwad.components.core.t.h r2) {
            long r0 = r2.YL
            return r0
    }

    public final void a(com.kwad.components.core.t.h.a r1) {
            r0 = this;
            r0.YN = r1
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

    public final void start() {
            r2 = this;
            android.os.Handler r0 = r2.YO
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Runnable r1 = r2.YP
            r0.post(r1)
            return
    }

    public final void stop() {
            r2 = this;
            android.os.Handler r0 = r2.YO
            if (r0 == 0) goto Lc
            java.lang.Runnable r1 = r2.YP
            r0.removeCallbacks(r1)
            r0 = 0
            r2.YO = r0
        Lc:
            return
    }

    protected final void td() {
            r5 = this;
            com.kwad.components.core.t.h$a r0 = r5.YN
            if (r0 == 0) goto L16
            long r1 = r5.Ek
            long r3 = r5.YM
            long r3 = r1 - r3
            r0.onProgress(r3, r1)
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L16
            r5.stop()
        L16:
            long r0 = r5.YM
            long r2 = r5.YL
            long r0 = r0 + r2
            r5.YM = r0
            return
    }
}
