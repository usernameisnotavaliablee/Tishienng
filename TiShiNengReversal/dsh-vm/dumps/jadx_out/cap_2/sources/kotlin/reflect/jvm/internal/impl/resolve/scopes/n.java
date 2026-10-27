package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface n {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nResolutionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionScope.kt\norg/jetbrains/kotlin/resolve/scopes/ResolutionScope$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class a {
        public static /* synthetic */ java.util.Collection a(kotlin.reflect.jvm.internal.impl.resolve.scopes.n r0, kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto L17
                r4 = r3 & 1
                if (r4 == 0) goto L8
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.o
            L8:
                r3 = r3 & 2
                if (r3 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a
                kotlin.jvm.functions.Function1 r2 = r2.c()
            L12:
                java.util.Collection r0 = r0.h(r1, r2)
                return r0
            L17:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getContributedDescriptors"
                r0.<init>(r1)
                throw r0
        }

        public static void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.n r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.a(r2, r3)
                return
        }
    }

    @org.jetbrains.annotations.NotNull
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

    void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

    @org.jetbrains.annotations.NotNull
    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2);
}
