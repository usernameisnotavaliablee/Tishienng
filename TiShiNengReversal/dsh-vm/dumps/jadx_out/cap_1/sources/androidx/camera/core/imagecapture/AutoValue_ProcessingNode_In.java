package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_ProcessingNode_In extends androidx.camera.core.imagecapture.ProcessingNode.In {
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> edge;
    private final int inputFormat;
    private final int outputFormat;

    AutoValue_ProcessingNode_In(androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lc
            r0.edge = r1
            r0.inputFormat = r2
            r0.outputFormat = r3
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null edge"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.imagecapture.ProcessingNode.In
            r2 = 0
            if (r1 == 0) goto L28
            androidx.camera.core.imagecapture.ProcessingNode$In r5 = (androidx.camera.core.imagecapture.ProcessingNode.In) r5
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode$InputPacket> r1 = r4.edge
            androidx.camera.core.processing.Edge r3 = r5.getEdge()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            int r1 = r4.inputFormat
            int r3 = r5.getInputFormat()
            if (r1 != r3) goto L28
            int r1 = r4.outputFormat
            int r5 = r5.getOutputFormat()
            if (r1 != r5) goto L28
            return r0
        L28:
            return r2
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getEdge() {
            r1 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode$InputPacket> r0 = r1.edge
            return r0
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    int getInputFormat() {
            r1 = this;
            int r0 = r1.inputFormat
            return r0
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    int getOutputFormat() {
            r1 = this;
            int r0 = r1.outputFormat
            return r0
    }

    public int hashCode() {
            r3 = this;
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode$InputPacket> r0 = r3.edge
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
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
            java.lang.String r1 = "In{edge="
            r0.append(r1)
            androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode$InputPacket> r1 = r2.edge
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
