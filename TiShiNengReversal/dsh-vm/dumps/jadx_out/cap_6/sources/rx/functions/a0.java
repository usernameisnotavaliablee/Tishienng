package rx.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.x a;

        a(rx.functions.x r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r13) {
                r12 = this;
                int r0 = r13.length
                r1 = 9
                if (r0 != r1) goto L28
                rx.functions.x r2 = r12.a
                r0 = 0
                r3 = r13[r0]
                r0 = 1
                r4 = r13[r0]
                r0 = 2
                r5 = r13[r0]
                r0 = 3
                r6 = r13[r0]
                r0 = 4
                r7 = r13[r0]
                r0 = 5
                r8 = r13[r0]
                r0 = 6
                r9 = r13[r0]
                r0 = 7
                r10 = r13[r0]
                r0 = 8
                r11 = r13[r0]
                java.lang.Object r13 = r2.call(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r13
            L28:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func9 expecting 9 arguments."
                r13.<init>(r0)
                throw r13
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements rx.functions.y<java.lang.Void> {
        final /* synthetic */ rx.functions.a a;

        b(rx.functions.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.call2(r1)
                return r1
        }

        @Override // rx.functions.y
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Void call2(java.lang.Object... r2) {
                r1 = this;
                int r2 = r2.length
                if (r2 != 0) goto La
                rx.functions.a r2 = r1.a
                r2.call()
                r2 = 0
                return r2
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Action0 expecting 0 arguments."
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements rx.functions.y<java.lang.Void> {
        final /* synthetic */ rx.functions.b a;

        c(rx.functions.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.call2(r1)
                return r1
        }

        @Override // rx.functions.y
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Void call2(java.lang.Object... r3) {
                r2 = this;
                int r0 = r3.length
                r1 = 1
                if (r0 != r1) goto Le
                rx.functions.b r0 = r2.a
                r1 = 0
                r3 = r3[r1]
                r0.call(r3)
                r3 = 0
                return r3
            Le:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Action1 expecting 1 argument."
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d implements rx.functions.y<java.lang.Void> {
        final /* synthetic */ rx.functions.c a;

        d(rx.functions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.call2(r1)
                return r1
        }

        @Override // rx.functions.y
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Void call2(java.lang.Object... r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 2
                if (r0 != r1) goto L11
                rx.functions.c r0 = r3.a
                r1 = 0
                r1 = r4[r1]
                r2 = 1
                r4 = r4[r2]
                r0.call(r1, r4)
                r4 = 0
                return r4
            L11:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Action3 expecting 2 arguments."
                r4.<init>(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e implements rx.functions.y<java.lang.Void> {
        final /* synthetic */ rx.functions.d a;

        e(rx.functions.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.call2(r1)
                return r1
        }

        @Override // rx.functions.y
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Void call2(java.lang.Object... r5) {
                r4 = this;
                int r0 = r5.length
                r1 = 3
                if (r0 != r1) goto L14
                rx.functions.d r0 = r4.a
                r1 = 0
                r1 = r5[r1]
                r2 = 1
                r2 = r5[r2]
                r3 = 2
                r5 = r5[r3]
                r0.call(r1, r2, r5)
                r5 = 0
                return r5
            L14:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Action3 expecting 3 arguments."
                r5.<init>(r0)
                throw r5
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.o a;

        f(rx.functions.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r2) {
                r1 = this;
                int r2 = r2.length
                if (r2 != 0) goto La
                rx.functions.o r2 = r1.a
                java.lang.Object r2 = r2.call()
                return r2
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func0 expecting 0 arguments."
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.p a;

        g(rx.functions.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r3) {
                r2 = this;
                int r0 = r3.length
                r1 = 1
                if (r0 != r1) goto Le
                rx.functions.p r0 = r2.a
                r1 = 0
                r3 = r3[r1]
                java.lang.Object r3 = r0.call(r3)
                return r3
            Le:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func1 expecting 1 argument."
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class h<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.q a;

        h(rx.functions.q r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 2
                if (r0 != r1) goto L11
                rx.functions.q r0 = r3.a
                r1 = 0
                r1 = r4[r1]
                r2 = 1
                r4 = r4[r2]
                java.lang.Object r4 = r0.call(r1, r4)
                return r4
            L11:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func2 expecting 2 arguments."
                r4.<init>(r0)
                throw r4
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class i<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.r a;

        i(rx.functions.r r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r5) {
                r4 = this;
                int r0 = r5.length
                r1 = 3
                if (r0 != r1) goto L14
                rx.functions.r r0 = r4.a
                r1 = 0
                r1 = r5[r1]
                r2 = 1
                r2 = r5[r2]
                r3 = 2
                r5 = r5[r3]
                java.lang.Object r5 = r0.call(r1, r2, r5)
                return r5
            L14:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func3 expecting 3 arguments."
                r5.<init>(r0)
                throw r5
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class j<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.s a;

        j(rx.functions.s r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r6) {
                r5 = this;
                int r0 = r6.length
                r1 = 4
                if (r0 != r1) goto L17
                rx.functions.s r0 = r5.a
                r1 = 0
                r1 = r6[r1]
                r2 = 1
                r2 = r6[r2]
                r3 = 2
                r3 = r6[r3]
                r4 = 3
                r6 = r6[r4]
                java.lang.Object r6 = r0.call(r1, r2, r3, r6)
                return r6
            L17:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func4 expecting 4 arguments."
                r6.<init>(r0)
                throw r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class k<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.t a;

        k(rx.functions.t r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r9) {
                r8 = this;
                int r0 = r9.length
                r1 = 5
                if (r0 != r1) goto L1a
                rx.functions.t r2 = r8.a
                r0 = 0
                r3 = r9[r0]
                r0 = 1
                r4 = r9[r0]
                r0 = 2
                r5 = r9[r0]
                r0 = 3
                r6 = r9[r0]
                r0 = 4
                r7 = r9[r0]
                java.lang.Object r9 = r2.call(r3, r4, r5, r6, r7)
                return r9
            L1a:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func5 expecting 5 arguments."
                r9.<init>(r0)
                throw r9
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class l<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.u a;

        l(rx.functions.u r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r10) {
                r9 = this;
                int r0 = r10.length
                r1 = 6
                if (r0 != r1) goto L1d
                rx.functions.u r2 = r9.a
                r0 = 0
                r3 = r10[r0]
                r0 = 1
                r4 = r10[r0]
                r0 = 2
                r5 = r10[r0]
                r0 = 3
                r6 = r10[r0]
                r0 = 4
                r7 = r10[r0]
                r0 = 5
                r8 = r10[r0]
                java.lang.Object r10 = r2.call(r3, r4, r5, r6, r7, r8)
                return r10
            L1d:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func6 expecting 6 arguments."
                r10.<init>(r0)
                throw r10
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class m<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.v a;

        m(rx.functions.v r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r11) {
                r10 = this;
                int r0 = r11.length
                r1 = 7
                if (r0 != r1) goto L20
                rx.functions.v r2 = r10.a
                r0 = 0
                r3 = r11[r0]
                r0 = 1
                r4 = r11[r0]
                r0 = 2
                r5 = r11[r0]
                r0 = 3
                r6 = r11[r0]
                r0 = 4
                r7 = r11[r0]
                r0 = 5
                r8 = r11[r0]
                r0 = 6
                r9 = r11[r0]
                java.lang.Object r11 = r2.call(r3, r4, r5, r6, r7, r8, r9)
                return r11
            L20:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func7 expecting 7 arguments."
                r11.<init>(r0)
                throw r11
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class n<R> implements rx.functions.y<R> {
        final /* synthetic */ rx.functions.w a;

        n(rx.functions.w r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // rx.functions.y
        public R call(java.lang.Object... r12) {
                r11 = this;
                int r0 = r12.length
                r1 = 8
                if (r0 != r1) goto L24
                rx.functions.w r2 = r11.a
                r0 = 0
                r3 = r12[r0]
                r0 = 1
                r4 = r12[r0]
                r0 = 2
                r5 = r12[r0]
                r0 = 3
                r6 = r12[r0]
                r0 = 4
                r7 = r12[r0]
                r0 = 5
                r8 = r12[r0]
                r0 = 6
                r9 = r12[r0]
                r0 = 7
                r10 = r12[r0]
                java.lang.Object r12 = r2.call(r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            L24:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Func8 expecting 8 arguments."
                r12.<init>(r0)
                throw r12
        }
    }

    private a0() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static rx.functions.y<java.lang.Void> a(rx.functions.a r1) {
            rx.functions.a0$b r0 = new rx.functions.a0$b
            r0.<init>(r1)
            return r0
    }

    public static <T0> rx.functions.y<java.lang.Void> b(rx.functions.b<? super T0> r1) {
            rx.functions.a0$c r0 = new rx.functions.a0$c
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1> rx.functions.y<java.lang.Void> c(rx.functions.c<? super T0, ? super T1> r1) {
            rx.functions.a0$d r0 = new rx.functions.a0$d
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2> rx.functions.y<java.lang.Void> d(rx.functions.d<? super T0, ? super T1, ? super T2> r1) {
            rx.functions.a0$e r0 = new rx.functions.a0$e
            r0.<init>(r1)
            return r0
    }

    public static <R> rx.functions.y<R> e(rx.functions.o<? extends R> r1) {
            rx.functions.a0$f r0 = new rx.functions.a0$f
            r0.<init>(r1)
            return r0
    }

    public static <T0, R> rx.functions.y<R> f(rx.functions.p<? super T0, ? extends R> r1) {
            rx.functions.a0$g r0 = new rx.functions.a0$g
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, R> rx.functions.y<R> g(rx.functions.q<? super T0, ? super T1, ? extends R> r1) {
            rx.functions.a0$h r0 = new rx.functions.a0$h
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, R> rx.functions.y<R> h(rx.functions.r<? super T0, ? super T1, ? super T2, ? extends R> r1) {
            rx.functions.a0$i r0 = new rx.functions.a0$i
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, T3, R> rx.functions.y<R> i(rx.functions.s<? super T0, ? super T1, ? super T2, ? super T3, ? extends R> r1) {
            rx.functions.a0$j r0 = new rx.functions.a0$j
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, T3, T4, R> rx.functions.y<R> j(rx.functions.t<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r1) {
            rx.functions.a0$k r0 = new rx.functions.a0$k
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, T3, T4, T5, R> rx.functions.y<R> k(rx.functions.u<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r1) {
            rx.functions.a0$l r0 = new rx.functions.a0$l
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, T3, T4, T5, T6, R> rx.functions.y<R> l(rx.functions.v<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r1) {
            rx.functions.a0$m r0 = new rx.functions.a0$m
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, R> rx.functions.y<R> m(rx.functions.w<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r1) {
            rx.functions.a0$n r0 = new rx.functions.a0$n
            r0.<init>(r1)
            return r0
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, R> rx.functions.y<R> n(rx.functions.x<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r1) {
            rx.functions.a0$a r0 = new rx.functions.a0$a
            r0.<init>(r1)
            return r0
    }
}
