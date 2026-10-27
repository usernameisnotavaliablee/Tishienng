package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.load.java.descriptors.f {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 H;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 I;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.w0 J;

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r17, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d1 r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r19) {
            r15 = this;
            r12 = r17
            r13 = r18
            r14 = r19
            java.lang.String r0 = "ownerDescriptor"
            r1 = r16
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "getterMethod"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "overriddenProperty"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r12.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r4 = r12.getVisibility()
            if (r13 == 0) goto L2a
            r0 = 1
            r5 = 1
            goto L2c
        L2a:
            r0 = 0
            r5 = 0
        L2c:
            kotlin.reflect.jvm.internal.impl.name.f r6 = r14.getName()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r12.getSource()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r10 = 0
            r11 = 0
            r8 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.H = r12
            r15.I = r13
            r15.J = r14
            return
    }
}
