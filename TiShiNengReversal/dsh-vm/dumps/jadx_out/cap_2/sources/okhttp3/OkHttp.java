package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class OkHttp {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.OkHttp INSTANCE = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERSION = null;

    static {
            okhttp3.OkHttp r0 = new okhttp3.OkHttp
            r0.<init>()
            okhttp3.OkHttp.INSTANCE = r0
            java.lang.String r0 = "5.3.0"
            okhttp3.OkHttp.VERSION = r0
            return
    }

    private OkHttp() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void initialize(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.platform.PlatformRegistry r0 = okhttp3.internal.platform.PlatformRegistry.INSTANCE
            android.content.Context r1 = r0.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            if (r1 != 0) goto L1c
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r0.setApplicationContext(r3)
        L1c:
            return
    }
}
