package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List<java.lang.Integer> f5977b;

    /* renamed from: e, reason: collision with root package name */
    private static com.baidu.liantian.core.g f5978e;

    /* renamed from: f, reason: collision with root package name */
    private static android.app.Application f5979f;

    /* renamed from: g, reason: collision with root package name */
    private static java.util.Random f5980g;
    public java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5981c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5982d;

    /* renamed from: h, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> f5983h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.baidu.liantian.LiantianReceiver> f5984i;

    static {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.baidu.liantian.core.g.f5980g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.baidu.liantian.core.g.f5977b = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f5983h = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f5984i = r0
            return
    }

    private static android.content.pm.PackageInfo a(java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "t"
            java.lang.String r1 = "n"
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L125
            r3.<init>()     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L125
            r3.append(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "p/1/pdl"
            r3.append(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L125
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L125
            r4.<init>()     // Catch: java.lang.Throwable -> L125
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L125
            r5.<init>()     // Catch: java.lang.Throwable -> L125
            java.lang.String r6 = "pk"
            r5.put(r6, r10)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "m"
            r5.put(r10, r11)     // Catch: java.lang.Throwable -> L125
            r4.put(r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L125
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L125
            android.app.Application r11 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L125
            r4 = 0
            java.lang.String r10 = com.baidu.liantian.b.h.a(r11, r3, r10, r4)     // Catch: java.lang.Throwable -> L125
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L125
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L125
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L125
            int r10 = r11.length()     // Catch: java.lang.Throwable -> L125
            if (r10 > 0) goto L4e
            return r2
        L4e:
            org.json.JSONObject r10 = r11.optJSONObject(r4)     // Catch: java.lang.Throwable -> L125
            android.content.pm.PackageInfo r11 = new android.content.pm.PackageInfo     // Catch: java.lang.Throwable -> L125
            r11.<init>()     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = "p"
            java.lang.String r3 = r10.optString(r3)     // Catch: java.lang.Throwable -> L125
            r11.packageName = r3     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = "v"
            java.lang.String r3 = r10.optString(r3)     // Catch: java.lang.Throwable -> L125
            r11.versionName = r3     // Catch: java.lang.Throwable -> L125
            android.content.pm.ApplicationInfo r3 = new android.content.pm.ApplicationInfo     // Catch: java.lang.Throwable -> L125
            r3.<init>()     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = r10.optString(r1)     // Catch: java.lang.Throwable -> L125
            r3.className = r5     // Catch: java.lang.Throwable -> L125
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L125
            java.lang.String r6 = "."
            if (r5 != 0) goto L97
            java.lang.String r5 = r3.className     // Catch: java.lang.Throwable -> L125
            boolean r5 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> L125
            if (r5 == 0) goto L97
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L125
            r5.<init>()     // Catch: java.lang.Throwable -> L125
            java.lang.String r7 = r11.packageName     // Catch: java.lang.Throwable -> L125
            r5.append(r7)     // Catch: java.lang.Throwable -> L125
            java.lang.String r7 = r3.className     // Catch: java.lang.Throwable -> L125
            r5.append(r7)     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L125
            r3.className = r5     // Catch: java.lang.Throwable -> L125
        L97:
            int r5 = r10.optInt(r0)     // Catch: java.lang.Throwable -> L125
            r3.theme = r5     // Catch: java.lang.Throwable -> L125
            r11.applicationInfo = r3     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = "a"
            org.json.JSONArray r10 = r10.optJSONArray(r3)     // Catch: java.lang.Throwable -> L125
            if (r10 == 0) goto L124
            int r3 = r10.length()     // Catch: java.lang.Throwable -> L125
            if (r3 <= 0) goto L124
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r3.<init>()     // Catch: java.lang.Throwable -> L125
        Lb2:
            int r5 = r10.length()     // Catch: java.lang.Throwable -> L125
            if (r4 >= r5) goto L110
            org.json.JSONObject r5 = r10.getJSONObject(r4)     // Catch: java.lang.Throwable -> L10a
            if (r5 == 0) goto L10d
            android.content.pm.ActivityInfo r7 = new android.content.pm.ActivityInfo     // Catch: java.lang.Throwable -> L10a
            r7.<init>()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = r5.optString(r1)     // Catch: java.lang.Throwable -> L10a
            r7.name = r8     // Catch: java.lang.Throwable -> L10a
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L10a
            if (r8 != 0) goto Lec
            java.lang.String r8 = r7.name     // Catch: java.lang.Throwable -> L10a
            boolean r8 = r8.startsWith(r6)     // Catch: java.lang.Throwable -> L10a
            if (r8 == 0) goto Lec
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10a
            r8.<init>()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r9 = r11.packageName     // Catch: java.lang.Throwable -> L10a
            r8.append(r9)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r9 = r7.name     // Catch: java.lang.Throwable -> L10a
            r8.append(r9)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L10a
            r7.name = r8     // Catch: java.lang.Throwable -> L10a
        Lec:
            java.lang.String r8 = r11.packageName     // Catch: java.lang.Throwable -> L10a
            r7.packageName = r8     // Catch: java.lang.Throwable -> L10a
            int r8 = r5.optInt(r0)     // Catch: java.lang.Throwable -> L10a
            r7.theme = r8     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = "l"
            int r5 = r5.optInt(r8)     // Catch: java.lang.Throwable -> L10a
            r7.labelRes = r5     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = r7.name     // Catch: java.lang.Throwable -> L10a
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L10a
            if (r5 != 0) goto L10d
            r3.add(r7)     // Catch: java.lang.Throwable -> L10a
            goto L10d
        L10a:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L125
        L10d:
            int r4 = r4 + 1
            goto Lb2
        L110:
            int r10 = r3.size()     // Catch: java.lang.Throwable -> L125
            if (r10 <= 0) goto L124
            int r10 = r3.size()     // Catch: java.lang.Throwable -> L125
            android.content.pm.ActivityInfo[] r10 = new android.content.pm.ActivityInfo[r10]     // Catch: java.lang.Throwable -> L125
            java.lang.Object[] r10 = r3.toArray(r10)     // Catch: java.lang.Throwable -> L125
            android.content.pm.ActivityInfo[] r10 = (android.content.pm.ActivityInfo[]) r10     // Catch: java.lang.Throwable -> L125
            r11.activities = r10     // Catch: java.lang.Throwable -> L125
        L124:
            return r11
        L125:
            com.baidu.liantian.b.e.a()
            return r2
    }

    public static com.baidu.liantian.core.g a() {
            com.baidu.liantian.core.g r0 = com.baidu.liantian.core.g.f5978e
            return r0
    }

    public static com.baidu.liantian.core.g a(android.content.Context r1) {
            com.baidu.liantian.core.g r0 = com.baidu.liantian.core.g.f5978e
            if (r0 != 0) goto L17
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            android.app.Application r1 = (android.app.Application) r1
            com.baidu.liantian.core.g.f5979f = r1
            com.baidu.liantian.core.g r1 = new com.baidu.liantian.core.g
            r1.<init>()
            com.baidu.liantian.core.g.f5978e = r1
        L17:
            com.baidu.liantian.core.g r1 = com.baidu.liantian.core.g.f5978e
            return r1
    }

    private static java.lang.String a(android.content.IntentFilter r9) {
            java.lang.String r0 = ""
            if (r9 != 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L129
            r1.<init>()     // Catch: java.lang.Throwable -> L129
            int r2 = r9.countActions()     // Catch: java.lang.Throwable -> L129
            r3 = 0
            java.lang.String r4 = "_"
            if (r2 <= 0) goto L50
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L129
            r5.<init>()     // Catch: java.lang.Throwable -> L129
            r6 = 0
        L19:
            if (r6 >= r2) goto L2f
            java.lang.String r7 = r9.getAction(r6)     // Catch: java.lang.Throwable -> L29
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L29
            if (r8 != 0) goto L2c
            r5.add(r7)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L129
        L2c:
            int r6 = r6 + 1
            goto L19
        L2f:
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L129
            if (r2 <= 0) goto L4c
            java.util.Collections.sort(r5)     // Catch: java.lang.Throwable -> L129
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> L129
        L3c:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L129
            if (r5 == 0) goto L53
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L129
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L129
            r1.append(r5)     // Catch: java.lang.Throwable -> L129
            goto L3c
        L4c:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
            goto L53
        L50:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
        L53:
            int r2 = r9.countCategories()     // Catch: java.lang.Throwable -> L129
            if (r2 <= 0) goto L96
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L129
            r5.<init>()     // Catch: java.lang.Throwable -> L129
            r6 = 0
        L5f:
            if (r6 >= r2) goto L75
            java.lang.String r7 = r9.getCategory(r6)     // Catch: java.lang.Throwable -> L6f
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L72
            r5.add(r7)     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L129
        L72:
            int r6 = r6 + 1
            goto L5f
        L75:
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L129
            if (r6 <= 0) goto L92
            java.util.Collections.sort(r5)     // Catch: java.lang.Throwable -> L129
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L129
        L82:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L129
            if (r6 == 0) goto L99
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L129
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L129
            r1.append(r6)     // Catch: java.lang.Throwable -> L129
            goto L82
        L92:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
            goto L99
        L96:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
        L99:
            int r5 = r9.countDataTypes()     // Catch: java.lang.Throwable -> L129
            if (r5 <= 0) goto Ldc
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L129
            r5.<init>()     // Catch: java.lang.Throwable -> L129
            r6 = 0
        La5:
            if (r6 >= r2) goto Lbb
            java.lang.String r7 = r9.getDataType(r6)     // Catch: java.lang.Throwable -> Lb5
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lb5
            if (r8 != 0) goto Lb8
            r5.add(r7)     // Catch: java.lang.Throwable -> Lb5
            goto Lb8
        Lb5:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L129
        Lb8:
            int r6 = r6 + 1
            goto La5
        Lbb:
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L129
            if (r2 <= 0) goto Ld8
            java.util.Collections.sort(r5)     // Catch: java.lang.Throwable -> L129
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> L129
        Lc8:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L129
            if (r5 == 0) goto Ldf
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L129
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L129
            r1.append(r5)     // Catch: java.lang.Throwable -> L129
            goto Lc8
        Ld8:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
            goto Ldf
        Ldc:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
        Ldf:
            int r2 = r9.countDataSchemes()     // Catch: java.lang.Throwable -> L129
            if (r2 <= 0) goto L121
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L129
            r5.<init>()     // Catch: java.lang.Throwable -> L129
        Lea:
            if (r3 >= r2) goto L100
            java.lang.String r6 = r9.getDataScheme(r3)     // Catch: java.lang.Throwable -> Lfa
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lfa
            if (r7 != 0) goto Lfd
            r5.add(r6)     // Catch: java.lang.Throwable -> Lfa
            goto Lfd
        Lfa:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L129
        Lfd:
            int r3 = r3 + 1
            goto Lea
        L100:
            int r9 = r5.size()     // Catch: java.lang.Throwable -> L129
            if (r9 <= 0) goto L11d
            java.util.Collections.sort(r5)     // Catch: java.lang.Throwable -> L129
            java.util.Iterator r9 = r5.iterator()     // Catch: java.lang.Throwable -> L129
        L10d:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L129
            if (r2 == 0) goto L124
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L129
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L129
            r1.append(r2)     // Catch: java.lang.Throwable -> L129
            goto L10d
        L11d:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
            goto L124
        L121:
            r1.append(r4)     // Catch: java.lang.Throwable -> L129
        L124:
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L129
            return r9
        L129:
            return r0
    }

    private static void a(android.app.Application r4, android.content.Context r5) {
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
        L6:
            if (r1 == 0) goto L28
            java.lang.String r2 = "mBase"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.Throwable -> L20
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L23
            r2.set(r4, r5)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            com.baidu.liantian.b.e.a()
        L23:
            java.lang.Class r1 = r1.getSuperclass()
            goto L6
        L28:
            return
    }

    private void a(com.baidu.liantian.core.ApkInfo r13, java.lang.String r14, java.lang.String r15) {
            r12 = this;
            java.lang.String r0 = "class ForHostApp.ENGINE_IMPL_CLASS_FULL_PATH loaded is null"
            java.lang.String r1 = "com.baidu.liantian.engine.EngineImpl"
            java.lang.String r2 = "apkDex"
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 1
            r8 = 0
            r3 = r13
            r4 = r14
            a(r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = ":"
            r13.<init>(r14)
            java.lang.String r7 = "java.library.path"
            java.lang.String r7 = java.lang.System.getProperty(r7)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 25
            java.lang.String r9 = ""
            if (r7 < r8) goto L34
            r13 = r9
        L34:
            java.lang.String r7 = android.os.Build.CPU_ABI
            boolean r8 = r5.contains(r7)
            java.lang.String r10 = "/"
            if (r8 == 0) goto L97
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r10)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            java.lang.String r9 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L6c
            boolean r11 = r5.contains(r9)     // Catch: java.lang.Throwable -> L6c
            if (r11 == 0) goto L6f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r11.<init>()     // Catch: java.lang.Throwable -> L6c
            r11.append(r4)     // Catch: java.lang.Throwable -> L6c
            r11.append(r10)     // Catch: java.lang.Throwable -> L6c
            r11.append(r9)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L6c
            goto L6f
        L6c:
            com.baidu.liantian.b.e.a()
        L6f:
            if (r8 == 0) goto L87
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r14)
            r9.append(r8)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            goto Lb8
        L87:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            r14.append(r13)
            java.lang.String r9 = r14.toString()
            goto Lb8
        L97:
            java.lang.String r14 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> Lb5
            boolean r7 = r5.contains(r14)     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto Lb8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r7.<init>()     // Catch: java.lang.Throwable -> Lb5
            r7.append(r4)     // Catch: java.lang.Throwable -> Lb5
            r7.append(r10)     // Catch: java.lang.Throwable -> Lb5
            r7.append(r14)     // Catch: java.lang.Throwable -> Lb5
            r7.append(r13)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r9 = r7.toString()     // Catch: java.lang.Throwable -> Lb5
            goto Lb8
        Lb5:
            com.baidu.liantian.b.e.a()
        Lb8:
            boolean r14 = android.text.TextUtils.isEmpty(r9)
            if (r14 == 0) goto Lf2
            java.lang.String r14 = android.os.Build.CPU_ABI
            java.lang.String r7 = "armeabi-v7a"
            boolean r14 = r7.equals(r14)
            java.lang.String r8 = "armeabi"
            if (r14 == 0) goto Ld0
            boolean r14 = r5.contains(r8)
            if (r14 != 0) goto Lde
        Ld0:
            java.lang.String r14 = android.os.Build.CPU_ABI2
            boolean r14 = r7.equals(r14)
            if (r14 == 0) goto Lf2
            boolean r14 = r5.contains(r8)
            if (r14 == 0) goto Lf2
        Lde:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            java.lang.String r7 = "/armeabi"
            r14.append(r7)
            r14.append(r13)
            java.lang.String r9 = r14.toString()
        Lf2:
            r3.libPath = r9
            dalvik.system.PathClassLoader r13 = new dalvik.system.PathClassLoader
            android.content.Context r14 = r3.hostContext
            java.lang.String r14 = r14.getPackageResourcePath()
            java.lang.Class<com.baidu.liantian.core.g> r7 = com.baidu.liantian.core.g.class
            java.lang.ClassLoader r7 = r7.getClassLoader()
            r13.<init>(r14, r7)
            com.baidu.liantian.b.a()
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L13d
            r14.<init>(r15, r2)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r14 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L13d
            com.baidu.liantian.b.e.d(r14)     // Catch: java.lang.Throwable -> L13d
            e(r14)     // Catch: java.lang.Throwable -> L13d
            com.baidu.liantian.core.f r7 = new com.baidu.liantian.core.f     // Catch: java.lang.Throwable -> L13d
            java.lang.String r8 = r3.pkgPath     // Catch: java.lang.Throwable -> L13d
            r7.<init>(r8, r14, r9, r13)     // Catch: java.lang.Throwable -> L13d
            r3.classLoader = r7     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r14 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L13d
            java.util.Objects.toString(r14)     // Catch: java.lang.Throwable -> L13d
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L13d
            if (r14 == 0) goto L137
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> L13d
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L13d
            if (r14 != 0) goto L137
            goto L19b
        L137:
            java.lang.Exception r14 = new java.lang.Exception     // Catch: java.lang.Throwable -> L13d
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L13d
            throw r14     // Catch: java.lang.Throwable -> L13d
        L13d:
            com.baidu.liantian.b.a()
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L1a2
            r14.<init>(r15, r2)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r14 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a2
            com.baidu.liantian.b.e.d(r14)     // Catch: java.lang.Throwable -> L1a2
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r2 = "dexDex"
            r14.<init>(r15, r2)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r14 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a2
            com.baidu.liantian.b.e.d(r14)     // Catch: java.lang.Throwable -> L1a2
            e(r14)     // Catch: java.lang.Throwable -> L1a2
            r7 = 0
            r8 = 1
            a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1a2
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a2
            com.baidu.liantian.core.f r15 = new com.baidu.liantian.core.f     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L1a2
            r15.<init>(r2, r14, r9, r13)     // Catch: java.lang.Throwable -> L1a2
            r3.classLoader = r15     // Catch: java.lang.Throwable -> L1a2
            java.lang.Class r13 = r15.loadClass(r1)     // Catch: java.lang.Throwable -> L1a2
            java.util.Objects.toString(r13)     // Catch: java.lang.Throwable -> L1a2
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a2
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a2
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r15 = r6.toString()     // Catch: java.lang.Throwable -> L1a2
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L1a2
            boolean r15 = r14.exists()     // Catch: java.lang.Throwable -> L1a2
            if (r15 == 0) goto L18f
            r14.delete()     // Catch: java.lang.Throwable -> L1a2
        L18f:
            if (r13 == 0) goto L19c
            java.lang.String r13 = r13.getName()     // Catch: java.lang.Throwable -> L1a2
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L1a2
            if (r13 != 0) goto L19c
        L19b:
            return
        L19c:
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.lang.Throwable -> L1a2
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L1a2
            throw r13     // Catch: java.lang.Throwable -> L1a2
        L1a2:
            com.baidu.liantian.b.a()
            java.lang.String r13 = r3.dataDir     // Catch: java.lang.Throwable -> L1bb
            com.baidu.liantian.b.e.d(r13)     // Catch: java.lang.Throwable -> L1bb
            android.app.Application r13 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L1bb
            if (r13 == 0) goto L1bb
            java.lang.String r14 = r3.packageName     // Catch: java.lang.Throwable -> L1bb
            java.io.File r13 = r13.getFileStreamPath(r14)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L1bb
            com.baidu.liantian.b.e.d(r13)     // Catch: java.lang.Throwable -> L1bb
        L1bb:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "can't load EngineImpl by both dexFile:"
            r14.<init>(r15)
            java.lang.String r15 = r6.toString()
            r14.append(r15)
            java.lang.String r15 = " and ZipFile:"
            r14.append(r15)
            java.lang.String r15 = r3.pkgPath
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    private static void a(com.baidu.liantian.core.ApkInfo r17, java.lang.String r18, java.lang.String r19, java.util.HashSet<java.lang.String> r20, byte[] r21, java.lang.StringBuilder r22, boolean r23, boolean r24) {
            r1 = r17
            r2 = r21
            r3 = r22
            java.lang.String r4 = ".dex"
            java.lang.String r5 = ".so"
            java.lang.String r6 = "armeabi-v7a"
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r8 = r1.pkgPath
            r0.<init>(r8)
            r7.<init>(r0)
            r9 = 0
        L19:
            java.util.zip.ZipEntry r0 = r7.getNextEntry()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L177
            java.lang.String r10 = r0.getName()     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = "lib/"
            boolean r11 = r10.startsWith(r11)     // Catch: java.lang.Throwable -> L56
            r13 = 0
            if (r11 == 0) goto Le7
            boolean r11 = r0.isDirectory()     // Catch: java.lang.Throwable -> L56
            if (r11 != 0) goto Le7
            if (r23 == 0) goto Le7
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L56
            java.lang.String r14 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L56
            r14 = 0
        L40:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L56
            boolean r15 = r10.contains(r11)     // Catch: java.lang.Throwable -> L56
            if (r15 != 0) goto L73
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L56
            if (r15 != 0) goto L59
            boolean r15 = r10.contains(r14)     // Catch: java.lang.Throwable -> L56
            if (r15 != 0) goto L73
            goto L59
        L56:
            r0 = move-exception
            goto L180
        L59:
            java.lang.String r15 = "armeabi"
            boolean r15 = r10.contains(r15)     // Catch: java.lang.Throwable -> L56
            if (r15 == 0) goto L19
            boolean r11 = r6.equalsIgnoreCase(r11)     // Catch: java.lang.Throwable -> L56
            if (r11 != 0) goto L73
            boolean r11 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L56
            if (r11 != 0) goto L19
            boolean r11 = r6.equalsIgnoreCase(r14)     // Catch: java.lang.Throwable -> L56
            if (r11 == 0) goto L19
        L73:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r11.<init>()     // Catch: java.lang.Throwable -> L56
            r14 = r18
            r11.append(r14)     // Catch: java.lang.Throwable -> L56
            r15 = 3
            java.lang.String r15 = r10.substring(r15)     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r8.<init>()     // Catch: java.lang.Throwable -> L56
            r12 = r19
            r16 = 1
            r8.append(r12)     // Catch: java.lang.Throwable -> L56
            r8.append(r5)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r15.replace(r5, r8)     // Catch: java.lang.Throwable -> L56
            r11.append(r8)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L56
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L56
            r11 = 47
            int r15 = r8.lastIndexOf(r11)     // Catch: java.lang.Throwable -> L56
            java.lang.String r15 = r8.substring(r13, r15)     // Catch: java.lang.Throwable -> L56
            int r11 = r15.lastIndexOf(r11)     // Catch: java.lang.Throwable -> L56
            int r11 = r11 + 1
            java.lang.String r11 = r15.substring(r11)     // Catch: java.lang.Throwable -> L56
            r13 = r20
            r13.add(r11)     // Catch: java.lang.Throwable -> L56
            e(r15)     // Catch: java.lang.Throwable -> L56
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L56
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L56
            r11.delete()     // Catch: java.lang.Throwable -> L56
            r11.createNewFile()     // Catch: java.lang.Throwable -> L56
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L56
        Lcf:
            int r9 = r7.read(r2)     // Catch: java.lang.Throwable -> Lda
            if (r9 <= 0) goto Lde
            r15 = 0
            r11.write(r2, r15, r9)     // Catch: java.lang.Throwable -> Lda
            goto Lcf
        Lda:
            r0 = move-exception
            r9 = r11
            goto L180
        Lde:
            r11.close()     // Catch: java.lang.Throwable -> Lda
            r9 = 1
            com.baidu.liantian.b.e.a(r8, r9)     // Catch: java.lang.Throwable -> Lda
            r9 = r11
            goto Led
        Le7:
            r14 = r18
            r12 = r19
            r13 = r20
        Led:
            boolean r8 = r10.endsWith(r4)     // Catch: java.lang.Throwable -> L15f
            if (r8 == 0) goto L172
            boolean r0 = r0.isDirectory()     // Catch: java.lang.Throwable -> L15f
            if (r0 != 0) goto L172
            if (r24 == 0) goto L172
            java.lang.String r0 = r1.dataDir     // Catch: java.lang.Throwable -> L15f
            e(r0)     // Catch: java.lang.Throwable -> L15f
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r10.<init>()     // Catch: java.lang.Throwable -> L15f
            int r11 = r1.key     // Catch: java.lang.Throwable -> L15f
            r10.append(r11)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r11 = "-"
            r10.append(r11)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r11 = r1.versionName     // Catch: java.lang.Throwable -> L15f
            r10.append(r11)     // Catch: java.lang.Throwable -> L15f
            r10.append(r4)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L15f
            r8.<init>(r0, r10)     // Catch: java.lang.Throwable -> L15f
            r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L15d
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L15d
            r8.delete()     // Catch: java.lang.Throwable -> L15d
            r8.createNewFile()     // Catch: java.lang.Throwable -> L15d
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L15d
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L15d
        L131:
            int r0 = r7.read(r2)     // Catch: java.lang.Throwable -> L13c
            if (r0 <= 0) goto L13f
            r15 = 0
            r10.write(r2, r15, r0)     // Catch: java.lang.Throwable -> L13c
            goto L131
        L13c:
            r0 = move-exception
            r9 = r10
            goto L161
        L13f:
            r15 = 0
            r10.close()     // Catch: java.lang.Throwable -> L13c
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L13c
            if (r0 <= 0) goto L14c
            r3.setLength(r15)     // Catch: java.lang.Throwable -> L13c
        L14c:
            java.lang.String r0 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L13c
            r3.append(r0)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L13c
            r9 = 1
            com.baidu.liantian.b.e.a(r0, r9)     // Catch: java.lang.Throwable -> L13c
            r9 = r10
            goto L172
        L15d:
            r0 = move-exception
            goto L161
        L15f:
            r0 = move-exception
            r8 = 0
        L161:
            r0.getMessage()     // Catch: java.lang.Throwable -> L56
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L56
            if (r8 == 0) goto L172
            boolean r0 = r8.exists()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L172
            r8.delete()     // Catch: java.lang.Throwable -> L56
        L172:
            r7.closeEntry()     // Catch: java.lang.Throwable -> L56
            goto L19
        L177:
            r7.close()
            if (r9 == 0) goto L17f
            r9.close()
        L17f:
            return
        L180:
            r7.close()
            if (r9 == 0) goto L188
            r9.close()
        L188:
            throw r0
    }

    private static void a(com.baidu.liantian.core.ApkInfo r21, java.lang.String r22, java.util.HashSet<java.lang.String> r23, java.lang.StringBuilder r24, boolean r25, boolean r26) {
            r1 = r21
            java.lang.String r2 = ".dex"
            java.lang.String r3 = ".so"
            java.lang.String r4 = "armeabi-v7a"
            java.lang.String r5 = "-"
            java.lang.String r0 = r1.versionName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = ""
            if (r0 != 0) goto L1c
            java.lang.String r0 = r1.versionName
            java.lang.String r7 = "."
            java.lang.String r6 = r0.replace(r7, r6)
        L1c:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]
            r8 = 1
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L3a java.io.FileNotFoundException -> L3e
            java.lang.String r10 = r1.pkgPath     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L3a java.io.FileNotFoundException -> L3e
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L3a java.io.FileNotFoundException -> L3e
        L28:
            r10 = r0
            goto L9e
        L2b:
            r0 = move-exception
            r9 = 0
        L2d:
            r13 = 0
            r16 = 0
            goto L383
        L32:
            r9 = r22
            r3 = r23
            r14 = r24
            goto L33f
        L3a:
            r3 = r6
            r5 = r7
            goto L361
        L3e:
            r0 = move-exception
            java.lang.String r10 = r0.getMessage()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L3a
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            android.content.Context r11 = r1.hostContext     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.io.File r11 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.lang.String r12 = ".b_liantian"
            r0.<init>(r11, r12)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            boolean r11 = r0.exists()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            if (r11 == 0) goto L322
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            r12.<init>()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            int r13 = r1.key     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            r12.append(r13)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            r12.append(r5)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.lang.String r13 = r1.versionName     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            r12.append(r13)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            r11.<init>(r0, r12)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            if (r0 == 0) goto L305
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.lang.String r12 = r1.pkgPath     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            com.baidu.liantian.b.e.a(r11, r0)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            java.lang.String r12 = r1.pkgPath     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            com.baidu.liantian.b.e.a(r12, r8)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            com.baidu.liantian.c.a(r0)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            android.content.Context r12 = r1.hostContext     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            int r13 = r1.key     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            com.baidu.liantian.c.a(r12, r13, r0, r11)     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L2b java.io.EOFException -> L32 java.util.zip.ZipException -> L2fd
            if (r0 == 0) goto L2e0
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L2bb
            java.lang.String r11 = r1.pkgPath     // Catch: java.lang.Throwable -> L2bb
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L2bb
            goto L28
        L9e:
            java.util.Enumeration r11 = r10.entries()     // Catch: java.lang.Throwable -> L29d java.io.EOFException -> L2a1 java.util.zip.ZipException -> L2ae
            r12 = 0
            r13 = 0
        La4:
            boolean r0 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r0 == 0) goto L28f
            java.lang.Object r0 = r11.nextElement()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            java.lang.String r14 = r0.getName()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            java.lang.String r15 = "lib/"
            boolean r15 = r14.startsWith(r15)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r15 == 0) goto L1d3
            boolean r15 = r0.isDirectory()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r15 != 0) goto L1d3
            if (r25 == 0) goto L1d3
            java.lang.String r15 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            java.lang.String r17 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> Lc9
            goto Lce
        Lc9:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            r17 = 0
        Lce:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            boolean r18 = r14.contains(r15)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r18 != 0) goto L11f
            boolean r18 = android.text.TextUtils.isEmpty(r17)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r18 != 0) goto Lfe
            r8 = r17
            r18 = 1
            boolean r17 = r14.contains(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r17 != 0) goto L121
            goto L102
        Le8:
            r0 = move-exception
        Le9:
            r9 = r10
        Lea:
            r16 = r12
            goto L383
        Lee:
            r9 = r22
        Lf0:
            r3 = r23
        Lf2:
            r14 = r24
            goto L27b
        Lf6:
            r9 = r22
        Lf8:
            r3 = r23
        Lfa:
            r14 = r24
            goto L285
        Lfe:
            r8 = r17
            r18 = 1
        L102:
            java.lang.String r9 = "armeabi"
            boolean r9 = r14.contains(r9)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r9 == 0) goto L11d
            boolean r9 = r4.equalsIgnoreCase(r15)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r9 != 0) goto L121
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r9 != 0) goto L11d
            boolean r8 = r4.equalsIgnoreCase(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            if (r8 == 0) goto L11d
            goto L121
        L11d:
            r8 = 1
            goto La4
        L11f:
            r18 = 1
        L121:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            r8.<init>()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lee java.util.zip.ZipException -> Lf6
            r9 = r22
            r8.append(r9)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r15 = 3
            java.lang.String r15 = r14.substring(r15)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r19 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r4.<init>()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r4.append(r6)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r4.append(r3)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            java.lang.String r4 = r15.replace(r3, r4)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r8.append(r4)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r8 = 47
            int r15 = r4.lastIndexOf(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r8 = 0
            java.lang.String r15 = r4.substring(r8, r15)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r8 = 47
            int r8 = r15.lastIndexOf(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            int r8 = r8 + 1
            java.lang.String r8 = r15.substring(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf0 java.util.zip.ZipException -> Lf8
            r20 = r3
            r3 = r23
            r3.add(r8)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf2 java.util.zip.ZipException -> Lfa
            e(r15)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf2 java.util.zip.ZipException -> Lfa
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf2 java.util.zip.ZipException -> Lfa
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf2 java.util.zip.ZipException -> Lfa
            r8.delete()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf2 java.util.zip.ZipException -> Lfa
            java.io.InputStream r12 = r10.getInputStream(r0)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> Lf2 java.util.zip.ZipException -> Lfa
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> L1b9 java.util.zip.ZipException -> L1c6
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> L1b9 java.util.zip.ZipException -> L1c6
        L181:
            int r13 = r12.read(r7)     // Catch: java.lang.Throwable -> L18c java.io.EOFException -> L19d java.util.zip.ZipException -> L1ab
            if (r13 <= 0) goto L190
            r15 = 0
            r8.write(r7, r15, r13)     // Catch: java.lang.Throwable -> L18c java.io.EOFException -> L19d java.util.zip.ZipException -> L1ab
            goto L181
        L18c:
            r0 = move-exception
            r13 = r8
            goto Le9
        L190:
            r8.close()     // Catch: java.lang.Throwable -> L18c java.io.EOFException -> L19d java.util.zip.ZipException -> L1ab
            r12.close()     // Catch: java.lang.Throwable -> L18c java.io.EOFException -> L19d java.util.zip.ZipException -> L1ab
            r13 = 1
            com.baidu.liantian.b.e.a(r4, r13)     // Catch: java.lang.Throwable -> L18c java.io.EOFException -> L19d java.util.zip.ZipException -> L1ab
            r13 = r8
            goto L1db
        L19d:
            r4 = r3
            r3 = r6
            r5 = r7
            r13 = r8
            r2 = r9
            r9 = r10
            r6 = r24
            r7 = r25
            r8 = r26
            goto L34b
        L1ab:
            r4 = r3
            r3 = r6
            r5 = r7
            r13 = r8
            r2 = r9
            r9 = r10
            r6 = r24
            r7 = r25
            r8 = r26
            goto L370
        L1b9:
            r8 = r26
            r4 = r3
            r3 = r6
            r5 = r7
            r2 = r9
            r9 = r10
        L1c0:
            r6 = r24
        L1c2:
            r7 = r25
            goto L34b
        L1c6:
            r8 = r26
            r4 = r3
            r3 = r6
            r5 = r7
            r2 = r9
            r9 = r10
        L1cd:
            r6 = r24
        L1cf:
            r7 = r25
            goto L370
        L1d3:
            r9 = r22
            r20 = r3
            r19 = r4
            r3 = r23
        L1db:
            boolean r4 = r14.endsWith(r2)     // Catch: java.lang.Throwable -> L25a
            if (r4 == 0) goto L260
            boolean r4 = r0.isDirectory()     // Catch: java.lang.Throwable -> L25a
            if (r4 != 0) goto L260
            if (r26 == 0) goto L260
            java.lang.String r4 = r1.dataDir     // Catch: java.lang.Throwable -> L25a
            e(r4)     // Catch: java.lang.Throwable -> L25a
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L25a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25a
            r14.<init>()     // Catch: java.lang.Throwable -> L25a
            int r15 = r1.key     // Catch: java.lang.Throwable -> L25a
            r14.append(r15)     // Catch: java.lang.Throwable -> L25a
            r14.append(r5)     // Catch: java.lang.Throwable -> L25a
            java.lang.String r15 = r1.versionName     // Catch: java.lang.Throwable -> L25a
            r14.append(r15)     // Catch: java.lang.Throwable -> L25a
            r14.append(r2)     // Catch: java.lang.Throwable -> L25a
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L25a
            r8.<init>(r4, r14)     // Catch: java.lang.Throwable -> L25a
            r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L255
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L255
            java.io.InputStream r4 = r10.getInputStream(r0)     // Catch: java.lang.Throwable -> L255
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L251
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L251
        L21b:
            int r0 = r4.read(r7)     // Catch: java.lang.Throwable -> L24d
            if (r0 <= 0) goto L22d
            r15 = 0
            r12.write(r7, r15, r0)     // Catch: java.lang.Throwable -> L226
            goto L21b
        L226:
            r0 = move-exception
            r14 = r24
            r13 = r12
        L22a:
            r15 = 1
        L22b:
            r12 = r4
            goto L269
        L22d:
            r12.close()     // Catch: java.lang.Throwable -> L24d
            r4.close()     // Catch: java.lang.Throwable -> L24d
            java.lang.String r0 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L24d
            r14 = r24
            r14.append(r0)     // Catch: java.lang.Throwable -> L24a
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L24a
            r15 = 1
            com.baidu.liantian.b.e.a(r0, r15)     // Catch: java.lang.Throwable -> L247
            r13 = r12
            r12 = r4
            goto L263
        L247:
            r0 = move-exception
        L248:
            r13 = r12
            goto L22b
        L24a:
            r0 = move-exception
        L24b:
            r15 = 1
            goto L248
        L24d:
            r0 = move-exception
            r14 = r24
            goto L24b
        L251:
            r0 = move-exception
            r14 = r24
            goto L22a
        L255:
            r0 = move-exception
            r14 = r24
            r15 = 1
            goto L269
        L25a:
            r0 = move-exception
            r14 = r24
            r15 = 1
            r8 = 0
            goto L269
        L260:
            r14 = r24
            r15 = 1
        L263:
            r4 = r19
            r3 = r20
            goto L11d
        L269:
            r0.getMessage()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> L27b java.util.zip.ZipException -> L285
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> L27b java.util.zip.ZipException -> L285
            if (r8 == 0) goto L263
            boolean r0 = r8.exists()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> L27b java.util.zip.ZipException -> L285
            if (r0 == 0) goto L263
            r8.delete()     // Catch: java.lang.Throwable -> Le8 java.io.EOFException -> L27b java.util.zip.ZipException -> L285
            goto L263
        L27b:
            r8 = r26
            r4 = r3
            r3 = r6
            r5 = r7
            r2 = r9
            r9 = r10
            r6 = r14
            goto L1c2
        L285:
            r8 = r26
            r4 = r3
            r3 = r6
            r5 = r7
            r2 = r9
            r9 = r10
            r6 = r14
            goto L1cf
        L28f:
            r10.close()
            if (r12 == 0) goto L297
            r12.close()
        L297:
            if (r13 == 0) goto L382
            r13.close()
            return
        L29d:
            r0 = move-exception
            r9 = r10
            goto L2d
        L2a1:
            r2 = r22
            r4 = r23
            r8 = r26
            r3 = r6
            r5 = r7
            r9 = r10
            r12 = 0
            r13 = 0
            goto L1c0
        L2ae:
            r2 = r22
            r4 = r23
            r8 = r26
            r3 = r6
            r5 = r7
            r9 = r10
            r12 = 0
            r13 = 0
            goto L1cd
        L2bb:
            r0 = move-exception
            r9 = r22
            r3 = r23
            r14 = r24
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r4.<init>()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r4.append(r10)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r5 = "--"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r4.append(r0)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            throw r2     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
        L2e0:
            r9 = r22
            r3 = r23
            r14 = r24
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r2.<init>()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r2.append(r10)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r4 = "--file not exists after copy"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            throw r0     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
        L2fd:
            r9 = r22
            r3 = r23
            r14 = r24
            goto L3a
        L305:
            r9 = r22
            r3 = r23
            r14 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r0.<init>()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r0.append(r10)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r2 = "--backupFile not exists"
            r0.append(r2)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            throw r2     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
        L322:
            r9 = r22
            r3 = r23
            r14 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r0.<init>()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r0.append(r10)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r2 = "--backupDir not exists"
            r0.append(r2)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
            throw r2     // Catch: java.lang.Throwable -> L2b java.util.zip.ZipException -> L3a java.io.EOFException -> L33f
        L33f:
            r8 = r26
            r4 = r3
            r3 = r6
            r5 = r7
            r2 = r9
            r6 = r14
            r9 = 0
            r12 = 0
            r13 = 0
            goto L1c2
        L34b:
            a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35e
            if (r9 == 0) goto L353
            r9.close()
        L353:
            if (r12 == 0) goto L358
            r12.close()
        L358:
            if (r13 == 0) goto L382
            r13.close()
            return
        L35e:
            r0 = move-exception
            goto Lea
        L361:
            r1 = r21
            r2 = r22
            r4 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = 0
            r12 = 0
            r13 = 0
        L370:
            a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35e
            if (r9 == 0) goto L378
            r9.close()
        L378:
            if (r12 == 0) goto L37d
            r12.close()
        L37d:
            if (r13 == 0) goto L382
            r13.close()
        L382:
            return
        L383:
            if (r9 == 0) goto L388
            r9.close()
        L388:
            if (r16 == 0) goto L38d
            r16.close()
        L38d:
            if (r13 == 0) goto L392
            r13.close()
        L392:
            throw r0
    }

    private synchronized boolean a(com.baidu.liantian.core.ApkInfo r8) {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            if (r8 == 0) goto L3ae
            java.lang.String r1 = r8.pkgPath     // Catch: java.lang.Throwable -> L2a
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto Le
            goto L3ae
        Le:
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r7.f5983h     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r8.pkgPath     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2a
            com.baidu.liantian.core.ApkInfo r1 = (com.baidu.liantian.core.ApkInfo) r1     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            if (r1 == 0) goto L32
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r8.versionName     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2d
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r7)
            return r2
        L2a:
            r8 = move-exception
            goto L3ac
        L2d:
            java.lang.String r1 = r8.pkgPath     // Catch: java.lang.Throwable -> L2a
            r7.a(r1)     // Catch: java.lang.Throwable -> L2a
        L32:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r8.pkgPath     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            boolean r1 = com.baidu.liantian.b.e.a(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L73
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2a
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "0"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "1"
            int r3 = r8.key     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2a
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "2"
            java.lang.String r8 = r8.versionName     // Catch: java.lang.Throwable -> L2a
            r1.put(r2, r8)     // Catch: java.lang.Throwable -> L2a
            android.app.Application r8 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L2a
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "1003117"
            com.baidu.liantian.b.e.a(r8, r2, r1)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r7)
            return r0
        L73:
            android.app.Application r1 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L127
            r8.hostContext = r1     // Catch: java.lang.Throwable -> L127
            int r1 = r8.apkParseSuc     // Catch: java.lang.Throwable -> L127
            if (r1 != r2) goto L12a
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = r8.packageName     // Catch: java.lang.Throwable -> L11d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L11d
            if (r1 != 0) goto L115
            java.lang.String r1 = r8.pkgPath     // Catch: java.lang.Throwable -> L11d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L11d
            if (r1 != 0) goto L115
            android.app.Application r1 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L11d
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L11d
            java.lang.String r1 = r1.getCanonicalPath()     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r3.<init>()     // Catch: java.lang.Throwable -> L11d
            r3.append(r1)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r1 = "/.liantian_"
            r3.append(r1)     // Catch: java.lang.Throwable -> L11d
            int r1 = r8.key     // Catch: java.lang.Throwable -> L11d
            r3.append(r1)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L11d
            r8.dataDir = r1     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r1.<init>()     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = r8.dataDir     // Catch: java.lang.Throwable -> L11d
            r1.append(r3)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = "/dex"
            r1.append(r3)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r3.<init>()     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = r8.dataDir     // Catch: java.lang.Throwable -> L11d
            r3.append(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = "/lib/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = r7.f5981c     // Catch: java.lang.Throwable -> L11d
            r3.append(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11d
            java.util.Random r4 = com.baidu.liantian.core.g.f5980g     // Catch: java.lang.Throwable -> L11d
            int r4 = r4.nextInt()     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r5.<init>()     // Catch: java.lang.Throwable -> L11d
            r5.append(r3)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch: java.lang.Throwable -> L11d
            r5.append(r4)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L11d
            e(r1)     // Catch: java.lang.Throwable -> L11d
            com.baidu.liantian.b.e.a(r1, r0)     // Catch: java.lang.Throwable -> L11d
            e(r3)     // Catch: java.lang.Throwable -> L11d
            r7.a(r8, r3, r1)     // Catch: java.lang.Throwable -> L11d
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r7.f5983h     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = r8.pkgPath     // Catch: java.lang.Throwable -> L11d
            r1.put(r3, r8)     // Catch: java.lang.Throwable -> L11d
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r7.a     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = r8.packageName     // Catch: java.lang.Throwable -> L11d
            r1.put(r3, r8)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r1 = r8.className     // Catch: java.lang.Throwable -> L11d
            a(r8, r1)     // Catch: java.lang.Throwable -> L11d
            goto L12a
        L115:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L11d
            java.lang.String r3 = "packageName or pkgPath miss"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L11d
            throw r1     // Catch: java.lang.Throwable -> L11d
        L11d:
            java.lang.String r1 = r8.pkgPath     // Catch: java.lang.Throwable -> L127
            r7.a(r1)     // Catch: java.lang.Throwable -> L127
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L127
            r1 = 1
            goto L12b
        L127:
            r1 = move-exception
            goto L31c
        L12a:
            r1 = 0
        L12b:
            int r3 = r8.apkParseSuc     // Catch: java.lang.Throwable -> L127
            if (r3 != r2) goto L131
            if (r1 == 0) goto L30a
        L131:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L127
            android.content.pm.PackageInfo r1 = r8.cloudPkgInfo     // Catch: java.lang.Throwable -> L127
            if (r1 == 0) goto L14c
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L14c
            java.lang.String r3 = r1.versionName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L14c
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L127
            goto L187
        L14c:
            android.app.Application r1 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L127
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r8.pkgPath     // Catch: java.lang.Throwable -> L127
            android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r3, r2)     // Catch: java.lang.Throwable -> L127
            if (r1 == 0) goto L16a
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L16a
            java.lang.String r3 = r1.versionName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 == 0) goto L187
        L16a:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = r8.packageName     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r8.apkMD5     // Catch: java.lang.Throwable -> L127
            android.content.pm.PackageInfo r1 = a(r1, r3)     // Catch: java.lang.Throwable -> L127
            if (r1 == 0) goto L314
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L314
            java.lang.String r3 = r1.versionName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L314
        L187:
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L30c
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "com.baidu.liantian"
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L127
            if (r3 == 0) goto L30c
            int r3 = r8.apkParseSuc     // Catch: java.lang.Throwable -> L127
            if (r3 == r2) goto L269
            int r3 = r8.initStatus     // Catch: java.lang.Throwable -> L127
            if (r3 == r2) goto L269
            java.lang.String r3 = r8.apkMD5     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r8.pkgPath     // Catch: java.lang.Throwable -> L127
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            if (r5 != 0) goto L1f3
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L127
            if (r5 == 0) goto L1b2
            goto L1f3
        L1b2:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L127
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L127
            boolean r4 = com.baidu.liantian.b.e.a(r5)     // Catch: java.lang.Throwable -> L127
            if (r4 != 0) goto L1c7
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = ""
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L127
            goto L1fc
        L1c7:
            java.lang.String r4 = com.baidu.liantian.b.o.a(r5)     // Catch: java.lang.Throwable -> L127
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L127
            if (r5 == 0) goto L1db
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = ""
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L127
            goto L1fc
        L1db:
            boolean r3 = r4.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto L1e9
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L127
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L127
            goto L1fc
        L1e9:
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = ""
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L127
            goto L1fc
        L1f3:
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = ""
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L127
        L1fc:
            java.lang.Object r4 = r3.first     // Catch: java.lang.Throwable -> L127
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L127
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L127
            java.lang.Object r4 = r3.first     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L127
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L127
            if (r4 != 0) goto L269
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L127
            r2.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "0"
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L127
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "1"
            int r5 = r8.key     // Catch: java.lang.Throwable -> L127
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L127
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "2"
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> L127
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = "3"
            java.lang.Object r3 = r3.second     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L127
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "\n"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "\t"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "\r"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: java.lang.Throwable -> L127
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L127
            android.app.Application r1 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L127
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L127
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = "1003117"
            com.baidu.liantian.b.e.a(r1, r3, r2)     // Catch: java.lang.Throwable -> L127
            monitor-exit(r7)
            return r0
        L269:
            java.lang.String r3 = r1.packageName     // Catch: java.lang.Throwable -> L127
            r8.packageName = r3     // Catch: java.lang.Throwable -> L127
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L127
            android.content.pm.ApplicationInfo r3 = r1.applicationInfo     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r3.className     // Catch: java.lang.Throwable -> L127
            r8.className = r4     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r1.versionName     // Catch: java.lang.Throwable -> L127
            r8.versionName = r4     // Catch: java.lang.Throwable -> L127
            android.content.pm.ActivityInfo[] r4 = r1.activities     // Catch: java.lang.Throwable -> L127
            r8.activities = r4     // Catch: java.lang.Throwable -> L127
            int r3 = r3.theme     // Catch: java.lang.Throwable -> L127
            r8.applicationTheme = r3     // Catch: java.lang.Throwable -> L127
            android.app.Application r3 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L127
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r4.<init>()     // Catch: java.lang.Throwable -> L127
            r4.append(r3)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = "/.liantian_"
            r4.append(r3)     // Catch: java.lang.Throwable -> L127
            int r3 = r8.key     // Catch: java.lang.Throwable -> L127
            r4.append(r3)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L127
            r8.dataDir = r3     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r3.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r8.dataDir     // Catch: java.lang.Throwable -> L127
            r3.append(r4)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "/dex"
            r3.append(r4)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r4.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = r8.dataDir     // Catch: java.lang.Throwable -> L127
            r4.append(r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = "/lib/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r5 = r7.f5981c     // Catch: java.lang.Throwable -> L127
            r4.append(r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L127
            java.util.Random r5 = com.baidu.liantian.core.g.f5980g     // Catch: java.lang.Throwable -> L127
            int r5 = r5.nextInt()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r6.<init>()     // Catch: java.lang.Throwable -> L127
            r6.append(r4)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "/"
            r6.append(r4)     // Catch: java.lang.Throwable -> L127
            r6.append(r5)     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L127
            e(r3)     // Catch: java.lang.Throwable -> L127
            com.baidu.liantian.b.e.a(r3, r0)     // Catch: java.lang.Throwable -> L127
            e(r4)     // Catch: java.lang.Throwable -> L127
            r7.a(r8, r4, r3)     // Catch: java.lang.Throwable -> L127
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r3 = r7.f5983h     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r8.pkgPath     // Catch: java.lang.Throwable -> L127
            r3.put(r4, r8)     // Catch: java.lang.Throwable -> L127
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r3 = r7.a     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r8.packageName     // Catch: java.lang.Throwable -> L127
            r3.put(r4, r8)     // Catch: java.lang.Throwable -> L127
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = r1.className     // Catch: java.lang.Throwable -> L127
            a(r8, r1)     // Catch: java.lang.Throwable -> L127
        L30a:
            monitor-exit(r7)
            return r2
        L30c:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L127
            java.lang.String r2 = "package name check failed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L127
            throw r1     // Catch: java.lang.Throwable -> L127
        L314:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L127
            java.lang.String r2 = "requestCloudPackageInfo failed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L127
            throw r1     // Catch: java.lang.Throwable -> L127
        L31c:
            r1.getMessage()     // Catch: java.lang.Throwable -> L3a7
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r2 = r8.pkgPath     // Catch: java.lang.Throwable -> L3a7
            r7.a(r2)     // Catch: java.lang.Throwable -> L3a7
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3a7
            r2.<init>()     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r1 = com.baidu.liantian.b.a(r1)     // Catch: java.lang.Throwable -> L3a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a7
            r3.<init>()     // Catch: java.lang.Throwable -> L3a7
            r3.append(r1)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r1 = "\r\n isUpgrade="
            r3.append(r1)     // Catch: java.lang.Throwable -> L3a7
            boolean r1 = r7.f5982d     // Catch: java.lang.Throwable -> L3a7
            r3.append(r1)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r3 = "space left"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L3a7
            if (r3 == 0) goto L356
            android.app.Application r3 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r4 = r8.packageName     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r1 = com.baidu.liantian.b.i.a(r3, r1, r4)     // Catch: java.lang.Throwable -> L3a7
        L356:
            java.lang.String r3 = "0"
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3a7
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r3 = "1"
            int r4 = r8.key     // Catch: java.lang.Throwable -> L3a7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3a7
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r3 = "2"
            java.lang.String r8 = r8.versionName     // Catch: java.lang.Throwable -> L3a7
            r2.put(r3, r8)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r8 = "3"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r3 = "\n"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replace(r3, r4)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r3 = "\t"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replace(r3, r4)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r3 = "\r"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replace(r3, r4)     // Catch: java.lang.Throwable -> L3a7
            r2.put(r8, r1)     // Catch: java.lang.Throwable -> L3a7
            android.app.Application r8 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L3a7
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L3a7
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)     // Catch: java.lang.Throwable -> L3a7
            java.lang.String r1 = "1003117"
            com.baidu.liantian.b.e.a(r8, r1, r2)     // Catch: java.lang.Throwable -> L3a7
            goto L3aa
        L3a7:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L2a
        L3aa:
            monitor-exit(r7)
            return r0
        L3ac:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            throw r8
        L3ae:
            monitor-exit(r7)
            return r0
    }

    private static boolean a(com.baidu.liantian.core.ApkInfo r2, java.lang.String r3) {
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L27
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.ClassLoader r2 = r2.classLoader     // Catch: java.lang.Throwable -> L27
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L27
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L27
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            android.app.Application r0 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L27
            com.baidu.liantian.f.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L27
            android.app.Application r3 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L27
            a(r2, r3)     // Catch: java.lang.Throwable -> L27
            r2.onCreate()     // Catch: java.lang.Throwable -> L27
            return r1
        L27:
            r2 = move-exception
            r2.getMessage()
            com.baidu.liantian.b.b()
            r2 = 0
            return r2
    }

    private static boolean e(java.lang.String r1) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L14
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L14
            r0.delete()     // Catch: java.lang.Throwable -> L1f
        L14:
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1d
            r0.mkdirs()     // Catch: java.lang.Throwable -> L1f
        L1d:
            r1 = 1
            return r1
        L1f:
            r1 = move-exception
            r1.toString()
            r1 = 0
            return r1
    }

    public final synchronized void a(com.baidu.liantian.core.h r5) {
            r4 = this;
            monitor-enter(r4)
            android.content.IntentFilter r0 = r5.f5987d     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r4.a     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.core.ApkInfo r0 = (com.baidu.liantian.core.ApkInfo) r0     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L90
            java.util.List<com.baidu.liantian.core.h> r1 = r0.intentFilters     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r1.<init>()     // Catch: java.lang.Throwable -> L92
            r0.intentFilters = r1     // Catch: java.lang.Throwable -> L92
        L1e:
            r1 = 0
        L1f:
            java.util.List<com.baidu.liantian.core.h> r2 = r0.intentFilters     // Catch: java.lang.Throwable -> L92
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L92
            if (r1 >= r2) goto L3a
            java.util.List<com.baidu.liantian.core.h> r2 = r0.intentFilters     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.core.h r2 = (com.baidu.liantian.core.h) r2     // Catch: java.lang.Throwable -> L92
            boolean r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L37
            monitor-exit(r4)
            return
        L37:
            int r1 = r1 + 1
            goto L1f
        L3a:
            java.util.List<com.baidu.liantian.core.h> r0 = r0.intentFilters     // Catch: java.lang.Throwable -> L92
            r0.add(r5)     // Catch: java.lang.Throwable -> L92
            android.content.IntentFilter r0 = r5.f5987d     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L92
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L92
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto L8e
            java.lang.String r1 = "____"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L57
            goto L8e
        L57:
            java.util.Map<java.lang.String, com.baidu.liantian.LiantianReceiver> r1 = r4.f5984i     // Catch: java.lang.Throwable -> L92
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L92
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto L90
            java.lang.String r1 = "android.intent.action.PACKAGE_REMOVED__package"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto L90
            com.baidu.liantian.LiantianReceiver r1 = new com.baidu.liantian.LiantianReceiver     // Catch: java.lang.Throwable -> L92
            r1.<init>()     // Catch: java.lang.Throwable -> L92
            android.app.Application r2 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L78
            android.content.IntentFilter r3 = r5.f5987d     // Catch: java.lang.Throwable -> L78
            r2.registerReceiver(r1, r3)     // Catch: java.lang.Throwable -> L78
            goto L88
        L78:
            r2 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L7e java.lang.Throwable -> L92
            goto L81
        L7e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L92
        L81:
            android.app.Application r2 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> L92
            android.content.IntentFilter r5 = r5.f5987d     // Catch: java.lang.Throwable -> L92
            r2.registerReceiver(r1, r5)     // Catch: java.lang.Throwable -> L92
        L88:
            java.util.Map<java.lang.String, com.baidu.liantian.LiantianReceiver> r5 = r4.f5984i     // Catch: java.lang.Throwable -> L92
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L92
            goto L90
        L8e:
            monitor-exit(r4)
            return
        L90:
            monitor-exit(r4)
            return
        L92:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L97
            monitor-exit(r4)
            return
        L97:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L97
            throw r5
    }

    public final boolean a(com.baidu.liantian.core.ApkInfo r1, boolean r2) {
            r0 = this;
            java.lang.System.currentTimeMillis()
            r0.f5982d = r2
            java.lang.String r2 = r1.versionName
            r0.f5981c = r2
            boolean r1 = r0.a(r1)
            java.lang.System.currentTimeMillis()
            com.baidu.liantian.b.a()
            return r1
    }

    public final boolean a(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r2.f5983h
            java.lang.Object r0 = r0.get(r3)
            com.baidu.liantian.core.ApkInfo r0 = (com.baidu.liantian.core.ApkInfo) r0
            if (r0 == 0) goto L2e
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r2.f5983h
            r1.remove(r3)
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r3 = r2.a
            java.lang.String r1 = r0.packageName
            r3.remove(r1)
            java.lang.String r3 = r0.dataDir
            com.baidu.liantian.b.e.d(r3)
            android.app.Application r3 = com.baidu.liantian.core.g.f5979f
            if (r3 == 0) goto L2c
            java.lang.String r0 = r0.packageName
            java.io.File r3 = r3.getFileStreamPath(r0)
            java.lang.String r3 = r3.getAbsolutePath()
            com.baidu.liantian.b.e.d(r3)
        L2c:
            r3 = 1
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public final java.util.List<com.baidu.liantian.core.ApkInfo> b() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r4.a     // Catch: java.lang.Throwable -> L26
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L26
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L26
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r3 = r4.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L26
            r0.add(r2)     // Catch: java.lang.Throwable -> L26
            goto Lf
        L25:
            return r0
        L26:
            com.baidu.liantian.b.e.a()
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            return r0
        L2f:
            com.baidu.liantian.b.e.a()
            r0 = 0
            return r0
    }

    public final synchronized void b(com.baidu.liantian.core.h r5) {
            r4 = this;
            monitor-enter(r4)
            android.content.IntentFilter r0 = r5.f5987d     // Catch: java.lang.Throwable -> Le2
            if (r0 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r4.a     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Le2
            com.baidu.liantian.core.ApkInfo r0 = (com.baidu.liantian.core.ApkInfo) r0     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto L6a
            java.util.List<com.baidu.liantian.core.h> r1 = r0.intentFilters     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L6a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le2
            r1.<init>()     // Catch: java.lang.Throwable -> Le2
            r2 = 0
        L1d:
            java.util.List<com.baidu.liantian.core.h> r3 = r0.intentFilters     // Catch: java.lang.Throwable -> Le2
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Le2
            if (r2 >= r3) goto L3d
            java.util.List<com.baidu.liantian.core.h> r3 = r0.intentFilters     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Le2
            com.baidu.liantian.core.h r3 = (com.baidu.liantian.core.h) r3     // Catch: java.lang.Throwable -> Le2
            boolean r3 = r5.a(r3)     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto L3a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Le2
            r1.add(r3)     // Catch: java.lang.Throwable -> Le2
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le2
        L41:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Le2
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Le2
            java.util.List<com.baidu.liantian.core.h> r3 = r0.intentFilters     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto L41
            r3.remove(r2)     // Catch: java.lang.Throwable -> L59
            goto L41
        L59:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Le2
            goto L41
        L5d:
            java.util.List<com.baidu.liantian.core.h> r1 = r0.intentFilters     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L6a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto L6a
            r1 = 0
            r0.intentFilters = r1     // Catch: java.lang.Throwable -> Le2
        L6a:
            android.content.IntentFilter r5 = r5.f5987d     // Catch: java.lang.Throwable -> Le2
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> Le2
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le2
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le2
            if (r0 != 0) goto Le0
            java.lang.String r0 = "android.intent.action.PACKAGE_REMOVED__package"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto L82
            goto Le0
        L82:
            java.util.List r0 = r4.b()     // Catch: java.lang.Throwable -> Le2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le2
        L8a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Le2
            com.baidu.liantian.core.ApkInfo r1 = (com.baidu.liantian.core.ApkInfo) r1     // Catch: java.lang.Throwable -> Le2
            java.util.List<com.baidu.liantian.core.h> r2 = r1.intentFilters     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L8a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le2
            if (r2 <= 0) goto L8a
            java.util.List<com.baidu.liantian.core.h> r1 = r1.intentFilters     // Catch: java.lang.Throwable -> Le2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le2
        La6:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le2
            com.baidu.liantian.core.h r2 = (com.baidu.liantian.core.h) r2     // Catch: java.lang.Throwable -> Le2
            android.content.IntentFilter r2 = r2.f5987d     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> Le2
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Le2
            if (r3 != 0) goto La6
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto La6
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r4)
            return
        Lc9:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Le2
            java.util.Map<java.lang.String, com.baidu.liantian.LiantianReceiver> r0 = r4.f5984i     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Le2
            com.baidu.liantian.LiantianReceiver r0 = (com.baidu.liantian.LiantianReceiver) r0     // Catch: java.lang.Throwable -> Le2
            android.app.Application r1 = com.baidu.liantian.core.g.f5979f     // Catch: java.lang.Throwable -> Le2
            r1.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> Le2
            java.util.Map<java.lang.String, com.baidu.liantian.LiantianReceiver> r0 = r4.f5984i     // Catch: java.lang.Throwable -> Le2
            r0.remove(r5)     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r4)
            return
        Le0:
            monitor-exit(r4)
            return
        Le2:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r4)
            return
        Le7:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le7
            throw r5
    }

    public final boolean b(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r3.a
            java.lang.Object r0 = r0.get(r4)
            com.baidu.liantian.core.ApkInfo r0 = (com.baidu.liantian.core.ApkInfo) r0
            if (r0 == 0) goto L3e
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r3.f5983h
            java.lang.String r2 = r0.pkgPath
            r1.remove(r2)
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r1 = r3.a
            r1.remove(r4)
            java.lang.String r4 = r0.dataDir
            com.baidu.liantian.b.e.d(r4)
            android.app.Application r4 = com.baidu.liantian.core.g.f5979f
            if (r4 == 0) goto L2c
            java.lang.String r0 = r0.packageName
            java.io.File r4 = r4.getFileStreamPath(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            com.baidu.liantian.b.e.d(r4)
        L2c:
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r4 = r3.f5983h
            r4.size()
            com.baidu.liantian.b.a()
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r4 = r3.a
            r4.size()
            com.baidu.liantian.b.a()
            r4 = 1
            return r4
        L3e:
            r4 = 0
            return r4
    }

    public final com.baidu.liantian.core.ApkInfo c(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r1.f5983h     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
            com.baidu.liantian.core.ApkInfo r2 = (com.baidu.liantian.core.ApkInfo) r2     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            com.baidu.liantian.b.e.a()
            r2 = 0
            return r2
    }

    public final com.baidu.liantian.core.ApkInfo d(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.baidu.liantian.core.ApkInfo> r0 = r1.a     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
            com.baidu.liantian.core.ApkInfo r2 = (com.baidu.liantian.core.ApkInfo) r2     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            com.baidu.liantian.b.e.a()
            r2 = 0
            return r2
    }
}
