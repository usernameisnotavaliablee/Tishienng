package junit.textui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b extends junit.runner.a {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    private junit.textui.a f;

    public b() {
            r1 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r1.<init>(r0)
            return
    }

    public b(java.io.PrintStream r2) {
            r1 = this;
            junit.textui.a r0 = new junit.textui.a
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public b(junit.textui.a r1) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            return
    }

    public static void G(java.lang.String[] r1) {
            junit.textui.b r0 = new junit.textui.b
            r0.<init>()
            junit.framework.j r1 = r0.N(r1)     // Catch: java.lang.Exception -> L18
            boolean r1 = r1.q()     // Catch: java.lang.Exception -> L18
            if (r1 != 0) goto L13
            r1 = 1
            java.lang.System.exit(r1)     // Catch: java.lang.Exception -> L18
        L13:
            r1 = 0
            java.lang.System.exit(r1)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r1 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            r1.getMessage()
            r0.getClass()
            r1 = 2
            java.lang.System.exit(r1)
            return
    }

    public static junit.framework.j I(junit.framework.f r1) {
            junit.textui.b r0 = new junit.textui.b
            r0.<init>()
            junit.framework.j r1 = r0.E(r1)
            return r1
    }

    public static void J(java.lang.Class<? extends junit.framework.g> r1) {
            junit.framework.k r0 = new junit.framework.k
            r0.<init>(r1)
            I(r0)
            return
    }

    public static void K(junit.framework.f r2) {
            junit.textui.b r0 = new junit.textui.b
            r0.<init>()
            r1 = 1
            r0.F(r2, r1)
            return
    }

    @Override // junit.runner.a
    public void A(java.lang.String r1) {
            r0 = this;
            return
    }

    protected junit.framework.j D() {
            r1 = this;
            junit.framework.j r0 = new junit.framework.j
            r0.<init>()
            return r0
    }

    public junit.framework.j E(junit.framework.f r2) {
            r1 = this;
            r0 = 0
            junit.framework.j r2 = r1.F(r2, r0)
            return r2
    }

    public junit.framework.j F(junit.framework.f r6, boolean r7) {
            r5 = this;
            junit.framework.j r0 = r5.D()
            junit.textui.a r1 = r5.f
            r0.c(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r6.a(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            junit.textui.a r6 = r5.f
            r6.g(r0, r3)
            r5.H(r7)
            return r0
    }

    protected void H(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L3
            goto Ld
        L3:
            junit.textui.a r1 = r0.f
            r1.p()
            java.io.InputStream r1 = java.lang.System.in     // Catch: java.lang.Exception -> Ld
            r1.read()     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    protected junit.framework.j L(java.lang.String r2, java.lang.String r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r2 = r1.p(r2)
            java.lang.Class<junit.framework.g> r0 = junit.framework.g.class
            java.lang.Class r2 = r2.asSubclass(r0)
            junit.framework.f r2 = junit.framework.k.g(r2, r3)
            junit.framework.j r2 = r1.F(r2, r4)
            return r2
    }

    public void M(junit.textui.a r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public junit.framework.j N(java.lang.String[] r10) throws java.lang.Exception {
            r9 = this;
            java.lang.String r0 = ""
            r1 = 0
            r3 = r0
            r4 = r3
            r2 = 0
            r5 = 0
        L7:
            int r6 = r10.length
            if (r2 >= r6) goto L60
            r6 = r10[r2]
            java.lang.String r7 = "-wait"
            boolean r6 = r6.equals(r7)
            r7 = 1
            if (r6 == 0) goto L17
            r5 = 1
            goto L5e
        L17:
            r6 = r10[r2]
            java.lang.String r8 = "-c"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L2a
            int r2 = r2 + 1
            r3 = r10[r2]
            java.lang.String r3 = r9.g(r3)
            goto L5e
        L2a:
            r6 = r10[r2]
            java.lang.String r8 = "-m"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L49
            int r2 = r2 + 1
            r3 = r10[r2]
            r4 = 46
            int r4 = r3.lastIndexOf(r4)
            java.lang.String r6 = r3.substring(r1, r4)
            int r4 = r4 + r7
            java.lang.String r4 = r3.substring(r4)
            r3 = r6
            goto L5e
        L49:
            r6 = r10[r2]
            java.lang.String r8 = "-v"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L5c
            java.io.PrintStream r6 = java.lang.System.err
            junit.runner.c.a()
            r6.getClass()
            goto L5e
        L5c:
            r3 = r10[r2]
        L5e:
            int r2 = r2 + r7
            goto L7
        L60:
            boolean r10 = r3.equals(r0)
            if (r10 != 0) goto L93
            boolean r10 = r4.equals(r0)     // Catch: java.lang.Exception -> L71
            if (r10 != 0) goto L73
            junit.framework.j r10 = r9.L(r3, r4, r5)     // Catch: java.lang.Exception -> L71
            return r10
        L71:
            r10 = move-exception
            goto L7c
        L73:
            junit.framework.f r10 = r9.o(r3)     // Catch: java.lang.Exception -> L71
            junit.framework.j r10 = r9.F(r10, r5)     // Catch: java.lang.Exception -> L71
            return r10
        L7c:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not create and run test suite: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L93:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class"
            r10.<init>(r0)
            throw r10
    }

    @Override // junit.runner.a
    protected void s(java.lang.String r1) {
            r0 = this;
            java.io.PrintStream r1 = java.lang.System.err
            r1.getClass()
            r1 = 1
            java.lang.System.exit(r1)
            return
    }

    @Override // junit.runner.a
    public void y(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // junit.runner.a
    public void z(int r1, junit.framework.f r2, java.lang.Throwable r3) {
            r0 = this;
            return
    }
}
