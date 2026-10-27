package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a;

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            r1.<init>()
            r1.a = r2
            return
    }

    private static /* synthetic */ void T(int r7) {
            r0 = 1
            if (r7 == r0) goto L6
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L8:
            r2 = 2
            if (r7 == r0) goto Ld
            r3 = 3
            goto Le
        Ld:
            r3 = 2
        Le:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl"
            r5 = 0
            if (r7 == r0) goto L1a
            java.lang.String r6 = "annotations"
            r3[r5] = r6
            goto L1c
        L1a:
            r3[r5] = r4
        L1c:
            if (r7 == r0) goto L21
            r3[r0] = r4
            goto L25
        L21:
            java.lang.String r4 = "getAnnotations"
            r3[r0] = r4
        L25:
            if (r7 == r0) goto L2b
            java.lang.String r4 = "<init>"
            r3[r2] = r4
        L2b:
            java.lang.String r1 = java.lang.String.format(r1, r3)
            if (r7 == r0) goto L37
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r1)
            goto L3c
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
        L3c:
            throw r7
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r2.a
            if (r0 != 0) goto L8
            r1 = 1
            T(r1)
        L8:
            return r0
    }
}
