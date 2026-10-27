package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g implements java.io.Serializable {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public int f270b;

    /* renamed from: c, reason: collision with root package name */
    public transient java.net.InetAddress f271c;

    public g(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f270b = r2
            return
    }

    public g(java.net.InetAddress r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getHostAddress()
            r1.a = r0
            r1.f270b = r3
            r1.f271c = r2
            return
    }

    public static cn.jiguang.ab.g a(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            int r0 = r6.lastIndexOf(r0)
            if (r0 >= 0) goto L11
            return r1
        L11:
            int r2 = r0 + 1
            java.lang.String r2 = r6.substring(r2)     // Catch: java.lang.Exception -> L40
            java.lang.Integer r2 = java.lang.Integer.decode(r2)     // Catch: java.lang.Exception -> L40
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L24
            java.lang.String r6 = ""
            goto L3a
        L24:
            java.lang.String r3 = "["
            boolean r3 = r6.startsWith(r3)     // Catch: java.lang.Exception -> L40
            int r4 = r0 + (-1)
            char r4 = r6.charAt(r4)     // Catch: java.lang.Exception -> L40
            r5 = 93
            if (r4 != r5) goto L36
            int r0 = r0 + (-1)
        L36:
            java.lang.String r6 = r6.substring(r3, r0)     // Catch: java.lang.Exception -> L40
        L3a:
            cn.jiguang.ab.g r0 = new cn.jiguang.ab.g     // Catch: java.lang.Exception -> L40
            r0.<init>(r6, r2)     // Catch: java.lang.Exception -> L40
            return r0
        L40:
            return r1
    }

    public static java.lang.String a(java.util.LinkedHashSet<cn.jiguang.ab.g> r2) {
            if (r2 == 0) goto L39
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L39
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            cn.jiguang.ab.g r1 = (cn.jiguang.ab.g) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            goto L12
        L2b:
            int r2 = r0.length()
            int r2 = r2 + (-1)
            r0.deleteCharAt(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L39:
            r2 = 0
            return r2
    }

    public static java.util.LinkedHashSet<cn.jiguang.ab.g> a(java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            cn.jiguang.ab.g r2 = new cn.jiguang.ab.g
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.<init>(r3, r1)
            boolean r1 = r2.a()
            if (r1 == 0) goto Ld
            r0.add(r2)
            goto Ld
        L38:
            return r0
    }

    private static void a(java.lang.String r4, java.util.LinkedHashSet<cn.jiguang.ab.g> r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L24
            java.lang.String r0 = ","
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r1 = 0
        Le:
            if (r1 >= r0) goto L24
            r2 = r4[r1]
            cn.jiguang.ab.g r2 = a(r2)
            if (r2 == 0) goto L21
            boolean r3 = r2.a()
            if (r3 == 0) goto L21
            r5.add(r2)
        L21:
            int r1 = r1 + 1
            goto Le
        L24:
            return
    }

    public static boolean a(java.lang.String r0, int r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            if (r1 <= 0) goto Lf
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static boolean b(java.lang.String r4) {
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L1a
            long r2 = r4.longValue()     // Catch: java.lang.Throwable -> L1a
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L1a
            r2 = 259200000(0xf731400, double:1.280618154E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            r4 = 1
            return r4
        L1a:
            r4 = 0
            return r4
    }

    public static java.util.LinkedHashSet<cn.jiguang.ab.g> c(java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " string2Set="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "IpPort"
            cn.jiguang.w.f.c(r1, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L5c
            java.lang.String r2 = "-sis-"
            java.lang.String[] r6 = r6.split(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " string2Set split="
            r2.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r1, r2)
            if (r6 == 0) goto L5c
            int r2 = r6.length
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L56
            r2 = r6[r5]
            boolean r2 = b(r2)
            if (r2 == 0) goto L50
            return r0
        L50:
            r6 = r6[r4]
        L52:
            a(r6, r0)
            goto L5c
        L56:
            int r2 = r6.length
            if (r2 < r5) goto L5c
            r6 = r6[r4]
            goto L52
        L5c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = " string2Set list="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r1, r6)
            return r0
    }

    public boolean a() {
            r2 = this;
            java.lang.String r0 = r2.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L13
            int r0 = r2.f270b
            if (r0 <= 0) goto L13
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r1) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2a
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2a
        L12:
            cn.jiguang.ab.g r5 = (cn.jiguang.ab.g) r5
            int r2 = r4.f270b
            int r3 = r5.f270b
            if (r2 != r3) goto L2a
            java.lang.String r2 = r4.a
            java.lang.String r5 = r5.a
            if (r2 == 0) goto L27
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L29
        L27:
            if (r5 != 0) goto L2a
        L29:
            return r0
        L2a:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            int r1 = r2.f270b
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ":"
            if (r0 != 0) goto L30
            java.lang.String r0 = r3.a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = "]:"
        L23:
            r0.append(r1)
            int r1 = r3.f270b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r3.a
            r0.append(r2)
            goto L23
    }
}
