package okhttp3.internal.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ResourcePublicSuffixList extends okhttp3.internal.publicsuffix.BasePublicSuffixList {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.publicsuffix.ResourcePublicSuffixList.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.Path PUBLIC_SUFFIX_RESOURCE = null;

    @org.jetbrains.annotations.NotNull
    private final okio.FileSystem fileSystem;

    @org.jetbrains.annotations.NotNull
    private final okio.Path path;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.publicsuffix.ResourcePublicSuffixList$Companion r0 = new okhttp3.internal.publicsuffix.ResourcePublicSuffixList$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.ResourcePublicSuffixList.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "okhttp3/internal/publicsuffix/"
            r2.append(r3)
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = ".list"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            okhttp3.internal.publicsuffix.ResourcePublicSuffixList.PUBLIC_SUFFIX_RESOURCE = r0
            return
    }

    public ResourcePublicSuffixList() {
            r2 = this;
            r0 = 0
            r1 = 3
            r2.<init>(r0, r0, r1, r0)
            return
    }

    public ResourcePublicSuffixList(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.FileSystem r3) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.path = r2
            r1.fileSystem = r3
            return
    }

    public /* synthetic */ ResourcePublicSuffixList(okio.Path r1, okio.FileSystem r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            okio.Path r1 = okhttp3.internal.publicsuffix.ResourcePublicSuffixList.PUBLIC_SUFFIX_RESOURCE
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            okio.FileSystem r2 = okio.FileSystem.RESOURCES
        Lc:
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.FileSystem getFileSystem() {
            r1 = this;
            okio.FileSystem r0 = r1.fileSystem
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public /* bridge */ /* synthetic */ java.lang.Object getPath() {
            r1 = this;
            okio.Path r0 = r1.getPath()
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @org.jetbrains.annotations.NotNull
    public okio.Path getPath() {
            r1 = this;
            okio.Path r0 = r1.path
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @org.jetbrains.annotations.NotNull
    public okio.Source listSource() {
            r2 = this;
            okio.FileSystem r0 = r2.fileSystem
            okio.Path r1 = r2.getPath()
            okio.Source r0 = r0.source(r1)
            return r0
    }
}
