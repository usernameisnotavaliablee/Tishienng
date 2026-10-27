package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PieDataSet extends com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.PieEntry> implements com.github.mikephil.charting.interfaces.datasets.IPieDataSet {
    private boolean mAutomaticallyDisableSliceSpacing;
    private float mShift;
    private float mSliceSpace;
    private boolean mUsingSliceColorAsValueLineColor;
    private int mValueLineColor;
    private float mValueLinePart1Length;
    private float mValueLinePart1OffsetPercentage;
    private float mValueLinePart2Length;
    private boolean mValueLineVariableLength;
    private float mValueLineWidth;
    private com.github.mikephil.charting.data.PieDataSet.ValuePosition mXValuePosition;
    private com.github.mikephil.charting.data.PieDataSet.ValuePosition mYValuePosition;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ValuePosition extends java.lang.Enum<com.github.mikephil.charting.data.PieDataSet.ValuePosition> {
        private static final /* synthetic */ com.github.mikephil.charting.data.PieDataSet.ValuePosition[] $VALUES = null;
        public static final com.github.mikephil.charting.data.PieDataSet.ValuePosition INSIDE_SLICE = null;
        public static final com.github.mikephil.charting.data.PieDataSet.ValuePosition OUTSIDE_SLICE = null;

        static {
                com.github.mikephil.charting.data.PieDataSet$ValuePosition r0 = new com.github.mikephil.charting.data.PieDataSet$ValuePosition
                java.lang.String r1 = "INSIDE_SLICE"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE = r0
                com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = new com.github.mikephil.charting.data.PieDataSet$ValuePosition
                java.lang.String r3 = "OUTSIDE_SLICE"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE = r1
                r3 = 2
                com.github.mikephil.charting.data.PieDataSet$ValuePosition[] r3 = new com.github.mikephil.charting.data.PieDataSet.ValuePosition[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.github.mikephil.charting.data.PieDataSet.ValuePosition.$VALUES = r3
                return
        }

        ValuePosition(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.data.PieDataSet.ValuePosition valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.data.PieDataSet$ValuePosition> r0 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = (com.github.mikephil.charting.data.PieDataSet.ValuePosition) r1
                return r1
        }

        public static com.github.mikephil.charting.data.PieDataSet.ValuePosition[] values() {
                com.github.mikephil.charting.data.PieDataSet$ValuePosition[] r0 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.data.PieDataSet$ValuePosition[] r0 = (com.github.mikephil.charting.data.PieDataSet.ValuePosition[]) r0
                return r0
        }
    }

    public PieDataSet(java.util.List<com.github.mikephil.charting.data.PieEntry> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mSliceSpace = r1
            r1 = 1099956224(0x41900000, float:18.0)
            r0.mShift = r1
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE
            r0.mXValuePosition = r1
            r0.mYValuePosition = r1
            r1 = 0
            r0.mUsingSliceColorAsValueLineColor = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.mValueLineColor = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.mValueLineWidth = r1
            r1 = 1117126656(0x42960000, float:75.0)
            r0.mValueLinePart1OffsetPercentage = r1
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0.mValueLinePart1Length = r1
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0.mValueLinePart2Length = r1
            r1 = 1
            r0.mValueLineVariableLength = r1
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    protected /* bridge */ /* synthetic */ void calcMinMax(com.github.mikephil.charting.data.PieEntry r1) {
            r0 = this;
            com.github.mikephil.charting.data.PieEntry r1 = (com.github.mikephil.charting.data.PieEntry) r1
            r0.calcMinMax2(r1)
            return
    }

    /* renamed from: calcMinMax, reason: avoid collision after fix types in other method */
    protected void calcMinMax2(com.github.mikephil.charting.data.PieEntry r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.calcMinMaxY(r1)
            return
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.PieEntry> copy() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            java.lang.Object r2 = r2.get(r1)
            com.github.mikephil.charting.data.PieEntry r2 = (com.github.mikephil.charting.data.PieEntry) r2
            com.github.mikephil.charting.data.PieEntry r2 = r2.copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.PieDataSet r1 = new com.github.mikephil.charting.data.PieDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.PieDataSet r1) {
            r0 = this;
            super.copy(r1)
            return
    }

    public float getSelectionShift() {
            r1 = this;
            float r0 = r1.mShift
            return r0
    }

    public float getSliceSpace() {
            r1 = this;
            float r0 = r1.mSliceSpace
            return r0
    }

    public int getValueLineColor() {
            r1 = this;
            int r0 = r1.mValueLineColor
            return r0
    }

    public float getValueLinePart1Length() {
            r1 = this;
            float r0 = r1.mValueLinePart1Length
            return r0
    }

    public float getValueLinePart1OffsetPercentage() {
            r1 = this;
            float r0 = r1.mValueLinePart1OffsetPercentage
            return r0
    }

    public float getValueLinePart2Length() {
            r1 = this;
            float r0 = r1.mValueLinePart2Length
            return r0
    }

    public float getValueLineWidth() {
            r1 = this;
            float r0 = r1.mValueLineWidth
            return r0
    }

    public com.github.mikephil.charting.data.PieDataSet.ValuePosition getXValuePosition() {
            r1 = this;
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r0 = r1.mXValuePosition
            return r0
    }

    public com.github.mikephil.charting.data.PieDataSet.ValuePosition getYValuePosition() {
            r1 = this;
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r0 = r1.mYValuePosition
            return r0
    }

    public boolean isAutomaticallyDisableSliceSpacingEnabled() {
            r1 = this;
            boolean r0 = r1.mAutomaticallyDisableSliceSpacing
            return r0
    }

    public boolean isUsingSliceColorAsValueLineColor() {
            r1 = this;
            boolean r0 = r1.mUsingSliceColorAsValueLineColor
            return r0
    }

    public boolean isValueLineVariableLength() {
            r1 = this;
            boolean r0 = r1.mValueLineVariableLength
            return r0
    }

    public void setAutomaticallyDisableSliceSpacing(boolean r1) {
            r0 = this;
            r0.mAutomaticallyDisableSliceSpacing = r1
            return
    }

    public void setSelectionShift(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mShift = r1
            return
    }

    public void setSliceSpace(float r3) {
            r2 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            r3 = 1101004800(0x41a00000, float:20.0)
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            r3 = 0
        Le:
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r2.mSliceSpace = r3
            return
    }

    public void setUsingSliceColorAsValueLineColor(boolean r1) {
            r0 = this;
            r0.mUsingSliceColorAsValueLineColor = r1
            return
    }

    public void setValueLineColor(int r1) {
            r0 = this;
            r0.mValueLineColor = r1
            return
    }

    public void setValueLinePart1Length(float r1) {
            r0 = this;
            r0.mValueLinePart1Length = r1
            return
    }

    public void setValueLinePart1OffsetPercentage(float r1) {
            r0 = this;
            r0.mValueLinePart1OffsetPercentage = r1
            return
    }

    public void setValueLinePart2Length(float r1) {
            r0 = this;
            r0.mValueLinePart2Length = r1
            return
    }

    public void setValueLineVariableLength(boolean r1) {
            r0 = this;
            r0.mValueLineVariableLength = r1
            return
    }

    public void setValueLineWidth(float r1) {
            r0 = this;
            r0.mValueLineWidth = r1
            return
    }

    public void setXValuePosition(com.github.mikephil.charting.data.PieDataSet.ValuePosition r1) {
            r0 = this;
            r0.mXValuePosition = r1
            return
    }

    public void setYValuePosition(com.github.mikephil.charting.data.PieDataSet.ValuePosition r1) {
            r0 = this;
            r0.mYValuePosition = r1
            return
    }
}
