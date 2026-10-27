package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum KVisibility extends java.lang.Enum<kotlin.reflect.KVisibility> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.KVisibility[] $VALUES = null;
    public static final kotlin.reflect.KVisibility INTERNAL = null;
    public static final kotlin.reflect.KVisibility PRIVATE = null;
    public static final kotlin.reflect.KVisibility PROTECTED = null;
    public static final kotlin.reflect.KVisibility PUBLIC = null;

    private static final /* synthetic */ kotlin.reflect.KVisibility[] $values() {
            r0 = 4
            kotlin.reflect.KVisibility[] r0 = new kotlin.reflect.KVisibility[r0]
            kotlin.reflect.KVisibility r1 = kotlin.reflect.KVisibility.PUBLIC
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.KVisibility r1 = kotlin.reflect.KVisibility.PROTECTED
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.KVisibility r1 = kotlin.reflect.KVisibility.INTERNAL
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.KVisibility r1 = kotlin.reflect.KVisibility.PRIVATE
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.PUBLIC = r0
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "PROTECTED"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.PROTECTED = r0
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "INTERNAL"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.INTERNAL = r0
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "PRIVATE"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.PRIVATE = r0
            kotlin.reflect.KVisibility[] r0 = $values()
            kotlin.reflect.KVisibility.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.KVisibility.$ENTRIES = r0
            return
    }

    KVisibility(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.reflect.KVisibility> getEntries() {
            kotlin.enums.a r0 = kotlin.reflect.KVisibility.$ENTRIES
            return r0
    }

    public static kotlin.reflect.KVisibility valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.KVisibility> r0 = kotlin.reflect.KVisibility.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.KVisibility r1 = (kotlin.reflect.KVisibility) r1
            return r1
    }

    public static kotlin.reflect.KVisibility[] values() {
            kotlin.reflect.KVisibility[] r0 = kotlin.reflect.KVisibility.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.KVisibility[] r0 = (kotlin.reflect.KVisibility[]) r0
            return r0
    }
}
