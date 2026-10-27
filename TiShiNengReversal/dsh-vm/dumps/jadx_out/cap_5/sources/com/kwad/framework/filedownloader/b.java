package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.framework.filedownloader.s.a, com.kwad.framework.filedownloader.s.b {
    private long alc;
    private long ald;
    private long ale;
    private int alf;
    private int alg;
    private long mStartTime;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.alg = r0
            return
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void U(long r8) {
            r7 = this;
            int r0 = r7.alg
            if (r0 > 0) goto L5
            goto L25
        L5:
            long r0 = r7.alc
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            goto L35
        Le:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.alc
            long r0 = r0 - r4
            int r4 = r7.alg
            long r4 = (long) r4
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L26
            int r4 = r7.alf
            if (r4 != 0) goto L25
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L25
            goto L26
        L25:
            return
        L26:
            long r2 = r7.ald
            long r2 = r8 - r2
            long r2 = r2 / r0
            int r0 = (int) r2
            r7.alf = r0
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r7.alf = r0
        L35:
            r7.ald = r8
            long r8 = android.os.SystemClock.uptimeMillis()
            r7.alc = r8
            return
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void end(long r7) {
            r6 = this;
            long r0 = r6.mStartTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L9
            return
        L9:
            long r0 = r6.ale
            long r7 = r7 - r0
            r6.alc = r2
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.mStartTime
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1d
            int r8 = (int) r7
            r6.alf = r8
            return
        L1d:
            long r7 = r7 / r0
            int r8 = (int) r7
            r6.alf = r8
            return
    }

    @Override // com.kwad.framework.filedownloader.s.a
    public final int getSpeed() {
            r1 = this;
            int r0 = r1.alf
            return r0
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void reset() {
            r2 = this;
            r0 = 0
            r2.alf = r0
            r0 = 0
            r2.alc = r0
            return
    }

    @Override // com.kwad.framework.filedownloader.s.b
    public final void start(long r3) {
            r2 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.mStartTime = r0
            r2.ale = r3
            return
    }
}
