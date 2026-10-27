package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface CookieJar {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CookieJar.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CookieJar NO_COOKIES = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.CookieJar.Companion $$INSTANCE = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class NoCookies implements okhttp3.CookieJar {
            public NoCookies() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.CookieJar
            @org.jetbrains.annotations.NotNull
            public java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2) {
                    r1 = this;
                    java.lang.String r0 = "url"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.util.List r2 = kotlin.collections.f0.J()
                    return r2
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Cookie> r3) {
                    r1 = this;
                    java.lang.String r0 = "url"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r2 = "cookies"
                    kotlin.jvm.internal.g0.p(r3, r2)
                    return
            }
        }

        static {
                okhttp3.CookieJar$Companion r0 = new okhttp3.CookieJar$Companion
                r0.<init>()
                okhttp3.CookieJar.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.CookieJar$Companion r0 = okhttp3.CookieJar.Companion.$$INSTANCE
            okhttp3.CookieJar.Companion = r0
            okhttp3.CookieJar$Companion$NoCookies r0 = new okhttp3.CookieJar$Companion$NoCookies
            r0.<init>()
            okhttp3.CookieJar.NO_COOKIES = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1);

    void saveFromResponse(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Cookie> r2);
}
