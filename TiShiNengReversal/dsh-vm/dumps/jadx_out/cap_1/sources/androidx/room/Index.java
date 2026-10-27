package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.annotation.Target({})
@kotlin.annotation.Target(allowedTargets = {})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public @interface Index {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Order extends java.lang.Enum<androidx.room.Index.Order> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.Index.Order[] $VALUES = null;
        public static final androidx.room.Index.Order ASC = null;
        public static final androidx.room.Index.Order DESC = null;

        private static final /* synthetic */ androidx.room.Index.Order[] $values() {
                r0 = 2
                androidx.room.Index$Order[] r0 = new androidx.room.Index.Order[r0]
                androidx.room.Index$Order r1 = androidx.room.Index.Order.ASC
                r2 = 0
                r0[r2] = r1
                androidx.room.Index$Order r1 = androidx.room.Index.Order.DESC
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.Index$Order r0 = new androidx.room.Index$Order
                java.lang.String r1 = "ASC"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.Index.Order.ASC = r0
                androidx.room.Index$Order r0 = new androidx.room.Index$Order
                java.lang.String r1 = "DESC"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.Index.Order.DESC = r0
                androidx.room.Index$Order[] r0 = $values()
                androidx.room.Index.Order.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.Index.Order.$ENTRIES = r0
                return
        }

        Order(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.Index.Order> getEntries() {
                kotlin.enums.a r0 = androidx.room.Index.Order.$ENTRIES
                return r0
        }

        public static androidx.room.Index.Order valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.Index$Order> r0 = androidx.room.Index.Order.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.Index$Order r1 = (androidx.room.Index.Order) r1
                return r1
        }

        public static androidx.room.Index.Order[] values() {
                androidx.room.Index$Order[] r0 = androidx.room.Index.Order.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.Index$Order[] r0 = (androidx.room.Index.Order[]) r0
                return r0
        }
    }

    java.lang.String name() default "";

    androidx.room.Index.Order[] orders() default {};

    boolean unique() default false;

    java.lang.String[] value();
}
