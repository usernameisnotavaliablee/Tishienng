package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.f {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.a.C0028a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f f = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a, reason: collision with other inner class name */
    public static final class C0028a {
        private C0028a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0028a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.f a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.a.o()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.a.e = r0
            java.lang.String r0 = "clone"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f = r0
            return
    }

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f o() {
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.y> k() {
            r14 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r14.n()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r4 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r5 = kotlin.reflect.jvm.internal.impl.descriptors.impl.o0.g1(r0, r1, r2, r3, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r14.n()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r7 = r0.V()
            java.util.List r8 = kotlin.collections.f0.J()
            java.util.List r9 = kotlin.collections.f0.J()
            java.util.List r10 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r14.n()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r11 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r12 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.s r13 = kotlin.reflect.jvm.internal.impl.descriptors.r.c
            r6 = 0
            r5.i1(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List r0 = kotlin.collections.f0.l(r5)
            return r0
    }
}
