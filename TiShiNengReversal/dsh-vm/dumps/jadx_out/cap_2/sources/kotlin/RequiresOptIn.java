package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public @interface RequiresOptIn {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Level extends java.lang.Enum<kotlin.RequiresOptIn.Level> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] $VALUES = null;
        public static final kotlin.RequiresOptIn.Level ERROR = null;
        public static final kotlin.RequiresOptIn.Level WARNING = null;

        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] $values() {
                r0 = 2
                kotlin.RequiresOptIn$Level[] r0 = new kotlin.RequiresOptIn.Level[r0]
                kotlin.RequiresOptIn$Level r1 = kotlin.RequiresOptIn.Level.WARNING
                r2 = 0
                r0[r2] = r1
                kotlin.RequiresOptIn$Level r1 = kotlin.RequiresOptIn.Level.ERROR
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.RequiresOptIn$Level r0 = new kotlin.RequiresOptIn$Level
                java.lang.String r1 = "WARNING"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.RequiresOptIn.Level.WARNING = r0
                kotlin.RequiresOptIn$Level r0 = new kotlin.RequiresOptIn$Level
                java.lang.String r1 = "ERROR"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.RequiresOptIn.Level.ERROR = r0
                kotlin.RequiresOptIn$Level[] r0 = $values()
                kotlin.RequiresOptIn.Level.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.RequiresOptIn.Level.$ENTRIES = r0
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<kotlin.RequiresOptIn.Level> getEntries() {
                kotlin.enums.a r0 = kotlin.RequiresOptIn.Level.$ENTRIES
                return r0
        }

        public static kotlin.RequiresOptIn.Level valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.RequiresOptIn$Level> r0 = kotlin.RequiresOptIn.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.RequiresOptIn$Level r1 = (kotlin.RequiresOptIn.Level) r1
                return r1
        }

        public static kotlin.RequiresOptIn.Level[] values() {
                kotlin.RequiresOptIn$Level[] r0 = kotlin.RequiresOptIn.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.RequiresOptIn$Level[] r0 = (kotlin.RequiresOptIn.Level[]) r0
                return r0
        }
    }

    kotlin.RequiresOptIn.Level level() default kotlin.RequiresOptIn.Level.ERROR;

    java.lang.String message() default "";
}
