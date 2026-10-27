package com.github.mikephil.charting.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ScatterDataSet extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.IScatterDataSet {
    private int mScatterShapeHoleColor;
    private float mScatterShapeHoleRadius;
    protected com.github.mikephil.charting.renderer.scatter.IShapeRenderer mShapeRenderer;
    private float mShapeSize;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.data.ScatterDataSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape = null;

        static {
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] r0 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape = r0
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape     // Catch: java.lang.NoSuchFieldError -> L28
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape     // Catch: java.lang.NoSuchFieldError -> L33
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape     // Catch: java.lang.NoSuchFieldError -> L3e
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape     // Catch: java.lang.NoSuchFieldError -> L49
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_UP     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape     // Catch: java.lang.NoSuchFieldError -> L54
                com.github.mikephil.charting.charts.ScatterChart$ScatterShape r1 = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_DOWN     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public ScatterDataSet(java.util.List<com.github.mikephil.charting.data.Entry> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1097859072(0x41700000, float:15.0)
            r0.mShapeSize = r1
            com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer
            r1.<init>()
            r0.mShapeRenderer = r1
            r1 = 0
            r0.mScatterShapeHoleRadius = r1
            r1 = 1122867(0x112233, float:1.573472E-39)
            r0.mScatterShapeHoleColor = r1
            return
    }

    public static com.github.mikephil.charting.renderer.scatter.IShapeRenderer getRendererForShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape r1) {
            int[] r0 = com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L31;
                case 2: goto L2b;
                case 3: goto L25;
                case 4: goto L1f;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = 0
            return r1
        Ld:
            com.github.mikephil.charting.renderer.scatter.ChevronDownShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.ChevronDownShapeRenderer
            r1.<init>()
            return r1
        L13:
            com.github.mikephil.charting.renderer.scatter.ChevronUpShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.ChevronUpShapeRenderer
            r1.<init>()
            return r1
        L19:
            com.github.mikephil.charting.renderer.scatter.XShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.XShapeRenderer
            r1.<init>()
            return r1
        L1f:
            com.github.mikephil.charting.renderer.scatter.CrossShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.CrossShapeRenderer
            r1.<init>()
            return r1
        L25:
            com.github.mikephil.charting.renderer.scatter.TriangleShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.TriangleShapeRenderer
            r1.<init>()
            return r1
        L2b:
            com.github.mikephil.charting.renderer.scatter.CircleShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.CircleShapeRenderer
            r1.<init>()
            return r1
        L31:
            com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer r1 = new com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer
            r1.<init>()
            return r1
    }

    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.Entry> copy() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.util.List r2 = r3.mValues
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List r2 = r3.mValues
            java.lang.Object r2 = r2.get(r1)
            com.github.mikephil.charting.data.Entry r2 = (com.github.mikephil.charting.data.Entry) r2
            com.github.mikephil.charting.data.Entry r2 = r2.copy()
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L20:
            com.github.mikephil.charting.data.ScatterDataSet r1 = new com.github.mikephil.charting.data.ScatterDataSet
            java.lang.String r2 = r3.getLabel()
            r1.<init>(r0, r2)
            r3.copy(r1)
            return r1
    }

    protected void copy(com.github.mikephil.charting.data.ScatterDataSet r2) {
            r1 = this;
            super.copy(r2)
            float r0 = r1.mShapeSize
            r2.mShapeSize = r0
            com.github.mikephil.charting.renderer.scatter.IShapeRenderer r0 = r1.mShapeRenderer
            r2.mShapeRenderer = r0
            float r0 = r1.mScatterShapeHoleRadius
            r2.mScatterShapeHoleRadius = r0
            int r0 = r1.mScatterShapeHoleColor
            r2.mScatterShapeHoleColor = r0
            return
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public int getScatterShapeHoleColor() {
            r1 = this;
            int r0 = r1.mScatterShapeHoleColor
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public float getScatterShapeHoleRadius() {
            r1 = this;
            float r0 = r1.mScatterShapeHoleRadius
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public float getScatterShapeSize() {
            r1 = this;
            float r0 = r1.mShapeSize
            return r0
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public com.github.mikephil.charting.renderer.scatter.IShapeRenderer getShapeRenderer() {
            r1 = this;
            com.github.mikephil.charting.renderer.scatter.IShapeRenderer r0 = r1.mShapeRenderer
            return r0
    }

    public void setScatterShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape r1) {
            r0 = this;
            com.github.mikephil.charting.renderer.scatter.IShapeRenderer r1 = getRendererForShape(r1)
            r0.mShapeRenderer = r1
            return
    }

    public void setScatterShapeHoleColor(int r1) {
            r0 = this;
            r0.mScatterShapeHoleColor = r1
            return
    }

    public void setScatterShapeHoleRadius(float r1) {
            r0 = this;
            r0.mScatterShapeHoleRadius = r1
            return
    }

    public void setScatterShapeSize(float r1) {
            r0 = this;
            r0.mShapeSize = r1
            return
    }

    public void setShapeRenderer(com.github.mikephil.charting.renderer.scatter.IShapeRenderer r1) {
            r0 = this;
            r0.mShapeRenderer = r1
            return
    }
}
