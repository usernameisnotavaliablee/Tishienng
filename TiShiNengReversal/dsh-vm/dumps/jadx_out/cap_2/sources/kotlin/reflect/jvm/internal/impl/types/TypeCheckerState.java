package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class TypeCheckerState {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    @org.jetbrains.annotations.NotNull
    private final d4.r e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.r f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.s g;
    private int h;
    private boolean i;

    @org.jetbrains.annotations.Nullable
    private java.util.ArrayDeque<d4.h> j;

    @org.jetbrains.annotations.Nullable
    private java.util.Set<d4.h> k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LowerCapturedTypePolicy extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy CHECK_ONLY_LOWER = null;
        public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER = null;
        public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy SKIP_LOWER = null;

        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[] $values() {
                r0 = 3
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy[] r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[r0]
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r1 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r1 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r1 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy
                java.lang.String r1 = "CHECK_ONLY_LOWER"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER = r0
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy
                java.lang.String r1 = "CHECK_SUBTYPE_AND_LOWER"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER = r0
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy
                java.lang.String r1 = "SKIP_LOWER"
                r2 = 2
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER = r0
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy[] r0 = $values()
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.$ENTRIES = r0
                return
        }

        LowerCapturedTypePolicy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy> r0 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r1 = (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[] values() {
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy[] r0 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy[] r0 = (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a, reason: collision with other inner class name */
        public static final class C0072a implements kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a {
            private boolean a;

            public C0072a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a
            public void a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r2) {
                    r1 = this;
                    java.lang.String r0 = "block"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    boolean r0 = r1.a
                    if (r0 == 0) goto La
                    return
                La:
                    java.lang.Object r2 = r2.invoke()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    r1.a = r2
                    return
            }

            public final boolean b() {
                    r1 = this;
                    boolean r0 = r1.a
                    return r0
            }
        }

        void a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static abstract class a extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b {
            public a() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$LowerIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b, reason: collision with other inner class name */
        public static final class C0073b extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b.a = r0
                    return
            }

            private C0073b() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @org.jetbrains.annotations.NotNull
            public d4.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, @org.jetbrains.annotations.NotNull d4.g r3) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "type"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    d4.r r2 = r2.j()
                    d4.h r2 = r2.I(r3)
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class c extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a = r0
                    return
            }

            private c() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            public /* bridge */ /* synthetic */ d4.h a(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, d4.g r2) {
                    r0 = this;
                    java.lang.Void r1 = r0.b(r1, r2)
                    d4.h r1 = (d4.h) r1
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.Void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, @org.jetbrains.annotations.NotNull d4.g r3) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r2 = "type"
                    kotlin.jvm.internal.g0.p(r3, r2)
                    java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                    java.lang.String r3 = "Should not be called"
                    r2.<init>(r3)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$UpperIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
        public static final class d extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.d a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$d r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$d
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.d.a = r0
                    return
            }

            private d() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @org.jetbrains.annotations.NotNull
            public d4.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, @org.jetbrains.annotations.NotNull d4.g r3) {
                    r1 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "type"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    d4.r r2 = r2.j()
                    d4.h r2 = r2.B0(r3)
                    return r2
            }
        }

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

        @org.jetbrains.annotations.NotNull
        public abstract d4.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, @org.jetbrains.annotations.NotNull d4.g r2);
    }

    public TypeCheckerState(boolean r2, boolean r3, boolean r4, boolean r5, @org.jetbrains.annotations.NotNull d4.r r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.r r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.s r8) {
            r1 = this;
            java.lang.String r0 = "typeSystemContext"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "kotlinTypePreparator"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r8, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.g = r8
            return
    }

    public static final /* synthetic */ int a(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0) {
            int r0 = r0.h
            return r0
    }

    public static final /* synthetic */ void b(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0, int r1) {
            r0.h = r1
            return
    }

    public static /* synthetic */ java.lang.Boolean d(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0, d4.g r1, d4.g r2, boolean r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lc
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            java.lang.Boolean r0 = r0.c(r1, r2, r3)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: addSubtypeConstraint"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Boolean c(@org.jetbrains.annotations.NotNull d4.g r1, @org.jetbrains.annotations.NotNull d4.g r2, boolean r3) {
            r0 = this;
            java.lang.String r3 = "subType"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r1 = "superType"
            kotlin.jvm.internal.g0.p(r2, r1)
            r1 = 0
            return r1
    }

    public final void e() {
            r1 = this;
            java.util.ArrayDeque<d4.h> r0 = r1.j
            kotlin.jvm.internal.g0.m(r0)
            r0.clear()
            java.util.Set<d4.h> r0 = r1.k
            kotlin.jvm.internal.g0.m(r0)
            r0.clear()
            r0 = 0
            r1.i = r0
            return
    }

    public boolean f(@org.jetbrains.annotations.NotNull d4.g r2, @org.jetbrains.annotations.NotNull d4.g r3) {
            r1 = this;
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "superType"
            kotlin.jvm.internal.g0.p(r3, r2)
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy g(@org.jetbrains.annotations.NotNull d4.h r2, @org.jetbrains.annotations.NotNull d4.b r3) {
            r1 = this;
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "superType"
            kotlin.jvm.internal.g0.p(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r2 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayDeque<d4.h> h() {
            r1 = this;
            java.util.ArrayDeque<d4.h> r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Set<d4.h> i() {
            r1 = this;
            java.util.Set<d4.h> r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final d4.r j() {
            r1 = this;
            d4.r r0 = r1.e
            return r0
    }

    public final void k() {
            r2 = this;
            r0 = 1
            r2.i = r0
            java.util.ArrayDeque<d4.h> r0 = r2.j
            if (r0 != 0) goto Lf
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r2.j = r0
        Lf:
            java.util.Set<d4.h> r0 = r2.k
            if (r0 != 0) goto L1b
            kotlin.reflect.jvm.internal.impl.utils.k$b r0 = kotlin.reflect.jvm.internal.impl.utils.k.c
            kotlin.reflect.jvm.internal.impl.utils.k r0 = r0.a()
            r2.k = r0
        L1b:
            return
    }

    public final boolean l(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.d
            if (r0 == 0) goto L13
            d4.r r0 = r1.e
            boolean r2 = r0.N(r2)
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final boolean m() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public final boolean n() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public final boolean o() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final d4.g p(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.r r0 = r1.f
            d4.g r2 = r0.a(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final d4.g q(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.s r0 = r1.g
            d4.g r2 = r0.a(r2)
            return r2
    }

    public boolean r(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a, kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a r0 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a
            r0.<init>()
            r2.invoke(r0)
            boolean r2 = r0.b()
            return r2
    }
}
