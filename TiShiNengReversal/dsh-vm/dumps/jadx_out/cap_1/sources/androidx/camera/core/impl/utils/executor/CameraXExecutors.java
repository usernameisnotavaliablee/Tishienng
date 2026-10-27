package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraXExecutors {
    private CameraXExecutors() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor audioExecutor() {
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.AudioExecutor.getInstance()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor directExecutor() {
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.DirectExecutor.getInstance()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor highPriorityExecutor() {
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.HighPriorityExecutor.getInstance()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor ioExecutor() {
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.IoExecutor.getInstance()
            return r0
    }

    public static boolean isSequentialExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r0) {
            boolean r0 = r0 instanceof androidx.camera.core.impl.utils.executor.SequentialExecutor
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.ScheduledExecutorService mainThreadExecutor() {
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.MainThreadExecutor.getInstance()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.ScheduledExecutorService myLooperExecutor() {
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.currentThreadExecutor()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.ScheduledExecutorService newHandlerExecutor(@androidx.annotation.NonNull android.os.Handler r1) {
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService r0 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor newSequentialExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
            androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = new androidx.camera.core.impl.utils.executor.SequentialExecutor
            r0.<init>(r1)
            return r0
    }
}
