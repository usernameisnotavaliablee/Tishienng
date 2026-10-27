package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface k extends kotlin.reflect.jvm.internal.impl.resolve.scopes.n {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a a = null;

        @org.jetbrains.annotations.NotNull
        private static final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> b = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.a = r0
                kotlin.reflect.jvm.internal.impl.resolve.scopes.j r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.b = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static final boolean a(kotlin.reflect.jvm.internal.impl.name.f r1) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r1, r0)
                r1 = 1
                return r1
        }

        static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.name.f r0) {
                boolean r0 = a(r0)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> c() {
                r1 = this;
                kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        public static void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.n.a.b(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c b = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b = r0
                return
        }

        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.a
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a = r0
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

    @org.jetbrains.annotations.NotNull
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b();

    @org.jetbrains.annotations.NotNull
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

    @org.jetbrains.annotations.NotNull
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d();

    @org.jetbrains.annotations.Nullable
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f();
}
