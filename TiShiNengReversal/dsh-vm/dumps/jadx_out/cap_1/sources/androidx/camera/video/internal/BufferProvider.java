package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface BufferProvider<T> extends androidx.camera.core.impl.Observable<androidx.camera.video.internal.BufferProvider.State> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum State extends java.lang.Enum<androidx.camera.video.internal.BufferProvider.State> {
        private static final /* synthetic */ androidx.camera.video.internal.BufferProvider.State[] $VALUES = null;
        public static final androidx.camera.video.internal.BufferProvider.State ACTIVE = null;
        public static final androidx.camera.video.internal.BufferProvider.State INACTIVE = null;

        private static /* synthetic */ androidx.camera.video.internal.BufferProvider.State[] $values() {
                r0 = 2
                androidx.camera.video.internal.BufferProvider$State[] r0 = new androidx.camera.video.internal.BufferProvider.State[r0]
                androidx.camera.video.internal.BufferProvider$State r1 = androidx.camera.video.internal.BufferProvider.State.ACTIVE
                r2 = 0
                r0[r2] = r1
                androidx.camera.video.internal.BufferProvider$State r1 = androidx.camera.video.internal.BufferProvider.State.INACTIVE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.video.internal.BufferProvider$State r0 = new androidx.camera.video.internal.BufferProvider$State
                java.lang.String r1 = "ACTIVE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.video.internal.BufferProvider.State.ACTIVE = r0
                androidx.camera.video.internal.BufferProvider$State r0 = new androidx.camera.video.internal.BufferProvider$State
                java.lang.String r1 = "INACTIVE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.video.internal.BufferProvider.State.INACTIVE = r0
                androidx.camera.video.internal.BufferProvider$State[] r0 = $values()
                androidx.camera.video.internal.BufferProvider.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.video.internal.BufferProvider.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.video.internal.BufferProvider$State> r0 = androidx.camera.video.internal.BufferProvider.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.video.internal.BufferProvider$State r1 = (androidx.camera.video.internal.BufferProvider.State) r1
                return r1
        }

        public static androidx.camera.video.internal.BufferProvider.State[] values() {
                androidx.camera.video.internal.BufferProvider$State[] r0 = androidx.camera.video.internal.BufferProvider.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.video.internal.BufferProvider$State[] r0 = (androidx.camera.video.internal.BufferProvider.State[]) r0
                return r0
        }
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<T> acquireBuffer();
}
