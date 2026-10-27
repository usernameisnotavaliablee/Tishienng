package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_ResolutionInfo_ResolutionInfoInternal extends androidx.camera.core.ResolutionInfo.ResolutionInfoInternal {
    private final android.graphics.Rect cropRect;
    private final android.util.Size resolution;
    private final int rotationDegrees;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder {
        private android.graphics.Rect cropRect;
        private android.util.Size resolution;
        private java.lang.Integer rotationDegrees;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        androidx.camera.core.ResolutionInfo.ResolutionInfoInternal build() {
                r5 = this;
                android.util.Size r0 = r5.resolution
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " resolution"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                android.graphics.Rect r0 = r5.cropRect
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " cropRect"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Integer r0 = r5.rotationDegrees
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " rotationDegrees"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L58
                androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal r0 = new androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal
                android.util.Size r1 = r5.resolution
                android.graphics.Rect r2 = r5.cropRect
                java.lang.Integer r3 = r5.rotationDegrees
                int r3 = r3.intValue()
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L58:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setCropRect(android.graphics.Rect r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.cropRect = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null cropRect"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setResolution(android.util.Size r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.resolution = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null resolution"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setRotationDegrees(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.rotationDegrees = r1
                return r0
        }
    }

    private AutoValue_ResolutionInfo_ResolutionInfoInternal(android.util.Size r1, android.graphics.Rect r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.resolution = r1
            r0.cropRect = r2
            r0.rotationDegrees = r3
            return
    }

    /* synthetic */ AutoValue_ResolutionInfo_ResolutionInfoInternal(android.util.Size r1, android.graphics.Rect r2, int r3, androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
            r2 = 0
            if (r1 == 0) goto L2c
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r5 = (androidx.camera.core.ResolutionInfo.ResolutionInfoInternal) r5
            android.util.Size r1 = r4.resolution
            android.util.Size r3 = r5.getResolution()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            android.graphics.Rect r1 = r4.cropRect
            android.graphics.Rect r3 = r5.getCropRect()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            int r1 = r4.rotationDegrees
            int r5 = r5.getRotationDegrees()
            if (r1 != r5) goto L2c
            return r0
        L2c:
            return r2
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    @androidx.annotation.NonNull
    android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.cropRect
            return r0
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    @androidx.annotation.NonNull
    android.util.Size getResolution() {
            r1 = this;
            android.util.Size r0 = r1.resolution
            return r0
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    int getRotationDegrees() {
            r1 = this;
            int r0 = r1.rotationDegrees
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.resolution
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.graphics.Rect r2 = r3.cropRect
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.rotationDegrees
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ResolutionInfoInternal{resolution="
            r0.append(r1)
            android.util.Size r1 = r2.resolution
            r0.append(r1)
            java.lang.String r1 = ", cropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.cropRect
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r2.rotationDegrees
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
