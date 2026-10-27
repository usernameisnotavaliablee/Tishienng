package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class b<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.m, rx.g {
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private final retrofit2.b<T> a;
    private final rx.l<? super retrofit2.c0<T>> b;
    private volatile boolean c;
    private volatile retrofit2.c0<T> d;

    b(retrofit2.b<T> r2, rx.l<? super retrofit2.c0<T>> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            r1.b = r3
            return
    }

    private void a(retrofit2.c0<T> r5) {
            r4 = this;
            boolean r0 = r4.isUnsubscribed()     // Catch: java.lang.Throwable -> Lc rx.exceptions.OnErrorNotImplementedException -> Le rx.exceptions.OnErrorFailedException -> L11 rx.exceptions.OnCompletedFailedException -> L14
            if (r0 != 0) goto L17
            rx.l<? super retrofit2.c0<T>> r0 = r4.b     // Catch: java.lang.Throwable -> Lc rx.exceptions.OnErrorNotImplementedException -> Le rx.exceptions.OnErrorFailedException -> L11 rx.exceptions.OnCompletedFailedException -> L14
            r0.onNext(r5)     // Catch: java.lang.Throwable -> Lc rx.exceptions.OnErrorNotImplementedException -> Le rx.exceptions.OnErrorFailedException -> L11 rx.exceptions.OnCompletedFailedException -> L14
            goto L17
        Lc:
            r5 = move-exception
            goto L46
        Le:
            r5 = move-exception
            goto L80
        L11:
            r5 = move-exception
            goto L80
        L14:
            r5 = move-exception
            goto L80
        L17:
            boolean r5 = r4.isUnsubscribed()     // Catch: java.lang.Throwable -> L23 rx.exceptions.OnErrorNotImplementedException -> L25 rx.exceptions.OnErrorFailedException -> L27 rx.exceptions.OnCompletedFailedException -> L29
            if (r5 != 0) goto L7f
            rx.l<? super retrofit2.c0<T>> r5 = r4.b     // Catch: java.lang.Throwable -> L23 rx.exceptions.OnErrorNotImplementedException -> L25 rx.exceptions.OnErrorFailedException -> L27 rx.exceptions.OnCompletedFailedException -> L29
            r5.onCompleted()     // Catch: java.lang.Throwable -> L23 rx.exceptions.OnErrorNotImplementedException -> L25 rx.exceptions.OnErrorFailedException -> L27 rx.exceptions.OnCompletedFailedException -> L29
            return
        L23:
            r5 = move-exception
            goto L2b
        L25:
            r5 = move-exception
            goto L3a
        L27:
            r5 = move-exception
            goto L3a
        L29:
            r5 = move-exception
            goto L3a
        L2b:
            rx.exceptions.a.e(r5)
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.b r0 = r0.b()
            r0.a(r5)
            goto L7f
        L3a:
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.b r0 = r0.b()
            r0.a(r5)
            goto L7f
        L46:
            rx.exceptions.a.e(r5)
            rx.l<? super retrofit2.c0<T>> r0 = r4.b     // Catch: java.lang.Throwable -> L4f rx.exceptions.OnErrorNotImplementedException -> L51 rx.exceptions.OnErrorFailedException -> L53 rx.exceptions.OnCompletedFailedException -> L55
            r0.onError(r5)     // Catch: java.lang.Throwable -> L4f rx.exceptions.OnErrorNotImplementedException -> L51 rx.exceptions.OnErrorFailedException -> L53 rx.exceptions.OnCompletedFailedException -> L55
            goto L7f
        L4f:
            r0 = move-exception
            goto L57
        L51:
            r5 = move-exception
            goto L74
        L53:
            r5 = move-exception
            goto L74
        L55:
            r5 = move-exception
            goto L74
        L57:
            rx.exceptions.a.e(r0)
            rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r1.<init>(r2)
            rx.plugins.f r5 = rx.plugins.f.c()
            rx.plugins.b r5 = r5.b()
            r5.a(r1)
            goto L7f
        L74:
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.b r0 = r0.b()
            r0.a(r5)
        L7f:
            return
        L80:
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.b r0 = r0.b()
            r0.a(r5)
            return
    }

    void b(java.lang.Throwable r5) {
            r4 = this;
            r0 = 3
            r4.set(r0)
            boolean r0 = r4.isUnsubscribed()
            if (r0 != 0) goto L40
            rx.l<? super retrofit2.c0<T>> r0 = r4.b     // Catch: java.lang.Throwable -> L10 rx.exceptions.OnErrorNotImplementedException -> L12 rx.exceptions.OnErrorFailedException -> L14 rx.exceptions.OnCompletedFailedException -> L16
            r0.onError(r5)     // Catch: java.lang.Throwable -> L10 rx.exceptions.OnErrorNotImplementedException -> L12 rx.exceptions.OnErrorFailedException -> L14 rx.exceptions.OnCompletedFailedException -> L16
            return
        L10:
            r0 = move-exception
            goto L18
        L12:
            r5 = move-exception
            goto L35
        L14:
            r5 = move-exception
            goto L35
        L16:
            r5 = move-exception
            goto L35
        L18:
            rx.exceptions.a.e(r0)
            rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r1.<init>(r2)
            rx.plugins.f r5 = rx.plugins.f.c()
            rx.plugins.b r5 = r5.b()
            r5.a(r1)
            goto L40
        L35:
            rx.plugins.f r0 = rx.plugins.f.c()
            rx.plugins.b r0 = r0.b()
            r0.a(r5)
        L40:
            return
    }

    void d(retrofit2.c0<T> r5) {
            r4 = this;
        L0:
            int r0 = r4.get()
            r1 = 2
            if (r0 == 0) goto L36
            r2 = 3
            r3 = 1
            if (r0 == r3) goto L2c
            if (r0 == r1) goto L26
            if (r0 == r2) goto L26
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown state: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L26:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L2c:
            boolean r0 = r4.compareAndSet(r3, r2)
            if (r0 == 0) goto L0
            r4.a(r5)
            return
        L36:
            r4.d = r5
            r0 = 0
            boolean r0 = r4.compareAndSet(r0, r1)
            if (r0 == 0) goto L0
            return
    }

    @Override // rx.m
    public boolean isUnsubscribed() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // rx.g
    public void request(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            goto L41
        L7:
            int r4 = r3.get()
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 == r5) goto L41
            r5 = 3
            r0 = 2
            if (r4 == r0) goto L2e
            if (r4 != r5) goto L17
            goto L41
        L17:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L2e:
            boolean r4 = r3.compareAndSet(r0, r5)
            if (r4 == 0) goto L7
            retrofit2.c0<T> r4 = r3.d
            r3.a(r4)
            return
        L3a:
            r4 = 0
            boolean r4 = r3.compareAndSet(r4, r5)
            if (r4 == 0) goto L7
        L41:
            return
    }

    @Override // rx.m
    public void unsubscribe() {
            r1 = this;
            r0 = 1
            r1.c = r0
            retrofit2.b<T> r0 = r1.a
            r0.cancel()
            return
    }
}
