package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum FileWalkDirection extends java.lang.Enum<kotlin.io.FileWalkDirection> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.io.FileWalkDirection[] $VALUES = null;
    public static final kotlin.io.FileWalkDirection BOTTOM_UP = null;
    public static final kotlin.io.FileWalkDirection TOP_DOWN = null;

    private static final /* synthetic */ kotlin.io.FileWalkDirection[] $values() {
            r0 = 2
            kotlin.io.FileWalkDirection[] r0 = new kotlin.io.FileWalkDirection[r0]
            kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN
            r2 = 0
            r0[r2] = r1
            kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.BOTTOM_UP
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.io.FileWalkDirection r0 = new kotlin.io.FileWalkDirection
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.FileWalkDirection.TOP_DOWN = r0
            kotlin.io.FileWalkDirection r0 = new kotlin.io.FileWalkDirection
            java.lang.String r1 = "BOTTOM_UP"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.FileWalkDirection.BOTTOM_UP = r0
            kotlin.io.FileWalkDirection[] r0 = $values()
            kotlin.io.FileWalkDirection.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.io.FileWalkDirection.$ENTRIES = r0
            return
    }

    FileWalkDirection(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.io.FileWalkDirection> getEntries() {
            kotlin.enums.a r0 = kotlin.io.FileWalkDirection.$ENTRIES
            return r0
    }

    public static kotlin.io.FileWalkDirection valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.FileWalkDirection> r0 = kotlin.io.FileWalkDirection.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.FileWalkDirection r1 = (kotlin.io.FileWalkDirection) r1
            return r1
    }

    public static kotlin.io.FileWalkDirection[] values() {
            kotlin.io.FileWalkDirection[] r0 = kotlin.io.FileWalkDirection.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.FileWalkDirection[] r0 = (kotlin.io.FileWalkDirection[]) r0
            return r0
    }
}
