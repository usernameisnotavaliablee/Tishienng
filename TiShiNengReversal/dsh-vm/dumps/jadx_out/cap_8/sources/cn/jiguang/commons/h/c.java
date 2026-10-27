package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.jiguang.commons.a.c {
    private final java.util.concurrent.atomic.AtomicReference a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f808c;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.H.c a = null;

        static {
                cn.jiguang.commons.H.c r0 = new cn.jiguang.commons.H.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.H.c.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.c a() {
                cn.jiguang.commons.H.c r0 = cn.jiguang.commons.H.c.b.a
                return r0
        }
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f808c = r0
            return
    }

    /* synthetic */ c(cn.jiguang.commons.H.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.H.c c() {
            cn.jiguang.commons.H.c r0 = cn.jiguang.commons.H.c.b.a()
            return r0
    }

    private void f(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "JDevice"
            java.lang.String r1 = "oaid"
            java.lang.String r2 = "ids"
            java.util.concurrent.atomic.AtomicBoolean r3 = r4.f808c     // Catch: java.lang.Throwable -> L48
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto Lf
            goto L4a
        Lf:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L16
            goto L4a
        L16:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L48
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L48
            boolean r5 = r3.has(r2)     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L22
            goto L4a
        L22:
            org.json.JSONObject r5 = r3.getJSONObject(r2)     // Catch: java.lang.Throwable -> L48
            boolean r2 = r5.has(r1)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            java.lang.String r2 = ""
            java.lang.String r5 = r5.optString(r1, r2)     // Catch: java.lang.Throwable -> L48
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L4a
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f808c     // Catch: java.lang.Throwable -> L48
            r1 = 0
            r2 = 1
            boolean r5 = r5.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4a
            java.lang.String r5 = "dev_rpt_state|1900_v2=ok"
            cn.jiguang.commons.w.a.e(r0, r5)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r5 = move-exception
            goto L4b
        L4a:
            return
        L4b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "check oa state error: "
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JDevice"
            return r0
    }

    public java.lang.String a(boolean r4, boolean r5) {
            r3 = this;
            if (r5 != 0) goto L16
            java.util.concurrent.atomic.AtomicReference r5 = r3.a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L16
            java.util.concurrent.atomic.AtomicReference r4 = r3.a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r4 = move-exception
            goto L1f5
        L16:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13
            r5.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "resolution"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1017(0x3f9, float:1.425E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "screensize"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1020(0x3fc, float:1.43E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "os_version"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "model"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "brand"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "product"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1015(0x3f7, float:1.422E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "font"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1036(0x40c, float:1.452E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "fingerprint"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "language"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "manufacturer"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "timezone"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1026(0x402, float:1.438E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "romversion"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1019(0x3fb, float:1.428E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "mac"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "meid"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r1 = 1022(0x3fe, float:1.432E-42)
            java.lang.Object r0 = r0.a(r1, r4)     // Catch: java.lang.Throwable -> L13
            boolean r1 = r0 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L100
            java.lang.String r1 = "sim_slots"
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L13
        L100:
            java.lang.String r0 = "android_id"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1900(0x76c, float:2.662E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L129
            java.lang.String r2 = "joad"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L13
        L129:
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1901(0x76d, float:2.664E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L13e
            java.lang.String r2 = "jgad"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L13
        L13e:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L149
            java.lang.String r1 = "ids"
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L13
        L149:
            java.lang.String r0 = "root_state"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 2500(0x9c4, float:3.503E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "simulator_state"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1027(0x403, float:1.439E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "ncid_box"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1029(0x405, float:1.442E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "boot_id"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1030(0x406, float:1.443E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "media_drm_id"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1031(0x407, float:1.445E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "first_boot"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1032(0x408, float:1.446E-42)
            java.lang.String r1 = r1.d(r2, r4)     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "archs"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L1b2
            r2 = 1005(0x3ed, float:1.408E-42)
            java.lang.Object r1 = r1.a(r2, r4)     // Catch: java.lang.Throwable -> L1b2
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L1b2
        L1b2:
            java.lang.String r0 = "android_ver"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "android_target_ver"
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1c8
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L1c8
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L1c8
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L1c8
        L1c8:
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L1e3
            r1 = 1040(0x410, float:1.457E-42)
            java.lang.Object r4 = r0.a(r1, r4)     // Catch: java.lang.Throwable -> L1e3
            boolean r0 = r4 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L1e3
            if (r0 == 0) goto L1e3
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Throwable -> L1e3
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1e3
            if (r0 <= 0) goto L1e3
            java.lang.String r0 = "device_type"
            r5.put(r0, r4)     // Catch: java.lang.Throwable -> L1e3
        L1e3:
            java.util.concurrent.atomic.AtomicReference r4 = r3.a     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L13
            r4.set(r5)     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.atomic.AtomicReference r4 = r3.a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L13
            return r4
        L1f5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "getDeviceInfo failed: "
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JDevice"
            cn.jiguang.commons.w.a.f(r5, r4)
            r4 = 0
            return r4
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r6) {
            r5 = this;
            java.lang.String r0 = "JDevice-session"
            java.lang.String r1 = "JDevice"
            r2 = 1
            java.lang.String r6 = r5.a(r6, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = cn.jiguang.commons.L.k.d(r2)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = ""
            java.lang.String r3 = r3.a(r0, r4)     // Catch: java.lang.Throwable -> L27
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L29
            java.lang.String r6 = "device info unchanged, skip report"
            cn.jiguang.commons.w.a.a(r1, r6)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r6 = move-exception
            goto L4a
        L29:
            cn.jiguang.commons.L.ac r3 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L27
            r3.c(r0, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "device changed report"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L27
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "device_info"
            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L27
            r5.f(r6)     // Catch: java.lang.Throwable -> L27
            super.d(r1)     // Catch: java.lang.Throwable -> L27
            return
        L4a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "device info err:"
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r6)
            return
    }
}
