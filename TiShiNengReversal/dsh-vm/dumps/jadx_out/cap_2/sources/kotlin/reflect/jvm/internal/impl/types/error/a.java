package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.k {
    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r14) {
            r13 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r2 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            java.util.List r1 = kotlin.collections.f0.J()
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r8 = 0
            kotlin.reflect.jvm.internal.impl.storage.n r9 = kotlin.reflect.jvm.internal.impl.storage.f.e
            r1 = r13
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r14 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14 = r14.b()
            r2 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i r14 = kotlin.reflect.jvm.internal.impl.descriptors.impl.i.i1(r13, r14, r2, r7)
            java.util.List r2 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = kotlin.reflect.jvm.internal.impl.descriptors.r.d
            r14.l1(r2, r3)
            java.lang.String r2 = "apply(...)"
            kotlin.jvm.internal.g0.o(r14, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS
            kotlin.reflect.jvm.internal.impl.name.f r3 = r14.getName()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = ""
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            kotlin.reflect.jvm.internal.impl.types.error.f r6 = kotlin.reflect.jvm.internal.impl.types.error.i.b(r2, r3)
            kotlin.reflect.jvm.internal.impl.types.error.g r4 = new kotlin.reflect.jvm.internal.impl.types.error.g
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r7 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CLASS
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            kotlin.reflect.jvm.internal.impl.types.error.h r5 = r0.e(r7, r3)
            java.lang.String[] r10 = new java.lang.String[r2]
            r11 = 24
            r12 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14.b1(r4)
            java.util.Set r0 = kotlin.collections.u1.f(r14)
            r13.F0(r6, r0, r14)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d E0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r1 = this;
            java.lang.String r0 = "substitutor"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            r1 = this;
            java.lang.String r0 = "typeSubstitution"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r3 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.getName()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r2.toString()
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}
            kotlin.reflect.jvm.internal.impl.types.error.f r2 = kotlin.reflect.jvm.internal.impl.types.error.i.b(r3, r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.E0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
