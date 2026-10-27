package com.kwad.library.solder.lib.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a {
    protected java.io.File aqK;
    protected java.lang.String aqL;
    protected java.lang.String aqM;
    private boolean aqN;
    private final byte[] aqO;
    private final java.lang.String aqP;
    protected com.kwad.library.solder.lib.c.b aqQ;
    protected com.kwad.library.solder.lib.ext.c aqp;
    protected java.lang.String mVersion;

    public a(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            byte[] r1 = new byte[r0]
            r2.aqO = r1
            r2.aqN = r0
            r2.aqP = r3
            r2.aqL = r3
            com.kwad.library.solder.lib.i r3 = com.kwad.library.solder.lib.i.zS()
            com.kwad.library.solder.lib.ext.c r3 = r3.zM()
            r2.aqp = r3
            return
    }

    private void zW() {
            r2 = this;
            boolean r0 = r2.aqN
            if (r0 == 0) goto L5
            return
        L5:
            byte[] r0 = r2.aqO
            monitor-enter(r0)
            r1 = 1
            r2.aqN = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public final com.kwad.library.solder.lib.a.a a(@androidx.annotation.NonNull com.kwad.library.solder.lib.c.b r1) {
            r0 = this;
            r0.aqQ = r1
            return r0
    }

    public final void bS(java.lang.String r1) {
            r0 = this;
            r0.mVersion = r1
            return
    }

    public final void bT(java.lang.String r1) {
            r0 = this;
            r0.aqM = r1
            return
    }

    public final void bU(java.lang.String r1) {
            r0 = this;
            r0.aqL = r1
            return
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.aqM
            return r0
    }

    public final java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.mVersion
            return r0
    }

    protected abstract void i(android.content.Context r1, java.lang.String r2);

    public final boolean isLoaded() {
            r2 = this;
            boolean r0 = r2.aqN
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            byte[] r0 = r2.aqO
            monitor-enter(r0)
            boolean r1 = r2.aqN     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public final void n(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.i(r1, r2)
            r0.zW()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Plugin{, ApkPath = '"
            r0.<init>(r1)
            java.lang.String r1 = r2.aqP
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String zX() {
            r1 = this;
            java.lang.String r0 = r1.aqP
            return r0
    }

    public final java.lang.String zY() {
            r1 = this;
            com.kwad.library.solder.lib.c.b r0 = r1.aqQ
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.arA
            return r0
        L7:
            r0 = 0
            return r0
    }
}
