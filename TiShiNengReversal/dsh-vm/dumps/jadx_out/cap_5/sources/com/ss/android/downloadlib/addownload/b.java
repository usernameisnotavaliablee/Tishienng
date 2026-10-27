package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static com.ss.android.downloadlib.addownload.j.c a;
    private static com.ss.android.downloadlib.addownload.j.a b;

    static class a implements com.ss.android.downloadlib.addownload.j.c {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.ss.android.xt.j.xt.b c;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.o d;

        a(int r1, boolean r2, com.ss.android.xt.j.xt.b r3, com.ss.android.downloadlib.addownload.j.o r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.c
        public void j() {
                r3 = this;
                r0 = 0
                com.ss.android.downloadlib.addownload.b.c(r0)
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                int r1 = r3.a
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r1)
                if (r0 == 0) goto L39
                r0.xq()
                com.ss.android.socialbase.downloader.impls.w r1 = com.ss.android.socialbase.downloader.impls.w.j()
                r1.j(r0)
                boolean r0 = r3.b
                if (r0 == 0) goto L2e
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "cancel_pause_reserve_wifi_confirm"
                com.ss.android.xt.j.xt.b r2 = r3.c
                r0.m(r1, r2)
                goto L39
            L2e:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "pause_reserve_wifi_confirm"
                com.ss.android.xt.j.xt.b r2 = r3.c
                r0.w(r1, r2)
            L39:
                com.ss.android.downloadlib.addownload.j$o r0 = r3.d
                com.ss.android.xt.j.xt.b r1 = r3.c
                r0.a(r1)
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.c
        public void xt() {
                r3 = this;
                r0 = 0
                com.ss.android.downloadlib.addownload.b.c(r0)
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                int r1 = r3.a
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r1)
                if (r0 == 0) goto L17
                r0.k()
            L17:
                boolean r0 = r3.b
                if (r0 == 0) goto L27
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "cancel_pause_reserve_wifi_cancel"
                com.ss.android.xt.j.xt.b r2 = r3.c
                r0.m(r1, r2)
                goto L32
            L27:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "pause_reserve_wifi_cancel"
                com.ss.android.xt.j.xt.b r2 = r3.c
                r0.w(r1, r2)
            L32:
                com.ss.android.downloadlib.addownload.j$o r0 = r3.d
                com.ss.android.xt.j.xt.b r1 = r3.c
                r0.a(r1)
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.b$b, reason: collision with other inner class name */
    static class C0198b implements com.ss.android.downloadlib.addownload.j.a {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j.a b;

        C0198b(com.ss.android.xt.j.xt.b r1, com.ss.android.downloadlib.addownload.j.a r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.a
        public void delete() {
                r3 = this;
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r1 = "cancel_pause_reserve_wifi_delete"
                com.ss.android.xt.j.xt.b r2 = r3.a
                r0.m(r1, r2)
                com.ss.android.downloadlib.addownload.j.a r0 = r3.b
                r0.delete()
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.ss.android.downloadlib.addownload.j.c a() {
            com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.b.a
            return r0
    }

    public static void b(com.ss.android.downloadlib.addownload.j.a r0) {
            com.ss.android.downloadlib.addownload.b.b = r0
            return
    }

    public static void c(com.ss.android.downloadlib.addownload.j.c r0) {
            com.ss.android.downloadlib.addownload.b.a = r0
            return
    }

    public static boolean d(int r2) {
            r0 = 1
            if (r2 == r0) goto L19
            r1 = 2
            if (r2 == r1) goto L19
            r1 = 3
            if (r2 == r1) goto L19
            r1 = 4
            if (r2 == r1) goto L19
            r1 = 5
            if (r2 == r1) goto L19
            r1 = 7
            if (r2 == r1) goto L19
            r1 = 8
            if (r2 != r1) goto L17
            goto L19
        L17:
            r2 = 0
            return r2
        L19:
            return r0
    }

    public static boolean e(com.ss.android.xt.j.xt.b r6, com.ss.android.socialbase.downloader.ae.cw r7, int r8, com.ss.android.downloadlib.addownload.j.o r9, boolean r10, com.ss.android.downloadlib.addownload.j.a r11) {
            r0 = 0
            if (r6 != 0) goto Ld
            com.ss.android.downloadlib.up.a r6 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r7 = "tryReverseWifi nativeModel null"
            r6.c(r7)
            return r0
        Ld:
            if (r7 != 0) goto L19
            com.ss.android.downloadlib.up.a r6 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r7 = "tryReverseWifi info null"
            r6.c(r7)
            return r0
        L19:
            int r1 = r7.ae()
            if (r10 == 0) goto L24
            boolean r2 = com.ss.android.downloadlib.a.n.f(r6)
            goto L28
        L24:
            boolean r2 = com.ss.android.downloadlib.a.n.A(r6)
        L28:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "switch_status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L37
            r3.putOpt(r4, r5)     // Catch: java.lang.Exception -> L37
            goto L3b
        L37:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L3b:
            if (r10 == 0) goto L47
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "cancel_pause_reserve_wifi_switch_status"
            r4.r(r5, r3, r6)
            goto L50
        L47:
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "pause_reserve_wifi_switch_status"
            r4.r(r5, r3, r6)
        L50:
            if (r2 != 0) goto L53
            return r0
        L53:
            boolean r8 = d(r8)
            if (r8 != 0) goto L5a
            return r0
        L5a:
            android.content.Context r8 = com.ss.android.downloadlib.addownload.m.getContext()
            boolean r8 = com.ss.android.socialbase.downloader.az.m.xt(r8)
            if (r8 == 0) goto L65
            return r0
        L65:
            if (r10 != 0) goto L6f
            boolean r7 = r7.ya()
            if (r7 != 0) goto L6e
            goto L6f
        L6e:
            return r0
        L6f:
            com.ss.android.downloadlib.addownload.b$a r7 = new com.ss.android.downloadlib.addownload.b$a
            r7.<init>(r1, r10, r6, r9)
            c(r7)
            if (r10 == 0) goto L83
            if (r11 == 0) goto L83
            com.ss.android.downloadlib.addownload.b$b r7 = new com.ss.android.downloadlib.addownload.b$b
            r7.<init>(r6, r11)
            b(r7)
        L83:
            if (r10 == 0) goto L8b
            java.lang.String r7 = "删除"
            com.ss.android.downloadlib.activity.TTDelegateActivity.k(r6, r7)
            goto L8e
        L8b:
            com.ss.android.downloadlib.activity.TTDelegateActivity.v(r6)
        L8e:
            r6 = 1
            return r6
    }

    public static com.ss.android.downloadlib.addownload.j.a f() {
            com.ss.android.downloadlib.addownload.j.a r0 = com.ss.android.downloadlib.addownload.b.b
            return r0
    }
}
