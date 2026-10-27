package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RoomWarnings {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AMBIGUOUS_COLUMN_IN_RESULT = "ROOM_AMBIGUOUS_COLUMN_IN_RESULT";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CANNOT_CREATE_VERIFICATION_DATABASE = "ROOM_CANNOT_CREATE_VERIFICATION_DATABASE";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CURSOR_MISMATCH = "ROOM_CURSOR_MISMATCH";

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomWarnings.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_CONSTRUCTOR = "ROOM_DEFAULT_CONSTRUCTOR";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DOES_NOT_IMPLEMENT_EQUALS_HASHCODE = "ROOM_TYPE_DOES_NOT_IMPLEMENT_EQUALS_HASHCODE";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INDEX_FROM_EMBEDDED_ENTITY_IS_DROPPED = "ROOM_EMBEDDED_ENTITY_INDEX_IS_DROPPED";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INDEX_FROM_EMBEDDED_FIELD_IS_DROPPED = "ROOM_EMBEDDED_INDEX_IS_DROPPED";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INDEX_FROM_PARENT_FIELD_IS_DROPPED = "ROOM_PARENT_FIELD_INDEX_IS_DROPPED";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INDEX_FROM_PARENT_IS_DROPPED = "ROOM_PARENT_INDEX_IS_DROPPED";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISMATCHED_GETTER = "ROOM_MISMATCHED_GETTER_TYPE";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISMATCHED_SETTER = "ROOM_MISMATCHED_SETTER_TYPE";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISSING_INDEX_ON_FOREIGN_KEY_CHILD = "ROOM_MISSING_FOREIGN_KEY_CHILD_INDEX";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISSING_INDEX_ON_JUNCTION = "MISSING_INDEX_ON_JUNCTION";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISSING_JAVA_TMP_DIR = "ROOM_MISSING_JAVA_TMP_DIR";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISSING_SCHEMA_LOCATION = "ROOM_MISSING_SCHEMA_LOCATION";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED = "ROOM_EMBEDDED_PRIMARY_KEY_IS_DROPPED";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUERY_MISMATCH = "ROOM_QUERY_MISMATCH";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RELATION_QUERY_WITHOUT_TRANSACTION = "ROOM_RELATION_QUERY_WITHOUT_TRANSACTION";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RELATION_TYPE_MISMATCH = "ROOM_RELATION_TYPE_MISMATCH";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE = "ROOM_UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.Deprecated(message = "Replaced by QUERY_MISMATCH.", replaceWith = @kotlin.ReplaceWith(expression = "QUERY_MISMATCH", imports = {}))
        public static /* synthetic */ void getCURSOR_MISMATCH$annotations() {
                return
        }
    }

    static {
            androidx.room.RoomWarnings$Companion r0 = new androidx.room.RoomWarnings$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.RoomWarnings.Companion = r0
            return
    }

    @kotlin.Deprecated(message = "This type should not be instantiated as it contains only static methods. ")
    public RoomWarnings() {
            r0 = this;
            r0.<init>()
            return
    }
}
