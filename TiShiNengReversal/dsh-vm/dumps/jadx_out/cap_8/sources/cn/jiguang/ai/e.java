package cn.jiguang.ai;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static java.util.List<java.lang.String> a;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.ai.e.a = r0
            java.lang.String r1 = "358673013795895"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.ai.e.a
            java.lang.String r1 = "004999010640000"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.ai.e.a
            java.lang.String r1 = "00000000000000"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.ai.e.a
            java.lang.String r1 = "000000000000000"
            r0.add(r1)
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r4) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.au()
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            if (r1 != 0) goto L1b
            java.lang.String r1 = new java.lang.String
            byte[] r0 = android.util.Base64.decode(r0, r2)
            r1.<init>(r0)
            r0 = r1
        L1b:
            boolean r1 = a(r0)
            if (r1 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = b(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L45
            cn.jiguang.e.a r1 = cn.jiguang.e.a.au()
            byte[] r3 = r0.getBytes()
            java.lang.String r2 = android.util.Base64.encodeToString(r3, r2)
            cn.jiguang.e.a r1 = r1.a(r2)
            r2 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]
            r3 = 0
            r2[r3] = r1
            cn.jiguang.e.b.a(r4, r2)
        L45:
            return r0
    }

    private static boolean a(java.lang.String r3) {
            boolean r0 = cn.jiguang.av.v.i(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r3.length()
            r2 = 10
            if (r0 >= r2) goto L11
            return r1
        L11:
            java.util.List<java.lang.String> r0 = cn.jiguang.ai.e.a
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L17
            return r1
        L2a:
            r3 = 1
            return r3
    }

    private static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = ""
            cn.jiguang.ai.a r1 = cn.jiguang.ai.a.a(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = r1.p     // Catch: java.lang.Exception -> L2c
            boolean r2 = a(r1)     // Catch: java.lang.Exception -> L2c
            if (r2 == 0) goto Lf
            return r1
        Lf:
            cn.jiguang.ai.a r1 = cn.jiguang.ai.a.a(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = r1.f480i     // Catch: java.lang.Exception -> L2c
            boolean r2 = a(r1)     // Catch: java.lang.Exception -> L2c
            if (r2 == 0) goto L2e
            java.lang.String r2 = "9774d56d682e549c"
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = r1.toLowerCase(r3)     // Catch: java.lang.Exception -> L2c
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L2c
            if (r2 != 0) goto L2e
            return r1
        L2c:
            r1 = move-exception
            goto L3a
        L2e:
            java.lang.String r1 = c(r4)     // Catch: java.lang.Exception -> L2c
            boolean r4 = a(r1)     // Catch: java.lang.Exception -> L2c
            if (r4 == 0) goto L39
            return r1
        L39:
            return r0
        L3a:
            java.lang.String r2 = "UDIDUtils"
            cn.jiguang.w.f.d(r2, r0, r1)
            java.lang.String r4 = d(r4)
            boolean r1 = a(r4)
            if (r1 == 0) goto L4a
            return r4
        L4a:
            return r0
    }

    private static java.lang.String c(android.content.Context r0) {
            java.lang.String r0 = d(r0)
            if (r0 != 0) goto L8
            java.lang.String r0 = " "
        L8:
            return r0
    }

    private static java.lang.String d(android.content.Context r2) {
            java.lang.String r0 = "UDIDUtils"
            java.lang.String r1 = "Action:getSavedUuid"
            cn.jiguang.w.f.c(r0, r1)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aK()
            java.lang.Object r0 = cn.jiguang.e.b.b(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = cn.jiguang.av.v.a(r0)
            if (r1 != 0) goto L18
            return r0
        L18:
            boolean r0 = cn.jiguang.av.a.d()
            if (r0 != 0) goto L23
            java.lang.String r2 = g(r2)
            return r2
        L23:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.av()
            java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L59
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L3e
            java.lang.String r2 = e(r2)
            return r2
        L3e:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = cn.jiguang.av.p.a(r2, r0)
            if (r0 == 0) goto L54
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = cn.jiguang.av.p.a(r2, r0)
            if (r0 != 0) goto L4f
            goto L54
        L4f:
            java.lang.String r2 = e(r2)
            return r2
        L54:
            java.lang.String r2 = g(r2)
            return r2
        L59:
            return r0
    }

    private static java.lang.String e(android.content.Context r7) {
            java.lang.String r0 = f(r7)
            boolean r1 = cn.jiguang.av.v.a(r0)
            if (r1 != 0) goto L10
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r0 = cn.jiguang.av.i.c(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L43
            cn.jiguang.e.a r1 = cn.jiguang.e.a.av()
            cn.jiguang.e.a r1 = r1.a(r0)
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]
            r2[r3] = r1
            cn.jiguang.e.b.a(r7, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Got sdcard file saved udid - "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "UDIDUtils"
            cn.jiguang.w.f.f(r1, r7)
            return r0
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            r0.append(r5)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.util.UUID r0 = java.util.UUID.nameUUIDFromBytes(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = cn.jiguang.av.v.k(r0)
            cn.jiguang.e.a r2 = cn.jiguang.e.a.av()
            cn.jiguang.e.a r2 = r2.a(r0)
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r4]
            r4[r3] = r2
            cn.jiguang.e.b.a(r7, r4)
            cn.jiguang.av.i.b(r1, r0)
            return r0
    }

    private static java.lang.String f(android.content.Context r1) {
            java.lang.String r1 = cn.jiguang.av.a.g(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ".push_udid"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String g(android.content.Context r4) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aK()
            java.lang.Object r1 = cn.jiguang.e.b.b(r4, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L21
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            cn.jiguang.e.a r0 = r0.a(r1)
            r2 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]
            r3 = 0
            r2[r3] = r0
            cn.jiguang.e.b.a(r4, r2)
        L21:
            return r1
    }
}
