package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraSelector {

    @androidx.annotation.NonNull
    public static final androidx.camera.core.CameraSelector DEFAULT_BACK_CAMERA = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.CameraSelector DEFAULT_FRONT_CAMERA = null;
    public static final int LENS_FACING_BACK = 1;

    @androidx.camera.core.ExperimentalLensFacing
    public static final int LENS_FACING_EXTERNAL = 2;
    public static final int LENS_FACING_FRONT = 0;
    public static final int LENS_FACING_UNKNOWN = -1;
    private java.util.LinkedHashSet<androidx.camera.core.CameraFilter> mCameraFilterSet;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> mCameraFilterSet;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.mCameraFilterSet = r0
                return
        }

        private Builder(@androidx.annotation.NonNull java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r2) {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>(r2)
                r1.mCameraFilterSet = r0
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static androidx.camera.core.CameraSelector.Builder fromSelector(@androidx.annotation.NonNull androidx.camera.core.CameraSelector r1) {
                androidx.camera.core.CameraSelector$Builder r0 = new androidx.camera.core.CameraSelector$Builder
                java.util.LinkedHashSet r1 = r1.getCameraFilterSet()
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraSelector.Builder addCameraFilter(@androidx.annotation.NonNull androidx.camera.core.CameraFilter r2) {
                r1 = this;
                java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r0 = r1.mCameraFilterSet
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraSelector build() {
                r2 = this;
                androidx.camera.core.CameraSelector r0 = new androidx.camera.core.CameraSelector
                java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r1 = r2.mCameraFilterSet
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.CameraSelector.Builder requireLensFacing(int r3) {
                r2 = this;
                r0 = -1
                if (r3 == r0) goto L5
                r0 = 1
                goto L6
            L5:
                r0 = 0
            L6:
                java.lang.String r1 = "The specified lens facing is invalid."
                androidx.core.util.Preconditions.checkState(r0, r1)
                java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r0 = r2.mCameraFilterSet
                androidx.camera.core.impl.LensFacingCameraFilter r1 = new androidx.camera.core.impl.LensFacingCameraFilter
                r1.<init>(r3)
                r0.add(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalLensFacing.class})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LensFacing {
    }

    static {
            androidx.camera.core.CameraSelector$Builder r0 = new androidx.camera.core.CameraSelector$Builder
            r0.<init>()
            r1 = 0
            androidx.camera.core.CameraSelector$Builder r0 = r0.requireLensFacing(r1)
            androidx.camera.core.CameraSelector r0 = r0.build()
            androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA = r0
            androidx.camera.core.CameraSelector$Builder r0 = new androidx.camera.core.CameraSelector$Builder
            r0.<init>()
            r1 = 1
            androidx.camera.core.CameraSelector$Builder r0 = r0.requireLensFacing(r1)
            androidx.camera.core.CameraSelector r0 = r0.build()
            androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA = r0
            return
    }

    CameraSelector(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraFilterSet = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> filter(@androidx.annotation.NonNull java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.CameraInternal r2 = (androidx.camera.core.impl.CameraInternal) r2
            androidx.camera.core.CameraInfo r2 = r2.getCameraInfo()
            r0.add(r2)
            goto L9
        L1d:
            java.util.List r0 = r4.filter(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()
            androidx.camera.core.impl.CameraInternal r2 = (androidx.camera.core.impl.CameraInternal) r2
            androidx.camera.core.CameraInfo r3 = r2.getCameraInfo()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L2a
            r1.add(r2)
            goto L2a
        L44:
            return r1
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.CameraInfo> filter(@androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraInfo> r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r1 = r3.mCameraFilterSet
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            androidx.camera.core.CameraFilter r2 = (androidx.camera.core.CameraFilter) r2
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.List r0 = r2.filter(r0)
            goto Lb
        L20:
            r0.retainAll(r4)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.LinkedHashSet<androidx.camera.core.CameraFilter> getCameraFilterSet() {
            r1 = this;
            java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r0 = r1.mCameraFilterSet
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.Integer getLensFacing() {
            r4 = this;
            java.util.LinkedHashSet<androidx.camera.core.CameraFilter> r0 = r4.mCameraFilterSet
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            androidx.camera.core.CameraFilter r2 = (androidx.camera.core.CameraFilter) r2
            boolean r3 = r2 instanceof androidx.camera.core.impl.LensFacingCameraFilter
            if (r3 == 0) goto L7
            androidx.camera.core.impl.LensFacingCameraFilter r2 = (androidx.camera.core.impl.LensFacingCameraFilter) r2
            int r2 = r2.getLensFacing()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L25
            r1 = r2
            goto L7
        L25:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2c
            goto L7
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Multiple conflicting lens facing requirements exist."
            r0.<init>(r1)
            throw r0
        L34:
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.CameraInternal select(@androidx.annotation.NonNull java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> r2) {
            r1 = this;
            java.util.LinkedHashSet r2 = r1.filter(r2)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r2 = r2.next()
            androidx.camera.core.impl.CameraInternal r2 = (androidx.camera.core.impl.CameraInternal) r2
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No available camera can be found"
            r2.<init>(r0)
            throw r2
    }
}
