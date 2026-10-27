package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.m implements kotlin.reflect.jvm.internal.impl.descriptors.l {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 d;

    protected n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r5) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r5 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            r1.<init>(r3, r4)
            r1.c = r2
            r1.d = r5
            return
    }

    private static /* synthetic */ void T(int r9) {
            r0 = 6
            r1 = 5
            r2 = 4
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl"
            r7 = 0
            switch(r9) {
                case 1: goto L32;
                case 2: goto L2d;
                case 3: goto L28;
                case 4: goto L25;
                case 5: goto L25;
                case 6: goto L25;
                default: goto L20;
            }
        L20:
            java.lang.String r8 = "containingDeclaration"
            r5[r7] = r8
            goto L36
        L25:
            r5[r7] = r6
            goto L36
        L28:
            java.lang.String r8 = "source"
            r5[r7] = r8
            goto L36
        L2d:
            java.lang.String r8 = "name"
            r5[r7] = r8
            goto L36
        L32:
            java.lang.String r8 = "annotations"
            r5[r7] = r8
        L36:
            r7 = 1
            if (r9 == r2) goto L4a
            if (r9 == r1) goto L45
            if (r9 == r0) goto L40
            r5[r7] = r6
            goto L4e
        L40:
            java.lang.String r6 = "getSource"
            r5[r7] = r6
            goto L4e
        L45:
            java.lang.String r6 = "getContainingDeclaration"
            r5[r7] = r6
            goto L4e
        L4a:
            java.lang.String r6 = "getOriginal"
            r5[r7] = r6
        L4e:
            if (r9 == r2) goto L58
            if (r9 == r1) goto L58
            if (r9 == r0) goto L58
            java.lang.String r6 = "<init>"
            r5[r4] = r6
        L58:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L68
            if (r9 == r1) goto L68
            if (r9 == r0) goto L68
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L6d
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L6d:
            throw r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.n r0 = r1.p0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r2.c
            if (r0 != 0) goto L8
            r1 = 5
            T(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r2.d
            if (r0 != 0) goto L8
            r1 = 6
            T(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = super.a()
            kotlin.reflect.jvm.internal.impl.descriptors.n r0 = (kotlin.reflect.jvm.internal.impl.descriptors.n) r0
            if (r0 != 0) goto Lc
            r1 = 4
            T(r1)
        Lc:
            return r0
    }
}
