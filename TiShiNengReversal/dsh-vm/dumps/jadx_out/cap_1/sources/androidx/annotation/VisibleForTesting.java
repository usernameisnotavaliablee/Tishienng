package androidx.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.annotation.MustBeDocumented
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface VisibleForTesting {

    @org.jetbrains.annotations.NotNull
    public static final androidx.annotation.VisibleForTesting.Companion Companion = null;
    public static final int NONE = 5;
    public static final int PACKAGE_PRIVATE = 3;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ androidx.annotation.VisibleForTesting.Companion $$INSTANCE = null;
        public static final int NONE = 5;
        public static final int PACKAGE_PRIVATE = 3;
        public static final int PRIVATE = 2;
        public static final int PROTECTED = 4;

        static {
                androidx.annotation.VisibleForTesting$Companion r0 = new androidx.annotation.VisibleForTesting$Companion
                r0.<init>()
                androidx.annotation.VisibleForTesting.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.annotation.VisibleForTesting$Companion r0 = androidx.annotation.VisibleForTesting.Companion.$$INSTANCE
            androidx.annotation.VisibleForTesting.Companion = r0
            return
    }

    int otherwise() default 2;
}
