package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.commons.E.c {

    /* renamed from: cn.jiguang.commons.E.a$a, reason: collision with other inner class name */
    private static final class C0024a {
        private static final cn.jiguang.commons.E.a a = null;

        static {
                cn.jiguang.commons.E.a r0 = new cn.jiguang.commons.E.a
                r0.<init>()
                cn.jiguang.commons.E.a.C0024a.a = r0
                return
        }

        public C0024a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.a a() {
                cn.jiguang.commons.E.a r0 = cn.jiguang.commons.E.a.C0024a.a
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jiguang.commons.c.d a(cn.jiguang.commons.c.d r9) {
            r8 = this;
            if (r9 == 0) goto L80
            java.lang.String r0 = r9.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            goto L80
        Lc:
            cn.jiguang.commons.c.d r0 = new cn.jiguang.commons.c.d
            r0.<init>()
            java.lang.String r1 = r9.a
            r0.a = r1
            java.util.List r1 = r9.f1006h
            if (r1 == 0) goto L28
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L28
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = r9.f1006h
            r1.<init>(r2)
            r0.f1006h = r1
        L28:
            java.util.List r1 = r9.f1004f
            if (r1 == 0) goto L7f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7f
            java.util.List r1 = r9.f1004f
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L7f
            java.util.List r5 = r0.f1004f
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L63
            java.util.List r5 = r0.f1004f
            int r6 = r5.size()
            int r6 = r6 + (-1)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L7f
        L63:
            java.util.List r3 = r0.f1004f
            r3.add(r1)
            java.util.List r1 = r9.f1003e
            if (r1 == 0) goto L7f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7f
            java.util.List r1 = r0.f1003e
            java.util.List r9 = r9.f1003e
            java.lang.Object r9 = r9.get(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            r1.add(r9)
        L7f:
            return r0
        L80:
            r9 = 0
            return r9
    }

    private java.util.List c() {
            r7 = this;
            java.lang.String r0 = "JAppActive"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L21
            r3 = 1114(0x45a, float:1.561E-42)
            r4 = 0
            java.lang.Object r2 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2 instanceof java.util.Map     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            java.lang.String r2 = "uid data invalid"
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            return r2
        L21:
            r2 = move-exception
            goto L82
        L23:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L36
            java.lang.String r2 = "uid map empty"
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            return r2
        L36:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L21
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L21
        L42:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L65
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.c.d r5 = (cn.jiguang.commons.c.d) r5     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = r5.a     // Catch: java.lang.Throwable -> L21
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L57
            goto L42
        L57:
            cn.jiguang.commons.c.d r6 = r7.a(r5)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L42
            java.lang.String r5 = r5.a     // Catch: java.lang.Throwable -> L21
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + 1
            goto L42
        L65:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = "uid stats - total:"
            r2.append(r5)     // Catch: java.lang.Throwable -> L21
            r2.append(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = ", success:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L21
            r2.append(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L21
            goto L9a
        L82:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "uid stats err:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
        L9a:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    public static cn.jiguang.commons.E.a d() {
            cn.jiguang.commons.E.a r0 = cn.jiguang.commons.E.a.C0024a.a()
            return r0
    }

    private java.util.Map e() {
            r4 = this;
            r0 = 0
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L13
            r2 = 1113(0x459, float:1.56E-42)
            r3 = 0
            java.lang.Object r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L13
            boolean r2 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L13
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppActive"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r5) {
            r4 = this;
            java.lang.String r5 = "JAppActive"
            java.util.Map r0 = r4.e()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "usage stats ok, size:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L3a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L3a
            r0.append(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.w.a.a(r5, r0)     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L3a
            r2 = 3042(0xbe2, float:4.263E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3a
            goto L86
        L3a:
            r0 = move-exception
            goto Lca
        L3d:
            java.lang.String r0 = "usage stats failed, try uid"
            cn.jiguang.commons.w.a.a(r5, r0)     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L3a
            r1 = 3043(0xbe3, float:4.264E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            r0.a(r1)     // Catch: java.lang.Throwable -> L3a
            java.util.List r1 = r4.c()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L5a
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L3a
            goto L5b
        L5a:
            r0 = 0
        L5b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "uid stats result, size:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            r2.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.w.a.a(r5, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 <= 0) goto L7c
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L3a
            r2 = 3044(0xbe4, float:4.266E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3a
            goto L86
        L7c:
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L3a
            r2 = 3045(0xbe5, float:4.267E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3a
        L86:
            r0.a(r2)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto Lb7
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "report active data, size:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L3a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L3a
            r0.append(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.w.a.a(r5, r0)     // Catch: java.lang.Throwable -> L3a
            r4.c(r1)     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L3a
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            goto Lc6
        Lb7:
            java.lang.String r0 = "no active data"
            cn.jiguang.commons.w.a.a(r5, r0)     // Catch: java.lang.Throwable -> L3a
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L3a
            r1 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
        Lc6:
            r0.a(r1)     // Catch: java.lang.Throwable -> L3a
            return
        Lca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app active err:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.f(r5, r0)
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.a(r0)
            return
    }
}
