package kotlin.properties;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.properties.a a = null;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    /* renamed from: kotlin.properties.a$a, reason: collision with other inner class name */
    public static final class C0022a<T> extends kotlin.properties.c<T> {
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlin.reflect.n<?>, T, T, kotlin.n1> b;

        public C0022a(T r1, kotlin.jvm.functions.Function3<? super kotlin.reflect.n<?>, ? super T, ? super T, kotlin.n1> r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlin.properties.c
        protected void c(kotlin.reflect.n<?> r2, T r3, T r4) {
                r1 = this;
                java.lang.String r0 = "property"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.jvm.functions.Function3<kotlin.reflect.n<?>, T, T, kotlin.n1> r0 = r1.b
                r0.invoke(r2, r3, r4)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class b<T> extends kotlin.properties.c<T> {
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlin.reflect.n<?>, T, T, java.lang.Boolean> b;

        public b(T r1, kotlin.jvm.functions.Function3<? super kotlin.reflect.n<?>, ? super T, ? super T, java.lang.Boolean> r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlin.properties.c
        protected boolean d(kotlin.reflect.n<?> r2, T r3, T r4) {
                r1 = this;
                java.lang.String r0 = "property"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.jvm.functions.Function3<kotlin.reflect.n<?>, T, T, java.lang.Boolean> r0 = r1.b
                java.lang.Object r2 = r0.invoke(r2, r3, r4)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                return r2
        }
    }

    static {
            kotlin.properties.a r0 = new kotlin.properties.a
            r0.<init>()
            kotlin.properties.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.properties.f<java.lang.Object, T> a() {
            r1 = this;
            kotlin.properties.b r0 = new kotlin.properties.b
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.properties.f<java.lang.Object, T> b(T r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.reflect.n<?>, ? super T, ? super T, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "onChange"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.properties.a$a r0 = new kotlin.properties.a$a
            r0.<init>(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.properties.f<java.lang.Object, T> c(T r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.reflect.n<?>, ? super T, ? super T, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "onChange"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.properties.a$b r0 = new kotlin.properties.a$b
            r0.<init>(r2, r3)
            return r0
    }
}
