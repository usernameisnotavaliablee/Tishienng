package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j1<T, K, V> implements rx.e.a<java.util.Map<K, V>>, rx.functions.o<java.util.Map<K, V>> {
    final rx.e<T> a;
    final rx.functions.p<? super T, ? extends K> b;
    final rx.functions.p<? super T, ? extends V> c;
    final rx.functions.o<? extends java.util.Map<K, V>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T, K, V> extends rx.internal.operators.u<T, java.util.Map<K, V>> {
        final rx.functions.p<? super T, ? extends K> j;
        final rx.functions.p<? super T, ? extends V> k;

        a(rx.l<? super java.util.Map<K, V>> r1, java.util.Map<K, V> r2, rx.functions.p<? super T, ? extends K> r3, rx.functions.p<? super T, ? extends V> r4) {
                r0 = this;
                r0.<init>(r1)
                r0.c = r2
                r1 = 1
                r0.b = r1
                r0.j = r3
                r0.k = r4
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.i
                if (r0 == 0) goto L5
                return
            L5:
                rx.functions.p<? super T, ? extends K> r0 = r2.j     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.call(r3)     // Catch: java.lang.Throwable -> L19
                rx.functions.p<? super T, ? extends V> r1 = r2.k     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r1.call(r3)     // Catch: java.lang.Throwable -> L19
                R r1 = r2.c     // Catch: java.lang.Throwable -> L19
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L19
                r1.put(r0, r3)     // Catch: java.lang.Throwable -> L19
                return
            L19:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                r2.unsubscribe()
                r2.onError(r3)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    public j1(rx.e<T> r2, rx.functions.p<? super T, ? extends K> r3, rx.functions.p<? super T, ? extends V> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public j1(rx.e<T> r1, rx.functions.p<? super T, ? extends K> r2, rx.functions.p<? super T, ? extends V> r3, rx.functions.o<? extends java.util.Map<K, V>> r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            if (r4 != 0) goto Le
            r0.d = r0
            return
        Le:
            r0.d = r4
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call() {
            r1 = this;
            java.util.Map r0 = r1.m17call()
            return r0
    }

    /* renamed from: call, reason: collision with other method in class */
    public java.util.Map<K, V> m17call() {
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

    public void call(rx.l<? super java.util.Map<K, V>> r5) {
            r4 = this;
            rx.functions.o<? extends java.util.Map<K, V>> r0 = r4.d     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L17
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L17
            rx.internal.operators.j1$a r1 = new rx.internal.operators.j1$a
            rx.functions.p<? super T, ? extends K> r2 = r4.b
            rx.functions.p<? super T, ? extends V> r3 = r4.c
            r1.<init>(r5, r0, r2, r3)
            rx.e<T> r5 = r4.a
            r1.B(r5)
            return
        L17:
            r0 = move-exception
            rx.exceptions.a.f(r0, r5)
            return
    }
}
