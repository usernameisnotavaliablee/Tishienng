package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class xt implements com.ss.android.socialbase.downloader.r.x {
    private boolean j;

    public xt() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.x
    public void j(java.util.List<java.lang.String> r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L9
            goto Lc
        L9:
            r1 = 1
            r0.j = r1
        Lc:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.x
    public boolean j() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }
}
