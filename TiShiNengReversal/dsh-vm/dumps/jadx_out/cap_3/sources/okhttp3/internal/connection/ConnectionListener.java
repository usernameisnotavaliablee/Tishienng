package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class ConnectionListener {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.ConnectionListener.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.connection.ConnectionListener NONE = null;

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
        public final okhttp3.internal.connection.ConnectionListener getNONE() {
                r1 = this;
                okhttp3.internal.connection.ConnectionListener r0 = okhttp3.internal.connection.ConnectionListener.access$getNONE$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.connection.ConnectionListener$Companion r0 = new okhttp3.internal.connection.ConnectionListener$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.ConnectionListener.Companion = r0
            okhttp3.internal.connection.ConnectionListener$Companion$NONE$1 r0 = new okhttp3.internal.connection.ConnectionListener$Companion$NONE$1
            r0.<init>()
            okhttp3.internal.connection.ConnectionListener.NONE = r0
            return
    }

    public ConnectionListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.internal.connection.ConnectionListener access$getNONE$cp() {
            okhttp3.internal.connection.ConnectionListener r0 = okhttp3.internal.connection.ConnectionListener.NONE
            return r0
    }

    public void connectEnd(@org.jetbrains.annotations.NotNull okhttp3.Connection r2, @org.jetbrains.annotations.NotNull okhttp3.Route r3, @org.jetbrains.annotations.NotNull okhttp3.Call r4) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "route"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    public void connectFailed(@org.jetbrains.annotations.NotNull okhttp3.Route r2, @org.jetbrains.annotations.NotNull okhttp3.Call r3, @org.jetbrains.annotations.NotNull java.io.IOException r4) {
            r1 = this;
            java.lang.String r0 = "route"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "failure"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    public void connectStart(@org.jetbrains.annotations.NotNull okhttp3.Route r2, @org.jetbrains.annotations.NotNull okhttp3.Call r3) {
            r1 = this;
            java.lang.String r0 = "route"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void connectionAcquired(@org.jetbrains.annotations.NotNull okhttp3.Connection r2, @org.jetbrains.annotations.NotNull okhttp3.Call r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void connectionClosed(@org.jetbrains.annotations.NotNull okhttp3.Connection r2) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    public void connectionReleased(@org.jetbrains.annotations.NotNull okhttp3.Connection r2, @org.jetbrains.annotations.NotNull okhttp3.Call r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "call"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void noNewExchanges(@org.jetbrains.annotations.NotNull okhttp3.Connection r2) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }
}
