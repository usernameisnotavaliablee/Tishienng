package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class cw implements com.ss.android.socialbase.downloader.r.a {
    private static final java.lang.String j = "cw";

    static {
            return
    }

    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void cw(com.ss.android.socialbase.downloader.ae.cw r6) {
            r5 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L3d
            if (r6 == 0) goto L3d
            long r0 = r6.ka()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3d
            long r0 = r6.uq()
            float r0 = (float) r0
            long r1 = r6.ka()
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            java.lang.String r1 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.String r6 = r6.tl()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r0
            java.lang.String r6 = "onProgress %s %.2f%%"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            com.ss.android.socialbase.downloader.m.j.xt(r1, r6)
        L3d:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void cw(com.ss.android.socialbase.downloader.ae.cw r4, com.ss.android.socialbase.downloader.up.j r5) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L29
            if (r4 == 0) goto L29
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.String r4 = r4.tl()
            if (r5 == 0) goto L15
            java.lang.String r5 = r5.xt()
            goto L17
        L15:
            java.lang.String r5 = "unkown"
        L17:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "onRetryDelay on %s because of : %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L29:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void g(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onFirstSuccess -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void j(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onPrepare -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void j(com.ss.android.socialbase.downloader.ae.cw r4, com.ss.android.socialbase.downloader.up.j r5) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L29
            if (r4 == 0) goto L29
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.String r4 = r4.tl()
            if (r5 == 0) goto L15
            java.lang.String r5 = r5.xt()
            goto L17
        L15:
            java.lang.String r5 = "unkown"
        L17:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "onFailed on %s because of : %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L29:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void m(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onCanceled -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    public void oq(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onIntercept -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void r(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onPause -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void tl(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onFirstStart -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void up(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L2b
            if (r4 == 0) goto L2b
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onSuccessed -- "
            r1.<init>(r2)
            java.lang.String r2 = r4.tl()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            boolean r4 = r4.t()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L2b:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void xt(com.ss.android.socialbase.downloader.ae.cw r4) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " onStart -- "
            r1.<init>(r2)
            java.lang.String r4 = r4.tl()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L1f:
            return
    }

    @Override // com.ss.android.socialbase.downloader.r.a
    public void xt(com.ss.android.socialbase.downloader.ae.cw r4, com.ss.android.socialbase.downloader.up.j r5) {
            r3 = this;
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L29
            if (r4 == 0) goto L29
            java.lang.String r0 = com.ss.android.socialbase.downloader.r.cw.j
            java.lang.String r4 = r4.tl()
            if (r5 == 0) goto L15
            java.lang.String r5 = r5.xt()
            goto L17
        L15:
            java.lang.String r5 = "unkown"
        L17:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "onRetry on %s because of : %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            com.ss.android.socialbase.downloader.m.j.xt(r0, r4)
        L29:
            return
    }
}
