package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer;
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private final java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> mVariableDimensionsWidgets;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Measure {
        public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public boolean useCurrentDimensions;
        public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;

        public Measure() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum MeasureType extends java.lang.Enum<androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType> {
        private static final /* synthetic */ androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType[] $VALUES = null;

        static {
                r0 = 0
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$MeasureType[] r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType[r0]
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType.$VALUES = r0
                return
        }

        MeasureType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$MeasureType> r0 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$MeasureType r1 = (androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType) r1
                return r1
        }

        public static androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType[] values() {
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$MeasureType[] r0 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$MeasureType[] r0 = (androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.MeasureType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Measurer {
        void didMeasures();

        void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure r2);
    }

    public BasicMeasure(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mVariableDimensionsWidgets = r0
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            r1.constraintWidgetContainer = r2
            return
    }

    private boolean measure(androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r6, androidx.constraintlayout.solver.widgets.ConstraintWidget r7, boolean r8) {
            r5 = this;
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r7.getHorizontalDimensionBehaviour()
            r0.horizontalBehavior = r1
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r7.getVerticalDimensionBehaviour()
            r0.verticalBehavior = r1
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            int r1 = r7.getWidth()
            r0.horizontalDimension = r1
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            int r1 = r7.getHeight()
            r0.verticalDimension = r1
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            r1 = 0
            r0.measuredNeedsSolverPass = r1
            r0.useCurrentDimensions = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r0.horizontalBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r3 = 1
            if (r8 != r2) goto L30
            r8 = 1
            goto L31
        L30:
            r8 = 0
        L31:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r0.verticalBehavior
            if (r4 != r2) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            r4 = 0
            if (r8 == 0) goto L43
            float r8 = r7.mDimensionRatio
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 <= 0) goto L43
            r8 = 1
            goto L44
        L43:
            r8 = 0
        L44:
            if (r2 == 0) goto L4e
            float r2 = r7.mDimensionRatio
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r4 = 4
            if (r8 == 0) goto L5c
            int[] r8 = r7.mResolvedMatchConstraintDefault
            r8 = r8[r1]
            if (r8 != r4) goto L5c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.horizontalBehavior = r8
        L5c:
            if (r2 == 0) goto L68
            int[] r8 = r7.mResolvedMatchConstraintDefault
            r8 = r8[r3]
            if (r8 != r4) goto L68
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.verticalBehavior = r8
        L68:
            r6.measure(r7, r0)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r6 = r6.measuredWidth
            r7.setWidth(r6)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r6 = r6.measuredHeight
            r7.setHeight(r6)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            boolean r6 = r6.measuredHasBaseline
            r7.setHasBaseline(r6)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r6 = r6.measuredBaseline
            r7.setBaselineDistance(r6)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            r6.useCurrentDimensions = r1
            boolean r6 = r6.measuredNeedsSolverPass
            return r6
    }

    private void measureChildren(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10) {
            r9 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r10.mChildren
            int r0 = r0.size()
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r1 = r10.getMeasurer()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r0) goto L55
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r10.mChildren
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r5 = r4 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r5 == 0) goto L1b
            goto L52
        L1b:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r4.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 == 0) goto L2c
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r5 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 == 0) goto L2c
            goto L52
        L2c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r4.getDimensionBehaviour(r2)
            r6 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r4.getDimensionBehaviour(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r8) goto L44
            int r5 = r4.mMatchConstraintDefaultWidth
            if (r5 == r6) goto L44
            if (r7 != r8) goto L44
            int r5 = r4.mMatchConstraintDefaultHeight
            if (r5 == r6) goto L44
            goto L52
        L44:
            r9.measure(r1, r4, r2)
            androidx.constraintlayout.solver.Metrics r4 = r10.mMetrics
            if (r4 == 0) goto L52
            long r5 = r4.measuredWidgets
            r7 = 1
            long r5 = r5 + r7
            r4.measuredWidgets = r5
        L52:
            int r3 = r3 + 1
            goto Lc
        L55:
            r1.didMeasures()
            return
    }

    private void solveLinearSystem(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3, java.lang.String r4, int r5, int r6) {
            r2 = this;
            int r4 = r3.getMinWidth()
            int r0 = r3.getMinHeight()
            r1 = 0
            r3.setMinWidth(r1)
            r3.setMinHeight(r1)
            r3.setWidth(r5)
            r3.setHeight(r6)
            r3.setMinWidth(r4)
            r3.setMinHeight(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r2.constraintWidgetContainer
            r3.layout()
            return
    }

    public long solverMeasure(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r25
            r4 = r27
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r5 = r1.getMeasurer()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r6 = r1.mChildren
            int r6 = r6.size()
            int r7 = r1.getWidth()
            int r8 = r1.getHeight()
            r9 = 128(0x80, float:1.8E-43)
            boolean r9 = androidx.constraintlayout.solver.widgets.Optimizer.enabled(r2, r9)
            r10 = 0
            if (r9 != 0) goto L30
            r12 = 64
            boolean r2 = androidx.constraintlayout.solver.widgets.Optimizer.enabled(r2, r12)
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            if (r2 == 0) goto L8a
            r12 = 0
        L34:
            if (r12 >= r6) goto L8a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r13 = r1.mChildren
            java.lang.Object r13 = r13.get(r12)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r13
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r14 != r15) goto L48
            r14 = 1
            goto L49
        L48:
            r14 = 0
        L49:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r13.getVerticalDimensionBehaviour()
            if (r11 != r15) goto L51
            r11 = 1
            goto L52
        L51:
            r11 = 0
        L52:
            if (r14 == 0) goto L61
            if (r11 == 0) goto L61
            float r11 = r13.getDimensionRatio()
            r14 = 0
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L61
            r11 = 1
            goto L62
        L61:
            r11 = 0
        L62:
            boolean r14 = r13.isInHorizontalChain()
            if (r14 == 0) goto L6c
            if (r11 == 0) goto L6c
        L6a:
            r2 = 0
            goto L8a
        L6c:
            boolean r14 = r13.isInVerticalChain()
            if (r14 == 0) goto L75
            if (r11 == 0) goto L75
            goto L6a
        L75:
            boolean r11 = r13 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r11 == 0) goto L7a
            goto L6a
        L7a:
            boolean r11 = r13.isInHorizontalChain()
            if (r11 != 0) goto L6a
            boolean r11 = r13.isInVerticalChain()
            if (r11 == 0) goto L87
            goto L6a
        L87:
            int r12 = r12 + 1
            goto L34
        L8a:
            r11 = 1
            if (r2 == 0) goto L97
            androidx.constraintlayout.solver.Metrics r13 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r13 == 0) goto L97
            long r14 = r13.measures
            long r14 = r14 + r11
            r13.measures = r14
        L97:
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 != r13) goto L9d
            if (r4 == r13) goto L9f
        L9d:
            if (r9 == 0) goto La1
        L9f:
            r14 = 1
            goto La2
        La1:
            r14 = 0
        La2:
            r2 = r2 & r14
            r14 = 2
            if (r2 == 0) goto L114
            int r2 = r1.getMaxWidth()
            r15 = r26
            int r2 = java.lang.Math.min(r2, r15)
            int r15 = r1.getMaxHeight()
            r29 = r11
            r11 = r28
            int r11 = java.lang.Math.min(r15, r11)
            if (r3 != r13) goto Lca
            int r12 = r1.getWidth()
            if (r12 == r2) goto Lca
            r1.setWidth(r2)
            r1.invalidateGraph()
        Lca:
            if (r4 != r13) goto Ld8
            int r2 = r1.getHeight()
            if (r2 == r11) goto Ld8
            r1.setHeight(r11)
            r1.invalidateGraph()
        Ld8:
            if (r3 != r13) goto Le2
            if (r4 != r13) goto Le2
            boolean r2 = r1.directMeasure(r9)
            r9 = 2
            goto L104
        Le2:
            boolean r2 = r1.directMeasureSetup(r9)
            if (r3 != r13) goto Lf0
            boolean r11 = r1.directMeasureWithOrientation(r9, r10)
            r2 = r2 & r11
            r11 = r2
            r2 = 1
            goto Lf2
        Lf0:
            r11 = r2
            r2 = 0
        Lf2:
            if (r4 != r13) goto L102
            r12 = 1
            boolean r9 = r1.directMeasureWithOrientation(r9, r12)
            r9 = r9 & r11
            int r2 = r2 + 1
            r19 = r9
            r9 = r2
            r2 = r19
            goto L104
        L102:
            r9 = r2
            r2 = r11
        L104:
            if (r2 == 0) goto L118
            if (r3 != r13) goto L10a
            r3 = 1
            goto L10b
        L10a:
            r3 = 0
        L10b:
            if (r4 != r13) goto L10f
            r4 = 1
            goto L110
        L10f:
            r4 = 0
        L110:
            r1.updateFromRuns(r3, r4)
            goto L118
        L114:
            r29 = r11
            r2 = 0
            r9 = 0
        L118:
            r3 = 0
            if (r2 == 0) goto L120
            if (r9 == r14) goto L11f
            goto L120
        L11f:
            return r3
        L120:
            if (r6 <= 0) goto L125
            r20.measureChildren(r21)
        L125:
            int r2 = r1.getOptimizationLevel()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r9 = r0.mVariableDimensionsWidgets
            int r9 = r9.size()
            if (r6 <= 0) goto L136
            java.lang.String r6 = "First pass"
            r0.solveLinearSystem(r1, r6, r7, r8)
        L136:
            if (r9 <= 0) goto L305
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r1.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r11) goto L142
            r12 = 1
            goto L143
        L142:
            r12 = 0
        L143:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r1.getVerticalDimensionBehaviour()
            if (r6 != r11) goto L14b
            r6 = 1
            goto L14c
        L14b:
            r6 = 0
        L14c:
            int r11 = r1.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.constraintWidgetContainer
            int r13 = r13.getMinWidth()
            int r11 = java.lang.Math.max(r11, r13)
            int r13 = r1.getHeight()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r15 = r0.constraintWidgetContainer
            int r15 = r15.getMinHeight()
            int r13 = java.lang.Math.max(r13, r15)
            r15 = 0
            r16 = 0
        L16b:
            if (r15 >= r9) goto L1ff
            r24 = r3
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r0.mVariableDimensionsWidgets
            java.lang.Object r3 = r3.get(r15)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r4 != 0) goto L181
            r26 = r6
            r17 = r15
            goto L1f5
        L181:
            int r4 = r3.getWidth()
            int r10 = r3.getHeight()
            r14 = 1
            boolean r17 = r0.measure(r5, r3, r14)
            r14 = r16 | r17
            r26 = r6
            androidx.constraintlayout.solver.Metrics r6 = r1.mMetrics
            r27 = r14
            r17 = r15
            if (r6 == 0) goto L1a0
            long r14 = r6.measuredMatchWidgets
            long r14 = r14 + r29
            r6.measuredMatchWidgets = r14
        L1a0:
            int r6 = r3.getWidth()
            int r14 = r3.getHeight()
            if (r6 == r4) goto L1ca
            r3.setWidth(r6)
            if (r12 == 0) goto L1c8
            int r4 = r3.getRight()
            if (r4 <= r11) goto L1c8
            int r4 = r3.getRight()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            int r6 = r6.getMargin()
            int r4 = r4 + r6
            int r11 = java.lang.Math.max(r11, r4)
        L1c8:
            r4 = 1
            goto L1cc
        L1ca:
            r4 = r27
        L1cc:
            if (r14 == r10) goto L1ed
            r3.setHeight(r14)
            if (r26 == 0) goto L1ec
            int r4 = r3.getBottom()
            if (r4 <= r13) goto L1ec
            int r4 = r3.getBottom()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.getAnchor(r6)
            int r6 = r6.getMargin()
            int r4 = r4 + r6
            int r13 = java.lang.Math.max(r13, r4)
        L1ec:
            r4 = 1
        L1ed:
            androidx.constraintlayout.solver.widgets.VirtualLayout r3 = (androidx.constraintlayout.solver.widgets.VirtualLayout) r3
            boolean r3 = r3.needSolverPass()
            r16 = r4 | r3
        L1f5:
            int r15 = r17 + 1
            r3 = r24
            r6 = r26
            r10 = 0
            r14 = 2
            goto L16b
        L1ff:
            r24 = r3
            r26 = r6
            r3 = 0
        L204:
            r4 = 2
            if (r3 >= r4) goto L2de
            r6 = 0
        L208:
            if (r6 >= r9) goto L2cb
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r10 = r0.mVariableDimensionsWidgets
            java.lang.Object r10 = r10.get(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r10
            boolean r14 = r10 instanceof androidx.constraintlayout.solver.widgets.Helper
            if (r14 == 0) goto L21a
            boolean r14 = r10 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r14 == 0) goto L23d
        L21a:
            boolean r14 = r10 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r14 == 0) goto L21f
            goto L23d
        L21f:
            int r14 = r10.getVisibility()
            r15 = 8
            if (r14 != r15) goto L228
            goto L23d
        L228:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r14 = r10.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r14 = r14.dimension
            boolean r14 = r14.resolved
            if (r14 == 0) goto L239
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r14 = r10.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r14 = r14.dimension
            boolean r14 = r14.resolved
            if (r14 == 0) goto L239
            goto L23d
        L239:
            boolean r14 = r10 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
            if (r14 == 0) goto L245
        L23d:
            r17 = r3
            r18 = r5
            r27 = r6
            goto L2c2
        L245:
            int r14 = r10.getWidth()
            int r15 = r10.getHeight()
            int r4 = r10.getBaselineDistance()
            r17 = r3
            r3 = 1
            boolean r18 = r0.measure(r5, r10, r3)
            r16 = r16 | r18
            androidx.constraintlayout.solver.Metrics r3 = r1.mMetrics
            r18 = r5
            r27 = r6
            if (r3 == 0) goto L268
            long r5 = r3.measuredMatchWidgets
            long r5 = r5 + r29
            r3.measuredMatchWidgets = r5
        L268:
            int r3 = r10.getWidth()
            int r5 = r10.getHeight()
            if (r3 == r14) goto L292
            r10.setWidth(r3)
            if (r12 == 0) goto L290
            int r3 = r10.getRight()
            if (r3 <= r11) goto L290
            int r3 = r10.getRight()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r10.getAnchor(r6)
            int r6 = r6.getMargin()
            int r3 = r3 + r6
            int r11 = java.lang.Math.max(r11, r3)
        L290:
            r16 = 1
        L292:
            if (r5 == r15) goto L2b4
            r10.setHeight(r5)
            if (r26 == 0) goto L2b2
            int r3 = r10.getBottom()
            if (r3 <= r13) goto L2b2
            int r3 = r10.getBottom()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r10.getAnchor(r5)
            int r5 = r5.getMargin()
            int r3 = r3 + r5
            int r13 = java.lang.Math.max(r13, r3)
        L2b2:
            r16 = 1
        L2b4:
            boolean r3 = r10.hasBaseline()
            if (r3 == 0) goto L2c2
            int r3 = r10.getBaselineDistance()
            if (r4 == r3) goto L2c2
            r16 = 1
        L2c2:
            int r6 = r27 + 1
            r3 = r17
            r5 = r18
            r4 = 2
            goto L208
        L2cb:
            r17 = r3
            r18 = r5
            if (r16 == 0) goto L2d8
            java.lang.String r3 = "intermediate pass"
            r0.solveLinearSystem(r1, r3, r7, r8)
            r16 = 0
        L2d8:
            int r3 = r17 + 1
            r5 = r18
            goto L204
        L2de:
            if (r16 == 0) goto L307
            java.lang.String r3 = "2nd pass"
            r0.solveLinearSystem(r1, r3, r7, r8)
            int r3 = r1.getWidth()
            if (r3 >= r11) goto L2f0
            r1.setWidth(r11)
            r10 = 1
            goto L2f1
        L2f0:
            r10 = 0
        L2f1:
            int r3 = r1.getHeight()
            if (r3 >= r13) goto L2fc
            r1.setHeight(r13)
            r11 = 1
            goto L2fd
        L2fc:
            r11 = r10
        L2fd:
            if (r11 == 0) goto L307
            java.lang.String r3 = "3rd pass"
            r0.solveLinearSystem(r1, r3, r7, r8)
            goto L307
        L305:
            r24 = r3
        L307:
            r1.setOptimizationLevel(r2)
            return r24
    }

    public void updateHierarchy(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7) {
            r6 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r6.mVariableDimensionsWidgets
            r0.clear()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r7.mChildren
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r7.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r3 == r5) goto L32
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getVerticalDimensionBehaviour()
            if (r3 == r4) goto L32
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getVerticalDimensionBehaviour()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r6.mVariableDimensionsWidgets
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.invalidateGraph()
            return
    }
}
