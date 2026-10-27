package com.ss.android.socialbase.appdownloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    /* renamed from: com.ss.android.socialbase.appdownloader.a$a, reason: collision with other inner class name */
    public static class C0227a {
        private java.lang.String a;
        private java.lang.String b;
        private android.graphics.drawable.Drawable c;
        private java.lang.String d;
        private java.lang.String e;
        private int f;
        private boolean g;

        public C0227a(java.lang.String r1, java.lang.String r2, android.graphics.drawable.Drawable r3, java.lang.String r4, java.lang.String r5, int r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.m(r2)
                r0.f(r3)
                r0.g(r1)
                r0.c(r4)
                r0.k(r5)
                r0.e(r6)
                r0.h(r7)
                return
        }

        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.e
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public void c(java.lang.String r1) {
                r0 = this;
                r0.d = r1
                return
        }

        public android.graphics.drawable.Drawable d() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.c
                return r0
        }

        public void e(int r1) {
                r0 = this;
                r0.f = r1
                return
        }

        public void f(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.c = r1
                return
        }

        public void g(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void h(boolean r1) {
                r0 = this;
                r0.g = r1
                return
        }

        public int i() {
                r1 = this;
                int r0 = r1.f
                return r0
        }

        public java.lang.String j() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public void k(java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return
        }

        public java.lang.String l() {
                r1 = this;
                java.lang.String r0 = r1.d
                return r0
        }

        public void m(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public boolean n() {
                r1 = this;
                boolean r0 = r1.g
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{\n  pkg name: "
                r0.<init>(r1)
                java.lang.String r1 = r2.b()
                r0.append(r1)
                java.lang.String r1 = "\n  app icon: "
                r0.append(r1)
                android.graphics.drawable.Drawable r1 = r2.d()
                r0.append(r1)
                java.lang.String r1 = "\n  app name: "
                r0.append(r1)
                java.lang.String r1 = r2.j()
                r0.append(r1)
                java.lang.String r1 = "\n  app path: "
                r0.append(r1)
                java.lang.String r1 = r2.l()
                r0.append(r1)
                java.lang.String r1 = "\n  app v name: "
                r0.append(r1)
                java.lang.String r1 = r2.a()
                r0.append(r1)
                java.lang.String r1 = "\n  app v code: "
                r0.append(r1)
                int r1 = r2.i()
                r0.append(r1)
                java.lang.String r1 = "\n  is system: "
                r0.append(r1)
                boolean r1 = r2.n()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean a(java.lang.String r5) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length()
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L1a
            char r4 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            int r3 = r3 + 1
            goto La
        L1a:
            return r0
    }

    public static int b(java.lang.String r3) {
            boolean r0 = a(r3)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r2 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r3 != 0) goto L18
            return r1
        L18:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            return r3
        L1b:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getAppVersionCode:"
            r0.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "AppUtils"
            com.ss.android.socialbase.downloader.m.j.up(r0, r3)
            return r1
    }

    private static com.ss.android.socialbase.appdownloader.a.C0227a c(android.content.pm.PackageManager r10, android.content.pm.PackageInfo r11) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            android.content.pm.ApplicationInfo r1 = r11.applicationInfo
            java.lang.String r3 = r11.packageName
            if (r1 == 0) goto L1a
            java.lang.CharSequence r2 = r1.loadLabel(r10)
            if (r2 == 0) goto L1a
            java.lang.CharSequence r2 = r1.loadLabel(r10)
            java.lang.String r2 = r2.toString()
        L18:
            r4 = r2
            goto L1d
        L1a:
            java.lang.String r2 = ""
            goto L18
        L1d:
            android.graphics.drawable.Drawable r0 = r1.loadIcon(r10)     // Catch: java.lang.Exception -> L23
        L21:
            r5 = r0
            goto L25
        L23:
            goto L21
        L25:
            java.lang.String r6 = r1.sourceDir
            java.lang.String r7 = r11.versionName
            int r8 = r11.versionCode
            int r10 = r1.flags
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L33
            r9 = 1
            goto L35
        L33:
            r11 = 0
            r9 = 0
        L35:
            com.ss.android.socialbase.appdownloader.a$a r2 = new com.ss.android.socialbase.appdownloader.a$a
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    public static com.ss.android.socialbase.appdownloader.a.C0227a d(java.lang.String r3) {
            r0 = 0
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            com.ss.android.socialbase.appdownloader.a$a r3 = c(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            return r3
        L16:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getAppInfo:"
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "AppUtils"
            com.ss.android.socialbase.downloader.m.j.up(r1, r3)
            return r0
    }
}
