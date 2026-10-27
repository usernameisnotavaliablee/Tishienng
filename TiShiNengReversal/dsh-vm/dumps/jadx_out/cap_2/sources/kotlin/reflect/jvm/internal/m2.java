package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class m2<D, E, V> extends kotlin.reflect.jvm.internal.p2<V> implements kotlin.reflect.q<D, E, V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<kotlin.reflect.jvm.internal.m2.a<D, E, V>> o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<java.lang.reflect.Member> p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<D, E, V> extends kotlin.reflect.jvm.internal.p2.c<V> implements kotlin.reflect.q.a<D, E, V> {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.m2<D, E, V> j;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.m2<D, E, ? extends V> r2) {
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
                kotlin.reflect.jvm.internal.m2 r0 = r1.l0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.p2.a
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.p2 f0() {
                r1 = this;
                kotlin.reflect.jvm.internal.m2 r0 = r1.l0()
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D r2, E r3) {
                r1 = this;
                kotlin.reflect.jvm.internal.m2 r0 = r1.l0()
                java.lang.Object r2 = r0.get(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.m2<D, E, V> l0() {
                r1 = this;
                kotlin.reflect.jvm.internal.m2<D, E, V> r0 = r1.j
                return r0
        }
    }

    public m2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r0 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1.<init>(r2, r3, r4, r0)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.k2 r3 = new kotlin.reflect.jvm.internal.k2
            r3.<init>(r1)
            kotlin.s r3 = kotlin.t.b(r2, r3)
            r1.o = r3
            kotlin.reflect.jvm.internal.l2 r3 = new kotlin.reflect.jvm.internal.l2
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.p = r2
            return
    }

    public m2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r3) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.k2 r3 = new kotlin.reflect.jvm.internal.k2
            r3.<init>(r1)
            kotlin.s r3 = kotlin.t.b(r2, r3)
            r1.o = r3
            kotlin.reflect.jvm.internal.l2 r3 = new kotlin.reflect.jvm.internal.l2
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.p = r2
            return
    }

    private static final kotlin.reflect.jvm.internal.m2.a q0(kotlin.reflect.jvm.internal.m2 r1) {
            kotlin.reflect.jvm.internal.m2$a r0 = new kotlin.reflect.jvm.internal.m2$a
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.m2.a r0(kotlin.reflect.jvm.internal.m2 r0) {
            kotlin.reflect.jvm.internal.m2$a r0 = q0(r0)
            return r0
    }

    static /* synthetic */ java.lang.reflect.Member s0(kotlin.reflect.jvm.internal.m2 r0) {
            java.lang.reflect.Member r0 = t0(r0)
            return r0
    }

    private static final java.lang.reflect.Member t0(kotlin.reflect.jvm.internal.m2 r0) {
            java.lang.reflect.Member r0 = r0.j0()
            return r0
    }

    @Override // kotlin.reflect.q
    public V get(D r4, E r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.m2$a r0 = r3.u0()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.Object r4 = r0.call(r1)
            return r4
    }

    @Override // kotlin.reflect.q
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getDelegate(D r2, E r3) {
            r1 = this;
            kotlin.s<java.lang.reflect.Member> r0 = r1.p
            java.lang.Object r0 = r0.getValue()
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            java.lang.Object r2 = r1.l0(r0, r2, r3)
            return r2
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.n.c getGetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.m2$a r0 = r1.u0()
            return r0
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.q.a getGetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.m2$a r0 = r1.u0()
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D r1, E r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.p2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.p2.c n0() {
            r1 = this;
            kotlin.reflect.jvm.internal.m2$a r0 = r1.u0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.m2.a<D, E, V> u0() {
            r1 = this;
            kotlin.s<kotlin.reflect.jvm.internal.m2$a<D, E, V>> r0 = r1.o
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.m2$a r0 = (kotlin.reflect.jvm.internal.m2.a) r0
            return r0
    }
}
