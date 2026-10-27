package com.kwad.library.solder.lib.a;

import com.kwad.library.solder.lib.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class e<P extends com.kwad.library.solder.lib.a.a> {
    private final byte[] aqO;
    protected int aqR;
    protected int aqS;
    protected java.lang.StringBuffer aqT;
    protected java.lang.String aqU;
    protected java.lang.String aqV;
    protected boolean aqW;
    protected P aqX;
    protected com.kwad.library.solder.lib.ext.b aqY;
    protected java.lang.Throwable aqZ;
    protected java.lang.String aqj;
    protected com.kwad.library.solder.lib.a.d aqz;
    protected java.lang.String ara;
    protected boolean arb;
    protected long arc;
    protected java.lang.String ard;
    protected java.util.List<com.kwad.library.solder.lib.c.a> are;
    protected com.kwad.library.solder.lib.c.b arf;
    protected java.lang.String mDownloadUrl;
    protected int mState;
    protected java.lang.String mVersion;

    public e(com.kwad.library.solder.lib.c.b r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mState = r0
            r1 = 0
            r2.aqR = r1
            byte[] r1 = new byte[r1]
            r2.aqO = r1
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            r2.aqT = r1
            r2.arf = r3
            java.lang.String r0 = r3.arx
            r2.aqj = r0
            java.lang.String r0 = r3.version
            r2.mVersion = r0
            java.lang.String r0 = r3.arA
            r2.ard = r0
            boolean r0 = r3.arb
            r2.arb = r0
            java.lang.String r0 = r3.ara
            r2.ara = r0
            long r0 = r3.arz
            r2.arc = r0
            java.lang.String r3 = r3.ary
            r2.mDownloadUrl = r3
            return
    }

    private java.util.List<com.kwad.library.solder.lib.c.a> b(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L80
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L13
            goto L80
        L13:
            com.kwad.library.solder.lib.a.d r1 = r6.aqz
            com.kwad.library.solder.lib.a.b r1 = r1.zP()
            java.lang.String r1 = r1.bO(r7)
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L29
            goto L80
        L29:
            java.lang.String[] r1 = r2.list()
            if (r1 == 0) goto L80
            int r2 = r1.length
            if (r2 != 0) goto L33
            goto L80
        L33:
            int r2 = r1.length
            r3 = 0
        L35:
            if (r3 >= r2) goto L7d
            r4 = r1[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L71
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L71
            boolean r5 = r8.equals(r4)
            if (r5 == 0) goto L71
            com.kwad.library.solder.lib.a.d r5 = r6.aqz
            com.kwad.library.solder.lib.a.b r5 = r5.zP()
            boolean r5 = r5.a(r7, r4, r9)
            if (r5 == 0) goto L67
            com.kwad.library.solder.lib.c.a r5 = new com.kwad.library.solder.lib.c.a
            r5.<init>()
            r5.arx = r7
            r5.version = r4
            r4 = 1
            r5.tq = r4
            r0.add(r5)
            goto L7a
        L67:
            com.kwad.library.solder.lib.a.d r5 = r6.aqz
            com.kwad.library.solder.lib.a.b r5 = r5.zP()
            r5.E(r7, r4)
            goto L7a
        L71:
            com.kwad.library.solder.lib.a.d r5 = r6.aqz
            com.kwad.library.solder.lib.a.b r5 = r5.zP()
            r5.E(r7, r4)
        L7a:
            int r3 = r3 + 1
            goto L35
        L7d:
            java.util.Collections.sort(r0)
        L80:
            return r0
    }

    public final java.lang.String Aa() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.aqT
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.Throwable Ab() {
            r1 = this;
            java.lang.Throwable r0 = r1.aqZ
            return r0
    }

    public final boolean Ac() {
            r3 = this;
            r0 = -1
            r3.ch(r0)
            r0 = 0
            r3.are = r0
            int r0 = r3.aqR
            r1 = 1
            int r0 = r0 + r1
            r3.aqR = r0
            int r2 = r3.aqS
            if (r0 > r2) goto L12
            return r1
        L12:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.String Ad() {
            r1 = this;
            java.lang.String r0 = r1.aqj
            return r0
    }

    public final boolean Ae() {
            r1 = this;
            boolean r0 = r1.aqW
            return r0
    }

    public final int Af() {
            r1 = this;
            int r0 = r1.aqR
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.String Ag() {
            r1 = this;
            java.lang.String r0 = r1.aqU
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.aqU
            return r0
        Lb:
            java.lang.String r0 = r1.aqV
            return r0
    }

    @androidx.annotation.Nullable
    public final com.kwad.library.solder.lib.ext.b Ah() {
            r1 = this;
            com.kwad.library.solder.lib.ext.b r0 = r1.aqY
            return r0
    }

    public final boolean Ai() {
            r1 = this;
            boolean r0 = r1.arb
            return r0
    }

    public final java.lang.String Aj() {
            r1 = this;
            java.lang.String r0 = r1.ara
            return r0
    }

    public final java.lang.String Ak() {
            r1 = this;
            java.lang.String r0 = r1.ard
            return r0
    }

    public final com.kwad.library.solder.lib.c.b Al() {
            r1 = this;
            com.kwad.library.solder.lib.c.b r0 = r1.arf
            return r0
    }

    public final java.util.List<com.kwad.library.solder.lib.c.a> Am() {
            r3 = this;
            java.lang.String r0 = r3.Ad()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1c
            java.util.List<com.kwad.library.solder.lib.c.a> r1 = r3.are
            if (r1 != 0) goto L1c
            java.lang.String r1 = r3.getVersion()
            java.lang.String r2 = r3.Ak()
            java.util.List r0 = r3.b(r0, r1, r2)
            r3.are = r0
        L1c:
            java.util.List<com.kwad.library.solder.lib.c.a> r0 = r3.are
            return r0
    }

    public final com.kwad.library.solder.lib.a.e a(com.kwad.library.solder.lib.a.d r1) {
            r0 = this;
            r0.aqz = r1
            return r0
    }

    public final void a(com.kwad.library.solder.lib.ext.b r1) {
            r0 = this;
            r0.aqY = r1
            return
    }

    public final void bS(java.lang.String r1) {
            r0 = this;
            r0.mVersion = r1
            return
    }

    public final com.kwad.library.solder.lib.a.e bV(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L10
            java.lang.StringBuffer r0 = r2.aqT
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r3)
        L10:
            return r2
    }

    public final void bW(java.lang.String r1) {
            r0 = this;
            r0.aqU = r1
            return
    }

    public final void bX(java.lang.String r1) {
            r0 = this;
            r0.aqV = r1
            return
    }

    public abstract P bY(java.lang.String r1);

    public final void c(P r1) {
            r0 = this;
            r0.aqX = r1
            return
    }

    public final void cancel() {
            r2 = this;
            byte[] r0 = r2.aqO
            monitor-enter(r0)
            r1 = 0
            r2.ch(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final com.kwad.library.solder.lib.a.e ch(int r2) {
            r1 = this;
            byte[] r0 = r1.aqO
            monitor-enter(r0)
            r1.mState = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.kwad.library.solder.lib.a.e r2 = r1.bV(r2)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public final void ci(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.aqS = r1
        L4:
            return
    }

    @androidx.annotation.Nullable
    public final java.lang.String getDownloadUrl() {
            r1 = this;
            java.lang.String r0 = r1.mDownloadUrl
            return r0
    }

    public final int getState() {
            r2 = this;
            byte[] r0 = r2.aqO
            monitor-enter(r0)
            int r1 = r2.mState     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.mVersion
            return r0
    }

    public final boolean isCanceled() {
            r1 = this;
            int r0 = r1.mState
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final com.kwad.library.solder.lib.a.e j(@androidx.annotation.NonNull java.lang.Throwable r1) {
            r0 = this;
            r0.aqZ = r1
            java.lang.String r1 = r1.getLocalizedMessage()
            com.kwad.library.solder.lib.a.e r1 = r0.bV(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginRequest{mId='"
            r0.<init>(r1)
            java.lang.String r1 = r2.aqj
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.kwad.library.solder.lib.a.d zZ() {
            r1 = this;
            com.kwad.library.solder.lib.a.d r0 = r1.aqz
            return r0
    }
}
