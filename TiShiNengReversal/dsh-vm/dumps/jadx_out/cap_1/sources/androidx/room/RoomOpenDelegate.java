package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RoomOpenDelegate implements androidx.room.RoomOpenDelegateMarker {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String identityHash;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String legacyIdentityHash;
    private final int version;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class ValidationResult {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.String expectedFoundMsg;

        @kotlin.jvm.JvmField
        public final boolean isValid;

        public ValidationResult(boolean r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.isValid = r1
                r0.expectedFoundMsg = r2
                return
        }
    }

    public RoomOpenDelegate(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "identityHash"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "legacyIdentityHash"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.version = r2
            r1.identityHash = r3
            r1.legacyIdentityHash = r4
            return
    }

    public abstract void createAllTables(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);

    public abstract void dropAllTables(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdentityHash() {
            r1 = this;
            java.lang.String r0 = r1.identityHash
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLegacyIdentityHash() {
            r1 = this;
            java.lang.String r0 = r1.legacyIdentityHash
            return r0
    }

    public final int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    public abstract void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);

    public abstract void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);

    public abstract void onPostMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);

    public abstract void onPreMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);

    @org.jetbrains.annotations.NotNull
    public abstract androidx.room.RoomOpenDelegate.ValidationResult onValidateSchema(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1);
}
