package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IDataSet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class ChartData<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> {
    protected java.util.List<T> mDataSets;
    protected float mLeftAxisMax;
    protected float mLeftAxisMin;
    protected float mRightAxisMax;
    protected float mRightAxisMin;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public ChartData() {
            r2 = this;
            r2.<init>()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mYMax = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mYMin = r1
            r2.mXMax = r0
            r2.mXMin = r1
            r2.mLeftAxisMax = r0
            r2.mLeftAxisMin = r1
            r2.mRightAxisMax = r0
            r2.mRightAxisMin = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mDataSets = r0
            return
    }

    public ChartData(java.util.List<T> r3) {
            r2 = this;
            r2.<init>()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mYMax = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mYMin = r1
            r2.mXMax = r0
            r2.mXMin = r1
            r2.mLeftAxisMax = r0
            r2.mLeftAxisMin = r1
            r2.mRightAxisMax = r0
            r2.mRightAxisMin = r1
            r2.mDataSets = r3
            r2.notifyDataChanged()
            return
    }

    public ChartData(T... r3) {
            r2 = this;
            r2.<init>()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mYMax = r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mYMin = r1
            r2.mXMax = r0
            r2.mXMin = r1
            r2.mLeftAxisMax = r0
            r2.mLeftAxisMin = r1
            r2.mRightAxisMax = r0
            r2.mRightAxisMin = r1
            java.util.List r3 = r2.arrayToList(r3)
            r2.mDataSets = r3
            r2.notifyDataChanged()
            return
    }

    private java.util.List<T> arrayToList(T[] r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            return r0
    }

    public void addDataSet(T r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r1.calcMinMax(r2)
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            r0.add(r2)
            return
    }

    public void addEntry(com.github.mikephil.charting.data.Entry r2, int r3) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            int r0 = r0.size()
            if (r0 <= r3) goto L20
            if (r3 < 0) goto L20
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            java.lang.Object r3 = r0.get(r3)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r3
            boolean r0 = r3.addEntry(r2)
            if (r0 != 0) goto L19
            return
        L19:
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r3.getAxisDependency()
            r1.calcMinMax(r2, r3)
        L20:
            return
    }

    protected void calcMinMax() {
            r4 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            if (r0 != 0) goto L6
            goto Lce
        L6:
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4.mYMax = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.mYMin = r2
            r4.mXMax = r1
            r4.mXMin = r2
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r3
            r4.calcMinMax(r3)
            goto L18
        L28:
            r4.mLeftAxisMax = r1
            r4.mLeftAxisMin = r2
            r4.mRightAxisMax = r1
            r4.mRightAxisMin = r2
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r4.getFirstLeft(r0)
            if (r0 == 0) goto L7f
            float r1 = r0.getYMax()
            r4.mLeftAxisMax = r1
            float r0 = r0.getYMin()
            r4.mLeftAxisMin = r0
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r1.getAxisDependency()
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r2 != r3) goto L4a
            float r2 = r1.getYMin()
            float r3 = r4.mLeftAxisMin
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L6e
            float r2 = r1.getYMin()
            r4.mLeftAxisMin = r2
        L6e:
            float r2 = r1.getYMax()
            float r3 = r4.mLeftAxisMax
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L4a
            float r1 = r1.getYMax()
            r4.mLeftAxisMax = r1
            goto L4a
        L7f:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = r4.getFirstRight(r0)
            if (r0 == 0) goto Lce
            float r1 = r0.getYMax()
            r4.mRightAxisMax = r1
            float r0 = r0.getYMin()
            r4.mRightAxisMin = r0
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r4.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L99:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lce
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = r1.getAxisDependency()
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            if (r2 != r3) goto L99
            float r2 = r1.getYMin()
            float r3 = r4.mRightAxisMin
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lbd
            float r2 = r1.getYMin()
            r4.mRightAxisMin = r2
        Lbd:
            float r2 = r1.getYMax()
            float r3 = r4.mRightAxisMax
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L99
            float r1 = r1.getYMax()
            r4.mRightAxisMax = r1
            goto L99
        Lce:
            return
    }

    protected void calcMinMax(com.github.mikephil.charting.data.Entry r3, com.github.mikephil.charting.components.YAxis.AxisDependency r4) {
            r2 = this;
            float r0 = r2.mYMax
            float r1 = r3.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.getY()
            r2.mYMax = r0
        L10:
            float r0 = r2.mYMin
            float r1 = r3.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r0 = r3.getY()
            r2.mYMin = r0
        L20:
            float r0 = r2.mXMax
            float r1 = r3.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            float r0 = r3.getX()
            r2.mXMax = r0
        L30:
            float r0 = r2.mXMin
            float r1 = r3.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            float r0 = r3.getX()
            r2.mXMin = r0
        L40:
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r4 != r0) goto L65
            float r4 = r2.mLeftAxisMax
            float r0 = r3.getY()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L54
            float r4 = r3.getY()
            r2.mLeftAxisMax = r4
        L54:
            float r4 = r2.mLeftAxisMin
            float r0 = r3.getY()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L85
            float r3 = r3.getY()
            r2.mLeftAxisMin = r3
            return
        L65:
            float r4 = r2.mRightAxisMax
            float r0 = r3.getY()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L75
            float r4 = r3.getY()
            r2.mRightAxisMax = r4
        L75:
            float r4 = r2.mRightAxisMin
            float r0 = r3.getY()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L85
            float r3 = r3.getY()
            r2.mRightAxisMin = r3
        L85:
            return
    }

    protected void calcMinMax(T r3) {
            r2 = this;
            float r0 = r2.mYMax
            float r1 = r3.getYMax()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.getYMax()
            r2.mYMax = r0
        L10:
            float r0 = r2.mYMin
            float r1 = r3.getYMin()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r0 = r3.getYMin()
            r2.mYMin = r0
        L20:
            float r0 = r2.mXMax
            float r1 = r3.getXMax()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            float r0 = r3.getXMax()
            r2.mXMax = r0
        L30:
            float r0 = r2.mXMin
            float r1 = r3.getXMin()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            float r0 = r3.getXMin()
            r2.mXMin = r0
        L40:
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = r3.getAxisDependency()
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r0 != r1) goto L69
            float r0 = r2.mLeftAxisMax
            float r1 = r3.getYMax()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L58
            float r0 = r3.getYMax()
            r2.mLeftAxisMax = r0
        L58:
            float r0 = r2.mLeftAxisMin
            float r1 = r3.getYMin()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L89
            float r3 = r3.getYMin()
            r2.mLeftAxisMin = r3
            return
        L69:
            float r0 = r2.mRightAxisMax
            float r1 = r3.getYMax()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L79
            float r0 = r3.getYMax()
            r2.mRightAxisMax = r0
        L79:
            float r0 = r2.mRightAxisMin
            float r1 = r3.getYMin()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L89
            float r3 = r3.getYMin()
            r2.mRightAxisMin = r3
        L89:
            return
    }

    public void calcMinMaxY(float r3, float r4) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.calcMinMaxY(r3, r4)
            goto L6
        L16:
            r2.calcMinMax()
            return
    }

    public void clearValues() {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r1.notifyDataChanged()
            return
    }

    public boolean contains(T r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int[] getColors() {
            r5 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r5.mDataSets
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 0
            r1 = 0
            r2 = 0
        L9:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r5.mDataSets
            int r3 = r3.size()
            if (r1 >= r3) goto L25
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r5.mDataSets
            java.lang.Object r3 = r3.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r3
            java.util.List r3 = r3.getColors()
            int r3 = r3.size()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L9
        L25:
            int[] r1 = new int[r2]
            r2 = 0
        L28:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r5.mDataSets
            int r3 = r3.size()
            if (r0 >= r3) goto L58
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r5.mDataSets
            java.lang.Object r3 = r3.get(r0)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r3
            java.util.List r3 = r3.getColors()
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1[r2] = r4
            int r2 = r2 + 1
            goto L40
        L55:
            int r0 = r0 + 1
            goto L28
        L58:
            return r1
    }

    public T getDataSetByIndex(int r2) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            if (r0 == 0) goto L16
            if (r2 < 0) goto L16
            int r0 = r0.size()
            if (r2 < r0) goto Ld
            goto L16
        Ld:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            java.lang.Object r2 = r0.get(r2)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r2
            return r2
        L16:
            r2 = 0
            return r2
    }

    public T getDataSetByLabel(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            int r2 = r1.getDataSetIndexByLabel(r0, r2, r3)
            if (r2 < 0) goto L1a
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r1.mDataSets
            int r3 = r3.size()
            if (r2 < r3) goto L11
            goto L1a
        L11:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r1.mDataSets
            java.lang.Object r2 = r3.get(r2)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r2
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public int getDataSetCount() {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public T getDataSetForEntry(com.github.mikephil.charting.data.Entry r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = 0
        L6:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r7.mDataSets
            int r3 = r3.size()
            if (r2 >= r3) goto L36
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r3 = r7.mDataSets
            java.lang.Object r3 = r3.get(r2)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r3 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r3
            r4 = 0
        L17:
            int r5 = r3.getEntryCount()
            if (r4 >= r5) goto L33
            float r5 = r8.getX()
            float r6 = r8.getY()
            com.github.mikephil.charting.data.Entry r5 = r3.getEntryForXValue(r5, r6)
            boolean r5 = r8.equalTo(r5)
            if (r5 == 0) goto L30
            return r3
        L30:
            int r4 = r4 + 1
            goto L17
        L33:
            int r2 = r2 + 1
            goto L6
        L36:
            return r0
    }

    protected int getDataSetIndexByLabel(java.util.List<T> r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L1d
        L3:
            int r4 = r2.size()
            if (r0 >= r4) goto L37
            java.lang.Object r4 = r2.get(r0)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r4
            java.lang.String r4 = r4.getLabel()
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto L3
        L1d:
            int r4 = r2.size()
            if (r0 >= r4) goto L37
            java.lang.Object r4 = r2.get(r0)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r4
            java.lang.String r4 = r4.getLabel()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L34
            return r0
        L34:
            int r0 = r0 + 1
            goto L1d
        L37:
            r2 = -1
            return r2
    }

    public java.lang.String[] getDataSetLabels() {
            r3 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r3.mDataSets
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L9:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r3.mDataSets
            int r2 = r2.size()
            if (r1 >= r2) goto L22
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r2 = r3.mDataSets
            java.lang.Object r2 = r2.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r2
            java.lang.String r2 = r2.getLabel()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L22:
            return r0
    }

    public java.util.List<T> getDataSets() {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            return r0
    }

    public int getEntryCount() {
            r3 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r3.mDataSets
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r2
            int r2 = r2.getEntryCount()
            int r1 = r1 + r2
            goto L7
        L19:
            return r1
    }

    public com.github.mikephil.charting.data.Entry getEntryForHighlight(com.github.mikephil.charting.highlight.Highlight r3) {
            r2 = this;
            int r0 = r3.getDataSetIndex()
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r2.mDataSets
            int r1 = r1.size()
            if (r0 < r1) goto Le
            r3 = 0
            return r3
        Le:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            int r1 = r3.getDataSetIndex()
            java.lang.Object r0 = r0.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r0
            float r1 = r3.getX()
            float r3 = r3.getY()
            com.github.mikephil.charting.data.Entry r3 = r0.getEntryForXValue(r1, r3)
            return r3
    }

    protected T getFirstLeft(java.util.List<T> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r4.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r0
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r0.getAxisDependency()
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            if (r1 != r2) goto L4
            return r0
        L19:
            r4 = 0
            return r4
    }

    public T getFirstRight(java.util.List<T> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r4.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r0
            com.github.mikephil.charting.components.YAxis$AxisDependency r1 = r0.getAxisDependency()
            com.github.mikephil.charting.components.YAxis$AxisDependency r2 = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT
            if (r1 != r2) goto L4
            return r0
        L19:
            r4 = 0
            return r4
    }

    public int getIndexOfDataSet(T r2) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            int r2 = r0.indexOf(r2)
            return r2
    }

    public T getMaxEntryCountSet() {
            r5 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r5.mDataSets
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r5.mDataSets
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r0
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r5.mDataSets
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r2
            int r3 = r2.getEntryCount()
            int r4 = r0.getEntryCount()
            if (r3 <= r4) goto L1a
            r0 = r2
            goto L1a
        L32:
            return r0
        L33:
            r0 = 0
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

    public float getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency r3) {
            r2 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r3 != r0) goto L10
            float r3 = r2.mLeftAxisMax
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            float r3 = r2.mRightAxisMax
        Lf:
            return r3
        L10:
            float r3 = r2.mRightAxisMax
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r2.mLeftAxisMax
        L18:
            return r3
    }

    public float getYMin() {
            r1 = this;
            float r0 = r1.mYMin
            return r0
    }

    public float getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency r3) {
            r2 = this;
            com.github.mikephil.charting.components.YAxis$AxisDependency r0 = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r3 != r0) goto L10
            float r3 = r2.mLeftAxisMin
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            float r3 = r2.mRightAxisMin
        Lf:
            return r3
        L10:
            float r3 = r2.mRightAxisMin
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r2.mLeftAxisMin
        L18:
            return r3
    }

    public boolean isHighlightEnabled() {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            boolean r1 = r1.isHighlightEnabled()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    public void notifyDataChanged() {
            r0 = this;
            r0.calcMinMax()
            return
    }

    public boolean removeDataSet(int r2) {
            r1 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            int r0 = r0.size()
            if (r2 >= r0) goto L18
            if (r2 >= 0) goto Lb
            goto L18
        Lb:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            java.lang.Object r2 = r0.get(r2)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r2 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r2
            boolean r2 = r1.removeDataSet(r2)
            return r2
        L18:
            r2 = 0
            return r2
    }

    public boolean removeDataSet(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r1.mDataSets
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto Lf
            r1.calcMinMax()
        Lf:
            return r2
    }

    public boolean removeEntry(float r4, int r5) {
            r3 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r3.mDataSets
            int r0 = r0.size()
            r1 = 0
            if (r5 < r0) goto La
            return r1
        La:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r3.mDataSets
            java.lang.Object r0 = r0.get(r5)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r0 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r0
            r2 = 2143289344(0x7fc00000, float:NaN)
            com.github.mikephil.charting.data.Entry r4 = r0.getEntryForXValue(r4, r2)
            if (r4 != 0) goto L1b
            return r1
        L1b:
            boolean r4 = r3.removeEntry(r4, r5)
            return r4
    }

    public boolean removeEntry(com.github.mikephil.charting.data.Entry r3, int r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L20
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r2.mDataSets
            int r1 = r1.size()
            if (r4 < r1) goto Lc
            goto L20
        Lc:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r1 = r2.mDataSets
            java.lang.Object r4 = r1.get(r4)
            com.github.mikephil.charting.interfaces.datasets.IDataSet r4 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r4
            if (r4 == 0) goto L20
            boolean r3 = r4.removeEntry(r3)
            if (r3 == 0) goto L1f
            r2.calcMinMax()
        L1f:
            return r3
        L20:
            return r0
    }

    public void setDrawValues(boolean r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setDrawValues(r3)
            goto L6
        L16:
            return
    }

    public void setHighlightEnabled(boolean r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setHighlightEnabled(r3)
            goto L6
        L16:
            return
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L19
        L3:
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setValueFormatter(r3)
            goto L9
        L19:
            return
    }

    public void setValueTextColor(int r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setValueTextColor(r3)
            goto L6
        L16:
            return
    }

    public void setValueTextColors(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setValueTextColors(r3)
            goto L6
        L16:
            return
    }

    public void setValueTextSize(float r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setValueTextSize(r3)
            goto L6
        L16:
            return
    }

    public void setValueTypeface(android.graphics.Typeface r3) {
            r2 = this;
            java.util.List<T extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>> r0 = r2.mDataSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.interfaces.datasets.IDataSet r1 = (com.github.mikephil.charting.interfaces.datasets.IDataSet) r1
            r1.setValueTypeface(r3)
            goto L6
        L16:
            return
    }
}
