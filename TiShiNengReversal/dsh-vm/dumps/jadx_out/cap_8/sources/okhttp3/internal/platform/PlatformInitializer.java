package okhttp3.internal.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class PlatformInitializer implements androidx.startup.Initializer<okhttp3.internal.platform.Platform> {
    public PlatformInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object create(android.content.Context r1) {
            r0 = this;
            okhttp3.internal.platform.Platform r1 = r0.m68create(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: create, reason: collision with other method in class */
    public okhttp3.internal.platform.Platform m68create(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.platform.PlatformRegistry r0 = okhttp3.internal.platform.PlatformRegistry.INSTANCE
            r0.setApplicationContext(r2)
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r2 = r2.get()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Class<androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }
}
