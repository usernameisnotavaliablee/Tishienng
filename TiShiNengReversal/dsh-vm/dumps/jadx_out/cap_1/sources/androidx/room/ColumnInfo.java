package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface ColumnInfo {
    public static final int BINARY = 2;
    public static final int BLOB = 5;

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.ColumnInfo.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INHERIT_FIELD_NAME = "[field-name]";
    public static final int INTEGER = 3;

    @androidx.annotation.RequiresApi(21)
    public static final int LOCALIZED = 5;
    public static final int NOCASE = 3;
    public static final int REAL = 4;
    public static final int RTRIM = 4;
    public static final int TEXT = 2;
    public static final int UNDEFINED = 1;

    @androidx.annotation.RequiresApi(21)
    public static final int UNICODE = 6;
    public static final int UNSPECIFIED = 1;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_UNSPECIFIED = "[value-unspecified]";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface Collate {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ androidx.room.ColumnInfo.Companion $$INSTANCE = null;
        public static final int BINARY = 2;
        public static final int BLOB = 5;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String INHERIT_FIELD_NAME = "[field-name]";
        public static final int INTEGER = 3;

        @androidx.annotation.RequiresApi(21)
        public static final int LOCALIZED = 5;
        public static final int NOCASE = 3;
        public static final int REAL = 4;
        public static final int RTRIM = 4;
        public static final int TEXT = 2;
        public static final int UNDEFINED = 1;

        @androidx.annotation.RequiresApi(21)
        public static final int UNICODE = 6;
        public static final int UNSPECIFIED = 1;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String VALUE_UNSPECIFIED = "[value-unspecified]";

        static {
                androidx.room.ColumnInfo$Companion r0 = new androidx.room.ColumnInfo$Companion
                r0.<init>()
                androidx.room.ColumnInfo.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface SQLiteTypeAffinity {
    }

    static {
            androidx.room.ColumnInfo$Companion r0 = androidx.room.ColumnInfo.Companion.$$INSTANCE
            androidx.room.ColumnInfo.Companion = r0
            return
    }

    @androidx.room.ColumnInfo.Collate
    int collate() default 1;

    java.lang.String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    java.lang.String name() default "[field-name]";

    @androidx.room.ColumnInfo.SQLiteTypeAffinity
    int typeAffinity() default 1;
}
