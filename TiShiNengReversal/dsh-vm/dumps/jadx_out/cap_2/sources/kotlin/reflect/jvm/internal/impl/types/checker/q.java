package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q implements kotlin.reflect.jvm.internal.impl.types.checker.p {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.g c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.f d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil e;

    public q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.f r3) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kotlinTypePreparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.c = r2
            r1.d = r3
            kotlin.reflect.jvm.internal.impl.types.checker.g r2 = r1.c()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m(r2)
            java.lang.String r3 = "createWithTypeRefiner(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.e = r2
            return
    }

    public /* synthetic */ q(kotlin.reflect.jvm.internal.impl.types.checker.g r1, kotlin.reflect.jvm.internal.impl.types.checker.f r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r2 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
        L6:
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10) {
            r8 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.g r5 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.checker.f r4 = r8.f()
            r6 = 6
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0 = kotlin.reflect.jvm.internal.impl.types.checker.a.b(r1, r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.types.m2 r9 = r9.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = r10.L0()
            boolean r9 = r8.e(r0, r9, r10)
            return r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.checker.g c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.g r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10) {
            r8 = this;
            java.lang.String r0 = "subtype"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "supertype"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.g r5 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.checker.f r4 = r8.f()
            r6 = 6
            r7 = 0
            r1 = 1
            r2 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0 = kotlin.reflect.jvm.internal.impl.types.checker.a.b(r1, r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.types.m2 r9 = r9.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = r10.L0()
            boolean r9 = r8.g(r0, r9, r10)
            return r9
    }

    public final boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r4) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            boolean r2 = r0.m(r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.checker.f f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.f r0 = r1.d
            return r0
    }

    public final boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r11) {
            r8 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "superType"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.types.h r1 = kotlin.reflect.jvm.internal.impl.types.h.a
            r6 = 8
            r7 = 0
            r5 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            boolean r9 = kotlin.reflect.jvm.internal.impl.types.h.v(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }
}
