package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_CaptureNode_In extends androidx.camera.core.imagecapture.CaptureNode.In {
    private final androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> errorEdge;
    private final androidx.camera.core.ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final int outputFormat;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> requestEdge;
    private final android.util.Size size;
    private final boolean virtualCamera;

    AutoValue_CaptureNode_In(android.util.Size r1, int r2, int r3, boolean r4, @androidx.annotation.Nullable androidx.camera.core.ImageReaderProxyProvider r5, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r6, androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> r7) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L28
            r0.size = r1
            r0.inputFormat = r2
            r0.outputFormat = r3
            r0.virtualCamera = r4
            r0.imageReaderProxyProvider = r5
            if (r6 == 0) goto L20
            r0.requestEdge = r6
            if (r7 == 0) goto L18
            r0.errorEdge = r7
            return
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null errorEdge"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null requestEdge"
            r1.<init>(r2)
            throw r1
        L28:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null size"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.imagecapture.CaptureNode.In
            r2 = 0
            if (r1 == 0) goto L5d
            androidx.camera.core.imagecapture.CaptureNode$In r5 = (androidx.camera.core.imagecapture.CaptureNode.In) r5
            android.util.Size r1 = r4.size
            android.util.Size r3 = r5.getSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5d
            int r1 = r4.inputFormat
            int r3 = r5.getInputFormat()
            if (r1 != r3) goto L5d
            int r1 = r4.outputFormat
            int r3 = r5.getOutputFormat()
            if (r1 != r3) goto L5d
            boolean r1 = r4.virtualCamera
            boolean r3 = r5.isVirtualCamera()
            if (r1 != r3) goto L5d
            androidx.camera.core.ImageReaderProxyProvider r1 = r4.imageReaderProxyProvider
            if (r1 != 0) goto L3a
            androidx.camera.core.ImageReaderProxyProvider r1 = r5.getImageReaderProxyProvider()
            if (r1 != 0) goto L5d
            goto L44
        L3a:
            androidx.camera.core.ImageReaderProxyProvider r3 = r5.getImageReaderProxyProvider()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5d
        L44:
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r1 = r4.requestEdge
            androidx.camera.core.processing.Edge r3 = r5.getRequestEdge()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5d
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> r1 = r4.errorEdge
            androidx.camera.core.processing.Edge r5 = r5.getErrorEdge()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L5d
            return r0
        L5d:
            return r2
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @androidx.annotation.NonNull
    androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> getErrorEdge() {
            r1 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> r0 = r1.errorEdge
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @androidx.annotation.Nullable
    androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider() {
            r1 = this;
            androidx.camera.core.ImageReaderProxyProvider r0 = r1.imageReaderProxyProvider
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    int getInputFormat() {
            r1 = this;
            int r0 = r1.inputFormat
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    int getOutputFormat() {
            r1 = this;
            int r0 = r1.outputFormat
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    @androidx.annotation.NonNull
    androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getRequestEdge() {
            r1 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r0 = r1.requestEdge
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    android.util.Size getSize() {
            r1 = this;
            android.util.Size r0 = r1.size
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.size
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.inputFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.outputFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r3.virtualCamera
            if (r2 == 0) goto L1d
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L1f
        L1d:
            r2 = 1237(0x4d5, float:1.733E-42)
        L1f:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.ImageReaderProxyProvider r2 = r3.imageReaderProxyProvider
            if (r2 != 0) goto L28
            r2 = 0
            goto L2c
        L28:
            int r2 = r2.hashCode()
        L2c:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r2 = r3.requestEdge
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> r1 = r3.errorEdge
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    boolean isVirtualCamera() {
            r1 = this;
            boolean r0 = r1.virtualCamera
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "In{size="
            r0.append(r1)
            android.util.Size r1 = r2.size
            r0.append(r1)
            java.lang.String r1 = ", inputFormat="
            r0.append(r1)
            int r1 = r2.inputFormat
            r0.append(r1)
            java.lang.String r1 = ", outputFormat="
            r0.append(r1)
            int r1 = r2.outputFormat
            r0.append(r1)
            java.lang.String r1 = ", virtualCamera="
            r0.append(r1)
            boolean r1 = r2.virtualCamera
            r0.append(r1)
            java.lang.String r1 = ", imageReaderProxyProvider="
            r0.append(r1)
            androidx.camera.core.ImageReaderProxyProvider r1 = r2.imageReaderProxyProvider
            r0.append(r1)
            java.lang.String r1 = ", requestEdge="
            r0.append(r1)
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r1 = r2.requestEdge
            r0.append(r1)
            java.lang.String r1 = ", errorEdge="
            r0.append(r1)
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> r1 = r2.errorEdge
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
