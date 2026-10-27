package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class f2 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.f2.b a = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.f2 b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.types.f2 {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.c2 e(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
                r0 = this;
                java.lang.Void r1 = r0.i(r1)
                kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public boolean f() {
                r1 = this;
                r0 = 1
                return r0
        }

        public java.lang.Void i(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Empty TypeSubstitution"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.types.f2 {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.f2 c;

        c(kotlin.reflect.jvm.internal.impl.types.f2 r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public boolean a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public boolean b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
                r1 = this;
                java.lang.String r0 = "annotations"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r0.d(r2)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public kotlin.reflect.jvm.internal.impl.types.c2 e(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
                kotlin.reflect.jvm.internal.impl.types.c2 r2 = r0.e(r2)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public boolean f() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
                boolean r0 = r0.f()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.f2
        public kotlin.reflect.jvm.internal.impl.types.t0 g(kotlin.reflect.jvm.internal.impl.types.t0 r2, kotlin.reflect.jvm.internal.impl.types.Variance r3) {
                r1 = this;
                java.lang.String r0 = "topLevelType"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "position"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = r0.g(r2, r3)
                return r2
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.f2$b r0 = new kotlin.reflect.jvm.internal.impl.types.f2$b
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.f2.a = r0
            kotlin.reflect.jvm.internal.impl.types.f2$a r0 = new kotlin.reflect.jvm.internal.impl.types.f2$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.f2.b = r0
            return
    }

    public f2() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.h2 c() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.g(r2)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1);

    public boolean f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r3) {
            r1 = this;
            java.lang.String r0 = "topLevelType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "position"
            kotlin.jvm.internal.g0.p(r3, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.f2 h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2$c r0 = new kotlin.reflect.jvm.internal.impl.types.f2$c
            r0.<init>(r1)
            return r0
    }
}
