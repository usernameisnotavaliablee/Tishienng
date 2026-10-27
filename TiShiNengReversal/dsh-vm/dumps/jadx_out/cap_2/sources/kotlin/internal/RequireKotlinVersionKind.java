package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.2")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum RequireKotlinVersionKind extends java.lang.Enum<kotlin.internal.RequireKotlinVersionKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] $VALUES = null;
    public static final kotlin.internal.RequireKotlinVersionKind API_VERSION = null;
    public static final kotlin.internal.RequireKotlinVersionKind COMPILER_VERSION = null;
    public static final kotlin.internal.RequireKotlinVersionKind LANGUAGE_VERSION = null;

    private static final /* synthetic */ kotlin.internal.RequireKotlinVersionKind[] $values() {
            r0 = 3
            kotlin.internal.RequireKotlinVersionKind[] r0 = new kotlin.internal.RequireKotlinVersionKind[r0]
            kotlin.internal.RequireKotlinVersionKind r1 = kotlin.internal.RequireKotlinVersionKind.LANGUAGE_VERSION
            r2 = 0
            r0[r2] = r1
            kotlin.internal.RequireKotlinVersionKind r1 = kotlin.internal.RequireKotlinVersionKind.COMPILER_VERSION
            r2 = 1
            r0[r2] = r1
            kotlin.internal.RequireKotlinVersionKind r1 = kotlin.internal.RequireKotlinVersionKind.API_VERSION
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.internal.RequireKotlinVersionKind r0 = new kotlin.internal.RequireKotlinVersionKind
            java.lang.String r1 = "LANGUAGE_VERSION"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.internal.RequireKotlinVersionKind.LANGUAGE_VERSION = r0
            kotlin.internal.RequireKotlinVersionKind r0 = new kotlin.internal.RequireKotlinVersionKind
            java.lang.String r1 = "COMPILER_VERSION"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.internal.RequireKotlinVersionKind.COMPILER_VERSION = r0
            kotlin.internal.RequireKotlinVersionKind r0 = new kotlin.internal.RequireKotlinVersionKind
            java.lang.String r1 = "API_VERSION"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.internal.RequireKotlinVersionKind.API_VERSION = r0
            kotlin.internal.RequireKotlinVersionKind[] r0 = $values()
            kotlin.internal.RequireKotlinVersionKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.internal.RequireKotlinVersionKind.$ENTRIES = r0
            return
    }

    RequireKotlinVersionKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.internal.RequireKotlinVersionKind> getEntries() {
            kotlin.enums.a r0 = kotlin.internal.RequireKotlinVersionKind.$ENTRIES
            return r0
    }

    public static kotlin.internal.RequireKotlinVersionKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.internal.RequireKotlinVersionKind> r0 = kotlin.internal.RequireKotlinVersionKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.internal.RequireKotlinVersionKind r1 = (kotlin.internal.RequireKotlinVersionKind) r1
            return r1
    }

    public static kotlin.internal.RequireKotlinVersionKind[] values() {
            kotlin.internal.RequireKotlinVersionKind[] r0 = kotlin.internal.RequireKotlinVersionKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.internal.RequireKotlinVersionKind[] r0 = (kotlin.internal.RequireKotlinVersionKind[]) r0
            return r0
    }
}
