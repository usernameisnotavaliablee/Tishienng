package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2DeviceSurfaceManager implements androidx.camera.core.impl.CameraDeviceSurfaceManager {
    private static final java.lang.String TAG = "Camera2DeviceSurfaceManager";
    private final androidx.camera.camera2.internal.CamcorderProfileHelper mCamcorderProfileHelper;
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap;


    Camera2DeviceSurfaceManager(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.camera.camera2.internal.CamcorderProfileHelper r3, @androidx.annotation.Nullable java.lang.Object r4, @androidx.annotation.NonNull java.util.Set<java.lang.String> r5) throws androidx.camera.core.CameraUnavailableException {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCameraSupportedSurfaceCombinationMap = r0
            androidx.core.util.Preconditions.checkNotNull(r3)
            r1.mCamcorderProfileHelper = r3
            boolean r3 = r4 instanceof androidx.camera.camera2.internal.compat.CameraManagerCompat
            if (r3 == 0) goto L16
            androidx.camera.camera2.internal.compat.CameraManagerCompat r4 = (androidx.camera.camera2.internal.compat.CameraManagerCompat) r4
            goto L1a
        L16:
            androidx.camera.camera2.internal.compat.CameraManagerCompat r4 = androidx.camera.camera2.internal.compat.CameraManagerCompat.from(r2)
        L1a:
            r1.init(r2, r4, r5)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public Camera2DeviceSurfaceManager(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable java.lang.Object r3, @androidx.annotation.NonNull java.util.Set<java.lang.String> r4) throws androidx.camera.core.CameraUnavailableException {
            r1 = this;
            androidx.camera.camera2.internal.Camera2DeviceSurfaceManager$1 r0 = new androidx.camera.camera2.internal.Camera2DeviceSurfaceManager$1
            r0.<init>()
            r1.<init>(r2, r0, r3, r4)
            return
    }

    private void init(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraManagerCompat r6, @androidx.annotation.NonNull java.util.Set<java.lang.String> r7) throws androidx.camera.core.CameraUnavailableException {
            r4 = this;
            androidx.core.util.Preconditions.checkNotNull(r5)
            java.util.Iterator r7 = r7.iterator()
        L7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.SupportedSurfaceCombination> r1 = r4.mCameraSupportedSurfaceCombinationMap
            androidx.camera.camera2.internal.SupportedSurfaceCombination r2 = new androidx.camera.camera2.internal.SupportedSurfaceCombination
            androidx.camera.camera2.internal.CamcorderProfileHelper r3 = r4.mCamcorderProfileHelper
            r2.<init>(r5, r0, r6, r3)
            r1.put(r0, r2)
            goto L7
        L20:
            return
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @androidx.annotation.NonNull
    public android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecs(int r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> r5, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> r6) {
            r2 = this;
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r1 = "No new use cases to be bound."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.SupportedSurfaceCombination> r0 = r2.mCameraSupportedSurfaceCombinationMap
            java.lang.Object r0 = r0.get(r4)
            androidx.camera.camera2.internal.SupportedSurfaceCombination r0 = (androidx.camera.camera2.internal.SupportedSurfaceCombination) r0
            if (r0 == 0) goto L1a
            android.util.Pair r3 = r0.getSuggestedStreamSpecifications(r3, r5, r6)
            return r3
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "No such camera id in supported combination list: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int r2, @androidx.annotation.NonNull java.lang.String r3, int r4, @androidx.annotation.NonNull android.util.Size r5) {
            r1 = this;
            java.util.Map<java.lang.String, androidx.camera.camera2.internal.SupportedSurfaceCombination> r0 = r1.mCameraSupportedSurfaceCombinationMap
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.camera2.internal.SupportedSurfaceCombination r3 = (androidx.camera.camera2.internal.SupportedSurfaceCombination) r3
            if (r3 == 0) goto Lf
            androidx.camera.core.impl.SurfaceConfig r2 = r3.transformSurfaceConfig(r2, r4, r5)
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
