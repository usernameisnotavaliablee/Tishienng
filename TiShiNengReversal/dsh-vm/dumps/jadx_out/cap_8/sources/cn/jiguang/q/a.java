package cn.jiguang.q;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1408b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1409c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1410d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.util.Map<java.lang.Integer, android.os.Bundle> f1411e;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.q.a.f1411e = r0
            a()
            r0 = 24
            byte[] r0 = new byte[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [67, 119, 38, 102, 63, 90, 73, 126, 125, 119, 127, 87, 14, 83, 75, 121, 99, 85, 104, 124, 100, 102, 116, 66} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.q.a.a = r0
            r0 = 39
            byte[] r0 = new byte[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [117, 127, 30, 74, 112, 111, 99, 112, 94, 71, 55, 97, 120, 101, 85, 82, 119, 105, 122, 63, 122, 99, 118, 122, 115, 88, 94, 84, 124, 122, 120, 112, 92, 104, 124, 100, 102, 116, 66} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.q.a.f1408b = r0
            r0 = 37
            byte[] r0 = new byte[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [122, 102, 56, 123, 89, 71, 108, 105, 120, 118, 30, 73, 119, 124, 115, 99, 94, 65, 117, 38, 92, 82, 95, 82, 124, 64, 115, 125, 64, 69, 107, 73, 117, 101, 89, 79, 119} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.q.a.f1409c = r0
            r0 = 29
            byte[] r0 = new byte[r0]
            r0 = {x0080: FILL_ARRAY_DATA , data: [83, 78, 55, 120, 56, 123, 89, 71, 108, 105, 120, 118, 30, 106, 90, 103, 100, 116, 115, 76, 120, 123, 101, 93, 95, 65, 125, 109, 100} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.q.a.f1410d = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(android.content.Context r1, int r2) {
            cn.jiguang.r.c r2 = b(r1, r2)     // Catch: java.lang.Throwable -> La
            r0 = 1
            java.io.File r1 = a(r1, r2, r0)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "getIIf error:"
            r2.append(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "PH"
            cn.jiguang.t.b.e(r2, r1)
            r1 = 0
            return r1
    }

    public static java.io.File a(android.content.Context r5, cn.jiguang.r.c r6, boolean r7) {
            java.lang.String r0 = "PH"
            r1 = 0
            if (r6 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = r6.s     // Catch: java.lang.Throwable -> L2b
            int r3 = r6.m     // Catch: java.lang.Throwable -> L2b
            int r4 = r6.o     // Catch: java.lang.Throwable -> L2b
            java.io.File r5 = cn.jiguang.q.b.a(r5, r2, r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "pF:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            r2.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.t.b.b(r0, r2)     // Catch: java.lang.Throwable -> L2b
            boolean r6 = cn.jiguang.q.b.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L44
            return r5
        L2b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "gIF error:"
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.t.b.b(r0, r5)
        L44:
            return r1
    }

    public static java.lang.String a(int r3, int r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L33
            r1 = 1
            if (r4 == r1) goto L30
            r1 = 2
            if (r4 == r1) goto L2d
            r1 = 3
            if (r4 == r1) goto L2a
            r1 = 4
            if (r4 == r1) goto L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "unkown type:"
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "PH"
            cn.jiguang.t.b.e(r4, r3)
            return r0
        L27:
            java.lang.String r4 = "code"
            goto L35
        L2a:
            java.lang.String r4 = "dc"
            goto L35
        L2d:
            java.lang.String r4 = "iff"
            goto L35
        L30:
            java.lang.String r4 = "if"
            goto L35
        L33:
            java.lang.String r4 = "ic"
        L35:
            java.util.Map<java.lang.Integer, android.os.Bundle> r1 = cn.jiguang.q.a.f1411e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L52
            java.util.Map<java.lang.Integer, android.os.Bundle> r0 = cn.jiguang.q.a.f1411e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r3 = r3.getString(r4)
            return r3
        L52:
            return r0
    }

    private static void a() {
            java.lang.String r0 = "PH"
            java.lang.String r1 = "[loadPinfo]"
            cn.jiguang.t.b.b(r0, r1)     // Catch: java.lang.Throwable -> Lc0
            java.util.Map r1 = cn.jiguang.u.f.a()     // Catch: java.lang.Throwable -> Lc0
            java.util.Map<java.lang.Integer, android.os.Bundle> r2 = cn.jiguang.q.a.f1411e     // Catch: java.lang.Throwable -> Lc0
            r2.putAll(r1)     // Catch: java.lang.Throwable -> Lc0
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc0
            r1.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "pid"
            r3 = 1
            r1.putInt(r2, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "code"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r4.<init>()     // Catch: java.lang.Throwable -> Lc0
            int r5 = cn.jiguang.u.f.b()     // Catch: java.lang.Throwable -> Lc0
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r5 = ""
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc0
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "Y24ucC5qaWd1YW5nLkpDb3JlSGVscGVy"
            java.lang.String r2 = cn.jiguang.u.j.a(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "ic"
            r1.putString(r4, r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "Y24uamlndWFuZy5pbnRlcm5hbC5KQ29yZUludGVybmFsSGVscGVy"
            java.lang.String r2 = cn.jiguang.u.j.a(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "if"
            java.lang.String r5 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Lc0
            r1.putString(r4, r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.reflect.Field[] r2 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> Lc0
            int r4 = r2.length     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
        L59:
            if (r5 >= r4) goto L96
            r6 = r2[r5]     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class r7 = r6.getType()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r8 = "Y24uamlndWFuZy5pbnRlcm5hbC5KQ29yZUhlbHBlckFjdGlvbg"
            java.lang.String r8 = cn.jiguang.u.j.a(r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r7 = r7.getCanonicalName()     // Catch: java.lang.Throwable -> Lc0
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Lc0
            if (r7 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r2.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "find filed name:"
            r2.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = r6.getName()     // Catch: java.lang.Throwable -> Lc0
            r2.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc0
            cn.jiguang.t.b.b(r0, r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "iff"
            java.lang.String r4 = r6.getName()     // Catch: java.lang.Throwable -> Lc0
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> Lc0
            goto L96
        L93:
            int r5 = r5 + 1
            goto L59
        L96:
            java.lang.String r2 = "Y24ucC5qaWd1YW5nLkpDb3JlQ2xhc3NMb2FkZXI"
            java.lang.String r2 = cn.jiguang.u.j.a(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "dc"
            r1.putString(r4, r2)     // Catch: java.lang.Throwable -> Lc0
            java.util.Map<java.lang.Integer, android.os.Bundle> r2 = cn.jiguang.q.a.f1411e     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc0
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r1.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "[loadPinfo] end:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc0
            java.util.Map<java.lang.Integer, android.os.Bundle> r2 = cn.jiguang.q.a.f1411e     // Catch: java.lang.Throwable -> Lc0
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc0
            cn.jiguang.t.b.b(r0, r1)     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            return
    }

    public static void a(android.content.Context r1, int r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = "use"
            cn.jiguang.u.e.a(r1, r2, r0, r3, r4)
            return
    }

    public static void a(android.content.Context r4, cn.jiguang.r.c r5) {
            java.lang.String r0 = "PH"
            java.lang.String r1 = "clearPlugin..."
            cn.jiguang.t.b.b(r0, r1)     // Catch: java.lang.Throwable -> L24
            int r0 = r5.m     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "use"
            java.lang.String r2 = ""
            r3 = 0
            cn.jiguang.u.e.a(r4, r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r5.s     // Catch: java.lang.Throwable -> L24
            int r1 = r5.m     // Catch: java.lang.Throwable -> L24
            int r5 = r5.o     // Catch: java.lang.Throwable -> L24
            java.io.File r4 = cn.jiguang.q.b.a(r4, r0, r1, r5)     // Catch: java.lang.Throwable -> L24
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L24
            r4.delete()     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public static cn.jiguang.r.c b(android.content.Context r1, int r2) {
            java.lang.String r0 = "use"
            java.lang.String r1 = cn.jiguang.u.e.a(r1, r2, r0)
            cn.jiguang.r.c r1 = cn.jiguang.r.c.a(r1)
            return r1
    }
}
