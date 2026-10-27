package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class XAxis extends com.github.mikephil.charting.components.AxisBase {
    private boolean mAvoidFirstLastClipping;
    public int mLabelHeight;
    public int mLabelRotatedHeight;
    public int mLabelRotatedWidth;
    protected float mLabelRotationAngle;
    public int mLabelWidth;
    private com.github.mikephil.charting.components.XAxis.XAxisPosition mPosition;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum XAxisPosition extends java.lang.Enum<com.github.mikephil.charting.components.XAxis.XAxisPosition> {
        private static final /* synthetic */ com.github.mikephil.charting.components.XAxis.XAxisPosition[] $VALUES = null;
        public static final com.github.mikephil.charting.components.XAxis.XAxisPosition BOTH_SIDED = null;
        public static final com.github.mikephil.charting.components.XAxis.XAxisPosition BOTTOM = null;
        public static final com.github.mikephil.charting.components.XAxis.XAxisPosition BOTTOM_INSIDE = null;
        public static final com.github.mikephil.charting.components.XAxis.XAxisPosition TOP = null;
        public static final com.github.mikephil.charting.components.XAxis.XAxisPosition TOP_INSIDE = null;

        static {
                com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = new com.github.mikephil.charting.components.XAxis$XAxisPosition
                java.lang.String r1 = "TOP"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP = r0
                com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = new com.github.mikephil.charting.components.XAxis$XAxisPosition
                java.lang.String r3 = "BOTTOM"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM = r1
                com.github.mikephil.charting.components.XAxis$XAxisPosition r3 = new com.github.mikephil.charting.components.XAxis$XAxisPosition
                java.lang.String r5 = "BOTH_SIDED"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED = r3
                com.github.mikephil.charting.components.XAxis$XAxisPosition r5 = new com.github.mikephil.charting.components.XAxis$XAxisPosition
                java.lang.String r7 = "TOP_INSIDE"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE = r5
                com.github.mikephil.charting.components.XAxis$XAxisPosition r7 = new com.github.mikephil.charting.components.XAxis$XAxisPosition
                java.lang.String r9 = "BOTTOM_INSIDE"
                r10 = 4
                r7.<init>(r9, r10)
                com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE = r7
                r9 = 5
                com.github.mikephil.charting.components.XAxis$XAxisPosition[] r9 = new com.github.mikephil.charting.components.XAxis.XAxisPosition[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.github.mikephil.charting.components.XAxis.XAxisPosition.$VALUES = r9
                return
        }

        XAxisPosition(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.XAxis.XAxisPosition valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.XAxis$XAxisPosition> r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.XAxis$XAxisPosition r1 = (com.github.mikephil.charting.components.XAxis.XAxisPosition) r1
                return r1
        }

        public static com.github.mikephil.charting.components.XAxis.XAxisPosition[] values() {
                com.github.mikephil.charting.components.XAxis$XAxisPosition[] r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.XAxis$XAxisPosition[] r0 = (com.github.mikephil.charting.components.XAxis.XAxisPosition[]) r0
                return r0
        }
    }

    public XAxis() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mLabelWidth = r0
            r1.mLabelHeight = r0
            r1.mLabelRotatedWidth = r0
            r1.mLabelRotatedHeight = r0
            r0 = 0
            r1.mLabelRotationAngle = r0
            r0 = 0
            r1.mAvoidFirstLastClipping = r0
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP
            r1.mPosition = r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r1.mYOffset = r0
            return
    }

    public float getLabelRotationAngle() {
            r1 = this;
            float r0 = r1.mLabelRotationAngle
            return r0
    }

    public com.github.mikephil.charting.components.XAxis.XAxisPosition getPosition() {
            r1 = this;
            com.github.mikephil.charting.components.XAxis$XAxisPosition r0 = r1.mPosition
            return r0
    }

    public boolean isAvoidFirstLastClippingEnabled() {
            r1 = this;
            boolean r0 = r1.mAvoidFirstLastClipping
            return r0
    }

    public void setAvoidFirstLastClipping(boolean r1) {
            r0 = this;
            r0.mAvoidFirstLastClipping = r1
            return
    }

    public void setLabelRotationAngle(float r1) {
            r0 = this;
            r0.mLabelRotationAngle = r1
            return
    }

    public void setPosition(com.github.mikephil.charting.components.XAxis.XAxisPosition r1) {
            r0 = this;
            r0.mPosition = r1
            return
    }
}
