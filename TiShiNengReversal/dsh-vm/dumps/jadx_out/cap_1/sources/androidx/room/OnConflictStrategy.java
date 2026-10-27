package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface OnConflictStrategy {
    public static final int ABORT = 3;

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.OnConflictStrategy.Companion Companion = null;
    public static final int FAIL = 4;
    public static final int IGNORE = 5;
    public static final int NONE = 0;
    public static final int REPLACE = 1;
    public static final int ROLLBACK = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ androidx.room.OnConflictStrategy.Companion $$INSTANCE = null;
        public static final int ABORT = 3;
        public static final int FAIL = 4;
        public static final int IGNORE = 5;
        public static final int NONE = 0;
        public static final int REPLACE = 1;
        public static final int ROLLBACK = 2;

        static {
                androidx.room.OnConflictStrategy$Companion r0 = new androidx.room.OnConflictStrategy$Companion
                r0.<init>()
                androidx.room.OnConflictStrategy.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.Deprecated(message = "Use ABORT instead.")
        public static /* synthetic */ void getFAIL$annotations() {
                return
        }

        @kotlin.Deprecated(message = "Use ABORT instead.")
        public static /* synthetic */ void getROLLBACK$annotations() {
                return
        }
    }

    static {
            androidx.room.OnConflictStrategy$Companion r0 = androidx.room.OnConflictStrategy.Companion.$$INSTANCE
            androidx.room.OnConflictStrategy.Companion = r0
            return
    }
}
