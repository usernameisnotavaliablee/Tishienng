package androidx.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface RequiresOptIn {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Level extends java.lang.Enum<androidx.annotation.RequiresOptIn.Level> {
        private static final /* synthetic */ androidx.annotation.RequiresOptIn.Level[] $VALUES = null;
        public static final androidx.annotation.RequiresOptIn.Level ERROR = null;
        public static final androidx.annotation.RequiresOptIn.Level WARNING = null;

        private static final /* synthetic */ androidx.annotation.RequiresOptIn.Level[] $values() {
                r0 = 2
                androidx.annotation.RequiresOptIn$Level[] r0 = new androidx.annotation.RequiresOptIn.Level[r0]
                androidx.annotation.RequiresOptIn$Level r1 = androidx.annotation.RequiresOptIn.Level.WARNING
                r2 = 0
                r0[r2] = r1
                androidx.annotation.RequiresOptIn$Level r1 = androidx.annotation.RequiresOptIn.Level.ERROR
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.annotation.RequiresOptIn$Level r0 = new androidx.annotation.RequiresOptIn$Level
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.RequiresOptIn.Level.WARNING = r0
                androidx.annotation.RequiresOptIn$Level r0 = new androidx.annotation.RequiresOptIn$Level
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.RequiresOptIn.Level.ERROR = r0
                androidx.annotation.RequiresOptIn$Level[] r0 = $values()
                androidx.annotation.RequiresOptIn.Level.$VALUES = r0
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.RequiresOptIn.Level valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.RequiresOptIn$Level> r0 = androidx.annotation.RequiresOptIn.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.RequiresOptIn$Level r1 = (androidx.annotation.RequiresOptIn.Level) r1
                return r1
        }

        public static androidx.annotation.RequiresOptIn.Level[] values() {
                androidx.annotation.RequiresOptIn$Level[] r0 = androidx.annotation.RequiresOptIn.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.RequiresOptIn$Level[] r0 = (androidx.annotation.RequiresOptIn.Level[]) r0
                return r0
        }
    }

    androidx.annotation.RequiresOptIn.Level level() default androidx.annotation.RequiresOptIn.Level.ERROR;
}
