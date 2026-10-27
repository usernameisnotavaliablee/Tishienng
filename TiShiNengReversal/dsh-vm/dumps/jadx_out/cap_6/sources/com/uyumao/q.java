package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class q implements java.lang.Runnable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ long e;

        public a(com.uyumao.q r1, android.content.Context r2, int r3, int r4, java.lang.String r5, long r6) {
                r0 = this;
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r21 = this;
                r1 = r21
                java.lang.String r0 = "p"
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r4 = 0
                java.util.TreeSet r5 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L2c5
                r5.<init>()     // Catch: java.lang.Throwable -> L2c5
                java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2c5
                r6.<init>()     // Catch: java.lang.Throwable -> L2c5
                r7 = 187(0xbb, float:2.62E-43)
                byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> Le0
                r8 = {x02d2: FILL_ARRAY_DATA , data: [18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, 14, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, 13, 3, 21, 21, 12, 40, 14, 29} // fill-array     // Catch: java.lang.Throwable -> Le0
                r9 = 179(0xb3, float:2.51E-43)
                byte[] r7 = java.util.Arrays.copyOfRange(r8, r9, r7)     // Catch: java.lang.Throwable -> Le0
                byte[] r8 = java.util.Arrays.copyOf(r8, r9)     // Catch: java.lang.Throwable -> Le0
                com.uyumao.e.a(r8, r7)     // Catch: java.lang.Throwable -> Le0
                com.uyumao.e.a(r8, r6)     // Catch: java.lang.Throwable -> Le0
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le0
                java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> Le0
                r7.<init>(r8)     // Catch: java.lang.Throwable -> Le0
                java.lang.String r8 = "c"
                java.lang.String r8 = r7.optString(r8)     // Catch: java.lang.Throwable -> Le0
                java.lang.String r9 = r7.optString(r0)     // Catch: java.lang.Throwable -> Le0
                android.content.Context r10 = r1.a     // Catch: java.lang.Throwable -> Le0
                java.lang.Object r4 = com.uyumao.t.a(r8, r9, r4, r10, r4)     // Catch: java.lang.Throwable -> Le0
                int r8 = r1.b     // Catch: java.lang.Throwable -> Le0
                java.lang.String r9 = "u"
                java.lang.String r10 = "n"
                java.lang.String r11 = "t"
                java.lang.Class r12 = java.lang.Integer.TYPE
                java.lang.String r13 = "m"
                java.lang.String r14 = "a"
                java.lang.String r15 = "v"
                r16 = 0
                java.lang.String r2 = "i"
                r17 = r3
                r3 = 1
                if (r3 != r8) goto Le5
                java.lang.String r8 = r7.optString(r2)     // Catch: java.lang.Throwable -> Le0
                r18 = r6
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Ldd
                java.lang.Class<java.lang.String> r19 = java.lang.String.class
                r6[r16] = r19     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r19 = r7.optString(r14)     // Catch: java.lang.Throwable -> Ldd
                r20 = r12
                java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ldd
                r12[r16] = r19     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object r6 = com.uyumao.t.a(r8, r6, r12)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r8 = r7.optString(r13)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r12 = "q"
                java.lang.String r12 = r7.optString(r12)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r13 = r7.optString(r2)     // Catch: java.lang.Throwable -> Ldd
                java.lang.Class r13 = com.uyumao.t.a(r13)     // Catch: java.lang.Throwable -> Ldd
                r19 = 1
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Ldd
                r3[r16] = r13     // Catch: java.lang.Throwable -> Ldd
                r3[r19] = r20     // Catch: java.lang.Throwable -> Ldd
                r13 = 2
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> Ldd
                r13[r16] = r6     // Catch: java.lang.Throwable -> Ldd
                r13[r19] = r17     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object r3 = com.uyumao.t.a(r8, r12, r3, r4, r13)     // Catch: java.lang.Throwable -> Ldd
                boolean r6 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> Ldd
                if (r6 == 0) goto L12c
                java.lang.String r6 = "r"
                java.lang.String r6 = r7.optString(r6)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r8 = "s"
                java.lang.String r8 = r7.optString(r8)     // Catch: java.lang.Throwable -> Ldd
                java.lang.reflect.Field r6 = com.uyumao.t.a(r6, r8)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r8 = r7.optString(r11)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r7 = r7.optString(r10)     // Catch: java.lang.Throwable -> Ldd
                java.lang.reflect.Field r7 = com.uyumao.t.a(r8, r7)     // Catch: java.lang.Throwable -> Ldd
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Ldd
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ldd
            Lc3:
                boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> Ldd
                if (r8 == 0) goto L12c
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object r8 = com.uyumao.t.a(r6, r8)     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object r8 = com.uyumao.t.a(r7, r8)     // Catch: java.lang.Throwable -> Ldd
                if (r8 == 0) goto Lc3
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Ldd
                r5.add(r8)     // Catch: java.lang.Throwable -> Ldd
                goto Lc3
            Ldd:
                r0 = move-exception
                goto L2c2
            Le0:
                r0 = move-exception
                r18 = r6
                goto L2c2
            Le5:
                r18 = r6
                r20 = r12
                r19 = 1
                java.lang.String r3 = r7.optString(r13)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r6 = r7.optString(r9)     // Catch: java.lang.Throwable -> Ldd
                r8 = 1
                java.lang.Class[] r12 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Ldd
                r12[r16] = r20     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Ldd
                r13[r16] = r17     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object r3 = com.uyumao.t.a(r3, r6, r12, r4, r13)     // Catch: java.lang.Throwable -> Ldd
                boolean r6 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> Ldd
                if (r6 == 0) goto L12c
                java.lang.String r6 = r7.optString(r15)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r7 = r7.optString(r10)     // Catch: java.lang.Throwable -> Ldd
                java.lang.reflect.Field r6 = com.uyumao.t.a(r6, r7)     // Catch: java.lang.Throwable -> Ldd
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Ldd
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ldd
            L116:
                boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> Ldd
                if (r7 == 0) goto L12c
                java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> Ldd
                java.lang.Object r7 = com.uyumao.t.a(r6, r7)     // Catch: java.lang.Throwable -> Ldd
                if (r7 == 0) goto L116
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Ldd
                r5.add(r7)     // Catch: java.lang.Throwable -> Ldd
                goto L116
            L12c:
                boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> Ldd
                if (r3 == 0) goto L136
                com.uyumao.n.a(r18)
                return
            L136:
                if (r4 != 0) goto L13c
                com.uyumao.n.a(r18)
                return
            L13c:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldd
                r3.<init>()     // Catch: java.lang.Throwable -> Ldd
                org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ldd
                r6.<init>()     // Catch: java.lang.Throwable -> Ldd
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Ldd
                r7 = 0
            L14b:
                boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> Ldd
                if (r8 == 0) goto L1a1
                java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Ldd
                r10 = 0
                java.lang.Object r8 = com.uyumao.n.a(r4, r8, r10)     // Catch: java.lang.Throwable -> Ldd
                if (r8 != 0) goto L161
            L15e:
                r16 = 0
                goto L14b
            L161:
                com.uyumao.p r12 = new com.uyumao.p     // Catch: java.lang.Throwable -> Ldd
                r12.<init>(r4, r8)     // Catch: java.lang.Throwable -> Ldd
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldd
                r8.<init>()     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r13 = r12.b     // Catch: java.lang.Throwable -> Ldd
                r8.put(r14, r13)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r13 = r12.a     // Catch: java.lang.Throwable -> Ldd
                r8.put(r0, r13)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r13 = r12.c     // Catch: java.lang.Throwable -> Ldd
                r8.put(r15, r13)     // Catch: java.lang.Throwable -> Ldd
                int r13 = r12.f     // Catch: java.lang.Throwable -> Ldd
                r8.put(r11, r13)     // Catch: java.lang.Throwable -> Ldd
                r13 = r11
                long r10 = r12.d     // Catch: java.lang.Throwable -> Ldd
                r8.put(r2, r10)     // Catch: java.lang.Throwable -> Ldd
                long r10 = r12.e     // Catch: java.lang.Throwable -> Ldd
                r8.put(r9, r10)     // Catch: java.lang.Throwable -> Ldd
                r6.put(r8)     // Catch: java.lang.Throwable -> Ldd
                int r7 = r7 + 1
                int r8 = r6.length()     // Catch: java.lang.Throwable -> Ldd
                int r10 = r1.c     // Catch: java.lang.Throwable -> Ldd
                if (r8 != r10) goto L19f
                r3.add(r6)     // Catch: java.lang.Throwable -> Ldd
                org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ldd
                r6.<init>()     // Catch: java.lang.Throwable -> Ldd
            L19f:
                r11 = r13
                goto L15e
            L1a1:
                int r0 = r6.length()     // Catch: java.lang.Throwable -> Ldd
                if (r0 <= 0) goto L1aa
                r3.add(r6)     // Catch: java.lang.Throwable -> Ldd
            L1aa:
                boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> Ldd
                if (r0 == 0) goto L1b4
                com.uyumao.n.a(r18)
                return
            L1b4:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldd
                r0.<init>()     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "zid"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getZid(r4)     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "appkey"
                java.lang.String r4 = r1.d     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "umid"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getUMId(r4)     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "2.0"
                r0.put(r15, r2)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "sdk_v"
                java.lang.String r4 = "1.1.2"
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "os_v"
                java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "brand"
                java.lang.String r4 = com.uyumao.n.b()     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "model"
                java.lang.String r4 = com.uyumao.n.c()     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "smart_id"
                long r4 = r1.e     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "src"
                java.lang.String r4 = "risk"
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "imei"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(r4)     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "oaid"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L21f
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getOaid(r4)     // Catch: java.lang.Throwable -> L21f
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> L21f
            L21f:
                java.lang.String r2 = "idfa"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L22a
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIdfa(r4)     // Catch: java.lang.Throwable -> L22a
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> L22a
            L22a:
                java.lang.String r2 = "android_id"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r4)     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "pkg"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "app_v"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r4)     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "board"
                java.lang.String r4 = com.uyumao.n.a()     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> L265
                java.util.Locale r2 = com.umeng.commonsdk.utils.UMUtils.getLocale(r2)     // Catch: java.lang.Throwable -> L265
                if (r2 == 0) goto L265
                java.lang.String r4 = "os_lang"
                java.lang.String r2 = r2.getLanguage()     // Catch: java.lang.Throwable -> L265
                r0.put(r4, r2)     // Catch: java.lang.Throwable -> L265
            L265:
                java.lang.String r2 = "c_ts"
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ldd
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "total"
                r0.put(r2, r7)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r2 = "os_i"
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L292
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> L292
                java.lang.String r2 = "os_t"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L292
                android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L292
                int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> L292
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> L292
                java.lang.String r2 = "grant"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L292
                boolean r4 = com.uyumao.n.a(r4)     // Catch: java.lang.Throwable -> L292
                r0.put(r2, r4)     // Catch: java.lang.Throwable -> L292
            L292:
                java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> Ldd
                r16 = 0
            L298:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Ldd
                if (r3 == 0) goto L2be
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Ldd
                org.json.JSONArray r3 = (org.json.JSONArray) r3     // Catch: java.lang.Throwable -> Ldd
                r19 = 1
                int r4 = r16 + 1
                java.lang.String r5 = "batch"
                r0.put(r5, r4)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r5 = "data"
                r0.put(r5, r3)     // Catch: java.lang.Throwable -> Ldd
                java.lang.String r3 = "https://sss.umeng.com/api/v2/al"
                java.lang.String r5 = r1.d     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> L2bc
                com.uyumao.e.a(r0, r3, r5)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> L2bc
                r16 = r4
                goto L298
            L2bc:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> Ldd
            L2be:
                com.uyumao.n.a(r18)
                goto L2cc
            L2c2:
                r4 = r18
                goto L2c6
            L2c5:
                r0 = move-exception
            L2c6:
                r0.getMessage()     // Catch: java.lang.Throwable -> L2cd
                com.uyumao.n.a(r4)
            L2cc:
                return
            L2cd:
                r0 = move-exception
                com.uyumao.n.a(r4)
                throw r0
        }
    }

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            android.content.Context r0 = com.uyumao.e.a
            com.uyumao.o r1 = com.uyumao.o.a
            if (r1 != 0) goto L1b
            java.lang.Class<com.uyumao.o> r1 = com.uyumao.o.class
            monitor-enter(r1)
            com.uyumao.o r2 = com.uyumao.o.a     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            com.uyumao.o r2 = new com.uyumao.o     // Catch: java.lang.Throwable -> L15
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L15
            com.uyumao.o.a = r2     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L19
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            goto L1b
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
        L1b:
            com.uyumao.o r0 = com.uyumao.o.a
            android.content.Context r1 = r0.b
            boolean r1 = com.uyumao.n.c(r1)
            if (r1 != 0) goto L26
            goto L34
        L26:
            long r1 = r0.a()
            com.uyumao.o$a r3 = r0.c
            r4 = 1
            long r1 = r1 + r4
            java.lang.String r4 = "smart_lc"
            r3.b(r4, r1)
        L34:
            com.uyumao.o$a r1 = r0.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = "smart_lt"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.String r3 = java.lang.String.valueOf(r2)
            android.content.Context r4 = com.uyumao.e.a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            boolean r4 = com.uyumao.n.c(r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r4 == 0) goto L63
            com.uyumao.m r4 = com.uyumao.m.a()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            android.content.SharedPreferences r4 = r4.b     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r3 = r4.getString(r1, r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            goto L63
        L61:
            r0 = move-exception
            throw r0
        L63:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L68
            goto L6a
        L68:
            r1 = 0
        L6a:
            long r3 = r0.a()
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L75
            goto L1a6
        L75:
            java.lang.String r1 = "smart_"
            boolean r1 = r0.a(r1)
            if (r1 != 0) goto L7f
            goto L1a6
        L7f:
            android.content.Context r5 = com.uyumao.e.a     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r5)     // Catch: java.lang.Throwable -> L1a6
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a6
            r1.<init>()     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "zid"
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getZid(r5)     // Catch: java.lang.Throwable -> L1a6
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "imei"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(r5)     // Catch: java.lang.Throwable -> La5
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "oaid"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getOaid(r5)     // Catch: java.lang.Throwable -> La5
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> La5
        La5:
            java.lang.String r3 = "idfa"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIdfa(r5)     // Catch: java.lang.Throwable -> Lae
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> Lae
        Lae:
            java.lang.String r3 = "umid"
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getUMId(r5)     // Catch: java.lang.Throwable -> L1a6
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "android_id"
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r5)     // Catch: java.lang.Throwable -> L1a6
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "sdk_v"
            java.lang.String r4 = "1.1.2"
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "os_v"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L1a6
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "lvl"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1a6
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String[] r3 = com.umeng.commonsdk.utils.UMUtils.getNetworkAccessMode(r5)     // Catch: java.lang.Throwable -> L1a6
            r4 = r3[r2]     // Catch: java.lang.Throwable -> L1a6
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1a6
            if (r4 == 0) goto Le5
            java.lang.String r4 = "Unknown"
            r3[r2] = r4     // Catch: java.lang.Throwable -> L1a6
        Le5:
            java.lang.String r4 = "net"
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L1a6
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r3 = "brand"
            java.lang.String r4 = com.uyumao.n.b()     // Catch: java.lang.Throwable -> L1a6
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            com.uyumao.o$a r3 = r0.c     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r4 = "smart_ts"
            r6 = 0
            long r3 = r3.a(r4, r6)     // Catch: java.lang.Throwable -> L1a6
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 <= 0) goto L108
            java.lang.String r9 = "last"
            r1.put(r9, r3)     // Catch: java.lang.Throwable -> L1a6
        L108:
            java.lang.String r3 = "https://ccs.umeng.com/ra"
            org.json.JSONObject r1 = com.uyumao.e.a(r1, r3, r8, r2)     // Catch: java.lang.Exception -> L10f java.lang.Throwable -> L1a6
            goto L110
        L10f:
            r1 = 0
        L110:
            r2 = 7200(0x1c20, double:3.5573E-320)
            if (r1 != 0) goto L119
            r0.a(r2)     // Catch: java.lang.Throwable -> L1a6
            goto L1a6
        L119:
            java.lang.String r4 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L1a6
            if (r1 != 0) goto L126
            r0.a(r2)     // Catch: java.lang.Throwable -> L1a6
            goto L1a6
        L126:
            java.lang.String r2 = "aa"
            org.json.JSONObject r2 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> L1a6
            if (r2 != 0) goto L133
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a6
            r2.<init>()     // Catch: java.lang.Throwable -> L1a6
        L133:
            java.lang.String r3 = "launch"
            r4 = 5
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Throwable -> L1a6
            com.uyumao.o$a r4 = r0.c     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r9 = "smart_lt"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a6
            r10.<init>()     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r11 = r4.a     // Catch: java.lang.Throwable -> L1a6
            r10.append(r11)     // Catch: java.lang.Throwable -> L1a6
            r10.append(r9)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L1a6
            r4.a(r9, r10)     // Catch: java.lang.Throwable -> L1a6
            long r9 = r0.a()     // Catch: java.lang.Throwable -> L1a6
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L1a6
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L160
            goto L1a6
        L160:
            java.lang.String r3 = "ttl"
            r9 = 86400(0x15180, double:4.26873E-319)
            long r3 = r1.optLong(r3, r9)     // Catch: java.lang.Throwable -> L1a6
            r0.a(r3)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r0 = "id"
            r3 = -1
            long r9 = r1.optLong(r0, r3)     // Catch: java.lang.Throwable -> L1a6
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 > 0) goto L179
            goto L1a6
        L179:
            java.lang.String r0 = "batch"
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r2.optInt(r0, r1)     // Catch: java.lang.Throwable -> L1a6
            r1 = 100
            int r7 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r0 = "action"
            r1 = 1
            int r6 = r2.optInt(r0, r1)     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r0 = "delay"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L1a6
            if (r6 == r1) goto L19a
            r1 = 2
            if (r6 == r1) goto L19a
            goto L1a6
        L19a:
            com.uyumao.q$a r3 = new com.uyumao.q$a     // Catch: java.lang.Throwable -> L1a6
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1a6
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L1a6
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1a6
            com.uyumao.s.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L1a6
        L1a6:
            return
    }
}
