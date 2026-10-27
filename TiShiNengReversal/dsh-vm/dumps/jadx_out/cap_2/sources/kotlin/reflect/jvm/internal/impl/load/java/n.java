package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {
    private static /* synthetic */ void a(int r6) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 2
            r4 = 1
            if (r6 == r4) goto L16
            if (r6 == r3) goto L16
            if (r6 == r0) goto L11
            java.lang.String r5 = "propertyDescriptor"
            r1[r2] = r5
            goto L1a
        L11:
            java.lang.String r5 = "memberDescriptor"
            r1[r2] = r5
            goto L1a
        L16:
            java.lang.String r5 = "companionObject"
            r1[r2] = r5
        L1a:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil"
            r1[r4] = r2
            if (r6 == r4) goto L33
            if (r6 == r3) goto L2e
            if (r6 == r0) goto L29
            java.lang.String r6 = "isPropertyWithBackingFieldInOuterClass"
            r1[r3] = r6
            goto L37
        L29:
            java.lang.String r6 = "hasJvmFieldAnnotation"
            r1[r3] = r6
            goto L37
        L2e:
            java.lang.String r6 = "isMappedIntrinsicCompanionObject"
            r1[r3] = r6
            goto L37
        L33:
            java.lang.String r6 = "isClassCompanionObjectWithBackingFieldsInOuter"
            r1[r3] = r6
        L37:
            java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
    }

    public static boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            if (r2 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r0 == 0) goto L21
            r0 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r0
            kotlin.reflect.jvm.internal.impl.descriptors.v r0 = r0.O()
            if (r0 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.h0.b
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L21
            r2 = 1
            return r2
        L21:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.h0.b
            boolean r2 = r2.l(r0)
            return r2
    }

    public static boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            r0 = 1
            if (r2 != 0) goto L6
            a(r0)
        L6:
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r2)
            if (r1 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r2.b()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.w(r1)
            if (r1 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            boolean r2 = d(r2)
            if (r2 != 0) goto L1f
            return r0
        L1f:
            r2 = 0
            return r2
    }

    public static boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            if (r1 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.builtins.d r0 = kotlin.reflect.jvm.internal.impl.builtins.d.a
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.e.a(r0, r1)
            return r1
    }

    public static boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r3) {
            r0 = 0
            if (r3 != 0) goto L6
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = r3.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r1 != r2) goto Lf
            return r0
        Lf:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r3.b()
            boolean r1 = c(r1)
            r2 = 1
            if (r1 == 0) goto L1b
            return r2
        L1b:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r3.b()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r1)
            if (r1 == 0) goto L2c
            boolean r3 = b(r3)
            if (r3 == 0) goto L2c
            return r2
        L2c:
            return r0
    }
}
