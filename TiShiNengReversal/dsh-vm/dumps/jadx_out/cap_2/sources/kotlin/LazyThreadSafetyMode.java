package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum LazyThreadSafetyMode extends java.lang.Enum<kotlin.LazyThreadSafetyMode> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] $VALUES = null;
    public static final kotlin.LazyThreadSafetyMode NONE = null;
    public static final kotlin.LazyThreadSafetyMode PUBLICATION = null;
    public static final kotlin.LazyThreadSafetyMode SYNCHRONIZED = null;

    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] $values() {
            r0 = 3
            kotlin.LazyThreadSafetyMode[] r0 = new kotlin.LazyThreadSafetyMode[r0]
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED
            r2 = 0
            r0[r2] = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION
            r2 = 1
            r0[r2] = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.LazyThreadSafetyMode r0 = new kotlin.LazyThreadSafetyMode
            java.lang.String r1 = "SYNCHRONIZED"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.LazyThreadSafetyMode.SYNCHRONIZED = r0
            kotlin.LazyThreadSafetyMode r0 = new kotlin.LazyThreadSafetyMode
            java.lang.String r1 = "PUBLICATION"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.LazyThreadSafetyMode.PUBLICATION = r0
            kotlin.LazyThreadSafetyMode r0 = new kotlin.LazyThreadSafetyMode
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.LazyThreadSafetyMode.NONE = r0
            kotlin.LazyThreadSafetyMode[] r0 = $values()
            kotlin.LazyThreadSafetyMode.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.LazyThreadSafetyMode.$ENTRIES = r0
            return
    }

    LazyThreadSafetyMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.LazyThreadSafetyMode> getEntries() {
            kotlin.enums.a r0 = kotlin.LazyThreadSafetyMode.$ENTRIES
            return r0
    }

    public static kotlin.LazyThreadSafetyMode valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.LazyThreadSafetyMode> r0 = kotlin.LazyThreadSafetyMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.LazyThreadSafetyMode r1 = (kotlin.LazyThreadSafetyMode) r1
            return r1
    }

    public static kotlin.LazyThreadSafetyMode[] values() {
            kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.LazyThreadSafetyMode[] r0 = (kotlin.LazyThreadSafetyMode[]) r0
            return r0
    }
}
