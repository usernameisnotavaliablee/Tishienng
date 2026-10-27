package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c {
    private static final rx.f<java.lang.Object> a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.f<java.lang.Object> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r0 = this;
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.exceptions.OnErrorNotImplementedException r0 = new rx.exceptions.OnErrorNotImplementedException
                r0.<init>(r2)
                throw r0
        }

        public final void onNext(java.lang.Object r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<T> implements rx.f<T> {
        final /* synthetic */ rx.functions.b a;

        b(rx.functions.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r0 = this;
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.exceptions.OnErrorNotImplementedException r0 = new rx.exceptions.OnErrorNotImplementedException
                r0.<init>(r2)
                throw r0
        }

        public final void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                r0.call(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.observers.c$c, reason: collision with other inner class name */
    static class C0050c<T> implements rx.f<T> {
        final /* synthetic */ rx.functions.b a;
        final /* synthetic */ rx.functions.b b;

        C0050c(rx.functions.b r1, rx.functions.b r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r0 = this;
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.a
                r0.call(r2)
                return
        }

        public final void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.b
                r0.call(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d<T> implements rx.f<T> {
        final /* synthetic */ rx.functions.a a;
        final /* synthetic */ rx.functions.b b;
        final /* synthetic */ rx.functions.b c;

        d(rx.functions.a r1, rx.functions.b r2, rx.functions.b r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public final void onCompleted() {
                r1 = this;
                rx.functions.a r0 = r1.a
                r0.call()
                return
        }

        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.functions.b r0 = r1.b
                r0.call(r2)
                return
        }

        public final void onNext(T r2) {
                r1 = this;
                rx.functions.b r0 = r1.c
                r0.call(r2)
                return
        }
    }

    static {
            rx.observers.c$a r0 = new rx.observers.c$a
            r0.<init>()
            rx.observers.c.a = r0
            return
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> rx.f<T> a(rx.functions.b<? super T> r1) {
            if (r1 == 0) goto L8
            rx.observers.c$b r0 = new rx.observers.c$b
            r0.<init>(r1)
            return r0
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onNext can not be null"
            r1.<init>(r0)
            throw r1
    }

    public static <T> rx.f<T> b(rx.functions.b<? super T> r1, rx.functions.b<java.lang.Throwable> r2) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto La
            rx.observers.c$c r0 = new rx.observers.c$c
            r0.<init>(r2, r1)
            return r0
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onError can not be null"
            r1.<init>(r2)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onNext can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> rx.f<T> c(rx.functions.b<? super T> r1, rx.functions.b<java.lang.Throwable> r2, rx.functions.a r3) {
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L14
            if (r3 == 0) goto Lc
            rx.observers.c$d r0 = new rx.observers.c$d
            r0.<init>(r3, r2, r1)
            return r0
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onComplete can not be null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onError can not be null"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "onNext can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> rx.f<T> d() {
            rx.f<java.lang.Object> r0 = rx.observers.c.a
            return r0
    }
}
