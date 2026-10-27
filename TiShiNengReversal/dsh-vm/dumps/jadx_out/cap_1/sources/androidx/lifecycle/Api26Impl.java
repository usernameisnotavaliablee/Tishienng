package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Api26Impl {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.Api26Impl INSTANCE = null;

    static {
            androidx.lifecycle.Api26Impl r0 = new androidx.lifecycle.Api26Impl
            r0.<init>()
            androidx.lifecycle.Api26Impl.INSTANCE = r0
            return
    }

    private Api26Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public final long toMillis(@org.jetbrains.annotations.NotNull java.time.Duration r3) {
            r2 = this;
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.g0.p(r3, r0)
            long r0 = r3.toMillis()
            return r0
    }
}
