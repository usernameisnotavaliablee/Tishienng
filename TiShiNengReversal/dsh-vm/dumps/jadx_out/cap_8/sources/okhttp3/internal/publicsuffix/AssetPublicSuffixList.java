package okhttp3.internal.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AssetPublicSuffixList extends okhttp3.internal.publicsuffix.BasePublicSuffixList {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.publicsuffix.AssetPublicSuffixList.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PUBLIC_SUFFIX_RESOURCE = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String path;

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

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPUBLIC_SUFFIX_RESOURCE() {
                r1 = this;
                java.lang.String r0 = okhttp3.internal.publicsuffix.AssetPublicSuffixList.access$getPUBLIC_SUFFIX_RESOURCE$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.publicsuffix.AssetPublicSuffixList$Companion r0 = new okhttp3.internal.publicsuffix.AssetPublicSuffixList$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.AssetPublicSuffixList.Companion = r0
            java.lang.String r0 = "PublicSuffixDatabase.list"
            okhttp3.internal.publicsuffix.AssetPublicSuffixList.PUBLIC_SUFFIX_RESOURCE = r0
            return
    }

    public AssetPublicSuffixList() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public AssetPublicSuffixList(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.path = r2
            return
    }

    public /* synthetic */ AssetPublicSuffixList(java.lang.String r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = okhttp3.internal.publicsuffix.AssetPublicSuffixList.PUBLIC_SUFFIX_RESOURCE
        L6:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ java.lang.String access$getPUBLIC_SUFFIX_RESOURCE$cp() {
            java.lang.String r0 = okhttp3.internal.publicsuffix.AssetPublicSuffixList.PUBLIC_SUFFIX_RESOURCE
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public /* bridge */ /* synthetic */ java.lang.Object getPath() {
            r1 = this;
            java.lang.String r0 = r1.getPath()
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @org.jetbrains.annotations.NotNull
    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @org.jetbrains.annotations.NotNull
    public okio.Source listSource() {
            r2 = this;
            okhttp3.internal.platform.PlatformRegistry r0 = okhttp3.internal.platform.PlatformRegistry.INSTANCE
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 == 0) goto L11
            android.content.res.AssetManager r0 = r0.getAssets()
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L28
            java.lang.String r0 = android.os.Build.FINGERPRINT
            if (r0 != 0) goto L20
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test"
            r0.<init>(r1)
            throw r0
        L20:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test."
            r0.<init>(r1)
            throw r0
        L28:
            java.lang.String r1 = r2.getPath()
            java.io.InputStream r0 = r0.open(r1)
            java.lang.String r1 = "open(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            okio.Source r0 = okio.Okio.source(r0)
            return r0
    }
}
