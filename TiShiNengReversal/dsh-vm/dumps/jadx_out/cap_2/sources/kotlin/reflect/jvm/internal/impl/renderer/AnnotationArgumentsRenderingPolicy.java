package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum AnnotationArgumentsRenderingPolicy extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy NO_ARGUMENTS = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy UNLESS_EMPTY = null;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] r0 = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[r0]
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.ALWAYS_PARENTHESIZED
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy
            r5 = 3
            r6 = 0
            java.lang.String r1 = "NO_ARGUMENTS"
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS = r0
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy
            r6 = 2
            r7 = 0
            java.lang.String r2 = "UNLESS_EMPTY"
            r3 = 1
            r4 = 1
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY = r1
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy
            r1 = 2
            r2 = 1
            java.lang.String r3 = "ALWAYS_PARENTHESIZED"
            r0.<init>(r3, r1, r2, r2)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.ALWAYS_PARENTHESIZED = r0
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.$ENTRIES = r0
            return
    }

    AnnotationArgumentsRenderingPolicy(java.lang.String r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.includeAnnotationArguments = r3
            r0.includeEmptyAnnotationArguments = r4
            return
    }

    /* synthetic */ AnnotationArgumentsRenderingPolicy(java.lang.String r2, int r3, boolean r4, boolean r5, int r6, kotlin.jvm.internal.v r7) {
            r1 = this;
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L6
            r4 = 0
        L6:
            r6 = r6 & 2
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy> r0 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = (kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] values() {
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] r0 = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[] r0 = (kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[]) r0
            return r0
    }

    public final boolean getIncludeAnnotationArguments() {
            r1 = this;
            boolean r0 = r1.includeAnnotationArguments
            return r0
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
            r1 = this;
            boolean r0 = r1.includeEmptyAnnotationArguments
            return r0
    }
}
