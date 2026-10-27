package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum OnErrorAction extends java.lang.Enum<kotlin.io.OnErrorAction> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.io.OnErrorAction[] $VALUES = null;
    public static final kotlin.io.OnErrorAction SKIP = null;
    public static final kotlin.io.OnErrorAction TERMINATE = null;

    private static final /* synthetic */ kotlin.io.OnErrorAction[] $values() {
            r0 = 2
            kotlin.io.OnErrorAction[] r0 = new kotlin.io.OnErrorAction[r0]
            kotlin.io.OnErrorAction r1 = kotlin.io.OnErrorAction.SKIP
            r2 = 0
            r0[r2] = r1
            kotlin.io.OnErrorAction r1 = kotlin.io.OnErrorAction.TERMINATE
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.io.OnErrorAction r0 = new kotlin.io.OnErrorAction
            java.lang.String r1 = "SKIP"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.OnErrorAction.SKIP = r0
            kotlin.io.OnErrorAction r0 = new kotlin.io.OnErrorAction
            java.lang.String r1 = "TERMINATE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.OnErrorAction.TERMINATE = r0
            kotlin.io.OnErrorAction[] r0 = $values()
            kotlin.io.OnErrorAction.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.io.OnErrorAction.$ENTRIES = r0
            return
    }

    OnErrorAction(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.io.OnErrorAction> getEntries() {
            kotlin.enums.a r0 = kotlin.io.OnErrorAction.$ENTRIES
            return r0
    }

    public static kotlin.io.OnErrorAction valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.OnErrorAction> r0 = kotlin.io.OnErrorAction.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.OnErrorAction r1 = (kotlin.io.OnErrorAction) r1
            return r1
    }

    public static kotlin.io.OnErrorAction[] values() {
            kotlin.io.OnErrorAction[] r0 = kotlin.io.OnErrorAction.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.OnErrorAction[] r0 = (kotlin.io.OnErrorAction[]) r0
            return r0
    }
}
