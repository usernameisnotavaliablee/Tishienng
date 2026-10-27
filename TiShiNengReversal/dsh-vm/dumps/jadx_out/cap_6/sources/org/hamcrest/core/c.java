package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c<T> extends org.hamcrest.n<T> {
    private final org.hamcrest.j<? super T> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<X> {
        private final org.hamcrest.j<? super X> a;

        public a(org.hamcrest.j<? super X> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public org.hamcrest.core.c<X> a(org.hamcrest.j<? super X> r3) {
                r2 = this;
                org.hamcrest.core.c r0 = new org.hamcrest.core.c
                org.hamcrest.j<? super X> r1 = r2.a
                r0.<init>(r1)
                org.hamcrest.core.c r3 = r0.e(r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b<X> {
        private final org.hamcrest.j<? super X> a;

        public b(org.hamcrest.j<? super X> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public org.hamcrest.core.c<X> a(org.hamcrest.j<? super X> r3) {
                r2 = this;
                org.hamcrest.core.c r0 = new org.hamcrest.core.c
                org.hamcrest.j<? super X> r1 = r2.a
                r0.<init>(r1)
                org.hamcrest.core.c r3 = r0.h(r3)
                return r3
        }
    }

    public c(org.hamcrest.j<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @org.hamcrest.Factory
    public static <LHS> org.hamcrest.core.c.a<LHS> f(org.hamcrest.j<? super LHS> r1) {
            org.hamcrest.core.c$a r0 = new org.hamcrest.core.c$a
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <LHS> org.hamcrest.core.c.b<LHS> g(org.hamcrest.j<? super LHS> r1) {
            org.hamcrest.core.c$b r0 = new org.hamcrest.core.c$b
            r0.<init>(r1)
            return r0
    }

    private java.util.ArrayList<org.hamcrest.j<? super T>> i(org.hamcrest.j<? super T> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.hamcrest.j<? super T> r1 = r2.c
            r0.add(r1)
            r0.add(r3)
            return r0
    }

    @Override // org.hamcrest.n
    protected boolean d(T r2, org.hamcrest.g r3) {
            r1 = this;
            org.hamcrest.j<? super T> r0 = r1.c
            boolean r0 = r0.c(r2)
            if (r0 != 0) goto Lf
            org.hamcrest.j<? super T> r0 = r1.c
            r0.b(r2, r3)
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            org.hamcrest.j<? super T> r0 = r1.c
            r2.f(r0)
            return
    }

    public org.hamcrest.core.c<T> e(org.hamcrest.j<? super T> r3) {
            r2 = this;
            org.hamcrest.core.c r0 = new org.hamcrest.core.c
            org.hamcrest.core.a r1 = new org.hamcrest.core.a
            java.util.ArrayList r3 = r2.i(r3)
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
    }

    public org.hamcrest.core.c<T> h(org.hamcrest.j<? super T> r3) {
            r2 = this;
            org.hamcrest.core.c r0 = new org.hamcrest.core.c
            org.hamcrest.core.b r1 = new org.hamcrest.core.b
            java.util.ArrayList r3 = r2.i(r3)
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
    }
}
