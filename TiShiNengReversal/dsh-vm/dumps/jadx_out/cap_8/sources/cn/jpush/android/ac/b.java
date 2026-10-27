package cn.jpush.android.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1624b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f1625c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f1626d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.util.LinkedList<java.lang.String> f1627e;

    private static class a extends cn.jpush.android.ad.f {
        private android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f1628b;

        /* renamed from: c, reason: collision with root package name */
        private cn.jpush.android.ac.a f1629c;

        public a(android.content.Context r1, java.lang.String r2, cn.jpush.android.ac.a r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.String r1 = "JPConfig"
                r0.f1674e = r1
                r0.f1629c = r3
                r0.f1628b = r2
                return
        }

        private void b() {
                r2 = this;
                android.os.Bundle r0 = cn.jpush.android.local.JPushConstants.getBundle()
                boolean r1 = cn.jiguang.internal.JConstants.isTestEnv()
                if (r1 == 0) goto L4a
                if (r0 == 0) goto L4a
                java.lang.String r1 = "test_key_config_url"
                java.lang.String r0 = r0.getString(r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L4a
                java.util.LinkedList r1 = cn.jpush.android.ad.m.c(r0)
                if (r1 == 0) goto L4a
                java.util.LinkedList r1 = cn.jpush.android.ac.b.c()
                r1.clear()
                java.util.LinkedList r1 = cn.jpush.android.ac.b.c()
                java.util.LinkedList r0 = cn.jpush.android.ad.m.c(r0)
                r1.addAll(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "test env and use the test urls "
                r0.append(r1)
                java.util.LinkedList r1 = cn.jpush.android.ac.b.c()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "JPConfig"
                cn.jpush.android.helper.Logger.d(r1, r0)
            L4a:
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r11 = this;
                java.lang.String r0 = "application/json"
                java.lang.String r1 = "JPConfig"
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1c
                android.content.Context r4 = r11.a     // Catch: java.lang.Throwable -> L1c
                long r4 = cn.jpush.android.cache.a.t(r4)     // Catch: java.lang.Throwable -> L1c
                long r2 = r2 - r4
                r4 = 86400000(0x5265c00, double:4.2687272E-316)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L1f
                java.lang.String r0 = "it not sdk config request business time"
                cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r0 = move-exception
                goto L1ed
            L1f:
                cn.jpush.android.ac.e r2 = cn.jpush.android.ac.e.a()     // Catch: java.lang.Throwable -> L1c
                android.content.Context r3 = r11.a     // Catch: java.lang.Throwable -> L1c
                byte r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L1c
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
                r3.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r4 = "dev_key"
                java.lang.String r5 = r11.f1628b     // Catch: java.lang.Throwable -> L1c
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r4 = "p_name"
                android.content.Context r5 = r11.a     // Catch: java.lang.Throwable -> L1c
                java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L1c
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r4 = "rom_type"
                r3.put(r4, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = cn.jpush.android.ad.a.d(r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r2.toUpperCase()     // Catch: java.lang.Throwable -> L1c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r4.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r5 = r11.f1628b     // Catch: java.lang.Throwable -> L1c
                r4.append(r5)     // Catch: java.lang.Throwable -> L1c
                r4.append(r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = cn.jpush.android.ad.a.d(r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r2.toUpperCase()     // Catch: java.lang.Throwable -> L1c
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1c
                if (r4 == 0) goto L76
                java.lang.String r0 = "authToken is null"
            L72:
                cn.jpush.android.helper.Logger.w(r1, r0)     // Catch: java.lang.Throwable -> L1c
                return
            L76:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r4.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r5 = r11.f1628b     // Catch: java.lang.Throwable -> L1c
                r4.append(r5)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r5 = ":"
                r4.append(r5)     // Catch: java.lang.Throwable -> L1c
                r4.append(r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L1c
                byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L1c
                r4 = 10
                java.lang.String r2 = android.util.Base64.encodeToString(r2, r4)     // Catch: java.lang.Throwable -> L1c
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1c
                if (r4 == 0) goto L9f
                java.lang.String r0 = "authorization is null"
                goto L72
            L9f:
                java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L1c
                byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r5 = cn.jpush.android.ac.b.a()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = cn.jpush.android.ac.b.b()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r4 = cn.jpush.android.ad.l.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
                r11.b()     // Catch: java.lang.Throwable -> L1c
                android.content.Context r5 = r11.a     // Catch: java.lang.Throwable -> L1c
                java.util.LinkedList r6 = cn.jpush.android.ac.b.c()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.ad.m.a(r5, r6)     // Catch: java.lang.Throwable -> L1c
                java.util.LinkedList r5 = cn.jpush.android.ac.b.c()     // Catch: java.lang.Throwable -> L1c
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L1c
            Lc7:
                boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L1c
                if (r6 == 0) goto L1e5
                java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.w.c r7 = new cn.jpush.android.w.c     // Catch: java.lang.Throwable -> L1c
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "init_config"
                r7.a(r8)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "Content-Type"
                r7.a(r8, r0)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "Accept"
                r7.a(r8, r0)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "X-Http-Platform"
                java.lang.String r9 = "android"
                r7.a(r8, r9)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "Authorization"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r9.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r10 = "Basic "
                r9.append(r10)     // Catch: java.lang.Throwable -> L1c
                r9.append(r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L1c
                r7.a(r8, r9)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "Charset"
                java.lang.String r9 = "UTF-8"
                r7.a(r8, r9)     // Catch: java.lang.Throwable -> L1c
                r7.a(r4)     // Catch: java.lang.Throwable -> L1c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r8.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r9 = "url: "
                r8.append(r9)     // Catch: java.lang.Throwable -> L1c
                r8.append(r6)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = ", request param: "
                r8.append(r6)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L1c
                r8.append(r6)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.helper.Logger.d(r1, r6)     // Catch: java.lang.Throwable -> L1c
                android.content.Context r6 = r11.a     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.w.d r6 = cn.jpush.android.w.e.a(r6, r7)     // Catch: java.lang.Throwable -> L1c
                int r7 = r6.b()     // Catch: java.lang.Throwable -> L1c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r8.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r9 = "responseCode:"
                r8.append(r9)     // Catch: java.lang.Throwable -> L1c
                r8.append(r7)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.helper.Logger.d(r1, r8)     // Catch: java.lang.Throwable -> L1c
                r8 = 200(0xc8, float:2.8E-43)
                if (r8 == r7) goto L152
                goto Lc7
            L152:
                java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> L1c
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r7.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "responseBody:"
                r7.append(r8)     // Catch: java.lang.Throwable -> L1c
                r7.append(r6)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.helper.Logger.d(r1, r7)     // Catch: java.lang.Throwable -> L1c
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L1c
                if (r7 != 0) goto Lc7
                java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L182
                java.lang.String r8 = cn.jpush.android.ac.b.a()     // Catch: java.lang.Throwable -> L182
                java.lang.String r9 = cn.jpush.android.ac.b.b()     // Catch: java.lang.Throwable -> L182
                byte[] r6 = cn.jpush.android.ad.l.a(r6, r8, r9)     // Catch: java.lang.Throwable -> L182
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L182
                goto L19d
            L182:
                r6 = move-exception
                java.lang.String r7 = ""
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r8.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r9 = "decode response failed, "
                r8.append(r9)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L1c
                r8.append(r6)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.helper.Logger.w(r1, r6)     // Catch: java.lang.Throwable -> L1c
            L19d:
                cn.jpush.android.ac.a r6 = r11.f1629c     // Catch: java.lang.Throwable -> L1c
                if (r6 == 0) goto Lc7
                boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L1c
                if (r6 != 0) goto Lc7
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
                r6.<init>()     // Catch: java.lang.Throwable -> L1c
                java.lang.String r8 = "request response - p2:"
                r6.append(r8)     // Catch: java.lang.Throwable -> L1c
                r6.append(r7)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.helper.Logger.d(r1, r6)     // Catch: java.lang.Throwable -> L1c
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r7 = "code"
                int r7 = r6.optInt(r7)     // Catch: java.lang.Throwable -> L1c
                r8 = 2000(0x7d0, float:2.803E-42)
                if (r7 != r8) goto Lc7
                android.content.Context r0 = r11.a     // Catch: java.lang.Throwable -> L1c
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.cache.a.d(r0, r2)     // Catch: java.lang.Throwable -> L1c
                cn.jpush.android.ac.a r0 = r11.f1629c     // Catch: java.lang.Throwable -> L1c
                android.content.Context r2 = r11.a     // Catch: java.lang.Throwable -> L1c
                java.lang.String r3 = "data"
                org.json.JSONObject r3 = r6.optJSONObject(r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1c
                r0.a(r2, r3)     // Catch: java.lang.Throwable -> L1c
                goto L205
            L1e5:
                cn.jpush.android.ac.a r0 = r11.f1629c     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L205
                r0.a()     // Catch: java.lang.Throwable -> L1c
                goto L205
            L1ed:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "request JP config failed, "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jpush.android.helper.Logger.w(r1, r0)
            L205:
                return
        }
    }

    static {
            java.lang.String r0 = new java.lang.String
            r1 = 16
            byte[] r2 = new byte[r1]
            r2 = {x004a: FILL_ARRAY_DATA , data: [73, 55, 77, 85, 90, 88, 67, 80, 90, 87, 82, 70, 90, 65, 74, 83} // fill-array
            r0.<init>(r2)
            cn.jpush.android.ac.b.a = r0
            java.lang.String r0 = new java.lang.String
            byte[] r1 = new byte[r1]
            r1 = {x0056: FILL_ARRAY_DATA , data: [67, 66, 68, 72, 74, 88, 77, 68, 68, 86, 88, 72, 56, 84, 72, 87} // fill-array
            r0.<init>(r1)
            cn.jpush.android.ac.b.f1624b = r0
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [96, 98, 101, 64, 83, 35, 39, 57, 114, 85, 19, 124, 63, 35, 117, 5, 14, 115, 120, 99, 98, 88, 14, 122, 102, 57, 102, 89, 15, 122, 102, 122} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ac.b.f1625c = r0
            r1 = 37
            byte[] r1 = new byte[r1]
            r1 = {x0076: FILL_ARRAY_DATA , data: [113, 124, 98, 97, 67, 26, 54, 39, 117, 116, 3, 69, 46, 61, 114, 36, 29, 73, 105, 126, 32, 63, 90, 80, 108, 123, 126, 63, 83, 78, 54, 127, 127, 62, 83, 78, 117} // fill-array
            java.lang.String r1 = cn.jpush.android.ad.d.b(r1)
            cn.jpush.android.ac.b.f1626d = r1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            cn.jpush.android.ac.b.f1627e = r2
            r2.clear()
            java.util.LinkedList<java.lang.String> r2 = cn.jpush.android.ac.b.f1627e
            r2.add(r0)
            java.util.LinkedList<java.lang.String> r0 = cn.jpush.android.ac.b.f1627e
            r0.add(r1)
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = cn.jpush.android.ac.b.a
            return r0
    }

    public static void a(android.content.Context r1, java.lang.String r2, cn.jpush.android.ac.a r3) {
            cn.jpush.android.ac.b$a r0 = new cn.jpush.android.ac.b$a
            r0.<init>(r1, r2, r3)
            r2 = 0
            cn.jpush.android.helper.JCoreHelper.normalExecutor(r1, r2, r0)
            return
    }

    static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = cn.jpush.android.ac.b.f1624b
            return r0
    }

    static /* synthetic */ java.util.LinkedList c() {
            java.util.LinkedList<java.lang.String> r0 = cn.jpush.android.ac.b.f1627e
            return r0
    }
}
