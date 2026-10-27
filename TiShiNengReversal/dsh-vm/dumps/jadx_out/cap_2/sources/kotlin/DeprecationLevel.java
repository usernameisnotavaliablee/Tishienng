package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum DeprecationLevel extends java.lang.Enum<kotlin.DeprecationLevel> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.DeprecationLevel[] $VALUES = null;
    public static final kotlin.DeprecationLevel ERROR = null;
    public static final kotlin.DeprecationLevel HIDDEN = null;
    public static final kotlin.DeprecationLevel WARNING = null;

    private static final /* synthetic */ kotlin.DeprecationLevel[] $values() {
            r0 = 3
            kotlin.DeprecationLevel[] r0 = new kotlin.DeprecationLevel[r0]
            kotlin.DeprecationLevel r1 = kotlin.DeprecationLevel.WARNING
            r2 = 0
            r0[r2] = r1
            kotlin.DeprecationLevel r1 = kotlin.DeprecationLevel.ERROR
            r2 = 1
            r0[r2] = r1
            kotlin.DeprecationLevel r1 = kotlin.DeprecationLevel.HIDDEN
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.DeprecationLevel r0 = new kotlin.DeprecationLevel
            java.lang.String r1 = "WARNING"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.DeprecationLevel.WARNING = r0
            kotlin.DeprecationLevel r0 = new kotlin.DeprecationLevel
            java.lang.String r1 = "ERROR"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.DeprecationLevel.ERROR = r0
            kotlin.DeprecationLevel r0 = new kotlin.DeprecationLevel
            java.lang.String r1 = "HIDDEN"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.DeprecationLevel.HIDDEN = r0
            kotlin.DeprecationLevel[] r0 = $values()
            kotlin.DeprecationLevel.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.DeprecationLevel.$ENTRIES = r0
            return
    }

    DeprecationLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.DeprecationLevel> getEntries() {
            kotlin.enums.a r0 = kotlin.DeprecationLevel.$ENTRIES
            return r0
    }

    public static kotlin.DeprecationLevel valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.DeprecationLevel> r0 = kotlin.DeprecationLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.DeprecationLevel r1 = (kotlin.DeprecationLevel) r1
            return r1
    }

    public static kotlin.DeprecationLevel[] values() {
            kotlin.DeprecationLevel[] r0 = kotlin.DeprecationLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.DeprecationLevel[] r0 = (kotlin.DeprecationLevel[]) r0
            return r0
    }
}
