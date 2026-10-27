package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a {
    private final kotlin.reflect.jvm.internal.impl.descriptors.k g;
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 h;
    private final boolean i;

    protected j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r5, boolean r6) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            p0(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            p0(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            p0(r0)
        L12:
            if (r5 != 0) goto L18
            r0 = 3
            p0(r0)
        L18:
            r1.<init>(r2, r4)
            r1.g = r3
            r1.h = r5
            r1.i = r6
            return
    }

    private static /* synthetic */ void p0(int r9) {
            r0 = 5
            r1 = 4
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = 3
            goto L14
        L13:
            r5 = 2
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase"
            r7 = 1
            r8 = 0
            if (r9 == r7) goto L36
            if (r9 == r4) goto L31
            if (r9 == r3) goto L2c
            if (r9 == r1) goto L29
            if (r9 == r0) goto L29
            java.lang.String r3 = "storageManager"
            r5[r8] = r3
            goto L3a
        L29:
            r5[r8] = r6
            goto L3a
        L2c:
            java.lang.String r3 = "source"
            r5[r8] = r3
            goto L3a
        L31:
            java.lang.String r3 = "name"
            r5[r8] = r3
            goto L3a
        L36:
            java.lang.String r3 = "containingDeclaration"
            r5[r8] = r3
        L3a:
            if (r9 == r1) goto L46
            if (r9 == r0) goto L41
            r5[r7] = r6
            goto L4a
        L41:
            java.lang.String r3 = "getSource"
            r5[r7] = r3
            goto L4a
        L46:
            java.lang.String r3 = "getContainingDeclaration"
            r5[r7] = r3
        L4a:
            if (r9 == r1) goto L52
            if (r9 == r0) goto L52
            java.lang.String r3 = "<init>"
            r5[r4] = r3
        L52:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L60
            if (r9 == r0) goto L60
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L65
        L60:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L65:
            throw r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r2.g
            if (r0 != 0) goto L8
            r1 = 4
            p0(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r2.h
            if (r0 != 0) goto L8
            r1 = 5
            p0(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }
}
