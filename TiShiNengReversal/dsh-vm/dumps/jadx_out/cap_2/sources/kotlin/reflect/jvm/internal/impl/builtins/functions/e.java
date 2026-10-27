package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;
    private final boolean c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.b d;
    private final boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.builtins.functions.e {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e.a f = null;

        static {
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.e$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.builtins.functions.e.a.f = r0
                return
        }

        private a() {
                r6 = this;
                kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.B
                r4 = 0
                r5 = 1
                java.lang.String r2 = "Function"
                r3 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.builtins.functions.e {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e.b f = null;

        static {
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$b r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.e$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.builtins.functions.e.b.f = r0
                return
        }

        private b() {
                r6 = this;
                kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.y
                r4 = 0
                r5 = 0
                java.lang.String r2 = "KFunction"
                r3 = 1
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.reflect.jvm.internal.impl.builtins.functions.e {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e.c f = null;

        static {
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$c r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.e$c
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.builtins.functions.e.c.f = r0
                return
        }

        private c() {
                r6 = this;
                kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.y
                r4 = 0
                r5 = 0
                java.lang.String r2 = "KSuspendFunction"
                r3 = 1
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.reflect.jvm.internal.impl.builtins.functions.e {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e.d f = null;

        static {
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$d r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.e$d
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.builtins.functions.e.d.f = r0
                return
        }

        private d() {
                r6 = this;
                kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.s
                r4 = 0
                r5 = 1
                java.lang.String r2 = "SuspendFunction"
                r3 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull java.lang.String r3, boolean r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.b r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "classNamePrefix"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f c(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.name.f.h(r3)
            java.lang.String r0 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.a
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            r1 = 78
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
