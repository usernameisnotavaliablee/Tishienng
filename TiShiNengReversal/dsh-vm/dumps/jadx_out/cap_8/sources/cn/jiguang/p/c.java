package cn.jiguang.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static final java.lang.Object a = null;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, cn.jiguang.n.c> f1392b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.p.c.a = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Bundle a(java.util.HashMap<java.lang.String, java.lang.String> r4) {
            if (r4 == 0) goto L2d
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L2d
        L9:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.putString(r2, r3)
            goto L16
        L2c:
            return r0
        L2d:
            r4 = 0
            return r4
    }

    public static cn.jiguang.n.c a(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L13
            r0 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r0)     // Catch: java.lang.Throwable -> L13
            cn.jiguang.n.c r0 = new cn.jiguang.n.c     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = ""
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L13
            r0.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "getWakeTarget throwable:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JWakeHelper"
            cn.jiguang.w.f.i(r3, r2)
            r2 = 0
            return r2
    }

    public static java.lang.String a(java.util.List<cn.jiguang.n.c> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L30
            java.lang.Object r2 = r4.get(r1)
            cn.jiguang.n.c r2 = (cn.jiguang.n.c) r2
            java.lang.String r2 = r2.a
            java.lang.Object r3 = r4.get(r1)
            cn.jiguang.n.c r3 = (cn.jiguang.n.c) r3
            java.lang.String r3 = r3.f1342b
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "$"
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L30:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.util.HashMap<java.lang.String, cn.jiguang.n.c> a(android.content.Context r10) {
            java.lang.String r0 = "JWakeHelper"
            r1 = 0
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L7e
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L7e
            r4.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "cn.jpush.android.intent.DaemonService"
            r4.setAction(r5)     // Catch: java.lang.Throwable -> L7e
            r5 = 0
            java.util.List r4 = r3.queryIntentServices(r4, r5)     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L84
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L24
            goto L84
        L24:
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L7e
            if (r5 >= r6) goto L83
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> L7e
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6     // Catch: java.lang.Throwable -> L7e
            android.content.pm.ServiceInfo r6 = r6.serviceInfo     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = r6.name     // Catch: java.lang.Throwable -> L7e
            java.lang.String r8 = r6.packageName     // Catch: java.lang.Throwable -> L7e
            if (r7 == 0) goto L80
            if (r8 == 0) goto L80
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7e
            if (r9 != 0) goto L80
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L7e
            if (r9 == 0) goto L47
            goto L80
        L47:
            boolean r9 = r6.exported     // Catch: java.lang.Throwable -> L7e
            if (r9 == 0) goto L80
            boolean r6 = r6.enabled     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            java.lang.String r6 = r10.getPackageName()     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L80
            cn.jiguang.n.c r6 = cn.jiguang.p.a.a(r10, r3, r8, r7)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r7.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r8 = "wakeTarget:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L7e
            r7.append(r8)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L7e
            cn.jiguang.w.f.c(r0, r7)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = r6.a     // Catch: java.lang.Throwable -> L7e
            r2.put(r7, r6)     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r10 = move-exception
            goto L85
        L80:
            int r5 = r5 + 1
            goto L24
        L83:
            return r2
        L84:
            return r1
        L85:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getWakeTargetMap throwable:"
            r2.append(r3)
            java.lang.String r10 = r10.getMessage()
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            cn.jiguang.w.f.i(r0, r10)
            return r1
    }

    public static java.util.HashMap<java.lang.String, cn.jiguang.n.c> a(android.content.Context r10, java.util.HashMap<java.lang.String, cn.jiguang.n.c> r11) {
            java.lang.String r0 = "JWakeHelper"
            r1 = 0
            java.util.HashMap<java.lang.String, cn.jiguang.n.c> r2 = cn.jiguang.p.c.f1392b     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L13
            java.util.HashMap<java.lang.String, cn.jiguang.n.c> r10 = cn.jiguang.p.c.f1392b     // Catch: java.lang.Throwable -> L10
            return r10
        L10:
            r10 = move-exception
            goto Lee
        L13:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10
            r2.<init>()     // Catch: java.lang.Throwable -> L10
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L10
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L10
            r4.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = "cn.jpush.android.intent.PushService"
            r4.setAction(r5)     // Catch: java.lang.Throwable -> L10
            r5 = 0
            java.util.List r4 = r3.queryIntentServices(r4, r5)     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto Led
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L35
            goto Led
        L35:
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L10
            if (r5 >= r6) goto Ld2
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> L10
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6     // Catch: java.lang.Throwable -> L10
            android.content.pm.ServiceInfo r6 = r6.serviceInfo     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r6.name     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto Lce
            if (r6 == 0) goto Lce
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto Lce
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto L59
            goto Lce
        L59:
            if (r11 == 0) goto L62
            boolean r7 = r11.containsKey(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto L62
            goto Lce
        L62:
            java.lang.String r7 = r10.getPackageName()     // Catch: java.lang.Throwable -> L10
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto Lce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r7.<init>()     // Catch: java.lang.Throwable -> L10
            r7.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = ".permission.JPUSH_MESSAGE"
            r7.append(r8)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L10
            int r7 = r3.checkPermission(r7, r6)     // Catch: java.lang.Throwable -> L10
            r8 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r8 = r3.getApplicationInfo(r6, r8)     // Catch: java.lang.Throwable -> L10
            if (r8 == 0) goto Lce
            android.os.Bundle r9 = r8.metaData     // Catch: java.lang.Throwable -> L10
            if (r9 == 0) goto Lce
            java.lang.String r9 = cn.jiguang.v.a.a(r10)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto Lce
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto Lce
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L10
            r9 = 24
            if (r7 != r9) goto Lce
            java.lang.String r7 = r10.getPackageName()     // Catch: java.lang.Throwable -> L10
            java.lang.String r9 = r8.packageName     // Catch: java.lang.Throwable -> L10
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto Lce
            cn.jiguang.n.c r7 = new cn.jiguang.n.c     // Catch: java.lang.Throwable -> L10
            java.lang.String r9 = ""
            int r8 = r8.targetSdkVersion     // Catch: java.lang.Throwable -> L10
            r7.<init>(r6, r9, r8)     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r8.<init>()     // Catch: java.lang.Throwable -> L10
            r8.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = ".DownloadProvider"
            r8.append(r6)     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L10
            r7.f1344d = r6     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = r7.a     // Catch: java.lang.Throwable -> L10
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> L10
        Lce:
            int r5 = r5 + 1
            goto L35
        Ld2:
            cn.jiguang.p.c.f1392b = r2     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r10.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r11 = "getWakeAppListWithoutDService:"
            r10.append(r11)     // Catch: java.lang.Throwable -> L10
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L10
            r10.append(r11)     // Catch: java.lang.Throwable -> L10
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L10
            cn.jiguang.w.f.c(r0, r10)     // Catch: java.lang.Throwable -> L10
            return r2
        Led:
            return r1
        Lee:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "getWakeAppListWithoutDService throwable:"
            r11.append(r2)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.i(r0, r10)
            return r1
    }

    public static java.util.List<cn.jiguang.n.c> a(android.content.Context r4, java.util.List<cn.jiguang.n.c> r5) {
            if (r5 == 0) goto L30
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L30
        L9:
            r0 = 0
        La:
            int r1 = r5.size()
            if (r0 >= r1) goto L2f
            java.lang.Object r1 = r5.get(r0)     // Catch: java.lang.Throwable -> L2c
            cn.jiguang.n.c r1 = (cn.jiguang.n.c) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L2c
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L2c
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r5.get(r0)     // Catch: java.lang.Throwable -> L2c
            cn.jiguang.n.c r2 = (cn.jiguang.n.c) r2     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L2c
            r2.f1343c = r1     // Catch: java.lang.Throwable -> L2c
        L2c:
            int r0 = r0 + 1
            goto La
        L2f:
            return r5
        L30:
            r4 = 0
            return r4
    }

    public static java.util.List<java.lang.String> a(cn.jiguang.n.a r0, java.util.List<java.lang.String> r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.util.List r1 = b(r0, r1)
            java.util.List r0 = c(r0, r1)
            return r0
    }

    public static java.util.List<cn.jiguang.n.c> a(java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            java.lang.String r0 = "\\$"
            java.lang.String[] r8 = r8.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L54
            r4 = r8[r3]
            java.lang.String r5 = "\\|"
            java.lang.String[] r5 = r4.split(r5)
            int r6 = r5.length
            r7 = 2
            if (r6 >= r7) goto L3b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "split.length < 2, data:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JWakeHelper"
            cn.jiguang.w.f.c(r5, r4)
            goto L51
        L3b:
            r4 = r5[r2]
            r6 = 1
            r5 = r5[r6]
            cn.jiguang.n.c r7 = new cn.jiguang.n.c
            r7.<init>()
            r7.a = r4
            r7.f1342b = r5
            r7.f1350j = r6
            r4 = 4
            r7.f1347g = r4
            r0.add(r7)
        L51:
            int r3 = r3 + 1
            goto L16
        L54:
            return r0
    }

    private static java.util.List<java.lang.String> a(java.util.List<java.lang.String> r1, java.util.List<java.lang.String> r2) {
            r0 = 0
            java.util.List r1 = a(r1, r2, r0)
            return r1
    }

    private static java.util.List<java.lang.String> a(java.util.List<java.lang.String> r5, java.util.List<java.lang.String> r6, boolean r7) {
            if (r5 == 0) goto L6e
            int r0 = r5.size()
            if (r0 != 0) goto L9
            goto L6e
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r5.contains(r1)
            java.lang.String r3 = "JWakeHelper"
            if (r2 == 0) goto L53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            if (r7 == 0) goto L40
            r2.<init>()
            r2.append(r1)
            java.lang.String r4 = " in the white list"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r3, r2)
            r0.add(r1)
            goto L53
        L40:
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " in the black list"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.c(r3, r1)
            goto L12
        L53:
            if (r7 != 0) goto L12
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r4 = " not in the global black list"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r3, r2)
            r0.add(r1)
            goto L12
        L6d:
            return r0
        L6e:
            return r6
    }

    private static org.json.JSONArray a(android.content.Context r25, org.json.JSONArray r26) {
            r0 = r26
            r1 = 103(0x67, float:1.44E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 102(0x66, float:1.43E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 101(0x65, float:1.42E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "JWakeHelper"
            java.lang.String r5 = "_"
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L36a
            int r9 = r0.length()     // Catch: java.lang.Throwable -> L64
            if (r9 > 0) goto L27
            goto L36a
        L27:
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r11 = 0
        L2d:
            int r12 = r0.length()     // Catch: java.lang.Throwable -> L64
            java.lang.String r13 = "itime"
            java.lang.String r14 = "aa3"
            java.lang.String r15 = "type"
            if (r11 >= r12) goto L77
            org.json.JSONObject r12 = r0.getJSONObject(r11)     // Catch: java.lang.Throwable -> L64
            r25 = 1
            java.lang.String r6 = r12.optString(r15)     // Catch: java.lang.Throwable -> L64
            boolean r16 = r14.equals(r6)     // Catch: java.lang.Throwable -> L64
            if (r16 != 0) goto L69
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r12.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r13 = "unkown type :"
            r12.append(r13)     // Catch: java.lang.Throwable -> L64
            r12.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> L64
            cn.jiguang.w.f.i(r4, r6)     // Catch: java.lang.Throwable -> L64
            r6 = r9
            r20 = r11
            r21 = 0
            goto L1c6
        L64:
            r0 = move-exception
            r21 = 0
            goto L351
        L69:
            java.lang.String r6 = "target"
            org.json.JSONArray r6 = r12.optJSONArray(r6)     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L77
            int r16 = r6.length()     // Catch: java.lang.Throwable -> L64
            if (r16 > 0) goto L7c
        L77:
            r6 = r9
            r21 = 0
            goto L1ce
        L7c:
            long r12 = r12.optLong(r13)     // Catch: java.lang.Throwable -> L64
            java.util.Set r14 = r9.entrySet()     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L64
        L88:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r15 == 0) goto Lc1
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L64
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch: java.lang.Throwable -> L64
            java.lang.Object r16 = r15.getKey()     // Catch: java.lang.Throwable -> L64
            java.lang.Long r16 = (java.lang.Long) r16     // Catch: java.lang.Throwable -> L64
            long r16 = r16.longValue()     // Catch: java.lang.Throwable -> L64
            r18 = 1000(0x3e8, double:4.94E-321)
            r20 = r11
            long r10 = r12 * r18
            r22 = r9
            r21 = 0
            long r8 = r16 * r18
            boolean r8 = cn.jiguang.av.x.a(r10, r8)     // Catch: java.lang.Throwable -> Lb9
            if (r8 == 0) goto Lbc
            java.lang.Object r8 = r15.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> Lb9
            r12 = r16
            goto Lc9
        Lb9:
            r0 = move-exception
            goto L351
        Lbc:
            r11 = r20
            r9 = r22
            goto L88
        Lc1:
            r22 = r9
            r20 = r11
            r21 = 0
            r8 = r21
        Lc9:
            if (r8 != 0) goto Ld0
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb9
            r8.<init>()     // Catch: java.lang.Throwable -> Lb9
        Ld0:
            r9 = 0
        Ld1:
            int r10 = r6.length()     // Catch: java.lang.Throwable -> Lb9
            if (r9 >= r10) goto L1bd
            org.json.JSONObject r10 = r6.optJSONObject(r9)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r11 = "data"
            org.json.JSONArray r11 = r10.getJSONArray(r11)     // Catch: java.lang.Throwable -> Lb9
            if (r11 == 0) goto Le9
            int r14 = r11.length()     // Catch: java.lang.Throwable -> Lb9
            if (r14 > 0) goto Lef
        Le9:
            r18 = r6
            r19 = r9
            goto L1b5
        Lef:
            java.lang.String r14 = "package"
            java.lang.String r10 = r10.optString(r14)     // Catch: java.lang.Throwable -> Lb9
            r14 = 0
        Lf6:
            int r15 = r11.length()     // Catch: java.lang.Throwable -> Lb9
            if (r14 >= r15) goto Le9
            org.json.JSONObject r15 = r11.getJSONObject(r14)     // Catch: java.lang.Throwable -> Lb9
            if (r15 == 0) goto L1a7
            java.lang.String r0 = "wake_type"
            int r0 = r15.getInt(r0)     // Catch: java.lang.Throwable -> Lb9
            r16 = r0
            java.lang.String r0 = "wake_status"
            int r0 = r15.getInt(r0)     // Catch: java.lang.Throwable -> Lb9
            boolean r15 = r8.containsKey(r10)     // Catch: java.lang.Throwable -> Lb9
            if (r15 == 0) goto L185
            java.lang.Object r15 = r8.get(r10)     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r15 = (java.util.Map) r15     // Catch: java.lang.Throwable -> Lb9
            r17 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r15.containsKey(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L16c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r15.get(r0)     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lb9
            r18 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lb9
            boolean r6 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> Lb9
            if (r6 == 0) goto L15e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lb9
            r19 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r9 = r0.get(r9)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> Lb9
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Lb9
            int r9 = r9 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lb9
            r0.put(r6, r9)     // Catch: java.lang.Throwable -> Lb9
            goto L17c
        L15e:
            r19 = r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lb9
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> Lb9
            goto L17c
        L168:
            r15.put(r6, r0)     // Catch: java.lang.Throwable -> Lb9
            goto L181
        L16c:
            r18 = r6
            r19 = r9
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb9
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lb9
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> Lb9
        L17c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> Lb9
            goto L168
        L181:
            r8.put(r10, r15)     // Catch: java.lang.Throwable -> Lb9
            goto L1ab
        L185:
            r17 = r0
            r18 = r6
            r19 = r9
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb9
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lb9
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb9
            r6.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> Lb9
            r6.put(r9, r0)     // Catch: java.lang.Throwable -> Lb9
            r8.put(r10, r6)     // Catch: java.lang.Throwable -> Lb9
            goto L1ab
        L1a7:
            r18 = r6
            r19 = r9
        L1ab:
            int r14 = r14 + 1
            r0 = r26
            r6 = r18
            r9 = r19
            goto Lf6
        L1b5:
            int r9 = r19 + 1
            r0 = r26
            r6 = r18
            goto Ld1
        L1bd:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Lb9
            r6 = r22
            r6.put(r0, r8)     // Catch: java.lang.Throwable -> Lb9
        L1c6:
            int r11 = r20 + 1
            r0 = r26
            r9 = r6
            r6 = 1
            goto L2d
        L1ce:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb9
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lb9
        L1db:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r8 == 0) goto L349
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb9
            r9.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r10 = r8.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Lb9
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lb9
        L1fa:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r11 == 0) goto L30e
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb9
            r12.<init>()     // Catch: java.lang.Throwable -> Lb9
            r25 = r6
            java.lang.String r6 = "p"
            r16 = r8
            java.lang.Object r8 = r11.getKey()     // Catch: java.lang.Throwable -> Lb9
            r12.put(r6, r8)     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb9
            r6.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r8 = r11.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> Lb9
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lb9
        L22b:
            boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r11 == 0) goto L2ec
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r17 = r11.getKey()     // Catch: java.lang.Throwable -> Lb9
            r18 = r8
            r8 = r17
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Throwable -> Lb9
            boolean r17 = r11.containsKey(r7)     // Catch: java.lang.Throwable -> Lb9
            if (r17 == 0) goto L25e
            java.lang.Object r17 = r11.get(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r17 = (java.lang.Integer) r17     // Catch: java.lang.Throwable -> Lb9
            int r17 = r17.intValue()     // Catch: java.lang.Throwable -> Lb9
            r24 = r17
            r17 = r7
            r7 = r24
            goto L261
        L25e:
            r17 = r7
            r7 = 0
        L261:
            boolean r19 = r11.containsKey(r3)     // Catch: java.lang.Throwable -> Lb9
            if (r19 == 0) goto L278
            java.lang.Object r19 = r11.get(r3)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r19 = (java.lang.Integer) r19     // Catch: java.lang.Throwable -> Lb9
            int r19 = r19.intValue()     // Catch: java.lang.Throwable -> Lb9
            r24 = r19
            r19 = r3
            r3 = r24
            goto L27b
        L278:
            r19 = r3
            r3 = 0
        L27b:
            boolean r20 = r11.containsKey(r2)     // Catch: java.lang.Throwable -> Lb9
            if (r20 == 0) goto L292
            java.lang.Object r20 = r11.get(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r20 = (java.lang.Integer) r20     // Catch: java.lang.Throwable -> Lb9
            int r20 = r20.intValue()     // Catch: java.lang.Throwable -> Lb9
            r24 = r20
            r20 = r2
            r2 = r24
            goto L295
        L292:
            r20 = r2
            r2 = 0
        L295:
            boolean r22 = r11.containsKey(r1)     // Catch: java.lang.Throwable -> Lb9
            if (r22 == 0) goto L2a6
            java.lang.Object r11 = r11.get(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> Lb9
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> Lb9
            goto L2a7
        L2a6:
            r11 = 0
        L2a7:
            int r22 = r7 + r3
            int r22 = r22 + r2
            r23 = r1
            int r1 = r22 + r11
            r22 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r10.<init>()     // Catch: java.lang.Throwable -> Lb9
            r10.append(r8)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r1)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r7)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r3)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r2)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r5)     // Catch: java.lang.Throwable -> Lb9
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> Lb9
            r6.put(r1)     // Catch: java.lang.Throwable -> Lb9
            r7 = r17
            r8 = r18
            r3 = r19
            r2 = r20
            r10 = r22
            r1 = r23
            goto L22b
        L2ec:
            r23 = r1
            r20 = r2
            r19 = r3
            r17 = r7
            r22 = r10
            java.lang.String r1 = "d"
            r12.put(r1, r6)     // Catch: java.lang.Throwable -> Lb9
            r9.put(r12)     // Catch: java.lang.Throwable -> Lb9
            r6 = r25
            r8 = r16
            r7 = r17
            r3 = r19
            r2 = r20
            r10 = r22
            r1 = r23
            goto L1fa
        L30e:
            r23 = r1
            r20 = r2
            r19 = r3
            r25 = r6
            r17 = r7
            r16 = r8
            int r1 = r9.length()     // Catch: java.lang.Throwable -> Lb9
            if (r1 <= 0) goto L33d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb9
            r1.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "t"
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r16.getKey()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Lb9
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> Lb9
            r1.put(r13, r2)     // Catch: java.lang.Throwable -> Lb9
            r1.put(r15, r14)     // Catch: java.lang.Throwable -> Lb9
            r0.put(r1)     // Catch: java.lang.Throwable -> Lb9
        L33d:
            r6 = r25
            r7 = r17
            r3 = r19
            r2 = r20
            r1 = r23
            goto L1db
        L349:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb9
            if (r1 <= 0) goto L350
            return r0
        L350:
            return r26
        L351:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "merge wake json failed:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.f.j(r4, r0)
            return r21
        L36a:
            return r26
    }

    public static void a(android.content.Context r2, cn.jiguang.n.a r3, java.util.List<cn.jiguang.n.b> r4) {
            boolean r3 = r3.w
            java.lang.String r0 = "JWakeHelper"
            if (r3 == 0) goto L23
            org.json.JSONObject r3 = b(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "wake json:"
            r4.append(r1)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.c(r0, r4)
            a(r2, r3)
            return
        L23:
            java.lang.String r2 = "server set do not report wake data,give up save"
            cn.jiguang.w.f.i(r0, r2)
            return
    }

    private static void a(android.content.Context r3, org.json.JSONObject r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "itime"
            long r1 = cn.jiguang.d.b.b(r3)     // Catch: java.lang.Throwable -> L60
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "type"
            java.lang.String r0 = "aa3"
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = cn.jiguang.p.c.a     // Catch: java.lang.Throwable -> L60
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "wake_cache_v2.json"
            org.json.JSONObject r0 = cn.jiguang.av.i.a(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r4 = move-exception
            goto L5e
        L27:
            java.lang.String r1 = "content"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L34
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
        L34:
            r1.put(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "content"
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "wake_cache_v2.json"
            cn.jiguang.av.i.a(r4, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "JWakeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "save wake data : "
            r1.append(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L25
            r1.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L25
            cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            return
        L5e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4     // Catch: java.lang.Throwable -> L60
        L60:
            r3 = move-exception
            java.lang.String r4 = "JWakeHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveWakeData failed:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            cn.jiguang.w.f.i(r4, r3)
            return
    }

    public static java.lang.String b(java.util.HashMap<java.lang.String, java.lang.String> r4) {
            if (r4 == 0) goto L31
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L31
        L9:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.appendQueryParameter(r2, r3)
            goto L16
        L2c:
            java.lang.String r4 = r0.toString()
            return r4
        L31:
            r4 = 0
            return r4
    }

    private static java.util.List<java.lang.String> b(cn.jiguang.n.a r2, java.util.List<java.lang.String> r3) {
            java.lang.String r0 = r2.n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = r2.n
            java.lang.String r1 = "disable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            goto L35
        L13:
            java.util.List<java.lang.String> r0 = r2.o
            java.lang.String r2 = r2.n
            r2.getClass()
            java.lang.String r1 = "exclude"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L30
            java.lang.String r1 = "include"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2b
            goto L35
        L2b:
            java.util.List r2 = b(r0, r3)
            return r2
        L30:
            java.util.List r2 = a(r0, r3)
            return r2
        L35:
            return r3
    }

    private static java.util.List<java.lang.String> b(java.util.List<java.lang.String> r1, java.util.List<java.lang.String> r2) {
            r0 = 1
            java.util.List r1 = a(r1, r2, r0)
            return r1
    }

    public static org.json.JSONArray b(android.content.Context r2) {
            java.lang.Object r0 = cn.jiguang.p.c.a
            monitor-enter(r0)
            java.lang.String r1 = "wake_cache_v2.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L12
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L12:
            java.lang.String r0 = "content"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L26
            int r1 = r0.length()
            if (r1 != 0) goto L21
            goto L26
        L21:
            org.json.JSONArray r2 = a(r2, r0)
            return r2
        L26:
            java.lang.String r2 = "JWakeHelper"
            java.lang.String r0 = "no save data"
            cn.jiguang.w.f.c(r2, r0)
            r2 = 0
            return r2
        L2f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r2
    }

    private static org.json.JSONObject b(java.util.List<cn.jiguang.n.b> r9) {
            java.lang.String r0 = "JWakeHelper"
            if (r9 == 0) goto L97
            int r1 = r9.size()
            if (r1 != 0) goto Lc
            goto L97
        Lc:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L15:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r9.next()
            cn.jiguang.n.b r2 = (cn.jiguang.n.b) r2
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r2.f1341b     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L15
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L2c
            goto L15
        L2c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "package"
            java.lang.String r5 = r2.a     // Catch: java.lang.Throwable -> L6c
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L6c
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L6c
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = r2.f1341b     // Catch: java.lang.Throwable -> L6c
            java.util.Set r5 = r2.keySet()     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
        L47:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r7.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "wake_type"
            r7.put(r8, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "wake_status"
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Throwable -> L6c
            r7.put(r8, r6)     // Catch: java.lang.Throwable -> L6c
            r4.put(r7)     // Catch: java.lang.Throwable -> L6c
            goto L47
        L6c:
            r2 = move-exception
            goto L77
        L6e:
            java.lang.String r2 = "data"
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L6c
            r1.put(r3)     // Catch: java.lang.Throwable -> L6c
            goto L15
        L77:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "formatReportData:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.l(r0, r2)
            goto L15
        L8c:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r0 = "target"
            r9.put(r0, r1)     // Catch: org.json.JSONException -> L96
        L96:
            return r9
        L97:
            java.lang.String r9 = "wakeUpResult is empty, no need report"
            cn.jiguang.w.f.c(r0, r9)
            r9 = 0
            return r9
    }

    private static java.util.List<java.lang.String> c(cn.jiguang.n.a r0, java.util.List<java.lang.String> r1) {
            java.util.List<java.lang.String> r0 = r0.p
            java.util.List r0 = a(r0, r1)
            return r0
    }

    public static void c(android.content.Context r0) {
            java.lang.String r0 = "wake_cache_v2.json"
            cn.jiguang.av.i.d(r0)
            return
    }
}
