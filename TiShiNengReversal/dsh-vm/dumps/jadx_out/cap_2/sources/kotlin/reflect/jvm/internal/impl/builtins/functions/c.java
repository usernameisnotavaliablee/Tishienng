package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlin.reflect.jvm.internal.impl.resolve.scopes.f {
    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.functions.b r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.y> k() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.n()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.b r0 = (kotlin.reflect.jvm.internal.impl.builtins.functions.b) r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r0 = r0.P0()
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$a r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.a.f
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r1 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.builtins.functions.d$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.d.E
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.n()
            kotlin.reflect.jvm.internal.impl.builtins.functions.b r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.b) r1
            r2 = 0
            kotlin.reflect.jvm.internal.impl.builtins.functions.d r0 = r0.a(r1, r2)
            java.util.List r0 = kotlin.collections.f0.l(r0)
            return r0
        L29:
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$d r1 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.d.f
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.builtins.functions.d$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.d.E
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.n()
            kotlin.reflect.jvm.internal.impl.builtins.functions.b r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.b) r1
            r2 = 1
            kotlin.reflect.jvm.internal.impl.builtins.functions.d r0 = r0.a(r1, r2)
            java.util.List r0 = kotlin.collections.f0.l(r0)
            return r0
        L43:
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }
}
