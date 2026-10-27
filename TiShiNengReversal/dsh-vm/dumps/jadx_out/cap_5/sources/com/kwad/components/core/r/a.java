package com.kwad.components.core.r;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static volatile com.kwad.components.core.r.a XX;
    private int Uc;
    private int XY;
    private boolean XZ;
    private boolean Ya;
    private int Yb;
    private boolean Yc;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.core.r.a sF() {
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.XX
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.r.a> r0 = com.kwad.components.core.r.a.class
            monitor-enter(r0)
            com.kwad.components.core.r.a r1 = com.kwad.components.core.r.a.XX     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.r.a r1 = new com.kwad.components.core.r.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.r.a.XX = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.XX
            return r0
    }

    public final void aN(boolean r1) {
            r0 = this;
            r1 = 1
            r0.XZ = r1
            return
    }

    public final void aO(boolean r1) {
            r0 = this;
            r0.Ya = r1
            return
    }

    public final void aP(boolean r1) {
            r0 = this;
            r0.Yc = r1
            return
    }

    public final void aW(int r1) {
            r0 = this;
            r0.XY = r1
            return
    }

    public final void aX(int r1) {
            r0 = this;
            r0.Yb = r1
            return
    }

    public final void aY(int r1) {
            r0 = this;
            r0.Uc = r1
            return
    }

    public final void clear() {
            r2 = this;
            r0 = 0
            r2.Ya = r0
            r2.XZ = r0
            r2.Yb = r0
            r2.Yc = r0
            r1 = -1
            r2.XY = r1
            r2.Uc = r0
            return
    }

    public final int sG() {
            r1 = this;
            int r0 = r1.XY
            return r0
    }

    public final boolean sH() {
            r1 = this;
            boolean r0 = r1.XZ
            return r0
    }

    public final boolean sI() {
            r1 = this;
            boolean r0 = r1.Ya
            return r0
    }

    public final boolean sJ() {
            r3 = this;
            int r0 = r3.Yb
            r1 = 1
            if (r0 == r1) goto Lb
            r2 = 3
            if (r0 != r2) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            return r1
    }

    public final int sK() {
            r1 = this;
            int r0 = r1.Yb
            return r0
    }

    public final boolean sL() {
            r1 = this;
            boolean r0 = r1.Yc
            return r0
    }

    public final int sM() {
            r1 = this;
            int r0 = r1.Uc
            return r0
    }
}
