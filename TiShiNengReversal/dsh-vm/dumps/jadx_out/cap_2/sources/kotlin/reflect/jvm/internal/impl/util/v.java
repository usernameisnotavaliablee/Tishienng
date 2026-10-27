package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class v implements kotlin.reflect.jvm.internal.impl.util.f {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.builtins.j, kotlin.reflect.jvm.internal.impl.types.t0> b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.v {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.v.a d = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.v$a r0 = new kotlin.reflect.jvm.internal.impl.util.v$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.v.a.d = r0
                return
        }

        private a() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.util.u r0 = kotlin.reflect.jvm.internal.impl.util.u.a
                r1 = 0
                java.lang.String r2 = "Boolean"
                r3.<init>(r2, r0, r1)
                return
        }

        private static final kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.builtins.j r1) {
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r1, r0)
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.o()
                java.lang.String r0 = "getBooleanType(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                return r1
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.builtins.j r0) {
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = c(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.util.v {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.v.b d = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.v$b r0 = new kotlin.reflect.jvm.internal.impl.util.v$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.v.b.d = r0
                return
        }

        private b() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.util.w r0 = kotlin.reflect.jvm.internal.impl.util.w.a
                r1 = 0
                java.lang.String r2 = "Int"
                r3.<init>(r2, r0, r1)
                return
        }

        private static final kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.builtins.j r1) {
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r1, r0)
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.E()
                java.lang.String r0 = "getIntType(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                return r1
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.builtins.j r0) {
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = c(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.util.v {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.util.v.c d = null;

        static {
                kotlin.reflect.jvm.internal.impl.util.v$c r0 = new kotlin.reflect.jvm.internal.impl.util.v$c
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.util.v.c.d = r0
                return
        }

        private c() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.util.x r0 = kotlin.reflect.jvm.internal.impl.util.x.a
                r1 = 0
                java.lang.String r2 = "Unit"
                r3.<init>(r2, r0, r1)
                return
        }

        private static final kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.builtins.j r1) {
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r1, r0)
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.a0()
                java.lang.String r0 = "getUnitType(...)"
                kotlin.jvm.internal.g0.o(r1, r0)
                return r1
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.builtins.j r0) {
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = c(r0)
                return r0
        }
    }

    private v(java.lang.String r2, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.builtins.j, ? extends kotlin.reflect.jvm.internal.impl.types.t0> r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "must return "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.c = r2
            return
    }

    public /* synthetic */ v(java.lang.String r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.Nullable
    public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r1) {
            r0 = this;
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.util.f.a.a(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r3) {
            r2 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getReturnType()
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.builtins.j, kotlin.reflect.jvm.internal.impl.types.t0> r1 = r2.b
            kotlin.reflect.jvm.internal.impl.builtins.j r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r3)
            java.lang.Object r3 = r1.invoke(r3)
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }
}
