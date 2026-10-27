package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class DataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.BaseDataSet<T> {
    protected java.util.List<T> mValues;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Rounding extends java.lang.Enum<com.github.mikephil.charting.data.DataSet.Rounding> {
        private static final /* synthetic */ com.github.mikephil.charting.data.DataSet.Rounding[] $VALUES = null;
        public static final com.github.mikephil.charting.data.DataSet.Rounding CLOSEST = null;
        public static final com.github.mikephil.charting.data.DataSet.Rounding DOWN = null;
        public static final com.github.mikephil.charting.data.DataSet.Rounding UP = null;

        static {
                com.github.mikephil.charting.data.DataSet$Rounding r0 = new com.github.mikephil.charting.data.DataSet$Rounding
                java.lang.String r1 = "UP"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.data.DataSet.Rounding.UP = r0
                com.github.mikephil.charting.data.DataSet$Rounding r1 = new com.github.mikephil.charting.data.DataSet$Rounding
                java.lang.String r3 = "DOWN"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.data.DataSet.Rounding.DOWN = r1
                com.github.mikephil.charting.data.DataSet$Rounding r3 = new com.github.mikephil.charting.data.DataSet$Rounding
                java.lang.String r5 = "CLOSEST"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST = r3
                r5 = 3
                com.github.mikephil.charting.data.DataSet$Rounding[] r5 = new com.github.mikephil.charting.data.DataSet.Rounding[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.github.mikephil.charting.data.DataSet.Rounding.$VALUES = r5
                return
        }

        Rounding(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.data.DataSet.Rounding valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.data.DataSet$Rounding> r0 = com.github.mikephil.charting.data.DataSet.Rounding.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.data.DataSet$Rounding r1 = (com.github.mikephil.charting.data.DataSet.Rounding) r1
                return r1
        }

        public static com.github.mikephil.charting.data.DataSet.Rounding[] values() {
                com.github.mikephil.charting.data.DataSet$Rounding[] r0 = com.github.mikephil.charting.data.DataSet.Rounding.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.data.DataSet$Rounding[] r0 = (com.github.mikephil.charting.data.DataSet.Rounding[]) r0
                return r0
        }
    }

    public DataSet(java.util.List<T> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r3)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1.mYMax = r3
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.mYMin = r0
            r1.mXMax = r3
            r1.mXMin = r0
            r1.mValues = r2
            if (r2 != 0) goto L1c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mValues = r2
        L1c:
            r1.calcMinMax()
            return
    }

    public boolean addEntry(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.List r0 = r1.getValues()
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            r1.calcMinMax(r2)
            boolean r2 = r0.add(r2)
            return r2
    }

    public void addEntryOrdered(T r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r3.mValues
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mValues = r0
        Le:
            r3.calcMinMax(r4)
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r3.mValues
            int r0 = r0.size()
            if (r0 <= 0) goto L47
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r3.mValues
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.github.mikephil.charting.data.Entry r0 = (com.github.mikephil.charting.data.Entry) r0
            float r0 = r0.getX()
            float r1 = r4.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L47
            float r0 = r4.getX()
            float r1 = r4.getY()
            com.github.mikephil.charting.data.DataSet$Rounding r2 = com.github.mikephil.charting.data.DataSet.Rounding.UP
            int r0 = r3.getEntryIndex(r0, r1, r2)
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r1 = r3.mValues
            r1.add(r0, r4)
            return
        L47:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r3.mValues
            r0.add(r4)
            return
    }

    public void calcMinMax() {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r2.mValues
            if (r0 == 0) goto L2f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L2f
        Lb:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mYMax = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mYMin = r1
            r2.mXMax = r0
            r2.mXMin = r1
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r2.mValues
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            r2.calcMinMax(r1)
            goto L1f
        L2f:
            return
    }

    protected void calcMinMax(T r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.calcMinMaxX(r1)
            r0.calcMinMaxY(r1)
            return
    }

    protected void calcMinMaxX(T r3) {
            r2 = this;
            float r0 = r3.getX()
            float r1 = r2.mXMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.getX()
            r2.mXMin = r0
        L10:
            float r0 = r3.getX()
            float r1 = r2.mXMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r3 = r3.getX()
            r2.mXMax = r3
        L20:
            return
    }

    public void calcMinMaxY(float r3, float r4) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r2.mValues
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mYMax = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mYMin = r0
            com.github.mikephil.charting.data.DataSet$Rounding r0 = com.github.mikephil.charting.data.DataSet.Rounding.DOWN
            r1 = 2143289344(0x7fc00000, float:NaN)
            int r3 = r2.getEntryIndex(r3, r1, r0)
            com.github.mikephil.charting.data.DataSet$Rounding r0 = com.github.mikephil.charting.data.DataSet.Rounding.UP
            int r4 = r2.getEntryIndex(r4, r1, r0)
        L23:
            if (r3 > r4) goto L33
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r2.mValues
            java.lang.Object r0 = r0.get(r3)
            com.github.mikephil.charting.data.Entry r0 = (com.github.mikephil.charting.data.Entry) r0
            r2.calcMinMaxY(r0)
            int r3 = r3 + 1
            goto L23
        L33:
            return
    }

    protected void calcMinMaxY(T r3) {
            r2 = this;
            float r0 = r3.getY()
            float r1 = r2.mYMin
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.getY()
            r2.mYMin = r0
        L10:
            float r0 = r3.getY()
            float r1 = r2.mYMax
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r3 = r3.getY()
            r2.mYMax = r3
        L20:
            return
    }

    public void clear() {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r1.mValues
            r0.clear()
            r1.notifyDataSetChanged()
            return
    }

    public abstract com.github.mikephil.charting.data.DataSet<T> copy();

    protected void copy(com.github.mikephil.charting.data.DataSet r1) {
            r0 = this;
            super.copy(r1)
            return
    }

    public java.util.List<T> getEntriesForXValue(float r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r1 = r6.mValues
            int r1 = r1.size()
            int r1 = r1 + (-1)
            r2 = 0
        Le:
            if (r2 > r1) goto L69
            int r3 = r1 + r2
            int r3 = r3 / 2
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r4 = r6.mValues
            java.lang.Object r4 = r4.get(r3)
            com.github.mikephil.charting.data.Entry r4 = (com.github.mikephil.charting.data.Entry) r4
            float r5 = r4.getX()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L59
        L24:
            if (r3 <= 0) goto L3b
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r1 = r6.mValues
            int r2 = r3 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            float r1 = r1.getX()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L3b
            int r3 = r3 + (-1)
            goto L24
        L3b:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r1 = r6.mValues
            int r1 = r1.size()
        L41:
            if (r3 >= r1) goto L69
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r6.mValues
            java.lang.Object r2 = r2.get(r3)
            com.github.mikephil.charting.data.Entry r2 = (com.github.mikephil.charting.data.Entry) r2
            float r4 = r2.getX()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L69
            r0.add(r2)
            int r3 = r3 + 1
            goto L41
        L59:
            float r4 = r4.getX()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L65
            int r3 = r3 + 1
            r2 = r3
            goto Le
        L65:
            int r3 = r3 + (-1)
            r1 = r3
            goto Le
        L69:
            return r0
    }

    public int getEntryCount() {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r1.mValues
            int r0 = r0.size()
            return r0
    }

    public T getEntryForIndex(int r2) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            com.github.mikephil.charting.data.Entry r2 = (com.github.mikephil.charting.data.Entry) r2
            return r2
    }

    public T getEntryForXValue(float r2, float r3) {
            r1 = this;
            com.github.mikephil.charting.data.DataSet$Rounding r0 = com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST
            com.github.mikephil.charting.data.Entry r2 = r1.getEntryForXValue(r2, r3, r0)
            return r2
    }

    public T getEntryForXValue(float r1, float r2, com.github.mikephil.charting.data.DataSet.Rounding r3) {
            r0 = this;
            int r1 = r0.getEntryIndex(r1, r2, r3)
            r2 = -1
            if (r1 <= r2) goto L10
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r0.mValues
            java.lang.Object r1 = r2.get(r1)
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public int getEntryIndex(float r11, float r12, com.github.mikephil.charting.data.DataSet.Rounding r13) {
            r10 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r10.mValues
            r1 = -1
            if (r0 == 0) goto Le4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Le4
        Ld:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r10.mValues
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r2 = 0
        L16:
            if (r2 >= r0) goto L59
            int r3 = r2 + r0
            int r3 = r3 / 2
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r4 = r10.mValues
            java.lang.Object r4 = r4.get(r3)
            com.github.mikephil.charting.data.Entry r4 = (com.github.mikephil.charting.data.Entry) r4
            float r4 = r4.getX()
            float r4 = r4 - r11
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r5 = r10.mValues
            int r6 = r3 + 1
            java.lang.Object r5 = r5.get(r6)
            com.github.mikephil.charting.data.Entry r5 = (com.github.mikephil.charting.data.Entry) r5
            float r5 = r5.getX()
            float r5 = r5 - r11
            float r7 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 >= 0) goto L46
        L44:
            r2 = r6
            goto L16
        L46:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4b
            goto L52
        L4b:
            double r4 = (double) r4
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L54
        L52:
            r0 = r3
            goto L16
        L54:
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 >= 0) goto L16
            goto L44
        L59:
            if (r0 == r1) goto Le3
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r1 = r10.mValues
            java.lang.Object r1 = r1.get(r0)
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            float r1 = r1.getX()
            com.github.mikephil.charting.data.DataSet$Rounding r2 = com.github.mikephil.charting.data.DataSet.Rounding.UP
            if (r13 != r2) goto L7c
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 >= 0) goto L88
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r11 = r10.mValues
            int r11 = r11.size()
            int r11 = r11 + (-1)
            if (r0 >= r11) goto L88
            int r0 = r0 + 1
            goto L88
        L7c:
            com.github.mikephil.charting.data.DataSet$Rounding r2 = com.github.mikephil.charting.data.DataSet.Rounding.DOWN
            if (r13 != r2) goto L88
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L88
            if (r0 <= 0) goto L88
            int r0 = r0 + (-1)
        L88:
            boolean r11 = java.lang.Float.isNaN(r12)
            if (r11 != 0) goto Le3
        L8e:
            if (r0 <= 0) goto La5
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r11 = r10.mValues
            int r13 = r0 + (-1)
            java.lang.Object r11 = r11.get(r13)
            com.github.mikephil.charting.data.Entry r11 = (com.github.mikephil.charting.data.Entry) r11
            float r11 = r11.getX()
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto La5
            int r0 = r0 + (-1)
            goto L8e
        La5:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r11 = r10.mValues
            java.lang.Object r11 = r11.get(r0)
            com.github.mikephil.charting.data.Entry r11 = (com.github.mikephil.charting.data.Entry) r11
            float r11 = r11.getY()
        Lb1:
            r13 = r0
        Lb2:
            int r0 = r0 + 1
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r10.mValues
            int r2 = r2.size()
            if (r0 < r2) goto Lbd
            goto Lcd
        Lbd:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r10.mValues
            java.lang.Object r2 = r2.get(r0)
            com.github.mikephil.charting.data.Entry r2 = (com.github.mikephil.charting.data.Entry) r2
            float r3 = r2.getX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto Lce
        Lcd:
            return r13
        Lce:
            float r2 = r2.getY()
            float r2 = r2 - r12
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11 - r12
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb2
            r11 = r12
            goto Lb1
        Le3:
            return r0
        Le4:
            return r1
    }

    public int getEntryIndex(com.github.mikephil.charting.data.Entry r2) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r1.mValues
            int r2 = r0.indexOf(r2)
            return r2
    }

    public java.util.List<T> getValues() {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r0 = r1.mValues
            return r0
    }

    public float getXMax() {
            r1 = this;
            float r0 = r1.mXMax
            return r0
    }

    public float getXMin() {
            r1 = this;
            float r0 = r1.mXMin
            return r0
    }

    public float getYMax() {
            r1 = this;
            float r0 = r1.mYMax
            return r0
    }

    public float getYMin() {
            r1 = this;
            float r0 = r1.mYMin
            return r0
    }

    public boolean removeEntry(T r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r1 = r2.mValues
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r3 = r1.remove(r3)
            if (r3 == 0) goto L12
            r2.calcMinMax()
        L12:
            return r3
    }

    public void setValues(java.util.List<T> r1) {
            r0 = this;
            r0.mValues = r1
            r0.notifyDataSetChanged()
            return
    }

    public java.lang.String toSimpleString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DataSet, label: "
            r1.append(r2)
            java.lang.String r2 = r3.getLabel()
            if (r2 != 0) goto L18
            java.lang.String r2 = ""
            goto L1c
        L18:
            java.lang.String r2 = r3.getLabel()
        L1c:
            r1.append(r2)
            java.lang.String r2 = ", entries: "
            r1.append(r2)
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r3.mValues
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r4.toSimpleString()
            r0.append(r1)
            r1 = 0
        Ld:
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r2 = r4.mValues
            int r2 = r2.size()
            if (r1 >= r2) goto L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.List<T extends com.github.mikephil.charting.data.Entry> r3 = r4.mValues
            java.lang.Object r3 = r3.get(r1)
            com.github.mikephil.charting.data.Entry r3 = (com.github.mikephil.charting.data.Entry) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
