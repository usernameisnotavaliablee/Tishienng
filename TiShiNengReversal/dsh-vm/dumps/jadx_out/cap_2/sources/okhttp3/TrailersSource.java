package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface TrailersSource {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.TrailersSource.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.TrailersSource EMPTY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.TrailersSource.Companion $$INSTANCE = null;

        static {
                okhttp3.TrailersSource$Companion r0 = new okhttp3.TrailersSource$Companion
                r0.<init>()
                okhttp3.TrailersSource.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class DefaultImpls {
        public DefaultImpls() {
                r1 = this;
                r1.<init>()
                return
        }

        @java.lang.Deprecated
        @org.jetbrains.annotations.Nullable
        public static okhttp3.Headers peek(@org.jetbrains.annotations.NotNull okhttp3.TrailersSource r0) throws java.io.IOException {
                okhttp3.Headers r0 = okhttp3.g.b(r0)
                return r0
        }
    }

    static {
            okhttp3.TrailersSource$Companion r0 = okhttp3.TrailersSource.Companion.$$INSTANCE
            okhttp3.TrailersSource.Companion = r0
            okhttp3.TrailersSource$Companion$EMPTY$1 r0 = new okhttp3.TrailersSource$Companion$EMPTY$1
            r0.<init>()
            okhttp3.TrailersSource.EMPTY = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    okhttp3.Headers get() throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    okhttp3.Headers peek() throws java.io.IOException;
}
