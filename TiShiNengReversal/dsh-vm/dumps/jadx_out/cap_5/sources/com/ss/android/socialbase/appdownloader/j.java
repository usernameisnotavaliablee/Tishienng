package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j {
    private static final java.lang.String a = "j";
    private static com.ss.android.socialbase.appdownloader.j.c b;
    private static com.ss.android.socialbase.appdownloader.j.d c;

    static class a implements com.ss.android.socialbase.appdownloader.j.g {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.ss.android.socialbase.appdownloader.j.g
        public boolean j(@androidx.annotation.NonNull android.content.Context r1) {
                r0 = this;
                boolean r1 = com.ss.android.socialbase.appdownloader.j.D(r1)
                return r1
        }
    }

    static class b implements com.ss.android.socialbase.appdownloader.j.g {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.ss.android.socialbase.appdownloader.j.g
        public boolean j(@androidx.annotation.NonNull android.content.Context r1) {
                r0 = this;
                boolean r1 = com.ss.android.socialbase.appdownloader.j.b(r1)
                return r1
        }
    }

    public interface c {
        void a(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.appdownloader.d r2);
    }

    private static class d implements com.ss.android.socialbase.downloader.j.j.j {
        private final com.ss.android.socialbase.appdownloader.j.f a;
        private final int b;
        private org.json.JSONObject c;

        public d(android.content.Context r8, android.content.Intent r9, int r10, org.json.JSONObject r11, com.ss.android.socialbase.appdownloader.j.g r12) {
                r7 = this;
                r7.<init>()
                r7.c = r11
                java.lang.String r0 = "query_interval"
                r1 = 1000(0x3e8, float:1.401E-42)
                int r11 = r11.optInt(r0, r1)
                r7.b = r11
                com.ss.android.socialbase.appdownloader.j$f r0 = new com.ss.android.socialbase.appdownloader.j$f
                long r5 = (long) r11
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                r7.a = r0
                return
        }

        public void cw() {
                r5 = this;
                org.json.JSONObject r0 = r5.c
                java.lang.String r1 = "time_out_second"
                r2 = 20
                int r0 = r0.optInt(r1, r2)
                android.os.Message r1 = android.os.Message.obtain()
                r2 = 1
                r1.what = r2
                com.ss.android.socialbase.appdownloader.j$f r2 = r5.a
                android.os.Handler r2 = com.ss.android.socialbase.appdownloader.j.f.b(r2)
                r2.sendMessage(r1)
                if (r0 <= 0) goto L33
                r1 = 60
                if (r0 >= r1) goto L33
                android.os.Message r1 = android.os.Message.obtain()
                r2 = 2
                r1.what = r2
                com.ss.android.socialbase.appdownloader.j$f r2 = r5.a
                android.os.Handler r2 = com.ss.android.socialbase.appdownloader.j.f.b(r2)
                int r0 = r0 * 1000
                long r3 = (long) r0
                r2.sendMessageDelayed(r1, r3)
            L33:
                return
        }

        public void xt() {
                r2 = this;
                com.ss.android.socialbase.appdownloader.j$f r0 = r2.a
                boolean r0 = com.ss.android.socialbase.appdownloader.j.f.a(r0)
                if (r0 != 0) goto L18
                android.os.Message r0 = android.os.Message.obtain()
                r1 = 2
                r0.what = r1
                com.ss.android.socialbase.appdownloader.j$f r1 = r2.a
                android.os.Handler r1 = com.ss.android.socialbase.appdownloader.j.f.b(r1)
                r1.sendMessage(r0)
            L18:
                com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
                r0.xt(r2)
                r0 = 0
                com.ss.android.socialbase.appdownloader.j.f(r0)
                return
        }
    }

    private static class e implements java.util.concurrent.Callable<java.lang.Boolean> {
        private final android.content.Context a;
        private final com.ss.android.socialbase.appdownloader.j.g b;
        private final android.os.Handler c;
        private final long d;

        public e(android.os.Handler r1, android.content.Context r2, com.ss.android.socialbase.appdownloader.j.g r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.c = r1
                r0.d = r4
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() throws java.lang.Exception {
                r6 = this;
                com.ss.android.socialbase.appdownloader.j$g r0 = r6.b     // Catch: java.lang.Throwable -> L3a
                if (r0 == 0) goto L37
                long r1 = r6.d     // Catch: java.lang.Throwable -> L3a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L37
                r3 = 10000(0x2710, double:4.9407E-320)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L13
                goto L37
            L13:
                android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L1c
                boolean r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L3a
                goto L1d
            L1c:
                r0 = 0
            L1d:
                android.os.Message r1 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L3a
                if (r0 == 0) goto L2c
                r0 = 2
                r1.what = r0     // Catch: java.lang.Throwable -> L3a
                android.os.Handler r0 = r6.c     // Catch: java.lang.Throwable -> L3a
                r0.sendMessage(r1)     // Catch: java.lang.Throwable -> L3a
                goto L3a
            L2c:
                r0 = 1
                r1.what = r0     // Catch: java.lang.Throwable -> L3a
                android.os.Handler r0 = r6.c     // Catch: java.lang.Throwable -> L3a
                long r2 = r6.d     // Catch: java.lang.Throwable -> L3a
                r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L3a
                goto L3a
            L37:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3a
                return r0
            L3a:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.call()
                return r0
        }
    }

    private static class f implements com.ss.android.socialbase.downloader.ws.tl.j {
        public static int h;
        private static int i;
        private final android.content.Context a;
        private final android.content.Intent b;
        private final com.ss.android.socialbase.appdownloader.j.g c;
        private final android.os.Handler d;
        private final long e;
        private java.util.concurrent.Future<java.lang.Boolean> f;
        private boolean g;

        public f(android.content.Context r2, android.content.Intent r3, int r4, com.ss.android.socialbase.appdownloader.j.g r5, long r6) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.g = r0
                r1.a = r2
                r1.b = r3
                com.ss.android.socialbase.appdownloader.j.f.i = r4
                r1.c = r5
                com.ss.android.socialbase.downloader.ws.tl r2 = new com.ss.android.socialbase.downloader.ws.tl
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r2.<init>(r3, r1)
                r1.d = r2
                r1.e = r6
                return
        }

        static /* synthetic */ boolean a(com.ss.android.socialbase.appdownloader.j.f r0) {
                boolean r0 = r0.g
                return r0
        }

        static /* synthetic */ android.os.Handler b(com.ss.android.socialbase.appdownloader.j.f r0) {
                android.os.Handler r0 = r0.d
                return r0
        }

        public void j(android.os.Message r7) {
                r6 = this;
                if (r7 == 0) goto L94
                int r7 = r7.what
                r0 = 1
                if (r7 != r0) goto L31
                long r1 = r6.e
                r3 = 0
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 <= 0) goto L94
                r3 = 10000(0x2710, double:4.9407E-320)
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 <= 0) goto L17
                goto L94
            L17:
                com.ss.android.socialbase.appdownloader.j.f.h = r0
                java.util.concurrent.ExecutorService r7 = com.ss.android.socialbase.downloader.downloader.cw.qv()
                com.ss.android.socialbase.appdownloader.j$e r0 = new com.ss.android.socialbase.appdownloader.j$e
                android.os.Handler r1 = r6.d
                android.content.Context r2 = r6.a
                com.ss.android.socialbase.appdownloader.j$g r3 = r6.c
                long r4 = r6.e
                r0.<init>(r1, r2, r3, r4)
                java.util.concurrent.Future r7 = r7.submit(r0)
                r6.f = r7
                return
            L31:
                r1 = 2
                if (r7 != r1) goto L94
                com.ss.android.socialbase.appdownloader.j.f.h = r1
                android.os.Handler r7 = r6.d
                r7.removeMessages(r1)
                android.os.Handler r7 = r6.d
                r7.removeMessages(r0)
                java.util.concurrent.Future<java.lang.Boolean> r7 = r6.f
                if (r7 == 0) goto L47
                r7.cancel(r0)
            L47:
                boolean r7 = r6.g
                r1 = 0
                if (r7 != 0) goto L83
                int r7 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r7 < r2) goto L5c
                com.ss.android.socialbase.downloader.j.j r7 = com.ss.android.socialbase.downloader.j.j.j()
                boolean r7 = r7.xt()
                if (r7 == 0) goto L83
            L5c:
                android.content.Intent r7 = r6.b
                if (r7 == 0) goto L66
                android.content.Context r2 = r6.a
                com.ss.android.socialbase.appdownloader.j.o(r2, r7)
                goto L81
            L66:
                android.content.Context r7 = r6.a
                com.ss.android.socialbase.downloader.downloader.ae r7 = com.ss.android.socialbase.downloader.downloader.ae.xt(r7)
                int r2 = com.ss.android.socialbase.appdownloader.j.f.i
                com.ss.android.socialbase.downloader.ae.cw r7 = r7.tl(r2)
                if (r7 == 0) goto L81
                boolean r7 = r7.hw()
                if (r7 == 0) goto L81
                android.content.Context r7 = r6.a
                int r2 = com.ss.android.socialbase.appdownloader.j.f.i
                com.ss.android.socialbase.appdownloader.b.J(r7, r2, r1)
            L81:
                r6.g = r0
            L83:
                android.content.Intent r7 = r6.b
                if (r7 != 0) goto L88
                goto L89
            L88:
                r0 = 0
            L89:
                int r7 = com.ss.android.socialbase.appdownloader.j.f.i
                android.content.Context r1 = r6.a
                boolean r1 = com.ss.android.socialbase.appdownloader.j.n(r1)
                com.ss.android.socialbase.appdownloader.j.i(r7, r0, r1)
            L94:
                return
        }
    }

    interface g {
        boolean j(@androidx.annotation.NonNull android.content.Context r1);
    }

    static {
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.socialbase.appdownloader.d A(org.json.JSONObject r3, com.ss.android.socialbase.downloader.jy.j r4) {
            com.ss.android.socialbase.appdownloader.d r0 = new com.ss.android.socialbase.appdownloader.d
            r0.<init>()
            if (r3 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "type"
            java.lang.String r1 = r3.optString(r1)
            r0.a = r1
            java.lang.String r1 = "vbi"
            r0.e = r1
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r3 = com.ss.android.socialbase.appdownloader.j.i.b(r2, r1, r3, r4)
            if (r3 == 0) goto L22
            r3 = 0
            r0.b = r3
            return r0
        L22:
            r3 = 3
            k(r0, r3)
            return r0
    }

    public static void B(int r3, org.json.JSONObject r4) {
            java.lang.String r0 = "show_unknown_source_on_startup"
            int r4 = r4.optInt(r0)
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "scene"
            if (r4 == 0) goto L16
            goto L17
        L16:
            r0 = 2
        L17:
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1b
            goto L1f
        L1b:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L1f:
            com.ss.android.socialbase.downloader.tl.cw r4 = com.ss.android.socialbase.downloader.downloader.cw.ol()
            java.lang.String r0 = "guide_auth_dialog_cancel"
            r4.xt(r3, r0, r1)
            return
    }

    private static void C(int r4, boolean r5, boolean r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "scene"
            r2 = 2
            r3 = 1
            if (r5 == 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 2
        Le:
            r0.put(r1, r5)     // Catch: java.lang.Exception -> L1a
            java.lang.String r5 = "result_code"
            if (r6 == 0) goto L16
            r2 = 1
        L16:
            r0.put(r5, r2)     // Catch: java.lang.Exception -> L1a
            goto L1e
        L1a:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L1e:
            com.ss.android.socialbase.downloader.tl.cw r5 = com.ss.android.socialbase.downloader.downloader.cw.ol()
            java.lang.String r6 = "guide_auth_result"
            r5.xt(r4, r6, r0)
            return
    }

    static /* synthetic */ boolean D(android.content.Context r0) {
            boolean r0 = y(r0)
            return r0
    }

    private static boolean E(android.content.Context r1, android.content.Intent r2) {
            r0 = 1
            boolean r1 = r(r1, r2, r0)
            return r1
    }

    private static boolean F(android.content.Context r4, @androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r5, org.json.JSONObject r6, @androidx.annotation.NonNull com.ss.android.socialbase.appdownloader.d r7) {
            r0 = 0
            if (r4 == 0) goto L48
            if (r6 != 0) goto L6
            goto L48
        L6:
            java.lang.String r1 = r5.qv()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L11
            return r0
        L11:
            java.lang.String r2 = "custom"
            r7.d = r2
            com.ss.android.socialbase.appdownloader.j.d r2 = com.ss.android.socialbase.appdownloader.j.i.a(r4, r2, r6, r5)
            if (r2 == 0) goto L45
            boolean r3 = r2.a()
            if (r3 != 0) goto L22
            goto L45
        L22:
            android.content.Intent r2 = r2.xt()
            if (r2 != 0) goto L29
            return r0
        L29:
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            boolean r5 = w(r3, r5, r6)
            if (r5 == 0) goto L41
            boolean r4 = E(r4, r2)
            r5 = 1
            if (r4 == 0) goto L3e
            r7.b = r0
            return r5
        L3e:
            r7.b = r5
            goto L44
        L41:
            r4 = 6
            r7.b = r4
        L44:
            return r0
        L45:
            r4 = 3
            r7.b = r4
        L48:
            return r0
    }

    public static void a(int r3, org.json.JSONObject r4) {
            java.lang.String r0 = "show_unknown_source_on_startup"
            int r4 = r4.optInt(r0)
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "scene"
            if (r4 == 0) goto L16
            goto L17
        L16:
            r0 = 2
        L17:
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1b
            goto L1f
        L1b:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L1f:
            com.ss.android.socialbase.downloader.tl.cw r4 = com.ss.android.socialbase.downloader.downloader.cw.ol()
            java.lang.String r0 = "guide_auth_open_setting"
            r4.xt(r3, r0, r1)
            return
    }

    static /* synthetic */ boolean b(android.content.Context r0) {
            boolean r0 = z(r0)
            return r0
    }

    public static int c(@androidx.annotation.NonNull com.ss.android.socialbase.downloader.jy.j r8) {
            java.lang.String r0 = "download_dir"
            org.json.JSONObject r0 = r8.r(r0)
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r2 = "dir_name"
            java.lang.String r0 = r0.optString(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1b
            r8 = 5
            return r8
        L1b:
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r2 = "get_download_info_by_list"
            boolean r0 = r0.j(r2)
            if (r0 != 0) goto L29
            r8 = 4
            return r8
        L29:
            java.lang.String r0 = "ah_plans"
            org.json.JSONArray r0 = r8.up(r0)
            r2 = -1
            if (r0 == 0) goto L98
            int r3 = r0.length()
            r4 = 0
        L37:
            if (r4 >= r3) goto L98
            org.json.JSONObject r5 = r0.optJSONObject(r4)
            boolean r6 = com.ss.android.socialbase.appdownloader.m.b.f(r5)
            if (r6 == 0) goto L95
            java.lang.String r6 = "type"
            java.lang.String r6 = r5.optString(r6)
            java.lang.String r7 = "plan_a"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L8c
            java.lang.String r7 = "plan_b"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L8c
            java.lang.String r7 = "plan_e"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L8c
            java.lang.String r7 = "plan_f"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L6a
            goto L8c
        L6a:
            java.lang.String r7 = "plan_d"
            boolean r7 = r7.equalsIgnoreCase(r6)
            if (r7 != 0) goto L8b
            java.lang.String r7 = "plan_h"
            boolean r7 = r7.equalsIgnoreCase(r6)
            if (r7 == 0) goto L7b
            goto L8b
        L7b:
            java.lang.String r7 = "plan_g"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L95
            com.ss.android.socialbase.appdownloader.d r2 = A(r5, r8)
            int r2 = r2.b
            if (r2 != 0) goto L95
        L8b:
            return r1
        L8c:
            com.ss.android.socialbase.appdownloader.d r2 = d(r5, r8)
            int r2 = r2.b
            if (r2 != 0) goto L95
            return r1
        L95:
            int r4 = r4 + 1
            goto L37
        L98:
            return r2
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.appdownloader.d d(org.json.JSONObject r8, com.ss.android.socialbase.downloader.jy.j r9) {
            com.ss.android.socialbase.appdownloader.d r0 = new com.ss.android.socialbase.appdownloader.d
            r0.<init>()
            if (r8 != 0) goto L8
            goto L5c
        L8:
            java.lang.String r1 = "type"
            java.lang.String r1 = r8.optString(r1)
            r0.a = r1
            java.lang.String r2 = "plan_b"
            boolean r1 = r2.equals(r1)
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L2f
            java.lang.String r1 = "custom"
            r0.e = r1
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r8 = com.ss.android.socialbase.appdownloader.j.i.b(r4, r1, r8, r9)
            if (r8 == 0) goto L2b
            r0.b = r3
            return r0
        L2b:
            k(r0, r2)
            return r0
        L2f:
            java.lang.String r1 = "device_plans"
            java.lang.String r1 = r8.optString(r1)
            r0.e = r1
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L5c
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4)
            int r4 = r1.length
            r5 = 0
        L45:
            if (r5 >= r4) goto L5c
            r6 = r1[r5]
            android.content.Context r7 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r6 = com.ss.android.socialbase.appdownloader.j.i.b(r7, r6, r8, r9)
            if (r6 == 0) goto L56
            r0.b = r3
            return r0
        L56:
            k(r0, r2)
            int r5 = r5 + 1
            goto L45
        L5c:
            return r0
    }

    public static com.ss.android.socialbase.appdownloader.d e(org.json.JSONObject r2, java.lang.String r3, android.content.Context r4, com.ss.android.socialbase.downloader.jy.j r5) {
            com.ss.android.socialbase.appdownloader.d r0 = new com.ss.android.socialbase.appdownloader.d
            r0.<init>()
            if (r2 == 0) goto L3a
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.e()
            if (r1 != 0) goto Le
            goto L3a
        Le:
            java.lang.String r1 = "type"
            java.lang.String r2 = r2.optString(r1)
            r0.a = r2
            java.lang.String r2 = "bi"
            r1 = 0
            int r2 = r5.j(r2, r1)
            r5 = 1
            if (r2 != r5) goto L23
            r0.b = r1
            return r0
        L23:
            boolean r2 = n(r4)
            if (r2 == 0) goto L2d
            r2 = 2
            r0.b = r2
            return r0
        L2d:
            com.ss.android.socialbase.appdownloader.a$a r2 = com.ss.android.socialbase.appdownloader.m.b.b(r3)
            if (r2 == 0) goto L36
            r0.b = r1
            return r0
        L36:
            r2 = 9
            r0.b = r2
        L3a:
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.appdownloader.j.d f(com.ss.android.socialbase.appdownloader.j.d r0) {
            com.ss.android.socialbase.appdownloader.j.c = r0
            return r0
    }

    public static java.lang.String g(java.lang.Throwable r2) {
            java.lang.String r2 = r2.toString()
            int r0 = r2.length()
            r1 = 800(0x320, float:1.121E-42)
            if (r0 <= r1) goto L13
            r0 = 0
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = r2.substring(r0, r1)
        L13:
            return r2
    }

    public static void h(int r3, org.json.JSONObject r4) {
            java.lang.String r0 = "show_unknown_source_on_startup"
            int r4 = r4.optInt(r0)
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "scene"
            if (r4 == 0) goto L16
            goto L17
        L16:
            r0 = 2
        L17:
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1b
            goto L1f
        L1b:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L1f:
            com.ss.android.socialbase.downloader.tl.cw r4 = com.ss.android.socialbase.downloader.downloader.cw.ol()
            java.lang.String r0 = "guide_auth_dialog_confirm"
            r4.xt(r3, r0, r1)
            return
    }

    static /* synthetic */ void i(int r0, boolean r1, boolean r2) {
            C(r0, r1, r2)
            return
    }

    private static void j(android.content.Context r7, android.content.Intent r8, int r9, org.json.JSONObject r10, com.ss.android.socialbase.appdownloader.j.g r11) {
            com.ss.android.socialbase.appdownloader.j$d r0 = com.ss.android.socialbase.appdownloader.j.c
            if (r0 == 0) goto L10
            com.ss.android.socialbase.downloader.j.j r0 = com.ss.android.socialbase.downloader.j.j.j()
            com.ss.android.socialbase.appdownloader.j$d r1 = com.ss.android.socialbase.appdownloader.j.c
            r0.xt(r1)
            r0 = 0
            com.ss.android.socialbase.appdownloader.j.c = r0
        L10:
            com.ss.android.socialbase.appdownloader.j$d r1 = new com.ss.android.socialbase.appdownloader.j$d
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.socialbase.appdownloader.j.c = r1
            com.ss.android.socialbase.downloader.j.j r7 = com.ss.android.socialbase.downloader.j.j.j()
            com.ss.android.socialbase.appdownloader.j$d r8 = com.ss.android.socialbase.appdownloader.j.c
            r7.j(r8)
            return
    }

    private static void k(com.ss.android.socialbase.appdownloader.d r2, int r3) {
            int r0 = r2.b
            r1 = -1
            if (r0 == r1) goto Lb
            int r0 = r0 * 10
            int r0 = r0 + r3
            r2.b = r0
            return
        Lb:
            r2.b = r3
            return
    }

    public static void l(com.ss.android.socialbase.appdownloader.j.c r0) {
            com.ss.android.socialbase.appdownloader.j.b = r0
            return
    }

    public static boolean m() {
            int r0 = com.ss.android.socialbase.appdownloader.j.f.h
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public static boolean n(android.content.Context r3) {
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.e()     // Catch: java.lang.Throwable -> L26
            r2 = 26
            if (r1 == 0) goto L15
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L26
            if (r1 >= r2) goto L15
            boolean r3 = y(r3)     // Catch: java.lang.Throwable -> L26
            return r3
        L15:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L26
            if (r1 < r2) goto L26
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L26
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L26
            if (r1 < r2) goto L26
            boolean r3 = z(r3)     // Catch: java.lang.Throwable -> L26
            return r3
        L26:
            return r0
    }

    static /* synthetic */ boolean o(android.content.Context r0, android.content.Intent r1) {
            boolean r0 = E(r0, r1)
            return r0
    }

    public static boolean p(android.content.Context r3, @androidx.annotation.Nullable android.content.Intent r4, int r5, org.json.JSONObject r6) {
            r0 = 0
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.e()     // Catch: java.lang.Throwable -> L5d
            r2 = 26
            if (r1 == 0) goto L2f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5d
            if (r1 >= r2) goto L2f
            boolean r1 = y(r3)     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L2f
            com.ss.android.socialbase.appdownloader.j.f r1 = new com.ss.android.socialbase.appdownloader.j.f     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r1.a()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5d
            com.ss.android.socialbase.appdownloader.j$a r2 = new com.ss.android.socialbase.appdownloader.j$a     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            j(r3, r4, r5, r6, r2)     // Catch: java.lang.Throwable -> L5d
            android.content.Intent r4 = r1.xt()     // Catch: java.lang.Throwable -> L5d
            boolean r3 = E(r3, r4)     // Catch: java.lang.Throwable -> L5d
            return r3
        L2f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5d
            if (r1 < r2) goto L5d
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L5d
            if (r1 < r2) goto L5d
            boolean r1 = z(r3)     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5d
            com.ss.android.socialbase.appdownloader.j.m r1 = new com.ss.android.socialbase.appdownloader.j.m     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r1.a()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5d
            com.ss.android.socialbase.appdownloader.j$b r2 = new com.ss.android.socialbase.appdownloader.j$b     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            j(r3, r4, r5, r6, r2)     // Catch: java.lang.Throwable -> L5d
            android.content.Intent r4 = r1.xt()     // Catch: java.lang.Throwable -> L5d
            boolean r3 = E(r3, r4)     // Catch: java.lang.Throwable -> L5d
            return r3
        L5d:
            return r0
    }

    public static boolean q(android.content.Context r9, @androidx.annotation.Nullable android.content.Intent r10, org.json.JSONObject r11, int r12, @androidx.annotation.Nullable com.ss.android.socialbase.appdownloader.d r13) {
            r0 = 0
            if (r9 == 0) goto L9b
            if (r11 != 0) goto L7
            goto L9b
        L7:
            java.lang.String r1 = "jump_interval"
            r2 = 0
            long r4 = r11.optLong(r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L14
            return r0
        L14:
            java.lang.String r1 = "sp_ah_config"
            android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r9, r1, r0)
            java.lang.String r6 = "last_jump_unknown_source_time"
            long r2 = r1.getLong(r6, r2)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 / r2
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 >= 0) goto L2e
            return r0
        L2e:
            boolean r2 = n(r9)
            if (r2 != 0) goto L9b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = r1.putLong(r6, r2)
            r1.apply()
            java.lang.String r1 = "show_unknown_source_dialog"
            int r1 = r11.optInt(r1, r0)
            r2 = 1
            if (r1 != r2) goto L91
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity> r3 = com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.class
            r1.<init>(r9, r3)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r3)
            java.lang.String r3 = "intent"
            r1.putExtra(r3, r10)
            java.lang.String r10 = "config"
            java.lang.String r3 = r11.toString()
            r1.putExtra(r10, r3)
            java.lang.String r10 = "id"
            r1.putExtra(r10, r12)
            boolean r9 = r(r9, r1, r0)     // Catch: java.lang.Throwable -> L75
            if (r9 == 0) goto L77
            x(r12, r11)     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            r9 = move-exception
            goto L78
        L77:
            return r2
        L78:
            if (r13 == 0) goto L90
            r13.b = r2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "tryShowUnknownSourceDialog"
            r10.<init>(r11)
            java.lang.String r9 = g(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r13.c = r9
        L90:
            return r0
        L91:
            boolean r9 = p(r9, r10, r12, r11)
            if (r9 == 0) goto L9a
            a(r12, r11)
        L9a:
            return r2
        L9b:
            return r0
    }

    public static boolean r(android.content.Context r3, android.content.Intent r4, boolean r5) {
            r0 = 0
            if (r3 == 0) goto L1a
            if (r4 != 0) goto L6
            goto L1a
        L6:
            java.lang.String r1 = "start_only_for_android"
            r2 = 1
            if (r5 == 0) goto L13
            r4.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L12
            r3.startActivity(r4)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
        L13:
            r4.putExtra(r1, r2)
            r3.startActivity(r4)
            return r2
        L1a:
            return r0
    }

    private static boolean s(android.content.Context r11, com.ss.android.socialbase.downloader.ae.cw r12, android.content.Intent r13, org.json.JSONObject r14, boolean r15) {
            r0 = 0
            if (r14 == 0) goto L1ab
            if (r12 != 0) goto L7
            goto L1ab
        L7:
            com.ss.android.socialbase.appdownloader.d r1 = new com.ss.android.socialbase.appdownloader.d
            r1.<init>()
            java.lang.String r2 = "type"
            java.lang.String r2 = r14.optString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1ab
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r12)
            r1.a = r2
            r2.getClass()
            int r4 = r2.hashCode()
            java.lang.String r5 = "plan_f"
            r6 = 4
            java.lang.String r7 = "plan_d"
            r8 = 2
            r9 = -1
            r10 = 1
            switch(r4) {
                case -985763637: goto L7b;
                case -985763636: goto L70;
                case -985763635: goto L65;
                case -985763634: goto L5c;
                case -985763633: goto L51;
                case -985763632: goto L48;
                case -985763631: goto L3d;
                case -985763630: goto L32;
                default: goto L30;
            }
        L30:
            r4 = -1
            goto L85
        L32:
            java.lang.String r4 = "plan_h"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L3b
            goto L30
        L3b:
            r4 = 7
            goto L85
        L3d:
            java.lang.String r4 = "plan_g"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L46
            goto L30
        L46:
            r4 = 6
            goto L85
        L48:
            boolean r4 = r2.equals(r5)
            if (r4 != 0) goto L4f
            goto L30
        L4f:
            r4 = 5
            goto L85
        L51:
            java.lang.String r4 = "plan_e"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L5a
            goto L30
        L5a:
            r4 = 4
            goto L85
        L5c:
            boolean r4 = r2.equals(r7)
            if (r4 != 0) goto L63
            goto L30
        L63:
            r4 = 3
            goto L85
        L65:
            java.lang.String r4 = "plan_c"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L6e
            goto L30
        L6e:
            r4 = 2
            goto L85
        L70:
            java.lang.String r4 = "plan_b"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L79
            goto L30
        L79:
            r4 = 1
            goto L85
        L7b:
            java.lang.String r4 = "plan_a"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L84
            goto L30
        L84:
            r4 = 0
        L85:
            switch(r4) {
                case 0: goto L155;
                case 1: goto L13a;
                case 2: goto L111;
                case 3: goto Lf4;
                case 4: goto L155;
                case 5: goto L162;
                case 6: goto Le3;
                case 7: goto L8a;
                default: goto L88;
            }
        L88:
            goto L18a
        L8a:
            java.lang.String r15 = "bh"
            java.lang.String r15 = r3.cw(r15)
            java.lang.String r2 = "s"
            java.lang.String r2 = r3.cw(r2)
            java.lang.String r15 = com.ss.android.socialbase.appdownloader.m.a.b(r15, r2)
            com.ss.android.socialbase.appdownloader.d r14 = e(r14, r15, r11, r3)
            int r2 = r14.b
            if (r2 == 0) goto La5
            r1 = r14
            goto L18a
        La5:
            java.lang.String r14 = r11.getPackageName()
            org.json.JSONObject r2 = com.ss.android.socialbase.downloader.jy.j.xt()
            boolean r15 = com.ss.android.socialbase.appdownloader.m.b.g(r2, r11, r15)
            if (r15 == 0) goto Ldd
            com.ss.android.socialbase.appdownloader.b.j(r11, r13)     // Catch: java.lang.Throwable -> Lc2
            r1.b = r0     // Catch: java.lang.Throwable -> Lc2
            org.json.JSONObject r15 = com.ss.android.socialbase.downloader.jy.j.xt()
            com.ss.android.socialbase.appdownloader.m.b.g(r15, r11, r14)
        Lbf:
            r0 = 1
            goto L18a
        Lc2:
            r15 = move-exception
            r1.b = r10     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> Ld4
            r1.c = r15     // Catch: java.lang.Throwable -> Ld4
            org.json.JSONObject r15 = com.ss.android.socialbase.downloader.jy.j.xt()
            com.ss.android.socialbase.appdownloader.m.b.g(r15, r11, r14)
            goto L18a
        Ld4:
            r12 = move-exception
            org.json.JSONObject r13 = com.ss.android.socialbase.downloader.jy.j.xt()
            com.ss.android.socialbase.appdownloader.m.b.g(r13, r11, r14)
            throw r12
        Ldd:
            r11 = 11
            r1.b = r11
            goto L18a
        Le3:
            com.ss.android.socialbase.appdownloader.d r15 = A(r14, r3)
            int r2 = r15.b
            if (r2 == 0) goto Lee
        Leb:
            r1 = r15
            goto L18a
        Lee:
            boolean r0 = v(r11, r12, r14, r1, r3)
            goto L18a
        Lf4:
            r1.a = r7
            boolean r14 = com.ss.android.socialbase.appdownloader.m.e.p()
            if (r14 != 0) goto L100
            r1.b = r8
            goto L18a
        L100:
            com.ss.android.socialbase.appdownloader.b.j(r11, r13)     // Catch: java.lang.Throwable -> L106
            r1.b = r0     // Catch: java.lang.Throwable -> L106
            goto Lbf
        L106:
            r11 = move-exception
            r1.b = r6
            java.lang.String r11 = r11.toString()
            r1.c = r11
            goto L18a
        L111:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 >= r3) goto L11d
            boolean r2 = com.ss.android.socialbase.appdownloader.m.e.e()
            if (r2 == 0) goto L18a
        L11d:
            java.lang.String r2 = "enable_for_all"
            int r2 = r14.optInt(r2, r0)
            if (r2 != r10) goto L126
            goto L128
        L126:
            if (r15 == 0) goto L18a
        L128:
            java.lang.String r15 = "show_unknown_source_on_startup"
            int r15 = r14.optInt(r15)
            if (r15 != r10) goto L131
            goto L18a
        L131:
            int r15 = r12.ae()
            boolean r0 = q(r11, r13, r14, r15, r1)
            goto L18a
        L13a:
            com.ss.android.socialbase.appdownloader.d r15 = d(r14, r3)
            int r2 = r15.b
            if (r2 == 0) goto L143
            goto Leb
        L143:
            boolean r15 = r12.ag()
            if (r15 != 0) goto L150
            int r11 = r12.jy(r9)
            r1.b = r11
            goto L18a
        L150:
            boolean r0 = F(r11, r12, r14, r1)
            goto L18a
        L155:
            boolean r15 = r12.ag()
            if (r15 != 0) goto L162
            int r11 = r12.jy(r9)
            r1.b = r11
            goto L18a
        L162:
            com.ss.android.socialbase.appdownloader.d r15 = d(r14, r3)
            int r3 = r15.b
            if (r3 == 0) goto L16b
            goto Leb
        L16b:
            boolean r15 = r2.equals(r5)
            if (r15 == 0) goto L186
            java.lang.String r15 = "file_content_uri"
            java.lang.String r15 = r12.ws(r15)
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 == 0) goto L186
            r11 = 10
            int r11 = r12.jy(r11)
            r1.b = r11
            goto L18a
        L186:
            boolean r0 = u(r11, r12, r14, r1)
        L18a:
            if (r0 == 0) goto L199
            java.util.concurrent.ConcurrentHashMap r11 = r12.vm()
            java.lang.String r14 = "ah_attempt"
            java.lang.String r15 = r1.b()
            r11.put(r14, r15)
        L199:
            com.ss.android.socialbase.appdownloader.j$c r11 = com.ss.android.socialbase.appdownloader.j.b
            if (r11 == 0) goto L1ab
            java.util.concurrent.ConcurrentHashMap r11 = r12.vm()
            java.lang.String r14 = "intent"
            r11.put(r14, r13)
            com.ss.android.socialbase.appdownloader.j$c r11 = com.ss.android.socialbase.appdownloader.j.b
            r11.a(r12, r1)
        L1ab:
            return r0
    }

    public static boolean t(android.content.Context r6, com.ss.android.socialbase.downloader.ae.cw r7, android.content.Intent r8, boolean r9) {
            int r0 = r7.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "ah_plans"
            org.json.JSONArray r0 = r0.up(r1)
            r1 = 0
            if (r0 == 0) goto L2d
            int r2 = r0.length()
            r3 = 0
        L16:
            if (r3 >= r2) goto L2d
            org.json.JSONObject r4 = r0.optJSONObject(r3)
            boolean r5 = com.ss.android.socialbase.appdownloader.m.b.f(r4)
            if (r5 == 0) goto L2a
            boolean r4 = s(r6, r7, r8, r4, r9)
            if (r4 == 0) goto L2a
            r6 = 1
            return r6
        L2a:
            int r3 = r3 + 1
            goto L16
        L2d:
            return r1
    }

    private static boolean u(android.content.Context r9, com.ss.android.socialbase.downloader.ae.cw r10, org.json.JSONObject r11, com.ss.android.socialbase.appdownloader.d r12) {
            r0 = 0
            if (r9 == 0) goto L92
            if (r11 != 0) goto L7
            goto L92
        L7:
            java.lang.String r1 = "device_plans"
            java.lang.String r1 = r11.optString(r1)
            r12.e = r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L92
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            java.lang.String r2 = r10.qv()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L26
            return r0
        L26:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r1.length
            r5 = 0
        L32:
            if (r5 >= r4) goto L82
            r6 = r1[r5]
            com.ss.android.socialbase.appdownloader.j.d r7 = com.ss.android.socialbase.appdownloader.j.i.a(r9, r6, r11, r10)
            if (r7 == 0) goto L7a
            android.content.Intent r7 = r7.xt()
            if (r7 == 0) goto L6e
            boolean r8 = w(r3, r10, r11)
            if (r8 == 0) goto L61
            r8 = 1
            r(r9, r7, r0)     // Catch: java.lang.Throwable -> L4d
            goto L84
        L4d:
            r7 = move-exception
            r2.append(r6)
            java.lang.String r6 = " startActivity failed : "
            r2.append(r6)
            java.lang.String r6 = g(r7)
            r2.append(r6)
            k(r12, r8)
            goto L7a
        L61:
            r7 = 6
            k(r12, r7)
            r2.append(r6)
            java.lang.String r6 = " createDescFile failed! "
            r2.append(r6)
            goto L7a
        L6e:
            r7 = 3
            k(r12, r7)
            r2.append(r6)
            java.lang.String r6 = " resolveActivity failed! "
            r2.append(r6)
        L7a:
            java.lang.String r6 = "  "
            r2.append(r6)
            int r5 = r5 + 1
            goto L32
        L82:
            r6 = 0
            r8 = 0
        L84:
            if (r8 != 0) goto L8d
            java.lang.String r9 = r2.toString()
            r12.c = r9
            goto L91
        L8d:
            r12.d = r6
            r12.b = r0
        L91:
            return r8
        L92:
            return r0
    }

    private static boolean v(android.content.Context r2, @androidx.annotation.NonNull com.ss.android.socialbase.downloader.ae.cw r3, org.json.JSONObject r4, @androidx.annotation.NonNull com.ss.android.socialbase.appdownloader.d r5, com.ss.android.socialbase.downloader.jy.j r6) {
            java.lang.String r6 = "type"
            java.lang.String r6 = r4.optString(r6)
            r5.a = r6
            java.lang.String r0 = "vbi"
            com.ss.android.socialbase.appdownloader.j.d r3 = com.ss.android.socialbase.appdownloader.j.i.a(r2, r0, r4, r3)
            android.content.Intent r3 = r3.xt()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r0 = 0
            r1 = 1
            boolean r2 = E(r2, r3)     // Catch: java.lang.Throwable -> L1e
            goto L32
        L1e:
            r2 = move-exception
            r4.append(r6)
            java.lang.String r3 = " startActivity failed : "
            r4.append(r3)
            java.lang.String r2 = g(r2)
            r4.append(r2)
            k(r5, r1)
            r2 = 0
        L32:
            if (r2 != 0) goto L3b
            java.lang.String r2 = r4.toString()
            r5.c = r2
            goto L3d
        L3b:
            r5.b = r0
        L3d:
            return r1
    }

    private static boolean w(java.io.File r2, com.ss.android.socialbase.downloader.ae.cw r3, @androidx.annotation.NonNull org.json.JSONObject r4) {
            r4 = 0
            if (r2 != 0) goto L4
            return r4
        L4:
            java.lang.String r2 = r2.getPath()
            int r3 = r3.ae()
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            java.lang.String r0 = "download_dir"
            org.json.JSONObject r3 = r3.r(r0)
            r0 = 0
            if (r3 == 0) goto L20
            java.lang.String r1 = "ins_desc"
            java.lang.String r3 = r3.optString(r1)
            goto L21
        L20:
            r3 = r0
        L21:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L46
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L46
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
        L46:
            if (r0 == 0) goto L53
            boolean r2 = r0.createNewFile()     // Catch: java.io.IOException -> L52
            if (r2 == 0) goto L53
            r0.deleteOnExit()     // Catch: java.io.IOException -> L52
            goto L53
        L52:
            return r4
        L53:
            r2 = 1
            return r2
    }

    private static void x(int r3, org.json.JSONObject r4) {
            java.lang.String r0 = "show_unknown_source_on_startup"
            int r4 = r4.optInt(r0)
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "scene"
            if (r4 == 0) goto L16
            goto L17
        L16:
            r0 = 2
        L17:
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1b
            goto L1f
        L1b:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L1f:
            com.ss.android.socialbase.downloader.tl.cw r4 = com.ss.android.socialbase.downloader.downloader.cw.ol()
            java.lang.String r0 = "guide_auth_dialog_show"
            r4.xt(r3, r0, r1)
            return
    }

    private static boolean y(android.content.Context r2) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "install_non_market_apps"
            int r2 = android.provider.Settings.Secure.getInt(r2, r1, r0)     // Catch: java.lang.Throwable -> L13
            if (r2 <= 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
        L13:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 26)
    private static boolean z(android.content.Context r1) {
            r0 = 1
            if (r1 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = com.beizi.ad.n.a(r1)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            return r0
    }
}
