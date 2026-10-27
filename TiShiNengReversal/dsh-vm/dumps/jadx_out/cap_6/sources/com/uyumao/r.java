package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class r implements java.lang.Runnable {
    public final org.json.JSONObject a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ com.uyumao.r e;

        public a(com.uyumao.r r1, android.content.Context r2, int r3, int r4, java.lang.String r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r26 = this;
                r1 = r26
                java.lang.String r0 = "forbid_sdk"
                java.lang.String r2 = "local_hit_sdk"
                java.lang.String r3 = "hit_sdk"
                java.lang.String r4 = "sdk"
                java.lang.String r5 = "2G/3G"
                java.lang.String r6 = "p"
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.util.TreeSet r10 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L3b6
                r10.<init>()     // Catch: java.lang.Throwable -> L3b6
                java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3b6
                r11.<init>()     // Catch: java.lang.Throwable -> L3b6
                r12 = 187(0xbb, float:2.62E-43)
                byte[] r13 = new byte[r12]     // Catch: java.lang.Throwable -> L3b0
                r13 = {x03c4: FILL_ARRAY_DATA , data: [18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, 14, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, 13, 3, 21, 21, 12, 40, 14, 29} // fill-array     // Catch: java.lang.Throwable -> L3b0
                r14 = 179(0xb3, float:2.51E-43)
                byte[] r12 = java.util.Arrays.copyOfRange(r13, r14, r12)     // Catch: java.lang.Throwable -> L3b0
                byte[] r13 = java.util.Arrays.copyOf(r13, r14)     // Catch: java.lang.Throwable -> L3b0
                com.uyumao.e.a(r13, r12)     // Catch: java.lang.Throwable -> L3b0
                com.uyumao.e.a(r13, r11)     // Catch: java.lang.Throwable -> L3b0
                org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b0
                java.lang.String r13 = r11.toString()     // Catch: java.lang.Throwable -> L3b0
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L3b0
                java.lang.String r13 = "c"
                java.lang.String r13 = r12.optString(r13)     // Catch: java.lang.Throwable -> L3b0
                java.lang.String r14 = r12.optString(r6)     // Catch: java.lang.Throwable -> L3b0
                android.content.Context r15 = r1.a     // Catch: java.lang.Throwable -> L3b0
                java.lang.Object r9 = com.uyumao.t.a(r13, r14, r9, r15, r9)     // Catch: java.lang.Throwable -> L3b0
                int r13 = r1.b     // Catch: java.lang.Throwable -> L3b0
                java.lang.String r14 = "u"
                java.lang.String r15 = "n"
                r16 = 0
                java.lang.String r7 = "t"
                java.lang.Class r17 = java.lang.Integer.TYPE
                r18 = r8
                java.lang.String r8 = "m"
                r19 = r11
                java.lang.String r11 = "a"
                r20 = r0
                java.lang.String r0 = "v"
                r21 = r2
                java.lang.String r2 = "i"
                r22 = r3
                r3 = 1
                if (r3 != r13) goto Lf2
                java.lang.String r13 = r12.optString(r2)     // Catch: java.lang.Throwable -> Lef
                r23 = r4
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lef
                java.lang.Class<java.lang.String> r24 = java.lang.String.class
                r4[r16] = r24     // Catch: java.lang.Throwable -> Lef
                java.lang.String r24 = r12.optString(r11)     // Catch: java.lang.Throwable -> Lef
                r25 = r5
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lef
                r5[r16] = r24     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r4 = com.uyumao.t.a(r13, r4, r5)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = r12.optString(r8)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r8 = "q"
                java.lang.String r8 = r12.optString(r8)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r13 = r12.optString(r2)     // Catch: java.lang.Throwable -> Lef
                java.lang.Class r13 = com.uyumao.t.a(r13)     // Catch: java.lang.Throwable -> Lef
                r24 = 1
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lef
                r3[r16] = r13     // Catch: java.lang.Throwable -> Lef
                r3[r24] = r17     // Catch: java.lang.Throwable -> Lef
                r13 = 2
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> Lef
                r13[r16] = r4     // Catch: java.lang.Throwable -> Lef
                r13[r24] = r18     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r3 = com.uyumao.t.a(r5, r8, r3, r9, r13)     // Catch: java.lang.Throwable -> Lef
                boolean r4 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> Lef
                if (r4 == 0) goto L139
                java.lang.String r4 = "r"
                java.lang.String r4 = r12.optString(r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = "s"
                java.lang.String r5 = r12.optString(r5)     // Catch: java.lang.Throwable -> Lef
                java.lang.reflect.Field r4 = com.uyumao.t.a(r4, r5)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = r12.optString(r7)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r8 = r12.optString(r15)     // Catch: java.lang.Throwable -> Lef
                java.lang.reflect.Field r5 = com.uyumao.t.a(r5, r8)     // Catch: java.lang.Throwable -> Lef
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lef
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lef
            Ld5:
                boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> Lef
                if (r8 == 0) goto L139
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r8 = com.uyumao.t.a(r4, r8)     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r8 = com.uyumao.t.a(r5, r8)     // Catch: java.lang.Throwable -> Lef
                if (r8 == 0) goto Ld5
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Lef
                r10.add(r8)     // Catch: java.lang.Throwable -> Lef
                goto Ld5
            Lef:
                r0 = move-exception
                goto L3b3
            Lf2:
                r23 = r4
                r25 = r5
                r24 = 1
                java.lang.String r3 = r12.optString(r8)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = r12.optString(r14)     // Catch: java.lang.Throwable -> Lef
                r5 = 1
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lef
                r8[r16] = r17     // Catch: java.lang.Throwable -> Lef
                java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lef
                r13[r16] = r18     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r3 = com.uyumao.t.a(r3, r4, r8, r9, r13)     // Catch: java.lang.Throwable -> Lef
                boolean r4 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> Lef
                if (r4 == 0) goto L139
                java.lang.String r4 = r12.optString(r0)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = r12.optString(r15)     // Catch: java.lang.Throwable -> Lef
                java.lang.reflect.Field r4 = com.uyumao.t.a(r4, r5)     // Catch: java.lang.Throwable -> Lef
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lef
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lef
            L123:
                boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Lef
                if (r5 == 0) goto L139
                java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> Lef
                java.lang.Object r5 = com.uyumao.t.a(r4, r5)     // Catch: java.lang.Throwable -> Lef
                if (r5 == 0) goto L123
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lef
                r10.add(r5)     // Catch: java.lang.Throwable -> Lef
                goto L123
            L139:
                boolean r3 = r10.isEmpty()     // Catch: java.lang.Throwable -> Lef
                if (r3 == 0) goto L143
                com.uyumao.n.a(r19)
                return
            L143:
                if (r9 != 0) goto L149
                com.uyumao.n.a(r19)
                return
            L149:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lef
                r3.<init>()     // Catch: java.lang.Throwable -> Lef
                org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lef
                r4.<init>()     // Catch: java.lang.Throwable -> Lef
                java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> Lef
                r8 = 0
            L158:
                boolean r10 = r5.hasNext()     // Catch: java.lang.Throwable -> Lef
                if (r10 == 0) goto L1b0
                java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> Lef
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lef
                r12 = 0
                java.lang.Object r10 = com.uyumao.n.a(r9, r10, r12)     // Catch: java.lang.Throwable -> Lef
                if (r10 != 0) goto L16e
            L16b:
                r16 = 0
                goto L158
            L16e:
                com.uyumao.p r12 = new com.uyumao.p     // Catch: java.lang.Throwable -> Lef
                r12.<init>(r9, r10)     // Catch: java.lang.Throwable -> Lef
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lef
                r10.<init>()     // Catch: java.lang.Throwable -> Lef
                java.lang.String r13 = r12.b     // Catch: java.lang.Throwable -> Lef
                r10.put(r11, r13)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r13 = r12.a     // Catch: java.lang.Throwable -> Lef
                r10.put(r6, r13)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r13 = r12.c     // Catch: java.lang.Throwable -> Lef
                r10.put(r0, r13)     // Catch: java.lang.Throwable -> Lef
                int r13 = r12.f     // Catch: java.lang.Throwable -> Lef
                r10.put(r7, r13)     // Catch: java.lang.Throwable -> Lef
                r15 = r5
                r13 = r6
                long r5 = r12.d     // Catch: java.lang.Throwable -> Lef
                r10.put(r2, r5)     // Catch: java.lang.Throwable -> Lef
                long r5 = r12.e     // Catch: java.lang.Throwable -> Lef
                r10.put(r14, r5)     // Catch: java.lang.Throwable -> Lef
                r4.put(r10)     // Catch: java.lang.Throwable -> Lef
                int r8 = r8 + 1
                int r5 = r4.length()     // Catch: java.lang.Throwable -> Lef
                int r6 = r1.c     // Catch: java.lang.Throwable -> Lef
                if (r5 != r6) goto L1ad
                r3.add(r4)     // Catch: java.lang.Throwable -> Lef
                org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lef
                r4.<init>()     // Catch: java.lang.Throwable -> Lef
            L1ad:
                r6 = r13
                r5 = r15
                goto L16b
            L1b0:
                int r2 = r4.length()     // Catch: java.lang.Throwable -> Lef
                if (r2 <= 0) goto L1b9
                r3.add(r4)     // Catch: java.lang.Throwable -> Lef
            L1b9:
                boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lef
                if (r2 == 0) goto L1c3
                com.uyumao.n.a(r19)
                return
            L1c3:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lef
                r2.<init>()     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "zid"
                android.content.Context r5 = r1.a     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getZid(r5)     // Catch: java.lang.Throwable -> Lef
                r2.put(r4, r5)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "appkey"
                java.lang.String r5 = r1.d     // Catch: java.lang.Throwable -> Lef
                r2.put(r4, r5)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "umid"
                android.content.Context r5 = r1.a     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getUMId(r5)     // Catch: java.lang.Throwable -> Lef
                r2.put(r4, r5)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "3.0"
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "sdk_v"
                java.lang.String r4 = "1.1.2"
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "os_v"
                java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "brand"
                java.lang.String r4 = com.uyumao.n.b()     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "model"
                java.lang.String r4 = com.uyumao.n.c()     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "uuid"
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "smart_id"
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "src"
                java.lang.String r4 = "risk"
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "imei"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getImeiNew(r4)     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "oaid"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L239
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getOaid(r4)     // Catch: java.lang.Throwable -> L239
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L239
            L239:
                java.lang.String r0 = "idfa"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L244
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIdfa(r4)     // Catch: java.lang.Throwable -> L244
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L244
            L244:
                java.lang.String r0 = "android_id"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r4)     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "pkg"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "app_v"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r4)     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "board"
                java.lang.String r4 = com.uyumao.n.a()     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> L27f
                java.util.Locale r0 = com.umeng.commonsdk.utils.UMUtils.getLocale(r0)     // Catch: java.lang.Throwable -> L27f
                if (r0 == 0) goto L27f
                java.lang.String r4 = "os_lang"
                java.lang.String r0 = r0.getLanguage()     // Catch: java.lang.Throwable -> L27f
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L27f
            L27f:
                java.lang.String r0 = "c_ts"
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lef
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "total"
                r2.put(r0, r8)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r0 = "os_i"
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2ac
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L2ac
                java.lang.String r0 = "os_t"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L2ac
                android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2ac
                int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> L2ac
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L2ac
                java.lang.String r0 = "grant"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L2ac
                boolean r4 = com.uyumao.n.a(r4)     // Catch: java.lang.Throwable -> L2ac
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L2ac
            L2ac:
                java.lang.String r0 = "os"
                java.lang.String r4 = "Android"
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L2cf
                android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> L2cf
                java.lang.String[] r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r0)     // Catch: java.lang.Throwable -> L2cf
                java.lang.String r4 = "Wi-Fi"
                r16 = 0
                r5 = r0[r16]     // Catch: java.lang.Throwable -> L305
                boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L2cf
                java.lang.String r5 = "access"
                if (r4 == 0) goto L2d2
                java.lang.String r4 = "wifi"
                r2.put(r5, r4)     // Catch: java.lang.Throwable -> L2cf
                r16 = 0
                goto L2e7
            L2cf:
                r16 = 0
                goto L305
            L2d2:
                r16 = 0
                r4 = r0[r16]     // Catch: java.lang.Throwable -> L305
                r6 = r25
                boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L305
                if (r4 == 0) goto L2e2
                r2.put(r5, r6)     // Catch: java.lang.Throwable -> L305
                goto L2e7
            L2e2:
                java.lang.String r4 = "unknown"
                r2.put(r5, r4)     // Catch: java.lang.Throwable -> L305
            L2e7:
                java.lang.String r4 = ""
                r24 = 1
                r5 = r0[r24]     // Catch: java.lang.Throwable -> L305
                boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L305
                if (r4 != 0) goto L2fa
                java.lang.String r4 = "sub_access"
                r0 = r0[r24]     // Catch: java.lang.Throwable -> L305
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L305
            L2fa:
                java.lang.String r0 = "display_name"
                android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> L305
                java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r4)     // Catch: java.lang.Throwable -> L305
                r2.put(r0, r4)     // Catch: java.lang.Throwable -> L305
            L305:
                com.uyumao.r r0 = r1.e     // Catch: java.lang.Throwable -> L371
                org.json.JSONObject r0 = com.uyumao.r.a(r0)     // Catch: java.lang.Throwable -> L371
                r4 = r23
                java.lang.String r0 = r0.optString(r4)     // Catch: java.lang.Throwable -> L371
                java.lang.String r5 = ","
                java.lang.String[] r0 = r0.split(r5)     // Catch: java.lang.Throwable -> L371
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L371
                r5.<init>()     // Catch: java.lang.Throwable -> L371
                r12 = 0
            L31d:
                int r6 = r0.length     // Catch: java.lang.Throwable -> L371
                if (r12 >= r6) goto L328
                r6 = r0[r12]     // Catch: java.lang.Throwable -> L371
                r5.put(r6)     // Catch: java.lang.Throwable -> L371
                int r12 = r12 + 1
                goto L31d
            L328:
                r2.put(r4, r5)     // Catch: java.lang.Throwable -> L371
                com.uyumao.r r0 = r1.e     // Catch: java.lang.Throwable -> L371
                org.json.JSONObject r0 = com.uyumao.r.a(r0)     // Catch: java.lang.Throwable -> L371
                r4 = r22
                java.lang.String r0 = r0.optString(r4)     // Catch: java.lang.Throwable -> L371
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L371
                com.uyumao.r r0 = r1.e     // Catch: java.lang.Throwable -> L371
                org.json.JSONObject r0 = com.uyumao.r.a(r0)     // Catch: java.lang.Throwable -> L371
                r4 = r21
                java.lang.String r0 = r0.optString(r4)     // Catch: java.lang.Throwable -> L371
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L371
                com.uyumao.r r0 = r1.e     // Catch: java.lang.Throwable -> L371
                org.json.JSONObject r0 = com.uyumao.r.a(r0)     // Catch: java.lang.Throwable -> L371
                java.lang.String r4 = "actionName"
                java.lang.String r0 = r0.optString(r4)     // Catch: java.lang.Throwable -> L371
                org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L371
                com.uyumao.r r5 = r1.e     // Catch: java.lang.Throwable -> L371
                org.json.JSONObject r5 = com.uyumao.r.a(r5)     // Catch: java.lang.Throwable -> L371
                r6 = r20
                java.lang.String r5 = r5.optString(r6)     // Catch: java.lang.Throwable -> L371
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L371
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L371
                r5.<init>()     // Catch: java.lang.Throwable -> L371
                r5.put(r0, r4)     // Catch: java.lang.Throwable -> L371
                r2.put(r6, r5)     // Catch: java.lang.Throwable -> L371
            L371:
                int r0 = r3.size()     // Catch: java.lang.Throwable -> Lef
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lef
                r7 = 0
            L37a:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lef
                if (r4 == 0) goto L3ac
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lef
                org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Throwable -> Lef
                r24 = 1
                int r7 = r7 + 1
                java.lang.String r5 = "batch"
                r2.put(r5, r7)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = "batch_num"
                r2.put(r5, r0)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = "batch_pkg_num"
                int r6 = r4.length()     // Catch: java.lang.Throwable -> Lef
                r2.put(r5, r6)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r5 = "apl"
                r2.put(r5, r4)     // Catch: java.lang.Throwable -> Lef
                java.lang.String r4 = "https://yumao.puata.info/cc_info"
                java.lang.String r5 = r1.d     // Catch: java.lang.Throwable -> Lef java.lang.Exception -> L3aa
                com.uyumao.e.a(r2, r4, r5)     // Catch: java.lang.Throwable -> Lef java.lang.Exception -> L3aa
                goto L37a
            L3aa:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> Lef
            L3ac:
                com.uyumao.n.a(r19)
                goto L3bd
            L3b0:
                r0 = move-exception
                r19 = r11
            L3b3:
                r9 = r19
                goto L3b7
            L3b6:
                r0 = move-exception
            L3b7:
                r0.getMessage()     // Catch: java.lang.Throwable -> L3be
                com.uyumao.n.a(r9)
            L3bd:
                return
            L3be:
                r0 = move-exception
                com.uyumao.n.a(r9)
                throw r0
        }
    }

    public r(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static /* synthetic */ org.json.JSONObject a(com.uyumao.r r0) {
            org.json.JSONObject r0 = r0.a
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            org.json.JSONObject r0 = r7.a
            if (r0 != 0) goto L5
            goto L37
        L5:
            android.content.Context r3 = com.uyumao.e.a     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r3)     // Catch: java.lang.Throwable -> L37
            org.json.JSONObject r0 = r7.a     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "batch"
            r2 = 300(0x12c, float:4.2E-43)
            int r0 = r0.optInt(r1, r2)     // Catch: java.lang.Throwable -> L37
            r1 = 100
            int r5 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L37
            org.json.JSONObject r0 = r7.a     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "action"
            r2 = 1
            int r4 = r0.optInt(r1, r2)     // Catch: java.lang.Throwable -> L37
            if (r4 == r2) goto L2a
            r0 = 2
            if (r4 == r0) goto L2a
            goto L37
        L2a:
            com.uyumao.r$a r1 = new com.uyumao.r$a     // Catch: java.lang.Throwable -> L37
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            r2 = 0
            com.uyumao.s.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L37
        L37:
            return
    }
}
