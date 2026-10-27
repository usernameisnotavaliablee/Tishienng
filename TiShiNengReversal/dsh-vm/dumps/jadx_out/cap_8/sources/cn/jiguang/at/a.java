package cn.jiguang.at;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static java.util.HashMap<java.lang.String, cn.jiguang.at.g> a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.HashMap<java.lang.String, cn.jiguang.api.JAction> f656b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.HashMap<java.lang.String, cn.jiguang.api.JActionExtra> f657c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f658d = null;

    /* renamed from: cn.jiguang.at.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: cn.jiguang.at.a$a, reason: collision with other inner class name */
    private static final class C0017a {
        private static final cn.jiguang.at.a a = null;

        static {
                cn.jiguang.at.a r0 = new cn.jiguang.at.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.at.a.C0017a.a = r0
                return
        }

        public C0017a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.at.a a() {
                cn.jiguang.at.a r0 = cn.jiguang.at.a.C0017a.a
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.at.a.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.at.a.f656b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.at.a.f657c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.at.a.f658d = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ a(cn.jiguang.at.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.at.a a() {
            cn.jiguang.at.a r0 = cn.jiguang.at.a.C0017a.a()
            return r0
    }

    public cn.jiguang.api.JAction a(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JAction> r0 = cn.jiguang.at.a.f656b
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, cn.jiguang.api.JAction> r0 = cn.jiguang.at.a.f656b
            java.lang.Object r2 = r0.get(r2)
            cn.jiguang.api.JAction r2 = (cn.jiguang.api.JAction) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public void a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addAction type:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",action:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DispacthManager"
            cn.jiguang.at.d.a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L78
            java.util.HashMap<java.lang.String, cn.jiguang.at.g> r0 = cn.jiguang.at.a.a
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L3f
            cn.jiguang.at.g r0 = new cn.jiguang.at.g
            r0.<init>()
            java.lang.Class<cn.jiguang.at.g> r2 = cn.jiguang.at.g.class
            java.lang.String r2 = r2.getCanonicalName()
            cn.jiguang.api.JCoreManager.addDispatchAction(r4, r2)
            java.util.HashMap<java.lang.String, cn.jiguang.at.g> r2 = cn.jiguang.at.a.a
            r2.put(r4, r0)
        L3f:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JAction> r0 = cn.jiguang.at.a.f656b
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L78
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r0 instanceof cn.jiguang.api.JAction     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L78
            java.util.HashMap<java.lang.String, cn.jiguang.api.JAction> r2 = cn.jiguang.at.a.f656b     // Catch: java.lang.Throwable -> L5b
            cn.jiguang.api.JAction r0 = (cn.jiguang.api.JAction) r0     // Catch: java.lang.Throwable -> L5b
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#unexcepted - instance "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = " class failed:"
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            cn.jiguang.at.d.d(r1, r4)
        L78:
            return
    }

    public cn.jiguang.api.JActionExtra b(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, cn.jiguang.api.JActionExtra> r0 = cn.jiguang.at.a.f657c
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, cn.jiguang.api.JActionExtra> r0 = cn.jiguang.at.a.f657c
            java.lang.Object r2 = r0.get(r2)
            cn.jiguang.api.JActionExtra r2 = (cn.jiguang.api.JActionExtra) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public void b(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addActionExtra type:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",action:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DispacthManager"
            cn.jiguang.at.d.a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L78
            java.util.HashMap<java.lang.String, cn.jiguang.at.g> r0 = cn.jiguang.at.a.a
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L3f
            cn.jiguang.at.g r0 = new cn.jiguang.at.g
            r0.<init>()
            java.lang.Class<cn.jiguang.at.g> r2 = cn.jiguang.at.g.class
            java.lang.String r2 = r2.getCanonicalName()
            cn.jiguang.api.JCoreManager.addDispatchAction(r4, r2)
            java.util.HashMap<java.lang.String, cn.jiguang.at.g> r2 = cn.jiguang.at.a.a
            r2.put(r4, r0)
        L3f:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JActionExtra> r0 = cn.jiguang.at.a.f657c
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L78
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r0 instanceof cn.jiguang.api.JActionExtra     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L78
            java.util.HashMap<java.lang.String, cn.jiguang.api.JActionExtra> r2 = cn.jiguang.at.a.f657c     // Catch: java.lang.Throwable -> L5b
            cn.jiguang.api.JActionExtra r0 = (cn.jiguang.api.JActionExtra) r0     // Catch: java.lang.Throwable -> L5b
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#unexcepted - instance "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = " class failed:"
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            cn.jiguang.at.d.d(r1, r4)
        L78:
            return
    }
}
