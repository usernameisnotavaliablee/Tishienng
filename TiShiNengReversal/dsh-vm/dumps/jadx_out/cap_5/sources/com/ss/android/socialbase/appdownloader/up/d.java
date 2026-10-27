package com.ss.android.socialbase.appdownloader.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends com.ss.android.socialbase.downloader.r.up {
    private android.content.Context a;
    private int b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private com.ss.android.socialbase.downloader.notification.j g;

    public d(android.content.Context r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            goto L16
        L10:
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r0.a = r1
        L16:
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public d(com.ss.android.socialbase.downloader.notification.j r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r1.a = r0
            r1.g = r2
            return
    }

    public void cw(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            boolean r0 = r2.qe()
            if (r0 == 0) goto L9
            goto Lc
        L9:
            super.cw(r2)
        Lc:
            return
    }

    public com.ss.android.socialbase.downloader.notification.j j() {
            r8 = this;
            com.ss.android.socialbase.downloader.notification.j r0 = r8.g
            if (r0 != 0) goto L18
            android.content.Context r2 = r8.a
            if (r2 == 0) goto L18
            com.ss.android.socialbase.appdownloader.up.b r1 = new com.ss.android.socialbase.appdownloader.up.b
            int r3 = r8.b
            java.lang.String r4 = r8.c
            java.lang.String r5 = r8.d
            java.lang.String r6 = r8.e
            java.lang.String r7 = r8.f
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L18:
            return r0
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            boolean r0 = r2.qe()
            if (r0 == 0) goto L9
            goto Lc
        L9:
            super.j(r2)
        Lc:
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r2, com.ss.android.socialbase.downloader.up.j r3) {
            r1 = this;
            if (r2 == 0) goto L16
            android.content.Context r0 = r1.a
            if (r0 == 0) goto L16
            boolean r0 = r2.oy()
            if (r0 == 0) goto L16
            boolean r0 = r2.qe()
            if (r0 == 0) goto L13
            goto L16
        L13:
            super.j(r2, r3)
        L16:
            return
    }

    public void r(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            boolean r0 = r2.qe()
            if (r0 == 0) goto L9
            goto Lc
        L9:
            super.r(r2)
        Lc:
            return
    }

    public void up(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 == 0) goto L25
            android.content.Context r0 = r1.a
            if (r0 != 0) goto L7
            goto L25
        L7:
            boolean r0 = r2.oy()
            if (r0 == 0) goto L1c
            boolean r0 = r2.qe()
            if (r0 == 0) goto L19
            boolean r0 = r2.px()
            if (r0 != 0) goto L1c
        L19:
            super.up(r2)
        L1c:
            boolean r0 = r2.px()
            if (r0 == 0) goto L25
            com.ss.android.socialbase.appdownloader.m.f.a(r2)
        L25:
            return
    }

    public void xt(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            boolean r0 = r2.qe()
            if (r0 == 0) goto L9
            goto Lc
        L9:
            super.xt(r2)
        Lc:
            return
    }
}
