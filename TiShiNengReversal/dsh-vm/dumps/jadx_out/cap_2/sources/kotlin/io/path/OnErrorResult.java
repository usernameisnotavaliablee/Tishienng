package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.8")
@kotlin.io.path.ExperimentalPathApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum OnErrorResult extends java.lang.Enum<kotlin.io.path.OnErrorResult> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.io.path.OnErrorResult[] $VALUES = null;
    public static final kotlin.io.path.OnErrorResult SKIP_SUBTREE = null;
    public static final kotlin.io.path.OnErrorResult TERMINATE = null;

    private static final /* synthetic */ kotlin.io.path.OnErrorResult[] $values() {
            r0 = 2
            kotlin.io.path.OnErrorResult[] r0 = new kotlin.io.path.OnErrorResult[r0]
            kotlin.io.path.OnErrorResult r1 = kotlin.io.path.OnErrorResult.SKIP_SUBTREE
            r2 = 0
            r0[r2] = r1
            kotlin.io.path.OnErrorResult r1 = kotlin.io.path.OnErrorResult.TERMINATE
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.io.path.OnErrorResult r0 = new kotlin.io.path.OnErrorResult
            java.lang.String r1 = "SKIP_SUBTREE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.path.OnErrorResult.SKIP_SUBTREE = r0
            kotlin.io.path.OnErrorResult r0 = new kotlin.io.path.OnErrorResult
            java.lang.String r1 = "TERMINATE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.path.OnErrorResult.TERMINATE = r0
            kotlin.io.path.OnErrorResult[] r0 = $values()
            kotlin.io.path.OnErrorResult.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.io.path.OnErrorResult.$ENTRIES = r0
            return
    }

    OnErrorResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.io.path.OnErrorResult> getEntries() {
            kotlin.enums.a r0 = kotlin.io.path.OnErrorResult.$ENTRIES
            return r0
    }

    public static kotlin.io.path.OnErrorResult valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.path.OnErrorResult> r0 = kotlin.io.path.OnErrorResult.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.path.OnErrorResult r1 = (kotlin.io.path.OnErrorResult) r1
            return r1
    }

    public static kotlin.io.path.OnErrorResult[] values() {
            kotlin.io.path.OnErrorResult[] r0 = kotlin.io.path.OnErrorResult.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.path.OnErrorResult[] r0 = (kotlin.io.path.OnErrorResult[]) r0
            return r0
    }
}
