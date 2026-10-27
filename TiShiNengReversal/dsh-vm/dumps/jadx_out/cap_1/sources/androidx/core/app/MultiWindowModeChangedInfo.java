package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean isInMultiWindowMode;

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.Nullable
    private android.content.res.Configuration newConfiguration;

    public MultiWindowModeChangedInfo(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isInMultiWindowMode = r1
            return
    }

    @androidx.annotation.RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean r2, @org.jetbrains.annotations.NotNull android.content.res.Configuration r3) {
            r1 = this;
            java.lang.String r0 = "newConfig"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.newConfiguration = r3
            return
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public final android.content.res.Configuration getNewConfig() {
            r2 = this;
            android.content.res.Configuration r0 = r2.newConfiguration
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?"
            r0.<init>(r1)
            throw r0
    }

    public final boolean isInMultiWindowMode() {
            r1 = this;
            boolean r0 = r1.isInMultiWindowMode
            return r0
    }
}
