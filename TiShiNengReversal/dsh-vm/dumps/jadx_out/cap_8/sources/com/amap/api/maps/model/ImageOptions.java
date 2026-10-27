package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImageOptions {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int color;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public java.lang.String content;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int fontSize;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public float radius;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public double[] rgba;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ShapeType extends java.lang.Enum<com.amap.api.maps.model.ImageOptions.ShapeType> {
        private static final /* synthetic */ com.amap.api.maps.model.ImageOptions.ShapeType[] $VALUES = null;
        public static final com.amap.api.maps.model.ImageOptions.ShapeType CIRCLE = null;
        public static final com.amap.api.maps.model.ImageOptions.ShapeType DEFAULT = null;
        public static final com.amap.api.maps.model.ImageOptions.ShapeType TEXT = null;
        private int index;

        static {
                com.amap.api.maps.model.ImageOptions$ShapeType r0 = new com.amap.api.maps.model.ImageOptions$ShapeType
                java.lang.String r1 = "DEFAULT"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.maps.model.ImageOptions.ShapeType.DEFAULT = r0
                com.amap.api.maps.model.ImageOptions$ShapeType r1 = new com.amap.api.maps.model.ImageOptions$ShapeType
                java.lang.String r3 = "CIRCLE"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.maps.model.ImageOptions.ShapeType.CIRCLE = r1
                com.amap.api.maps.model.ImageOptions$ShapeType r3 = new com.amap.api.maps.model.ImageOptions$ShapeType
                java.lang.String r5 = "TEXT"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.maps.model.ImageOptions.ShapeType.TEXT = r3
                r5 = 3
                com.amap.api.maps.model.ImageOptions$ShapeType[] r5 = new com.amap.api.maps.model.ImageOptions.ShapeType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.amap.api.maps.model.ImageOptions.ShapeType.$VALUES = r5
                return
        }

        ShapeType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.amap.api.maps.model.ImageOptions.ShapeType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.model.ImageOptions$ShapeType> r0 = com.amap.api.maps.model.ImageOptions.ShapeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.model.ImageOptions$ShapeType r1 = (com.amap.api.maps.model.ImageOptions.ShapeType) r1
                return r1
        }

        public static com.amap.api.maps.model.ImageOptions.ShapeType[] values() {
                com.amap.api.maps.model.ImageOptions$ShapeType[] r0 = com.amap.api.maps.model.ImageOptions.ShapeType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.model.ImageOptions$ShapeType[] r0 = (com.amap.api.maps.model.ImageOptions.ShapeType[]) r0
                return r0
        }

        public final int value() {
                r1 = this;
                int r0 = r1.index
                return r0
        }
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public ImageOptions() {
            r0 = this;
            r0.<init>()
            return
    }
}
