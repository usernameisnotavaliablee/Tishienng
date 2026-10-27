package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h {
    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r6, boolean r7, int r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.h1 r10) {
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
            if (r6 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            if (r9 != 0) goto L24
            r0 = 5
            T(r0)
        L24:
            if (r10 != 0) goto L2a
            r0 = 6
            T(r0)
        L2a:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private static /* synthetic */ void T(int r2) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            switch(r2) {
                case 1: goto L25;
                case 2: goto L20;
                case 3: goto L1b;
                case 4: goto L16;
                case 5: goto L11;
                case 6: goto Lc;
                default: goto L7;
            }
        L7:
            java.lang.String r2 = "storageManager"
            r0[r1] = r2
            goto L29
        Lc:
            java.lang.String r2 = "supertypeLoopChecker"
            r0[r1] = r2
            goto L29
        L11:
            java.lang.String r2 = "source"
            r0[r1] = r2
            goto L29
        L16:
            java.lang.String r2 = "variance"
            r0[r1] = r2
            goto L29
        L1b:
            java.lang.String r2 = "name"
            r0[r1] = r2
            goto L29
        L20:
            java.lang.String r2 = "annotations"
            r0[r1] = r2
            goto L29
        L25:
            java.lang.String r2 = "containingDeclaration"
            r0[r1] = r2
        L29:
            r2 = 1
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor"
            r0[r2] = r1
            r2 = 2
            java.lang.String r1 = "<init>"
            r0[r2] = r1
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    public java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.j()
            java.lang.String r1 = ""
            if (r0 == 0) goto Lb
            java.lang.String r0 = "reified "
            goto Lc
        Lb:
            r0 = r1
        Lc:
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = r5.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r2 != r3) goto L15
            goto L2a
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = r5.l()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2a:
            kotlin.reflect.jvm.internal.impl.name.f r2 = r5.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.String r0 = "%s%s%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            return r0
    }
}
