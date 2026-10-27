package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "2.1")
@kotlin.WasExperimental(markerClass = {kotlin.io.path.ExperimentalPathApi.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum PathWalkOption extends java.lang.Enum<kotlin.io.path.PathWalkOption> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] $VALUES = null;
    public static final kotlin.io.path.PathWalkOption BREADTH_FIRST = null;
    public static final kotlin.io.path.PathWalkOption FOLLOW_LINKS = null;
    public static final kotlin.io.path.PathWalkOption INCLUDE_DIRECTORIES = null;

    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] $values() {
            r0 = 3
            kotlin.io.path.PathWalkOption[] r0 = new kotlin.io.path.PathWalkOption[r0]
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES
            r2 = 0
            r0[r2] = r1
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.BREADTH_FIRST
            r2 = 1
            r0[r2] = r1
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.FOLLOW_LINKS
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.io.path.PathWalkOption r0 = new kotlin.io.path.PathWalkOption
            java.lang.String r1 = "INCLUDE_DIRECTORIES"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES = r0
            kotlin.io.path.PathWalkOption r0 = new kotlin.io.path.PathWalkOption
            java.lang.String r1 = "BREADTH_FIRST"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.path.PathWalkOption.BREADTH_FIRST = r0
            kotlin.io.path.PathWalkOption r0 = new kotlin.io.path.PathWalkOption
            java.lang.String r1 = "FOLLOW_LINKS"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.io.path.PathWalkOption.FOLLOW_LINKS = r0
            kotlin.io.path.PathWalkOption[] r0 = $values()
            kotlin.io.path.PathWalkOption.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.io.path.PathWalkOption.$ENTRIES = r0
            return
    }

    PathWalkOption(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.io.path.PathWalkOption> getEntries() {
            kotlin.enums.a r0 = kotlin.io.path.PathWalkOption.$ENTRIES
            return r0
    }

    public static kotlin.io.path.PathWalkOption valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.path.PathWalkOption> r0 = kotlin.io.path.PathWalkOption.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.path.PathWalkOption r1 = (kotlin.io.path.PathWalkOption) r1
            return r1
    }

    public static kotlin.io.path.PathWalkOption[] values() {
            kotlin.io.path.PathWalkOption[] r0 = kotlin.io.path.PathWalkOption.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.path.PathWalkOption[] r0 = (kotlin.io.path.PathWalkOption[]) r0
            return r0
    }
}
