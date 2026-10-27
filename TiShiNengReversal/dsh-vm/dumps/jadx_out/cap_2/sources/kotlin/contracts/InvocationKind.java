package kotlin.contracts;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.internal.ContractsDsl
@kotlin.contracts.ExperimentalContracts
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum InvocationKind extends java.lang.Enum<kotlin.contracts.InvocationKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.contracts.InvocationKind[] $VALUES = null;

    @kotlin.internal.ContractsDsl
    public static final kotlin.contracts.InvocationKind AT_LEAST_ONCE = null;

    @kotlin.internal.ContractsDsl
    public static final kotlin.contracts.InvocationKind AT_MOST_ONCE = null;

    @kotlin.internal.ContractsDsl
    public static final kotlin.contracts.InvocationKind EXACTLY_ONCE = null;

    @kotlin.internal.ContractsDsl
    public static final kotlin.contracts.InvocationKind UNKNOWN = null;

    private static final /* synthetic */ kotlin.contracts.InvocationKind[] $values() {
            r0 = 4
            kotlin.contracts.InvocationKind[] r0 = new kotlin.contracts.InvocationKind[r0]
            kotlin.contracts.InvocationKind r1 = kotlin.contracts.InvocationKind.AT_MOST_ONCE
            r2 = 0
            r0[r2] = r1
            kotlin.contracts.InvocationKind r1 = kotlin.contracts.InvocationKind.AT_LEAST_ONCE
            r2 = 1
            r0[r2] = r1
            kotlin.contracts.InvocationKind r1 = kotlin.contracts.InvocationKind.EXACTLY_ONCE
            r2 = 2
            r0[r2] = r1
            kotlin.contracts.InvocationKind r1 = kotlin.contracts.InvocationKind.UNKNOWN
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "AT_MOST_ONCE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.AT_MOST_ONCE = r0
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "AT_LEAST_ONCE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.AT_LEAST_ONCE = r0
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "EXACTLY_ONCE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.EXACTLY_ONCE = r0
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "UNKNOWN"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.UNKNOWN = r0
            kotlin.contracts.InvocationKind[] r0 = $values()
            kotlin.contracts.InvocationKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.contracts.InvocationKind.$ENTRIES = r0
            return
    }

    InvocationKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.contracts.InvocationKind> getEntries() {
            kotlin.enums.a r0 = kotlin.contracts.InvocationKind.$ENTRIES
            return r0
    }

    public static kotlin.contracts.InvocationKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.contracts.InvocationKind> r0 = kotlin.contracts.InvocationKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.contracts.InvocationKind r1 = (kotlin.contracts.InvocationKind) r1
            return r1
    }

    public static kotlin.contracts.InvocationKind[] values() {
            kotlin.contracts.InvocationKind[] r0 = kotlin.contracts.InvocationKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.contracts.InvocationKind[] r0 = (kotlin.contracts.InvocationKind[]) r0
            return r0
    }
}
