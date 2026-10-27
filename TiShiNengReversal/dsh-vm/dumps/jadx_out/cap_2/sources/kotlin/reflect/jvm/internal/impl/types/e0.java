package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e0 extends kotlin.reflect.jvm.internal.impl.types.f2 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e0.a e = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.f2 c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.f2 d;

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.f2 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r4) {
                r2 = this;
                java.lang.String r0 = "first"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "second"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r3.f()
                if (r0 == 0) goto L11
                return r4
            L11:
                boolean r0 = r4.f()
                if (r0 == 0) goto L18
                return r3
            L18:
                kotlin.reflect.jvm.internal.impl.types.e0 r0 = new kotlin.reflect.jvm.internal.impl.types.e0
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.e0$a r0 = new kotlin.reflect.jvm.internal.impl.types.e0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.e0.e = r0
            return
    }

    private e0(kotlin.reflect.jvm.internal.impl.types.f2 r1, kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            return
    }

    public /* synthetic */ e0(kotlin.reflect.jvm.internal.impl.types.f2 r1, kotlin.reflect.jvm.internal.impl.types.f2 r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.f2 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            kotlin.reflect.jvm.internal.impl.types.e0$a r0 = kotlin.reflect.jvm.internal.impl.types.e0.e
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r0.a(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            boolean r0 = r0.a()
            if (r0 != 0) goto L13
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.d
            boolean r0 = r0.a()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            boolean r0 = r0.b()
            if (r0 != 0) goto L13
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.d
            boolean r0 = r0.b()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3) {
            r2 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r2.d
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r2.c
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r1.d(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r0.d(r3)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r0.e(r2)
            if (r0 != 0) goto L14
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.d
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r0.e(r2)
            return r2
        L14:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r4) {
            r2 = this;
            java.lang.String r0 = "topLevelType"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "position"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r2.d
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r2.c
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r1.g(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r0.g(r3, r4)
            return r3
    }
}
