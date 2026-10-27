package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_SurfaceSizeDefinition extends androidx.camera.core.impl.SurfaceSizeDefinition {
    private final android.util.Size analysisSize;
    private final java.util.Map<java.lang.Integer, android.util.Size> maximumSizeMap;
    private final android.util.Size previewSize;
    private final android.util.Size recordSize;
    private final java.util.Map<java.lang.Integer, android.util.Size> s1440pSizeMap;
    private final java.util.Map<java.lang.Integer, android.util.Size> s720pSizeMap;
    private final java.util.Map<java.lang.Integer, android.util.Size> ultraMaximumSizeMap;

    AutoValue_SurfaceSizeDefinition(android.util.Size r1, java.util.Map<java.lang.Integer, android.util.Size> r2, android.util.Size r3, java.util.Map<java.lang.Integer, android.util.Size> r4, android.util.Size r5, java.util.Map<java.lang.Integer, android.util.Size> r6, java.util.Map<java.lang.Integer, android.util.Size> r7) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L50
            r0.analysisSize = r1
            if (r2 == 0) goto L48
            r0.s720pSizeMap = r2
            if (r3 == 0) goto L40
            r0.previewSize = r3
            if (r4 == 0) goto L38
            r0.s1440pSizeMap = r4
            if (r5 == 0) goto L30
            r0.recordSize = r5
            if (r6 == 0) goto L28
            r0.maximumSizeMap = r6
            if (r7 == 0) goto L20
            r0.ultraMaximumSizeMap = r7
            return
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null ultraMaximumSizeMap"
            r1.<init>(r2)
            throw r1
        L28:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null maximumSizeMap"
            r1.<init>(r2)
            throw r1
        L30:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null recordSize"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null s1440pSizeMap"
            r1.<init>(r2)
            throw r1
        L40:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null previewSize"
            r1.<init>(r2)
            throw r1
        L48:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null s720pSizeMap"
            r1.<init>(r2)
            throw r1
        L50:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null analysisSize"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.SurfaceSizeDefinition
            r2 = 0
            if (r1 == 0) goto L60
            androidx.camera.core.impl.SurfaceSizeDefinition r5 = (androidx.camera.core.impl.SurfaceSizeDefinition) r5
            android.util.Size r1 = r4.analysisSize
            android.util.Size r3 = r5.getAnalysisSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r4.s720pSizeMap
            java.util.Map r3 = r5.getS720pSizeMap()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            android.util.Size r1 = r4.previewSize
            android.util.Size r3 = r5.getPreviewSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r4.s1440pSizeMap
            java.util.Map r3 = r5.getS1440pSizeMap()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            android.util.Size r1 = r4.recordSize
            android.util.Size r3 = r5.getRecordSize()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r4.maximumSizeMap
            java.util.Map r3 = r5.getMaximumSizeMap()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r4.ultraMaximumSizeMap
            java.util.Map r5 = r5.getUltraMaximumSizeMap()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L60
            return r0
        L60:
            return r2
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public android.util.Size getAnalysisSize() {
            r1 = this;
            android.util.Size r0 = r1.analysisSize
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public java.util.Map<java.lang.Integer, android.util.Size> getMaximumSizeMap() {
            r1 = this;
            java.util.Map<java.lang.Integer, android.util.Size> r0 = r1.maximumSizeMap
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public android.util.Size getPreviewSize() {
            r1 = this;
            android.util.Size r0 = r1.previewSize
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public android.util.Size getRecordSize() {
            r1 = this;
            android.util.Size r0 = r1.recordSize
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public java.util.Map<java.lang.Integer, android.util.Size> getS1440pSizeMap() {
            r1 = this;
            java.util.Map<java.lang.Integer, android.util.Size> r0 = r1.s1440pSizeMap
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public java.util.Map<java.lang.Integer, android.util.Size> getS720pSizeMap() {
            r1 = this;
            java.util.Map<java.lang.Integer, android.util.Size> r0 = r1.s720pSizeMap
            return r0
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    @androidx.annotation.NonNull
    public java.util.Map<java.lang.Integer, android.util.Size> getUltraMaximumSizeMap() {
            r1 = this;
            java.util.Map<java.lang.Integer, android.util.Size> r0 = r1.ultraMaximumSizeMap
            return r0
    }

    public int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.analysisSize
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.Map<java.lang.Integer, android.util.Size> r2 = r3.s720pSizeMap
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.previewSize
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.Map<java.lang.Integer, android.util.Size> r2 = r3.s1440pSizeMap
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.recordSize
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.Map<java.lang.Integer, android.util.Size> r2 = r3.maximumSizeMap
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r3.ultraMaximumSizeMap
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SurfaceSizeDefinition{analysisSize="
            r0.append(r1)
            android.util.Size r1 = r2.analysisSize
            r0.append(r1)
            java.lang.String r1 = ", s720pSizeMap="
            r0.append(r1)
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r2.s720pSizeMap
            r0.append(r1)
            java.lang.String r1 = ", previewSize="
            r0.append(r1)
            android.util.Size r1 = r2.previewSize
            r0.append(r1)
            java.lang.String r1 = ", s1440pSizeMap="
            r0.append(r1)
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r2.s1440pSizeMap
            r0.append(r1)
            java.lang.String r1 = ", recordSize="
            r0.append(r1)
            android.util.Size r1 = r2.recordSize
            r0.append(r1)
            java.lang.String r1 = ", maximumSizeMap="
            r0.append(r1)
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r2.maximumSizeMap
            r0.append(r1)
            java.lang.String r1 = ", ultraMaximumSizeMap="
            r0.append(r1)
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r2.ultraMaximumSizeMap
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
