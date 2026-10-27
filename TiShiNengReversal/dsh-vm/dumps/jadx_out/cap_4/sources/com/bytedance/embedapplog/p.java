package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class p extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2093m;
    private final android.content.Context up;

    p(android.content.Context r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1)
            r2.up = r3
            r2.f2093m = r4
            return
    }

    private static java.lang.String j(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L18
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 < r2) goto L18
            java.lang.String r0 = com.bytedance.embedapplog.o.a()     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
        L18:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "unknown"
            if (r3 != 0) goto L26
            boolean r3 = android.text.TextUtils.equals(r0, r1)
            if (r3 == 0) goto L28
        L26:
            java.lang.String r0 = android.os.Build.SERIAL
        L28:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L36
            boolean r3 = android.text.TextUtils.equals(r0, r1)
            if (r3 == 0) goto L35
            goto L36
        L35:
            return r0
        L36:
            java.lang.String r3 = ""
            return r3
    }

    @Override // com.bytedance.embedapplog.l
    @android.annotation.SuppressLint({"MissingPermission"})
    protected boolean j(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "os"
            java.lang.String r1 = "Android"
            r3.put(r0, r1)
            java.lang.String r0 = "os_version"
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r3.put(r0, r1)
            java.lang.String r0 = "os_api"
            int r1 = android.os.Build.VERSION.SDK_INT
            r3.put(r0, r1)
            java.lang.String r0 = "device_model"
            java.lang.String r1 = com.bytedance.embedapplog.ri.cw()
            r3.put(r0, r1)
            java.lang.String r0 = "device_brand"
            java.lang.String r1 = android.os.Build.BRAND
            r3.put(r0, r1)
            java.lang.String r0 = "device_manufacturer"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r3.put(r0, r1)
            java.lang.String r0 = "cpu_abi"
            java.lang.String r1 = android.os.Build.CPU_ABI
            r3.put(r0, r1)
            com.bytedance.embedapplog.rn r0 = r2.f2093m
            boolean r0 = r0.nd()
            if (r0 == 0) goto L42
            android.content.Context r0 = r2.up
            java.lang.String r0 = j(r0)
            goto L48
        L42:
            com.bytedance.embedapplog.rn r0 = r2.f2093m
            java.lang.String r0 = r0.n()
        L48:
            java.lang.String r1 = "build_serial"
            r3.put(r1, r0)
            r3 = 1
            return r3
    }
}
