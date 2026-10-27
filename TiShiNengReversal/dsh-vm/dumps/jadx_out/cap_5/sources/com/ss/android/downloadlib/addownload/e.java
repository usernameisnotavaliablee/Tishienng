package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e implements com.ss.android.downloadlib.a.p.InterfaceC0196a {
    private static final java.lang.String c = "e";
    private static com.ss.android.downloadlib.addownload.e d;
    private com.ss.android.downloadlib.a.p a;
    private long b;

    static {
            return
    }

    private e() {
            r2 = this;
            r2.<init>()
            com.ss.android.downloadlib.a$p r0 = new com.ss.android.downloadlib.a$p
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.a = r0
            return
    }

    public static com.ss.android.downloadlib.addownload.e a() {
            com.ss.android.downloadlib.addownload.e r0 = com.ss.android.downloadlib.addownload.e.d
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.addownload.e> r0 = com.ss.android.downloadlib.addownload.e.class
            monitor-enter(r0)
            com.ss.android.downloadlib.addownload.e r1 = com.ss.android.downloadlib.addownload.e.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.addownload.e r1 = new com.ss.android.downloadlib.addownload.e     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.addownload.e.d = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.addownload.e r0 = com.ss.android.downloadlib.addownload.e.d
            return r0
    }

    private void b(com.ss.android.downloadlib.addownload.o.e r6, int r7) {
            r5 = this;
            v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
            if (r0 != 0) goto L7
            goto L14
        L7:
            v2.y r0 = com.ss.android.downloadlib.addownload.m.G()
            boolean r0 = r0.j()
            if (r0 == 0) goto L12
            goto L14
        L12:
            if (r6 != 0) goto L15
        L14:
            return
        L15:
            r0 = 2
            if (r0 != r7) goto L67
            com.ss.android.downloadlib.addownload.o$f r7 = com.ss.android.downloadlib.addownload.o.f.c()
            long r0 = r6.b
            com.ss.android.xt.j.xt.b r7 = r7.q(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ttdownloader_type"
            java.lang.String r2 = "miui_silent_install"
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L4a
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = r6.d     // Catch: java.lang.Exception -> L4a
            boolean r1 = com.ss.android.downloadlib.a.h.G(r1, r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "ttdownloader_message"
            if (r1 == 0) goto L43
            java.lang.String r1 = "miui_silent_install_succeed"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L4a
            r1 = 4
            goto L4b
        L43:
            java.lang.String r1 = "miui_silent_install_failed: has started service"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L4a
            r1 = 5
            goto L4b
        L4a:
            r1 = -1
        L4b:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r3 = r0.toString()
            r2.<init>(r1, r3)
            w2.e r3 = com.ss.android.downloadlib.addownload.m.x()
            r4 = 0
            r3.j(r4, r2, r1)
            com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "embeded_ad"
            java.lang.String r3 = "ah_result"
            r1.p(r2, r3, r0, r7)
        L67:
            android.content.Context r7 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.String r0 = r6.d
            boolean r7 = com.ss.android.downloadlib.a.h.G(r7, r0)
            if (r7 == 0) goto L7f
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "delayinstall_installed"
            long r1 = r6.b
            r7.v(r0, r1)
            return
        L7f:
            java.lang.String r7 = r6.g
            boolean r7 = com.ss.android.downloadlib.a.h.A(r7)
            if (r7 != 0) goto L93
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "delayinstall_file_lost"
            long r1 = r6.b
            r7.v(r0, r1)
            return
        L93:
            com.ss.android.downloadlib.addownload.j.b r7 = com.ss.android.downloadlib.addownload.j.b.a()
            java.lang.String r0 = r6.d
            boolean r7 = r7.i(r0)
            if (r7 == 0) goto Lab
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "delayinstall_conflict_with_back_dialog"
            long r1 = r6.b
            r7.v(r0, r1)
            return
        Lab:
            com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r0 = "delayinstall_install_start"
            long r1 = r6.b
            r7.v(r0, r1)
            android.content.Context r7 = com.ss.android.downloadlib.addownload.m.getContext()
            long r0 = r6.a
            int r6 = (int) r0
            com.ss.android.socialbase.appdownloader.f.F(r7, r6)
            return
    }

    public void c(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r12, long r13, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r11 = this;
            com.ss.android.downloadlib.addownload.o$e r0 = new com.ss.android.downloadlib.addownload.o$e
            int r1 = r12.ae()
            long r1 = (long) r1
            r3 = r13
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r3, r5, r7, r8, r9, r10)
            int r13 = r12.ae()
            com.ss.android.socialbase.downloader.jy.j r13 = com.ss.android.socialbase.downloader.jy.j.j(r13)
            java.lang.String r14 = "back_miui_silent_install"
            r1 = 1
            int r14 = r13.j(r14, r1)
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 != 0) goto La7
            boolean r14 = com.ss.android.socialbase.appdownloader.m.e.j()
            if (r14 != 0) goto L33
            boolean r14 = com.ss.android.socialbase.appdownloader.m.e.u()
            if (r14 == 0) goto La7
        L33:
            android.content.Context r14 = com.ss.android.downloadlib.addownload.m.getContext()
            java.lang.String r2 = "com.miui.securitycore"
            java.lang.String r3 = "com.miui.enterprise.service.EntInstallService"
            boolean r14 = com.ss.android.socialbase.downloader.az.oq.j(r14, r2, r3)
            if (r14 == 0) goto La7
            java.util.concurrent.ConcurrentHashMap r12 = r12.vm()
            java.lang.String r14 = "extra_silent_install_succeed"
            java.lang.Object r12 = r12.get(r14)
            r14 = 0
            boolean r12 = com.ss.android.socialbase.downloader.az.m.j(r12, r14)
            if (r12 == 0) goto L6b
            com.ss.android.downloadlib.a$p r12 = r11.a
            android.os.Message r12 = r12.obtainMessage(r1, r0)
            r14 = 2
            r12.arg1 = r14
            java.lang.String r14 = "check_silent_install_interval"
            r0 = 60000(0xea60, float:8.4078E-41)
            int r13 = r13.j(r14, r0)
            com.ss.android.downloadlib.a$p r14 = r11.a
            long r0 = (long) r13
            r14.sendMessageDelayed(r12, r0)
            return
        L6b:
            com.ss.android.downloadlib.addownload.o$f r12 = com.ss.android.downloadlib.addownload.o.f.c()
            long r13 = r0.b
            com.ss.android.xt.j.xt.b r12 = r12.q(r13)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = "ttdownloader_type"
            java.lang.String r2 = "miui_silent_install"
            r13.put(r14, r2)     // Catch: java.lang.Exception -> L8a
            java.lang.String r14 = "ttdownloader_message"
            java.lang.String r2 = "miui_silent_install_failed: has not started service"
            r13.put(r14, r2)     // Catch: java.lang.Exception -> L8a
            r14 = 5
            goto L8b
        L8a:
            r14 = -1
        L8b:
            com.ss.android.socialbase.downloader.up.j r2 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r3 = r13.toString()
            r2.<init>(r14, r3)
            w2.e r3 = com.ss.android.downloadlib.addownload.m.x()
            r4 = 0
            r3.j(r4, r2, r14)
            com.ss.android.downloadlib.r.b r14 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r2 = "embeded_ad"
            java.lang.String r3 = "ah_result"
            r14.p(r2, r3, r13, r12)
        La7:
            boolean r12 = com.ss.android.downloadlib.a.n.e()
            if (r12 != 0) goto Lae
            return
        Lae:
            long r12 = java.lang.System.currentTimeMillis()
            long r2 = r11.b
            long r12 = r12 - r2
            long r2 = com.ss.android.downloadlib.a.n.p()
            long r4 = com.ss.android.downloadlib.a.n.s()
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lcf
            long r4 = com.ss.android.downloadlib.a.n.s()
            long r4 = r4 - r12
            long r2 = r2 + r4
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 + r4
            r11.b = r12
            goto Ld5
        Lcf:
            long r12 = java.lang.System.currentTimeMillis()
            r11.b = r12
        Ld5:
            com.ss.android.downloadlib.a$p r12 = r11.a
            android.os.Message r13 = r12.obtainMessage(r1, r0)
            r12.sendMessageDelayed(r13, r2)
            return
    }

    @Override // com.ss.android.downloadlib.a.p.InterfaceC0196a
    public void j(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L7
            return
        L7:
            java.lang.Object r0 = r3.obj
            com.ss.android.downloadlib.addownload.o$e r0 = (com.ss.android.downloadlib.addownload.o.e) r0
            int r3 = r3.arg1
            r2.b(r0, r3)
            return
    }
}
