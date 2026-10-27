package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CameraPosition implements android.os.Parcelable {
    private static final java.lang.String CLASSNAME = "CameraPosition";
    public static final com.amap.api.maps.model.CameraPositionCreator CREATOR = null;
    public final float bearing;
    public final boolean isAbroad;
    public final com.amap.api.maps.model.LatLng target;
    public final float tilt;
    public final float zoom;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private float bearing;
        private com.amap.api.maps.model.LatLng target;
        private float tilt;
        private float zoom;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public Builder(com.amap.api.maps.model.CameraPosition r3) {
                r2 = this;
                r2.<init>()
                com.amap.api.maps.model.LatLng r0 = r3.target
                com.amap.api.maps.model.CameraPosition$Builder r0 = r2.target(r0)
                float r1 = r3.bearing
                com.amap.api.maps.model.CameraPosition$Builder r0 = r0.bearing(r1)
                float r1 = r3.tilt
                com.amap.api.maps.model.CameraPosition$Builder r0 = r0.tilt(r1)
                float r3 = r3.zoom
                r0.zoom(r3)
                return
        }

        public final com.amap.api.maps.model.CameraPosition.Builder bearing(float r1) {
                r0 = this;
                r0.bearing = r1
                return r0
        }

        public final com.amap.api.maps.model.CameraPosition build() {
                r6 = this;
                r0 = 0
                com.amap.api.maps.model.LatLng r1 = r6.target     // Catch: java.lang.Throwable -> L14
                if (r1 != 0) goto L6
                return r0
            L6:
                com.amap.api.maps.model.CameraPosition r1 = new com.amap.api.maps.model.CameraPosition     // Catch: java.lang.Throwable -> L14
                com.amap.api.maps.model.LatLng r2 = r6.target     // Catch: java.lang.Throwable -> L14
                float r3 = r6.zoom     // Catch: java.lang.Throwable -> L14
                float r4 = r6.tilt     // Catch: java.lang.Throwable -> L14
                float r5 = r6.bearing     // Catch: java.lang.Throwable -> L14
                r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L14
                return r1
            L14:
                r1 = move-exception
                java.lang.String r2 = "CameraPosition"
                java.lang.String r3 = "build"
                com.amap.api.col.p0003l.w5.p(r1, r2, r3)
                return r0
        }

        public final com.amap.api.maps.model.CameraPosition.Builder target(com.amap.api.maps.model.LatLng r1) {
                r0 = this;
                r0.target = r1
                return r0
        }

        public final com.amap.api.maps.model.CameraPosition.Builder tilt(float r1) {
                r0 = this;
                r0.tilt = r1
                return r0
        }

        public final com.amap.api.maps.model.CameraPosition.Builder zoom(float r1) {
                r0 = this;
                r0.zoom = r1
                return r0
        }
    }

    static {
            com.amap.api.maps.model.CameraPositionCreator r0 = new com.amap.api.maps.model.CameraPositionCreator
            r0.<init>()
            com.amap.api.maps.model.CameraPosition.CREATOR = r0
            return
    }

    public CameraPosition(com.amap.api.maps.model.LatLng r5, float r6, float r7, float r8) {
            r4 = this;
            r4.<init>()
            r4.target = r5
            r4.zoom = r6
            r4.tilt = r7
            double r6 = (double) r8
            r0 = 0
            r2 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto L14
            float r8 = r8 % r2
            float r8 = r8 + r2
        L14:
            float r8 = r8 % r2
            r4.bearing = r8
            if (r5 == 0) goto L26
            double r6 = r5.latitude
            double r0 = r5.longitude
            boolean r5 = com.amap.api.col.p0003l.u2.a(r6, r0)
            r5 = r5 ^ 1
            r4.isAbroad = r5
            return
        L26:
            r5 = 0
            r4.isAbroad = r5
            return
    }

    public static com.amap.api.maps.model.CameraPosition.Builder builder() {
            com.amap.api.maps.model.CameraPosition$Builder r0 = new com.amap.api.maps.model.CameraPosition$Builder
            r0.<init>()
            return r0
    }

    public static com.amap.api.maps.model.CameraPosition.Builder builder(com.amap.api.maps.model.CameraPosition r1) {
            com.amap.api.maps.model.CameraPosition$Builder r0 = new com.amap.api.maps.model.CameraPosition$Builder
            r0.<init>(r1)
            return r0
    }

    public static final com.amap.api.maps.model.CameraPosition fromLatLngZoom(com.amap.api.maps.model.LatLng r2, float r3) {
            com.amap.api.maps.model.CameraPosition r0 = new com.amap.api.maps.model.CameraPosition
            r1 = 0
            r0.<init>(r2, r3, r1, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.amap.api.maps.model.CameraPosition
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.amap.api.maps.model.CameraPosition r5 = (com.amap.api.maps.model.CameraPosition) r5
            com.amap.api.maps.model.LatLng r1 = r4.target
            com.amap.api.maps.model.LatLng r3 = r5.target
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            float r1 = r4.zoom
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.zoom
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L41
            float r1 = r4.tilt
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.tilt
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L41
            float r1 = r4.bearing
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r5 = r5.bearing
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r1 != r5) goto L41
            return r0
        L41:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "target"
            com.amap.api.maps.model.LatLng r1 = r5.target
            java.lang.String r0 = com.amap.api.col.p0003l.b3.z(r0, r1)
            float r1 = r5.zoom
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "zoom"
            java.lang.String r1 = com.amap.api.col.p0003l.b3.z(r2, r1)
            float r2 = r5.tilt
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r3 = "tilt"
            java.lang.String r2 = com.amap.api.col.p0003l.b3.z(r3, r2)
            float r3 = r5.bearing
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r4 = "bearing"
            java.lang.String r3 = com.amap.api.col.p0003l.b3.z(r4, r3)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.lang.String r0 = com.amap.api.col.p0003l.b3.A(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            float r4 = r2.bearing
            r3.writeFloat(r4)
            com.amap.api.maps.model.LatLng r4 = r2.target
            double r0 = r4.latitude
            float r4 = (float) r0
            r3.writeFloat(r4)
            com.amap.api.maps.model.LatLng r4 = r2.target
            double r0 = r4.longitude
            float r4 = (float) r0
            r3.writeFloat(r4)
            float r4 = r2.tilt
            r3.writeFloat(r4)
            float r4 = r2.zoom
            r3.writeFloat(r4)
            return
    }
}
