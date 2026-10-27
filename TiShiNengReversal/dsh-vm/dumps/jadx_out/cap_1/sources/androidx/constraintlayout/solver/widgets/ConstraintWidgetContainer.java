package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ConstraintWidgetContainer extends androidx.constraintlayout.solver.widgets.WidgetContainer {
    private static final boolean DEBUG = false;
    static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure mBasicMeasureSolver;
    int mDebugSolverPassCount;
    public androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    androidx.constraintlayout.solver.widgets.ChainHead[] mHorizontalChainsArray;
    int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    protected androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    public androidx.constraintlayout.solver.Metrics mMetrics;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    public boolean mSkipSolver;
    protected androidx.constraintlayout.solver.LinearSystem mSystem;
    androidx.constraintlayout.solver.widgets.ChainHead[] mVerticalChainsArray;
    int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    public ConstraintWidgetContainer() {
            r3 = this;
            r3.<init>()
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure
            r0.<init>(r3)
            r3.mBasicMeasureSolver = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = new androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph
            r0.<init>(r3)
            r3.mDependencyGraph = r0
            r0 = 0
            r3.mMeasurer = r0
            r0 = 0
            r3.mIsRtl = r0
            androidx.constraintlayout.solver.LinearSystem r1 = new androidx.constraintlayout.solver.LinearSystem
            r1.<init>()
            r3.mSystem = r1
            r3.mHorizontalChainsSize = r0
            r3.mVerticalChainsSize = r0
            r1 = 4
            androidx.constraintlayout.solver.widgets.ChainHead[] r2 = new androidx.constraintlayout.solver.widgets.ChainHead[r1]
            r3.mVerticalChainsArray = r2
            androidx.constraintlayout.solver.widgets.ChainHead[] r1 = new androidx.constraintlayout.solver.widgets.ChainHead[r1]
            r3.mHorizontalChainsArray = r1
            r3.mGroupsWrapOptimized = r0
            r3.mHorizontalWrapOptimized = r0
            r3.mVerticalWrapOptimized = r0
            r3.mWrapFixedWidth = r0
            r3.mWrapFixedHeight = r0
            r1 = 263(0x107, float:3.69E-43)
            r3.mOptimizationLevel = r1
            r3.mSkipSolver = r0
            r3.mWidthMeasuredTooSmall = r0
            r3.mHeightMeasuredTooSmall = r0
            r3.mDebugSolverPassCount = r0
            return
    }

    public ConstraintWidgetContainer(int r2, int r3) {
            r1 = this;
            r1.<init>(r2, r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure r2 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure
            r2.<init>(r1)
            r1.mBasicMeasureSolver = r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r2 = new androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph
            r2.<init>(r1)
            r1.mDependencyGraph = r2
            r2 = 0
            r1.mMeasurer = r2
            r2 = 0
            r1.mIsRtl = r2
            androidx.constraintlayout.solver.LinearSystem r3 = new androidx.constraintlayout.solver.LinearSystem
            r3.<init>()
            r1.mSystem = r3
            r1.mHorizontalChainsSize = r2
            r1.mVerticalChainsSize = r2
            r3 = 4
            androidx.constraintlayout.solver.widgets.ChainHead[] r0 = new androidx.constraintlayout.solver.widgets.ChainHead[r3]
            r1.mVerticalChainsArray = r0
            androidx.constraintlayout.solver.widgets.ChainHead[] r3 = new androidx.constraintlayout.solver.widgets.ChainHead[r3]
            r1.mHorizontalChainsArray = r3
            r1.mGroupsWrapOptimized = r2
            r1.mHorizontalWrapOptimized = r2
            r1.mVerticalWrapOptimized = r2
            r1.mWrapFixedWidth = r2
            r1.mWrapFixedHeight = r2
            r3 = 263(0x107, float:3.69E-43)
            r1.mOptimizationLevel = r3
            r1.mSkipSolver = r2
            r1.mWidthMeasuredTooSmall = r2
            r1.mHeightMeasuredTooSmall = r2
            r1.mDebugSolverPassCount = r2
            return
    }

    public ConstraintWidgetContainer(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure r1 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure
            r1.<init>(r0)
            r0.mBasicMeasureSolver = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r1 = new androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph
            r1.<init>(r0)
            r0.mDependencyGraph = r1
            r1 = 0
            r0.mMeasurer = r1
            r1 = 0
            r0.mIsRtl = r1
            androidx.constraintlayout.solver.LinearSystem r2 = new androidx.constraintlayout.solver.LinearSystem
            r2.<init>()
            r0.mSystem = r2
            r0.mHorizontalChainsSize = r1
            r0.mVerticalChainsSize = r1
            r2 = 4
            androidx.constraintlayout.solver.widgets.ChainHead[] r3 = new androidx.constraintlayout.solver.widgets.ChainHead[r2]
            r0.mVerticalChainsArray = r3
            androidx.constraintlayout.solver.widgets.ChainHead[] r2 = new androidx.constraintlayout.solver.widgets.ChainHead[r2]
            r0.mHorizontalChainsArray = r2
            r0.mGroupsWrapOptimized = r1
            r0.mHorizontalWrapOptimized = r1
            r0.mVerticalWrapOptimized = r1
            r0.mWrapFixedWidth = r1
            r0.mWrapFixedHeight = r1
            r2 = 263(0x107, float:3.69E-43)
            r0.mOptimizationLevel = r2
            r0.mSkipSolver = r1
            r0.mWidthMeasuredTooSmall = r1
            r0.mHeightMeasuredTooSmall = r1
            r0.mDebugSolverPassCount = r1
            return
    }

    private void addHorizontalChain(androidx.constraintlayout.solver.widgets.ConstraintWidget r6) {
            r5 = this;
            int r0 = r5.mHorizontalChainsSize
            int r0 = r0 + 1
            androidx.constraintlayout.solver.widgets.ChainHead[] r1 = r5.mHorizontalChainsArray
            int r2 = r1.length
            if (r0 < r2) goto L14
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.solver.widgets.ChainHead[] r0 = (androidx.constraintlayout.solver.widgets.ChainHead[]) r0
            r5.mHorizontalChainsArray = r0
        L14:
            androidx.constraintlayout.solver.widgets.ChainHead[] r0 = r5.mHorizontalChainsArray
            int r1 = r5.mHorizontalChainsSize
            androidx.constraintlayout.solver.widgets.ChainHead r2 = new androidx.constraintlayout.solver.widgets.ChainHead
            r3 = 0
            boolean r4 = r5.isRtl()
            r2.<init>(r6, r3, r4)
            r0[r1] = r2
            int r6 = r5.mHorizontalChainsSize
            int r6 = r6 + 1
            r5.mHorizontalChainsSize = r6
            return
    }

    private void addVerticalChain(androidx.constraintlayout.solver.widgets.ConstraintWidget r6) {
            r5 = this;
            int r0 = r5.mVerticalChainsSize
            r1 = 1
            int r0 = r0 + r1
            androidx.constraintlayout.solver.widgets.ChainHead[] r2 = r5.mVerticalChainsArray
            int r3 = r2.length
            if (r0 < r3) goto L14
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            androidx.constraintlayout.solver.widgets.ChainHead[] r0 = (androidx.constraintlayout.solver.widgets.ChainHead[]) r0
            r5.mVerticalChainsArray = r0
        L14:
            androidx.constraintlayout.solver.widgets.ChainHead[] r0 = r5.mVerticalChainsArray
            int r2 = r5.mVerticalChainsSize
            androidx.constraintlayout.solver.widgets.ChainHead r3 = new androidx.constraintlayout.solver.widgets.ChainHead
            boolean r4 = r5.isRtl()
            r3.<init>(r6, r1, r4)
            r0[r2] = r3
            int r6 = r5.mVerticalChainsSize
            int r6 = r6 + r1
            r5.mVerticalChainsSize = r6
            return
    }

    private void resetChains() {
            r1 = this;
            r0 = 0
            r1.mHorizontalChainsSize = r0
            r1.mVerticalChainsSize = r0
            return
    }

    void addChain(androidx.constraintlayout.solver.widgets.ConstraintWidget r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r1.addHorizontalChain(r2)
            return
        L6:
            r0 = 1
            if (r3 != r0) goto Lc
            r1.addVerticalChain(r2)
        Lc:
            return
    }

    public boolean addChildrenToSolver(androidx.constraintlayout.solver.LinearSystem r10) {
            r9 = this;
            r9.addToSolver(r10)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r9.mChildren
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            r3 = 0
        Lc:
            r4 = 1
            if (r2 >= r0) goto L25
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r9.mChildren
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            r5.setInBarrier(r1, r1)
            r5.setInBarrier(r4, r1)
            boolean r5 = r5 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r5 == 0) goto L22
            r3 = 1
        L22:
            int r2 = r2 + 1
            goto Lc
        L25:
            if (r3 == 0) goto L3e
            r2 = 0
        L28:
            if (r2 >= r0) goto L3e
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r9.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r5 = r3 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r5 == 0) goto L3b
            androidx.constraintlayout.solver.widgets.Barrier r3 = (androidx.constraintlayout.solver.widgets.Barrier) r3
            r3.markWidgets()
        L3b:
            int r2 = r2 + 1
            goto L28
        L3e:
            r2 = 0
        L3f:
            if (r2 >= r0) goto L55
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r9.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r5 = r3.addFirst()
            if (r5 == 0) goto L52
            r3.addToSolver(r10)
        L52:
            int r2 = r2 + 1
            goto L3f
        L55:
            r2 = 0
        L56:
            if (r2 >= r0) goto L97
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r9.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r5 = r3 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
            if (r5 == 0) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r3.mListDimensionBehaviors
            r6 = r5[r1]
            r5 = r5[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r7) goto L73
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3.setHorizontalDimensionBehaviour(r8)
        L73:
            if (r5 != r7) goto L7a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3.setVerticalDimensionBehaviour(r8)
        L7a:
            r3.addToSolver(r10)
            if (r6 != r7) goto L82
            r3.setHorizontalDimensionBehaviour(r6)
        L82:
            if (r5 != r7) goto L94
            r3.setVerticalDimensionBehaviour(r5)
            goto L94
        L88:
            androidx.constraintlayout.solver.widgets.Optimizer.checkMatchParent(r9, r10, r3)
            boolean r5 = r3.addFirst()
            if (r5 != 0) goto L94
            r3.addToSolver(r10)
        L94:
            int r2 = r2 + 1
            goto L56
        L97:
            int r0 = r9.mHorizontalChainsSize
            if (r0 <= 0) goto L9e
            androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(r9, r10, r1)
        L9e:
            int r0 = r9.mVerticalChainsSize
            if (r0 <= 0) goto La5
            androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(r9, r10, r4)
        La5:
            return r4
    }

    public void defineTerminalWidgets() {
            r3 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r3.mDependencyGraph
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r3.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getVerticalDimensionBehaviour()
            r0.defineTerminalWidgets(r1, r2)
            return
    }

    public boolean directMeasure(boolean r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            boolean r2 = r0.directMeasure(r2)
            return r2
    }

    public boolean directMeasureSetup(boolean r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            boolean r2 = r0.directMeasureSetup(r2)
            return r2
    }

    public boolean directMeasureWithOrientation(boolean r2, int r3) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            boolean r2 = r0.directMeasureWithOrientation(r2, r3)
            return r2
    }

    public void fillMetrics(androidx.constraintlayout.solver.Metrics r2) {
            r1 = this;
            r1.mMetrics = r2
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem
            r0.fillMetrics(r2)
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.solver.widgets.Guideline> getHorizontalGuidelines() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r1 = r5.mChildren
            int r1 = r1.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L28
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r5.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r4 == 0) goto L25
            androidx.constraintlayout.solver.widgets.Guideline r3 = (androidx.constraintlayout.solver.widgets.Guideline) r3
            int r4 = r3.getOrientation()
            if (r4 != 0) goto L25
            r0.add(r3)
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            return r0
    }

    public androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer getMeasurer() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r1.mMeasurer
            return r0
    }

    public int getOptimizationLevel() {
            r1 = this;
            int r0 = r1.mOptimizationLevel
            return r0
    }

    public androidx.constraintlayout.solver.LinearSystem getSystem() {
            r1 = this;
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "ConstraintLayout"
            return r0
    }

    public java.util.ArrayList<androidx.constraintlayout.solver.widgets.Guideline> getVerticalGuidelines() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r1 = r6.mChildren
            int r1 = r1.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L29
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r6.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r4 == 0) goto L26
            androidx.constraintlayout.solver.widgets.Guideline r3 = (androidx.constraintlayout.solver.widgets.Guideline) r3
            int r4 = r3.getOrientation()
            r5 = 1
            if (r4 != r5) goto L26
            r0.add(r3)
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            return r0
    }

    public boolean handlesInternalConstraints() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void invalidateGraph() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            r0.invalidateGraph()
            return
    }

    public void invalidateMeasures() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            r0.invalidateMeasures()
            return
    }

    public boolean isHeightMeasuredTooSmall() {
            r1 = this;
            boolean r0 = r1.mHeightMeasuredTooSmall
            return r0
    }

    public boolean isRtl() {
            r1 = this;
            boolean r0 = r1.mIsRtl
            return r0
    }

    public boolean isWidthMeasuredTooSmall() {
            r1 = this;
            boolean r0 = r1.mWidthMeasuredTooSmall
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer
    public void layout() {
            r18 = this;
            r1 = r18
            r2 = 0
            r1.mX = r2
            r1.mY = r2
            int r0 = r1.getWidth()
            int r3 = java.lang.Math.max(r2, r0)
            int r0 = r1.getHeight()
            int r4 = java.lang.Math.max(r2, r0)
            r1.mWidthMeasuredTooSmall = r2
            r1.mHeightMeasuredTooSmall = r2
            r0 = 64
            boolean r0 = r1.optimizeFor(r0)
            r5 = 1
            if (r0 != 0) goto L2f
            r0 = 128(0x80, float:1.8E-43)
            boolean r0 = r1.optimizeFor(r0)
            if (r0 == 0) goto L2d
            goto L2f
        L2d:
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            androidx.constraintlayout.solver.LinearSystem r6 = r1.mSystem
            r6.graphOptimizer = r2
            r6.newgraphOptimizer = r2
            int r7 = r1.mOptimizationLevel
            if (r7 == 0) goto L3e
            if (r0 == 0) goto L3e
            r6.newgraphOptimizer = r5
        L3e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r6 = r0[r5]
            r7 = r0[r2]
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r1.mChildren
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r1.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r9) goto L57
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r1.getVerticalDimensionBehaviour()
            if (r0 != r9) goto L55
            goto L57
        L55:
            r9 = 0
            goto L58
        L57:
            r9 = 1
        L58:
            r1.resetChains()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r1.mChildren
            int r10 = r0.size()
            r0 = 0
        L62:
            if (r0 >= r10) goto L78
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r11 = r1.mChildren
            java.lang.Object r11 = r11.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.solver.widgets.WidgetContainer
            if (r12 == 0) goto L75
            androidx.constraintlayout.solver.widgets.WidgetContainer r11 = (androidx.constraintlayout.solver.widgets.WidgetContainer) r11
            r11.layout()
        L75:
            int r0 = r0 + 1
            goto L62
        L78:
            r0 = 0
            r11 = 1
            r12 = 0
        L7b:
            if (r11 == 0) goto L1be
            int r13 = r0 + 1
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L9f
            r0.reset()     // Catch: java.lang.Exception -> L9f
            r1.resetChains()     // Catch: java.lang.Exception -> L9f
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L9f
            r1.createObjectVariables(r0)     // Catch: java.lang.Exception -> L9f
            r0 = 0
        L8d:
            if (r0 >= r10) goto La1
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r14 = r1.mChildren     // Catch: java.lang.Exception -> L9f
            java.lang.Object r14 = r14.get(r0)     // Catch: java.lang.Exception -> L9f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r14     // Catch: java.lang.Exception -> L9f
            androidx.constraintlayout.solver.LinearSystem r15 = r1.mSystem     // Catch: java.lang.Exception -> L9f
            r14.createObjectVariables(r15)     // Catch: java.lang.Exception -> L9f
            int r0 = r0 + 1
            goto L8d
        L9f:
            r0 = move-exception
            goto Laf
        La1:
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L9f
            boolean r11 = r1.addChildrenToSolver(r0)     // Catch: java.lang.Exception -> L9f
            if (r11 == 0) goto Lb7
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L9f
            r0.minimize()     // Catch: java.lang.Exception -> L9f
            goto Lb7
        Laf:
            java.io.PrintStream r14 = java.lang.System.out
            r0.toString()
            r14.getClass()
        Lb7:
            if (r11 == 0) goto Lc1
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem
            boolean[] r11 = androidx.constraintlayout.solver.widgets.Optimizer.flags
            r1.updateChildrenFromSolver(r0, r11)
            goto Ld9
        Lc1:
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem
            r1.updateFromSolver(r0)
            r0 = 0
        Lc7:
            if (r0 >= r10) goto Ld9
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r11 = r1.mChildren
            java.lang.Object r11 = r11.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r11
            androidx.constraintlayout.solver.LinearSystem r14 = r1.mSystem
            r11.updateFromSolver(r14)
            int r0 = r0 + 1
            goto Lc7
        Ld9:
            if (r9 == 0) goto L145
            r0 = 8
            if (r13 >= r0) goto L145
            boolean[] r0 = androidx.constraintlayout.solver.widgets.Optimizer.flags
            r11 = 2
            boolean r0 = r0[r11]
            if (r0 == 0) goto L145
            r0 = 0
            r11 = 0
            r14 = 0
        Le9:
            if (r0 >= r10) goto L110
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r15 = r1.mChildren
            java.lang.Object r15 = r15.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            r16 = 0
            int r2 = r15.mX
            int r17 = r15.getWidth()
            int r2 = r2 + r17
            int r11 = java.lang.Math.max(r11, r2)
            int r2 = r15.mY
            int r15 = r15.getHeight()
            int r2 = r2 + r15
            int r14 = java.lang.Math.max(r14, r2)
            int r0 = r0 + 1
            r2 = 0
            goto Le9
        L110:
            r16 = 0
            int r0 = r1.mMinWidth
            int r0 = java.lang.Math.max(r0, r11)
            int r2 = r1.mMinHeight
            int r2 = java.lang.Math.max(r2, r14)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r11) goto L132
            int r14 = r1.getWidth()
            if (r14 >= r0) goto L132
            r1.setWidth(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r0[r16] = r11
            r0 = 1
            r12 = 1
            goto L133
        L132:
            r0 = 0
        L133:
            if (r6 != r11) goto L148
            int r14 = r1.getHeight()
            if (r14 >= r2) goto L148
            r1.setHeight(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r0[r5] = r11
            r0 = 1
            r12 = 1
            goto L148
        L145:
            r16 = 0
            r0 = 0
        L148:
            int r2 = r1.mMinWidth
            int r11 = r1.getWidth()
            int r2 = java.lang.Math.max(r2, r11)
            int r11 = r1.getWidth()
            if (r2 <= r11) goto L163
            r1.setWidth(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r16] = r2
            r0 = 1
            r12 = 1
        L163:
            int r2 = r1.mMinHeight
            int r11 = r1.getHeight()
            int r2 = java.lang.Math.max(r2, r11)
            int r11 = r1.getHeight()
            if (r2 <= r11) goto L17e
            r1.setHeight(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r5] = r2
            r0 = 1
            r12 = 1
        L17e:
            if (r12 != 0) goto L1b9
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.mListDimensionBehaviors
            r2 = r2[r16]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r11) goto L19d
            if (r3 <= 0) goto L19d
            int r2 = r1.getWidth()
            if (r2 <= r3) goto L19d
            r1.mWidthMeasuredTooSmall = r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r16] = r2
            r1.setWidth(r3)
            r0 = 1
            r12 = 1
        L19d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.mListDimensionBehaviors
            r2 = r2[r5]
            if (r2 != r11) goto L1b9
            if (r4 <= 0) goto L1b9
            int r2 = r1.getHeight()
            if (r2 <= r4) goto L1b9
            r1.mHeightMeasuredTooSmall = r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r5] = r2
            r1.setHeight(r4)
            r11 = 1
            r12 = 1
            goto L1ba
        L1b9:
            r11 = r0
        L1ba:
            r0 = r13
            r2 = 0
            goto L7b
        L1be:
            r16 = 0
            r1.mChildren = r8
            if (r12 == 0) goto L1ca
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r0[r16] = r7
            r0[r5] = r6
        L1ca:
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem
            androidx.constraintlayout.solver.Cache r0 = r0.getCache()
            r1.resetSolverVariables(r0)
            return
    }

    public long measure(int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r11 = this;
            r3 = r19
            r11.mPaddingLeft = r3
            r4 = r20
            r11.mPaddingTop = r4
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure r0 = r11.mBasicMeasureSolver
            r1 = r11
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            long r12 = r0.solverMeasure(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public boolean optimizeFor(int r2) {
            r1 = this;
            int r0 = r1.mOptimizationLevel
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void reset() {
            r1 = this;
            androidx.constraintlayout.solver.LinearSystem r0 = r1.mSystem
            r0.reset()
            r0 = 0
            r1.mPaddingLeft = r0
            r1.mPaddingRight = r0
            r1.mPaddingTop = r0
            r1.mPaddingBottom = r0
            r1.mSkipSolver = r0
            super.reset()
            return
    }

    public void setMeasurer(androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r2) {
            r1 = this;
            r1.mMeasurer = r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            r0.setMeasurer(r2)
            return
    }

    public void setOptimizationLevel(int r2) {
            r1 = this;
            r1.mOptimizationLevel = r2
            r0 = 256(0x100, float:3.59E-43)
            boolean r2 = androidx.constraintlayout.solver.widgets.Optimizer.enabled(r2, r0)
            androidx.constraintlayout.solver.LinearSystem.OPTIMIZED_ENGINE = r2
            return
    }

    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mPaddingTop = r2
            r0.mPaddingRight = r3
            r0.mPaddingBottom = r4
            return
    }

    public void setRtl(boolean r1) {
            r0 = this;
            r0.mIsRtl = r1
            return
    }

    public void updateChildrenFromSolver(androidx.constraintlayout.solver.LinearSystem r3, boolean[] r4) {
            r2 = this;
            r0 = 2
            r1 = 0
            r4[r0] = r1
            r2.updateFromSolver(r3)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r2.mChildren
            int r4 = r4.size()
        Ld:
            if (r1 >= r4) goto L1d
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r2.mChildren
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
            r0.updateFromSolver(r3)
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromRuns(boolean r4, boolean r5) {
            r3 = this;
            super.updateFromRuns(r4, r5)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r3.mChildren
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r3.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            r2.updateFromRuns(r4, r5)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public void updateHierarchy() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure r0 = r1.mBasicMeasureSolver
            r0.updateHierarchy(r1)
            return
    }
}
