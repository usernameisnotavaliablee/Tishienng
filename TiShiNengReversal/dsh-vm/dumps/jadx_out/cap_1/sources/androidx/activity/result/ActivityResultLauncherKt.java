package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityResultLauncherKt {
    public static final void launch(@org.jetbrains.annotations.NotNull androidx.activity.result.ActivityResultLauncher<java.lang.Void> r1, @org.jetbrains.annotations.Nullable androidx.core.app.ActivityOptionsCompat r2) {
            r0 = 0
            r1.launch(r0, r2)
            return
    }

    public static /* synthetic */ void launch$default(androidx.activity.result.ActivityResultLauncher r0, androidx.core.app.ActivityOptionsCompat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            launch(r0, r1)
            return
    }

    @kotlin.jvm.JvmName(name = "launchUnit")
    public static final void launchUnit(@org.jetbrains.annotations.NotNull androidx.activity.result.ActivityResultLauncher<kotlin.n1> r1, @org.jetbrains.annotations.Nullable androidx.core.app.ActivityOptionsCompat r2) {
            kotlin.n1 r0 = kotlin.n1.a
            r1.launch(r0, r2)
            return
    }

    public static /* synthetic */ void launchUnit$default(androidx.activity.result.ActivityResultLauncher r0, androidx.core.app.ActivityOptionsCompat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            launchUnit(r0, r1)
            return
    }
}
