package androidx.camera.camera2.internal.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StreamConfigurationMapCompat {
    private static final java.lang.String TAG = "StreamConfigurationMapCompat";
    private final java.util.Map<java.lang.Class<?>, android.util.Size[]> mCachedClassOutputSizes;
    private final java.util.Map<java.lang.Integer, android.util.Size[]> mCachedFormatHighResolutionOutputSizes;
    private final java.util.Map<java.lang.Integer, android.util.Size[]> mCachedFormatOutputSizes;
    private final androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl mImpl;
    private final androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector mOutputSizesCorrector;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface StreamConfigurationMapCompatImpl {
        @androidx.annotation.Nullable
        android.util.Size[] getHighResolutionOutputSizes(int r1);

        @androidx.annotation.Nullable
        android.util.Size[] getOutputSizes(int r1);

        @androidx.annotation.Nullable
        <T> android.util.Size[] getOutputSizes(@androidx.annotation.NonNull java.lang.Class<T> r1);

        @androidx.annotation.NonNull
        android.hardware.camera2.params.StreamConfigurationMap unwrap();
    }

    private StreamConfigurationMapCompat(@androidx.annotation.NonNull android.hardware.camera2.params.StreamConfigurationMap r3, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector r4) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCachedFormatOutputSizes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCachedFormatHighResolutionOutputSizes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCachedClassOutputSizes = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L26
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatApi23Impl r0 = new androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatApi23Impl
            r0.<init>(r3)
            r2.mImpl = r0
            goto L2d
        L26:
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl r0 = new androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl
            r0.<init>(r3)
            r2.mImpl = r0
        L2d:
            r2.mOutputSizesCorrector = r4
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat toStreamConfigurationMapCompat(@androidx.annotation.NonNull android.hardware.camera2.params.StreamConfigurationMap r1, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector r2) {
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat r0 = new androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public android.util.Size[] getHighResolutionOutputSizes(int r4) {
            r3 = this;
            java.util.Map<java.lang.Integer, android.util.Size[]> r0 = r3.mCachedFormatHighResolutionOutputSizes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            r1 = 0
            if (r0 == 0) goto L2f
            java.util.Map<java.lang.Integer, android.util.Size[]> r0 = r3.mCachedFormatHighResolutionOutputSizes
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r2)
            android.util.Size[] r0 = (android.util.Size[]) r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            java.util.Map<java.lang.Integer, android.util.Size[]> r0 = r3.mCachedFormatHighResolutionOutputSizes
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            return r4
        L2f:
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl r0 = r3.mImpl
            android.util.Size[] r0 = r0.getHighResolutionOutputSizes(r4)
            if (r0 == 0) goto L40
            int r2 = r0.length
            if (r2 <= 0) goto L40
            androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector r2 = r3.mOutputSizesCorrector
            android.util.Size[] r0 = r2.applyQuirks(r0, r4)
        L40:
            java.util.Map<java.lang.Integer, android.util.Size[]> r2 = r3.mCachedFormatHighResolutionOutputSizes
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r4, r0)
            if (r0 == 0) goto L52
            java.lang.Object r4 = r0.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            return r4
        L52:
            return r1
    }

    @androidx.annotation.Nullable
    public android.util.Size[] getOutputSizes(int r4) {
            r3 = this;
            java.util.Map<java.lang.Integer, android.util.Size[]> r0 = r3.mCachedFormatOutputSizes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L2f
            java.util.Map<java.lang.Integer, android.util.Size[]> r0 = r3.mCachedFormatOutputSizes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            android.util.Size[] r0 = (android.util.Size[]) r0
            if (r0 != 0) goto L1c
            r4 = 0
            return r4
        L1c:
            java.util.Map<java.lang.Integer, android.util.Size[]> r0 = r3.mCachedFormatOutputSizes
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            return r4
        L2f:
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl r0 = r3.mImpl
            android.util.Size[] r0 = r0.getOutputSizes(r4)
            if (r0 == 0) goto L51
            int r1 = r0.length
            if (r1 != 0) goto L3b
            goto L51
        L3b:
            androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector r1 = r3.mOutputSizesCorrector
            android.util.Size[] r0 = r1.applyQuirks(r0, r4)
            java.util.Map<java.lang.Integer, android.util.Size[]> r1 = r3.mCachedFormatOutputSizes
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r4, r0)
            java.lang.Object r4 = r0.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            return r4
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Retrieved output sizes array is null or empty for format "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "StreamConfigurationMapCompat"
            androidx.camera.core.Logger.w(r1, r4)
            return r0
    }

    @androidx.annotation.Nullable
    public <T> android.util.Size[] getOutputSizes(@androidx.annotation.NonNull java.lang.Class<T> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, android.util.Size[]> r0 = r3.mCachedClassOutputSizes
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L23
            java.util.Map<java.lang.Class<?>, android.util.Size[]> r0 = r3.mCachedClassOutputSizes
            java.lang.Object r0 = r0.get(r4)
            android.util.Size[] r0 = (android.util.Size[]) r0
            if (r0 != 0) goto L14
            r4 = 0
            return r4
        L14:
            java.util.Map<java.lang.Class<?>, android.util.Size[]> r0 = r3.mCachedClassOutputSizes
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            return r4
        L23:
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl r0 = r3.mImpl
            android.util.Size[] r0 = r0.getOutputSizes(r4)
            if (r0 == 0) goto L41
            int r1 = r0.length
            if (r1 != 0) goto L2f
            goto L41
        L2f:
            androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector r1 = r3.mOutputSizesCorrector
            android.util.Size[] r0 = r1.applyQuirks(r0, r4)
            java.util.Map<java.lang.Class<?>, android.util.Size[]> r1 = r3.mCachedClassOutputSizes
            r1.put(r4, r0)
            java.lang.Object r4 = r0.clone()
            android.util.Size[] r4 = (android.util.Size[]) r4
            return r4
        L41:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Retrieved output sizes array is null or empty for class "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "StreamConfigurationMapCompat"
            androidx.camera.core.Logger.w(r1, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.params.StreamConfigurationMap toStreamConfigurationMap() {
            r1 = this;
            androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl r0 = r1.mImpl
            android.hardware.camera2.params.StreamConfigurationMap r0 = r0.unwrap()
            return r0
    }
}
