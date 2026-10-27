package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot {
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer;
    private final int jpegQuality;
    private final int rotationDegrees;

    AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int r1, int r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r3) {
            r0 = this;
            r0.<init>()
            r0.jpegQuality = r1
            r0.rotationDegrees = r2
            if (r3 == 0) goto Lc
            r0.completer = r3
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null completer"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
            r2 = 0
            if (r1 == 0) goto L28
            androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot r5 = (androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot) r5
            int r1 = r4.jpegQuality
            int r3 = r5.getJpegQuality()
            if (r1 != r3) goto L28
            int r1 = r4.rotationDegrees
            int r3 = r5.getRotationDegrees()
            if (r1 != r3) goto L28
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r4.completer
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r5 = r5.getCompleter()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L28
            return r0
        L28:
            return r2
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @androidx.annotation.NonNull
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getCompleter() {
            r1 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r1.completer
            return r0
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @androidx.annotation.IntRange(from = 0, to = 100)
    int getJpegQuality() {
            r1 = this;
            int r0 = r1.jpegQuality
            return r0
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @androidx.annotation.IntRange(from = 0, to = 359)
    int getRotationDegrees() {
            r1 = this;
            int r0 = r1.rotationDegrees
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.jpegQuality
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.rotationDegrees
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r3.completer
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PendingSnapshot{jpegQuality="
            r0.append(r1)
            int r1 = r2.jpegQuality
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r2.rotationDegrees
            r0.append(r1)
            java.lang.String r1 = ", completer="
            r0.append(r1)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r2.completer
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
