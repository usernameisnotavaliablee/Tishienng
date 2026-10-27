package kotlin.annotation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum AnnotationRetention extends java.lang.Enum<kotlin.annotation.AnnotationRetention> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.annotation.AnnotationRetention[] $VALUES = null;
    public static final kotlin.annotation.AnnotationRetention BINARY = null;
    public static final kotlin.annotation.AnnotationRetention RUNTIME = null;
    public static final kotlin.annotation.AnnotationRetention SOURCE = null;

    private static final /* synthetic */ kotlin.annotation.AnnotationRetention[] $values() {
            r0 = 3
            kotlin.annotation.AnnotationRetention[] r0 = new kotlin.annotation.AnnotationRetention[r0]
            kotlin.annotation.AnnotationRetention r1 = kotlin.annotation.AnnotationRetention.SOURCE
            r2 = 0
            r0[r2] = r1
            kotlin.annotation.AnnotationRetention r1 = kotlin.annotation.AnnotationRetention.BINARY
            r2 = 1
            r0[r2] = r1
            kotlin.annotation.AnnotationRetention r1 = kotlin.annotation.AnnotationRetention.RUNTIME
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.annotation.AnnotationRetention r0 = new kotlin.annotation.AnnotationRetention
            java.lang.String r1 = "SOURCE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationRetention.SOURCE = r0
            kotlin.annotation.AnnotationRetention r0 = new kotlin.annotation.AnnotationRetention
            java.lang.String r1 = "BINARY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationRetention.BINARY = r0
            kotlin.annotation.AnnotationRetention r0 = new kotlin.annotation.AnnotationRetention
            java.lang.String r1 = "RUNTIME"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationRetention.RUNTIME = r0
            kotlin.annotation.AnnotationRetention[] r0 = $values()
            kotlin.annotation.AnnotationRetention.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.annotation.AnnotationRetention.$ENTRIES = r0
            return
    }

    AnnotationRetention(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlin.annotation.AnnotationRetention> getEntries() {
            kotlin.enums.a r0 = kotlin.annotation.AnnotationRetention.$ENTRIES
            return r0
    }

    public static kotlin.annotation.AnnotationRetention valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.annotation.AnnotationRetention> r0 = kotlin.annotation.AnnotationRetention.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.annotation.AnnotationRetention r1 = (kotlin.annotation.AnnotationRetention) r1
            return r1
    }

    public static kotlin.annotation.AnnotationRetention[] values() {
            kotlin.annotation.AnnotationRetention[] r0 = kotlin.annotation.AnnotationRetention.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.annotation.AnnotationRetention[] r0 = (kotlin.annotation.AnnotationRetention[]) r0
            return r0
    }
}
