package com.ss.android.downloadlib.addownload.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static final java.lang.String e = "b";
    private static com.ss.android.downloadlib.addownload.j.b f;

    @androidx.annotation.NonNull
    private java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o.e> a;
    private boolean b;
    private java.lang.String c;
    private com.ss.android.downloadlib.addownload.j.e d;

    class a implements com.ss.android.j.j.up.a.c {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.ss.android.downloadlib.addownload.o.e c;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.b.InterfaceC0203b d;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.b e;

        a(com.ss.android.downloadlib.addownload.j.b r1, com.ss.android.xt.j.xt.b r2, android.content.Context r3, com.ss.android.downloadlib.addownload.o.e r4, com.ss.android.downloadlib.addownload.j.b.InterfaceC0203b r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void cw(android.content.DialogInterface r2) {
                r1 = this;
                com.ss.android.downloadlib.addownload.j.b r2 = r1.e
                java.lang.String r0 = ""
                r2.j(r0)
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void j(android.content.DialogInterface r4) {
                r3 = this;
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "backdialog_install"
                com.ss.android.xt.j.xt.b r2 = r3.a
                r0.w(r1, r2)
                android.content.Context r0 = r3.b
                com.ss.android.downloadlib.addownload.o$e r1 = r3.c
                long r1 = r1.a
                int r2 = (int) r1
                com.ss.android.socialbase.appdownloader.f.F(r0, r2)
                r4.dismiss()
                return
        }

        @Override // com.ss.android.j.j.up.a.c
        public void xt(android.content.DialogInterface r4) {
                r3 = this;
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "backdialog_exit"
                com.ss.android.xt.j.xt.b r2 = r3.a
                r0.w(r1, r2)
                com.ss.android.downloadlib.addownload.j.b$b r0 = r3.d
                if (r0 == 0) goto L12
                r0.j()
            L12:
                com.ss.android.downloadlib.addownload.j.b r0 = r3.e
                java.lang.String r1 = ""
                r0.j(r1)
                r4.dismiss()
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.j.b$b, reason: collision with other inner class name */
    public interface InterfaceC0203b {
        void j();
    }

    static {
            return
    }

    private b() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.b = r0
            com.ss.android.downloadlib.addownload.j.e r0 = new com.ss.android.downloadlib.addownload.j.e
            r0.<init>()
            r3.d = r0
            java.lang.String r1 = "sp_ad_install_back_dialog"
            java.lang.String r2 = "key_uninstalled_list"
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.a(r1, r2)
            r3.a = r0
            return
    }

    public static com.ss.android.downloadlib.addownload.j.b a() {
            com.ss.android.downloadlib.addownload.j.b r0 = com.ss.android.downloadlib.addownload.j.b.f
            if (r0 != 0) goto Lb
            com.ss.android.downloadlib.addownload.j.b r0 = new com.ss.android.downloadlib.addownload.j.b
            r0.<init>()
            com.ss.android.downloadlib.addownload.j.b.f = r0
        Lb:
            com.ss.android.downloadlib.addownload.j.b r0 = com.ss.android.downloadlib.addownload.j.b.f
            return r0
    }

    private void d(android.content.Context r11, com.ss.android.downloadlib.addownload.o.e r12, com.ss.android.downloadlib.addownload.j.b.InterfaceC0203b r13, boolean r14) {
            r10 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            long r1 = r12.b
            com.ss.android.xt.j.xt.b r5 = r0.q(r1)
            if (r5 != 0) goto L16
            com.ss.android.downloadlib.up.a r11 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r12 = "showBackInstallDialog nativeModel null"
            r11.c(r12)
            return
        L16:
            v2.w r0 = com.ss.android.downloadlib.addownload.m.d()
            com.ss.android.j.j.up.a$b r1 = new com.ss.android.j.j.up.a$b
            r1.<init>(r11)
            if (r14 == 0) goto L24
            java.lang.String r2 = "应用安装确认"
            goto L26
        L24:
            java.lang.String r2 = "退出确认"
        L26:
            com.ss.android.j.j.up.a$b r1 = r1.h(r2)
            java.lang.String r2 = r12.e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L35
            java.lang.String r2 = "刚刚下载的应用"
            goto L37
        L35:
            java.lang.String r2 = r12.e
        L37:
            r9 = 1
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "%1$s下载完成，是否立即安装？"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            com.ss.android.j.j.up.a$b r1 = r1.p(r2)
            java.lang.String r2 = "立即安装"
            com.ss.android.j.j.up.a$b r1 = r1.b(r2)
            if (r14 == 0) goto L52
            java.lang.String r14 = "暂不安装"
            goto L72
        L52:
            android.content.res.Resources r14 = r11.getResources()
            android.content.Context r2 = r11.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.labelRes
            java.lang.String r14 = r14.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r4] = r14
            java.lang.String r14 = "退出%1$s"
            java.lang.String r14 = java.lang.String.format(r14, r2)
        L72:
            com.ss.android.j.j.up.a$b r14 = r1.l(r14)
            com.ss.android.j.j.up.a$b r14 = r14.i(r4)
            java.lang.String r1 = r12.g
            android.graphics.drawable.Drawable r1 = com.ss.android.downloadlib.a.h.l(r11, r1)
            com.ss.android.j.j.up.a$b r14 = r14.f(r1)
            com.ss.android.downloadlib.addownload.j.b$a r3 = new com.ss.android.downloadlib.addownload.j.b$a
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            com.ss.android.j.j.up.a$b r11 = r14.g(r3)
            com.ss.android.j.j.up.a$b r11 = r11.e(r9)
            com.ss.android.j.j.up.a r11 = r11.j()
            r0.xt(r11)
            com.ss.android.downloadlib.r.b r11 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r12 = "backdialog_show"
            r11.w(r12, r5)
            java.lang.String r11 = r7.d
            r4.c = r11
            return
    }

    private boolean g(android.app.Activity r19, com.ss.android.socialbase.downloader.ae.cw r20, boolean r21, com.ss.android.downloadlib.addownload.j.b.InterfaceC0203b r22) {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            r3 = r22
            r4 = 0
            if (r20 != 0) goto L17
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r5 = r1.a     // Catch: java.lang.Exception -> L14
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Exception -> L14
            if (r5 == 0) goto L17
            return r4
        L14:
            r0 = move-exception
            goto Lce
        L17:
            if (r0 == 0) goto Ld1
            boolean r5 = r0.isFinishing()     // Catch: java.lang.Exception -> L14
            if (r5 == 0) goto L21
            goto Ld1
        L21:
            r5 = 1
            if (r20 == 0) goto L4c
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r6 = r1.a     // Catch: java.lang.Exception -> L14
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L14
            if (r6 == 0) goto L4c
            com.ss.android.downloadlib.addownload.o$e r7 = new com.ss.android.downloadlib.addownload.o$e     // Catch: java.lang.Exception -> L14
            int r6 = r20.ae()     // Catch: java.lang.Exception -> L14
            long r8 = (long) r6     // Catch: java.lang.Exception -> L14
            java.lang.String r14 = r20.la()     // Catch: java.lang.Exception -> L14
            java.lang.String r15 = r20.g()     // Catch: java.lang.Exception -> L14
            java.lang.String r17 = r20.ws()     // Catch: java.lang.Exception -> L14
            r10 = 0
            r12 = 0
            r16 = 0
            r7.<init>(r8, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L14
            r1.e(r0, r7, r2, r3)     // Catch: java.lang.Exception -> L14
            return r5
        L4c:
            if (r20 == 0) goto L5c
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L14
            java.lang.String r7 = r20.ws()     // Catch: java.lang.Exception -> L14
            r6.<init>(r7)     // Catch: java.lang.Exception -> L14
            long r6 = r6.lastModified()     // Catch: java.lang.Exception -> L14
            goto L5e
        L5c:
            r6 = 0
        L5e:
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r8 = r1.a     // Catch: java.lang.Exception -> L14
            int r9 = r8.size()     // Catch: java.lang.Exception -> L14
            java.util.ListIterator r8 = r8.listIterator(r9)     // Catch: java.lang.Exception -> L14
        L68:
            boolean r9 = r8.hasPrevious()     // Catch: java.lang.Exception -> L14
            if (r9 == 0) goto Lbc
            java.lang.Object r9 = r8.previous()     // Catch: java.lang.Exception -> L14
            com.ss.android.downloadlib.addownload.o$e r9 = (com.ss.android.downloadlib.addownload.o.e) r9     // Catch: java.lang.Exception -> L14
            if (r9 == 0) goto L68
            android.content.Context r10 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Exception -> L14
            java.lang.String r11 = r9.d     // Catch: java.lang.Exception -> L14
            boolean r10 = com.ss.android.downloadlib.a.h.G(r10, r11)     // Catch: java.lang.Exception -> L14
            if (r10 != 0) goto L68
            java.lang.String r10 = r9.g     // Catch: java.lang.Exception -> L14
            boolean r10 = com.ss.android.downloadlib.a.h.A(r10)     // Catch: java.lang.Exception -> L14
            if (r10 == 0) goto L68
            java.io.File r8 = new java.io.File     // Catch: java.lang.Exception -> L14
            java.lang.String r10 = r9.g     // Catch: java.lang.Exception -> L14
            r8.<init>(r10)     // Catch: java.lang.Exception -> L14
            long r10 = r8.lastModified()     // Catch: java.lang.Exception -> L14
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 < 0) goto L9d
            r1.e(r0, r9, r2, r3)     // Catch: java.lang.Exception -> L14
            goto Lbd
        L9d:
            com.ss.android.downloadlib.addownload.o$e r6 = new com.ss.android.downloadlib.addownload.o$e     // Catch: java.lang.Exception -> L14
            int r7 = r20.ae()     // Catch: java.lang.Exception -> L14
            long r7 = (long) r7     // Catch: java.lang.Exception -> L14
            java.lang.String r13 = r20.la()     // Catch: java.lang.Exception -> L14
            java.lang.String r14 = r20.g()     // Catch: java.lang.Exception -> L14
            java.lang.String r16 = r20.ws()     // Catch: java.lang.Exception -> L14
            r9 = 0
            r11 = 0
            r15 = 0
            r6.<init>(r7, r9, r11, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L14
            r1.e(r0, r6, r2, r3)     // Catch: java.lang.Exception -> L14
            goto Lbd
        Lbc:
            r5 = 0
        Lbd:
            java.lang.String r0 = com.ss.android.downloadlib.addownload.j.b.e     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = "tryShowInstallDialog isShow:"
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Exception -> L14
            r3 = 0
            com.ss.android.downloadlib.a.k.d(r0, r2, r3)     // Catch: java.lang.Exception -> L14
            return r5
        Lce:
            com.bytedance.sdk.component.utils.vl.j(r0)
        Ld1:
            return r4
    }

    public com.ss.android.socialbase.downloader.ae.cw b(android.content.Context r14) {
            r13 = this;
            r0 = 0
            com.ss.android.downloadlib.g r1 = com.ss.android.downloadlib.g.c(r14)     // Catch: java.lang.Exception -> L8e
            long r1 = r1.s()     // Catch: java.lang.Exception -> L8e
            org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.m.f()     // Catch: java.lang.Exception -> L8e
            java.lang.String r4 = "enable_miniapp_dialog"
            r5 = 0
            int r3 = r3.optInt(r4, r5)     // Catch: java.lang.Exception -> L8e
            if (r3 != 0) goto L17
            return r0
        L17:
            com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r14)     // Catch: java.lang.Exception -> L8e
            java.lang.String r4 = "application/vnd.android.package-archive"
            java.util.List r3 = r3.xt(r4)     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto L90
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L8e
            if (r4 == 0) goto L2b
            goto L90
        L2b:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L8e
            r4 = 0
            r6 = r4
        L32:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Exception -> L8e
            if (r8 == 0) goto L94
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Exception -> L8e
            com.ss.android.socialbase.downloader.ae.cw r8 = (com.ss.android.socialbase.downloader.ae.cw) r8     // Catch: java.lang.Exception -> L8e
            if (r8 == 0) goto L32
            java.lang.String r9 = r8.la()     // Catch: java.lang.Exception -> L8e
            boolean r9 = com.ss.android.downloadlib.a.h.G(r14, r9)     // Catch: java.lang.Exception -> L8e
            if (r9 != 0) goto L32
            java.lang.String r9 = r8.ws()     // Catch: java.lang.Exception -> L8e
            boolean r9 = com.ss.android.downloadlib.a.h.A(r9)     // Catch: java.lang.Exception -> L8e
            if (r9 == 0) goto L32
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L8e
            java.lang.String r10 = r8.ws()     // Catch: java.lang.Exception -> L8e
            r9.<init>(r10)     // Catch: java.lang.Exception -> L8e
            long r9 = r9.lastModified()     // Catch: java.lang.Exception -> L8e
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 < 0) goto L32
            java.lang.String r11 = r8.h()     // Catch: java.lang.Exception -> L8e
            if (r11 == 0) goto L32
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> L89
            java.lang.String r12 = r8.h()     // Catch: java.lang.Exception -> L89
            r11.<init>(r12)     // Catch: java.lang.Exception -> L89
            java.lang.String r12 = "isMiniApp"
            boolean r11 = r11.has(r12)     // Catch: java.lang.Exception -> L89
            if (r11 != 0) goto L7d
            goto L32
        L7d:
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 != 0) goto L84
        L81:
            r0 = r8
            r6 = r9
            goto L32
        L84:
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 <= 0) goto L32
            goto L81
        L89:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)     // Catch: java.lang.Exception -> L8e
            goto L32
        L8e:
            r14 = move-exception
            goto L91
        L90:
            return r0
        L91:
            com.bytedance.sdk.component.utils.vl.j(r14)
        L94:
            return r0
    }

    public void c(long r17, long r19, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
            r16 = this;
            r0 = r16
            r1 = 0
        L3:
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r2 = r0.a
            int r2 = r2.size()
            java.lang.String r3 = "key_uninstalled_list"
            java.lang.String r4 = "sp_ad_install_back_dialog"
            if (r1 >= r2) goto L42
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r2 = r0.a
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.downloadlib.addownload.o$e r2 = (com.ss.android.downloadlib.addownload.o.e) r2
            if (r2 == 0) goto L3f
            long r5 = r2.b
            int r2 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r2 != 0) goto L3f
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r2 = r0.a
            com.ss.android.downloadlib.addownload.o$e r5 = new com.ss.android.downloadlib.addownload.o$e
            r6 = r17
            r8 = r19
            r10 = r21
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r5.<init>(r6, r8, r10, r12, r13, r14, r15)
            r2.set(r1, r5)
            com.ss.android.downloadlib.addownload.j.e r1 = r0.d
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r2 = r0.a
            r1.b(r4, r3, r2)
            return
        L3f:
            int r1 = r1 + 1
            goto L3
        L42:
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r1 = r0.a
            com.ss.android.downloadlib.addownload.o$e r5 = new com.ss.android.downloadlib.addownload.o$e
            r6 = r17
            r8 = r19
            r10 = r21
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r5.<init>(r6, r8, r10, r12, r13, r14, r15)
            r1.add(r5)
            com.ss.android.downloadlib.addownload.j.e r1 = r0.d
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r2 = r0.a
            r1.b(r4, r3, r2)
            return
    }

    public void e(android.content.Context r2, com.ss.android.downloadlib.addownload.o.e r3, boolean r4, com.ss.android.downloadlib.addownload.j.b.InterfaceC0203b r5) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.o$e> r0 = r1.a
            r0.clear()
            r1.d(r2, r3, r5, r4)
            r3 = 1
            r1.b = r3
            com.ss.android.downloadlib.g r2 = com.ss.android.downloadlib.g.c(r2)
            r2.b()
            com.ss.android.downloadlib.addownload.j.e r2 = r1.d
            java.lang.String r3 = "sp_ad_install_back_dialog"
            java.lang.String r4 = "key_uninstalled_list"
            r2.c(r3, r4)
            java.lang.String r2 = com.ss.android.downloadlib.addownload.j.b.e
            java.lang.String r3 = "tryShowInstallDialog isShow:true"
            r4 = 0
            com.ss.android.downloadlib.a.k.d(r2, r3, r4)
            return
    }

    public void f(com.ss.android.xt.j.xt.b r4) {
            r3 = this;
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "enable_open_app_dialog"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            r1 = 1
            if (r0 == r1) goto Lf
            goto L27
        Lf:
            boolean r0 = r4.U0()
            if (r0 != 0) goto L27
            boolean r0 = r4.i()
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 >= r2) goto L27
            r4.o0(r1)
            com.ss.android.downloadlib.activity.TTDelegateActivity.h(r4)
        L27:
            return
    }

    @androidx.annotation.MainThread
    public boolean h(android.app.Activity r3, boolean r4, com.ss.android.downloadlib.addownload.j.b.InterfaceC0203b r5) {
            r2 = this;
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "disable_install_app_dialog"
            int r0 = r0.optInt(r1)
            r1 = 1
            if (r0 == r1) goto L1b
            boolean r0 = r2.b
            if (r0 == 0) goto L12
            goto L1b
        L12:
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.b(r3)
            boolean r3 = r2.g(r3, r0, r4, r5)
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public boolean i(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.c
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
    }

    public void j(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto Lb
            r2.c = r1
            return
        Lb:
            java.lang.String r0 = r2.c
            boolean r3 = android.text.TextUtils.equals(r0, r3)
            if (r3 == 0) goto L15
            r2.c = r1
        L15:
            return
    }
}
