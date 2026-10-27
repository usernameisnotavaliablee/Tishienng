package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SurfaceOutput extends java.io.Closeable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface EventCode {
        }

        Event() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static androidx.camera.core.SurfaceOutput.Event of(int r1, @androidx.annotation.NonNull androidx.camera.core.SurfaceOutput r2) {
                androidx.camera.core.AutoValue_SurfaceOutput_Event r0 = new androidx.camera.core.AutoValue_SurfaceOutput_Event
                r0.<init>(r1, r2)
                return r0
        }

        public abstract int getEventCode();

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    int getFormat();

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    android.graphics.Matrix getSensorToBufferTransform();

    @androidx.annotation.NonNull
    android.util.Size getSize();

    @androidx.annotation.NonNull
    android.view.Surface getSurface(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> r2);

    int getTargets();

    void updateTransformMatrix(@androidx.annotation.NonNull float[] r1, @androidx.annotation.NonNull float[] r2);
}
