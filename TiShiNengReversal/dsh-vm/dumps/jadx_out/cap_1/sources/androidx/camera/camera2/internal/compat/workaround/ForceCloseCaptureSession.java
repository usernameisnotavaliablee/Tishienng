package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ForceCloseCaptureSession {

    @androidx.annotation.Nullable
    private final androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk mCaptureSessionOnClosedNotCalledQuirk;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.FunctionalInterface
    public interface OnConfigured {
        void run(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1);
    }

    public ForceCloseCaptureSession(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class
            androidx.camera.core.impl.Quirk r2 = r2.get(r0)
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk r2 = (androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk) r2
            r1.mCaptureSessionOnClosedNotCalledQuirk = r2
            return
    }

    private void forceOnClosed(@androidx.annotation.NonNull java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r0 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r0
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = r0.getStateCallback()
            r1.onClosed(r0)
            goto L4
        L18:
            return
    }

    private void forceOnConfigureFailed(@androidx.annotation.NonNull java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r0 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r0
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = r0.getStateCallback()
            r1.onConfigureFailed(r0)
            goto L4
        L18:
            return
    }

    public void onSessionConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> r4, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> r5, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured r6) {
            r2 = this;
            boolean r0 = r2.shouldForceClose()
            if (r0 == 0) goto L25
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r1
            if (r1 != r3) goto L1e
            goto L22
        L1e:
            r0.add(r1)
            goto Lf
        L22:
            r2.forceOnConfigureFailed(r0)
        L25:
            r6.run(r3)
            boolean r4 = r2.shouldForceClose()
            if (r4 == 0) goto L4d
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession r6 = (androidx.camera.camera2.internal.SynchronizedCaptureSession) r6
            if (r6 != r3) goto L46
            goto L4a
        L46:
            r4.add(r6)
            goto L37
        L4a:
            r2.forceOnClosed(r4)
        L4d:
            return
    }

    public boolean shouldForceClose() {
            r1 = this;
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk r0 = r1.mCaptureSessionOnClosedNotCalledQuirk
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
