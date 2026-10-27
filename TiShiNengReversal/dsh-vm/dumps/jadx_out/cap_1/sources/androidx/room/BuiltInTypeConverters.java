package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({})
@kotlin.annotation.Target(allowedTargets = {})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface BuiltInTypeConverters {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum State extends java.lang.Enum<androidx.room.BuiltInTypeConverters.State> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.BuiltInTypeConverters.State[] $VALUES = null;
        public static final androidx.room.BuiltInTypeConverters.State DISABLED = null;
        public static final androidx.room.BuiltInTypeConverters.State ENABLED = null;
        public static final androidx.room.BuiltInTypeConverters.State INHERITED = null;

        private static final /* synthetic */ androidx.room.BuiltInTypeConverters.State[] $values() {
                r0 = 3
                androidx.room.BuiltInTypeConverters$State[] r0 = new androidx.room.BuiltInTypeConverters.State[r0]
                androidx.room.BuiltInTypeConverters$State r1 = androidx.room.BuiltInTypeConverters.State.ENABLED
                r2 = 0
                r0[r2] = r1
                androidx.room.BuiltInTypeConverters$State r1 = androidx.room.BuiltInTypeConverters.State.DISABLED
                r2 = 1
                r0[r2] = r1
                androidx.room.BuiltInTypeConverters$State r1 = androidx.room.BuiltInTypeConverters.State.INHERITED
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.BuiltInTypeConverters$State r0 = new androidx.room.BuiltInTypeConverters$State
                java.lang.String r1 = "ENABLED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.BuiltInTypeConverters.State.ENABLED = r0
                androidx.room.BuiltInTypeConverters$State r0 = new androidx.room.BuiltInTypeConverters$State
                java.lang.String r1 = "DISABLED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.BuiltInTypeConverters.State.DISABLED = r0
                androidx.room.BuiltInTypeConverters$State r0 = new androidx.room.BuiltInTypeConverters$State
                java.lang.String r1 = "INHERITED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.room.BuiltInTypeConverters.State.INHERITED = r0
                androidx.room.BuiltInTypeConverters$State[] r0 = $values()
                androidx.room.BuiltInTypeConverters.State.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.BuiltInTypeConverters.State.$ENTRIES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.BuiltInTypeConverters.State> getEntries() {
                kotlin.enums.a r0 = androidx.room.BuiltInTypeConverters.State.$ENTRIES
                return r0
        }

        public static androidx.room.BuiltInTypeConverters.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.BuiltInTypeConverters$State> r0 = androidx.room.BuiltInTypeConverters.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.BuiltInTypeConverters$State r1 = (androidx.room.BuiltInTypeConverters.State) r1
                return r1
        }

        public static androidx.room.BuiltInTypeConverters.State[] values() {
                androidx.room.BuiltInTypeConverters$State[] r0 = androidx.room.BuiltInTypeConverters.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.BuiltInTypeConverters$State[] r0 = (androidx.room.BuiltInTypeConverters.State[]) r0
                return r0
        }
    }

    androidx.room.BuiltInTypeConverters.State byteBuffer() default androidx.room.BuiltInTypeConverters.State.INHERITED;

    androidx.room.BuiltInTypeConverters.State enums() default androidx.room.BuiltInTypeConverters.State.INHERITED;

    androidx.room.BuiltInTypeConverters.State uuid() default androidx.room.BuiltInTypeConverters.State.INHERITED;
}
