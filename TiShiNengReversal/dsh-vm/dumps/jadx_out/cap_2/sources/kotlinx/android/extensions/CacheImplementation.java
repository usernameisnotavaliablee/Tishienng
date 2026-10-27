package kotlinx.android.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum CacheImplementation extends java.lang.Enum<kotlinx.android.extensions.CacheImplementation> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlinx.android.extensions.CacheImplementation[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.android.extensions.CacheImplementation.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.android.extensions.CacheImplementation DEFAULT = null;
    public static final kotlinx.android.extensions.CacheImplementation HASH_MAP = null;
    public static final kotlinx.android.extensions.CacheImplementation NO_CACHE = null;
    public static final kotlinx.android.extensions.CacheImplementation SPARSE_ARRAY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.android.extensions.CacheImplementation a() {
                r1 = this;
                kotlinx.android.extensions.CacheImplementation r0 = kotlinx.android.extensions.CacheImplementation.access$getDEFAULT$cp()
                return r0
        }
    }

    private static final /* synthetic */ kotlinx.android.extensions.CacheImplementation[] $values() {
            r0 = 3
            kotlinx.android.extensions.CacheImplementation[] r0 = new kotlinx.android.extensions.CacheImplementation[r0]
            kotlinx.android.extensions.CacheImplementation r1 = kotlinx.android.extensions.CacheImplementation.SPARSE_ARRAY
            r2 = 0
            r0[r2] = r1
            kotlinx.android.extensions.CacheImplementation r1 = kotlinx.android.extensions.CacheImplementation.HASH_MAP
            r2 = 1
            r0[r2] = r1
            kotlinx.android.extensions.CacheImplementation r1 = kotlinx.android.extensions.CacheImplementation.NO_CACHE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.android.extensions.CacheImplementation r0 = new kotlinx.android.extensions.CacheImplementation
            java.lang.String r1 = "SPARSE_ARRAY"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.android.extensions.CacheImplementation.SPARSE_ARRAY = r0
            kotlinx.android.extensions.CacheImplementation r0 = new kotlinx.android.extensions.CacheImplementation
            java.lang.String r1 = "HASH_MAP"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.android.extensions.CacheImplementation.HASH_MAP = r0
            kotlinx.android.extensions.CacheImplementation r1 = new kotlinx.android.extensions.CacheImplementation
            java.lang.String r2 = "NO_CACHE"
            r3 = 2
            r1.<init>(r2, r3)
            kotlinx.android.extensions.CacheImplementation.NO_CACHE = r1
            kotlinx.android.extensions.CacheImplementation[] r1 = $values()
            kotlinx.android.extensions.CacheImplementation.$VALUES = r1
            kotlin.enums.a r1 = kotlin.enums.c.c(r1)
            kotlinx.android.extensions.CacheImplementation.$ENTRIES = r1
            kotlinx.android.extensions.CacheImplementation$a r1 = new kotlinx.android.extensions.CacheImplementation$a
            r2 = 0
            r1.<init>(r2)
            kotlinx.android.extensions.CacheImplementation.Companion = r1
            kotlinx.android.extensions.CacheImplementation.DEFAULT = r0
            return
    }

    CacheImplementation(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlinx.android.extensions.CacheImplementation access$getDEFAULT$cp() {
            kotlinx.android.extensions.CacheImplementation r0 = kotlinx.android.extensions.CacheImplementation.DEFAULT
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<kotlinx.android.extensions.CacheImplementation> getEntries() {
            kotlin.enums.a r0 = kotlinx.android.extensions.CacheImplementation.$ENTRIES
            return r0
    }

    public static kotlinx.android.extensions.CacheImplementation valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.android.extensions.CacheImplementation> r0 = kotlinx.android.extensions.CacheImplementation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.android.extensions.CacheImplementation r1 = (kotlinx.android.extensions.CacheImplementation) r1
            return r1
    }

    public static kotlinx.android.extensions.CacheImplementation[] values() {
            kotlinx.android.extensions.CacheImplementation[] r0 = kotlinx.android.extensions.CacheImplementation.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.android.extensions.CacheImplementation[] r0 = (kotlinx.android.extensions.CacheImplementation[]) r0
            return r0
    }
}
