package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.framework.filedownloader.f.c.d {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.framework.filedownloader.f.c.d
    public final int f(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            int r1 = r0.g(r1, r2, r3)
            return r1
    }

    @Override // com.kwad.framework.filedownloader.f.c.d
    public final int g(java.lang.String r4, java.lang.String r5, boolean r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            r2 = 2
            if (r6 == 0) goto L21
            java.lang.String r6 = "%sp%s@dir"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L36
            r2[r1] = r4     // Catch: java.lang.Throwable -> L36
            r2[r0] = r5     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = com.kwad.framework.filedownloader.f.f.c(r6, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = com.kwad.framework.filedownloader.f.f.md5(r5)     // Catch: java.lang.Throwable -> L36
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L36
            return r4
        L21:
            java.lang.String r6 = "%sp%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L36
            r2[r1] = r4     // Catch: java.lang.Throwable -> L36
            r2[r0] = r5     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = com.kwad.framework.filedownloader.f.f.c(r6, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = com.kwad.framework.filedownloader.f.f.md5(r5)     // Catch: java.lang.Throwable -> L36
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L36
            return r4
        L36:
            int r4 = r4.hashCode()
            return r4
    }
}
