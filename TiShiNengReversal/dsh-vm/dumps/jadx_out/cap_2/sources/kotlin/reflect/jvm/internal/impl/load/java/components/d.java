package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.d a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> e = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.components.d r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.d
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.components.d.a = r0
            java.lang.String r0 = "message"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.components.d.b = r0
            java.lang.String r0 = "allowedTargets"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.components.d.c = r0
            java.lang.String r0 = "value"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.components.d.d = r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.H
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.d
            kotlin.Pair r0 = kotlin.o0.a(r0, r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.L
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.load.java.i0.f
            kotlin.Pair r1 = kotlin.o0.a(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.P
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.load.java.i0.i
            kotlin.Pair r2 = kotlin.o0.a(r2, r3)
            r3 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.util.Map r0 = kotlin.collections.i1.W(r3)
            kotlin.reflect.jvm.internal.impl.load.java.components.d.e = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(kotlin.reflect.jvm.internal.impl.load.java.components.d r0, x3.a r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = r0.e(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r8, @org.jetbrains.annotations.NotNull x3.d r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r10) {
            r7 = this;
            java.lang.String r0 = "kotlinName"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "annotationOwner"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.y
            boolean r0 = kotlin.jvm.internal.g0.g(r8, r0)
            if (r0 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.i0.h
            java.lang.String r1 = "DEPRECATED_ANNOTATION"
            kotlin.jvm.internal.g0.o(r0, r1)
            x3.a r0 = r9.b(r0)
            if (r0 != 0) goto L2a
            boolean r1 = r9.s()
            if (r1 == 0) goto L30
        L2a:
            kotlin.reflect.jvm.internal.impl.load.java.components.h r8 = new kotlin.reflect.jvm.internal.impl.load.java.components.h
            r8.<init>(r0, r10)
            return r8
        L30:
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.e
            java.lang.Object r8 = r0.get(r8)
            kotlin.reflect.jvm.internal.impl.name.c r8 = (kotlin.reflect.jvm.internal.impl.name.c) r8
            r0 = 0
            if (r8 == 0) goto L4c
            x3.a r2 = r9.b(r8)
            if (r2 == 0) goto L4c
            kotlin.reflect.jvm.internal.impl.load.java.components.d r1 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            r5 = 4
            r6 = 0
            r4 = 0
            r3 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r8 = f(r1, r2, r3, r4, r5, r6)
            return r8
        L4c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@org.jetbrains.annotations.NotNull x3.a r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r5.c()
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.load.java.i0.d
            java.lang.String r3 = "TARGET_ANNOTATION"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.b r2 = r1.c(r2)
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.load.java.components.n r7 = new kotlin.reflect.jvm.internal.impl.load.java.components.n
            r7.<init>(r5, r6)
            return r7
        L27:
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.load.java.i0.f
            java.lang.String r3 = "RETENTION_ANNOTATION"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.b r2 = r1.c(r2)
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.load.java.components.l r7 = new kotlin.reflect.jvm.internal.impl.load.java.components.l
            r7.<init>(r5, r6)
            return r7
        L3e:
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.load.java.i0.i
            java.lang.String r3 = "DOCUMENTED_ANNOTATION"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.b r2 = r1.c(r2)
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L57
            kotlin.reflect.jvm.internal.impl.load.java.components.c r7 = new kotlin.reflect.jvm.internal.impl.load.java.components.c
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.P
            r7.<init>(r6, r5, r0)
            return r7
        L57:
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.load.java.i0.h
            java.lang.String r3 = "DEPRECATED_ANNOTATION"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.b r1 = r1.c(r2)
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6a
            r5 = 0
            return r5
        L6a:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
            r0.<init>(r6, r5, r7)
            return r0
    }
}
