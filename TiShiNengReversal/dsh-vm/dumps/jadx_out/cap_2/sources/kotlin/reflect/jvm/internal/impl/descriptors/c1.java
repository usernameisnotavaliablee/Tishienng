package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c1<T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.c1.a e = null;
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, T> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.g c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i d;

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
        public final <T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> kotlin.reflect.jvm.internal.impl.descriptors.c1<T> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends T> r11) {
                r7 = this;
                java.lang.String r0 = "classDescriptor"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "storageManager"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r0 = "kotlinTypeRefinerForOwnerModule"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "scopeFactory"
                kotlin.jvm.internal.g0.p(r11, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.c1 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.c1
                r6 = 0
                r2 = r8
                r3 = r9
                r5 = r10
                r4 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.c1> r1 = kotlin.reflect.jvm.internal.impl.descriptors.c1.class
            java.lang.String r2 = "scopeForOwnerModule"
            java.lang.String r3 = "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.descriptors.c1.f = r1
            kotlin.reflect.jvm.internal.impl.descriptors.c1$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.c1$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.c1.e = r0
            return
    }

    private c1(kotlin.reflect.jvm.internal.impl.descriptors.d r1, kotlin.reflect.jvm.internal.impl.storage.n r2, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends T> r3, kotlin.reflect.jvm.internal.impl.types.checker.g r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.a1
            r1.<init>(r0)
            kotlin.reflect.jvm.internal.impl.storage.i r1 = r2.e(r1)
            r0.d = r1
            return
    }

    public /* synthetic */ c1(kotlin.reflect.jvm.internal.impl.descriptors.d r1, kotlin.reflect.jvm.internal.impl.storage.n r2, kotlin.jvm.functions.Function1 r3, kotlin.reflect.jvm.internal.impl.types.checker.g r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k a(kotlin.reflect.jvm.internal.impl.descriptors.c1 r0) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = f(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k b(kotlin.reflect.jvm.internal.impl.descriptors.c1 r0, kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = d(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k d(kotlin.reflect.jvm.internal.impl.descriptors.c1 r0, kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r0 = r0.b
            java.lang.Object r0 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r0
            return r0
    }

    private final T e() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.descriptors.c1.f
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r0
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k f(kotlin.reflect.jvm.internal.impl.descriptors.c1 r1) {
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r0 = r1.b
            kotlin.reflect.jvm.internal.impl.types.checker.g r1 = r1.c
            java.lang.Object r1 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final T c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            r2 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.s(r0)
            boolean r0 = r3.d(r0)
            if (r0 != 0) goto L16
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r2.e()
            return r3
        L16:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.lang.String r1 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r3.e(r0)
            if (r0 != 0) goto L2c
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r2.e()
            return r3
        L2c:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.b1 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.b1
            r1.<init>(r2, r3)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r3.c(r0, r1)
            return r3
    }
}
