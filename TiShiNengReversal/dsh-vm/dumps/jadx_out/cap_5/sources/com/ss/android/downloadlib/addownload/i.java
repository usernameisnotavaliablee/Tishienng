package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i {
    private volatile com.ss.android.socialbase.downloader.ae.cw a;
    private volatile com.ss.android.socialbase.downloader.ae.cw b;
    private volatile com.ss.android.socialbase.downloader.ae.cw c;
    private volatile com.ss.android.socialbase.downloader.ae.cw d;
    private volatile boolean e;
    private volatile boolean f;
    private volatile boolean g;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.addownload.i a;

        a(com.ss.android.downloadlib.addownload.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.ss.android.downloadlib.addownload.i r0 = r4.a     // Catch: java.lang.Exception -> L6
                com.ss.android.downloadlib.addownload.i.c(r0)     // Catch: java.lang.Exception -> L6
                return
            L6:
                r0 = move-exception
                com.ss.android.downloadlib.up.a r1 = com.ss.android.downloadlib.up.a.a()
                r2 = 0
                java.lang.String r3 = "读取sp出错"
                r1.e(r2, r0, r3)
                return
        }
    }

    private static class b {
        private static com.ss.android.downloadlib.addownload.i a;

        static {
                com.ss.android.downloadlib.addownload.i r0 = new com.ss.android.downloadlib.addownload.i
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.i.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.i a() {
                com.ss.android.downloadlib.addownload.i r0 = com.ss.android.downloadlib.addownload.i.b.a
                return r0
        }
    }

    private i() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.b = r0
            r2.c = r0
            r2.d = r0
            r0 = 0
            r2.e = r0
            r2.f = r0
            r2.g = r0
            com.ss.android.downloadlib.e r0 = com.ss.android.downloadlib.e.c()
            com.ss.android.downloadlib.addownload.i$a r1 = new com.ss.android.downloadlib.addownload.i$a
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    /* synthetic */ i(com.ss.android.downloadlib.addownload.i.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a() {
            r5 = this;
            boolean r0 = r5.e
            if (r0 == 0) goto L5
            goto L13
        L5:
            long r0 = r5.g()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L14
        L13:
            return
        L14:
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.String r2 = "sp_download_retain"
            r3 = 0
            android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.ats.cw.j(r1, r2, r3)
            java.lang.String r2 = "unfinished_pushed_update_time"
            java.lang.String r3 = "0"
            java.lang.String r2 = r1.getString(r2, r3)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L49
            java.lang.String r2 = "unfinished_pushed_id"
            java.lang.String r2 = r1.getString(r2, r3)
            if (r2 == 0) goto L36
            goto L37
        L36:
            r2 = r3
        L37:
            int r2 = java.lang.Integer.parseInt(r2)
            android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.tl(r2)
            r5.a = r2
        L49:
            java.lang.String r2 = "uninstalled_pushed_update_time"
            java.lang.String r2 = r1.getString(r2, r3)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L71
            java.lang.String r2 = "uninstalled_pushed_id"
            java.lang.String r2 = r1.getString(r2, r3)
            if (r2 == 0) goto L5e
            goto L5f
        L5e:
            r2 = r3
        L5f:
            int r2 = java.lang.Integer.parseInt(r2)
            android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.tl(r2)
            r5.b = r2
        L71:
            java.lang.String r2 = "unfinished_pop_up_update_time"
            java.lang.String r2 = r1.getString(r2, r3)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L99
            java.lang.String r2 = "unfinished_pop_up_id"
            java.lang.String r2 = r1.getString(r2, r3)
            if (r2 == 0) goto L86
            goto L87
        L86:
            r2 = r3
        L87:
            int r2 = java.lang.Integer.parseInt(r2)
            android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
            com.ss.android.socialbase.downloader.ae.cw r2 = r4.tl(r2)
            r5.c = r2
        L99:
            java.lang.String r2 = "uninstalled_pop_up_update_time"
            java.lang.String r2 = r1.getString(r2, r3)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "uninstalled_pop_up_id"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 == 0) goto Lae
            r3 = r0
        Lae:
            int r0 = java.lang.Integer.parseInt(r3)
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.socialbase.downloader.downloader.ae r1 = com.ss.android.socialbase.downloader.downloader.ae.xt(r1)
            com.ss.android.socialbase.downloader.ae.cw r0 = r1.tl(r0)
            r5.d = r0
        Lc0:
            r0 = 1
            r5.e = r0
            return
    }

    public static com.ss.android.downloadlib.addownload.i b() {
            com.ss.android.downloadlib.addownload.i r0 = com.ss.android.downloadlib.addownload.i.b.a()
            return r0
    }

    static /* synthetic */ void c(com.ss.android.downloadlib.addownload.i r0) {
            r0.a()
            return
    }

    private boolean e(com.ss.android.socialbase.downloader.ae.cw r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r3.i()
            r1 = -2
            if (r3 != r1) goto Ld
            r3 = 1
            return r3
        Ld:
            return r0
    }

    private boolean f(com.ss.android.socialbase.downloader.ae.cw r2, com.ss.android.j.j.cw.b r3) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto Le
            if (r3 != 0) goto L6
            goto Le
        L6:
            boolean r2 = com.ss.android.downloadlib.a.h.z(r3)
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            return r0
    }

    public void d(com.ss.android.j.j.cw.b r4, com.ss.android.socialbase.downloader.ae.cw r5) {
            r3 = this;
            boolean r0 = r3.e(r5)
            if (r0 == 0) goto L23
            v2.o r0 = com.ss.android.downloadlib.addownload.m.e()
            if (r0 == 0) goto L23
            v2.o r0 = com.ss.android.downloadlib.addownload.m.e()
            boolean r5 = r0.j(r4, r5)
            if (r5 == 0) goto L23
            com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "download_unfinished_push_retain"
            long r1 = r4.r()
            r5.k(r0, r1)
        L23:
            return
    }

    public long g() {
            r3 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r1 = 12
            r0.set(r1, r2)
            r1 = 13
            r0.set(r1, r2)
            r1 = 14
            r0.set(r1, r2)
            long r0 = r0.getTimeInMillis()
            return r0
    }

    public void h(com.ss.android.j.j.cw.b r4, com.ss.android.socialbase.downloader.ae.cw r5) {
            r3 = this;
            boolean r0 = r3.f(r5, r4)
            if (r0 == 0) goto L23
            v2.o r0 = com.ss.android.downloadlib.addownload.m.e()
            if (r0 == 0) goto L23
            v2.o r0 = com.ss.android.downloadlib.addownload.m.e()
            boolean r5 = r0.xt(r4, r5)
            if (r5 == 0) goto L23
            com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "download_uninstalled_push_retain"
            long r1 = r4.r()
            r5.k(r0, r1)
        L23:
            return
    }
}
