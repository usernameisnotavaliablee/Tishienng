package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_StreamInfo extends androidx.camera.video.StreamInfo {
    private final int id;
    private final androidx.camera.core.SurfaceRequest.TransformationInfo inProgressTransformationInfo;
    private final androidx.camera.video.StreamInfo.StreamState streamState;

    AutoValue_StreamInfo(int r1, androidx.camera.video.StreamInfo.StreamState r2, @androidx.annotation.Nullable androidx.camera.core.SurfaceRequest.TransformationInfo r3) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            if (r2 == 0) goto Lc
            r0.streamState = r2
            r0.inProgressTransformationInfo = r3
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null streamState"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.StreamInfo
            r2 = 0
            if (r1 == 0) goto L35
            androidx.camera.video.StreamInfo r5 = (androidx.camera.video.StreamInfo) r5
            int r1 = r4.id
            int r3 = r5.getId()
            if (r1 != r3) goto L35
            androidx.camera.video.StreamInfo$StreamState r1 = r4.streamState
            androidx.camera.video.StreamInfo$StreamState r3 = r5.getStreamState()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            androidx.camera.core.SurfaceRequest$TransformationInfo r1 = r4.inProgressTransformationInfo
            if (r1 != 0) goto L2a
            androidx.camera.core.SurfaceRequest$TransformationInfo r5 = r5.getInProgressTransformationInfo()
            if (r5 != 0) goto L35
            goto L34
        L2a:
            androidx.camera.core.SurfaceRequest$TransformationInfo r5 = r5.getInProgressTransformationInfo()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
        L34:
            return r0
        L35:
            return r2
    }

    @Override // androidx.camera.video.StreamInfo
    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @Override // androidx.camera.video.StreamInfo
    @androidx.annotation.Nullable
    public androidx.camera.core.SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
            r1 = this;
            androidx.camera.core.SurfaceRequest$TransformationInfo r0 = r1.inProgressTransformationInfo
            return r0
    }

    @Override // androidx.camera.video.StreamInfo
    @androidx.annotation.NonNull
    public androidx.camera.video.StreamInfo.StreamState getStreamState() {
            r1 = this;
            androidx.camera.video.StreamInfo$StreamState r0 = r1.streamState
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.id
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.video.StreamInfo$StreamState r2 = r3.streamState
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.SurfaceRequest$TransformationInfo r1 = r3.inProgressTransformationInfo
            if (r1 != 0) goto L17
            r1 = 0
            goto L1b
        L17:
            int r1 = r1.hashCode()
        L1b:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "StreamInfo{id="
            r0.append(r1)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ", streamState="
            r0.append(r1)
            androidx.camera.video.StreamInfo$StreamState r1 = r2.streamState
            r0.append(r1)
            java.lang.String r1 = ", inProgressTransformationInfo="
            r0.append(r1)
            androidx.camera.core.SurfaceRequest$TransformationInfo r1 = r2.inProgressTransformationInfo
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
