package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RotationProvider {

    @androidx.annotation.VisibleForTesting
    boolean mIgnoreCanDetectForTest;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mLock")
    final java.util.Map<androidx.camera.view.RotationProvider.Listener, androidx.camera.view.RotationProvider.ListenerWrapper> mListeners;
    final java.lang.Object mLock;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mLock")
    @androidx.annotation.VisibleForTesting
    final android.view.OrientationEventListener mOrientationListener;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Listener {
        void onRotationChanged(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ListenerWrapper {
        private final java.util.concurrent.atomic.AtomicBoolean mEnabled;
        private final java.util.concurrent.Executor mExecutor;
        private final androidx.camera.view.RotationProvider.Listener mListener;

        ListenerWrapper(androidx.camera.view.RotationProvider.Listener r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                r0.mExecutor = r2
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 1
                r1.<init>(r2)
                r0.mEnabled = r1
                return
        }

        public static /* synthetic */ void a(androidx.camera.view.RotationProvider.ListenerWrapper r1, int r2) {
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.mEnabled
                boolean r0 = r0.get()
                if (r0 == 0) goto Ld
                androidx.camera.view.RotationProvider$Listener r1 = r1.mListener
                r1.onRotationChanged(r2)
            Ld:
                return
        }

        void disable() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mEnabled
                r1 = 0
                r0.set(r1)
                return
        }

        void onRotationChanged(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.view.u r1 = new androidx.camera.view.u
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }
    }

    public RotationProvider(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mListeners = r0
            r0 = 0
            r1.mIgnoreCanDetectForTest = r0
            androidx.camera.view.RotationProvider$1 r0 = new androidx.camera.view.RotationProvider$1
            r0.<init>(r1, r2)
            r1.mOrientationListener = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    static int orientationToSurfaceRotation(int r1) {
            r0 = 315(0x13b, float:4.41E-43)
            if (r1 >= r0) goto L17
            r0 = 45
            if (r1 >= r0) goto L9
            goto L17
        L9:
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 < r0) goto Lf
            r1 = 1
            return r1
        Lf:
            r0 = 135(0x87, float:1.89E-43)
            if (r1 < r0) goto L15
            r1 = 2
            return r1
        L15:
            r1 = 3
            return r1
        L17:
            r1 = 0
            return r1
    }

    @androidx.annotation.CheckResult
    public boolean addListener(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.view.RotationProvider.Listener r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.view.OrientationEventListener r1 = r3.mOrientationListener     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.canDetectOrientation()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            boolean r1 = r3.mIgnoreCanDetectForTest     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            r4 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r4
        L12:
            r4 = move-exception
            goto L26
        L14:
            java.util.Map<androidx.camera.view.RotationProvider$Listener, androidx.camera.view.RotationProvider$ListenerWrapper> r1 = r3.mListeners     // Catch: java.lang.Throwable -> L12
            androidx.camera.view.RotationProvider$ListenerWrapper r2 = new androidx.camera.view.RotationProvider$ListenerWrapper     // Catch: java.lang.Throwable -> L12
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L12
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L12
            android.view.OrientationEventListener r4 = r3.mOrientationListener     // Catch: java.lang.Throwable -> L12
            r4.enable()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r4 = 1
            return r4
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    public void removeListener(@androidx.annotation.NonNull androidx.camera.view.RotationProvider.Listener r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.view.RotationProvider$Listener, androidx.camera.view.RotationProvider$ListenerWrapper> r1 = r2.mListeners     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L16
            androidx.camera.view.RotationProvider$ListenerWrapper r1 = (androidx.camera.view.RotationProvider.ListenerWrapper) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            r1.disable()     // Catch: java.lang.Throwable -> L16
            java.util.Map<androidx.camera.view.RotationProvider$Listener, androidx.camera.view.RotationProvider$ListenerWrapper> r1 = r2.mListeners     // Catch: java.lang.Throwable -> L16
            r1.remove(r3)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L27
        L18:
            java.util.Map<androidx.camera.view.RotationProvider$Listener, androidx.camera.view.RotationProvider$ListenerWrapper> r3 = r2.mListeners     // Catch: java.lang.Throwable -> L16
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L25
            android.view.OrientationEventListener r3 = r2.mOrientationListener     // Catch: java.lang.Throwable -> L16
            r3.disable()     // Catch: java.lang.Throwable -> L16
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
