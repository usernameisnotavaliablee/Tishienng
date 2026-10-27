package com.trello.rxlifecycle2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<R> implements io.reactivex.functions.Predicate<R> {
        final /* synthetic */ java.lang.Object a;

        a(java.lang.Object r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean test(R r2) throws java.lang.Exception {
                r1 = this;
                java.lang.Object r0 = r1.a
                boolean r2 = r2.equals(r0)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<R> implements io.reactivex.functions.BiFunction<R, R, java.lang.Boolean> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.Boolean a(R r1, R r2) throws java.lang.Exception {
                r0 = this;
                boolean r1 = r2.equals(r1)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                java.lang.Boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    private d() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances"
            r0.<init>(r1)
            throw r0
    }

    @javax.annotation.Nonnull
    @javax.annotation.CheckReturnValue
    public static <T, R> com.trello.rxlifecycle2.c<T> a(@javax.annotation.Nonnull io.reactivex.Observable<R> r1) {
            com.trello.rxlifecycle2.c r0 = new com.trello.rxlifecycle2.c
            r0.<init>(r1)
            return r0
    }

    @javax.annotation.Nonnull
    @javax.annotation.CheckReturnValue
    public static <T, R> com.trello.rxlifecycle2.c<T> b(@javax.annotation.Nonnull io.reactivex.Observable<R> r1, @javax.annotation.Nonnull io.reactivex.functions.Function<R, R> r2) {
            java.lang.String r0 = "lifecycle == null"
            z2.a.a(r1, r0)
            java.lang.String r0 = "correspondingEvents == null"
            z2.a.a(r2, r0)
            io.reactivex.Observable r1 = r1.share()
            io.reactivex.Observable r1 = d(r1, r2)
            com.trello.rxlifecycle2.c r1 = a(r1)
            return r1
    }

    @javax.annotation.Nonnull
    @javax.annotation.CheckReturnValue
    public static <T, R> com.trello.rxlifecycle2.c<T> c(@javax.annotation.Nonnull io.reactivex.Observable<R> r1, @javax.annotation.Nonnull R r2) {
            java.lang.String r0 = "lifecycle == null"
            z2.a.a(r1, r0)
            java.lang.String r0 = "event == null"
            z2.a.a(r2, r0)
            io.reactivex.Observable r1 = e(r1, r2)
            com.trello.rxlifecycle2.c r1 = a(r1)
            return r1
    }

    private static <R> io.reactivex.Observable<java.lang.Boolean> d(io.reactivex.Observable<R> r3, io.reactivex.functions.Function<R, R> r4) {
            r0 = 1
            io.reactivex.Observable r2 = r3.take(r0)
            io.reactivex.Observable r4 = r2.map(r4)
            io.reactivex.Observable r3 = r3.skip(r0)
            com.trello.rxlifecycle2.d$b r0 = new com.trello.rxlifecycle2.d$b
            r0.<init>()
            io.reactivex.Observable r3 = io.reactivex.Observable.combineLatest(r4, r3, r0)
            io.reactivex.functions.Function<java.lang.Throwable, java.lang.Boolean> r4 = com.trello.rxlifecycle2.a.a
            io.reactivex.Observable r3 = r3.onErrorReturn(r4)
            io.reactivex.functions.Predicate<java.lang.Boolean> r4 = com.trello.rxlifecycle2.a.b
            io.reactivex.Observable r3 = r3.filter(r4)
            return r3
    }

    private static <R> io.reactivex.Observable<R> e(io.reactivex.Observable<R> r1, R r2) {
            com.trello.rxlifecycle2.d$a r0 = new com.trello.rxlifecycle2.d$a
            r0.<init>(r2)
            io.reactivex.Observable r1 = r1.filter(r0)
            return r1
    }
}
