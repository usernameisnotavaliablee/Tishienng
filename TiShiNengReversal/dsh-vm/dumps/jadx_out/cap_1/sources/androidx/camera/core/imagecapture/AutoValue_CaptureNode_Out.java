package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_CaptureNode_Out extends androidx.camera.core.imagecapture.CaptureNode.Out {
    private final androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> imageEdge;
    private final int inputFormat;
    private final int outputFormat;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> requestEdge;

    AutoValue_CaptureNode_Out(androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> r1, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            r0.imageEdge = r1
            if (r2 == 0) goto L10
            r0.requestEdge = r2
            r0.inputFormat = r3
            r0.outputFormat = r4
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null requestEdge"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null imageEdge"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.imagecapture.CaptureNode.Out
            r2 = 0
            if (r1 == 0) goto L34
            androidx.camera.core.imagecapture.CaptureNode$Out r5 = (androidx.camera.core.imagecapture.CaptureNode.Out) r5
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> r1 = r4.imageEdge
            androidx.camera.core.processing.Edge r3 = r5.getImageEdge()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r1 = r4.requestEdge
            androidx.camera.core.processing.Edge r3 = r5.getRequestEdge()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            int r1 = r4.inputFormat
            int r3 = r5.getInputFormat()
            if (r1 != r3) goto L34
            int r1 = r4.outputFormat
            int r5 = r5.getOutputFormat()
            if (r1 != r5) goto L34
            return r0
        L34:
            return r2
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> getImageEdge() {
            r1 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> r0 = r1.imageEdge
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    int getInputFormat() {
            r1 = this;
            int r0 = r1.inputFormat
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    int getOutputFormat() {
            r1 = this;
            int r0 = r1.outputFormat
            return r0
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.Out
    androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getRequestEdge() {
            r1 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r0 = r1.requestEdge
            return r0
    }

    public int hashCode() {
            r3 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> r0 = r3.imageEdge
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r2 = r3.requestEdge
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.inputFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.outputFormat
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Out{imageEdge="
            r0.append(r1)
            androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> r1 = r2.imageEdge
            r0.append(r1)
            java.lang.String r1 = ", requestEdge="
            r0.append(r1)
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> r1 = r2.requestEdge
            r0.append(r1)
            java.lang.String r1 = ", inputFormat="
            r0.append(r1)
            int r1 = r2.inputFormat
            r0.append(r1)
            java.lang.String r1 = ", outputFormat="
            r0.append(r1)
            int r1 = r2.outputFormat
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
