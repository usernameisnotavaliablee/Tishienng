package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_OutputResults extends androidx.camera.video.OutputResults {
    private final android.net.Uri outputUri;

    AutoValue_OutputResults(android.net.Uri r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.outputUri = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null outputUri"
            r2.<init>(r0)
            throw r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.camera.video.OutputResults
            if (r0 == 0) goto L15
            androidx.camera.video.OutputResults r2 = (androidx.camera.video.OutputResults) r2
            android.net.Uri r0 = r1.outputUri
            android.net.Uri r2 = r2.getOutputUri()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // androidx.camera.video.OutputResults
    @androidx.annotation.NonNull
    public android.net.Uri getOutputUri() {
            r1 = this;
            android.net.Uri r0 = r1.outputUri
            return r0
    }

    public int hashCode() {
            r2 = this;
            android.net.Uri r0 = r2.outputUri
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OutputResults{outputUri="
            r0.append(r1)
            android.net.Uri r1 = r2.outputUri
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
