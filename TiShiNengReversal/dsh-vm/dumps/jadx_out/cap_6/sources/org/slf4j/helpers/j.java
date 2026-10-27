package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class j {
    private static org.slf4j.helpers.j.b a;
    private static boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b extends java.lang.SecurityManager {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(org.slf4j.helpers.j.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.SecurityManager
        protected java.lang.Class<?>[] getClassContext() {
                r1 = this;
                java.lang.Class[] r0 = super.getClassContext()
                return r0
        }
    }

    static {
            return
    }

    private j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class<?> a() {
            org.slf4j.helpers.j$b r0 = b()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Class[] r0 = r0.getClassContext()
            java.lang.Class<org.slf4j.helpers.j> r1 = org.slf4j.helpers.j.class
            java.lang.String r1 = r1.getName()
            r2 = 0
        L13:
            int r3 = r0.length
            if (r2 >= r3) goto L26
            r3 = r0[r2]
            java.lang.String r3 = r3.getName()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L23
            goto L26
        L23:
            int r2 = r2 + 1
            goto L13
        L26:
            int r1 = r0.length
            if (r2 >= r1) goto L31
            int r2 = r2 + 2
            int r1 = r0.length
            if (r2 >= r1) goto L31
            r0 = r0[r2]
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            r0.<init>(r1)
            throw r0
    }

    private static org.slf4j.helpers.j.b b() {
            org.slf4j.helpers.j$b r0 = org.slf4j.helpers.j.a
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = org.slf4j.helpers.j.b
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            org.slf4j.helpers.j$b r0 = e()
            org.slf4j.helpers.j.a = r0
            r1 = 1
            org.slf4j.helpers.j.b = r1
            return r0
    }

    public static final void c(java.lang.String r0) {
            java.io.PrintStream r0 = java.lang.System.err
            r0.getClass()
            return
    }

    public static final void d(java.lang.String r0, java.lang.Throwable r1) {
            java.io.PrintStream r0 = java.lang.System.err
            r0.getClass()
            java.io.PrintStream r0 = java.lang.System.err
            r0.getClass()
            r1.getClass()
            return
    }

    private static org.slf4j.helpers.j.b e() {
            r0 = 0
            org.slf4j.helpers.j$b r1 = new org.slf4j.helpers.j$b     // Catch: java.lang.SecurityException -> L7
            r1.<init>(r0)     // Catch: java.lang.SecurityException -> L7
            return r1
        L7:
            return r0
    }

    public static boolean f(java.lang.String r1) {
            java.lang.String r1 = g(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "true"
            boolean r1 = r1.equalsIgnoreCase(r0)
            return r1
    }

    public static java.lang.String g(java.lang.String r1) {
            if (r1 == 0) goto L9
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L7
            return r1
        L7:
            r1 = 0
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null input"
            r1.<init>(r0)
            throw r1
    }
}
