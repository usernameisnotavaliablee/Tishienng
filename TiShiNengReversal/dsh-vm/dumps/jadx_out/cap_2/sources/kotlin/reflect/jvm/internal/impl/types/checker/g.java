package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class g extends kotlin.reflect.jvm.internal.impl.types.s {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.types.checker.g {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.types.checker.g.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.checker.g$a r0 = new kotlin.reflect.jvm.internal.impl.types.checker.g$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.types.checker.g.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.s
        public /* bridge */ /* synthetic */ d4.g a(d4.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r0.h(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
                r1 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @org.jetbrains.annotations.NotNull
        public <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> S c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends S> r3) {
                r1 = this;
                java.lang.String r0 = "classDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "compute"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.Object r2 = r3.invoke()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r2
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
                r1 = this;
                java.lang.String r0 = "moduleDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r2) {
                r1 = this;
                java.lang.String r0 = "typeConstructor"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f f(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.i(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
                r1 = this;
                java.lang.String r0 = "classDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
                java.util.Collection r2 = r2.i()
                java.lang.String r0 = "getSupertypes(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.t0 h(@org.jetbrains.annotations.NotNull d4.g r2) {
                r1 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                return r2
        }

        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.d i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1);

    @org.jetbrains.annotations.NotNull
    public abstract <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> S c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends S> r2);

    public abstract boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1);

    public abstract boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r1);

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.f f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1);

    @org.jetbrains.annotations.NotNull
    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1);

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.t0 h(@org.jetbrains.annotations.NotNull d4.g r1);
}
