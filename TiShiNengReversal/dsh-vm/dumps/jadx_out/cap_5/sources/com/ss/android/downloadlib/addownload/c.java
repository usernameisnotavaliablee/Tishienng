package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static java.lang.String b = "c";
    private static volatile com.ss.android.downloadlib.addownload.c c;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Runnable> a;

    class a implements com.ss.android.downloadlib.j.InterfaceC0216j {
        final /* synthetic */ com.ss.android.downloadlib.addownload.l a;
        final /* synthetic */ int b;
        final /* synthetic */ com.ss.android.j.j.cw.b c;
        final /* synthetic */ com.ss.android.downloadlib.addownload.c d;

        a(com.ss.android.downloadlib.addownload.c r1, com.ss.android.downloadlib.addownload.l r2, int r3, com.ss.android.j.j.cw.b r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.j.InterfaceC0216j
        public void j(boolean r5) {
                r4 = this;
                com.ss.android.downloadlib.addownload.c r0 = r4.d
                com.ss.android.downloadlib.addownload.l r1 = r4.a
                int r2 = r4.b
                com.ss.android.j.j.cw.b r3 = r4.c
                r0.d(r1, r5, r2, r3)
                return
        }
    }

    public class b {
        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        public static void a() {
                com.ss.android.socialbase.appdownloader.f r0 = com.ss.android.socialbase.appdownloader.f.L()
                android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
                java.util.List r0 = r0.n(r1)
                if (r0 == 0) goto L7a
                int r1 = r0.size()
                if (r1 <= 0) goto L7a
                r1 = 0
                r2 = 0
            L16:
                int r3 = r0.size()
                if (r2 >= r3) goto L7a
                java.lang.Object r3 = r0.get(r2)
                com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3
                java.io.File r4 = new java.io.File
                java.lang.String r5 = r3.vl()
                java.lang.String r6 = r3.jy()
                r4.<init>(r5, r6)
                long r5 = r4.lastModified()
                int r7 = r3.ae()
                com.ss.android.socialbase.downloader.jy.j r7 = com.ss.android.socialbase.downloader.jy.j.j(r7)
                java.lang.String r8 = "download_file_expire_hours"
                int r7 = r7.j(r8, r1)
                long r7 = (long) r7
                r9 = 3600000(0x36ee80, double:1.7786363E-317)
                long r7 = r7 * r9
                r9 = 0
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 > 0) goto L50
                r7 = 604800000(0x240c8400, double:2.988109026E-315)
            L50:
                boolean r9 = r4.isFile()
                if (r9 == 0) goto L77
                boolean r9 = r4.exists()
                if (r9 == 0) goto L77
                long r9 = java.lang.System.currentTimeMillis()
                long r9 = r9 - r5
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 < 0) goto L77
                c(r4)
                android.content.Context r4 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r4 = com.ss.android.socialbase.downloader.downloader.ae.xt(r4)
                int r3 = r3.ae()
                r4.oq(r3)
            L77:
                int r2 = r2 + 1
                goto L16
            L7a:
                return
        }

        public static void b(android.content.Context r0) {
                if (r0 == 0) goto L14
                java.io.File r0 = r0.getExternalCacheDir()
                if (r0 == 0) goto L14
                java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L10
                d(r0)     // Catch: java.lang.Exception -> L10
                return
            L10:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
            L14:
                return
        }

        public static void c(java.io.File r3) {
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
                java.lang.String r0 = "1"
                byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
                r1.write(r0)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
                r1.close()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
                goto L2b
            L13:
                r3 = move-exception
                r0 = r1
                goto L2f
            L16:
                r0 = move-exception
                goto L1e
            L18:
                r3 = move-exception
                goto L2f
            L1a:
                r1 = move-exception
                r2 = r1
                r1 = r0
                r0 = r2
            L1e:
                com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L2b
                r1.close()     // Catch: java.lang.Exception -> L27
                goto L2b
            L27:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
            L2b:
                r3.delete()
                return
            L2f:
                if (r0 == 0) goto L39
                r0.close()     // Catch: java.lang.Exception -> L35
                goto L39
            L35:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
            L39:
                throw r3
        }

        private static void d(java.lang.String r7) {
                java.io.File r0 = new java.io.File
                r0.<init>(r7)
                boolean r1 = r0.exists()
                if (r1 != 0) goto Lc
                goto L1c
            Lc:
                boolean r1 = r0.isFile()
                if (r1 == 0) goto L16
                r0.delete()
                return
            L16:
                java.lang.String[] r1 = r0.list()
                if (r1 != 0) goto L1d
            L1c:
                return
            L1d:
                int r2 = r1.length
                r3 = 0
            L1f:
                if (r3 >= r2) goto L69
                r4 = r1[r3]
                if (r4 == 0) goto L66
                java.lang.String r5 = java.io.File.separator
                boolean r6 = r7.endsWith(r5)
                if (r6 == 0) goto L3d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r7)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                goto L4f
            L3d:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r7)
                r6.append(r5)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
            L4f:
                java.io.File r5 = new java.io.File
                r5.<init>(r4)
                boolean r6 = r5.isFile()
                if (r6 == 0) goto L5d
                r5.delete()
            L5d:
                boolean r5 = r5.isDirectory()
                if (r5 == 0) goto L66
                d(r4)
            L66:
                int r3 = r3 + 1
                goto L1f
            L69:
                r0.delete()
                return
        }

        public static void e() {
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                java.lang.String r1 = "application/vnd.android.package-archive"
                java.util.List r0 = r0.xt(r1)
                if (r0 == 0) goto L89
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L17
                goto L89
            L17:
                r1 = 0
                r2 = 0
            L19:
                int r3 = r0.size()
                if (r2 >= r3) goto L89
                java.lang.Object r3 = r0.get(r2)
                com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3
                if (r3 == 0) goto L86
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r3.qv()
                r4.append(r5)
                java.lang.String r5 = java.io.File.separator
                r4.append(r5)
                java.lang.String r5 = r3.tl()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.io.File r5 = new java.io.File
                r5.<init>(r4)
                boolean r6 = r5.exists()
                if (r6 == 0) goto L86
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r5.lastModified()
                long r6 = r6 - r8
                int r3 = r3.ae()
                com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
                java.lang.String r8 = "download_complete_file_expire_hours"
                int r3 = r3.j(r8, r1)
                long r8 = (long) r3
                r10 = 3600000(0x36ee80, double:1.7786363E-317)
                long r8 = r8 * r10
                r10 = 0
                int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r3 > 0) goto L74
                r8 = 604800000(0x240c8400, double:2.988109026E-315)
            L74:
                int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r3 < 0) goto L79
                goto L83
            L79:
                android.content.Context r3 = com.ss.android.downloadlib.addownload.m.getContext()
                boolean r3 = com.ss.android.downloadlib.a.h.C(r3, r4)
                if (r3 == 0) goto L86
            L83:
                c(r5)
            L86:
                int r2 = r2 + 1
                goto L19
            L89:
                return
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.c$c, reason: collision with other inner class name */
    public class C0199c implements com.ss.android.socialbase.downloader.r.mi {
        private int a;

        public C0199c() {
                r0 = this;
                r0.<init>()
                return
        }

        private void a() {
                r0 = this;
                com.ss.android.downloadlib.addownload.m.b()
                com.ss.android.downloadlib.addownload.c.b.a()
                com.ss.android.downloadlib.addownload.c.b.e()
                return
        }

        private void c(long r17, long r19, long r21, long r23, long r25) {
                r16 = this;
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                r1 = r16
                int r2 = r1.a
                com.ss.android.socialbase.downloader.ae.cw r4 = r0.tl(r2)
                if (r4 != 0) goto L13
                return
            L13:
                int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r0 <= 0) goto L1a
                r0 = 1
                r15 = 1
                goto L1c
            L1a:
                r0 = 0
                r15 = 0
            L1c:
                com.ss.android.downloadlib.d r3 = com.ss.android.downloadlib.d.d()     // Catch: java.lang.Exception -> L2e
                r5 = r17
                r7 = r19
                r9 = r21
                r11 = r23
                r13 = r25
                r3.l(r4, r5, r7, r9, r11, r13, r15)     // Catch: java.lang.Exception -> L2e
                return
            L2e:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
                return
        }

        private boolean d(com.ss.android.socialbase.downloader.jy.j r10) {
                r9 = this;
                java.lang.String r0 = "clear_space_use_disk_handler"
                r1 = 0
                int r0 = r10.j(r0, r1)
                r2 = 1
                if (r0 == r2) goto Lb
                return r1
            Lb:
                java.lang.String r0 = "clear_space_min_time_interval"
                r3 = 600000(0x927c0, double:2.964394E-318)
                long r3 = r10.j(r0, r3)
                long r5 = java.lang.System.currentTimeMillis()
                com.ss.android.downloadlib.addownload.c$d r10 = com.ss.android.downloadlib.addownload.c.d.b()
                long r7 = r10.h()
                long r5 = r5 - r7
                int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r10 >= 0) goto L26
                return r1
            L26:
                return r2
        }

        private long e(com.ss.android.socialbase.downloader.jy.j r6) {
                r5 = this;
                java.lang.String r0 = "clear_space_sleep_time"
                r1 = 0
                long r3 = r6.j(r0, r1)
                int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r6 > 0) goto Ld
                return r1
            Ld:
                r0 = 5000(0x1388, double:2.4703E-320)
                int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r6 <= 0) goto L14
                r3 = r0
            L14:
                java.lang.String r6 = "waiting for space clear, sleepTime = "
                java.lang.String r0 = java.lang.String.valueOf(r3)
                java.lang.String r6 = r6.concat(r0)
                java.lang.String r0 = "AppDownloadDiskSpaceHandler"
                r1 = 0
                com.ss.android.downloadlib.a.k.e(r0, r6, r1)
                java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L28
                goto L2c
            L28:
                r6 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r6)
            L2c:
                java.lang.String r6 = "waiting end!"
                com.ss.android.downloadlib.a.k.e(r0, r6, r1)
                return r3
        }

        public void b(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public boolean j(long r17, long r19, com.ss.android.socialbase.downloader.r.w r21) {
                r16 = this;
                r0 = r16
                r5 = r19
                int r1 = r0.a
                com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.j(r1)
                boolean r2 = r0.d(r1)
                r11 = 0
                if (r2 != 0) goto L12
                return r11
            L12:
                long r2 = java.lang.System.currentTimeMillis()
                com.ss.android.downloadlib.addownload.c$d r4 = com.ss.android.downloadlib.addownload.c.d.b()
                r4.a()
                r7 = 0
                long r9 = com.ss.android.downloadlib.a.h.I(r7)
                r0.a()
                long r12 = com.ss.android.downloadlib.a.h.I(r7)
                long r14 = java.lang.System.currentTimeMillis()
                long r14 = r14 - r2
                int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r2 >= 0) goto L40
                long r1 = r0.e(r1)
                int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r3 <= 0) goto L3f
                long r12 = com.ss.android.downloadlib.a.h.I(r7)
            L3f:
                r7 = r1
            L40:
                r3 = r12
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "cleanUpDisk, byteRequired = "
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ", byteAvailableAfter = "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = ", cleaned = "
                r1.append(r2)
                long r12 = r3 - r9
                r1.append(r12)
                java.lang.String r1 = r1.toString()
                r2 = 0
                java.lang.String r12 = "AppDownloadDiskSpaceHandler"
                com.ss.android.downloadlib.a.k.e(r12, r1, r2)
                r1 = r9
                r9 = r7
                r7 = r14
                r0.c(r1, r3, r5, r7, r9)
                int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
                if (r0 >= 0) goto L72
                return r11
            L72:
                if (r21 == 0) goto L77
                r21.j()
            L77:
                r0 = 1
                return r0
        }
    }

    public class d {
        private static volatile com.ss.android.downloadlib.addownload.c.d e;
        private long a;
        private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.downloadlib.addownload.c.e> b;
        private java.util.HashMap<java.lang.String, java.lang.Integer> c;
        private java.util.List<java.lang.String> d;

        public d() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r2.b = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.c = r0
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r2.d = r0
                return
        }

        public static com.ss.android.downloadlib.addownload.c.d b() {
                com.ss.android.downloadlib.addownload.c$d r0 = com.ss.android.downloadlib.addownload.c.d.e
                if (r0 != 0) goto L19
                java.lang.Class<com.ss.android.downloadlib.addownload.c$d> r0 = com.ss.android.downloadlib.addownload.c.d.class
                monitor-enter(r0)
                com.ss.android.downloadlib.addownload.c$d r1 = com.ss.android.downloadlib.addownload.c.d.e     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                com.ss.android.downloadlib.addownload.c$d r1 = new com.ss.android.downloadlib.addownload.c$d     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                com.ss.android.downloadlib.addownload.c.d.e = r1     // Catch: java.lang.Throwable -> L13
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
                com.ss.android.downloadlib.addownload.c$d r0 = com.ss.android.downloadlib.addownload.c.d.e
                return r0
        }

        @androidx.annotation.WorkerThread
        public static void c(com.ss.android.socialbase.downloader.ae.cw r3) {
                if (r3 != 0) goto L3
                goto L4c
            L3:
                int r0 = r3.ae()
                com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
                java.lang.String r1 = "delete_file_after_install"
                r2 = 0
                int r0 = r0.j(r1, r2)
                if (r0 != 0) goto L15
                goto L4c
            L15:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
                r0.<init>()     // Catch: java.lang.Exception -> L4d
                java.lang.String r1 = r3.qv()     // Catch: java.lang.Exception -> L4d
                r0.append(r1)     // Catch: java.lang.Exception -> L4d
                java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Exception -> L4d
                r0.append(r1)     // Catch: java.lang.Exception -> L4d
                java.lang.String r3 = r3.tl()     // Catch: java.lang.Exception -> L4d
                r0.append(r3)     // Catch: java.lang.Exception -> L4d
                java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L4d
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L4d
                if (r0 == 0) goto L38
                goto L4c
            L38:
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L4d
                r0.<init>(r3)     // Catch: java.lang.Exception -> L4d
                boolean r3 = r0.isFile()     // Catch: java.lang.Exception -> L4d
                if (r3 == 0) goto L4c
                boolean r3 = r0.exists()     // Catch: java.lang.Exception -> L4d
                if (r3 == 0) goto L4c
                r0.delete()     // Catch: java.lang.Exception -> L4d
            L4c:
                return
            L4d:
                r3 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r3)
                return
        }

        @androidx.annotation.WorkerThread
        public static void d(com.ss.android.xt.j.xt.b r5) {
                if (r5 == 0) goto L23
                long r0 = r5.xt()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto Ld
                goto L23
            Ld:
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                int r5 = r5.mi()
                com.ss.android.socialbase.downloader.ae.cw r5 = r0.tl(r5)
                if (r5 != 0) goto L20
                goto L23
            L20:
                c(r5)
            L23:
                return
        }

        void a() {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                return
        }

        public void e(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto Lb
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.downloadlib.addownload.c$e> r0 = r1.b
                r0.remove(r2)
            Lb:
                return
        }

        public void f(java.lang.String r2, com.ss.android.downloadlib.addownload.c.e r3) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto Lb
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.downloadlib.addownload.c$e> r0 = r1.b
                r0.put(r2, r3)
            Lb:
                return
        }

        public int g(java.lang.String r3) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r2.c
                if (r0 != 0) goto L13
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.c = r0
            L13:
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r2.c
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L28
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r2.c
                java.lang.Object r3 = r0.get(r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                return r3
            L28:
                return r1
        }

        long h() {
                r2 = this;
                long r0 = r2.a
                return r0
        }
    }

    public interface e {
    }

    public class f implements java.lang.Runnable {
        private com.ss.android.socialbase.downloader.ae.cw a;

        class a implements com.ss.android.downloadlib.addownload.c.e {
            final /* synthetic */ com.ss.android.xt.j.xt.b a;
            final /* synthetic */ com.ss.android.downloadlib.addownload.c.f b;

            a(com.ss.android.downloadlib.addownload.c.f r1, com.ss.android.xt.j.xt.b r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }
        }

        public f(com.ss.android.socialbase.downloader.ae.cw r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r12 = this;
                com.ss.android.socialbase.downloader.ae.cw r0 = r12.a
                if (r0 != 0) goto L6
                goto Le1
            L6:
                com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
                com.ss.android.socialbase.downloader.ae.cw r1 = r12.a
                com.ss.android.xt.j.xt.b r1 = r0.f(r1)
                if (r1 != 0) goto L14
                goto Le1
            L14:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "cleanspace_task"
                r0.m(r2, r1)
                com.ss.android.socialbase.downloader.ae.cw r0 = r12.a
                int r0 = r0.ae()
                double r2 = com.ss.android.downloadlib.a.n.h(r0)
                r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r2 + r4
                com.ss.android.socialbase.downloader.ae.cw r0 = r12.a
                long r4 = r0.ka()
                double r4 = (double) r4
                double r2 = r2 * r4
                java.lang.Double r0 = java.lang.Double.valueOf(r2)
                long r2 = r0.longValue()
                com.ss.android.socialbase.downloader.ae.cw r0 = r12.a
                long r4 = r0.uq()
                long r10 = r2 - r4
                r2 = 0
                long r4 = com.ss.android.downloadlib.a.h.I(r2)
                v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
                if (r0 == 0) goto L52
                com.ss.android.downloadlib.addownload.m.v()
            L52:
                com.ss.android.downloadlib.addownload.c.b.a()
                com.ss.android.downloadlib.addownload.c.b.e()
                int r0 = r1.mi()
                boolean r0 = com.ss.android.downloadlib.a.n.b(r0)
                if (r0 == 0) goto L69
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.downloadlib.addownload.c.b.b(r0)
            L69:
                long r2 = com.ss.android.downloadlib.a.h.I(r2)
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 < 0) goto Lac
                java.lang.String r0 = "1"
                r1.M0(r0)
                com.ss.android.downloadlib.addownload.o$d r0 = com.ss.android.downloadlib.addownload.o.d.c()
                r0.d(r1)
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                java.lang.String r0 = "quite_clean_size"
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L8d
                r6.putOpt(r0, r2)     // Catch: org.json.JSONException -> L8d
                goto L91
            L8d:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
            L91:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r2 = "cleanspace_download_after_quite_clean"
                r0.r(r2, r6, r1)
                android.content.Context r0 = com.ss.android.downloadlib.addownload.m.getContext()
                com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
                com.ss.android.socialbase.downloader.ae.cw r1 = r12.a
                int r1 = r1.ae()
                r0.up(r1)
                return
            Lac:
                v2.b r0 = com.ss.android.downloadlib.addownload.m.v()
                if (r0 == 0) goto Le2
                r0 = 0
                r1.s0(r0)
                com.ss.android.downloadlib.addownload.c$d r0 = com.ss.android.downloadlib.addownload.c.d.b()
                java.lang.String r2 = r1.j()
                com.ss.android.downloadlib.addownload.c$f$a r3 = new com.ss.android.downloadlib.addownload.c$f$a
                r3.<init>(r12, r1)
                r0.f(r2, r3)
                v2.b r6 = com.ss.android.downloadlib.addownload.m.v()
                com.ss.android.socialbase.downloader.ae.cw r0 = r12.a
                int r7 = r0.ae()
                com.ss.android.socialbase.downloader.ae.cw r0 = r12.a
                java.lang.String r8 = r0.oq()
                r9 = 1
                boolean r0 = r6.a(r7, r8, r9, r10)
                if (r0 == 0) goto Le1
                r0 = 1
                r1.J0(r0)
            Le1:
                return
            Le2:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r0 = "show_dialog_result"
                r3 = 3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> Lf2
                r2.putOpt(r0, r3)     // Catch: org.json.JSONException -> Lf2
                goto Lf6
            Lf2:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
            Lf6:
                com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
                java.lang.String r3 = "cleanspace_window_show"
                r0.r(r3, r2, r1)
                return
        }
    }

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public static com.ss.android.downloadlib.addownload.c a() {
            com.ss.android.downloadlib.addownload.c r0 = com.ss.android.downloadlib.addownload.c.c
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.addownload.c> r0 = com.ss.android.downloadlib.addownload.c.class
            monitor-enter(r0)
            com.ss.android.downloadlib.addownload.c r1 = com.ss.android.downloadlib.addownload.c.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.addownload.c r1 = new com.ss.android.downloadlib.addownload.c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.addownload.c.c = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.addownload.c r0 = com.ss.android.downloadlib.addownload.c.c
            return r0
    }

    private void b(long r2, boolean r4, int r5) {
            r1 = this;
            com.ss.android.downloadlib.r.b r0 = com.ss.android.downloadlib.r.b.a()
            r0.f(r2, r4, r5)
            if (r4 == 0) goto Lc
            com.ss.android.downloadlib.addownload.m.C()
        Lc:
            return
    }

    public static boolean e(com.ss.android.socialbase.downloader.ae.cw r1) {
            if (r1 == 0) goto L12
            int r0 = r1.i()
            if (r0 == 0) goto L12
            int r1 = r1.i()
            r0 = -4
            if (r1 != r0) goto L10
            goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public void c(com.ss.android.downloadlib.addownload.l r3, int r4, com.ss.android.j.j.cw.b r5) {
            r2 = this;
            com.ss.android.downloadlib.j$l r0 = com.ss.android.downloadlib.j.l.b()
            com.ss.android.downloadlib.addownload.c$a r1 = new com.ss.android.downloadlib.addownload.c$a
            r1.<init>(r2, r3, r4, r5)
            long r3 = r2.f()
            r0.d(r1, r3)
            return
    }

    public void d(com.ss.android.downloadlib.addownload.l r5, boolean r6, int r7, com.ss.android.j.j.cw.b r8) {
            r4 = this;
            boolean r0 = r8 instanceof com.ss.android.xt.j.j.a
            if (r0 == 0) goto Lb
            r0 = r8
            com.ss.android.xt.j.j.a r0 = (com.ss.android.xt.j.j.a) r0
            r1 = 3
            r0.e(r1)
        Lb:
            long r0 = r8.r()
            r8 = 4
            r2 = 0
            r3 = 1
            if (r7 == r8) goto L52
            r8 = 5
            if (r7 == r8) goto L45
            r5 = 7
            if (r7 == r5) goto L1b
            return
        L1b:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Runnable> r5 = r4.a
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Object r5 = r5.remove(r7)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            if (r6 == 0) goto L34
            com.ss.android.downloadlib.r.b r5 = com.ss.android.downloadlib.r.b.a()
            r5.c(r0, r3)
            r4.b(r0, r3, r3)
            return
        L34:
            if (r5 == 0) goto L41
            com.ss.android.downloadlib.c r6 = com.ss.android.downloadlib.c.d()
            android.os.Handler r6 = r6.s()
            r6.post(r5)
        L41:
            r4.b(r0, r2, r3)
            return
        L45:
            if (r6 != 0) goto L4e
            r4.b(r0, r2, r3)
            r5.n(r2)
            return
        L4e:
            r4.b(r0, r3, r3)
            return
        L52:
            r7 = 2
            if (r6 != 0) goto L5c
            r4.b(r0, r2, r7)
            r5.X(r2)
            return
        L5c:
            r4.b(r0, r3, r7)
            return
    }

    public long f() {
            r4 = this;
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "quick_app_check_internal"
            r2 = 1200(0x4b0, double:5.93E-321)
            long r0 = r0.optLong(r1, r2)
            return r0
    }
}
