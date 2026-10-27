package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class m0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.j0 implements kotlin.reflect.jvm.internal.impl.descriptors.y0 {
    static final /* synthetic */ boolean p = false;
    private kotlin.reflect.jvm.internal.impl.descriptors.q1 n;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.y0 o;

    static {
            return
    }

    public m0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r16, boolean r17, boolean r18, boolean r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y0 r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r22) {
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
            java.lang.String r1 = "<set-"
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

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 K0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y0 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r15) {
            if (r13 != 0) goto L6
            r0 = 7
            T(r0)
        L6:
            if (r14 != 0) goto Ld
            r0 = 8
            T(r0)
        Ld:
            if (r15 != 0) goto L14
            r0 = 9
            T(r0)
        L14:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.h.p
            r11 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r12 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r3 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r13
            r7 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    private static /* synthetic */ void T(int r6) {
            switch(r6) {
                case 10: goto L6;
                case 11: goto L6;
                case 12: goto L6;
                case 13: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r0 = "@NotNull method %s.%s must not return null"
        L8:
            r1 = 2
            switch(r6) {
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Le;
                case 13: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl"
            r4 = 0
            switch(r6) {
                case 1: goto L42;
                case 2: goto L3d;
                case 3: goto L38;
                case 4: goto L33;
                case 5: goto L2e;
                case 6: goto L29;
                case 7: goto L24;
                case 8: goto L1f;
                case 9: goto L42;
                case 10: goto L1c;
                case 11: goto L1c;
                case 12: goto L1c;
                case 13: goto L1c;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "correspondingProperty"
            r2[r4] = r5
            goto L46
        L1c:
            r2[r4] = r3
            goto L46
        L1f:
            java.lang.String r5 = "type"
            r2[r4] = r5
            goto L46
        L24:
            java.lang.String r5 = "setterDescriptor"
            r2[r4] = r5
            goto L46
        L29:
            java.lang.String r5 = "parameter"
            r2[r4] = r5
            goto L46
        L2e:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L46
        L33:
            java.lang.String r5 = "kind"
            r2[r4] = r5
            goto L46
        L38:
            java.lang.String r5 = "visibility"
            r2[r4] = r5
            goto L46
        L3d:
            java.lang.String r5 = "modality"
            r2[r4] = r5
            goto L46
        L42:
            java.lang.String r5 = "annotations"
            r2[r4] = r5
        L46:
            r4 = 1
            switch(r6) {
                case 10: goto L5c;
                case 11: goto L57;
                case 12: goto L52;
                case 13: goto L4d;
                default: goto L4a;
            }
        L4a:
            r2[r4] = r3
            goto L60
        L4d:
            java.lang.String r3 = "getOriginal"
            r2[r4] = r3
            goto L60
        L52:
            java.lang.String r3 = "getReturnType"
            r2[r4] = r3
            goto L60
        L57:
            java.lang.String r3 = "getValueParameters"
            r2[r4] = r3
            goto L60
        L5c:
            java.lang.String r3 = "getOverriddenDescriptors"
            r2[r4] = r3
        L60:
            switch(r6) {
                case 6: goto L6d;
                case 7: goto L68;
                case 8: goto L68;
                case 9: goto L68;
                case 10: goto L71;
                case 11: goto L71;
                case 12: goto L71;
                case 13: goto L71;
                default: goto L63;
            }
        L63:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto L71
        L68:
            java.lang.String r3 = "createSetterParameter"
            r2[r1] = r3
            goto L71
        L6d:
            java.lang.String r3 = "initialize"
            r2[r1] = r3
        L71:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 10: goto L7e;
                case 11: goto L7e;
                case 12: goto L7e;
                case 13: goto L7e;
                default: goto L78;
            }
        L78:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto L83
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        L83:
            throw r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.v0 F0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.L0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y0 L0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r2.o
            if (r0 != 0) goto L9
            r1 = 13
            T(r1)
        L9:
            return r0
    }

    public void M0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 6
            T(r0)
        L6:
            r1.n = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.d(r0, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.L0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.L0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.L0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.L0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y0> e() {
            r2 = this;
            r0 = 0
            java.util.Collection r0 = super.G0(r0)
            if (r0 != 0) goto Lc
            r1 = 10
            T(r1)
        Lc:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> g() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r2.n
            if (r0 == 0) goto L10
            java.util.List r0 = java.util.Collections.singletonList(r0)
            if (r0 != 0) goto Lf
            r1 = 11
            T(r1)
        Lf:
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.a0()
            if (r0 != 0) goto Lf
            r1 = 12
            T(r1)
        Lf:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.L0()
            return r0
    }
}
