package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraSelectionOptimizer {
    private CameraSelectionOptimizer() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String decideSkippedCameraIdByHeuristic(androidx.camera.camera2.internal.compat.CameraManagerCompat r4, java.lang.Integer r5, java.util.List<java.lang.String> r6) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "0"
            boolean r2 = r6.contains(r1)
            if (r2 == 0) goto L48
            java.lang.String r2 = "1"
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L15
            goto L48
        L15:
            int r6 = r5.intValue()
            r3 = 1
            if (r6 != r3) goto L2f
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r4 = r4.getCameraCharacteristicsCompat(r1)
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L48
            return r2
        L2f:
            int r5 = r5.intValue()
            if (r5 != 0) goto L48
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r4 = r4.getCameraCharacteristicsCompat(r2)
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L48
            return r1
        L48:
            return r0
    }

    static java.util.List<java.lang.String> getSelectedAvailableCameraIds(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2CameraFactory r6, @androidx.annotation.Nullable androidx.camera.core.CameraSelector r7) throws androidx.camera.core.InitializationException {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            r0.<init>()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            androidx.camera.camera2.internal.compat.CameraManagerCompat r1 = r6.getCameraManager()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.String[] r1 = r1.getCameraIdList()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            if (r7 != 0) goto L27
            java.util.Iterator r6 = r1.iterator()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
        L17:
            boolean r7 = r6.hasNext()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            if (r7 == 0) goto L77
            java.lang.Object r7 = r6.next()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.String r7 = (java.lang.String) r7     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            r0.add(r7)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            goto L17
        L27:
            java.lang.Integer r2 = r7.getLensFacing()     // Catch: java.lang.IllegalStateException -> L34 androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            androidx.camera.camera2.internal.compat.CameraManagerCompat r3 = r6.getCameraManager()     // Catch: java.lang.IllegalStateException -> L34 androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.String r2 = decideSkippedCameraIdByHeuristic(r3, r2, r1)     // Catch: java.lang.IllegalStateException -> L34 androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            goto L35
        L34:
            r2 = 0
        L35:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            r3.<init>()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.util.Iterator r1 = r1.iterator()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
        L3e:
            boolean r4 = r1.hasNext()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            if (r4 == 0) goto L59
            java.lang.Object r4 = r1.next()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.String r4 = (java.lang.String) r4     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            boolean r5 = r4.equals(r2)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            if (r5 == 0) goto L51
            goto L3e
        L51:
            androidx.camera.camera2.internal.Camera2CameraInfoImpl r4 = r6.getCameraInfo(r4)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            r3.add(r4)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            goto L3e
        L59:
            java.util.List r6 = r7.filter(r3)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.util.Iterator r6 = r6.iterator()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
        L61:
            boolean r7 = r6.hasNext()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            if (r7 == 0) goto L77
            java.lang.Object r7 = r6.next()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            androidx.camera.core.CameraInfo r7 = (androidx.camera.core.CameraInfo) r7     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            androidx.camera.core.impl.CameraInfoInternal r7 = (androidx.camera.core.impl.CameraInfoInternal) r7     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            java.lang.String r7 = r7.getCameraId()     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            r0.add(r7)     // Catch: androidx.camera.core.CameraUnavailableException -> L78 androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> L7f
            goto L61
        L77:
            return r0
        L78:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            r7.<init>(r6)
            throw r7
        L7f:
            r6 = move-exception
            androidx.camera.core.InitializationException r7 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(r6)
            r7.<init>(r6)
            throw r7
    }
}
