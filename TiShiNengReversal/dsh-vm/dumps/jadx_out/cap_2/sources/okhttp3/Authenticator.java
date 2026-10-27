package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Authenticator {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Authenticator.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Authenticator JAVA_NET_AUTHENTICATOR = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Authenticator NONE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Authenticator.Companion $$INSTANCE = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class AuthenticatorNone implements okhttp3.Authenticator {
            public AuthenticatorNone() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Authenticator
            @org.jetbrains.annotations.Nullable
            public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable okhttp3.Route r1, @org.jetbrains.annotations.NotNull okhttp3.Response r2) {
                    r0 = this;
                    java.lang.String r1 = "response"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    r1 = 0
                    return r1
            }
        }

        static {
                okhttp3.Authenticator$Companion r0 = new okhttp3.Authenticator$Companion
                r0.<init>()
                okhttp3.Authenticator.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.Authenticator$Companion r0 = okhttp3.Authenticator.Companion.$$INSTANCE
            okhttp3.Authenticator.Companion = r0
            okhttp3.Authenticator$Companion$AuthenticatorNone r0 = new okhttp3.Authenticator$Companion$AuthenticatorNone
            r0.<init>()
            okhttp3.Authenticator.NONE = r0
            okhttp3.internal.authenticator.JavaNetAuthenticator r0 = new okhttp3.internal.authenticator.JavaNetAuthenticator
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            okhttp3.Authenticator.JAVA_NET_AUTHENTICATOR = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable okhttp3.Route r1, @org.jetbrains.annotations.NotNull okhttp3.Response r2) throws java.io.IOException;
}
