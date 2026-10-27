package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Transactor extends androidx.room.PooledConnection {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SQLiteTransactionType extends java.lang.Enum<androidx.room.Transactor.SQLiteTransactionType> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.Transactor.SQLiteTransactionType[] $VALUES = null;
        public static final androidx.room.Transactor.SQLiteTransactionType DEFERRED = null;
        public static final androidx.room.Transactor.SQLiteTransactionType EXCLUSIVE = null;
        public static final androidx.room.Transactor.SQLiteTransactionType IMMEDIATE = null;

        private static final /* synthetic */ androidx.room.Transactor.SQLiteTransactionType[] $values() {
                r0 = 3
                androidx.room.Transactor$SQLiteTransactionType[] r0 = new androidx.room.Transactor.SQLiteTransactionType[r0]
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED
                r2 = 0
                r0[r2] = r1
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
                r2 = 1
                r0[r2] = r1
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.EXCLUSIVE
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.Transactor$SQLiteTransactionType r0 = new androidx.room.Transactor$SQLiteTransactionType
                java.lang.String r1 = "DEFERRED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.Transactor.SQLiteTransactionType.DEFERRED = r0
                androidx.room.Transactor$SQLiteTransactionType r0 = new androidx.room.Transactor$SQLiteTransactionType
                java.lang.String r1 = "IMMEDIATE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE = r0
                androidx.room.Transactor$SQLiteTransactionType r0 = new androidx.room.Transactor$SQLiteTransactionType
                java.lang.String r1 = "EXCLUSIVE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.room.Transactor.SQLiteTransactionType.EXCLUSIVE = r0
                androidx.room.Transactor$SQLiteTransactionType[] r0 = $values()
                androidx.room.Transactor.SQLiteTransactionType.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.Transactor.SQLiteTransactionType.$ENTRIES = r0
                return
        }

        SQLiteTransactionType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.Transactor.SQLiteTransactionType> getEntries() {
                kotlin.enums.a r0 = androidx.room.Transactor.SQLiteTransactionType.$ENTRIES
                return r0
        }

        public static androidx.room.Transactor.SQLiteTransactionType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.Transactor$SQLiteTransactionType> r0 = androidx.room.Transactor.SQLiteTransactionType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
                return r1
        }

        public static androidx.room.Transactor.SQLiteTransactionType[] values() {
                androidx.room.Transactor$SQLiteTransactionType[] r0 = androidx.room.Transactor.SQLiteTransactionType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.Transactor$SQLiteTransactionType[] r0 = (androidx.room.Transactor.SQLiteTransactionType[]) r0
                return r0
        }
    }

    @org.jetbrains.annotations.Nullable
    java.lang.Object inTransaction(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r1);

    @org.jetbrains.annotations.Nullable
    <R> java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull androidx.room.Transactor.SQLiteTransactionType r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3);
}
