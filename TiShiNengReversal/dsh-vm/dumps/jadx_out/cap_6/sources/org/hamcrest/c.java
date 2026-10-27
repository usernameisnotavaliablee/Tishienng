package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class c<T> {
    public static final org.hamcrest.c.C0070c<java.lang.Object> a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b<T> extends org.hamcrest.c<T> {
        private final T b;
        private final org.hamcrest.g c;

        private b(T r2, org.hamcrest.g r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.b = r2
                r1.c = r3
                return
        }

        /* synthetic */ b(java.lang.Object r1, org.hamcrest.g r2, org.hamcrest.c.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.hamcrest.c
        public <U> org.hamcrest.c<U> a(org.hamcrest.c.d<? super T, U> r3) {
                r2 = this;
                T r0 = r2.b
                org.hamcrest.g r1 = r2.c
                org.hamcrest.c r3 = r3.a(r0, r1)
                return r3
        }

        @Override // org.hamcrest.c
        public boolean d(org.hamcrest.j<T> r2, java.lang.String r3) {
                r1 = this;
                T r0 = r1.b
                boolean r0 = r2.c(r0)
                if (r0 == 0) goto La
                r2 = 1
                return r2
            La:
                org.hamcrest.g r0 = r1.c
                r0.b(r3)
                T r3 = r1.b
                org.hamcrest.g r0 = r1.c
                r2.b(r3, r0)
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.hamcrest.c$c, reason: collision with other inner class name */
    private static final class C0070c<T> extends org.hamcrest.c<T> {
        private C0070c() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ C0070c(org.hamcrest.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.hamcrest.c
        public <U> org.hamcrest.c<U> a(org.hamcrest.c.d<? super T, U> r1) {
                r0 = this;
                org.hamcrest.c r1 = org.hamcrest.c.e()
                return r1
        }

        @Override // org.hamcrest.c
        public boolean d(org.hamcrest.j<T> r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d<I, O> {
        org.hamcrest.c<O> a(I r1, org.hamcrest.g r2);
    }

    static {
            org.hamcrest.c$c r0 = new org.hamcrest.c$c
            r1 = 0
            r0.<init>(r1)
            org.hamcrest.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ c(org.hamcrest.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> org.hamcrest.c<T> b(T r2, org.hamcrest.g r3) {
            org.hamcrest.c$b r0 = new org.hamcrest.c$b
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> org.hamcrest.c<T> e() {
            org.hamcrest.c$c<java.lang.Object> r0 = org.hamcrest.c.a
            return r0
    }

    public abstract <U> org.hamcrest.c<U> a(org.hamcrest.c.d<? super T, U> r1);

    public final boolean c(org.hamcrest.j<T> r2) {
            r1 = this;
            java.lang.String r0 = ""
            boolean r2 = r1.d(r2, r0)
            return r2
    }

    public abstract boolean d(org.hamcrest.j<T> r1, java.lang.String r2);

    public final <U> org.hamcrest.c<U> f(org.hamcrest.c.d<? super T, U> r1) {
            r0 = this;
            org.hamcrest.c r1 = r0.a(r1)
            return r1
    }
}
