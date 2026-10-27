package okhttp3.internal.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class PlatformRegistry {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.PlatformRegistry INSTANCE = null;

    static {
            okhttp3.internal.platform.PlatformRegistry r0 = new okhttp3.internal.platform.PlatformRegistry
            r0.<init>()
            okhttp3.internal.platform.PlatformRegistry.INSTANCE = r0
            return
    }

    private PlatformRegistry() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.platform.Platform findPlatform() {
            r4 = this;
            okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
            r0.enable()
            okhttp3.internal.platform.Android10Platform$Companion r0 = okhttp3.internal.platform.Android10Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
            if (r0 != 0) goto L13
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = okhttp3.internal.platform.AndroidPlatform.Companion
            okhttp3.internal.platform.Platform r0 = r0.buildIfSupported()
        L13:
            if (r0 == 0) goto L16
            return r0
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected Android API level 21+ but was "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public final android.content.Context getApplicationContext() {
            r3 = this;
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            boolean r1 = r0 instanceof okhttp3.internal.platform.ContextAwarePlatform
            r2 = 0
            if (r1 == 0) goto Le
            okhttp3.internal.platform.ContextAwarePlatform r0 = (okhttp3.internal.platform.ContextAwarePlatform) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L16
            android.content.Context r0 = r0.getApplicationContext()
            return r0
        L16:
            return r2
    }

    public final boolean isAndroid() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void setApplicationContext(@org.jetbrains.annotations.Nullable android.content.Context r3) {
            r2 = this;
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            boolean r1 = r0 instanceof okhttp3.internal.platform.ContextAwarePlatform
            if (r1 == 0) goto Ld
            okhttp3.internal.platform.ContextAwarePlatform r0 = (okhttp3.internal.platform.ContextAwarePlatform) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L13
            r0.setApplicationContext(r3)
        L13:
            return
    }
}
