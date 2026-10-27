package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ab {
    private static final java.util.ArrayList<com.tencent.bugly.proguard.ab.a> a = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String> b = null;
    private static final java.lang.String[] c = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.lang.String a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.tencent.bugly.proguard.ab.a {
        private b() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ b(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r3 = this;
                java.lang.String r0 = "ro.gn.gnromvernumber"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L31
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "amigo/"
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = "/"
                r1.append(r0)
                java.lang.String r0 = "ro.build.display.id"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L31:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c extends com.tencent.bugly.proguard.ab.a {
        private c() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ c(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ro.build.fingerprint"
                java.lang.String r1 = com.tencent.bugly.proguard.ap.a(r1)
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r1 = "ro.build.rom.id"
                java.lang.String r1 = com.tencent.bugly.proguard.ap.a(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends com.tencent.bugly.proguard.ab.a {
        private d() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ d(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.build.tyd.kbstyle_version"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "dido/"
                java.lang.String r0 = r1.concat(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e extends com.tencent.bugly.proguard.ab.a {
        private e() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ e(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r3 = this;
                java.lang.String r0 = "ro.aa.romver"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L31
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "htc/"
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = "/"
                r1.append(r0)
                java.lang.String r0 = "ro.build.description"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L31:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f extends com.tencent.bugly.proguard.ab.a {
        private f() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ f(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.build.version.emui"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "HuaWei/EMOTION/"
                java.lang.String r0 = r1.concat(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g extends com.tencent.bugly.proguard.ab.a {
        private g() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ g(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.lenovo.series"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L25
                java.lang.String r1 = "fail"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L25
                java.lang.String r0 = "ro.build.version.incremental"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                java.lang.String r1 = "Lenovo/VIBE/"
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r0 = r1.concat(r0)
                return r0
            L25:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class h extends com.tencent.bugly.proguard.ab.a {
        private h() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ h(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.meizu.product.model"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L29
                java.lang.String r1 = "fail"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L29
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Meizu/FLYME/"
                r0.<init>(r1)
                java.lang.String r1 = "ro.build.display.id"
                java.lang.String r1 = com.tencent.bugly.proguard.ap.a(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L29:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class i extends com.tencent.bugly.proguard.ab.a {
        private i() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ i(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.build.version.opporom"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "Oppo/COLOROS/"
                java.lang.String r0 = r1.concat(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class j extends com.tencent.bugly.proguard.ab.a {
        private j() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ j(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r3 = this;
                java.lang.String r0 = "ro.lewa.version"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L31
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "tcl/"
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = "/"
                r1.append(r0)
                java.lang.String r0 = "ro.build.display.id"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L31:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class k extends com.tencent.bugly.proguard.ab.a {
        private k() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ k(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.vivo.os.build.display.id"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "vivo/FUNTOUCH/"
                java.lang.String r0 = r1.concat(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class l extends com.tencent.bugly.proguard.ab.a {
        private l() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ l(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r2 = this;
                java.lang.String r0 = "ro.miui.ui.version.name"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L1b
                java.lang.String r1 = "XiaoMi/MIUI/"
                java.lang.String r0 = r1.concat(r0)
                return r0
            L1b:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class m extends com.tencent.bugly.proguard.ab.a {
        private m() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ m(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final java.lang.String a() {
                r3 = this;
                java.lang.String r0 = "ro.build.nubia.rom.name"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
                if (r1 != 0) goto L31
                java.lang.String r1 = "fail"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Zte/NUBIA/"
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = "_"
                r1.append(r0)
                java.lang.String r0 = "ro.build.nubia.rom.code"
                java.lang.String r0 = com.tencent.bugly.proguard.ap.a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L31:
                r0 = 0
                return r0
        }
    }

    static {
            com.tencent.bugly.proguard.ab$1 r0 = new com.tencent.bugly.proguard.ab$1
            r0.<init>()
            com.tencent.bugly.proguard.ab.a = r0
            com.tencent.bugly.proguard.ab$2 r0 = new com.tencent.bugly.proguard.ab$2
            r0.<init>()
            com.tencent.bugly.proguard.ab.b = r0
            java.lang.String r17 = "/system/bin/conbb"
            java.lang.String r18 = "/system/xbin/conbb"
            java.lang.String r1 = "/su"
            java.lang.String r2 = "/su/bin/su"
            java.lang.String r3 = "/sbin/su"
            java.lang.String r4 = "/data/local/xbin/su"
            java.lang.String r5 = "/data/local/bin/su"
            java.lang.String r6 = "/data/local/su"
            java.lang.String r7 = "/system/xbin/su"
            java.lang.String r8 = "/system/bin/su"
            java.lang.String r9 = "/system/sd/xbin/su"
            java.lang.String r10 = "/system/bin/failsafe/su"
            java.lang.String r11 = "/system/bin/cufsdosck"
            java.lang.String r12 = "/system/xbin/cufsdosck"
            java.lang.String r13 = "/system/bin/cufsmgr"
            java.lang.String r14 = "/system/xbin/cufsmgr"
            java.lang.String r15 = "/system/bin/cufaevdd"
            java.lang.String r16 = "/system/xbin/cufaevdd"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            com.tencent.bugly.proguard.ab.c = r0
            return
    }

    public ab() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            java.lang.String r0 = "fail"
            return r0
    }

    public static java.lang.String a(android.content.Context r2) {
            if (r2 == 0) goto L3e
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 != 0) goto L9
            goto L3e
        L9:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.nativeLibraryDir
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L16
            goto L3e
        L16:
            java.lang.String r0 = "arm"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L21
            java.lang.String r2 = "armeabi-v7a"
            return r2
        L21:
            java.lang.String r0 = "arm64"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "arm64-v8a"
            return r2
        L2c:
            java.lang.String r0 = "x86"
            boolean r1 = r2.endsWith(r0)
            if (r1 == 0) goto L35
            return r0
        L35:
            java.lang.String r0 = "x86_64"
            boolean r2 = r2.endsWith(r0)
            if (r2 == 0) goto L3e
            return r0
        L3e:
            java.lang.String r2 = "fail"
            return r2
    }

    public static long b(android.content.Context r4) {
            r0 = 1024(0x400, double:5.06E-321)
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L26
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L23
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L26
            int[] r2 = new int[]{r2}     // Catch: java.lang.Throwable -> L26
            android.os.Debug$MemoryInfo[] r4 = r4.getProcessMemoryInfo(r2)     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L26
            int r4 = r4.getTotalPss()     // Catch: java.lang.Throwable -> L26
            long r2 = (long) r4
        L20:
            long r2 = r2 * r0
            return r2
        L23:
            r0 = 0
            return r0
        L26:
            long r2 = android.os.Debug.getPss()
            goto L20
    }

    public static java.lang.String b() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            java.lang.String r0 = "fail"
            return r0
    }

    public static int c() {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            r0 = -1
            return r0
    }

    public static java.lang.String c(android.content.Context r4) {
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L1c
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L1c
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L12
            r4 = 0
            return r4
        L12:
            int r2 = r1.getType()     // Catch: java.lang.Exception -> L1c
            r3 = 1
            if (r2 != r3) goto L1e
            java.lang.String r4 = "WIFI"
            return r4
        L1c:
            r4 = move-exception
            goto L59
        L1e:
            int r1 = r1.getType()     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L58
            java.lang.String r1 = "phone"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L1c
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Exception -> L1c
            if (r4 == 0) goto L58
            int r4 = r4.getNetworkType()     // Catch: java.lang.Exception -> L1c
            java.util.Map<java.lang.Integer, java.lang.String> r1 = com.tencent.bugly.proguard.ab.b     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1c
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = "MOBILE("
            r0.<init>(r2)     // Catch: java.lang.Exception -> L54
            r0.append(r4)     // Catch: java.lang.Exception -> L54
            java.lang.String r4 = ")"
            r0.append(r4)     // Catch: java.lang.Exception -> L54
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L54
            return r4
        L54:
            r4 = move-exception
            r0 = r1
            goto L59
        L57:
            return r1
        L58:
            return r0
        L59:
            com.tencent.bugly.proguard.al.a(r4)
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            java.lang.String r0 = "fail"
            return r0
    }

    public static long e() {
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L1a
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            int r0 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L1a
            int r0 = r1.getBlockCount()     // Catch: java.lang.Throwable -> L1a
            long r0 = (long) r0
            long r0 = r0 * r2
            return r0
        L1a:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            r0 = -1
            return r0
    }

    public static long f() {
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L1a
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            int r0 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L1a
            int r0 = r1.getAvailableBlocks()     // Catch: java.lang.Throwable -> L1a
            long r0 = (long) r0
            long r0 = r0 * r2
            return r0
        L1a:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            r0 = -1
            return r0
    }

    public static long g() {
            r0 = 0
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L35
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "/proc/self/status"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2a
        L13:
            if (r2 == 0) goto L31
            java.lang.String r4 = "VmSize"
            boolean r4 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            java.lang.String r4 = "[^\\d]"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.replaceAll(r4, r5)     // Catch: java.lang.Throwable -> L2a
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r2 = move-exception
            goto L39
        L2c:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2a
            goto L13
        L31:
            r3.close()     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L35:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L39:
            com.tencent.bugly.proguard.al.a(r2)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L3f
            goto L31
        L3f:
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            return r0
        L44:
            r0 = move-exception
            if (r3 == 0) goto L4a
            r3.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            throw r0
    }

    public static long h() {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.totalMemory()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r2 = r2.freeMemory()
            long r0 = r0 - r2
            return r0
    }

    public static long i() {
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L62
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L62
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d
            r3 = 2048(0x800, float:2.87E-42)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L28
            r0.close()     // Catch: java.io.IOException -> L19
            goto L1d
        L19:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L1d:
            r2.close()     // Catch: java.io.IOException -> L21
            goto L25
        L21:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L25:
            r0 = -1
            return r0
        L28:
            java.lang.String r3 = ":\\s+"
            r4 = 2
            java.lang.String[] r1 = r1.split(r3, r4)     // Catch: java.lang.Throwable -> L5b
            r3 = 1
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "kb"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replace(r3, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L5b
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L5b
            r5 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r5
            r0.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L52:
            r2.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L5a:
            return r3
        L5b:
            r1 = move-exception
            goto L66
        L5d:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L66
        L62:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L66:
            com.tencent.bugly.proguard.al.a(r1)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L73
            r0.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L73:
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L7d:
            r0 = -2
            return r0
        L80:
            r1 = move-exception
            if (r0 == 0) goto L8b
            r0.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L8b:
            if (r2 == 0) goto L95
            r2.close()     // Catch: java.io.IOException -> L91
            goto L95
        L91:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L95:
            throw r1
    }

    public static long j() {
            java.lang.String r0 = ""
            java.lang.String r1 = "kb"
            java.lang.String r2 = ":\\s+"
            java.lang.String r3 = "/proc/meminfo"
            r4 = 0
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lc6
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lc6
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lc4
            r6 = 2048(0x800, float:2.87E-42)
            r3.<init>(r5, r6)     // Catch: java.lang.Throwable -> Lc4
            r3.readLine()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> Lc1
            r6 = -1
            if (r4 != 0) goto L31
            r3.close()     // Catch: java.io.IOException -> L24
            goto L28
        L24:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L28:
            r5.close()     // Catch: java.io.IOException -> L2c
            goto L30
        L2c:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L30:
            return r6
        L31:
            r8 = 2
            java.lang.String[] r4 = r4.split(r2, r8)     // Catch: java.lang.Throwable -> Lc1
            r9 = 1
            r4 = r4[r9]     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.replace(r1, r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> Lc1
            long r10 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> Lc1
            r12 = 1024(0x400, double:5.06E-321)
            long r10 = r10 * r12
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> Lc1
            if (r4 != 0) goto L64
            r3.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L5b:
            r5.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L63:
            return r6
        L64:
            java.lang.String[] r4 = r4.split(r2, r8)     // Catch: java.lang.Throwable -> Lc1
            r4 = r4[r9]     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.replace(r1, r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> Lc1
            long r14 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Long.signum(r14)
            long r14 = r14 * r12
            long r10 = r10 + r14
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> Lc1
            if (r4 != 0) goto L97
            r3.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L8e:
            r5.close()     // Catch: java.io.IOException -> L92
            goto L96
        L92:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L96:
            return r6
        L97:
            java.lang.String[] r2 = r4.split(r2, r8)     // Catch: java.lang.Throwable -> Lc1
            r2 = r2[r9]     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> Lc1
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lc1
            long r0 = r0 * r12
            long r10 = r10 + r0
            r3.close()     // Catch: java.io.IOException -> Lb4
            goto Lb8
        Lb4:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        Lb8:
            r5.close()     // Catch: java.io.IOException -> Lbc
            goto Lc0
        Lbc:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        Lc0:
            return r10
        Lc1:
            r0 = move-exception
            r4 = r3
            goto Lc8
        Lc4:
            r0 = move-exception
            goto Lc8
        Lc6:
            r0 = move-exception
            r5 = r4
        Lc8:
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> Le2
            if (r4 == 0) goto Ld5
            r4.close()     // Catch: java.io.IOException -> Ld1
            goto Ld5
        Ld1:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        Ld5:
            if (r5 == 0) goto Ldf
            r5.close()     // Catch: java.io.IOException -> Ldb
            goto Ldf
        Ldb:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        Ldf:
            r0 = -2
            return r0
        Le2:
            r0 = move-exception
            if (r4 == 0) goto Led
            r4.close()     // Catch: java.io.IOException -> Le9
            goto Led
        Le9:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
        Led:
            if (r5 == 0) goto Lf7
            r5.close()     // Catch: java.io.IOException -> Lf3
            goto Lf7
        Lf3:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
        Lf7:
            throw r0
    }

    public static long k() {
            boolean r0 = s()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> L23
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L23
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L23
            int r1 = r0.getBlockSize()     // Catch: java.lang.Throwable -> L23
            int r0 = r0.getBlockCount()     // Catch: java.lang.Throwable -> L23
            long r2 = (long) r0
            long r0 = (long) r1
            long r2 = r2 * r0
            return r2
        L23:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            r0 = -2
            return r0
    }

    public static long l() {
            boolean r0 = s()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> L23
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L23
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L23
            int r1 = r0.getBlockSize()     // Catch: java.lang.Throwable -> L23
            int r0 = r0.getAvailableBlocks()     // Catch: java.lang.Throwable -> L23
            long r2 = (long) r0
            long r0 = (long) r1
            long r2 = r2 * r0
            return r2
        L23:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
            r0 = -2
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String n() {
            java.util.ArrayList<com.tencent.bugly.proguard.ab$a> r0 = com.tencent.bugly.proguard.ab.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.tencent.bugly.proguard.ab$a r1 = (com.tencent.bugly.proguard.ab.a) r1
            java.lang.String r1 = r1.a()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L6
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public static boolean o() {
            com.tencent.bugly.proguard.ab$i r0 = new com.tencent.bugly.proguard.ab$i
            r1 = 0
            r0.<init>(r1)
            java.lang.String r0 = r0.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            r0 = 1
            return r0
    }

    public static boolean p() {
            com.tencent.bugly.proguard.ab$k r0 = new com.tencent.bugly.proguard.ab$k
            r1 = 0
            r0.<init>(r1)
            java.lang.String r0 = r0.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            r0 = 1
            return r0
    }

    public static boolean q() {
            java.lang.String[] r0 = com.tencent.bugly.proguard.ab.c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            r4 = 1
            if (r3 >= r1) goto L1a
            r5 = r0[r3]
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L17
            r0 = 1
            goto L1b
        L17:
            int r3 = r3 + 1
            goto L5
        L1a:
            r0 = 0
        L1b:
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L28
            java.lang.String r3 = "test-keys"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L28
            goto L2a
        L28:
            if (r0 == 0) goto L2b
        L2a:
            return r4
        L2b:
            return r2
    }

    public static boolean r() {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.maxMemory()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r2
            r4 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r0 = r0 / r4
            float r0 = (float) r0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r6 = r1.totalMemory()
            double r6 = (double) r6
            double r6 = r6 * r2
            double r6 = r6 / r4
            float r1 = (float) r6
            float r2 = r0 - r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "maxMemory : %f"
            com.tencent.bugly.proguard.al.c(r0, r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r0
            java.lang.String r0 = "totalMemory : %f"
            com.tencent.bugly.proguard.al.c(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r0
            java.lang.String r0 = "freeMemory : %f"
            com.tencent.bugly.proguard.al.c(r0, r1)
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L50
            return r3
        L50:
            return r5
    }

    private static boolean s() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        Le:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L12:
            r0 = 0
            return r0
    }
}
