package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> b;

    @kotlin.jvm.JvmOverloads
    public i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r3) {
            r2 = this;
            java.lang.String r0 = "getScope"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 1
            r2.<init>(r0, r3, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "getScope"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.h
            r0.<init>(r3)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r0)
            r1.b = r2
            return
    }

    public /* synthetic */ i(kotlin.reflect.jvm.internal.impl.storage.n r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.storage.n r1 = kotlin.reflect.jvm.internal.impl.storage.f.e
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.g0.o(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k k(kotlin.jvm.functions.Function0 r0) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = l(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k l(kotlin.jvm.functions.Function0 r1) {
            java.lang.Object r1 = r1.invoke()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r1
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.a
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.resolve.scopes.a r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.a) r1
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.i()
        L10:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.resolve.scopes.k j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r0 = r1.b
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r0
            return r0
    }
}
