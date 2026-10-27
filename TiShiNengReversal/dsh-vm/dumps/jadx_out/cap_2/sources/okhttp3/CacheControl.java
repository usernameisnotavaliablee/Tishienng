package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CacheControl {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl FORCE_CACHE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl FORCE_NETWORK = null;

    @org.jetbrains.annotations.Nullable
    private java.lang.String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds;
        private int maxStaleSeconds;
        private int minFreshSeconds;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.maxAgeSeconds = r0
                r1.maxStaleSeconds = r0
                r1.minFreshSeconds = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl build() {
                r1 = this;
                okhttp3.CacheControl r0 = okhttp3.internal._CacheControlCommonKt.commonBuild(r1)
                return r0
        }

        public final boolean getImmutable$okhttp() {
                r1 = this;
                boolean r0 = r1.immutable
                return r0
        }

        public final int getMaxAgeSeconds$okhttp() {
                r1 = this;
                int r0 = r1.maxAgeSeconds
                return r0
        }

        public final int getMaxStaleSeconds$okhttp() {
                r1 = this;
                int r0 = r1.maxStaleSeconds
                return r0
        }

        public final int getMinFreshSeconds$okhttp() {
                r1 = this;
                int r0 = r1.minFreshSeconds
                return r0
        }

        public final boolean getNoCache$okhttp() {
                r1 = this;
                boolean r0 = r1.noCache
                return r0
        }

        public final boolean getNoStore$okhttp() {
                r1 = this;
                boolean r0 = r1.noStore
                return r0
        }

        public final boolean getNoTransform$okhttp() {
                r1 = this;
                boolean r0 = r1.noTransform
                return r0
        }

        public final boolean getOnlyIfCached$okhttp() {
                r1 = this;
                boolean r0 = r1.onlyIfCached
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder immutable() {
                r1 = this;
                okhttp3.CacheControl$Builder r0 = okhttp3.internal._CacheControlCommonKt.commonImmutable(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder maxAge(int r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.g0.p(r4, r0)
                if (r3 < 0) goto L13
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = okhttp3.internal._CacheControlCommonKt.commonClampToInt(r3)
                r2.maxAgeSeconds = r3
                return r2
            L13:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "maxAge < 0: "
                r4.append(r0)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: maxAge-LRDsOJo, reason: not valid java name */
        public final okhttp3.CacheControl.Builder m62maxAgeLRDsOJo(long r4) {
                r3 = this;
                long r4 = kotlin.time.h.C(r4)
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                int r4 = okhttp3.internal._CacheControlCommonKt.commonClampToInt(r4)
                r3.maxAgeSeconds = r4
                return r3
            L11:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "maxAge < 0: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder maxStale(int r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.g0.p(r4, r0)
                if (r3 < 0) goto L13
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = okhttp3.internal._CacheControlCommonKt.commonClampToInt(r3)
                r2.maxStaleSeconds = r3
                return r2
            L13:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "maxStale < 0: "
                r4.append(r0)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: maxStale-LRDsOJo, reason: not valid java name */
        public final okhttp3.CacheControl.Builder m63maxStaleLRDsOJo(long r4) {
                r3 = this;
                long r4 = kotlin.time.h.C(r4)
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                int r4 = okhttp3.internal._CacheControlCommonKt.commonClampToInt(r4)
                r3.maxStaleSeconds = r4
                return r3
            L11:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "maxStale < 0: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder minFresh(int r3, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.g0.p(r4, r0)
                if (r3 < 0) goto L13
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = okhttp3.internal._CacheControlCommonKt.commonClampToInt(r3)
                r2.minFreshSeconds = r3
                return r2
            L13:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "minFresh < 0: "
                r4.append(r0)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: minFresh-LRDsOJo, reason: not valid java name */
        public final okhttp3.CacheControl.Builder m64minFreshLRDsOJo(long r4) {
                r3 = this;
                long r4 = kotlin.time.h.C(r4)
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                int r4 = okhttp3.internal._CacheControlCommonKt.commonClampToInt(r4)
                r3.minFreshSeconds = r4
                return r3
            L11:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "minFresh < 0: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder noCache() {
                r1 = this;
                okhttp3.CacheControl$Builder r0 = okhttp3.internal._CacheControlCommonKt.commonNoCache(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder noStore() {
                r1 = this;
                okhttp3.CacheControl$Builder r0 = okhttp3.internal._CacheControlCommonKt.commonNoStore(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder noTransform() {
                r1 = this;
                okhttp3.CacheControl$Builder r0 = okhttp3.internal._CacheControlCommonKt.commonNoTransform(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl.Builder onlyIfCached() {
                r1 = this;
                okhttp3.CacheControl$Builder r0 = okhttp3.internal._CacheControlCommonKt.commonOnlyIfCached(r1)
                return r0
        }

        public final void setImmutable$okhttp(boolean r1) {
                r0 = this;
                r0.immutable = r1
                return
        }

        public final void setMaxAgeSeconds$okhttp(int r1) {
                r0 = this;
                r0.maxAgeSeconds = r1
                return
        }

        public final void setMaxStaleSeconds$okhttp(int r1) {
                r0 = this;
                r0.maxStaleSeconds = r1
                return
        }

        public final void setMinFreshSeconds$okhttp(int r1) {
                r0 = this;
                r0.minFreshSeconds = r1
                return
        }

        public final void setNoCache$okhttp(boolean r1) {
                r0 = this;
                r0.noCache = r1
                return
        }

        public final void setNoStore$okhttp(boolean r1) {
                r0 = this;
                r0.noStore = r1
                return
        }

        public final void setNoTransform$okhttp(boolean r1) {
                r0 = this;
                r0.noTransform = r1
                return
        }

        public final void setOnlyIfCached$okhttp(boolean r1) {
                r0 = this;
                r0.onlyIfCached = r1
                return
        }
    }

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.CacheControl parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.CacheControl r2 = okhttp3.internal._CacheControlCommonKt.commonParse(r1, r2)
                return r2
        }
    }

    static {
            okhttp3.CacheControl$Companion r0 = new okhttp3.CacheControl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CacheControl.Companion = r0
            okhttp3.CacheControl r1 = okhttp3.internal._CacheControlCommonKt.commonForceNetwork(r0)
            okhttp3.CacheControl.FORCE_NETWORK = r1
            okhttp3.CacheControl r0 = okhttp3.internal._CacheControlCommonKt.commonForceCache(r0)
            okhttp3.CacheControl.FORCE_CACHE = r0
            return
    }

    public CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.noCache = r1
            r0.noStore = r2
            r0.maxAgeSeconds = r3
            r0.sMaxAgeSeconds = r4
            r0.isPrivate = r5
            r0.isPublic = r6
            r0.mustRevalidate = r7
            r0.maxStaleSeconds = r8
            r0.minFreshSeconds = r9
            r0.onlyIfCached = r10
            r0.noTransform = r11
            r0.immutable = r12
            r0.headerValue = r13
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CacheControl parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r1) {
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.CacheControl r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "immutable", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_immutable")
    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m52deprecated_immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_maxAgeSeconds")
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m53deprecated_maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_maxStaleSeconds")
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m54deprecated_maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_minFreshSeconds")
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m55deprecated_minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "mustRevalidate", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_mustRevalidate")
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m56deprecated_mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noCache", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_noCache")
    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m57deprecated_noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noStore", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_noStore")
    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m58deprecated_noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noTransform", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_noTransform")
    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m59deprecated_noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "onlyIfCached", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_onlyIfCached")
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m60deprecated_onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sMaxAgeSeconds")
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m61deprecated_sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeaderValue$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.headerValue
            return r0
    }

    @kotlin.jvm.JvmName(name = "immutable")
    public final boolean immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    public final boolean isPrivate() {
            r1 = this;
            boolean r0 = r1.isPrivate
            return r0
    }

    public final boolean isPublic() {
            r1 = this;
            boolean r0 = r1.isPublic
            return r0
    }

    @kotlin.jvm.JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @kotlin.jvm.JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @kotlin.jvm.JvmName(name = "noCache")
    public final boolean noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @kotlin.jvm.JvmName(name = "noStore")
    public final boolean noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @kotlin.jvm.JvmName(name = "noTransform")
    public final boolean noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @kotlin.jvm.JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @kotlin.jvm.JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    public final void setHeaderValue$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.headerValue = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = okhttp3.internal._CacheControlCommonKt.commonToString(r1)
            return r0
    }
}
