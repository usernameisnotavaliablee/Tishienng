package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> implements java.lang.Iterable<T> {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ rx.e b;

        a(java.lang.Object r1, rx.e r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r2 = this;
                rx.internal.operators.c$b r0 = new rx.internal.operators.c$b
                java.lang.Object r1 = r2.a
                r0.<init>(r1)
                rx.e r1 = r2.b
                r1.r5(r0)
                java.util.Iterator r0 = r0.g()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        volatile java.lang.Object a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements java.util.Iterator<T> {
            private java.lang.Object a;
            final /* synthetic */ rx.internal.operators.c.b b;

            a(rx.internal.operators.c.b r1) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    rx.internal.operators.c$b r0 = r1.b
                    java.lang.Object r0 = r0.a
                    r1.a = r0
                    boolean r0 = rx.internal.operators.v.f(r0)
                    r0 = r0 ^ 1
                    return r0
            }

            @Override // java.util.Iterator
            public T next() {
                    r2 = this;
                    r0 = 0
                    java.lang.Object r1 = r2.a     // Catch: java.lang.Throwable -> Lc
                    if (r1 != 0) goto Le
                    rx.internal.operators.c$b r1 = r2.b     // Catch: java.lang.Throwable -> Lc
                    java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> Lc
                    r2.a = r1     // Catch: java.lang.Throwable -> Lc
                    goto Le
                Lc:
                    r1 = move-exception
                    goto L38
                Le:
                    java.lang.Object r1 = r2.a     // Catch: java.lang.Throwable -> Lc
                    boolean r1 = rx.internal.operators.v.f(r1)     // Catch: java.lang.Throwable -> Lc
                    if (r1 != 0) goto L32
                    java.lang.Object r1 = r2.a     // Catch: java.lang.Throwable -> Lc
                    boolean r1 = rx.internal.operators.v.g(r1)     // Catch: java.lang.Throwable -> Lc
                    if (r1 != 0) goto L27
                    java.lang.Object r1 = r2.a     // Catch: java.lang.Throwable -> Lc
                    java.lang.Object r1 = rx.internal.operators.v.e(r1)     // Catch: java.lang.Throwable -> Lc
                    r2.a = r0
                    return r1
                L27:
                    java.lang.Object r1 = r2.a     // Catch: java.lang.Throwable -> Lc
                    java.lang.Throwable r1 = rx.internal.operators.v.d(r1)     // Catch: java.lang.Throwable -> Lc
                    java.lang.RuntimeException r1 = rx.exceptions.a.c(r1)     // Catch: java.lang.Throwable -> Lc
                    throw r1     // Catch: java.lang.Throwable -> Lc
                L32:
                    java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Lc
                    r1.<init>()     // Catch: java.lang.Throwable -> Lc
                    throw r1     // Catch: java.lang.Throwable -> Lc
                L38:
                    r2.a = r0
                    throw r1
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Read only iterator"
                    r0.<init>(r1)
                    throw r0
            }
        }

        b(T r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = rx.internal.operators.v.j(r1)
                r0.a = r1
                return
        }

        public java.util.Iterator<T> g() {
                r1 = this;
                rx.internal.operators.c$b$a r0 = new rx.internal.operators.c$b$a
                r0.<init>(r1)
                return r0
        }

        public void onCompleted() {
                r1 = this;
                java.lang.Object r0 = rx.internal.operators.v.b()
                r1.a = r0
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = rx.internal.operators.v.c(r1)
                r0.a = r1
                return
        }

        public void onNext(T r1) {
                r0 = this;
                java.lang.Object r1 = rx.internal.operators.v.j(r1)
                r0.a = r1
                return
        }
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.lang.Iterable<T> a(rx.e<? extends T> r1, T r2) {
            rx.internal.operators.c$a r0 = new rx.internal.operators.c$a
            r0.<init>(r2, r1)
            return r0
    }
}
