package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SystemTimeProvider implements androidx.camera.video.internal.encoder.TimeProvider {
    public SystemTimeProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long realtimeUs() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0.toMicros(r1)
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long uptimeUs() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r0 = r0.toMicros(r1)
            return r0
    }
}
