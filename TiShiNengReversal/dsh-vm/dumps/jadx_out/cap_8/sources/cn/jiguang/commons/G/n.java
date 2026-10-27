package cn.jiguang.commons.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    private final cn.jiguang.commons.g.m a;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.g.n a = null;

        static {
                cn.jiguang.commons.g.n r0 = new cn.jiguang.commons.g.n
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.g.n.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.g.n a() {
                cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.b.a
                return r0
        }
    }

    private n() {
            r1 = this;
            r1.<init>()
            cn.jiguang.commons.g.m r0 = new cn.jiguang.commons.g.m
            r0.<init>()
            r1.a = r0
            return
    }

    /* synthetic */ n(cn.jiguang.commons.g.n.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.g.n a() {
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.b.a()
            return r0
    }

    private boolean a(java.lang.Integer r5) {
            r4 = this;
            java.lang.String r0 = "DataManager"
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = "gd: null configId"
            cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Exception -> L31
            return r1
        Lb:
            int r2 = r5.intValue()     // Catch: java.lang.Exception -> L31
            boolean r2 = cn.jiguang.commons.f.g.d(r2)     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "gd:"
            r2.append(r3)     // Catch: java.lang.Exception -> L31
            r2.append(r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = " not found"
            r2.append(r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L31
            cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Exception -> L31
            return r1
        L2f:
            r5 = 1
            return r5
        L31:
            return r1
    }

    public int a(int r3, boolean r4, int r5) {
            r2 = this;
            java.lang.Object r4 = r2.a(r3, r4)     // Catch: java.lang.Exception -> Lf
            boolean r0 = r4 instanceof java.lang.Integer     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L11
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> Lf
            int r3 = r4.intValue()     // Catch: java.lang.Exception -> Lf
            return r3
        Lf:
            r4 = move-exception
            goto L28
        L11:
            boolean r0 = r4 instanceof java.lang.Number     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L1c
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Exception -> Lf
            int r3 = r4.intValue()     // Catch: java.lang.Exception -> Lf
            return r3
        L1c:
            boolean r0 = r4 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L27
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lf
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> Lf
            return r3
        L27:
            return r5
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cast int err:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            java.lang.String r3 = r4.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "DataManager"
            cn.jiguang.commons.w.a.f(r4, r3)
            return r5
    }

    public java.lang.Object a(int r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.a(r2, r0)
            return r2
    }

    public java.lang.Object a(int r3, boolean r4) {
            r2 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2.a(r0)
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            if (r4 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cmd:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DataManager"
            cn.jiguang.commons.w.a.a(r1, r0)
        L24:
            cn.jiguang.commons.g.m r0 = r2.a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.d(r3, r4, r1)
            return r3
    }

    public java.lang.Object a(java.lang.Class r2, int r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.a(r2, r3, r0)
            return r2
    }

    public java.lang.Object a(java.lang.Class r4, int r5, boolean r6) {
            r3 = this;
            r0 = 0
            java.lang.Object r6 = r3.a(r5, r6)     // Catch: java.lang.Exception -> L10
            if (r6 != 0) goto L8
            return r0
        L8:
            boolean r4 = r4.isInstance(r6)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto Lf
            return r6
        Lf:
            return r0
        L10:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cast "
            r1.append(r2)
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            java.lang.String r4 = " err:"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ":"
            r1.append(r4)
            java.lang.String r4 = r6.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "DataManager"
            cn.jiguang.commons.w.a.f(r5, r4)
            return r0
    }

    public java.util.Map a(java.util.Map r7) {
            r6 = this;
            java.lang.String r0 = "DataManager"
            if (r7 == 0) goto L95
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lc
            goto L95
        Lc:
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r7.size()
            r1.<init>(r2)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r4 = r6.a(r3)     // Catch: java.lang.Exception -> L72
            if (r4 == 0) goto L1d
            int r4 = r3.intValue()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r2 = move-exception
            goto L51
        L48:
            r2 = 0
        L49:
            java.lang.Object r2 = r6.a(r4, r2)     // Catch: java.lang.Throwable -> L46
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L46
            goto L1d
        L51:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r4.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = "error getting data for actionid "
            r4.append(r5)     // Catch: java.lang.Exception -> L72
            r4.append(r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Exception -> L72
            r4.append(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L72
            cn.jiguang.commons.w.a.c(r0, r2)     // Catch: java.lang.Exception -> L72
            goto L1d
        L72:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "error validating actionid "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " in map getdata:"
            r4.append(r3)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            cn.jiguang.commons.w.a.c(r0, r2)
            goto L1d
        L94:
            return r1
        L95:
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            return r7
    }

    public java.util.Map a(java.util.Set r7) {
            r6 = this;
            java.lang.String r0 = "DataManager"
            if (r7 == 0) goto L7b
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb
            goto L7b
        Lb:
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r7.size()
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L18:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r7.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            boolean r3 = r6.a(r2)     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L18
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r6.a(r3)     // Catch: java.lang.Throwable -> L36
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L36
            goto L18
        L36:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r4.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r5 = "error getting data for actionid "
            r4.append(r5)     // Catch: java.lang.Exception -> L58
            r4.append(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Exception -> L58
            r4.append(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L58
            cn.jiguang.commons.w.a.c(r0, r3)     // Catch: java.lang.Exception -> L58
            goto L18
        L58:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "error validating actionid "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " in batch getdata:"
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            cn.jiguang.commons.w.a.c(r0, r2)
            goto L18
        L7a:
            return r1
        L7b:
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            return r7
    }

    public java.util.List c(int r2) {
            r1 = this;
            r0 = 0
            java.util.List r2 = r1.c(r2, r0)
            return r2
    }

    public java.util.List c(int r4, boolean r5) {
            r3 = this;
            r0 = 0
            java.lang.Object r5 = r3.a(r4, r5)     // Catch: java.lang.Exception -> Lc
            boolean r1 = r5 instanceof java.util.List     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto Le
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> Lc
            return r5
        Lc:
            r5 = move-exception
            goto Lf
        Le:
            return r0
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cast list err:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            java.lang.String r4 = r5.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "DataManager"
            cn.jiguang.commons.w.a.f(r5, r4)
            return r0
    }

    public java.lang.String d(int r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.d(r2, r0)
            return r2
    }

    public java.lang.String d(int r4, boolean r5) {
            r3 = this;
            r0 = 0
            java.lang.Object r5 = r3.a(r4, r5)     // Catch: java.lang.Exception -> Lf
            if (r5 != 0) goto L8
            return r0
        L8:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r1 == 0) goto L11
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lf
            return r5
        Lf:
            r5 = move-exception
            goto L16
        L11:
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> Lf
            return r4
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cast str err:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            java.lang.String r4 = r5.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "DataManager"
            cn.jiguang.commons.w.a.f(r5, r4)
            return r0
    }
}
