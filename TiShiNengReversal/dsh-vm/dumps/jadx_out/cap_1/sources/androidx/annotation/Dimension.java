package androidx.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.MustBeDocumented
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface Dimension {

    @org.jetbrains.annotations.NotNull
    public static final androidx.annotation.Dimension.Companion Companion = null;
    public static final int DP = 0;
    public static final int PX = 1;
    public static final int SP = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ androidx.annotation.Dimension.Companion $$INSTANCE = null;
        public static final int DP = 0;
        public static final int PX = 1;
        public static final int SP = 2;

        static {
                androidx.annotation.Dimension$Companion r0 = new androidx.annotation.Dimension$Companion
                r0.<init>()
                androidx.annotation.Dimension.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.annotation.Dimension$Companion r0 = androidx.annotation.Dimension.Companion.$$INSTANCE
            androidx.annotation.Dimension.Companion = r0
            return
    }

    int unit() default 1;
}
