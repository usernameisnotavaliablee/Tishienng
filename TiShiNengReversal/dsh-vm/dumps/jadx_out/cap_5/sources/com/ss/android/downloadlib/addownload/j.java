package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j {
    private android.os.Handler a;
    private com.ss.android.downloadlib.addownload.o.i b;
    private java.util.concurrent.atomic.AtomicBoolean c;
    private java.util.concurrent.atomic.AtomicBoolean d;

    class a implements com.ss.android.downloadlib.addownload.l.InterfaceC0206l {
        final /* synthetic */ int a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ss.android.xt.j.xt.b c;
        final /* synthetic */ long d;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l.k e;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j f;

        a(com.ss.android.downloadlib.addownload.j r1, int r2, java.lang.String r3, com.ss.android.xt.j.xt.b r4, long r5, com.ss.android.downloadlib.addownload.l.k r7) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r7
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.l.InterfaceC0206l
        public void j(long r10) {
                r9 = this;
                com.ss.android.downloadlib.addownload.j r0 = r9.f
                int r1 = r9.a
                java.lang.String r2 = r9.b
                com.ss.android.xt.j.xt.b r5 = r9.c
                long r6 = r9.d
                com.ss.android.downloadlib.addownload.l$k r8 = r9.e
                r3 = r10
                com.ss.android.downloadlib.addownload.j.i(r0, r1, r2, r3, r5, r6, r8)
                return
        }
    }

    class b implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l.k a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j b;

        b(com.ss.android.downloadlib.addownload.j r1, com.ss.android.downloadlib.addownload.l.k r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.ss.android.downloadlib.addownload.j r0 = r2.b
                java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.downloadlib.addownload.j.d(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto Ld
                return
            Ld:
                com.ss.android.downloadlib.addownload.j r0 = r2.b
                java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.downloadlib.addownload.j.d(r0)
                r1 = 1
                r0.set(r1)
                com.ss.android.downloadlib.addownload.l$k r0 = r2.a
                r0.j()
                return
        }
    }

    class c implements com.ss.android.socialbase.downloader.g.qv {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l.InterfaceC0206l a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j b;

        c(com.ss.android.downloadlib.addownload.j r1, com.ss.android.downloadlib.addownload.l.InterfaceC0206l r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void j(java.util.Map<java.lang.String, java.lang.String> r6) {
                r5 = this;
                com.ss.android.downloadlib.addownload.j r0 = r5.b
                java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.downloadlib.addownload.j.d(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto Ld
                return
            Ld:
                com.ss.android.downloadlib.addownload.j r0 = r5.b
                java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.downloadlib.addownload.j.d(r0)
                r1 = 1
                r0.set(r1)
                com.ss.android.downloadlib.addownload.j r0 = r5.b
                long r0 = com.ss.android.downloadlib.addownload.j.b(r0, r6)
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L43
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                java.lang.String r2 = "apk_size"
                java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> L3f
                r6.putOpt(r2, r3)     // Catch: org.json.JSONException -> L3f
                java.lang.String r2 = "available_space"
                long r3 = com.ss.android.downloadlib.addownload.j.a()     // Catch: org.json.JSONException -> L3f
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: org.json.JSONException -> L3f
                r6.putOpt(r2, r3)     // Catch: org.json.JSONException -> L3f
                goto L43
            L3f:
                r6 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r6)
            L43:
                com.ss.android.downloadlib.addownload.l$l r6 = r5.a
                r6.j(r0)
                return
        }
    }

    class d implements com.ss.android.downloadlib.addownload.c.e {
        final /* synthetic */ com.ss.android.xt.j.xt.b a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.l.k b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j d;

        d(com.ss.android.downloadlib.addownload.j r1, com.ss.android.xt.j.xt.b r2, com.ss.android.downloadlib.addownload.l.k r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }
    }

    class e implements java.lang.Runnable {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l.k a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.j b;

        e(com.ss.android.downloadlib.addownload.j r1, com.ss.android.downloadlib.addownload.l.k r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.ss.android.downloadlib.addownload.l$k r0 = r1.a
                r0.j()
                return
        }
    }

    static class f implements com.ss.android.downloadlib.addownload.c.e {
        final /* synthetic */ com.ss.android.socialbase.downloader.ae.cw a;

        f(com.ss.android.socialbase.downloader.ae.cw r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    public interface g {
        boolean a(com.ss.android.xt.j.xt.b r1, int r2, com.ss.android.downloadlib.addownload.j.o r3, com.ss.android.downloadlib.addownload.j.a r4);
    }

    public class h implements com.ss.android.downloadlib.addownload.j.g {
        private static com.ss.android.downloadlib.addownload.j.c a;
        private static com.ss.android.downloadlib.addownload.j.a b;

        class a implements com.ss.android.downloadlib.addownload.j.c {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ int c;
            final /* synthetic */ com.ss.android.xt.j.xt.b d;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.o e;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.h f;

            a(com.ss.android.downloadlib.addownload.j.h r1, int r2, int r3, int r4, com.ss.android.xt.j.xt.b r5, com.ss.android.downloadlib.addownload.j.o r6) {
                    r0 = this;
                    r0.f = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.d = r5
                    r0.e = r6
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void j() {
                    r8 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.h.d(r0)
                    com.ss.android.downloadlib.addownload.j$h r1 = r8.f
                    int r2 = r8.a
                    int r3 = r8.b
                    int r4 = r8.c
                    com.ss.android.xt.j.xt.b r5 = r8.d
                    java.lang.String r6 = "download_percent_cancel"
                    java.lang.String r7 = "confirm"
                    com.ss.android.downloadlib.addownload.j.h.g(r1, r2, r3, r4, r5, r6, r7)
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void xt() {
                    r8 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.h.d(r0)
                    com.ss.android.downloadlib.addownload.j$h r1 = r8.f
                    int r2 = r8.a
                    int r3 = r8.b
                    int r4 = r8.c
                    com.ss.android.xt.j.xt.b r5 = r8.d
                    java.lang.String r6 = "download_percent_cancel"
                    java.lang.String r7 = "cancel"
                    com.ss.android.downloadlib.addownload.j.h.g(r1, r2, r3, r4, r5, r6, r7)
                    com.ss.android.downloadlib.addownload.j$o r0 = r8.e
                    com.ss.android.xt.j.xt.b r1 = r8.d
                    r0.a(r1)
                    return
            }
        }

        class b implements com.ss.android.downloadlib.addownload.j.a {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ int c;
            final /* synthetic */ com.ss.android.xt.j.xt.b d;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.a e;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.h f;

            b(com.ss.android.downloadlib.addownload.j.h r1, int r2, int r3, int r4, com.ss.android.xt.j.xt.b r5, com.ss.android.downloadlib.addownload.j.a r6) {
                    r0 = this;
                    r0.f = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.d = r5
                    r0.e = r6
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.a
            public void delete() {
                    r8 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.h.d(r0)
                    com.ss.android.downloadlib.addownload.j$h r1 = r8.f
                    int r2 = r8.a
                    int r3 = r8.b
                    int r4 = r8.c
                    com.ss.android.xt.j.xt.b r5 = r8.d
                    java.lang.String r6 = "download_percent_cancel"
                    java.lang.String r7 = "delete"
                    com.ss.android.downloadlib.addownload.j.h.g(r1, r2, r3, r4, r5, r6, r7)
                    com.ss.android.downloadlib.addownload.j.a r0 = r8.e
                    r0.delete()
                    return
            }
        }

        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        private int b(int r3) {
                r2 = this;
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "cancel_pause_optimise_download_percent_value"
                r1 = 50
                int r3 = r3.j(r0, r1)
                return r3
        }

        public static com.ss.android.downloadlib.addownload.j.c c() {
                com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.j.h.a
                return r0
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.j.c d(com.ss.android.downloadlib.addownload.j.c r0) {
                com.ss.android.downloadlib.addownload.j.h.a = r0
                return r0
        }

        private void e(int r3, int r4, int r5, com.ss.android.xt.j.xt.b r6, java.lang.String r7, java.lang.String r8) {
                r2 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "pause_optimise_type"
                r0.putOpt(r1, r7)     // Catch: org.json.JSONException -> L2b
                java.lang.String r7 = "pause_optimise_action"
                r0.putOpt(r7, r8)     // Catch: org.json.JSONException -> L2b
                java.lang.String r7 = "download_percent"
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L2b
                r0.putOpt(r7, r3)     // Catch: org.json.JSONException -> L2b
                java.lang.String r3 = "download_current_bytes"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: org.json.JSONException -> L2b
                r0.putOpt(r3, r4)     // Catch: org.json.JSONException -> L2b
                java.lang.String r3 = "download_total_bytes"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L2b
                r0.putOpt(r3, r4)     // Catch: org.json.JSONException -> L2b
                goto L2f
            L2b:
                r3 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r3)
            L2f:
                com.ss.android.downloadlib.r.b r3 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r4 = "pause_cancel_optimise"
                r3.r(r4, r0, r6)
                return
        }

        public static void f(com.ss.android.downloadlib.addownload.j.a r0) {
                com.ss.android.downloadlib.addownload.j.h.b = r0
                return
        }

        static /* synthetic */ void g(com.ss.android.downloadlib.addownload.j.h r0, int r1, int r2, int r3, com.ss.android.xt.j.xt.b r4, java.lang.String r5, java.lang.String r6) {
                r0.e(r1, r2, r3, r4, r5, r6)
                return
        }

        private boolean h(com.ss.android.xt.j.xt.a r4) {
                r3 = this;
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r4)
                java.lang.String r1 = "cancel_pause_optimise_download_percent_retain_switch"
                r2 = 0
                int r0 = r0.j(r1, r2)
                r1 = 1
                if (r0 != r1) goto L15
                boolean r4 = r4.i()
                if (r4 == 0) goto L15
                return r1
            L15:
                return r2
        }

        public static com.ss.android.downloadlib.addownload.j.a i() {
                com.ss.android.downloadlib.addownload.j.a r0 = com.ss.android.downloadlib.addownload.j.h.b
                return r0
        }

        @Override // com.ss.android.downloadlib.addownload.j.g
        public boolean a(com.ss.android.xt.j.xt.b r15, int r16, com.ss.android.downloadlib.addownload.j.o r17, com.ss.android.downloadlib.addownload.j.a r18) {
                r14 = this;
                r7 = 0
                if (r15 != 0) goto L4
                return r7
            L4:
                boolean r0 = r14.h(r15)
                if (r0 != 0) goto Lb
                return r7
            Lb:
                java.lang.String r0 = r15.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r8 = 1
                if (r0 != 0) goto L28
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r15.h()
                r2 = 0
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r1, r2, r8)
                goto L38
            L28:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r15.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r1)
            L38:
                if (r0 != 0) goto L3b
                return r7
            L3b:
                long r9 = r0.uq()
                long r11 = r0.ka()
                r1 = 0
                int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r3 < 0) goto Lc0
                int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r3 <= 0) goto Lc0
                int r0 = r0.ae()
                r1 = 100
                long r1 = r1 * r9
                long r1 = r1 / r11
                int r2 = (int) r1
                int r2 = com.ss.android.downloadlib.addownload.h.a(r0, r2)
                r0 = 1048576(0x100000, double:5.180654E-318)
                long r0 = r9 / r0
                int r3 = (int) r0
                int r0 = r15.mi()
                int r0 = r14.b(r0)
                if (r2 <= r0) goto L6d
                r13 = 1
                goto L6e
            L6d:
                r13 = 0
            L6e:
                com.ss.android.downloadlib.addownload.j$h$a r0 = new com.ss.android.downloadlib.addownload.j$h$a
                r4 = r3
                r1 = r14
                r5 = r15
                r6 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6)
                com.ss.android.downloadlib.addownload.j.h.a = r0
                int r0 = r15.mi()
                long r0 = com.ss.android.downloadlib.addownload.h.b(r0, r9, r11)
                java.lang.String r0 = com.ss.android.downloadlib.a.h.o(r0)
                if (r13 == 0) goto L9c
                long r11 = r11 - r9
                java.lang.String r1 = com.ss.android.downloadlib.a.h.o(r11)
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r7] = r0
                r4[r8] = r1
                java.lang.String r0 = "该任务已下载%s，仅需%s即可下载完成，是否继续？"
                java.lang.String r0 = java.lang.String.format(r0, r4)
            L9a:
                r7 = r0
                goto La7
            L9c:
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r1[r7] = r0
                java.lang.String r0 = "该任务已下载%s，即将下载完成，是否继续下载？"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                goto L9a
            La7:
                if (r18 == 0) goto Lb6
                com.ss.android.downloadlib.addownload.j$h$b r0 = new com.ss.android.downloadlib.addownload.j$h$b
                r4 = r3
                r1 = r14
                r5 = r15
                r6 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6)
                f(r0)
            Lb6:
                java.lang.String r0 = "暂停"
                java.lang.String r1 = "删除"
                java.lang.String r2 = "继续"
                com.ss.android.downloadlib.activity.TTDelegateActivity.x(r15, r7, r2, r0, r1)
                return r8
            Lc0:
                return r7
        }
    }

    public interface i {
        boolean a(com.ss.android.xt.j.xt.b r1, int r2, com.ss.android.downloadlib.addownload.j.o r3);
    }

    /* renamed from: com.ss.android.downloadlib.addownload.j$j, reason: collision with other inner class name */
    public class C0205j implements com.ss.android.downloadlib.addownload.j.i {
        private static com.ss.android.downloadlib.addownload.j.c a;

        /* renamed from: com.ss.android.downloadlib.addownload.j$j$a */
        class a implements com.ss.android.downloadlib.addownload.j.c {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.o b;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.C0205j c;

            a(com.ss.android.downloadlib.addownload.j.C0205j r1, com.ss.android.xt.j.xt.b r2, com.ss.android.downloadlib.addownload.j.o r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void j() {
                    r4 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.C0205j.d(r0)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "pause_optimise_type"
                    java.lang.String r2 = "apk_size"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    java.lang.String r1 = "pause_optimise_action"
                    java.lang.String r2 = "confirm"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    goto L1c
                L18:
                    r1 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r1)
                L1c:
                    com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "pause_optimise"
                    com.ss.android.xt.j.xt.b r3 = r4.a
                    r1.r(r2, r0, r3)
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void xt() {
                    r4 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.C0205j.d(r0)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "pause_optimise_type"
                    java.lang.String r2 = "apk_size"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    java.lang.String r1 = "pause_optimise_action"
                    java.lang.String r2 = "cancel"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    goto L1c
                L18:
                    r1 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r1)
                L1c:
                    com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "pause_optimise"
                    com.ss.android.xt.j.xt.b r3 = r4.a
                    r1.r(r2, r0, r3)
                    com.ss.android.downloadlib.addownload.j$o r0 = r4.b
                    com.ss.android.xt.j.xt.b r1 = r4.a
                    r0.a(r1)
                    return
            }
        }

        public C0205j() {
                r0 = this;
                r0.<init>()
                return
        }

        private int b(int r3) {
                r2 = this;
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "pause_optimise_apk_size"
                r1 = 100
                int r3 = r3.j(r0, r1)
                r0 = 1048576(0x100000, float:1.469368E-39)
                int r3 = r3 * r0
                return r3
        }

        public static com.ss.android.downloadlib.addownload.j.c c() {
                com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.j.C0205j.a
                return r0
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.j.c d(com.ss.android.downloadlib.addownload.j.c r0) {
                com.ss.android.downloadlib.addownload.j.C0205j.a = r0
                return r0
        }

        private boolean e(com.ss.android.xt.j.xt.a r4) {
                r3 = this;
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r4)
                java.lang.String r1 = "pause_optimise_apk_size_switch"
                r2 = 0
                int r0 = r0.j(r1, r2)
                r1 = 1
                if (r0 != r1) goto L15
                boolean r4 = r4.i()
                if (r4 == 0) goto L15
                return r1
            L15:
                return r2
        }

        @Override // com.ss.android.downloadlib.addownload.j.i
        public boolean a(com.ss.android.xt.j.xt.b r9, int r10, com.ss.android.downloadlib.addownload.j.o r11) {
                r8 = this;
                r10 = 0
                if (r9 != 0) goto L4
                return r10
            L4:
                boolean r0 = r9.w0()
                if (r0 == 0) goto Lb
                return r10
            Lb:
                boolean r0 = r8.e(r9)
                if (r0 != 0) goto L12
                return r10
            L12:
                java.lang.String r0 = r9.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 1
                if (r0 != 0) goto L2f
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r2 = r9.h()
                r3 = 0
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r2, r3, r1)
                goto L3f
            L2f:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r2 = r9.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r2)
            L3f:
                if (r0 != 0) goto L42
                return r10
            L42:
                int r2 = r0.ae()
                long r3 = r0.uq()
                long r5 = r0.ka()
                long r2 = com.ss.android.downloadlib.addownload.h.b(r2, r3, r5)
                long r4 = r0.ka()
                r6 = 0
                int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r0 <= 0) goto L8e
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L8e
                int r0 = r9.mi()
                int r0 = r8.b(r0)
                long r6 = (long) r0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 > 0) goto L8e
                com.ss.android.downloadlib.addownload.j$j$a r0 = new com.ss.android.downloadlib.addownload.j$j$a
                r0.<init>(r8, r9, r11)
                com.ss.android.downloadlib.addownload.j.C0205j.a = r0
                long r4 = r4 - r2
                java.lang.String r11 = com.ss.android.downloadlib.a.h.o(r4)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r10] = r11
                java.lang.String r10 = "该下载任务仅需%s，即将下载完成，是否继续下载？"
                java.lang.String r10 = java.lang.String.format(r10, r0)
                java.lang.String r11 = "继续"
                java.lang.String r0 = "暂停"
                com.ss.android.downloadlib.activity.TTDelegateActivity.l(r9, r10, r11, r0)
                r9.S0(r1)
                return r1
            L8e:
                return r10
        }
    }

    public class k implements com.ss.android.downloadlib.addownload.j.i {
        private static com.ss.android.downloadlib.addownload.j.c a;

        class a implements com.ss.android.downloadlib.addownload.j.c {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.o b;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.k c;

            a(com.ss.android.downloadlib.addownload.j.k r1, com.ss.android.xt.j.xt.b r2, com.ss.android.downloadlib.addownload.j.o r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void j() {
                    r4 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.k.d(r0)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "pause_optimise_type"
                    java.lang.String r2 = "download_percent"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    java.lang.String r1 = "pause_optimise_action"
                    java.lang.String r2 = "confirm"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    goto L1c
                L18:
                    r1 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r1)
                L1c:
                    com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "pause_optimise"
                    com.ss.android.xt.j.xt.b r3 = r4.a
                    r1.r(r2, r0, r3)
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void xt() {
                    r4 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.k.d(r0)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "pause_optimise_type"
                    java.lang.String r2 = "download_percent"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    java.lang.String r1 = "pause_optimise_action"
                    java.lang.String r2 = "cancel"
                    r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L18
                    goto L1c
                L18:
                    r1 = move-exception
                    com.bytedance.sdk.component.utils.vl.j(r1)
                L1c:
                    com.ss.android.downloadlib.r.b r1 = com.ss.android.downloadlib.r.b.a()
                    java.lang.String r2 = "pause_optimise"
                    com.ss.android.xt.j.xt.b r3 = r4.a
                    r1.r(r2, r0, r3)
                    com.ss.android.downloadlib.addownload.j$o r0 = r4.b
                    com.ss.android.xt.j.xt.b r1 = r4.a
                    r0.a(r1)
                    return
            }
        }

        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        private int b(int r3) {
                r2 = this;
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "pause_optimise_download_percent"
                r1 = 50
                int r3 = r3.j(r0, r1)
                return r3
        }

        public static com.ss.android.downloadlib.addownload.j.c c() {
                com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.j.k.a
                return r0
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.j.c d(com.ss.android.downloadlib.addownload.j.c r0) {
                com.ss.android.downloadlib.addownload.j.k.a = r0
                return r0
        }

        private boolean e(com.ss.android.xt.j.xt.a r4) {
                r3 = this;
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r4)
                java.lang.String r1 = "pause_optimise_download_percent_switch"
                r2 = 0
                int r0 = r0.j(r1, r2)
                r1 = 1
                if (r0 != r1) goto L15
                boolean r4 = r4.i()
                if (r4 == 0) goto L15
                return r1
            L15:
                return r2
        }

        @Override // com.ss.android.downloadlib.addownload.j.i
        public boolean a(com.ss.android.xt.j.xt.b r10, int r11, com.ss.android.downloadlib.addownload.j.o r12) {
                r9 = this;
                r11 = 0
                if (r10 != 0) goto L4
                return r11
            L4:
                boolean r0 = r10.c1()
                if (r0 == 0) goto Lb
                return r11
            Lb:
                boolean r0 = r9.e(r10)
                if (r0 != 0) goto L12
                return r11
            L12:
                java.lang.String r0 = r10.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 1
                if (r0 != 0) goto L2f
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r2 = r10.h()
                r3 = 0
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r2, r3, r1)
                goto L3f
            L2f:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r2 = r10.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r2)
            L3f:
                if (r0 != 0) goto L42
                return r11
            L42:
                long r2 = r0.uq()
                long r4 = r0.ka()
                r6 = 0
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L8c
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L8c
                int r0 = r0.ae()
                r6 = 100
                long r2 = r2 * r6
                long r2 = r2 / r4
                int r3 = (int) r2
                int r0 = com.ss.android.downloadlib.addownload.h.a(r0, r3)
                int r2 = r10.mi()
                int r2 = r9.b(r2)
                if (r0 <= r2) goto L8c
                com.ss.android.downloadlib.addownload.j$k$a r2 = new com.ss.android.downloadlib.addownload.j$k$a
                r2.<init>(r9, r10, r12)
                com.ss.android.downloadlib.addownload.j.k.a = r2
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r11] = r12
                java.lang.String r11 = "已下载%s%%，即将下载完成，是否继续下载？"
                java.lang.String r11 = java.lang.String.format(r11, r0)
                java.lang.String r12 = "继续"
                java.lang.String r0 = "暂停"
                com.ss.android.downloadlib.activity.TTDelegateActivity.w(r10, r11, r12, r0)
                r10.j(r1)
                return r1
            L8c:
                return r11
        }
    }

    public class l implements com.ss.android.downloadlib.addownload.j.i {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        private long b(int r3) {
                r2 = this;
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "pause_optimise_mistake_click_interval"
                r1 = 300(0x12c, float:4.2E-43)
                int r3 = r3.j(r0, r1)
                long r0 = (long) r3
                return r0
        }

        private boolean c(int r3) {
                r2 = this;
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "pause_optimise_mistake_click_interval_switch"
                r1 = 0
                int r3 = r3.j(r0, r1)
                r0 = 1
                if (r3 != r0) goto Lf
                return r0
            Lf:
                return r1
        }

        @Override // com.ss.android.downloadlib.addownload.j.i
        public boolean a(com.ss.android.xt.j.xt.b r5, int r6, com.ss.android.downloadlib.addownload.j.o r7) {
                r4 = this;
                r6 = 0
                if (r5 != 0) goto L4
                return r6
            L4:
                int r7 = r5.mi()
                boolean r7 = r4.c(r7)
                if (r7 != 0) goto Lf
                return r6
            Lf:
                long r0 = r5.k()
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r0
                int r7 = r5.mi()
                long r0 = r4.b(r7)
                int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r7 > 0) goto L40
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                java.lang.String r7 = "pause_optimise_type"
                java.lang.String r0 = "mistake_click"
                r6.putOpt(r7, r0)     // Catch: org.json.JSONException -> L31
                goto L35
            L31:
                r7 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r7)
            L35:
                com.ss.android.downloadlib.r.b r7 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r0 = "pause_optimise"
                r7.r(r0, r6, r5)
                r5 = 1
                return r5
            L40:
                return r6
        }
    }

    public class m {
        private static com.ss.android.downloadlib.addownload.j.m b;
        private java.util.List<com.ss.android.downloadlib.addownload.j.i> a;

        private m() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.a = r0
                com.ss.android.downloadlib.addownload.j$l r1 = new com.ss.android.downloadlib.addownload.j$l
                r1.<init>()
                r0.add(r1)
                java.util.List<com.ss.android.downloadlib.addownload.j$i> r0 = r2.a
                com.ss.android.downloadlib.addownload.j$q r1 = new com.ss.android.downloadlib.addownload.j$q
                r1.<init>()
                r0.add(r1)
                java.util.List<com.ss.android.downloadlib.addownload.j$i> r0 = r2.a
                com.ss.android.downloadlib.addownload.j$k r1 = new com.ss.android.downloadlib.addownload.j$k
                r1.<init>()
                r0.add(r1)
                java.util.List<com.ss.android.downloadlib.addownload.j$i> r0 = r2.a
                com.ss.android.downloadlib.addownload.j$j r1 = new com.ss.android.downloadlib.addownload.j$j
                r1.<init>()
                r0.add(r1)
                return
        }

        public static com.ss.android.downloadlib.addownload.j.m a() {
                com.ss.android.downloadlib.addownload.j$m r0 = com.ss.android.downloadlib.addownload.j.m.b
                if (r0 != 0) goto L19
                java.lang.Class<com.ss.android.downloadlib.addownload.j$m> r0 = com.ss.android.downloadlib.addownload.j.m.class
                monitor-enter(r0)
                com.ss.android.downloadlib.addownload.j$m r1 = com.ss.android.downloadlib.addownload.j.m.b     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                com.ss.android.downloadlib.addownload.j$m r1 = new com.ss.android.downloadlib.addownload.j$m     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                com.ss.android.downloadlib.addownload.j.m.b = r1     // Catch: java.lang.Throwable -> L13
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
                com.ss.android.downloadlib.addownload.j$m r0 = com.ss.android.downloadlib.addownload.j.m.b
                return r0
        }

        public void b(com.ss.android.xt.j.xt.b r5, int r6, com.ss.android.downloadlib.addownload.j.o r7) {
                r4 = this;
                java.util.List<com.ss.android.downloadlib.addownload.j$i> r0 = r4.a
                if (r0 == 0) goto L7b
                int r0 = r0.size()
                if (r0 == 0) goto L7b
                if (r5 != 0) goto Ld
                goto L7b
            Ld:
                java.lang.String r0 = r5.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L26
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r2)
                java.lang.String r3 = r5.h()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r3, r2, r1)
                goto L32
            L26:
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r2)
                java.lang.String r2 = r5.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r2)
            L32:
                if (r0 == 0) goto L77
                java.lang.String r2 = "application/vnd.android.package-archive"
                java.lang.String r0 = r0.xw()
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L41
                goto L77
            L41:
                int r0 = r5.mi()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r2 = "pause_optimise_switch"
                r3 = 0
                int r0 = r0.j(r2, r3)
                if (r0 != r1) goto L53
                goto L54
            L53:
                r1 = 0
            L54:
                java.util.List<com.ss.android.downloadlib.addownload.j$i> r0 = r4.a
                java.util.Iterator r0 = r0.iterator()
            L5a:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L73
                java.lang.Object r2 = r0.next()
                com.ss.android.downloadlib.addownload.j$i r2 = (com.ss.android.downloadlib.addownload.j.i) r2
                if (r1 != 0) goto L6c
                boolean r3 = r2 instanceof com.ss.android.downloadlib.addownload.j.q
                if (r3 == 0) goto L5a
            L6c:
                boolean r2 = r2.a(r5, r6, r7)
                if (r2 == 0) goto L5a
                return
            L73:
                r7.a(r5)
                return
            L77:
                r7.a(r5)
                return
            L7b:
                r7.a(r5)
                return
        }
    }

    public class n {
        private static com.ss.android.downloadlib.addownload.j.n b;
        private java.util.List<com.ss.android.downloadlib.addownload.j.g> a;

        private n() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.a = r0
                com.ss.android.downloadlib.addownload.j$p r1 = new com.ss.android.downloadlib.addownload.j$p
                r1.<init>()
                r0.add(r1)
                java.util.List<com.ss.android.downloadlib.addownload.j$g> r0 = r2.a
                com.ss.android.downloadlib.addownload.j$r r1 = new com.ss.android.downloadlib.addownload.j$r
                r1.<init>()
                r0.add(r1)
                java.util.List<com.ss.android.downloadlib.addownload.j$g> r0 = r2.a
                com.ss.android.downloadlib.addownload.j$h r1 = new com.ss.android.downloadlib.addownload.j$h
                r1.<init>()
                r0.add(r1)
                return
        }

        public static com.ss.android.downloadlib.addownload.j.n a() {
                com.ss.android.downloadlib.addownload.j$n r0 = com.ss.android.downloadlib.addownload.j.n.b
                if (r0 != 0) goto L19
                java.lang.Class<com.ss.android.downloadlib.addownload.j$m> r0 = com.ss.android.downloadlib.addownload.j.m.class
                monitor-enter(r0)
                com.ss.android.downloadlib.addownload.j$n r1 = com.ss.android.downloadlib.addownload.j.n.b     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                com.ss.android.downloadlib.addownload.j$n r1 = new com.ss.android.downloadlib.addownload.j$n     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                com.ss.android.downloadlib.addownload.j.n.b = r1     // Catch: java.lang.Throwable -> L13
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
                com.ss.android.downloadlib.addownload.j$n r0 = com.ss.android.downloadlib.addownload.j.n.b
                return r0
        }

        public void b(com.ss.android.xt.j.xt.b r5, int r6, com.ss.android.downloadlib.addownload.j.o r7, com.ss.android.downloadlib.addownload.j.a r8) {
                r4 = this;
                java.util.List<com.ss.android.downloadlib.addownload.j$g> r0 = r4.a
                if (r0 == 0) goto Lc
                int r0 = r0.size()
                if (r0 == 0) goto Lc
                if (r5 != 0) goto Lf
            Lc:
                r7.a(r5)
            Lf:
                java.lang.String r0 = r5.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L2c
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r5.h()
                r2 = 0
                r3 = 1
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r1, r2, r3)
                goto L3c
            L2c:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r5.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r1)
            L3c:
                if (r0 != 0) goto L4e
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                int r1 = r5.mi()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.tl(r1)
            L4e:
                if (r0 == 0) goto L86
                java.lang.String r1 = "application/vnd.android.package-archive"
                java.lang.String r0 = r0.xw()
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L5d
                goto L86
            L5d:
                com.ss.android.downloadlib.addownload.j$l r0 = new com.ss.android.downloadlib.addownload.j$l
                r0.<init>()
                boolean r0 = r0.a(r5, r6, r7)
                if (r0 == 0) goto L69
                goto L81
            L69:
                java.util.List<com.ss.android.downloadlib.addownload.j$g> r0 = r4.a
                java.util.Iterator r0 = r0.iterator()
            L6f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L82
                java.lang.Object r1 = r0.next()
                com.ss.android.downloadlib.addownload.j$g r1 = (com.ss.android.downloadlib.addownload.j.g) r1
                boolean r1 = r1.a(r5, r6, r7, r8)
                if (r1 == 0) goto L6f
            L81:
                return
            L82:
                r7.a(r5)
                return
            L86:
                r7.a(r5)
                return
        }
    }

    public interface o {
        void a(com.ss.android.xt.j.xt.b r1);
    }

    public class p implements com.ss.android.downloadlib.addownload.j.g {
        public p() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.g
        public boolean a(com.ss.android.xt.j.xt.b r8, int r9, com.ss.android.downloadlib.addownload.j.o r10, com.ss.android.downloadlib.addownload.j.a r11) {
                r7 = this;
                if (r8 != 0) goto L4
                r8 = 0
                return r8
            L4:
                java.lang.String r0 = r8.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L22
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r8.h()
                r2 = 0
                r3 = 1
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r1, r2, r3)
            L20:
                r2 = r0
                goto L33
            L22:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r8.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r1)
                goto L20
            L33:
                r5 = 1
                r1 = r8
                r3 = r9
                r4 = r10
                r6 = r11
                boolean r8 = com.ss.android.downloadlib.addownload.b.e(r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    public class q implements com.ss.android.downloadlib.addownload.j.i {
        public q() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.addownload.j.i
        public boolean a(com.ss.android.xt.j.xt.b r8, int r9, com.ss.android.downloadlib.addownload.j.o r10) {
                r7 = this;
                if (r8 != 0) goto L4
                r8 = 0
                return r8
            L4:
                java.lang.String r0 = r8.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 0
                if (r0 != 0) goto L1e
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r1)
                java.lang.String r2 = r8.h()
                r3 = 1
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r2, r1, r3)
            L1c:
                r2 = r0
                goto L2b
            L1e:
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r1)
                java.lang.String r1 = r8.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r1)
                goto L1c
            L2b:
                r5 = 0
                r6 = 0
                r1 = r8
                r3 = r9
                r4 = r10
                boolean r8 = com.ss.android.downloadlib.addownload.b.e(r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    public class r implements com.ss.android.downloadlib.addownload.j.g {
        private static com.ss.android.downloadlib.addownload.j.c a;
        private static com.ss.android.downloadlib.addownload.j.a b;

        class a implements com.ss.android.downloadlib.addownload.j.c {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ com.ss.android.xt.j.xt.b c;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.o d;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.r e;

            a(com.ss.android.downloadlib.addownload.j.r r1, int r2, int r3, com.ss.android.xt.j.xt.b r4, com.ss.android.downloadlib.addownload.j.o r5) {
                    r0 = this;
                    r0.e = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.d = r5
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void j() {
                    r7 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.r.d(r0)
                    com.ss.android.downloadlib.addownload.j$r r1 = r7.e
                    int r2 = r7.a
                    int r3 = r7.b
                    com.ss.android.xt.j.xt.b r4 = r7.c
                    java.lang.String r5 = "apk_size_cancel"
                    java.lang.String r6 = "confirm"
                    com.ss.android.downloadlib.addownload.j.r.g(r1, r2, r3, r4, r5, r6)
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.c
            public void xt() {
                    r7 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.r.d(r0)
                    com.ss.android.downloadlib.addownload.j$r r1 = r7.e
                    int r2 = r7.a
                    int r3 = r7.b
                    com.ss.android.xt.j.xt.b r4 = r7.c
                    java.lang.String r5 = "apk_size_cancel"
                    java.lang.String r6 = "cancel"
                    com.ss.android.downloadlib.addownload.j.r.g(r1, r2, r3, r4, r5, r6)
                    com.ss.android.downloadlib.addownload.j$o r0 = r7.d
                    com.ss.android.xt.j.xt.b r1 = r7.c
                    r0.a(r1)
                    return
            }
        }

        class b implements com.ss.android.downloadlib.addownload.j.a {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ com.ss.android.xt.j.xt.b c;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.a d;
            final /* synthetic */ com.ss.android.downloadlib.addownload.j.r e;

            b(com.ss.android.downloadlib.addownload.j.r r1, int r2, int r3, com.ss.android.xt.j.xt.b r4, com.ss.android.downloadlib.addownload.j.a r5) {
                    r0 = this;
                    r0.e = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.d = r5
                    r0.<init>()
                    return
            }

            @Override // com.ss.android.downloadlib.addownload.j.a
            public void delete() {
                    r7 = this;
                    r0 = 0
                    com.ss.android.downloadlib.addownload.j.r.d(r0)
                    com.ss.android.downloadlib.addownload.j$r r1 = r7.e
                    int r2 = r7.a
                    int r3 = r7.b
                    com.ss.android.xt.j.xt.b r4 = r7.c
                    java.lang.String r5 = "apk_size_cancel"
                    java.lang.String r6 = "delete"
                    com.ss.android.downloadlib.addownload.j.r.g(r1, r2, r3, r4, r5, r6)
                    com.ss.android.downloadlib.addownload.j.a r0 = r7.d
                    r0.delete()
                    return
            }
        }

        public r() {
                r0 = this;
                r0.<init>()
                return
        }

        private int b(int r3) {
                r2 = this;
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r0 = "cancel_pause_optimise_apk_size"
                r1 = 100
                int r3 = r3.j(r0, r1)
                r0 = 1048576(0x100000, float:1.469368E-39)
                int r3 = r3 * r0
                return r3
        }

        public static com.ss.android.downloadlib.addownload.j.c c() {
                com.ss.android.downloadlib.addownload.j.c r0 = com.ss.android.downloadlib.addownload.j.r.a
                return r0
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.j.c d(com.ss.android.downloadlib.addownload.j.c r0) {
                com.ss.android.downloadlib.addownload.j.r.a = r0
                return r0
        }

        private void e(int r3, int r4, com.ss.android.xt.j.xt.b r5, java.lang.String r6, java.lang.String r7) {
                r2 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "pause_optimise_type"
                r0.putOpt(r1, r6)     // Catch: org.json.JSONException -> L22
                java.lang.String r6 = "pause_optimise_action"
                r0.putOpt(r6, r7)     // Catch: org.json.JSONException -> L22
                java.lang.String r6 = "download_current_bytes"
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L22
                r0.putOpt(r6, r3)     // Catch: org.json.JSONException -> L22
                java.lang.String r3 = "download_total_bytes"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: org.json.JSONException -> L22
                r0.putOpt(r3, r4)     // Catch: org.json.JSONException -> L22
                goto L26
            L22:
                r3 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r3)
            L26:
                com.ss.android.downloadlib.r.b r3 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r4 = "pause_cancel_optimise"
                r3.r(r4, r0, r5)
                return
        }

        public static void f(com.ss.android.downloadlib.addownload.j.a r0) {
                com.ss.android.downloadlib.addownload.j.r.b = r0
                return
        }

        static /* synthetic */ void g(com.ss.android.downloadlib.addownload.j.r r0, int r1, int r2, com.ss.android.xt.j.xt.b r3, java.lang.String r4, java.lang.String r5) {
                r0.e(r1, r2, r3, r4, r5)
                return
        }

        private boolean h(com.ss.android.xt.j.xt.a r4) {
                r3 = this;
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.downloadlib.a.n.k(r4)
                java.lang.String r1 = "cancel_pause_optimise_apk_retain_switch"
                r2 = 0
                int r0 = r0.j(r1, r2)
                r1 = 1
                if (r0 != r1) goto L15
                boolean r4 = r4.i()
                if (r4 == 0) goto L15
                return r1
            L15:
                return r2
        }

        public static com.ss.android.downloadlib.addownload.j.a i() {
                com.ss.android.downloadlib.addownload.j.a r0 = com.ss.android.downloadlib.addownload.j.r.b
                return r0
        }

        @Override // com.ss.android.downloadlib.addownload.j.g
        public boolean a(com.ss.android.xt.j.xt.b r13, int r14, com.ss.android.downloadlib.addownload.j.o r15, com.ss.android.downloadlib.addownload.j.a r16) {
                r12 = this;
                r6 = 0
                if (r13 != 0) goto L4
                return r6
            L4:
                boolean r0 = r12.h(r13)
                if (r0 != 0) goto Lb
                return r6
            Lb:
                java.lang.String r0 = r13.h()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                if (r0 != 0) goto L28
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r13.h()
                r2 = 0
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.e(r1, r2, r7)
                goto L38
            L28:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.g r0 = com.ss.android.downloadlib.g.c(r0)
                java.lang.String r1 = r13.j()
                com.ss.android.socialbase.downloader.ae.cw r0 = r0.u(r1)
            L38:
                if (r0 != 0) goto L3b
                return r6
            L3b:
                int r1 = r0.ae()
                long r2 = r0.uq()
                long r4 = r0.ka()
                long r8 = com.ss.android.downloadlib.addownload.h.b(r1, r2, r4)
                long r10 = r0.ka()
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 < 0) goto L9f
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 <= 0) goto L9f
                int r0 = r13.mi()
                int r0 = r12.b(r0)
                long r2 = (long) r0
                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r0 > 0) goto L9f
                r2 = 1048576(0x100000, double:5.180654E-318)
                long r2 = r8 / r2
                int r2 = (int) r2
                com.ss.android.downloadlib.addownload.j$r$a r0 = new com.ss.android.downloadlib.addownload.j$r$a
                r3 = r2
                r1 = r12
                r4 = r13
                r5 = r15
                r0.<init>(r1, r2, r3, r4, r5)
                com.ss.android.downloadlib.addownload.j.r.a = r0
                long r10 = r10 - r8
                java.lang.String r0 = com.ss.android.downloadlib.a.h.o(r10)
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r1[r6] = r0
                java.lang.String r0 = "该下载任务仅需%s，即将下载完成，是否继续下载？"
                java.lang.String r6 = java.lang.String.format(r0, r1)
                if (r16 == 0) goto L95
                com.ss.android.downloadlib.addownload.j$r$b r0 = new com.ss.android.downloadlib.addownload.j$r$b
                r3 = r2
                r1 = r12
                r4 = r13
                r5 = r16
                r0.<init>(r1, r2, r3, r4, r5)
                f(r0)
            L95:
                java.lang.String r0 = "暂停"
                java.lang.String r1 = "删除"
                java.lang.String r2 = "继续"
                com.ss.android.downloadlib.activity.TTDelegateActivity.m(r13, r6, r2, r0, r1)
                return r7
            L9f:
                return r6
        }
    }

    j(android.os.Handler r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.d = r0
            r2.a = r3
            return
    }

    static /* synthetic */ long a() {
            long r0 = r()
            return r0
    }

    static /* synthetic */ long b(com.ss.android.downloadlib.addownload.j r0, java.util.Map r1) {
            long r0 = r0.c(r1)
            return r0
    }

    private long c(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L3c
            int r2 = r6.size()
            if (r2 != 0) goto Lb
            goto L3c
        Lb:
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Exception -> L38
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L38
        L13:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L38
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L38
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Exception -> L38
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L38
            java.lang.String r4 = "content-length"
            boolean r3 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L13
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L38
            return r0
        L38:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L3c:
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean d(com.ss.android.downloadlib.addownload.j r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.c
            return r0
    }

    public static org.json.JSONObject e(java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "clean_space_install_params"
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> Lb
            return r0
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return r0
    }

    public static void f(int r0) {
            boolean r0 = com.ss.android.downloadlib.a.n.o(r0)
            if (r0 != 0) goto L7
            goto L1a
        L7:
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            if (r0 == 0) goto L1a
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            boolean r0 = r0.xt()
            if (r0 == 0) goto L1a
            com.ss.android.downloadlib.addownload.m.v()
        L1a:
            return
    }

    private void h(int r13, java.lang.String r14, long r15, com.ss.android.xt.j.xt.b r17, long r18, com.ss.android.downloadlib.addownload.l.k r20) {
            r12 = this;
            r1 = r15
            r8 = r20
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.c
            r9 = 1
            r0.set(r9)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7d
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "apk_size"
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: org.json.JSONException -> L1e
            r3.putOpt(r0, r4)     // Catch: org.json.JSONException -> L1e
            goto L22
        L1e:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L22:
            double r4 = com.ss.android.downloadlib.a.n.h(r13)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r6
            double r0 = (double) r1
            double r4 = r4 * r0
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            long r0 = r0.longValue()
            long r4 = com.ss.android.downloadlib.a.n.w(r13)
            long r0 = r0 + r4
            long r4 = r0 - r18
            long r6 = r()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7d
            r1 = r12
            r2 = r17
            r1.l(r2, r3, r4, r6)
            k(r2)
            r10 = r4
            r4 = r6
            long r6 = r()
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L79
            r2.s0(r9)
            java.lang.String r0 = r2.j()
            com.ss.android.downloadlib.addownload.c$d r3 = com.ss.android.downloadlib.addownload.c.d.b()
            com.ss.android.downloadlib.addownload.j$d r4 = new com.ss.android.downloadlib.addownload.j$d
            r4.<init>(r12, r2, r8, r0)
            r3.f(r0, r4)
            r1 = r12
            r4 = r14
            r3 = r2
            r5 = r10
            r2 = r13
            boolean r13 = r1.p(r2, r3, r4, r5)
            r2 = r3
            if (r13 == 0) goto L7e
            r2.J0(r9)
            goto L7e
        L79:
            r1 = r12
            r1.t(r2, r3, r4, r6)
        L7d:
            r13 = 0
        L7e:
            if (r13 != 0) goto L8a
            android.os.Handler r13 = r12.a
            com.ss.android.downloadlib.addownload.j$e r0 = new com.ss.android.downloadlib.addownload.j$e
            r0.<init>(r12, r8)
            r13.post(r0)
        L8a:
            return
    }

    static /* synthetic */ void i(com.ss.android.downloadlib.addownload.j r0, int r1, java.lang.String r2, long r3, com.ss.android.xt.j.xt.b r5, long r6, com.ss.android.downloadlib.addownload.l.k r8) {
            r0.h(r1, r2, r3, r5, r6, r8)
            return
    }

    private static void k(com.ss.android.xt.j.xt.b r6) {
            long r0 = r()
            v2.b r2 = com.ss.android.downloadlib.addownload.m.v()
            if (r2 == 0) goto Ld
            com.ss.android.downloadlib.addownload.m.v()
        Ld:
            com.ss.android.downloadlib.addownload.c.b.a()
            com.ss.android.downloadlib.addownload.c.b.e()
            int r2 = r6.mi()
            boolean r2 = com.ss.android.downloadlib.a.n.b(r2)
            if (r2 == 0) goto L24
            android.content.Context r2 = com.ss.android.downloadlib.addownload.m.getContext()
            com.ss.android.downloadlib.addownload.c.b.b(r2)
        L24:
            long r2 = r()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "quite_clean_size"
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L38
            r4.putOpt(r5, r0)     // Catch: org.json.JSONException -> L38
            goto L3c
        L38:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L3c:
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r1 = "clean_quite_finish"
            r0.r(r1, r4, r6)
            return
    }

    private void l(com.ss.android.xt.j.xt.b r2, org.json.JSONObject r3, long r4, long r6) {
            r1 = this;
            java.lang.String r0 = "available_space"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: org.json.JSONException -> L13
            r3.putOpt(r0, r6)     // Catch: org.json.JSONException -> L13
            java.lang.String r6 = "apk_download_need_size"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: org.json.JSONException -> L13
            r3.putOpt(r6, r4)     // Catch: org.json.JSONException -> L13
            goto L17
        L13:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L17:
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "clean_space_no_enough_for_download"
            r4.r(r5, r3, r2)
            return
    }

    private void m(java.lang.String r1, com.ss.android.xt.j.xt.b r2, com.ss.android.downloadlib.addownload.l.InterfaceC0206l r3) {
            r0 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.ss.android.downloadlib.addownload.j$c r2 = new com.ss.android.downloadlib.addownload.j$c
            r2.<init>(r0, r3)
            com.ss.android.socialbase.downloader.g.j.xt.j(r1, r2)
            return
    }

    private boolean p(int r9, @androidx.annotation.NonNull com.ss.android.xt.j.xt.b r10, java.lang.String r11, long r12) {
            r8 = this;
            boolean r0 = com.ss.android.downloadlib.a.n.o(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            if (r0 == 0) goto L1b
            v2.b r2 = com.ss.android.downloadlib.addownload.m.v()
            r5 = 1
            r3 = r9
            r4 = r11
            r6 = r12
            boolean r9 = r2.a(r3, r4, r5, r6)
            return r9
        L1b:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r11 = "show_dialog_result"
            r12 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: org.json.JSONException -> L2b
            r9.putOpt(r11, r12)     // Catch: org.json.JSONException -> L2b
            goto L30
        L2b:
            r0 = move-exception
            r11 = r0
            com.bytedance.sdk.component.utils.vl.j(r11)
        L30:
            com.ss.android.downloadlib.r.b r11 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r12 = "cleanspace_window_show"
            r11.r(r12, r9, r10)
            return r1
    }

    public static boolean q(com.ss.android.socialbase.downloader.ae.cw r6, long r7) {
            int r1 = r6.ae()
            boolean r0 = com.ss.android.downloadlib.a.n.o(r1)
            r2 = 0
            if (r0 != 0) goto Lc
            return r2
        Lc:
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            if (r0 == 0) goto L33
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            java.lang.String r2 = r6.oq()
            r3 = 0
            r4 = r7
            boolean r7 = r0.a(r1, r2, r3, r4)
            if (r7 == 0) goto L32
            com.ss.android.downloadlib.addownload.c$d r8 = com.ss.android.downloadlib.addownload.c.d.b()
            java.lang.String r0 = r6.oq()
            com.ss.android.downloadlib.addownload.j$f r1 = new com.ss.android.downloadlib.addownload.j$f
            r1.<init>(r6)
            r8.f(r0, r1)
        L32:
            return r7
        L33:
            return r2
    }

    private static long r() {
            r0 = 0
            long r0 = com.ss.android.downloadlib.a.h.I(r0)
            return r0
    }

    public static long s() {
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            if (r0 == 0) goto Lf
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            long r0 = r0.j()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private void t(com.ss.android.xt.j.xt.b r2, org.json.JSONObject r3, long r4, long r6) {
            r1 = this;
            java.lang.String r0 = "1"
            r2.M0(r0)
            com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()
            r0.d(r2)
            java.lang.String r0 = "quite_clean_size"
            long r6 = r6 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: org.json.JSONException -> L17
            r3.putOpt(r0, r4)     // Catch: org.json.JSONException -> L17
            goto L1b
        L17:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L1b:
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "cleanspace_download_after_quite_clean"
            r4.r(r5, r3, r2)
            return
    }

    void g(int r15, long r16, long r18, com.ss.android.downloadlib.addownload.l.k r20) {
            r14 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.d
            r1 = 0
            r0.set(r1)
            if (r20 != 0) goto L9
            return
        L9:
            boolean r0 = com.ss.android.downloadlib.a.n.o(r15)
            if (r0 == 0) goto L15
            boolean r0 = com.ss.android.downloadlib.a.n.t(r15)
            if (r0 != 0) goto L19
        L15:
            r7 = r20
            goto L9b
        L19:
            long r9 = com.ss.android.downloadlib.a.n.d(r15)
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.c
            r0.set(r1)
            com.ss.android.downloadlib.addownload.o$i r0 = r14.b
            com.ss.android.j.j.cw.b r0 = r0.b
            java.lang.String r2 = r0.j()
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r0 = r0.t(r2)
            if (r0 != 0) goto L48
            com.ss.android.xt.j.xt.b r0 = new com.ss.android.xt.j.xt.b
            com.ss.android.downloadlib.addownload.o$i r3 = r14.b
            com.ss.android.j.j.cw.b r4 = r3.b
            com.ss.android.j.j.cw.g r5 = r3.c
            com.ss.android.j.j.cw.c r3 = r3.d
            r0.<init>(r4, r5, r3, r1)
            com.ss.android.downloadlib.addownload.o$f r3 = com.ss.android.downloadlib.addownload.o.f.c()
            r3.l(r0)
        L48:
            r4 = r0
            r4.J0(r1)
            v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
            if (r0 == 0) goto L55
            com.ss.android.downloadlib.addownload.m.v()
        L55:
            com.ss.android.downloadlib.addownload.c$d r0 = com.ss.android.downloadlib.addownload.c.d.b()
            java.lang.String r1 = r4.j()
            r0.e(r1)
            boolean r11 = com.ss.android.downloadlib.a.n.q(r15)
            r12 = 0
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 <= 0) goto L79
            r0 = r14
            r1 = r15
            r6 = r16
            r8 = r20
            r5 = r4
            r3 = r18
            r0.h(r1, r2, r3, r5, r6, r8)
            r7 = r20
            goto L90
        L79:
            if (r11 == 0) goto L8d
            com.ss.android.downloadlib.addownload.j$a r0 = new com.ss.android.downloadlib.addownload.j$a
            r1 = r14
            r5 = r16
            r7 = r20
            r3 = r2
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r15 = r0
            r2 = r3
            r14.m(r2, r4, r15)
            goto L90
        L8d:
            r7 = r20
            r9 = r12
        L90:
            android.os.Handler r15 = r14.a
            com.ss.android.downloadlib.addownload.j$b r1 = new com.ss.android.downloadlib.addownload.j$b
            r1.<init>(r14, r7)
            r15.postDelayed(r1, r9)
            return
        L9b:
            r7.j()
            return
    }

    public void j(com.ss.android.downloadlib.addownload.o.i r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void n(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.d
            r0.set(r2)
            return
    }

    public boolean o() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.d
            boolean r0 = r0.get()
            return r0
    }
}
