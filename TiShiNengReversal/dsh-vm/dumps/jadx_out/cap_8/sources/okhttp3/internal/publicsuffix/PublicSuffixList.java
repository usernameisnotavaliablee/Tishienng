package okhttp3.internal.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface PublicSuffixList {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.publicsuffix.PublicSuffixList.Companion Companion = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.publicsuffix.PublicSuffixList.Companion $$INSTANCE = null;

        static {
                okhttp3.internal.publicsuffix.PublicSuffixList$Companion r0 = new okhttp3.internal.publicsuffix.PublicSuffixList$Companion
                r0.<init>()
                okhttp3.internal.publicsuffix.PublicSuffixList.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixList$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixList.Companion.$$INSTANCE
            okhttp3.internal.publicsuffix.PublicSuffixList.Companion = r0
            return
    }

    void ensureLoaded();

    @org.jetbrains.annotations.NotNull
    okio.ByteString getBytes();

    @org.jetbrains.annotations.NotNull
    okio.ByteString getExceptionBytes();
}
