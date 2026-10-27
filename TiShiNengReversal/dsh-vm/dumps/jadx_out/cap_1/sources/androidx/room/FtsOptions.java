package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FtsOptions {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.FtsOptions INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOKENIZER_ICU = "icu";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOKENIZER_PORTER = "porter";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOKENIZER_SIMPLE = "simple";

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOKENIZER_UNICODE61 = "unicode61";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum MatchInfo extends java.lang.Enum<androidx.room.FtsOptions.MatchInfo> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.FtsOptions.MatchInfo[] $VALUES = null;
        public static final androidx.room.FtsOptions.MatchInfo FTS3 = null;
        public static final androidx.room.FtsOptions.MatchInfo FTS4 = null;

        private static final /* synthetic */ androidx.room.FtsOptions.MatchInfo[] $values() {
                r0 = 2
                androidx.room.FtsOptions$MatchInfo[] r0 = new androidx.room.FtsOptions.MatchInfo[r0]
                androidx.room.FtsOptions$MatchInfo r1 = androidx.room.FtsOptions.MatchInfo.FTS3
                r2 = 0
                r0[r2] = r1
                androidx.room.FtsOptions$MatchInfo r1 = androidx.room.FtsOptions.MatchInfo.FTS4
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.FtsOptions$MatchInfo r0 = new androidx.room.FtsOptions$MatchInfo
                java.lang.String r1 = "FTS3"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.FtsOptions.MatchInfo.FTS3 = r0
                androidx.room.FtsOptions$MatchInfo r0 = new androidx.room.FtsOptions$MatchInfo
                java.lang.String r1 = "FTS4"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.FtsOptions.MatchInfo.FTS4 = r0
                androidx.room.FtsOptions$MatchInfo[] r0 = $values()
                androidx.room.FtsOptions.MatchInfo.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.FtsOptions.MatchInfo.$ENTRIES = r0
                return
        }

        MatchInfo(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.FtsOptions.MatchInfo> getEntries() {
                kotlin.enums.a r0 = androidx.room.FtsOptions.MatchInfo.$ENTRIES
                return r0
        }

        public static androidx.room.FtsOptions.MatchInfo valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.FtsOptions$MatchInfo> r0 = androidx.room.FtsOptions.MatchInfo.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.FtsOptions$MatchInfo r1 = (androidx.room.FtsOptions.MatchInfo) r1
                return r1
        }

        public static androidx.room.FtsOptions.MatchInfo[] values() {
                androidx.room.FtsOptions$MatchInfo[] r0 = androidx.room.FtsOptions.MatchInfo.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.FtsOptions$MatchInfo[] r0 = (androidx.room.FtsOptions.MatchInfo[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Order extends java.lang.Enum<androidx.room.FtsOptions.Order> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.FtsOptions.Order[] $VALUES = null;
        public static final androidx.room.FtsOptions.Order ASC = null;
        public static final androidx.room.FtsOptions.Order DESC = null;

        private static final /* synthetic */ androidx.room.FtsOptions.Order[] $values() {
                r0 = 2
                androidx.room.FtsOptions$Order[] r0 = new androidx.room.FtsOptions.Order[r0]
                androidx.room.FtsOptions$Order r1 = androidx.room.FtsOptions.Order.ASC
                r2 = 0
                r0[r2] = r1
                androidx.room.FtsOptions$Order r1 = androidx.room.FtsOptions.Order.DESC
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.FtsOptions$Order r0 = new androidx.room.FtsOptions$Order
                java.lang.String r1 = "ASC"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.FtsOptions.Order.ASC = r0
                androidx.room.FtsOptions$Order r0 = new androidx.room.FtsOptions$Order
                java.lang.String r1 = "DESC"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.FtsOptions.Order.DESC = r0
                androidx.room.FtsOptions$Order[] r0 = $values()
                androidx.room.FtsOptions.Order.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.FtsOptions.Order.$ENTRIES = r0
                return
        }

        Order(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.FtsOptions.Order> getEntries() {
                kotlin.enums.a r0 = androidx.room.FtsOptions.Order.$ENTRIES
                return r0
        }

        public static androidx.room.FtsOptions.Order valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.FtsOptions$Order> r0 = androidx.room.FtsOptions.Order.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.FtsOptions$Order r1 = (androidx.room.FtsOptions.Order) r1
                return r1
        }

        public static androidx.room.FtsOptions.Order[] values() {
                androidx.room.FtsOptions$Order[] r0 = androidx.room.FtsOptions.Order.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.FtsOptions$Order[] r0 = (androidx.room.FtsOptions.Order[]) r0
                return r0
        }
    }

    static {
            androidx.room.FtsOptions r0 = new androidx.room.FtsOptions
            r0.<init>()
            androidx.room.FtsOptions.INSTANCE = r0
            return
    }

    private FtsOptions() {
            r0 = this;
            r0.<init>()
            return
    }
}
