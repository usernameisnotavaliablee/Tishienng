package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class qo {

    static class j implements java.lang.Runnable {
        private final java.lang.String cw;
        private final java.lang.Runnable j;
        private final java.lang.String xt;

        j(java.lang.Runnable r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "origin stacktrace"
                r1.<init>(r2)
                java.lang.String r1 = android.util.Log.getStackTraceString(r1)
                r0.cw = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.Runnable r0 = r3.j     // Catch: java.lang.Exception -> L6
                r0.run()     // Catch: java.lang.Exception -> L6
                return
            L6:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Thread:"
                r1.<init>(r2)
                java.lang.String r2 = r3.xt
                r1.append(r2)
                java.lang.String r2 = " exception\n"
                r1.append(r2)
                java.lang.String r2 = r3.cw
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.bytedance.embedapplog.uc.cw(r1, r0)
                return
        }
    }

    public qo() {
            r1 = this;
            r1.<init>()
            return
    }

    static void j(@androidx.annotation.Nullable java.lang.String r2, java.lang.Runnable r3) {
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "TrackerDr"
        Lb:
            com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
            com.bytedance.embedapplog.qo$j r1 = new com.bytedance.embedapplog.qo$j
            r1.<init>(r3, r2)
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    static boolean j(android.content.Context r3) {
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r0 = 0
            java.lang.String r1 = "com.huawei.hwid"
            android.content.pm.PackageInfo r1 = r3.getPackageInfo(r1, r0)     // Catch: java.lang.Throwable -> L21
            r2 = 1
            if (r1 == 0) goto Lf
            return r2
        Lf:
            java.lang.String r1 = "com.huawei.hwid.tv"
            android.content.pm.PackageInfo r1 = r3.getPackageInfo(r1, r0)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "com.huawei.hms"
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r1, r0)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L21
            return r2
        L21:
            return r0
    }

    static boolean j(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r0 = 128(0x80, float:1.8E-43)
            r1 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lf
            if (r2 == 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r1
    }
}
