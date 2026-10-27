package org.slf4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    static final java.lang.String a = "http://www.slf4j.org/codes.html#null_MDCA";
    static final java.lang.String b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static i5.c c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements java.io.Closeable {
        private final java.lang.String a;

        private b(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(java.lang.String r1, org.slf4j.e.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.lang.String r0 = r1.a
                org.slf4j.e.h(r0)
                return
        }
    }

    static {
            i5.c r0 = a()     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> Le
            org.slf4j.e.c = r0     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> Le
            return
        L7:
            r0 = move-exception
            java.lang.String r1 = "MDC binding unsuccessful."
            org.slf4j.helpers.j.d(r1, r0)
            goto L33
        Le:
            r0 = move-exception
            org.slf4j.helpers.f r1 = new org.slf4j.helpers.f
            r1.<init>()
            org.slf4j.e.c = r1
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L34
            java.lang.String r2 = "StaticMDCBinder"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L34
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticMDCBinder\"."
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "Defaulting to no-operation MDCAdapter implementation."
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details."
            org.slf4j.helpers.j.c(r0)
        L33:
            return
        L34:
            throw r0
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    private static i5.c a() throws java.lang.NoClassDefFoundError {
            org.slf4j.impl.d r0 = org.slf4j.impl.d.c()     // Catch: java.lang.NoSuchMethodError -> L9
            i5.c r0 = r0.a()     // Catch: java.lang.NoSuchMethodError -> L9
            return r0
        L9:
            org.slf4j.impl.d r0 = org.slf4j.impl.d.a
            i5.c r0 = r0.a()
            return r0
    }

    public static void b() {
            i5.c r0 = org.slf4j.e.c
            if (r0 == 0) goto L8
            r0.clear()
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String c(java.lang.String r1) throws java.lang.IllegalArgumentException {
            if (r1 == 0) goto L13
            i5.c r0 = org.slf4j.e.c
            if (r0 == 0) goto Lb
            java.lang.String r1 = r0.get(r1)
            return r1
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r0)
            throw r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key parameter cannot be null"
            r1.<init>(r0)
            throw r1
    }

    public static java.util.Map<java.lang.String, java.lang.String> d() {
            i5.c r0 = org.slf4j.e.c
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.b()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r0.<init>(r1)
            throw r0
    }

    public static i5.c e() {
            i5.c r0 = org.slf4j.e.c
            return r0
    }

    public static void f(java.lang.String r1, java.lang.String r2) throws java.lang.IllegalArgumentException {
            if (r1 == 0) goto L12
            i5.c r0 = org.slf4j.e.c
            if (r0 == 0) goto La
            r0.a(r1, r2)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r2)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "key parameter cannot be null"
            r1.<init>(r2)
            throw r1
    }

    public static org.slf4j.e.b g(java.lang.String r1, java.lang.String r2) throws java.lang.IllegalArgumentException {
            f(r1, r2)
            org.slf4j.e$b r2 = new org.slf4j.e$b
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }

    public static void h(java.lang.String r1) throws java.lang.IllegalArgumentException {
            if (r1 == 0) goto L12
            i5.c r0 = org.slf4j.e.c
            if (r0 == 0) goto La
            r0.remove(r1)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r0)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key parameter cannot be null"
            r1.<init>(r0)
            throw r1
    }

    public static void i(java.util.Map<java.lang.String, java.lang.String> r1) {
            i5.c r0 = org.slf4j.e.c
            if (r0 == 0) goto L8
            r0.c(r1)
            return
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r0)
            throw r1
    }
}
