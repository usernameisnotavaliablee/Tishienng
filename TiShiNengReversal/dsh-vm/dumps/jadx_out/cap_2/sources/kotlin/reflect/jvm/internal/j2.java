package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class j2<T, V> extends kotlin.reflect.jvm.internal.p2<V> implements kotlin.reflect.p<T, V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<kotlin.reflect.jvm.internal.j2.a<T, V>> o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<java.lang.reflect.Member> p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<T, V> extends kotlin.reflect.jvm.internal.p2.c<V> implements kotlin.reflect.p.a<T, V> {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.j2<T, V> j;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.j2<T, ? extends V> r2) {
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
                kotlin.reflect.jvm.internal.j2 r0 = r1.l0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.p2.a
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.p2 f0() {
                r1 = this;
                kotlin.reflect.jvm.internal.j2 r0 = r1.l0()
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.j2 r0 = r1.l0()
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.j2<T, V> l0() {
                r1 = this;
                kotlin.reflect.jvm.internal.j2<T, V> r0 = r1.j
                return r0
        }
    }

    public j2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2, r3, r4, r5)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.h2 r3 = new kotlin.reflect.jvm.internal.h2
            r3.<init>(r1)
            kotlin.s r3 = kotlin.t.b(r2, r3)
            r1.o = r3
            kotlin.reflect.jvm.internal.i2 r3 = new kotlin.reflect.jvm.internal.i2
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.p = r2
            return
    }

    public j2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r3) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.h2 r3 = new kotlin.reflect.jvm.internal.h2
            r3.<init>(r1)
            kotlin.s r3 = kotlin.t.b(r2, r3)
            r1.o = r3
            kotlin.reflect.jvm.internal.i2 r3 = new kotlin.reflect.jvm.internal.i2
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.p = r2
            return
    }

    private static final kotlin.reflect.jvm.internal.j2.a q0(kotlin.reflect.jvm.internal.j2 r1) {
            kotlin.reflect.jvm.internal.j2$a r0 = new kotlin.reflect.jvm.internal.j2$a
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.j2.a r0(kotlin.reflect.jvm.internal.j2 r0) {
            kotlin.reflect.jvm.internal.j2$a r0 = q0(r0)
            return r0
    }

    static /* synthetic */ java.lang.reflect.Member s0(kotlin.reflect.jvm.internal.j2 r0) {
            java.lang.reflect.Member r0 = t0(r0)
            return r0
    }

    private static final java.lang.reflect.Member t0(kotlin.reflect.jvm.internal.j2 r0) {
            java.lang.reflect.Member r0 = r0.j0()
            return r0
    }

    @Override // kotlin.reflect.p
    public V get(T r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.j2$a r0 = r3.u0()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.Object r4 = r0.call(r1)
            return r4
    }

    @Override // kotlin.reflect.p
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getDelegate(T r3) {
            r2 = this;
            kotlin.s<java.lang.reflect.Member> r0 = r2.p
            java.lang.Object r0 = r0.getValue()
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            r1 = 0
            java.lang.Object r3 = r2.l0(r0, r3, r1)
            return r3
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.n.c getGetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.j2$a r0 = r1.u0()
            return r0
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.p.a getGetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.j2$a r0 = r1.u0()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.p2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.p2.c n0() {
            r1 = this;
            kotlin.reflect.jvm.internal.j2$a r0 = r1.u0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.j2.a<T, V> u0() {
            r1 = this;
            kotlin.s<kotlin.reflect.jvm.internal.j2$a<T, V>> r0 = r1.o
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.j2$a r0 = (kotlin.reflect.jvm.internal.j2.a) r0
            return r0
    }
}
