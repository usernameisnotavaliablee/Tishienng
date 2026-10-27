package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d implements com.uyumao.g.a {
    public static volatile boolean a = true;
    public static volatile boolean b = true;
    public static volatile boolean c = true;
    public static volatile boolean d = true;
    public static volatile boolean e = true;
    public static volatile boolean f = true;
    public static android.content.Context g;
    public static org.json.JSONObject h;
    public static org.json.JSONObject i;
    public static org.json.JSONObject j;
    public static org.json.JSONObject k;
    public static volatile boolean l;
    public static java.util.Map<java.lang.String, java.lang.Integer> m;
    public static android.location.LocationListener n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements android.location.LocationListener {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r12) {
                r11 = this;
                r0 = 1
                com.uyumao.d.a(r0)
                double r0 = r12.getLatitude()     // Catch: java.lang.Throwable -> L5c
                double r2 = r12.getLongitude()     // Catch: java.lang.Throwable -> L5c
                long r4 = r12.getTime()     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r12.hasAltitude()     // Catch: java.lang.Throwable -> L5c
                r7 = 0
                if (r6 == 0) goto L1d
                double r9 = r12.getAltitude()     // Catch: java.lang.Throwable -> L5c
                goto L1e
            L1d:
                r9 = r7
            L1e:
                boolean r6 = r12.hasSpeed()     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L29
                float r12 = r12.getSpeed()     // Catch: java.lang.Throwable -> L5c
                double r7 = (double) r12     // Catch: java.lang.Throwable -> L5c
            L29:
                org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
                r12.<init>()     // Catch: java.lang.Throwable -> L5c
                com.uyumao.d.j = r12     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = "lat"
                r12.put(r6, r0)     // Catch: java.lang.Throwable -> L5c
                org.json.JSONObject r12 = com.uyumao.d.j     // Catch: java.lang.Throwable -> L5c
                java.lang.String r0 = "lng"
                r12.put(r0, r2)     // Catch: java.lang.Throwable -> L5c
                org.json.JSONObject r12 = com.uyumao.d.j     // Catch: java.lang.Throwable -> L5c
                java.lang.String r0 = "alt"
                r12.put(r0, r9)     // Catch: java.lang.Throwable -> L5c
                org.json.JSONObject r12 = com.uyumao.d.j     // Catch: java.lang.Throwable -> L5c
                java.lang.String r0 = "acc"
                r12.put(r0, r7)     // Catch: java.lang.Throwable -> L5c
                org.json.JSONObject r12 = com.uyumao.d.j     // Catch: java.lang.Throwable -> L5c
                java.lang.String r0 = "lts"
                r12.put(r0, r4)     // Catch: java.lang.Throwable -> L5c
                android.content.Context r12 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L5c
                com.uyumao.d r0 = com.uyumao.d.e.a     // Catch: java.lang.Throwable -> L5c
                org.json.JSONObject r1 = com.uyumao.d.k     // Catch: java.lang.Throwable -> L5c
                r2 = 203(0xcb, float:2.84E-43)
                com.uyumao.g.a(r12, r2, r0, r1)     // Catch: java.lang.Throwable -> L5c
            L5c:
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        public b(com.uyumao.d r1, java.lang.String r2) {
                r0 = this;
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Context r0 = com.uyumao.d.g
                java.lang.String r1 = r3.a
                java.lang.String r2 = "https://yumao.puata.info/cc_info"
                com.uyumao.k.a(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        public c(com.uyumao.d r1, java.lang.String r2) {
                r0 = this;
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Context r0 = com.uyumao.d.g
                java.lang.String r1 = r3.a
                java.lang.String r2 = "https://yumao.puata.info/cc_info"
                com.uyumao.k.a(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.uyumao.d$d, reason: collision with other inner class name */
    public class RunnableC0063d implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        public RunnableC0063d(com.uyumao.d r1, java.lang.String r2) {
                r0 = this;
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Context r0 = com.uyumao.d.g
                java.lang.String r1 = r3.a
                java.lang.String r2 = "https://yumao.puata.info/cc_info"
                com.uyumao.k.a(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e {
        public static final com.uyumao.d a = null;

        static {
                com.uyumao.d r0 = new com.uyumao.d
                r0.<init>()
                com.uyumao.d.e.a = r0
                return
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.uyumao.d.m = r0
            r1 = 101(0x65, float:1.42E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "col_wifi"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.uyumao.d.m
            r1 = 102(0x66, float:1.43E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "col_bs"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.uyumao.d.m
            r1 = 103(0x67, float:1.44E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "col_lbs"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.uyumao.d.m
            r1 = 104(0x68, float:1.46E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "col_apl"
            r0.put(r2, r1)
            com.uyumao.d$a r0 = new com.uyumao.d$a
            r0.<init>()
            com.uyumao.d.n = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r8) {
            java.lang.String r0 = "2G/3G"
            org.json.JSONObject r1 = com.uyumao.d.h
            if (r1 == 0) goto Lf
            int r1 = r1.length()
            if (r1 <= 0) goto Lf
            org.json.JSONObject r8 = com.uyumao.d.h
            return r8
        Lf:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L136
            r1.<init>()     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "os"
            java.lang.String r3 = "Android"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "dm"
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "av"
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "umid"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getUMId(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "ov"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "chn"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getChannel(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L136
            java.lang.String[] r2 = com.umeng.commonsdk.utils.UMUtils.getActiveUser(r8)     // Catch: java.lang.Throwable -> L136
            java.lang.String r3 = ""
            java.lang.String r4 = "puid"
            r5 = 1
            if (r2 == 0) goto L61
            java.lang.String[] r2 = com.umeng.commonsdk.utils.UMUtils.getActiveUser(r8)     // Catch: java.lang.Throwable -> L136
            int r2 = r2.length     // Catch: java.lang.Throwable -> L136
            r6 = 2
            if (r2 != r6) goto L61
            java.lang.String[] r2 = com.umeng.commonsdk.utils.UMUtils.getActiveUser(r8)     // Catch: java.lang.Throwable -> L136
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L136
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L136
            goto L64
        L61:
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L136
        L64:
            java.lang.String r2 = "zid"
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getZid(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "sv"
            java.lang.String r4 = com.uyumao.sdk.UYMManager.getSdkVersion()     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "ak"
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "idfa"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIdfa(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "db"
            java.lang.String r4 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "aid"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "oaid"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getOaid(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "imei"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "boa"
            java.lang.String r4 = android.os.Build.BOARD     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "mant"
            long r6 = android.os.Build.TIME     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L136
            java.lang.String[] r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getLocaleInfo(r8)     // Catch: java.lang.Throwable -> L136
            java.lang.String r4 = "ct"
            r6 = 0
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L136
            r1.put(r4, r7)     // Catch: java.lang.Throwable -> L136
            java.lang.String r4 = "lang"
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L136
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "tz"
            int r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getTimeZone(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "pkg"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getPackageName(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "disn"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r8)     // Catch: java.lang.Throwable -> L136
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String[] r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r8)     // Catch: java.lang.Throwable -> L136
            java.lang.String r4 = "Wi-Fi"
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L136
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Throwable -> L136
            java.lang.String r7 = "ac"
            if (r4 == 0) goto Lfc
            java.lang.String r0 = "wifi"
            r1.put(r7, r0)     // Catch: java.lang.Throwable -> L136
            goto L10d
        Lfc:
            r4 = r2[r6]     // Catch: java.lang.Throwable -> L136
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L136
            if (r4 == 0) goto L108
            r1.put(r7, r0)     // Catch: java.lang.Throwable -> L136
            goto L10d
        L108:
            java.lang.String r0 = "unknown"
            r1.put(r7, r0)     // Catch: java.lang.Throwable -> L136
        L10d:
            r0 = r2[r5]     // Catch: java.lang.Throwable -> L136
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L136
            if (r0 != 0) goto L11c
            java.lang.String r0 = "ast"
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L136
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L136
        L11c:
            int r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkType(r8)     // Catch: java.lang.Throwable -> L136
            java.lang.String r2 = "nt"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L136
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getDeviceToken(r8)     // Catch: java.lang.Throwable -> L136
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L136
            if (r0 != 0) goto L134
            java.lang.String r0 = "device_token"
            r1.put(r0, r8)     // Catch: java.lang.Throwable -> L136
        L134:
            com.uyumao.d.h = r1     // Catch: java.lang.Throwable -> L136
        L136:
            org.json.JSONObject r8 = com.uyumao.d.h
            return r8
    }

    public static void a(org.json.JSONObject r4, org.json.JSONObject r5) {
            java.lang.String r0 = "sdk"
            java.lang.String r1 = "hit_sdk"
            if (r4 == 0) goto L2e
            if (r5 != 0) goto L9
            goto L2e
        L9:
            java.lang.String r2 = r5.optString(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.optString(r0)     // Catch: java.lang.Throwable -> L2e
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L20:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L2b
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L2e
            r1.put(r3)     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            goto L20
        L2b:
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    public static /* synthetic */ boolean a(boolean r0) {
            com.uyumao.d.l = r0
            return r0
    }

    @Override // com.uyumao.g.a
    public void a(java.lang.Object r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "network"
            java.lang.String r4 = "gps"
            r5 = 202(0xca, float:2.83E-43)
            java.lang.String r6 = "location"
            java.lang.String r7 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            r9 = 203(0xcb, float:2.84E-43)
            r10 = 0
            if (r2 == r5) goto L1c2
            r11 = 0
            if (r2 == r9) goto L182
            switch(r2) {
                case 101: goto L11f;
                case 102: goto Lcd;
                case 103: goto L58;
                case 104: goto L20;
                default: goto L1e;
            }
        L1e:
            goto L1f3
        L20:
            boolean r2 = com.uyumao.d.f
            if (r2 != 0) goto L25
            return
        L25:
            if (r1 == 0) goto L1f3
            boolean r2 = r1 instanceof org.json.JSONObject
            if (r2 == 0) goto L1f3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L1f3
            java.lang.ref.WeakReference<java.util.concurrent.Future<?>> r2 = com.uyumao.e.c     // Catch: java.lang.Throwable -> L1f3
            if (r2 == 0) goto L47
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1f3
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch: java.lang.Throwable -> L1f3
            if (r2 == 0) goto L47
            boolean r3 = r2.isDone()     // Catch: java.lang.Throwable -> L1f3
            if (r3 != 0) goto L47
            boolean r2 = r2.isCancelled()     // Catch: java.lang.Throwable -> L1f3
            if (r2 != 0) goto L47
            goto L1f3
        L47:
            com.uyumao.r r2 = new com.uyumao.r     // Catch: java.lang.Throwable -> L1f3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1f3
            java.util.concurrent.Future r1 = com.uyumao.s.a(r2)     // Catch: java.lang.Throwable -> L1f3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1f3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.e.c = r2     // Catch: java.lang.Throwable -> L1f3
            return
        L58:
            java.lang.Boolean r2 = com.uyumao.e.b()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L64
            goto L1f3
        L64:
            if (r1 == 0) goto L1f3
            boolean r2 = r1 instanceof org.json.JSONObject
            if (r2 == 0) goto L1f3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d.k = r1     // Catch: java.lang.Throwable -> L1f3
            boolean r1 = com.uyumao.d.b     // Catch: java.lang.Throwable -> L1f3
            if (r1 == 0) goto L7a
            android.content.Context r1 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r1 = com.uyumao.e.b(r1)     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d.i = r1     // Catch: java.lang.Throwable -> L1f3
        L7a:
            boolean r1 = com.uyumao.d.a     // Catch: java.lang.Throwable -> L1f3
            if (r1 == 0) goto Lc3
            android.content.Context r1 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            android.location.LocationListener r2 = com.uyumao.d.n     // Catch: java.lang.Throwable -> L1f3
            if (r1 == 0) goto Lb2
            if (r2 != 0) goto L87
            goto Lb2
        L87:
            boolean r5 = com.uyumao.e.a(r1, r8)     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto Lb2
            boolean r5 = com.uyumao.e.a(r1, r7)     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto Lb2
            java.lang.Object r1 = r1.getSystemService(r6)     // Catch: java.lang.Throwable -> Lb2
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch: java.lang.Throwable -> Lb2
            if (r1 != 0) goto L9c
            goto Lb2
        L9c:
            r5 = 1
            java.util.List r5 = r1.getProviders(r5)     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = r5.contains(r4)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto La9
            r3 = r4
            goto Laf
        La9:
            boolean r4 = r5.contains(r3)     // Catch: java.lang.Throwable -> Lb2
            if (r4 == 0) goto Lb2
        Laf:
            r1.requestSingleUpdate(r3, r2, r10)     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            android.content.Context r11 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d r14 = com.uyumao.d.e.a     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r15 = com.uyumao.d.k     // Catch: java.lang.Throwable -> L1f3
            r16 = 30000(0x7530, double:1.4822E-319)
            r12 = 256(0x100, float:3.59E-43)
            r13 = 202(0xca, float:2.83E-43)
            com.uyumao.g.a(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L1f3
            goto L1f3
        Lc3:
            android.content.Context r1 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d r2 = com.uyumao.d.e.a     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r3 = com.uyumao.d.k     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.g.a(r1, r9, r2, r3)     // Catch: java.lang.Throwable -> L1f3
            return
        Lcd:
            java.lang.Boolean r2 = com.uyumao.e.b()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Ld9
            goto L1f3
        Ld9:
            boolean r2 = com.uyumao.d.e
            if (r2 != 0) goto Ldf
            goto L1f3
        Ldf:
            if (r1 == 0) goto L1f3
            boolean r2 = r1 instanceof org.json.JSONObject
            if (r2 == 0) goto L1f3
            android.content.Context r2 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONArray r2 = com.uyumao.e.a(r2)     // Catch: java.lang.Throwable -> L1f3
            if (r2 == 0) goto L1f3
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L1f3
            if (r3 > 0) goto Lf5
            goto L1f3
        Lf5:
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L1f3
            android.content.Context r3 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r3 = a(r3)     // Catch: java.lang.Throwable -> L1f3
            a(r3, r1)     // Catch: java.lang.Throwable -> L1f3
            java.lang.String r1 = "bs"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L10f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L10f
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L10e
        L10e:
            r10 = r4
        L10f:
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d$c r2 = new com.uyumao.d$c     // Catch: java.lang.Throwable -> L1f3
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1f3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.s.a(r2, r11, r1)     // Catch: java.lang.Throwable -> L1f3
            goto L1f3
        L11f:
            java.lang.Boolean r2 = com.uyumao.e.b()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L12b
            goto L1f3
        L12b:
            if (r1 == 0) goto L1f3
            boolean r2 = r1 instanceof org.json.JSONObject
            if (r2 == 0) goto L1f3
            boolean r2 = com.uyumao.d.c     // Catch: java.lang.Throwable -> L1f3
            if (r2 == 0) goto L13c
            android.content.Context r2 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONArray r2 = com.uyumao.e.e(r2)     // Catch: java.lang.Throwable -> L1f3
            goto L13d
        L13c:
            r2 = r10
        L13d:
            boolean r3 = com.uyumao.d.d     // Catch: java.lang.Throwable -> L1f3
            if (r3 == 0) goto L148
            android.content.Context r3 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONArray r3 = com.uyumao.e.f(r3)     // Catch: java.lang.Throwable -> L1f3
            goto L149
        L148:
            r3 = r10
        L149:
            if (r2 != 0) goto L14f
            if (r3 != 0) goto L14f
            goto L1f3
        L14f:
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L1f3
            android.content.Context r4 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r4 = a(r4)     // Catch: java.lang.Throwable -> L1f3
            a(r4, r1)     // Catch: java.lang.Throwable -> L1f3
            java.lang.String r1 = "wifi"
            java.lang.String r5 = "wifi_list"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L172
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L172
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L172
            if (r2 == 0) goto L16c
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L171
        L16c:
            if (r3 == 0) goto L171
            r6.put(r5, r3)     // Catch: java.lang.Throwable -> L171
        L171:
            r10 = r6
        L172:
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d$b r2 = new com.uyumao.d$b     // Catch: java.lang.Throwable -> L1f3
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1f3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.s.a(r2, r11, r1)     // Catch: java.lang.Throwable -> L1f3
            goto L1f3
        L182:
            org.json.JSONObject r2 = com.uyumao.d.i
            if (r2 != 0) goto L18b
            org.json.JSONObject r2 = com.uyumao.d.j
            if (r2 != 0) goto L18b
            goto L1f3
        L18b:
            if (r1 == 0) goto L1f3
            boolean r1 = r1 instanceof org.json.JSONObject
            if (r1 == 0) goto L1f3
            android.content.Context r1 = com.uyumao.d.g     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r1 = a(r1)     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r2 = com.uyumao.d.k     // Catch: java.lang.Throwable -> L1f3
            a(r1, r2)     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r2 = com.uyumao.d.i     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONObject r3 = com.uyumao.d.j     // Catch: java.lang.Throwable -> L1f3
            org.json.JSONArray r2 = com.uyumao.e.a(r2, r3)     // Catch: java.lang.Throwable -> L1f3
            java.lang.String r3 = "lbs"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1b3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b3
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1b3
            r4.put(r3, r2)     // Catch: java.lang.Throwable -> L1b2
        L1b2:
            r10 = r4
        L1b3:
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.d$d r2 = new com.uyumao.d$d     // Catch: java.lang.Throwable -> L1f3
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1f3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1f3
            com.uyumao.s.a(r2, r11, r1)     // Catch: java.lang.Throwable -> L1f3
            goto L1f3
        L1c2:
            boolean r1 = com.uyumao.d.l
            if (r1 == 0) goto L1c7
            goto L1f3
        L1c7:
            android.content.Context r1 = com.uyumao.d.g
            android.location.LocationListener r2 = com.uyumao.d.n
            if (r1 == 0) goto L1e8
            if (r2 != 0) goto L1d0
            goto L1e8
        L1d0:
            boolean r3 = com.uyumao.e.a(r1, r8)     // Catch: java.lang.Throwable -> L1e8
            if (r3 == 0) goto L1e8
            boolean r3 = com.uyumao.e.a(r1, r7)     // Catch: java.lang.Throwable -> L1e8
            if (r3 == 0) goto L1e8
            java.lang.Object r1 = r1.getSystemService(r6)     // Catch: java.lang.Throwable -> L1e8
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch: java.lang.Throwable -> L1e8
            if (r1 != 0) goto L1e5
            goto L1e8
        L1e5:
            r1.removeUpdates(r2)     // Catch: java.lang.Throwable -> L1e8
        L1e8:
            com.uyumao.d.j = r10
            android.content.Context r1 = com.uyumao.d.g
            com.uyumao.d r2 = com.uyumao.d.e.a
            org.json.JSONObject r3 = com.uyumao.d.k
            com.uyumao.g.a(r1, r9, r2, r3)
        L1f3:
            return
    }
}
