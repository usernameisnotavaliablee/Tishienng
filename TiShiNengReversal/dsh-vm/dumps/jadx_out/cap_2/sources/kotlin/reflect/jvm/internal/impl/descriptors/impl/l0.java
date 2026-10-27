package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class l0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.j0 implements kotlin.reflect.jvm.internal.impl.descriptors.x0 {
    private kotlin.reflect.jvm.internal.impl.types.t0 n;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.x0 o;

    public l0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r16, boolean r17, boolean r18, boolean r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.x0 r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r22) {
            r12 = this;
            if (r13 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r14 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r15 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r16 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r20 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            if (r22 != 0) goto L24
            r0 = 5
            T(r0)
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.f.k(r0)
            r1 = r12
            r4 = r13
            r5 = r14
            r2 = r15
            r3 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L5a
            r13 = r21
            goto L5b
        L5a:
            r13 = r12
        L5b:
            r12.o = r13
            return
    }

    private static /* synthetic */ void T(int r9) {
            r0 = 8
            r1 = 7
            r2 = 6
            if (r9 == r2) goto Ld
            if (r9 == r1) goto Ld
            if (r9 == r0) goto Ld
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lf
        Ld:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Lf:
            r4 = 2
            if (r9 == r2) goto L18
            if (r9 == r1) goto L18
            if (r9 == r0) goto L18
            r5 = 3
            goto L19
        L18:
            r5 = 2
        L19:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl"
            r7 = 0
            switch(r9) {
                case 1: goto L3d;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L29;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L21;
            }
        L21:
            java.lang.String r8 = "correspondingProperty"
            r5[r7] = r8
            goto L41
        L26:
            r5[r7] = r6
            goto L41
        L29:
            java.lang.String r8 = "source"
            r5[r7] = r8
            goto L41
        L2e:
            java.lang.String r8 = "kind"
            r5[r7] = r8
            goto L41
        L33:
            java.lang.String r8 = "visibility"
            r5[r7] = r8
            goto L41
        L38:
            java.lang.String r8 = "modality"
            r5[r7] = r8
            goto L41
        L3d:
            java.lang.String r8 = "annotations"
            r5[r7] = r8
        L41:
            r7 = 1
            if (r9 == r2) goto L55
            if (r9 == r1) goto L50
            if (r9 == r0) goto L4b
            r5[r7] = r6
            goto L59
        L4b:
            java.lang.String r6 = "getOriginal"
            r5[r7] = r6
            goto L59
        L50:
            java.lang.String r6 = "getValueParameters"
            r5[r7] = r6
            goto L59
        L55:
            java.lang.String r6 = "getOverriddenDescriptors"
            r5[r7] = r6
        L59:
            if (r9 == r2) goto L63
            if (r9 == r1) goto L63
            if (r9 == r0) goto L63
            java.lang.String r6 = "<init>"
            r5[r4] = r6
        L63:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L73
            if (r9 == r1) goto L73
            if (r9 == r0) goto L73
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L78
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L78:
            throw r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.v0 F0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r1.K0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.x0 K0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r2.o
            if (r0 != 0) goto L9
            r1 = 8
            T(r1)
        L9:
            return r0
    }

    public void L0(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            r0 = this;
            if (r1 != 0) goto La
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r0.h0()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
        La:
            r0.n = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.j(r0, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.x0> e() {
            r2 = this;
            r0 = 1
            java.util.Collection r0 = super.G0(r0)
            if (r0 != 0) goto Lb
            r1 = 6
            T(r1)
        Lb:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> g() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L8
            r1 = 7
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.n
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r1.K0()
            return r0
    }
}
