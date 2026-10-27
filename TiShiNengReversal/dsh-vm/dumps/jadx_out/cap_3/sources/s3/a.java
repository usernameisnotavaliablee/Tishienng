package s3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final void a(@org.jetbrains.annotations.NotNull t3.c r7, @org.jetbrains.annotations.NotNull t3.b r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "scopeOwner"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r10, r0)
            t3.c$a r0 = t3.c.a.a
            if (r7 != r0) goto L19
            goto L1f
        L19:
            t3.a r8 = r8.getLocation()
            if (r8 != 0) goto L20
        L1f:
            return
        L20:
            boolean r0 = r7.a()
            if (r0 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = r8.getPosition()
        L2a:
            r3 = r0
            goto L33
        L2c:
            kotlin.reflect.jvm.internal.impl.incremental.components.Position$a r0 = kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = r0.a()
            goto L2a
        L33:
            java.lang.String r2 = r8.a()
            kotlin.reflect.jvm.internal.impl.name.d r8 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r9)
            java.lang.String r4 = r8.a()
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r5 = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.CLASSIFIER
            java.lang.String r6 = r10.b()
            java.lang.String r8 = "asString(...)"
            kotlin.jvm.internal.g0.o(r6, r8)
            r1 = r7
            r1.b(r2, r3, r4, r5, r6)
            return
    }

    public static final void b(@org.jetbrains.annotations.NotNull t3.c r1, @org.jetbrains.annotations.NotNull t3.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.l0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "scopeOwner"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.d()
            java.lang.String r3 = r3.a()
            java.lang.String r4 = r4.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            c(r1, r2, r3, r4)
            return
    }

    public static final void c(@org.jetbrains.annotations.NotNull t3.c r7, @org.jetbrains.annotations.NotNull t3.b r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r10, r0)
            t3.c$a r0 = t3.c.a.a
            if (r7 != r0) goto L19
            goto L1f
        L19:
            t3.a r8 = r8.getLocation()
            if (r8 != 0) goto L20
        L1f:
            return
        L20:
            boolean r0 = r7.a()
            if (r0 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = r8.getPosition()
        L2a:
            r3 = r0
            goto L33
        L2c:
            kotlin.reflect.jvm.internal.impl.incremental.components.Position$a r0 = kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion
            kotlin.reflect.jvm.internal.impl.incremental.components.Position r0 = r0.a()
            goto L2a
        L33:
            java.lang.String r2 = r8.a()
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r5 = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.PACKAGE
            r1 = r7
            r4 = r9
            r6 = r10
            r1.b(r2, r3, r4, r5, r6)
            return
    }
}
