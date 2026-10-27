package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q1<T, V> extends kotlin.reflect.jvm.internal.j2<T, V> implements kotlin.reflect.l<T, V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<kotlin.reflect.jvm.internal.q1.a<T, V>> q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<T, V> extends kotlin.reflect.jvm.internal.p2.d<V> implements kotlin.reflect.l.a<T, V> {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.q1<T, V> j;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.q1<T, V> r2) {
                r1 = this;
                java.lang.String r0 = "property"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.j = r2
                return
        }

        @Override // kotlin.reflect.n.a
        public /* bridge */ /* synthetic */ kotlin.reflect.n c() {
                r1 = this;
                kotlin.reflect.jvm.internal.q1 r0 = r1.l0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.p2.a
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.p2 f0() {
                r1 = this;
                kotlin.reflect.jvm.internal.q1 r0 = r1.l0()
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                r0.m0(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.q1<T, V> l0() {
                r1 = this;
                kotlin.reflect.jvm.internal.q1<T, V> r0 = r1.j
                return r0
        }

        public void m0(T r2, V r3) {
                r1 = this;
                kotlin.reflect.jvm.internal.q1 r0 = r1.l0()
                r0.set(r2, r3)
                return
        }
    }

    public q1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2, r3, r4, r5)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.p1 r3 = new kotlin.reflect.jvm.internal.p1
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.q = r2
            return
    }

    public q1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r3) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.p1 r3 = new kotlin.reflect.jvm.internal.p1
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.q = r2
            return
    }

    private static final kotlin.reflect.jvm.internal.q1.a v0(kotlin.reflect.jvm.internal.q1 r1) {
            kotlin.reflect.jvm.internal.q1$a r0 = new kotlin.reflect.jvm.internal.q1$a
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.q1.a w0(kotlin.reflect.jvm.internal.q1 r0) {
            kotlin.reflect.jvm.internal.q1$a r0 = v0(r0)
            return r0
    }

    @Override // kotlin.reflect.j
    public /* bridge */ /* synthetic */ kotlin.reflect.j.a getSetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.q1$a r0 = r1.x0()
            return r0
    }

    @Override // kotlin.reflect.l, kotlin.reflect.j
    public /* bridge */ /* synthetic */ kotlin.reflect.l.a getSetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.q1$a r0 = r1.x0()
            return r0
    }

    @Override // kotlin.reflect.l
    public void set(T r4, V r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.q1$a r0 = r3.x0()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.call(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.q1.a<T, V> x0() {
            r1 = this;
            kotlin.s<kotlin.reflect.jvm.internal.q1$a<T, V>> r0 = r1.q
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.q1$a r0 = (kotlin.reflect.jvm.internal.q1.a) r0
            return r0
    }
}
