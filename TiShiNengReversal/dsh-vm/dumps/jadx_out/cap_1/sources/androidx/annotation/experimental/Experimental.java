package androidx.annotation.experimental;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Deprecated(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @kotlin.ReplaceWith(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface Experimental {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Level extends java.lang.Enum<androidx.annotation.experimental.Experimental.Level> {
        private static final /* synthetic */ androidx.annotation.experimental.Experimental.Level[] $VALUES = null;
        public static final androidx.annotation.experimental.Experimental.Level ERROR = null;
        public static final androidx.annotation.experimental.Experimental.Level WARNING = null;

        private static final /* synthetic */ androidx.annotation.experimental.Experimental.Level[] $values() {
                r0 = 2
                androidx.annotation.experimental.Experimental$Level[] r0 = new androidx.annotation.experimental.Experimental.Level[r0]
                androidx.annotation.experimental.Experimental$Level r1 = androidx.annotation.experimental.Experimental.Level.WARNING
                r2 = 0
                r0[r2] = r1
                androidx.annotation.experimental.Experimental$Level r1 = androidx.annotation.experimental.Experimental.Level.ERROR
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.annotation.experimental.Experimental$Level r0 = new androidx.annotation.experimental.Experimental$Level
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.experimental.Experimental.Level.WARNING = r0
                androidx.annotation.experimental.Experimental$Level r0 = new androidx.annotation.experimental.Experimental$Level
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.experimental.Experimental.Level.ERROR = r0
                androidx.annotation.experimental.Experimental$Level[] r0 = $values()
                androidx.annotation.experimental.Experimental.Level.$VALUES = r0
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.experimental.Experimental.Level valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.experimental.Experimental$Level> r0 = androidx.annotation.experimental.Experimental.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.experimental.Experimental$Level r1 = (androidx.annotation.experimental.Experimental.Level) r1
                return r1
        }

        public static androidx.annotation.experimental.Experimental.Level[] values() {
                androidx.annotation.experimental.Experimental$Level[] r0 = androidx.annotation.experimental.Experimental.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.experimental.Experimental$Level[] r0 = (androidx.annotation.experimental.Experimental.Level[]) r0
                return r0
        }
    }

    androidx.annotation.experimental.Experimental.Level level() default androidx.annotation.experimental.Experimental.Level.ERROR;
}
