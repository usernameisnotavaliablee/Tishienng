package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class z implements kotlin.reflect.jvm.internal.impl.descriptors.d {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.z.a a = null;

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
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r4) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "typeSubstitution"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.z
                if (r0 == 0) goto L17
                r0 = r2
                kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.z) r0
                goto L18
            L17:
                r0 = 0
            L18:
                if (r0 == 0) goto L22
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r0.T(r3, r4)
                if (r4 != 0) goto L21
                goto L22
            L21:
                return r4
            L22:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.v0(r3)
                java.lang.String r3 = "getMemberScope(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.z
                if (r0 == 0) goto L12
                r0 = r2
                kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.z) r0
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 == 0) goto L1d
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r0.o0(r3)
                if (r3 != 0) goto L1c
                goto L1d
            L1c:
                return r3
            L1d:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.H()
                java.lang.String r3 = "getUnsubstitutedMemberScope(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                return r2
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.z$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z.a = r0
            return
    }

    public z() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.k T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.k o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r1);
}
