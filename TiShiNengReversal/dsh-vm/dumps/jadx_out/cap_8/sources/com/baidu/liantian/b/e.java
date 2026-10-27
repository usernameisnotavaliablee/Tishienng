package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {
    public static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f5908b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f5909c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f5910d = "1000001";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f5911e = "0a2ff98dd00fdca15fcdbc895fc09e6b";

    /* renamed from: f, reason: collision with root package name */
    public static com.baidu.liantian.LiantianReceiver f5912f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.Map<java.lang.String, java.lang.String> f5913g = null;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f5914h = "";

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f5915i = "";

    /* renamed from: j, reason: collision with root package name */
    private static int f5916j = -1;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.baidu.liantian.b.e.f5913g = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Class<?> a(java.lang.String r1) {
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto Lf
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        Lf:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L1e
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L1e:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L2d
            java.lang.Class r1 = java.lang.Character.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L2d:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L3c
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L3c:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L4b
            java.lang.Class r1 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L4b:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L5a:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L69
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L69:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L7b
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L78
            return r1
        L78:
            com.baidu.liantian.b.c()
        L7b:
            r1 = 0
            return r1
    }

    public static java.lang.Object a(java.lang.Object r5, java.lang.String r6, java.lang.Class<?>[] r7, java.lang.Object... r8) {
            if (r5 == 0) goto L53
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L53
            if (r7 == 0) goto L1c
            if (r8 == 0) goto L1c
            int r0 = r7.length
            int r1 = r8.length
            if (r0 != r1) goto L11
            goto L1c
        L11:
            com.baidu.liantian.b.a()
            java.lang.NoSuchMethodException r5 = new java.lang.NoSuchMethodException
            java.lang.String r6 = "paramTypes or args fail"
            r5.<init>(r6)
            throw r5
        L1c:
            java.lang.Class r0 = r5.getClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
        L26:
            if (r2 >= r1) goto L34
            r3 = r0[r2]
            boolean r4 = a(r3, r6, r7)
            if (r4 == 0) goto L31
            goto L35
        L31:
            int r2 = r2 + 1
            goto L26
        L34:
            r3 = 0
        L35:
            if (r3 == 0) goto L3c
            java.lang.Object r5 = r3.invoke(r5, r8)
            return r5
        L3c:
            com.baidu.liantian.b.a()
            java.lang.NoSuchMethodException r5 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "cannot find method in target methodName="
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L53:
            com.baidu.liantian.b.a()
            java.lang.NoSuchMethodException r7 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "object="
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r5 = ", methodName="
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
    }

    private static java.lang.String a(int r3) {
            java.lang.String r0 = "/proc/%d/cmdline"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1f
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1f
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = java.lang.String.format(r0, r1)     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = h(r3)     // Catch: java.lang.Exception -> L1f
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto L1e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Exception -> L20
        L1e:
            return r3
        L1f:
            r3 = 0
        L20:
            com.baidu.liantian.b.c()
            return r3
    }

    public static java.lang.String a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = ""
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.io.InputStream r2 = r3.open(r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r1.load(r2)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            java.lang.String r0 = r1.getProperty(r5)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            if (r2 == 0) goto L42
        L19:
            r2.close()     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L3f
            goto L42
        L1d:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L3f
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L3f
            goto L42
        L25:
            r3 = move-exception
            goto L31
        L27:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L25
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L42
            goto L19
        L31:
            if (r2 == 0) goto L3e
            r2.close()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            goto L3e
        L37:
            r4 = move-exception
            r4.getMessage()     // Catch: java.lang.Throwable -> L3f
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r3     // Catch: java.lang.Throwable -> L3f
        L3f:
            com.baidu.liantian.b.c()
        L42:
            return r0
    }

    private static java.lang.String a(java.io.InputStream r4) {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r4, r2)
            r0.<init>(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r1 = 1
        L12:
            java.lang.String r2 = r0.readLine()
            if (r2 == 0) goto L25
            if (r1 != 0) goto L20
            r3 = 10
            r4.append(r3)
            goto L21
        L20:
            r1 = 0
        L21:
            r4.append(r2)
            goto L12
        L25:
            java.lang.String r4 = r4.toString()
            return r4
    }

    public static java.lang.String a(java.lang.Class<?> r2) {
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L17
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        L17:
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L2e
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        L2e:
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Character.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L45
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        L45:
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L5c
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        L5c:
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L73
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        L73:
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L8a
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        L8a:
            java.lang.String r0 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto La1
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        La1:
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto Lbb
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lb8
            return r2
        Lb8:
            com.baidu.liantian.b.c()
        Lbb:
            r2 = 0
            return r2
    }

    public static java.lang.String a(byte[] r5) {
            java.lang.String r0 = ""
            r1 = 0
        L3:
            int r2 = r5.length
            if (r1 >= r2) goto L39
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "0"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.toUpperCase()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L3
        L39:
            return r0
    }

    public static java.security.PublicKey a(android.content.pm.PackageInfo r1, java.lang.String r2) {
            android.content.pm.Signature[] r1 = r1.signatures
            if (r1 == 0) goto L14
            int r0 = r1.length
            if (r0 <= 0) goto L14
            r0 = 0
            r1 = r1[r0]
            if (r1 == 0) goto L14
            java.security.PublicKey r1 = com.baidu.liantian.b.d.a(r1)     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            com.baidu.liantian.b.c()
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L1b
            java.security.PublicKey r1 = com.baidu.liantian.b.d.a(r2)
        L1b:
            return r1
    }

    public static org.json.JSONObject a(android.content.Context r2, com.baidu.liantian.rp.a.a r3, java.lang.String r4, boolean r5) {
            java.lang.String r0 = r3.a
            java.lang.String r1 = r3.f5999c
            if (r5 == 0) goto L9
            java.lang.String r3 = r3.f6000d
            goto Lb
        L9:
            java.lang.String r3 = r3.f6001e
        Lb:
            org.json.JSONObject r2 = a(r2, r0, r1, r3, r4)
            return r2
    }

    public static org.json.JSONObject a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r0 = "0"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L79
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "1"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "2"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String[] r6 = g(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "3"
            r3 = 0
            if (r6 == 0) goto L30
            int r4 = r6.length     // Catch: java.lang.Throwable -> L79
            r5 = 2
            if (r4 != r5) goto L30
            r6 = r6[r3]     // Catch: java.lang.Throwable -> L79
            r2.put(r0, r6)     // Catch: java.lang.Throwable -> L79
            goto L35
        L30:
            java.lang.String r6 = com.baidu.liantian.b.e.f5910d     // Catch: java.lang.Throwable -> L79
            r2.put(r0, r6)     // Catch: java.lang.Throwable -> L79
        L35:
            java.lang.String r6 = "4"
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "5"
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "6"
            r0 = 1
            r2.put(r6, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "7"
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "8"
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "9"
            r2.put(r6, r8)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "10"
            r2.put(r6, r9)     // Catch: java.lang.Throwable -> L79
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L79
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L79
            if (r7 != 0) goto L6e
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L79
            r7.<init>(r10)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L79
            r6 = r7
            goto L6e
        L6b:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L79
        L6e:
            java.lang.String r7 = "Common_section"
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = "Module_section"
            r1.put(r7, r6)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            com.baidu.liantian.b.c()
        L7c:
            return r1
    }

    public static org.json.JSONObject a(android.content.Context r17, org.json.JSONObject r18) {
            r0 = r18
            java.lang.String r1 = "xygls"
            java.lang.String r2 = ""
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.System.currentTimeMillis()
            java.lang.String r4 = "Common_section"
            org.json.JSONObject r4 = r0.getJSONObject(r4)     // Catch: java.lang.Exception -> L15
            goto L19
        L15:
            com.baidu.liantian.b.c()
            r4 = 0
        L19:
            java.lang.String r5 = "10"
            java.lang.String r6 = r4.optString(r5)
            java.lang.String r7 = "0"
            long r7 = r4.optLong(r7)
            java.lang.String r9 = "1"
            java.lang.String r10 = r4.optString(r9)
            java.lang.String r11 = "3"
            java.lang.String r12 = r4.optString(r11)
            java.lang.String r13 = "8"
            java.lang.String r14 = r4.optString(r13)
            java.lang.String r15 = "9"
            java.lang.String r4 = r4.optString(r15)
            android.content.pm.ApplicationInfo r0 = r17.getApplicationInfo()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L14e
            r16 = r1
            android.content.pm.PackageManager r1 = r17.getPackageManager()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L14e
            java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L14e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L14e
            goto L56
        L50:
            r16 = r1
        L52:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L14e
            r0 = r2
        L56:
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "2"
            java.lang.String r1 = r17.getPackageName()     // Catch: java.lang.Throwable -> L14e
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = r(r17)     // Catch: java.lang.Throwable -> L14e
            r3.put(r11, r0)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "4"
            java.lang.String r1 = com.baidu.liantian.b.g.a(r17)     // Catch: java.lang.Throwable -> L14e
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "5"
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "6"
            r3.put(r0, r7)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "7"
            r3.put(r0, r10)     // Catch: java.lang.Throwable -> L14e
            r3.put(r13, r12)     // Catch: java.lang.Throwable -> L14e
            r3.put(r15, r14)     // Catch: java.lang.Throwable -> L14e
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L14e
            com.baidu.liantian.e r0 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L14e
            r1 = r17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r4 = "11"
            android.content.SharedPreferences r5 = r0.f5994e     // Catch: java.lang.Throwable -> L14e
            java.lang.String r6 = "re_a_cv"
            java.lang.String r5 = r5.getString(r6, r2)     // Catch: java.lang.Throwable -> L14e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r4 = "12"
            android.content.SharedPreferences r5 = r0.f5994e     // Catch: java.lang.Throwable -> L14e
            java.lang.String r6 = "re_a_lc"
            java.lang.String r5 = r5.getString(r6, r2)     // Catch: java.lang.Throwable -> L14e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r4 = "13"
            boolean r5 = r0.o()     // Catch: java.lang.Throwable -> L14e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L14e
            int r4 = m(r1)     // Catch: java.lang.Throwable -> L14e
            r5 = 4
            java.lang.String r6 = "14"
            if (r4 != r5) goto Lc2
            r4 = 1
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L14e
            goto Lc6
        Lc2:
            r4 = 2
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L14e
        Lc6:
            java.lang.String r4 = "20"
            java.lang.String r5 = com.baidu.liantian.b.g.d(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r4 = "21"
            java.lang.String r5 = com.baidu.liantian.b.g.g(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r4 = "22"
            java.lang.String r5 = com.baidu.liantian.b.g.b(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L14e
            android.content.SharedPreferences r4 = r0.f5991b     // Catch: java.lang.Throwable -> L14e
            r5 = r16
            java.lang.String r4 = r4.getString(r5, r2)     // Catch: java.lang.Throwable -> L14e
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L14e
            if (r6 == 0) goto L106
            java.lang.String r4 = com.baidu.liantian.b.k.a(r1)     // Catch: java.lang.Throwable -> L106
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L106
            if (r6 == 0) goto Lfa
            goto Lfb
        Lfa:
            r2 = r4
        Lfb:
            android.content.SharedPreferences$Editor r4 = r0.f5993d     // Catch: java.lang.Throwable -> L105
            r4.putString(r5, r2)     // Catch: java.lang.Throwable -> L105
            android.content.SharedPreferences$Editor r0 = r0.f5993d     // Catch: java.lang.Throwable -> L105
            r0.commit()     // Catch: java.lang.Throwable -> L105
        L105:
            r4 = r2
        L106:
            java.lang.String r0 = "23"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "25"
            java.lang.String r2 = com.baidu.liantian.rp.a.a(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "26"
            java.lang.String r2 = com.baidu.liantian.rp.a.b(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "27"
            java.lang.String r2 = com.baidu.liantian.rp.a.c(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "28"
            java.lang.String r1 = com.baidu.liantian.b.p.a(r1)     // Catch: java.lang.Throwable -> L14e
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r0 = "Module_section"
            r1 = r18
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L14e
            boolean r1 = r0 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L14e
            java.lang.String r2 = "module_section"
            if (r1 == 0) goto L141
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L14e
            goto L151
        L141:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14e
            r1.<init>()     // Catch: java.lang.Throwable -> L14e
            org.json.JSONArray r0 = r1.put(r0)     // Catch: java.lang.Throwable -> L14e
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L14e
            goto L151
        L14e:
            com.baidu.liantian.b.c()
        L151:
            return r3
    }

    public static void a() {
            com.baidu.liantian.b.c()
            return
    }

    public static void a(android.content.Context r4, long r5) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.b.r.p"
            r1.<init>(r2)
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r3 = 101(0x65, float:1.42E-43)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r4, r3, r1, r2)
            r0.cancel(r4)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            com.baidu.liantian.b.c()
        L1e:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r5
            r5 = 0
            r0.set(r5, r1, r4)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            com.baidu.liantian.b.c()
            return
    }

    public static void a(android.content.Context r3, android.content.Intent r4) {
            android.net.Uri r0 = r4.getData()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r0.getSchemeSpecificPart()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "android.intent.extra.REPLACING"
            r2 = 0
            boolean r4 = r4.getBooleanExtra(r1, r2)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L12
            goto L28
        L12:
            java.util.Map<java.lang.String, java.lang.String> r4 = com.baidu.liantian.b.e.f5913g     // Catch: java.lang.Throwable -> L29
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L28
            java.util.Map<java.lang.String, java.lang.String> r4 = com.baidu.liantian.b.e.f5913g     // Catch: java.lang.Throwable -> L29
            r4.remove(r0)     // Catch: java.lang.Throwable -> L29
            com.baidu.liantian.ac.U r4 = new com.baidu.liantian.ac.U     // Catch: java.lang.Throwable -> L29
            r0 = 4
            r4.<init>(r3, r0, r2)     // Catch: java.lang.Throwable -> L29
            r4.start()     // Catch: java.lang.Throwable -> L29
        L28:
            return
        L29:
            com.baidu.liantian.b.c()
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.a(r3)
            r0.a()
            com.baidu.liantian.b.f r0 = com.baidu.liantian.b.f.a(r3)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r2 = 8
            r1.what = r2
            com.baidu.liantian.rp.f.a r0 = r0.a
            r0.a(r1)
            com.baidu.liantian.rp.a.a r0 = new com.baidu.liantian.rp.a.a
            r0.<init>()
            r0.a = r4
            r0.f5998b = r5
            r0.f5999c = r6
            r0.f6000d = r7
            r0.f6001e = r8
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto Lbf
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 == 0) goto L36
            goto Lbf
        L36:
            com.baidu.liantian.e r4 = new com.baidu.liantian.e
            r4.<init>(r3)
            java.util.List r5 = r4.w()
            if (r5 != 0) goto L45
            r4.a(r0)
            goto L4e
        L45:
            boolean r6 = r5.contains(r0)
            if (r6 != 0) goto L89
            r4.a(r0)
        L4e:
            java.lang.String r5 = r0.f6001e
            android.content.SharedPreferences r4 = r4.f5994e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "re_net_ins_"
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 0
            boolean r4 = r4.getBoolean(r5, r6)
            if (r4 != 0) goto L7a
            com.baidu.liantian.b.f r4 = com.baidu.liantian.b.f.a(r3)
            android.os.Message r5 = new android.os.Message
            r5.<init>()
            r6 = 3
            r5.what = r6
            r5.obj = r0
            com.baidu.liantian.rp.f.a r4 = r4.a
            r4.a(r5)
        L7a:
            com.baidu.liantian.b.f r4 = com.baidu.liantian.b.f.a(r3)
            r4.b()
            com.baidu.liantian.b.f r3 = com.baidu.liantian.b.f.a(r3)
            r3.c()
            return
        L89:
            int r6 = r5.indexOf(r0)
            r7 = -1
            if (r6 == r7) goto Lb8
            java.lang.Object r5 = r5.get(r6)
            com.baidu.liantian.rp.a.a r5 = (com.baidu.liantian.rp.a.a) r5
            if (r5 == 0) goto Lb8
            java.lang.String r5 = com.baidu.liantian.rp.a.a.a(r5)
            java.lang.String r6 = com.baidu.liantian.rp.a.a.a(r0)
            android.content.SharedPreferences r7 = r4.f5994e
            java.lang.String r8 = ""
            java.lang.String r0 = "re_con"
            java.lang.String r7 = r7.getString(r0, r8)
            java.lang.String r5 = r7.replace(r5, r6)
            android.content.SharedPreferences$Editor r6 = r4.f5995f
            r6.putString(r0, r5)
            android.content.SharedPreferences$Editor r4 = r4.f5995f
            r4.commit()
        Lb8:
            com.baidu.liantian.b.f r3 = com.baidu.liantian.b.f.a(r3)
            r3.b()
        Lbf:
            return
    }

    public static void a(android.content.Context r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto La8
            boolean r1 = com.baidu.liantian.core.d.f5952c
            if (r1 != 0) goto Le
            goto La8
        Le:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5
            r1.<init>()     // Catch: java.lang.Throwable -> La5
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "0"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "1"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "2"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String[] r0 = g(r7)     // Catch: java.lang.Throwable -> La5
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4a
            int r5 = r0.length     // Catch: java.lang.Throwable -> La5
            r6 = 2
            if (r5 != r6) goto L4a
            r5 = r0[r4]     // Catch: java.lang.Throwable -> La5
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La5
            if (r5 != 0) goto L4a
            r5 = r0[r3]     // Catch: java.lang.Throwable -> La5
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La5
            if (r5 != 0) goto L4a
            r0 = r0[r4]     // Catch: java.lang.Throwable -> La5
            goto L4c
        L4a:
            java.lang.String r0 = com.baidu.liantian.b.e.f5910d     // Catch: java.lang.Throwable -> La5
        L4c:
            java.lang.String r5 = "3"
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "4"
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "5"
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "6"
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "7"
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "8"
            java.lang.String r3 = "liantian"
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "3.1.6.7"
            java.lang.String r3 = "9"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "10"
            r2.put(r0, r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = "Common_section"
            r1.put(r8, r2)     // Catch: java.lang.Throwable -> La5
            int r8 = r9.size()     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "Module_section"
            if (r8 <= 0) goto L8e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La5
            r1.put(r0, r8)     // Catch: java.lang.Throwable -> La5
            goto L96
        L8e:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5
            r8.<init>()     // Catch: java.lang.Throwable -> La5
            r1.put(r0, r8)     // Catch: java.lang.Throwable -> La5
        L96:
            com.baidu.liantian.rp.Report r7 = com.baidu.liantian.rp.Report.getInstance(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> La5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> La5
            r7.s(r8)     // Catch: java.lang.Throwable -> La5
            return
        La5:
            com.baidu.liantian.b.c()
        La8:
            return
    }

    public static void a(android.content.Context r3, byte[] r4) {
            java.lang.String[] r0 = g(r3)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            int r1 = r0.length     // Catch: java.lang.Throwable -> L41
            r2 = 2
            if (r1 != r2) goto L41
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L41
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L41
            r2 = 1
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L41
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L41
            java.lang.String r2 = "200080"
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L41
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "com.baidu.BaiduMap"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L41
            if (r4 == 0) goto L41
        L34:
            int r3 = r4.length     // Catch: java.lang.Throwable -> L41
            if (r1 >= r3) goto L41
            r3 = r4[r1]     // Catch: java.lang.Throwable -> L41
            r3 = r3 ^ 246(0xf6, float:3.45E-43)
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L41
            r4[r1] = r3     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + 1
            goto L34
        L41:
            return
    }

    public static void a(java.io.File r5, java.io.File r6) {
            if (r5 == 0) goto L87
            if (r6 == 0) goto L87
            boolean r0 = a(r5)
            if (r0 != 0) goto Lc
            goto L87
        Lc:
            boolean r0 = r6.exists()
            if (r0 == 0) goto L15
            r6.delete()
        L15:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L57
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L55
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L53
        L24:
            int r3 = r1.read(r0)     // Catch: java.lang.Throwable -> L53
            r4 = -1
            if (r3 == r4) goto L30
            r4 = 0
            r2.write(r0, r4, r3)     // Catch: java.lang.Throwable -> L53
            goto L24
        L30:
            r2.flush()     // Catch: java.lang.Throwable -> L53
            r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L53
            r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L53
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L53
            r1.close()     // Catch: java.io.IOException -> L40
            goto L47
        L40:
            r5 = move-exception
            r5.getMessage()
            com.baidu.liantian.b.b()
        L47:
            r2.close()     // Catch: java.io.IOException -> L4b
            goto L87
        L4b:
            r5 = move-exception
            r5.getMessage()
            com.baidu.liantian.b.b()
            return
        L53:
            r0 = r1
            goto L58
        L55:
            r2 = r0
            goto L53
        L57:
            r2 = r0
        L58:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L68
            r0.close()     // Catch: java.io.IOException -> L61
            goto L68
        L61:
            r5 = move-exception
            r5.getMessage()
            com.baidu.liantian.b.b()
        L68:
            if (r2 == 0) goto L87
            goto L47
        L6b:
            r5 = move-exception
            if (r0 == 0) goto L79
            r0.close()     // Catch: java.io.IOException -> L72
            goto L79
        L72:
            r6 = move-exception
            r6.getMessage()
            com.baidu.liantian.b.b()
        L79:
            if (r2 == 0) goto L86
            r2.close()     // Catch: java.io.IOException -> L7f
            goto L86
        L7f:
            r6 = move-exception
            r6.getMessage()
            com.baidu.liantian.b.b()
        L86:
            throw r5
        L87:
            return
    }

    public static void a(java.lang.String r0, java.lang.String r1) {
            com.baidu.liantian.b.e.f5908b = r0
            com.baidu.liantian.b.e.f5909c = r1
            return
    }

    public static void a(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "771"
            d(r0, r1)
            com.baidu.liantian.b.a()
            if (r2 == 0) goto L1d
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = r2.getParentFile()
            java.lang.String r1 = r1.getAbsolutePath()
            d(r0, r1)
            com.baidu.liantian.b.a()
        L1d:
            return
    }

    public static boolean a(android.content.Context r2) {
            java.lang.String r0 = b(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = com.baidu.liantian.b.e.f5915i     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L16
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L31
            com.baidu.liantian.b.e.f5915i = r1     // Catch: java.lang.Throwable -> L31
        L16:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L23
            java.lang.String r2 = com.baidu.liantian.b.e.f5915i     // Catch: java.lang.Throwable -> L31
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L31
            return r2
        L23:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = com.baidu.liantian.b.e.f5915i     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            r2 = 1
            return r2
        L31:
            com.baidu.liantian.b.c()
        L34:
            r2 = 0
            return r2
    }

    public static boolean a(android.content.Context r2, int r3) {
            r0 = 1
            if (r3 != r0) goto L30
            boolean r3 = e(r2)
            if (r3 != 0) goto L30
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r1)
            com.baidu.liantian.LiantianReceiver r1 = com.baidu.liantian.b.e.f5912f
            if (r1 != 0) goto L1f
            com.baidu.liantian.LiantianReceiver r1 = new com.baidu.liantian.LiantianReceiver
            r1.<init>()
            com.baidu.liantian.LiantianReceiver r1 = r1.a()
            com.baidu.liantian.b.e.f5912f = r1
        L1f:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.baidu.liantian.LiantianReceiver r1 = com.baidu.liantian.b.e.f5912f
            r2.registerReceiver(r1, r3)
            com.baidu.liantian.b.e.a = r0
            r2 = 0
            return r2
        L30:
            return r0
    }

    public static boolean a(android.content.Context r8, java.lang.String r9) {
            r0 = 1
            com.baidu.liantian.e r1 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r1.e()     // Catch: java.lang.Throwable -> L8d
            long r3 = r1.f()     // Catch: java.lang.Throwable -> L8d
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L8d
            r5 = 0
            if (r1 == 0) goto L1c
            r6 = 0
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L1c
            return r5
        L1c:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8d
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L8d
            r3 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r9, r3)     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L8d
            r2 = 0
        L30:
            if (r2 == 0) goto L8c
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Throwable -> L8d
            java.security.PublicKey r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8c
            byte[] r2 = r2.getEncoded()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = ""
            if (r2 == 0) goto L5e
            a(r8, r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = android.util.Base64.encodeToString(r2, r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "\n"
            java.lang.String r8 = r8.replace(r2, r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "\r"
            java.lang.String r8 = r8.replace(r2, r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = com.baidu.liantian.b.o.a(r8)     // Catch: java.lang.Throwable -> L8d
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L8d
        L5e:
            r8 = 0
        L5f:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L8d
            if (r8 >= r2) goto L8b
            org.json.JSONObject r2 = r1.optJSONObject(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "p"
            java.lang.String r4 = r2.optString(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "s"
            java.lang.String r2 = r2.optString(r6)     // Catch: java.lang.Throwable -> L8d
            boolean r4 = r9.equals(r4)     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L88
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L8d
            if (r4 != 0) goto L88
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L88
            return r0
        L88:
            int r8 = r8 + 1
            goto L5f
        L8b:
            return r5
        L8c:
            return r0
        L8d:
            com.baidu.liantian.b.c()
            return r0
    }

    private static boolean a(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) {
            r0 = 1
            r1 = 0
            r2 = 0
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r9.getPackageName()     // Catch: java.lang.Throwable -> L30
            java.lang.Class<com.baidu.liantian.LiantianService> r6 = com.baidu.liantian.LiantianService.class
            java.lang.String r6 = r6.getCanonicalName()     // Catch: java.lang.Throwable -> L30
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L30
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L30
            android.content.pm.ResolveInfo r3 = r4.resolveService(r3, r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L31
            android.content.pm.ServiceInfo r4 = r3.serviceInfo     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r4.processName     // Catch: java.lang.Throwable -> L31
            boolean r4 = r10.equals(r4)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L31
            r4 = 1
            goto L32
        L30:
            r3 = r1
        L31:
            r4 = 0
        L32:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r9.getPackageName()     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<com.baidu.liantian.LiantianReceiver> r8 = com.baidu.liantian.LiantianReceiver.class
            java.lang.String r8 = r8.getCanonicalName()     // Catch: java.lang.Throwable -> L5d
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L5d
            r5.setComponent(r6)     // Catch: java.lang.Throwable -> L5d
            android.content.pm.PackageManager r5 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L5d
            android.content.pm.ActivityInfo r1 = r5.getReceiverInfo(r6, r2)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5e
            java.lang.String r5 = r1.processName     // Catch: java.lang.Throwable -> L5d
            boolean r5 = r10.equals(r5)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5e
            r5 = 1
            goto L5f
        L5d:
        L5e:
            r5 = 0
        L5f:
            if (r3 != 0) goto L6f
            java.lang.String r1 = "service"
            java.lang.String r1 = b(r9, r10, r1)     // Catch: java.lang.Throwable -> L7f
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L82
            r4 = 1
            goto L82
        L6f:
            if (r1 != 0) goto L82
            java.lang.String r1 = "receiver"
            java.lang.String r1 = b(r9, r10, r1)     // Catch: java.lang.Throwable -> L7f
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L82
            r5 = 1
            goto L82
        L7f:
            com.baidu.liantian.b.c()
        L82:
            java.lang.String r1 = com.baidu.liantian.b.e.f5915i
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L94
            int r1 = android.os.Process.myPid()
            java.lang.String r1 = a(r1)
            com.baidu.liantian.b.e.f5915i = r1
        L94:
            if (r12 == 0) goto Ld7
            java.lang.String r12 = com.baidu.liantian.b.e.f5915i
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto Ld7
            if (r5 == 0) goto La4
            if (r4 == 0) goto La4
            if (r11 == 0) goto Ld7
        La4:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r12 = "0"
            if (r5 != 0) goto Lb8
            if (r4 != 0) goto Lb8
            r0 = 2
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r10.put(r12, r0)
            goto Lcb
        Lb8:
            if (r4 != 0) goto Lc2
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r10.put(r12, r0)
            goto Lcb
        Lc2:
            if (r5 != 0) goto Lcb
            java.lang.String r0 = java.lang.Integer.toString(r2)
            r10.put(r12, r0)
        Lcb:
            if (r11 == 0) goto Ld2
            java.lang.String r11 = "1"
            r10.put(r11, r12)
        Ld2:
            java.lang.String r11 = "1003140"
            a(r9, r11, r10)
        Ld7:
            r9 = r5 & r4
            return r9
    }

    public static synchronized boolean a(android.content.Context r5, boolean r6) {
            java.lang.Class<com.baidu.liantian.b.e> r0 = com.baidu.liantian.b.e.class
            monitor-enter(r0)
            r1 = 0
            int r2 = com.baidu.liantian.b.e.f5916j     // Catch: java.lang.Throwable -> L2f
            r3 = -1
            r4 = 1
            if (r2 == r3) goto Lf
            monitor-exit(r0)
            if (r2 != r4) goto Le
            return r4
        Le:
            return r1
        Lf:
            java.lang.String r2 = b(r5)     // Catch: java.lang.Throwable -> L2f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L22
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2f
            boolean r5 = a(r5, r2, r4, r6)     // Catch: java.lang.Throwable -> L2f
            goto L26
        L22:
            boolean r5 = a(r5, r2, r1, r6)     // Catch: java.lang.Throwable -> L2f
        L26:
            if (r5 == 0) goto L2b
            com.baidu.liantian.b.e.f5916j = r4     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L2b:
            com.baidu.liantian.b.e.f5916j = r1     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r0)
            return r5
        L2f:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
            return r1
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
    }

    public static boolean a(java.io.File r4) {
            if (r4 == 0) goto L20
            boolean r0 = r4.exists()
            if (r0 == 0) goto L20
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L20
            boolean r0 = r4.canRead()
            if (r0 == 0) goto L20
            long r0 = r4.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L20
            r4 = 1
            return r4
        L20:
            r4 = 0
            return r4
    }

    private static boolean a(java.lang.reflect.Method r4, java.lang.String r5, java.lang.Class<?>[] r6) {
            java.lang.String r0 = r4.getName()
            boolean r5 = r5.equals(r0)
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            com.baidu.liantian.b.a()
            java.lang.Class[] r4 = r4.getParameterTypes()
            r5 = 1
            if (r4 == 0) goto L19
            int r1 = r4.length
            if (r1 != 0) goto L1f
        L19:
            if (r6 == 0) goto L58
            int r1 = r6.length
            if (r1 != 0) goto L1f
            goto L58
        L1f:
            if (r6 == 0) goto L24
            int r1 = r6.length
            if (r1 != 0) goto L2d
        L24:
            if (r4 == 0) goto L2d
            int r1 = r4.length
            if (r1 <= 0) goto L2d
            com.baidu.liantian.b.a()
            return r0
        L2d:
            if (r4 == 0) goto L32
            int r1 = r4.length
            if (r1 != 0) goto L3b
        L32:
            if (r6 == 0) goto L3b
            int r1 = r6.length
            if (r1 <= 0) goto L3b
            com.baidu.liantian.b.a()
            return r0
        L3b:
            int r1 = r4.length
            int r2 = r6.length
            if (r1 == r2) goto L43
            com.baidu.liantian.b.a()
            return r0
        L43:
            r1 = 0
        L44:
            int r2 = r4.length
            if (r1 >= r2) goto L54
            r2 = r4[r1]
            r3 = r6[r1]
            if (r2 == r3) goto L51
            com.baidu.liantian.b.a()
            return r0
        L51:
            int r1 = r1 + 1
            goto L44
        L54:
            com.baidu.liantian.b.a()
            return r5
        L58:
            com.baidu.liantian.b.a()
            return r5
    }

    public static java.lang.String b() {
            java.lang.String r0 = com.baidu.liantian.b.n.a     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> L1b
            com.baidu.liantian.ac.F r1 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "30212102dicudiab"
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L1b
            byte[] r0 = r1.ad(r0, r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = com.baidu.liantian.b.e.f5914h     // Catch: java.lang.Throwable -> L56
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.baidu.liantian.b.e.f5914h     // Catch: java.lang.Throwable -> L56
            return r4
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r4.getPackageName()     // Catch: java.lang.Throwable -> L56
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = ".liantian.ac.provider"
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L35
            r3 = 0
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L39
            boolean r2 = r1.multiprocess     // Catch: java.lang.Throwable -> L36
            r3 = 1
            if (r2 == r3) goto L39
            java.lang.String r2 = r1.processName     // Catch: java.lang.Throwable -> L36
            com.baidu.liantian.b.e.f5914h = r2     // Catch: java.lang.Throwable -> L36
            goto L39
        L35:
            r1 = 0
        L36:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L56
        L39:
            if (r1 != 0) goto L59
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            java.lang.Class<com.baidu.liantian.LiantianProvider> r1 = com.baidu.liantian.LiantianProvider.class
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = b(r4, r0, r1)     // Catch: java.lang.Throwable -> L52
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L59
            com.baidu.liantian.b.e.f5914h = r4     // Catch: java.lang.Throwable -> L52
            goto L59
        L52:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            com.baidu.liantian.b.c()
        L59:
            java.lang.String r4 = com.baidu.liantian.b.e.f5914h
            return r4
    }

    public static java.lang.String b(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = ""
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "bd_setting_i"
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r2)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            java.lang.String r1 = com.baidu.liantian.b.g.e(r3)     // Catch: java.lang.Throwable -> L21
        L18:
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = com.baidu.liantian.jni.Asc.fai(r1, r4, r3)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            com.baidu.liantian.b.c()
            return r0
    }

    private static java.lang.String b(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
            java.lang.String r0 = "provider"
            java.lang.Class<android.content.res.AssetManager> r1 = android.content.res.AssetManager.class
            r2 = 0
            android.content.pm.PackageManager r3 = r13.getPackageManager()     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r4 = r13.getPackageName()     // Catch: java.lang.Throwable -> L1fd
            r5 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch: java.lang.Throwable -> L1fd
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Throwable -> L1fd
            java.lang.Object r4 = r1.newInstance()     // Catch: java.lang.Throwable -> L1fd
            android.content.res.AssetManager r4 = (android.content.res.AssetManager) r4     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r6 = "addAssetPath"
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L1fd
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r5] = r9     // Catch: java.lang.Throwable -> L1fd
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r6, r8)     // Catch: java.lang.Throwable -> L1fd
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1fd
            r6[r5] = r3     // Catch: java.lang.Throwable -> L1fd
            java.lang.Object r1 = r1.invoke(r4, r6)     // Catch: java.lang.Throwable -> L1fd
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1fd
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r3 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r1 = r4.openXmlResourceParser(r1, r3)     // Catch: java.lang.Throwable -> L1fd
            if (r1 == 0) goto L200
        L3f:
            int r3 = r1.next()     // Catch: java.lang.Throwable -> L1fd
            r4 = 2
            if (r3 == r4) goto L48
            if (r3 != r7) goto L3f
        L48:
            if (r3 == r4) goto L4b
            return r2
        L4b:
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r6 = "manifest"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L1fd
            if (r3 != 0) goto L58
            return r2
        L58:
            java.lang.String r3 = "package"
            java.lang.String r3 = r1.getAttributeValue(r2, r3)     // Catch: java.lang.Throwable -> L1fd
            if (r3 == 0) goto L1fc
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L1fd
            if (r6 != 0) goto L68
            goto L1fc
        L68:
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L1fd
            r8 = 0
            r9 = 0
            r10 = 1
        L6f:
            if (r8 >= r6) goto Lb2
            char r11 = r3.charAt(r8)     // Catch: java.lang.Throwable -> L1fd
            r12 = 97
            if (r11 < r12) goto L7d
            r12 = 122(0x7a, float:1.71E-43)
            if (r11 <= r12) goto L85
        L7d:
            r12 = 65
            if (r11 < r12) goto L87
            r12 = 90
            if (r11 > r12) goto L87
        L85:
            r10 = 0
            goto L9b
        L87:
            if (r10 != 0) goto L95
            r12 = 48
            if (r11 < r12) goto L91
            r12 = 57
            if (r11 <= r12) goto L9b
        L91:
            r12 = 95
            if (r11 == r12) goto L9b
        L95:
            r9 = 46
            if (r11 != r9) goto L9e
            r9 = 1
            r10 = 1
        L9b:
            int r8 = r8 + 1
            goto L6f
        L9e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r6 = "bad character '"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1fd
            r5.append(r11)     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r6 = "'"
            r5.append(r6)     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1fd
            goto Lb8
        Lb2:
            if (r9 == 0) goto Lb6
            r5 = r2
            goto Lb8
        Lb6:
            java.lang.String r5 = "must have at least one '.' separator"
        Lb8:
            if (r5 == 0) goto Lc3
            java.lang.String r5 = "android"
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L1fd
            if (r3 != 0) goto Lc3
            return r2
        Lc3:
            boolean r3 = r15.equals(r0)     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r5 = "receiver"
            java.lang.String r6 = "service"
            if (r3 == 0) goto Ld4
            java.lang.Class<com.baidu.liantian.LiantianProvider> r15 = com.baidu.liantian.LiantianProvider.class
            java.lang.String r15 = r15.getCanonicalName()     // Catch: java.lang.Throwable -> L1fd
            goto Lef
        Ld4:
            boolean r3 = r15.equals(r6)     // Catch: java.lang.Throwable -> L1fd
            if (r3 == 0) goto Le1
            java.lang.Class<com.baidu.liantian.LiantianService> r15 = com.baidu.liantian.LiantianService.class
            java.lang.String r15 = r15.getCanonicalName()     // Catch: java.lang.Throwable -> L1fd
            goto Lef
        Le1:
            boolean r15 = r15.equals(r5)     // Catch: java.lang.Throwable -> L1fd
            if (r15 == 0) goto Lee
            java.lang.Class<com.baidu.liantian.LiantianReceiver> r15 = com.baidu.liantian.LiantianReceiver.class
            java.lang.String r15 = r15.getCanonicalName()     // Catch: java.lang.Throwable -> L1fd
            goto Lef
        Lee:
            r15 = r2
        Lef:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1fd
        Lf2:
            int r3 = r1.next()     // Catch: java.lang.Throwable -> L1fd
            if (r3 == r7) goto L200
            if (r3 == r4) goto Lfb
            goto Lf2
        Lfb:
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L1fd
            boolean r8 = r0.equals(r3)     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r9 = ":"
            java.lang.String r10 = "process"
            java.lang.String r11 = "name"
            java.lang.String r12 = "http://schemas.android.com/apk/res/android"
            if (r8 == 0) goto L172
            java.lang.String r3 = r1.getAttributeValue(r12, r11)     // Catch: java.lang.Throwable -> L16e
            boolean r3 = r3.equals(r15)     // Catch: java.lang.Throwable -> L16e
            if (r3 == 0) goto Lf2
            java.lang.String r3 = "multiprocess"
            java.lang.String r3 = r1.getAttributeValue(r12, r3)     // Catch: java.lang.Throwable -> L16e
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L16e
            if (r8 != 0) goto L130
            java.lang.String r8 = "true"
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L16e
            boolean r3 = r8.equals(r3)     // Catch: java.lang.Throwable -> L16e
            if (r3 == 0) goto L130
            return r2
        L130:
            java.lang.String r3 = "authorities"
            java.lang.String r3 = r1.getAttributeValue(r12, r3)     // Catch: java.lang.Throwable -> L16e
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L16e
            if (r8 != 0) goto L16d
            boolean r3 = r14.equals(r3)     // Catch: java.lang.Throwable -> L16e
            if (r3 != 0) goto L143
            return r2
        L143:
            java.lang.String r3 = r1.getAttributeValue(r12, r10)     // Catch: java.lang.Throwable -> L16e
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L16e
            if (r8 != 0) goto L168
            boolean r8 = r3.startsWith(r9)     // Catch: java.lang.Throwable -> L16e
            if (r8 == 0) goto L167
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16e
            r8.<init>()     // Catch: java.lang.Throwable -> L16e
            java.lang.String r9 = r13.getPackageName()     // Catch: java.lang.Throwable -> L16e
            r8.append(r9)     // Catch: java.lang.Throwable -> L16e
            r8.append(r3)     // Catch: java.lang.Throwable -> L16e
            java.lang.String r13 = r8.toString()     // Catch: java.lang.Throwable -> L16e
            return r13
        L167:
            return r3
        L168:
            java.lang.String r13 = r13.getPackageName()     // Catch: java.lang.Throwable -> L16e
            return r13
        L16d:
            return r2
        L16e:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L1fd
            goto Lf2
        L172:
            boolean r8 = r6.equals(r3)     // Catch: java.lang.Throwable -> L1fd
            if (r8 == 0) goto L1b7
            java.lang.String r3 = r1.getAttributeValue(r12, r11)     // Catch: java.lang.Throwable -> L1b2
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1b2
            if (r8 != 0) goto Lf2
            boolean r3 = r3.equals(r15)     // Catch: java.lang.Throwable -> L1b2
            if (r3 == 0) goto Lf2
            java.lang.String r3 = r1.getAttributeValue(r12, r10)     // Catch: java.lang.Throwable -> L1b2
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1b2
            if (r8 != 0) goto L1ad
            boolean r8 = r3.startsWith(r9)     // Catch: java.lang.Throwable -> L1b2
            if (r8 == 0) goto L1ac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b2
            r8.<init>()     // Catch: java.lang.Throwable -> L1b2
            java.lang.String r9 = r13.getPackageName()     // Catch: java.lang.Throwable -> L1b2
            r8.append(r9)     // Catch: java.lang.Throwable -> L1b2
            r8.append(r3)     // Catch: java.lang.Throwable -> L1b2
            java.lang.String r13 = r8.toString()     // Catch: java.lang.Throwable -> L1b2
            return r13
        L1ac:
            return r3
        L1ad:
            java.lang.String r13 = r13.getPackageName()     // Catch: java.lang.Throwable -> L1b2
            return r13
        L1b2:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L1fd
            goto Lf2
        L1b7:
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L1fd
            if (r3 == 0) goto Lf2
            java.lang.String r3 = r1.getAttributeValue(r12, r11)     // Catch: java.lang.Throwable -> L1f7
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f7
            if (r8 != 0) goto Lf2
            boolean r3 = r3.equals(r15)     // Catch: java.lang.Throwable -> L1f7
            if (r3 == 0) goto Lf2
            java.lang.String r3 = r1.getAttributeValue(r12, r10)     // Catch: java.lang.Throwable -> L1f7
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f7
            if (r8 != 0) goto L1f2
            boolean r8 = r3.startsWith(r9)     // Catch: java.lang.Throwable -> L1f7
            if (r8 == 0) goto L1f1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f7
            r8.<init>()     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r9 = r13.getPackageName()     // Catch: java.lang.Throwable -> L1f7
            r8.append(r9)     // Catch: java.lang.Throwable -> L1f7
            r8.append(r3)     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r13 = r8.toString()     // Catch: java.lang.Throwable -> L1f7
            return r13
        L1f1:
            return r3
        L1f2:
            java.lang.String r13 = r13.getPackageName()     // Catch: java.lang.Throwable -> L1f7
            return r13
        L1f7:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L1fd
            goto Lf2
        L1fc:
            return r2
        L1fd:
            com.baidu.liantian.b.c()
        L200:
            return r2
    }

    public static void b(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            a(r0, r1)
        L1a:
            return
    }

    public static boolean b(java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = com.baidu.liantian.b.e.f5915i     // Catch: java.lang.Throwable -> L1e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L13
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L1e
            com.baidu.liantian.b.e.f5915i = r1     // Catch: java.lang.Throwable -> L1e
        L13:
            java.lang.String r1 = com.baidu.liantian.b.e.f5915i     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L1d
            r2 = 1
            return r2
        L1d:
            return r0
        L1e:
            com.baidu.liantian.b.c()
            return r0
    }

    public static java.lang.String c() {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 1
            int r1 = r0.get(r1)
            r2 = 2
            int r2 = r0.get(r2)
            r3 = 5
            int r0 = r0.get(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public static void c(android.content.Context r6) {
            java.lang.String r0 = "0"
            com.baidu.liantian.rp.Report r1 = com.baidu.liantian.rp.Report.getInstance(r6)     // Catch: java.lang.Throwable -> L74
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Throwable -> L74
            com.baidu.liantian.a.a r6 = com.baidu.liantian.a.a.a(r6)     // Catch: java.lang.Throwable -> L74
            java.util.Map r3 = r6.b()     // Catch: java.lang.Throwable -> L74
            java.util.Set r4 = r3.keySet()     // Catch: java.lang.Throwable -> L74
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "1"
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L74
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L74
            r2.toString()     // Catch: java.lang.Throwable -> L74
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L74
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L74
            r4.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "1003003"
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L74
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L74
            java.util.Map r6 = r6.c()     // Catch: java.lang.Throwable -> L74
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L74
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L74
        L4c:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L74
            r0.put(r2)     // Catch: java.lang.Throwable -> L74
            goto L4c
        L5c:
            java.lang.String r6 = "com.baidu.liantian"
            r0.put(r6)     // Catch: java.lang.Throwable -> L74
            r0.toString()     // Catch: java.lang.Throwable -> L74
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "2"
            r3.put(r6, r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L74
            r1.w(r6)     // Catch: java.lang.Throwable -> L74
            return
        L74:
            r6 = move-exception
            r6.getMessage()
            com.baidu.liantian.b.b()
            return
    }

    public static void c(android.content.Context r10, java.lang.String r11) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L76
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L76
            com.baidu.liantian.e r1 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L76
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L76
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L76
            android.content.SharedPreferences r1 = r1.f5994e     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "re_net_ty"
            r3 = 2
            r1.getInt(r2, r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "Common_section"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "0"
            long r1 = r0.optLong(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "10"
            java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "5"
            int r4 = r0.optInt(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "6"
            int r5 = r0.optInt(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "7"
            int r6 = r0.optInt(r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "11"
            int r7 = r0.optInt(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = "12"
            java.lang.String r9 = ""
            java.lang.String r0 = r0.optString(r8, r9)     // Catch: java.lang.Throwable -> L76
            r8 = 1
            if (r5 != 0) goto L4b
            r5 = 1
        L4b:
            com.baidu.liantian.rp.c.a r9 = new com.baidu.liantian.rp.c.a     // Catch: java.lang.Throwable -> L76
            r9.<init>()     // Catch: java.lang.Throwable -> L76
            r9.f6008d = r11     // Catch: java.lang.Throwable -> L76
            r9.f6006b = r3     // Catch: java.lang.Throwable -> L76
            r9.f6011g = r4     // Catch: java.lang.Throwable -> L76
            r11 = 3
            r9.f6007c = r11     // Catch: java.lang.Throwable -> L76
            r9.f6009e = r1     // Catch: java.lang.Throwable -> L76
            r9.f6010f = r5     // Catch: java.lang.Throwable -> L76
            r9.f6012h = r6     // Catch: java.lang.Throwable -> L76
            r9.f6013i = r7     // Catch: java.lang.Throwable -> L76
            r9.f6014j = r0     // Catch: java.lang.Throwable -> L76
            com.baidu.liantian.b.f r10 = com.baidu.liantian.b.f.a(r10)     // Catch: java.lang.Throwable -> L76
            android.os.Message r11 = new android.os.Message     // Catch: java.lang.Throwable -> L76
            r11.<init>()     // Catch: java.lang.Throwable -> L76
            r11.what = r8     // Catch: java.lang.Throwable -> L76
            r11.obj = r9     // Catch: java.lang.Throwable -> L76
            com.baidu.liantian.rp.f.a r10 = r10.a     // Catch: java.lang.Throwable -> L76
            r10.a(r11)     // Catch: java.lang.Throwable -> L76
            return
        L76:
            com.baidu.liantian.b.c()
            return
    }

    public static boolean c(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = a(r0)
            return r1
    }

    public static boolean c(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "\\."
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 != 0) goto L43
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L10
            goto L43
        L10:
            java.lang.String[] r5 = r5.split(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L43
            r0 = 0
        L19:
            int r1 = r5.length     // Catch: java.lang.Throwable -> L43
            r3 = 1
            if (r0 >= r1) goto L3e
            int r1 = r6.length     // Catch: java.lang.Throwable -> L43
            if (r0 >= r1) goto L3e
            r1 = r5[r0]     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L43
            r4 = r6[r0]     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L43
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L43
            int r1 = r1 - r4
            if (r1 == 0) goto L3b
            if (r1 <= 0) goto L3a
            return r3
        L3a:
            return r2
        L3b:
            int r0 = r0 + 1
            goto L19
        L3e:
            int r5 = r5.length     // Catch: java.lang.Throwable -> L43
            int r6 = r6.length     // Catch: java.lang.Throwable -> L43
            if (r5 <= r6) goto L43
            return r3
        L43:
            return r2
    }

    public static void d(android.content.Context r6) {
            com.baidu.liantian.b.a()
            java.lang.String r3 = "3.1.6.7"
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.lang.String r2 = "com.baidu.liantian"
            com.baidu.liantian.rp.Report r0 = com.baidu.liantian.rp.Report.getInstance(r6)
            c(r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "liantian"
            java.lang.String r4 = "1003003"
            java.lang.String r5 = "1003002"
            r0.i(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            r6 = r0
            r6.getMessage()
            com.baidu.liantian.b.b()
            return
    }

    public static void d(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = ""
            com.baidu.liantian.e r1 = new com.baidu.liantian.e
            r1.<init>(r6)
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc4
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "0"
            org.json.JSONObject r7 = r6.optJSONObject(r7)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L57
            r2 = r0
        L15:
            java.util.Iterator r3 = r7.keys()     // Catch: java.lang.Throwable -> L54
            boolean r3 = r3.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L31
            java.util.Iterator r2 = r7.keys()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L54
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L15
        L31:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L57
            java.lang.String r7 = r7.optString(r2)     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r3 = r1.f5995f     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "al_da"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L54
            r4.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L54
            r3.putString(r2, r7)     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r7 = r1.f5995f     // Catch: java.lang.Throwable -> L54
            r7.commit()     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            com.baidu.liantian.b.c()
        L57:
            java.lang.String r7 = "1"
            org.json.JSONObject r7 = r6.optJSONObject(r7)     // Catch: java.lang.Throwable -> L9e
            if (r7 == 0) goto La1
        L5f:
            java.util.Iterator r2 = r7.keys()     // Catch: java.lang.Throwable -> L9e
            boolean r2 = r2.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L7b
            java.util.Iterator r0 = r7.keys()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != 0) goto L5f
        L7b:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != 0) goto La1
            java.lang.String r7 = r7.optString(r0)     // Catch: java.lang.Throwable -> L9e
            android.content.SharedPreferences$Editor r2 = r1.f5995f     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "in_da"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9e
            r3.append(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L9e
            r2.putString(r0, r7)     // Catch: java.lang.Throwable -> L9e
            android.content.SharedPreferences$Editor r7 = r1.f5995f     // Catch: java.lang.Throwable -> L9e
            r7.commit()     // Catch: java.lang.Throwable -> L9e
            goto La1
        L9e:
            com.baidu.liantian.b.c()
        La1:
            java.lang.String r7 = "2"
            org.json.JSONArray r6 = r6.optJSONArray(r7)     // Catch: java.lang.Throwable -> Lc0
            if (r6 == 0) goto Lbf
            r6.toString()     // Catch: java.lang.Throwable -> Lc0
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc0
            android.content.SharedPreferences$Editor r7 = r1.f5995f     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = "li_pk_s"
            r7.putString(r0, r6)     // Catch: java.lang.Throwable -> Lc0
            android.content.SharedPreferences$Editor r6 = r1.f5995f     // Catch: java.lang.Throwable -> Lc0
            r6.commit()     // Catch: java.lang.Throwable -> Lc0
        Lbf:
            return
        Lc0:
            com.baidu.liantian.b.c()
            return
        Lc4:
            com.baidu.liantian.b.c()
            return
    }

    public static void d(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L7
            goto L12
        L7:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L46
            boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L13
        L12:
            return
        L13:
            java.io.File[] r5 = r0.listFiles()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L3c
            int r1 = r5.length     // Catch: java.lang.Throwable -> L46
            if (r1 <= 0) goto L3c
            int r1 = r5.length     // Catch: java.lang.Throwable -> L46
            r2 = 0
        L1e:
            if (r2 >= r1) goto L3c
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L46
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L30
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L46
            d(r3)     // Catch: java.lang.Throwable -> L46
            goto L39
        L30:
            r3.delete()     // Catch: java.lang.Throwable -> L46
            r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L46
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L46
        L39:
            int r2 = r2 + 1
            goto L1e
        L3c:
            r0.delete()     // Catch: java.lang.Throwable -> L46
            r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L46
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L46
            return
        L46:
            com.baidu.liantian.b.c()
            return
    }

    private static boolean d(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L45
        Le:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "chmod "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r2.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = " "
            r2.append(r4)     // Catch: java.lang.Throwable -> L42
            r2.append(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "\n"
            r2.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L42
            java.lang.Process r4 = r0.exec(r4)     // Catch: java.lang.Throwable -> L42
            r4.waitFor()     // Catch: java.lang.Throwable -> L42
            r4 = 1
            return r4
        L42:
            com.baidu.liantian.b.c()
        L45:
            return r1
    }

    public static java.lang.String e(java.lang.String r4) {
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L21
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            char r2 = r4.charAt(r1)     // Catch: java.lang.Throwable -> L21
            r3 = 32
            if (r2 <= r3) goto L17
            char r2 = r4.charAt(r1)     // Catch: java.lang.Throwable -> L21
            r3 = 160(0xa0, float:2.24E-43)
            if (r2 != r3) goto L1a
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            if (r1 <= 0) goto L20
            java.lang.String r4 = r4.substring(r1)     // Catch: java.lang.Throwable -> L21
        L20:
            return r4
        L21:
            com.baidu.liantian.b.c()
            java.lang.String r4 = ""
            return r4
    }

    public static boolean e(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            r0 = 0
            if (r2 != 0) goto L10
            return r0
        L10:
            int r2 = r2.getType()
            r1 = 1
            if (r1 != r2) goto L18
            return r1
        L18:
            return r0
    }

    public static void f(java.lang.String r5) {
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto La
            goto L5f
        La:
            com.baidu.liantian.e r3 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L60
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r3.c()     // Catch: java.lang.Throwable -> L60
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L22
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L60
            goto L4b
        L22:
            java.util.Map r2 = g(r2)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L4a
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L60
            if (r4 <= 0) goto L4a
            java.lang.Object r4 = r2.get(r5)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L47
            java.lang.Object r1 = r2.get(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L60
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L60
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L60
            goto L4a
        L47:
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L60
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L5f
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L60
            if (r5 <= 0) goto L5f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L60
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L60
            r3.a(r5)     // Catch: java.lang.Throwable -> L60
        L5f:
            return
        L60:
            com.baidu.liantian.b.c()
            return
    }

    public static boolean f(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L15
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L15
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L10
            return r0
        L10:
            boolean r2 = r2.isConnected()     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            com.baidu.liantian.b.c()
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.Integer> g(java.lang.String r4) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r4 = r0.keys()     // Catch: java.lang.Throwable -> L25
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
        Le:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L25
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L25
            goto Le
        L24:
            return r1
        L25:
            com.baidu.liantian.b.c()
            r4 = 0
            return r4
    }

    public static java.lang.String[] g(android.content.Context r6) {
            java.lang.String r0 = com.baidu.liantian.b.e.f5908b
            java.lang.String r1 = com.baidu.liantian.b.e.f5909c
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L18
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L18
            com.baidu.liantian.b.a()
            java.lang.String[] r6 = new java.lang.String[]{r0, r1}
            return r6
        L18:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 2
            java.lang.String r4 = "-"
            if (r2 != 0) goto L27
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L43
        L27:
            com.baidu.liantian.e r2 = new com.baidu.liantian.e
            r2.<init>(r6)
            java.lang.String r2 = r2.b()
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L43
            java.lang.String[] r2 = r2.split(r4)
            if (r2 == 0) goto L43
            int r5 = r2.length
            if (r5 != r3) goto L43
            com.baidu.liantian.b.a()
            return r2
        L43:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4f
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L71
        L4f:
            com.baidu.liantian.e r2 = new com.baidu.liantian.e
            r2.<init>(r6)
            android.content.SharedPreferences r6 = r2.a
            java.lang.String r2 = "svi"
            java.lang.String r5 = ""
            java.lang.String r6 = r6.getString(r2, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L71
            java.lang.String[] r6 = r6.split(r4)
            if (r6 == 0) goto L71
            int r2 = r6.length
            if (r2 != r3) goto L71
            com.baidu.liantian.b.a()
            return r6
        L71:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L7d
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L84
        L7d:
            com.baidu.liantian.b.a()
            java.lang.String r0 = com.baidu.liantian.b.e.f5910d
            java.lang.String r1 = com.baidu.liantian.b.e.f5911e
        L84:
            java.lang.String[] r6 = new java.lang.String[]{r0, r1}
            return r6
    }

    private static java.lang.String h(java.lang.String r2) {
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = a(r1)     // Catch: java.lang.Throwable -> Lf
            r1.close()     // Catch: java.lang.Throwable -> Ld
        Ld:
            return r2
        Le:
            r1 = r0
        Lf:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            r1.close()     // Catch: java.lang.Throwable -> L17
        L17:
            return r0
        L18:
            r2 = move-exception
            if (r1 == 0) goto L1e
            r1.close()     // Catch: java.lang.Throwable -> L1e
        L1e:
            throw r2
    }

    public static java.lang.String[] h(android.content.Context r2) {
            java.lang.String r0 = com.baidu.liantian.b.e.f5908b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = com.baidu.liantian.b.e.f5909c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L19
            java.lang.String r2 = com.baidu.liantian.b.e.f5908b
            java.lang.String r0 = com.baidu.liantian.b.e.f5909c
            java.lang.String[] r2 = new java.lang.String[]{r2, r0}
            return r2
        L19:
            com.baidu.liantian.e r0 = new com.baidu.liantian.e
            r0.<init>(r2)
            java.lang.String r2 = r0.b()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "-"
            java.lang.String[] r2 = r2.split(r0)
            r0 = 2
            if (r2 == 0) goto L40
            int r1 = r2.length
            if (r1 == r0) goto L35
            goto L40
        L35:
            r0 = 0
            r0 = r2[r0]
            com.baidu.liantian.b.e.f5908b = r0
            r0 = 1
            r0 = r2[r0]
            com.baidu.liantian.b.e.f5909c = r0
            return r2
        L40:
            java.lang.String[] r2 = new java.lang.String[r0]
            return r2
        L43:
            r2 = 0
            return r2
    }

    public static void i(android.content.Context r7) {
            com.baidu.liantian.e r0 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L4e
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L4e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L4d
            java.util.Map r1 = g(r1)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L4d
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L4e
            if (r2 <= 0) goto L4d
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
        L24:
            r4 = 15
            java.lang.String r5 = ""
            if (r3 >= r4) goto L45
            java.lang.String r4 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L3b
            goto L3f
        L3b:
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L4e
        L3f:
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L4e
            int r3 = r3 + 1
            goto L24
        L45:
            java.lang.String r1 = "1003137"
            a(r7, r1, r2)     // Catch: java.lang.Throwable -> L4e
            r0.a(r5)     // Catch: java.lang.Throwable -> L4e
        L4d:
            return
        L4e:
            com.baidu.liantian.b.c()
            return
    }

    public static void j(android.content.Context r11) {
            com.baidu.liantian.e r0 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> Le4
            r0.<init>(r11)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = r0.e()     // Catch: java.lang.Throwable -> Le4
            long r2 = r0.f()     // Catch: java.lang.Throwable -> Le4
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Le4
            if (r4 == 0) goto L1b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto Le3
        L1b:
            java.lang.String r2 = r11.getPackageName()     // Catch: java.lang.Throwable -> Le4
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Le4
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Le4
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: java.lang.Throwable -> Le4
            r4 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r4)     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> Le4
            r1 = 0
        L33:
            r4 = 0
            java.lang.String r5 = ""
            if (r1 == 0) goto L65
            android.content.pm.ApplicationInfo r6 = r1.applicationInfo     // Catch: java.lang.Throwable -> Le4
            java.lang.String r6 = r6.sourceDir     // Catch: java.lang.Throwable -> Le4
            java.security.PublicKey r1 = a(r1, r6)     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto L63
            byte[] r1 = r1.getEncoded()     // Catch: java.lang.Throwable -> Le4
            if (r1 == 0) goto L63
            a(r11, r1)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r7 = "\n"
            java.lang.String r1 = r1.replace(r7, r5)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r7 = "\r"
            java.lang.String r1 = r1.replace(r7, r5)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = com.baidu.liantian.b.o.a(r1)     // Catch: java.lang.Throwable -> Le4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le4
            goto L67
        L63:
            r1 = r5
            goto L67
        L65:
            r1 = r5
            r6 = r1
        L67:
            r7 = 0
        L68:
            int r8 = r3.length()     // Catch: java.lang.Throwable -> Le4
            if (r4 >= r8) goto L94
            org.json.JSONObject r8 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r9 = "p"
            java.lang.String r9 = r8.optString(r9)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r10 = "s"
            java.lang.String r8 = r8.optString(r10)     // Catch: java.lang.Throwable -> Le4
            boolean r9 = r2.equals(r9)     // Catch: java.lang.Throwable -> Le4
            if (r9 == 0) goto L91
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Le4
            if (r9 != 0) goto L91
            boolean r8 = r1.equalsIgnoreCase(r8)     // Catch: java.lang.Throwable -> Le4
            if (r8 == 0) goto L91
            r7 = 1
        L91:
            int r4 = r4 + 1
            goto L68
        L94:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le4
            android.content.SharedPreferences$Editor r3 = r0.f5992c     // Catch: java.lang.Throwable -> Le4
            java.lang.String r4 = "hac"
            r3.putBoolean(r4, r7)     // Catch: java.lang.Throwable -> Le4
            android.content.SharedPreferences$Editor r0 = r0.f5992c     // Catch: java.lang.Throwable -> Le4
            r0.commit()     // Catch: java.lang.Throwable -> Le4
            if (r7 != 0) goto Le3
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le4
            r0.<init>()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = "0"
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = "1"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> Le4
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r2 = "2"
            if (r1 != 0) goto Ld3
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Le4
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Le4
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> Le4
            if (r3 == 0) goto Lcf
            java.lang.String r1 = com.baidu.liantian.b.o.a(r1)     // Catch: java.lang.Throwable -> Le4
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> Le4
            goto Ld6
        Lcf:
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> Le4
            goto Ld6
        Ld3:
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> Le4
        Ld6:
            android.content.Context r11 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> Le4
            android.content.Context r11 = com.stub.StubApp.getOrigApplicationContext(r11)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r1 = "1003120"
            a(r11, r1, r0)     // Catch: java.lang.Throwable -> Le4
        Le3:
            return
        Le4:
            com.baidu.liantian.b.c()
            return
    }

    public static void k(android.content.Context r8) {
            com.baidu.liantian.e r0 = new com.baidu.liantian.e
            r0.<init>(r8)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r3 = r0.a
            java.lang.String r4 = "se_ae_fd"
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1e
            long r3 = java.lang.System.currentTimeMillis()
            r0.k()
        L1e:
            long r1 = r1 - r3
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L47
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            int r2 = r0.n()
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "0"
            r1.put(r3, r2)
            r2 = 0
            r0.c(r2)
            r0.k()
            java.lang.String r0 = "1003119"
            a(r8, r0, r1)
            return
        L47:
            int r8 = r0.n()
            int r8 = r8 + 1
            r0.c(r8)
            return
    }

    public static java.lang.String l(android.content.Context r4) {
            java.lang.String r0 = ""
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "bd_setting_i"
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r2)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L18
            java.lang.String r1 = com.baidu.liantian.b.g.e(r4)     // Catch: java.lang.Throwable -> L28
        L18:
            java.lang.String[] r2 = g(r4)     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = com.baidu.liantian.jni.Asc.fai(r1, r2, r4)     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            com.baidu.liantian.b.c()
            return r0
    }

    public static int m(android.content.Context r3) {
            r0 = -1
            java.lang.String r1 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L40
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto Lc
            return r0
        Lc:
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L43
            android.net.NetworkInfo$State r1 = r3.getState()     // Catch: java.lang.Throwable -> L40
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L40
            if (r1 != r2) goto L43
            int r1 = r3.getType()     // Catch: java.lang.Throwable -> L40
            r2 = 1
            if (r1 != r2) goto L23
            r3 = 4
            return r3
        L23:
            int r1 = r3.getType()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L3e
            int r3 = r3.getSubtype()     // Catch: java.lang.Throwable -> L40
            r0 = 2
            switch(r3) {
                case 1: goto L3d;
                case 2: goto L3d;
                case 3: goto L3c;
                case 4: goto L3b;
                case 5: goto L3a;
                case 6: goto L3a;
                case 7: goto L39;
                case 8: goto L38;
                case 9: goto L38;
                case 10: goto L38;
                case 11: goto L37;
                case 12: goto L36;
                case 13: goto L34;
                case 14: goto L33;
                case 15: goto L33;
                default: goto L31;
            }
        L31:
            r3 = 5
            return r3
        L33:
            return r0
        L34:
            r3 = 3
            return r3
        L36:
            return r0
        L37:
            return r2
        L38:
            return r0
        L39:
            return r2
        L3a:
            return r0
        L3b:
            return r2
        L3c:
            return r0
        L3d:
            return r2
        L3e:
            r3 = -2
            return r3
        L40:
            com.baidu.liantian.b.c()
        L43:
            return r0
    }

    public static org.json.JSONObject n(android.content.Context r9) {
            java.lang.String r0 = "3"
            java.lang.String r1 = "2"
            java.lang.String r2 = "1"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = android.os.Build.BOARD     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = "0"
            java.lang.String r6 = ""
            if (r4 != 0) goto L14
            r4 = r6
        L14:
            r3.put(r5, r4)     // Catch: java.lang.Exception -> L10c
            java.lang.String r4 = android.os.Build.DEVICE     // Catch: java.lang.Exception -> L10c
            if (r4 != 0) goto L1c
            r4 = r6
        L1c:
            r3.put(r2, r4)     // Catch: java.lang.Exception -> L10c
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.HARDWARE     // Catch: java.lang.Exception -> L10c
            if (r5 != 0) goto L26
            r5 = r6
        L26:
            r3.put(r1, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.HOST     // Catch: java.lang.Exception -> L10c
            if (r5 != 0) goto L2e
            r5 = r6
        L2e:
            r3.put(r0, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.DISPLAY     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "4"
            if (r5 != 0) goto L38
            r5 = r6
        L38:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.PRODUCT     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "5"
            if (r5 != 0) goto L42
            r5 = r6
        L42:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.VERSION.CODENAME     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "6"
            if (r5 != 0) goto L4c
            r5 = r6
        L4c:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "7"
            if (r5 != 0) goto L56
            r5 = r6
        L56:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = "8"
            java.lang.String r7 = com.baidu.liantian.b.g.a(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r5, r7)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "9"
            if (r5 != 0) goto L69
            r5 = r6
        L69:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "10"
            if (r5 != 0) goto L73
            r5 = r6
        L73:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = "11"
            java.lang.String r7 = com.baidu.liantian.b.g.h(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r5, r7)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Exception -> L10c
            java.lang.String r7 = "12"
            if (r5 != 0) goto L86
            r5 = r6
        L86:
            r3.put(r7, r5)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = "13"
            java.lang.String r7 = com.baidu.liantian.b.g.b(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r5, r7)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = "14"
            r3.put(r5, r6)     // Catch: java.lang.Exception -> L10c
            java.lang.String r5 = "15"
            java.lang.String r7 = com.baidu.liantian.b.g.i(r9)     // Catch: java.lang.Exception -> L10c
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L10c
            if (r8 != 0) goto Lc9
            java.lang.String r8 = "46000"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Exception -> L10c
            if (r8 != 0) goto Lc7
            java.lang.String r8 = "46002"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Exception -> L10c
            if (r8 == 0) goto Lb4
            goto Lc7
        Lb4:
            java.lang.String r2 = "46001"
            boolean r2 = r7.startsWith(r2)     // Catch: java.lang.Exception -> L10c
            if (r2 == 0) goto Lbe
            r0 = r1
            goto Lca
        Lbe:
            java.lang.String r1 = "46003"
            boolean r1 = r7.startsWith(r1)     // Catch: java.lang.Exception -> L10c
            if (r1 == 0) goto Lc9
            goto Lca
        Lc7:
            r0 = r2
            goto Lca
        Lc9:
            r0 = r6
        Lca:
            r3.put(r5, r0)     // Catch: java.lang.Exception -> L10c
            java.lang.String r0 = "16"
            java.lang.String r1 = com.baidu.liantian.b.g.j(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L10c
            java.lang.String r0 = "17"
            java.lang.String r1 = com.baidu.liantian.b.g.k(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L10c
            java.lang.String r0 = "18"
            java.lang.String r1 = com.baidu.liantian.b.g.l(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L10c
            java.lang.String r0 = "19"
            java.lang.String r9 = com.baidu.liantian.b.g.m(r9)     // Catch: java.lang.Exception -> L10c
            r3.put(r0, r9)     // Catch: java.lang.Exception -> L10c
            java.lang.String r9 = "20"
            r3.put(r9, r4)     // Catch: java.lang.Exception -> L10c
            java.util.TimeZone r9 = java.util.TimeZone.getDefault()     // Catch: java.lang.Exception -> L10c
            java.lang.String r0 = "21"
            if (r9 == 0) goto L106
            java.lang.String r9 = r9.getID()     // Catch: java.lang.Exception -> L10c
            r3.put(r0, r9)     // Catch: java.lang.Exception -> L10c
            return r3
        L106:
            java.lang.String r9 = "-1"
            r3.put(r0, r9)     // Catch: java.lang.Exception -> L10c
            return r3
        L10c:
            com.baidu.liantian.b.c()
            return r3
    }

    public static int o(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Exception -> Ld
            goto L18
        Ld:
            r2 = move-exception
            r2.toString()
            com.baidu.liantian.b.a()
            com.baidu.liantian.b.c()
            r2 = 0
        L18:
            if (r2 != 0) goto L1f
            com.baidu.liantian.b.a()
            r2 = 0
            return r2
        L1f:
            int r0 = r2.getType()
            r1 = 1
            if (r1 != r0) goto L28
            r2 = 2
            return r2
        L28:
            r2.getType()
            return r1
    }

    public static void p(android.content.Context r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = b()     // Catch: java.lang.Throwable -> Lab
            r0.append(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = "p/1/prt"
            r0.append(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            r1.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = r7.getPackageName()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "pk"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> Lab
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch: java.lang.Throwable -> Lab
            r4 = 64
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r4)     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            com.baidu.liantian.b.c()     // Catch: java.lang.Throwable -> Lab
            r2 = 0
        L32:
            r3 = 0
            java.lang.String r4 = "sm"
            java.lang.String r5 = ""
            if (r2 == 0) goto L6b
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = r6.sourceDir     // Catch: java.lang.Throwable -> Lab
            java.security.PublicKey r2 = a(r2, r6)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L67
            byte[] r2 = r2.getEncoded()     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L6e
            a(r7, r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = "\n"
            java.lang.String r2 = r2.replace(r6, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = "\r"
            java.lang.String r2 = r2.replace(r6, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = com.baidu.liantian.b.o.a(r2)     // Catch: java.lang.Throwable -> Lab
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> Lab
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lab
            goto L6e
        L67:
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> Lab
            goto L6e
        L6b:
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> Lab
        L6e:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lab
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = com.baidu.liantian.b.h.a(r7, r0, r1, r3)     // Catch: java.lang.Throwable -> Lab
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto Laa
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "product"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "pt"
            long r1 = r1.optLong(r2)     // Catch: java.lang.Throwable -> Lab
            r3 = 0
            if (r0 == 0) goto La3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto La3
            com.baidu.liantian.e r5 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> Lab
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            r5.a(r0, r1)     // Catch: java.lang.Throwable -> Lab
        La3:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Laa
            j(r7)     // Catch: java.lang.Throwable -> Lab
        Laa:
            return
        Lab:
            com.baidu.liantian.b.c()
            return
    }

    public static void q(android.content.Context r9) {
            java.lang.String r0 = ""
            java.util.Map<java.lang.String, java.lang.String> r1 = com.baidu.liantian.b.e.f5913g     // Catch: java.lang.Throwable -> Lf5
            r1.clear()     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.e r1 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> Lf5
            r1.<init>(r9)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r1 = r1.e()     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf5
            if (r2 == 0) goto L1b
            goto Lf4
        L1b:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lf5
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lf5
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lf5
            r1.<init>()     // Catch: java.lang.Throwable -> Lf5
            r3 = 0
            r4 = 0
        L27:
            int r5 = r2.length()     // Catch: java.lang.Throwable -> Lf5
            if (r4 >= r5) goto L46
            org.json.JSONObject r5 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = "p"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = "s"
            java.lang.String r5 = r5.optString(r7)     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> Lf5
            int r4 = r4 + 1
            goto L27
        L46:
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch: java.lang.Throwable -> Lf5
            r4 = 64
            java.util.List r2 = r2.getInstalledPackages(r4)     // Catch: java.lang.Throwable -> Lf5
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lf5
        L54:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf5
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lf5
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            java.util.Set r6 = r1.keySet()     // Catch: java.lang.Throwable -> Lf5
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> Lf5
            if (r6 == 0) goto L54
            java.lang.String r6 = r9.getPackageName()     // Catch: java.lang.Throwable -> Lf5
            boolean r6 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lf5
            if (r6 != 0) goto L54
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = r7.sourceDir     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            java.security.PublicKey r7 = a(r4, r7)     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            if (r7 == 0) goto L54
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            if (r7 == 0) goto L54
            a(r9, r7)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r3)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = "\n"
            java.lang.String r7 = r7.replace(r8, r0)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = "\r"
            java.lang.String r7 = r7.replace(r8, r0)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = com.baidu.liantian.b.o.a(r7)     // Catch: java.lang.Throwable -> Lf5
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lf5
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lf5
            if (r8 != 0) goto L54
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf5
            if (r6 == 0) goto L54
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lf5
            r6.<init>()     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = "pk"
            r6.put(r8, r5)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r8 = "av"
            java.lang.String r4 = r4.versionName     // Catch: java.lang.Throwable -> Lf5
            r6.put(r8, r4)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r4 = "sm"
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r4 = "dm"
            java.lang.String r7 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lf5
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r4 = "al"
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Lf5
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> Lf5
            java.util.Map<java.lang.String, java.lang.String> r4 = com.baidu.liantian.b.e.f5913g     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lf5
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Lf5
            goto L54
        Lf4:
            return
        Lf5:
            com.baidu.liantian.b.c()
            return
    }

    private static java.lang.String r(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L11
            r1 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            java.lang.String r2 = "1.0.0"
            return r2
    }
}
