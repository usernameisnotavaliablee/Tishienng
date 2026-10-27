package xyz.adscope.common.v2.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface ILocation {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum CoordinateType extends java.lang.Enum<xyz.adscope.common.v2.location.ILocation.CoordinateType> {
        private static final /* synthetic */ xyz.adscope.common.v2.location.ILocation.CoordinateType[] $VALUES = null;
        public static final xyz.adscope.common.v2.location.ILocation.CoordinateType BD_09 = null;
        public static final xyz.adscope.common.v2.location.ILocation.CoordinateType GCJ_02 = null;
        public static final xyz.adscope.common.v2.location.ILocation.CoordinateType WGS_84 = null;
        private final java.lang.String type;

        private static /* synthetic */ xyz.adscope.common.v2.location.ILocation.CoordinateType[] $values() {
                r0 = 3
                xyz.adscope.common.v2.location.ILocation$CoordinateType[] r0 = new xyz.adscope.common.v2.location.ILocation.CoordinateType[r0]
                xyz.adscope.common.v2.location.ILocation$CoordinateType r1 = xyz.adscope.common.v2.location.ILocation.CoordinateType.WGS_84
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.location.ILocation$CoordinateType r1 = xyz.adscope.common.v2.location.ILocation.CoordinateType.GCJ_02
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.v2.location.ILocation$CoordinateType r1 = xyz.adscope.common.v2.location.ILocation.CoordinateType.BD_09
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.location.ILocation$CoordinateType r0 = new xyz.adscope.common.v2.location.ILocation$CoordinateType
                r1 = 0
                java.lang.String r2 = "WGS84"
                java.lang.String r3 = "WGS_84"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.v2.location.ILocation.CoordinateType.WGS_84 = r0
                xyz.adscope.common.v2.location.ILocation$CoordinateType r0 = new xyz.adscope.common.v2.location.ILocation$CoordinateType
                r1 = 1
                java.lang.String r2 = "GCJ02"
                java.lang.String r3 = "GCJ_02"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.v2.location.ILocation.CoordinateType.GCJ_02 = r0
                xyz.adscope.common.v2.location.ILocation$CoordinateType r0 = new xyz.adscope.common.v2.location.ILocation$CoordinateType
                r1 = 2
                java.lang.String r2 = "BD09"
                java.lang.String r3 = "BD_09"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.v2.location.ILocation.CoordinateType.BD_09 = r0
                xyz.adscope.common.v2.location.ILocation$CoordinateType[] r0 = $values()
                xyz.adscope.common.v2.location.ILocation.CoordinateType.$VALUES = r0
                return
        }

        CoordinateType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.type = r3
                return
        }

        public static xyz.adscope.common.v2.location.ILocation.CoordinateType valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.location.ILocation$CoordinateType> r0 = xyz.adscope.common.v2.location.ILocation.CoordinateType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.location.ILocation$CoordinateType r1 = (xyz.adscope.common.v2.location.ILocation.CoordinateType) r1
                return r1
        }

        public static xyz.adscope.common.v2.location.ILocation.CoordinateType[] values() {
                xyz.adscope.common.v2.location.ILocation$CoordinateType[] r0 = xyz.adscope.common.v2.location.ILocation.CoordinateType.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.location.ILocation$CoordinateType[] r0 = (xyz.adscope.common.v2.location.ILocation.CoordinateType[]) r0
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = r1.type
                return r0
        }
    }

    xyz.adscope.common.v2.location.ILocation.CoordinateType getCoordinateType();

    double getLatitude();

    long getLocationTimestamp();

    double getLongitude();
}
