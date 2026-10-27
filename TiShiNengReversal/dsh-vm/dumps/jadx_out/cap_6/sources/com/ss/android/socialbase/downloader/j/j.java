package com.ss.android.socialbase.downloader.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private volatile boolean ae;
    private final java.util.List<com.ss.android.socialbase.downloader.j.j.InterfaceC0008j> cw;
    private android.app.Application j;
    private volatile int m;
    private int r;
    private final android.app.Application.ActivityLifecycleCallbacks tl;
    private java.lang.ref.WeakReference<android.app.Activity> up;
    private com.ss.android.socialbase.downloader.j.j.cw xt;


    public interface cw {
    }

    /* renamed from: com.ss.android.socialbase.downloader.j.j$j, reason: collision with other inner class name */
    public interface InterfaceC0008j {
        @androidx.annotation.MainThread
        void cw();

        @androidx.annotation.MainThread
        void xt();
    }

    private static class xt {
        private static final com.ss.android.socialbase.downloader.j.j j = null;

        static {
                com.ss.android.socialbase.downloader.j.j r0 = new com.ss.android.socialbase.downloader.j.j
                r1 = 0
                r0.<init>(r1)
                com.ss.android.socialbase.downloader.j.j.xt.j = r0
                return
        }

        public xt() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.socialbase.downloader.j.j j() {
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.xt.j
                return r0
        }
    }

    private j() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.cw = r0
            r0 = -1
            r1.m = r0
            r0 = 0
            r1.ae = r0
            com.ss.android.socialbase.downloader.j.j$1 r0 = new com.ss.android.socialbase.downloader.j.j$1
            r0.<init>(r1)
            r1.tl = r0
            return
    }

    /* synthetic */ j(com.ss.android.socialbase.downloader.j.j.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean ae() {
            r3 = this;
            r0 = 0
            android.app.Application r1 = r3.j     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L6
            return r0
        L6:
            java.lang.String r2 = "activity"
            r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = com.ss.android.socialbase.downloader.az.m.r(r1)     // Catch: java.lang.Throwable -> L18
            boolean r0 = android.text.TextUtils.equals(r2, r1)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }

    static /* synthetic */ void cw(com.ss.android.socialbase.downloader.j.j r0) {
            r0.m()
            return
    }

    static /* synthetic */ int j(com.ss.android.socialbase.downloader.j.j r0) {
            int r0 = r0.r
            return r0
    }

    static /* synthetic */ int j(com.ss.android.socialbase.downloader.j.j r0, int r1) {
            r0.r = r1
            return r1
    }

    public static com.ss.android.socialbase.downloader.j.j j() {
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.xt.j()
            return r0
    }

    static /* synthetic */ java.lang.ref.WeakReference j(com.ss.android.socialbase.downloader.j.j r0, java.lang.ref.WeakReference r1) {
            r0.up = r1
            return r1
    }

    static /* synthetic */ boolean j(com.ss.android.socialbase.downloader.j.j r0, boolean r1) {
            r0.ae = r1
            return r1
    }

    private void m() {
            r4 = this;
            r0 = 0
            r4.m = r0
            java.lang.Object[] r1 = r4.r()
            if (r1 == 0) goto L16
            int r2 = r1.length
        La:
            if (r0 >= r2) goto L16
            r3 = r1[r0]
            com.ss.android.socialbase.downloader.j.j$j r3 = (com.ss.android.socialbase.downloader.j.j.InterfaceC0008j) r3
            r3.cw()
            int r0 = r0 + 1
            goto La
        L16:
            return
    }

    private java.lang.Object[] r() {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r0 = r2.cw
            monitor-enter(r0)
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r1 = r2.cw     // Catch: java.lang.Throwable -> L12
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L12
            if (r1 <= 0) goto L14
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r1 = r2.cw     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r1 = r1.toArray()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r1 = move-exception
            goto L17
        L14:
            r1 = 0
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    private void up() {
            r4 = this;
            r0 = 1
            r4.m = r0
            java.lang.Object[] r0 = r4.r()
            if (r0 == 0) goto L17
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            com.ss.android.socialbase.downloader.j.j$j r3 = (com.ss.android.socialbase.downloader.j.j.InterfaceC0008j) r3
            r3.xt()
            int r2 = r2 + 1
            goto Lb
        L17:
            return
    }

    static /* synthetic */ void xt(com.ss.android.socialbase.downloader.j.j r0) {
            r0.up()
            return
    }

    public boolean cw() {
            r1 = this;
            boolean r0 = r1.xt()
            if (r0 == 0) goto Lc
            boolean r0 = r1.ae
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void j(android.content.Context r2) {
            r1 = this;
            android.app.Application r0 = r1.j
            if (r0 != 0) goto L1d
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L1d
            monitor-enter(r1)
            android.app.Application r0 = r1.j     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L17
            r1.j = r2     // Catch: java.lang.Throwable -> L17
            android.app.Application$ActivityLifecycleCallbacks r0 = r1.tl     // Catch: java.lang.Throwable -> L17
            r2.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
        L1d:
            return
    }

    public void j(com.ss.android.socialbase.downloader.j.j.cw r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void j(com.ss.android.socialbase.downloader.j.j.InterfaceC0008j r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r0 = r2.cw
            monitor-enter(r0)
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r1 = r2.cw     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r1 = r2.cw     // Catch: java.lang.Throwable -> L14
            r1.add(r3)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public void xt(com.ss.android.socialbase.downloader.j.j.InterfaceC0008j r3) {
            r2 = this;
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r0 = r2.cw
            monitor-enter(r0)
            java.util.List<com.ss.android.socialbase.downloader.j.j$j> r1 = r2.cw     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public boolean xt() {
            r2 = this;
            int r0 = r2.m
            r1 = -1
            if (r0 != r1) goto Lb
            boolean r0 = r2.ae()
            r2.m = r0
        Lb:
            r1 = 1
            if (r0 != r1) goto Lf
            return r1
        Lf:
            r0 = 0
            return r0
    }
}
