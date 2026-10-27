package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class k1<T, K, V> implements rx.e.a<java.util.Map<K, java.util.Collection<V>>>, rx.functions.o<java.util.Map<K, java.util.Collection<V>>> {
    private final rx.functions.p<? super T, ? extends K> a;
    private final rx.functions.p<? super T, ? extends V> b;
    private final rx.functions.o<? extends java.util.Map<K, java.util.Collection<V>>> c;
    private final rx.functions.p<? super K, ? extends java.util.Collection<V>> d;
    private final rx.e<T> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a<K, V> implements rx.functions.p<K, java.util.Collection<V>> {
        private static final rx.internal.operators.k1.a<java.lang.Object, java.lang.Object> a = null;

        static {
                rx.internal.operators.k1$a r0 = new rx.internal.operators.k1$a
                r0.<init>()
                rx.internal.operators.k1.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static <K, V> rx.internal.operators.k1.a<K, V> a() {
                rx.internal.operators.k1$a<java.lang.Object, java.lang.Object> r0 = rx.internal.operators.k1.a.a
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                java.util.Collection r1 = r0.m19call(r1)
                return r1
        }

        /* renamed from: call, reason: collision with other method in class */
        public java.util.Collection<V> m19call(K r1) {
                r0 = this;
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b<T, K, V> extends rx.internal.operators.u<T, java.util.Map<K, java.util.Collection<V>>> {
        private final rx.functions.p<? super T, ? extends K> j;
        private final rx.functions.p<? super T, ? extends V> k;
        private final rx.functions.p<? super K, ? extends java.util.Collection<V>> l;

        b(rx.l<? super java.util.Map<K, java.util.Collection<V>>> r1, java.util.Map<K, java.util.Collection<V>> r2, rx.functions.p<? super T, ? extends K> r3, rx.functions.p<? super T, ? extends V> r4, rx.functions.p<? super K, ? extends java.util.Collection<V>> r5) {
                r0 = this;
                r0.<init>(r1)
                r0.c = r2
                r1 = 1
                r0.b = r1
                r0.j = r3
                r0.k = r4
                r0.l = r5
                return
        }

        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.i
                if (r0 == 0) goto L5
                return
            L5:
                rx.functions.p<? super T, ? extends K> r0 = r3.j     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r0 = r0.call(r4)     // Catch: java.lang.Throwable -> L2d
                rx.functions.p<? super T, ? extends V> r1 = r3.k     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r4 = r1.call(r4)     // Catch: java.lang.Throwable -> L2d
                R r1 = r3.c     // Catch: java.lang.Throwable -> L2d
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L2d
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2d
                if (r1 != 0) goto L2f
                rx.functions.p<? super K, ? extends java.util.Collection<V>> r1 = r3.l     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r1 = r1.call(r0)     // Catch: java.lang.Throwable -> L2d
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2d
                R r2 = r3.c     // Catch: java.lang.Throwable -> L2d
                java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2d
                r2.put(r0, r1)     // Catch: java.lang.Throwable -> L2d
                goto L2f
            L2d:
                r4 = move-exception
                goto L33
            L2f:
                r1.add(r4)     // Catch: java.lang.Throwable -> L2d
                return
            L33:
                rx.exceptions.a.e(r4)
                r3.unsubscribe()
                r3.onError(r4)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    public k1(rx.e<T> r7, rx.functions.p<? super T, ? extends K> r8, rx.functions.p<? super T, ? extends V> r9) {
            r6 = this;
            r4 = 0
            rx.internal.operators.k1$a r5 = rx.internal.operators.k1.a.a()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public k1(rx.e<T> r7, rx.functions.p<? super T, ? extends K> r8, rx.functions.p<? super T, ? extends V> r9, rx.functions.o<? extends java.util.Map<K, java.util.Collection<V>>> r10) {
            r6 = this;
            rx.internal.operators.k1$a r5 = rx.internal.operators.k1.a.a()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public k1(rx.e<T> r1, rx.functions.p<? super T, ? extends K> r2, rx.functions.p<? super T, ? extends V> r3, rx.functions.o<? extends java.util.Map<K, java.util.Collection<V>>> r4, rx.functions.p<? super K, ? extends java.util.Collection<V>> r5) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.a = r2
            r0.b = r3
            if (r4 != 0) goto Le
            r0.c = r0
            goto L10
        Le:
            r0.c = r4
        L10:
            r0.d = r5
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call() {
            r1 = this;
            java.util.Map r0 = r1.m18call()
            return r0
    }

    /* renamed from: call, reason: collision with other method in class */
    public java.util.Map<K, java.util.Collection<V>> m18call() {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super java.util.Map<K, java.util.Collection<V>>> r8) {
            r7 = this;
            rx.functions.o<? extends java.util.Map<K, java.util.Collection<V>>> r0 = r7.c     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1b
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L1b
            rx.internal.operators.k1$b r1 = new rx.internal.operators.k1$b
            rx.functions.p<? super T, ? extends K> r4 = r7.a
            rx.functions.p<? super T, ? extends V> r5 = r7.b
            rx.functions.p<? super K, ? extends java.util.Collection<V>> r6 = r7.d
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            rx.e<T> r8 = r7.e
            r1.B(r8)
            return
        L1b:
            r0 = move-exception
            r2 = r8
            r8 = r0
            rx.exceptions.a.e(r8)
            r2.onError(r8)
            return
    }
}
