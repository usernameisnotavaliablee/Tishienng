package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c {
    private final kotlin.reflect.jvm.internal.impl.types.t0 a;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b;
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 c;

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r4) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            b(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            b(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            b(r0)
        L12:
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    private static /* synthetic */ void b(int r10) {
            r0 = 5
            r1 = 4
            r2 = 3
            if (r10 == r2) goto Lc
            if (r10 == r1) goto Lc
            if (r10 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r10 == r2) goto L17
            if (r10 == r1) goto L17
            if (r10 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl"
            r7 = 0
            r8 = 1
            if (r10 == r8) goto L35
            if (r10 == r4) goto L30
            if (r10 == r2) goto L2d
            if (r10 == r1) goto L2d
            if (r10 == r0) goto L2d
            java.lang.String r9 = "annotationType"
            r5[r7] = r9
            goto L39
        L2d:
            r5[r7] = r6
            goto L39
        L30:
            java.lang.String r9 = "source"
            r5[r7] = r9
            goto L39
        L35:
            java.lang.String r9 = "valueArguments"
            r5[r7] = r9
        L39:
            if (r10 == r2) goto L4c
            if (r10 == r1) goto L47
            if (r10 == r0) goto L42
            r5[r8] = r6
            goto L50
        L42:
            java.lang.String r6 = "getSource"
            r5[r8] = r6
            goto L50
        L47:
            java.lang.String r6 = "getAllValueArguments"
            r5[r8] = r6
            goto L50
        L4c:
            java.lang.String r6 = "getType"
            r5[r8] = r6
        L50:
            if (r10 == r2) goto L5a
            if (r10 == r1) goto L5a
            if (r10 == r0) goto L5a
            java.lang.String r6 = "<init>"
            r5[r4] = r6
        L5a:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r10 == r2) goto L6a
            if (r10 == r1) goto L6a
            if (r10 == r0) goto L6a
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r3)
            goto L6f
        L6a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
        L6f:
            throw r10
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
            r2 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r2.b
            if (r0 != 0) goto L8
            r1 = 4
            b(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.c.a.a(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r2.c
            if (r0 != 0) goto L8
            r1 = 5
            b(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
            if (r0 != 0) goto L8
            r1 = 3
            b(r1)
        L8:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = kotlin.reflect.jvm.internal.impl.renderer.m.h
            r1 = 0
            java.lang.String r0 = r0.O(r2, r1)
            return r0
    }
}
