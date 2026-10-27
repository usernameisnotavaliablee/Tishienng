package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class ll implements com.bytedance.embedapplog.tk {
    private static final com.bytedance.embedapplog.wf<java.lang.Boolean> xt = null;
    private java.lang.String j;



    static class j extends com.bytedance.embedapplog.tk.j {
        long j;

        j() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.j = r0
                return
        }
    }

    static {
            com.bytedance.embedapplog.ll$1 r0 = new com.bytedance.embedapplog.ll$1
            r0.<init>()
            com.bytedance.embedapplog.ll.xt = r0
            return
    }

    ll() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean cw(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.bytedance.embedapplog.wf<java.lang.Boolean> r1 = com.bytedance.embedapplog.ll.xt
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r3
            java.lang.Object r3 = r1.xt(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    private static int j(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            if (r1 == 0) goto L10
            int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            return r1
        Le:
            r1 = move-exception
            goto L11
        L10:
            return r0
        L11:
            com.bytedance.embedapplog.uc.j(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private android.util.Pair<java.lang.String, java.lang.Boolean> m(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = r3.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r4 = 0
            return r4
        La:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.uodis.opendevice.OPENIDS_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            android.content.Intent r0 = r0.setPackage(r1)
            com.bytedance.embedapplog.oq r1 = new com.bytedance.embedapplog.oq
            com.bytedance.embedapplog.ll$2 r2 = new com.bytedance.embedapplog.ll$2
            r2.<init>(r3)
            r1.<init>(r4, r0, r2)
            java.lang.Object r4 = r1.j()
            android.util.Pair r4 = (android.util.Pair) r4
            return r4
    }

    private boolean up(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "com.huawei.hwid.tv"
            java.lang.String r1 = "com.huawei.hwid"
            r2 = 0
            if (r6 != 0) goto L8
            return r2
        L8:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L2a
            android.content.pm.PackageInfo r3 = r6.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r4 = 1
            if (r3 == 0) goto L16
            r5.j = r1     // Catch: java.lang.Throwable -> L2a
            return r4
        L16:
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L1f
            r5.j = r0     // Catch: java.lang.Throwable -> L2a
            return r4
        L1f:
            java.lang.String r0 = "com.huawei.hms"
            r5.j = r0     // Catch: java.lang.Throwable -> L2a
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            return r4
        L2a:
            return r2
    }

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r1) {
            r0 = this;
            boolean r1 = r0.up(r1)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public com.bytedance.embedapplog.ll.j r(android.content.Context r5) {
            r4 = this;
            com.bytedance.embedapplog.ll$j r0 = new com.bytedance.embedapplog.ll$j
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L39
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "pps_oaid"
            java.lang.String r1 = android.provider.Settings.Global.getString(r1, r2)     // Catch: java.lang.Throwable -> L35
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "pps_track_limit"
            java.lang.String r2 = android.provider.Settings.Global.getString(r2, r3)     // Catch: java.lang.Throwable -> L35
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L39
            r0.xt = r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.Throwable -> L35
            r0.cw = r1     // Catch: java.lang.Throwable -> L35
            r1 = 202003021704(0x2f08517f88, double:9.980275338E-313)
            r0.j = r1     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r1 = move-exception
            com.bytedance.embedapplog.uc.j(r1)
        L39:
            android.util.Pair r1 = r4.m(r5)
            if (r1 == 0) goto L58
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            r0.xt = r2
            java.lang.Object r1 = r1.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.cw = r1
            java.lang.String r1 = r4.j
            int r5 = j(r5, r1)
            long r1 = (long) r5
            r0.j = r1
        L58:
            return r0
    }

    @Override // com.bytedance.embedapplog.tk
    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public /* synthetic */ com.bytedance.embedapplog.tk.j xt(android.content.Context r1) {
            r0 = this;
            com.bytedance.embedapplog.ll$j r1 = r0.r(r1)
            return r1
    }
}
