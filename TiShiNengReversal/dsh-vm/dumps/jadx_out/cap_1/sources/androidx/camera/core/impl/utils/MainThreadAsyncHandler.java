package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MainThreadAsyncHandler {
    private static volatile android.os.Handler sHandler;

    private MainThreadAsyncHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.os.Handler getInstance() {
            android.os.Handler r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.sHandler
            if (r0 == 0) goto L7
            android.os.Handler r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.sHandler
            return r0
        L7:
            java.lang.Class<androidx.camera.core.impl.utils.MainThreadAsyncHandler> r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.class
            monitor-enter(r0)
            android.os.Handler r1 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.sHandler     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L19
            android.os.Handler r1 = androidx.core.os.HandlerCompat.createAsync(r1)     // Catch: java.lang.Throwable -> L19
            androidx.camera.core.impl.utils.MainThreadAsyncHandler.sHandler = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r1 = move-exception
            goto L1f
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            android.os.Handler r0 = androidx.camera.core.impl.utils.MainThreadAsyncHandler.sHandler
            return r0
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }
}
