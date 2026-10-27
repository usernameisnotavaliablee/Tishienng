package rx.plugins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class f {
    private static final rx.plugins.f f = null;
    static final rx.plugins.b g = null;
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.b> a;
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.d> b;
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.h> c;
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.a> d;
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.g> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends rx.plugins.b {
        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.plugins.a {
        final /* synthetic */ rx.plugins.f a;

        b(rx.plugins.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    static {
            rx.plugins.f r0 = new rx.plugins.f
            r0.<init>()
            rx.plugins.f.f = r0
            rx.plugins.f$a r0 = new rx.plugins.f$a
            r0.<init>()
            rx.plugins.f.g = r0
            return
    }

    f() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.b = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.c = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.e = r0
            return
    }

    @java.lang.Deprecated
    public static rx.plugins.f c() {
            rx.plugins.f r0 = rx.plugins.f.f
            return r0
    }

    static java.lang.Object e(java.lang.Class<?> r9, java.util.Properties r10) {
            java.lang.Object r10 = r10.clone()
            java.util.Properties r10 = (java.util.Properties) r10
            java.lang.String r0 = r9.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rxjava.plugin."
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = ".implementation"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r10.getProperty(r1)
            if (r1 != 0) goto Laa
            java.lang.String r3 = ".class"
            java.lang.String r4 = ".impl"
            java.util.Set r5 = r10.entrySet()     // Catch: java.lang.SecurityException -> La9
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.SecurityException -> La9
        L32:
            boolean r6 = r5.hasNext()     // Catch: java.lang.SecurityException -> La9
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r5.next()     // Catch: java.lang.SecurityException -> La9
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.SecurityException -> La9
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.SecurityException -> La9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.SecurityException -> La9
            boolean r8 = r7.startsWith(r2)     // Catch: java.lang.SecurityException -> La9
            if (r8 == 0) goto L32
            boolean r8 = r7.endsWith(r3)     // Catch: java.lang.SecurityException -> La9
            if (r8 == 0) goto L32
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.SecurityException -> La9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.SecurityException -> La9
            boolean r6 = r0.equals(r6)     // Catch: java.lang.SecurityException -> La9
            if (r6 == 0) goto L32
            int r3 = r7.length()     // Catch: java.lang.SecurityException -> La9
            int r3 = r3 + (-6)
            r5 = 0
            java.lang.String r3 = r7.substring(r5, r3)     // Catch: java.lang.SecurityException -> La9
            r5 = 14
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.SecurityException -> La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> La9
            r5.<init>()     // Catch: java.lang.SecurityException -> La9
            r5.append(r2)     // Catch: java.lang.SecurityException -> La9
            r5.append(r3)     // Catch: java.lang.SecurityException -> La9
            r5.append(r4)     // Catch: java.lang.SecurityException -> La9
            java.lang.String r2 = r5.toString()     // Catch: java.lang.SecurityException -> La9
            java.lang.String r1 = r10.getProperty(r2)     // Catch: java.lang.SecurityException -> La9
            if (r1 == 0) goto L8a
            goto Laa
        L8a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> La9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> La9
            r3.<init>()     // Catch: java.lang.SecurityException -> La9
            java.lang.String r4 = "Implementing class declaration for "
            r3.append(r4)     // Catch: java.lang.SecurityException -> La9
            r3.append(r0)     // Catch: java.lang.SecurityException -> La9
            java.lang.String r4 = " missing: "
            r3.append(r4)     // Catch: java.lang.SecurityException -> La9
            r3.append(r2)     // Catch: java.lang.SecurityException -> La9
            java.lang.String r2 = r3.toString()     // Catch: java.lang.SecurityException -> La9
            r10.<init>(r2)     // Catch: java.lang.SecurityException -> La9
            throw r10     // Catch: java.lang.SecurityException -> La9
        La9:
        Laa:
            if (r1 == 0) goto L131
            java.lang.Class r10 = java.lang.Class.forName(r1)     // Catch: java.lang.IllegalAccessException -> Lb9 java.lang.InstantiationException -> Lbb java.lang.ClassNotFoundException -> Lbd java.lang.ClassCastException -> Lbf
            java.lang.Class r9 = r10.asSubclass(r9)     // Catch: java.lang.IllegalAccessException -> Lb9 java.lang.InstantiationException -> Lbb java.lang.ClassNotFoundException -> Lbd java.lang.ClassCastException -> Lbf
            java.lang.Object r9 = r9.newInstance()     // Catch: java.lang.IllegalAccessException -> Lb9 java.lang.InstantiationException -> Lbb java.lang.ClassNotFoundException -> Lbd java.lang.ClassCastException -> Lbf
            return r9
        Lb9:
            r9 = move-exception
            goto Lc1
        Lbb:
            r9 = move-exception
            goto Ldb
        Lbd:
            r9 = move-exception
            goto Lf5
        Lbf:
            r9 = move-exception
            goto L10f
        Lc1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation not able to be accessed: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r10.<init>(r0, r9)
            throw r10
        Ldb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation not able to be instantiated: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r10.<init>(r0, r9)
            throw r10
        Lf5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation class not found: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r10.<init>(r0, r9)
            throw r10
        L10f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = " implementation is not an instance of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r10.<init>(r0, r9)
            throw r10
        L131:
            r9 = 0
            return r9
    }

    static java.util.Properties h() {
            java.util.Properties r0 = java.lang.System.getProperties()     // Catch: java.lang.SecurityException -> L5
            return r0
        L5:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            return r0
    }

    public rx.plugins.a a() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.a> r0 = r3.d
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L27
            java.lang.Class<rx.plugins.a> r0 = rx.plugins.a.class
            java.util.Properties r1 = h()
            java.lang.Object r0 = e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L20
            java.util.concurrent.atomic.AtomicReference<rx.plugins.a> r0 = r3.d
            rx.plugins.f$b r2 = new rx.plugins.f$b
            r2.<init>(r3)
            androidx.camera.view.p.a(r0, r1, r2)
            goto L27
        L20:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.a> r2 = r3.d
            rx.plugins.a r0 = (rx.plugins.a) r0
            androidx.camera.view.p.a(r2, r1, r0)
        L27:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.a> r0 = r3.d
            java.lang.Object r0 = r0.get()
            rx.plugins.a r0 = (rx.plugins.a) r0
            return r0
    }

    public rx.plugins.b b() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r0 = r3.a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L24
            java.lang.Class<rx.plugins.b> r0 = rx.plugins.b.class
            java.util.Properties r1 = h()
            java.lang.Object r0 = e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L1d
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r0 = r3.a
            rx.plugins.b r2 = rx.plugins.f.g
            androidx.camera.view.p.a(r0, r1, r2)
            goto L24
        L1d:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r2 = r3.a
            rx.plugins.b r0 = (rx.plugins.b) r0
            androidx.camera.view.p.a(r2, r1, r0)
        L24:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r0 = r3.a
            java.lang.Object r0 = r0.get()
            rx.plugins.b r0 = (rx.plugins.b) r0
            return r0
    }

    public rx.plugins.d d() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r0 = r3.b
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L26
            java.lang.Class<rx.plugins.d> r0 = rx.plugins.d.class
            java.util.Properties r1 = h()
            java.lang.Object r0 = e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L1f
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r0 = r3.b
            rx.plugins.d r2 = rx.plugins.e.f()
            androidx.camera.view.p.a(r0, r1, r2)
            goto L26
        L1f:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r2 = r3.b
            rx.plugins.d r0 = (rx.plugins.d) r0
            androidx.camera.view.p.a(r2, r1, r0)
        L26:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r0 = r3.b
            java.lang.Object r0 = r0.get()
            rx.plugins.d r0 = (rx.plugins.d) r0
            return r0
    }

    public rx.plugins.g f() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r0 = r3.e
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L26
            java.lang.Class<rx.plugins.g> r0 = rx.plugins.g.class
            java.util.Properties r1 = h()
            java.lang.Object r0 = e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L1f
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r0 = r3.e
            rx.plugins.g r2 = rx.plugins.g.h()
            androidx.camera.view.p.a(r0, r1, r2)
            goto L26
        L1f:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r2 = r3.e
            rx.plugins.g r0 = (rx.plugins.g) r0
            androidx.camera.view.p.a(r2, r1, r0)
        L26:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r0 = r3.e
            java.lang.Object r0 = r0.get()
            rx.plugins.g r0 = (rx.plugins.g) r0
            return r0
    }

    public rx.plugins.h g() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r0 = r3.c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L26
            java.lang.Class<rx.plugins.h> r0 = rx.plugins.h.class
            java.util.Properties r1 = h()
            java.lang.Object r0 = e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L1f
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r0 = r3.c
            rx.plugins.h r2 = rx.plugins.i.f()
            androidx.camera.view.p.a(r0, r1, r2)
            goto L26
        L1f:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r2 = r3.c
            rx.plugins.h r0 = (rx.plugins.h) r0
            androidx.camera.view.p.a(r2, r1, r0)
        L26:
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r0 = r3.c
            java.lang.Object r0 = r0.get()
            rx.plugins.h r0 = (rx.plugins.h) r0
            return r0
    }

    public void i(rx.plugins.a r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.a> r0 = r2.d
            r1 = 0
            boolean r3 = androidx.camera.view.p.a(r0, r1, r3)
            if (r3 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Another strategy was already registered: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r1 = r2.c
            java.lang.Object r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void j(rx.plugins.b r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r0 = r2.a
            r1 = 0
            boolean r3 = androidx.camera.view.p.a(r0, r1, r3)
            if (r3 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Another strategy was already registered: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r1 = r2.a
            java.lang.Object r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void k(rx.plugins.d r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r0 = r2.b
            r1 = 0
            boolean r3 = androidx.camera.view.p.a(r0, r1, r3)
            if (r3 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Another strategy was already registered: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r1 = r2.b
            java.lang.Object r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void l(rx.plugins.g r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r0 = r2.e
            r1 = 0
            boolean r3 = androidx.camera.view.p.a(r0, r1, r3)
            if (r3 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Another strategy was already registered: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r1 = r2.e
            java.lang.Object r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void m(rx.plugins.h r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r0 = r2.c
            r1 = 0
            boolean r3 = androidx.camera.view.p.a(r0, r1, r3)
            if (r3 == 0) goto La
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Another strategy was already registered: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r1 = r2.c
            java.lang.Object r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void n() {
            r3 = this;
            rx.plugins.f r0 = rx.plugins.f.f
            java.util.concurrent.atomic.AtomicReference<rx.plugins.b> r1 = r0.a
            r2 = 0
            r1.set(r2)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.d> r1 = r0.b
            r1.set(r2)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.h> r1 = r0.c
            r1.set(r2)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.a> r1 = r0.d
            r1.set(r2)
            java.util.concurrent.atomic.AtomicReference<rx.plugins.g> r0 = r0.e
            r0.set(r2)
            return
    }
}
