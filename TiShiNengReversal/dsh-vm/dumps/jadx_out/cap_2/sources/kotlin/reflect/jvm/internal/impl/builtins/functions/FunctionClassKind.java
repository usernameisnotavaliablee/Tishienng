package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum FunctionClassKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.a Companion = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind Function = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind KFunction = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind KSuspendFunction = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind SuspendFunction = null;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind UNKNOWN = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.functions.e r2) {
                r1 = this;
                java.lang.String r0 = "functionTypeKind"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.a.f
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Function
                return r2
            L10:
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$d r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.d.f
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 == 0) goto L1b
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.SuspendFunction
                return r2
            L1b:
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$b r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.b.f
                boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r0 == 0) goto L26
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KFunction
                return r2
            L26:
                kotlin.reflect.jvm.internal.impl.builtins.functions.e$c r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.c.f
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
                if (r2 == 0) goto L31
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KSuspendFunction
                return r2
            L31:
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.UNKNOWN
                return r2
        }
    }

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] $values() {
            r0 = 5
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[r0]
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Function
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.SuspendFunction
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KFunction
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KSuspendFunction
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.UNKNOWN
            r2 = 4
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind
            java.lang.String r1 = "Function"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Function = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind
            java.lang.String r1 = "SuspendFunction"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.SuspendFunction = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind
            java.lang.String r1 = "KFunction"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KFunction = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind
            java.lang.String r1 = "KSuspendFunction"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KSuspendFunction = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind
            java.lang.String r1 = "UNKNOWN"
            r2 = 4
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.UNKNOWN = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.$ENTRIES = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Companion = r0
            return
    }

    FunctionClassKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind> r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] values() {
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] r0 = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[]) r0
            return r0
    }
}
