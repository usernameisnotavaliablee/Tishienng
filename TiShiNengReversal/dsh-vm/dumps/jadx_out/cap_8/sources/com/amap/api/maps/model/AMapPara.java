package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapPara {
    public static final int DOTTEDLINE_TYPE_CIRCLE = 1;
    public static final int DOTTEDLINE_TYPE_DEFAULT = -1;
    public static final int DOTTEDLINE_TYPE_SQUARE = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LineCapType extends java.lang.Enum<com.amap.api.maps.model.AMapPara.LineCapType> {
        private static final /* synthetic */ com.amap.api.maps.model.AMapPara.LineCapType[] $VALUES = null;
        public static final com.amap.api.maps.model.AMapPara.LineCapType LineCapArrow = null;
        public static final com.amap.api.maps.model.AMapPara.LineCapType LineCapButt = null;
        public static final com.amap.api.maps.model.AMapPara.LineCapType LineCapRound = null;
        public static final com.amap.api.maps.model.AMapPara.LineCapType LineCapSquare = null;
        private int type;

        static {
                com.amap.api.maps.model.AMapPara$LineCapType r0 = new com.amap.api.maps.model.AMapPara$LineCapType
                java.lang.String r1 = "LineCapButt"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.maps.model.AMapPara.LineCapType.LineCapButt = r0
                com.amap.api.maps.model.AMapPara$LineCapType r1 = new com.amap.api.maps.model.AMapPara$LineCapType
                java.lang.String r3 = "LineCapSquare"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.maps.model.AMapPara.LineCapType.LineCapSquare = r1
                com.amap.api.maps.model.AMapPara$LineCapType r3 = new com.amap.api.maps.model.AMapPara$LineCapType
                java.lang.String r5 = "LineCapArrow"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.maps.model.AMapPara.LineCapType.LineCapArrow = r3
                com.amap.api.maps.model.AMapPara$LineCapType r5 = new com.amap.api.maps.model.AMapPara$LineCapType
                java.lang.String r7 = "LineCapRound"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.amap.api.maps.model.AMapPara.LineCapType.LineCapRound = r5
                r7 = 4
                com.amap.api.maps.model.AMapPara$LineCapType[] r7 = new com.amap.api.maps.model.AMapPara.LineCapType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.amap.api.maps.model.AMapPara.LineCapType.$VALUES = r7
                return
        }

        LineCapType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.type = r3
                return
        }

        public static com.amap.api.maps.model.AMapPara.LineCapType valueOf(int r2) {
                com.amap.api.maps.model.AMapPara$LineCapType[] r0 = values()
                int r1 = r0.length
                int r2 = java.lang.Math.min(r2, r1)
                r1 = 0
                int r2 = java.lang.Math.max(r1, r2)
                r2 = r0[r2]
                return r2
        }

        public static com.amap.api.maps.model.AMapPara.LineCapType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.model.AMapPara$LineCapType> r0 = com.amap.api.maps.model.AMapPara.LineCapType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.model.AMapPara$LineCapType r1 = (com.amap.api.maps.model.AMapPara.LineCapType) r1
                return r1
        }

        public static com.amap.api.maps.model.AMapPara.LineCapType[] values() {
                com.amap.api.maps.model.AMapPara$LineCapType[] r0 = com.amap.api.maps.model.AMapPara.LineCapType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.model.AMapPara$LineCapType[] r0 = (com.amap.api.maps.model.AMapPara.LineCapType[]) r0
                return r0
        }

        public final int getTypeValue() {
                r1 = this;
                int r0 = r1.type
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LineJoinType extends java.lang.Enum<com.amap.api.maps.model.AMapPara.LineJoinType> {
        private static final /* synthetic */ com.amap.api.maps.model.AMapPara.LineJoinType[] $VALUES = null;
        public static final com.amap.api.maps.model.AMapPara.LineJoinType LineJoinBevel = null;
        public static final com.amap.api.maps.model.AMapPara.LineJoinType LineJoinMiter = null;
        public static final com.amap.api.maps.model.AMapPara.LineJoinType LineJoinRound = null;
        private int type;

        static {
                com.amap.api.maps.model.AMapPara$LineJoinType r0 = new com.amap.api.maps.model.AMapPara$LineJoinType
                java.lang.String r1 = "LineJoinBevel"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.maps.model.AMapPara.LineJoinType.LineJoinBevel = r0
                com.amap.api.maps.model.AMapPara$LineJoinType r1 = new com.amap.api.maps.model.AMapPara$LineJoinType
                java.lang.String r3 = "LineJoinMiter"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.maps.model.AMapPara.LineJoinType.LineJoinMiter = r1
                com.amap.api.maps.model.AMapPara$LineJoinType r3 = new com.amap.api.maps.model.AMapPara$LineJoinType
                java.lang.String r5 = "LineJoinRound"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.maps.model.AMapPara.LineJoinType.LineJoinRound = r3
                r5 = 3
                com.amap.api.maps.model.AMapPara$LineJoinType[] r5 = new com.amap.api.maps.model.AMapPara.LineJoinType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.amap.api.maps.model.AMapPara.LineJoinType.$VALUES = r5
                return
        }

        LineJoinType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.type = r3
                return
        }

        public static com.amap.api.maps.model.AMapPara.LineJoinType valueOf(int r2) {
                com.amap.api.maps.model.AMapPara$LineJoinType[] r0 = values()
                int r1 = r0.length
                int r2 = java.lang.Math.min(r2, r1)
                r1 = 0
                int r2 = java.lang.Math.max(r1, r2)
                r2 = r0[r2]
                return r2
        }

        public static com.amap.api.maps.model.AMapPara.LineJoinType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.model.AMapPara$LineJoinType> r0 = com.amap.api.maps.model.AMapPara.LineJoinType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.model.AMapPara$LineJoinType r1 = (com.amap.api.maps.model.AMapPara.LineJoinType) r1
                return r1
        }

        public static com.amap.api.maps.model.AMapPara.LineJoinType[] values() {
                com.amap.api.maps.model.AMapPara$LineJoinType[] r0 = com.amap.api.maps.model.AMapPara.LineJoinType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.model.AMapPara$LineJoinType[] r0 = (com.amap.api.maps.model.AMapPara.LineJoinType[]) r0
                return r0
        }

        public final int getTypeValue() {
                r1 = this;
                int r0 = r1.type
                return r0
        }
    }

    public AMapPara() {
            r0 = this;
            r0.<init>()
            return
    }
}
