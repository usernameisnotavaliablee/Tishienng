package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer container;
    private androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer mContainer;
    java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> mGroups;
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private boolean mNeedBuildGraph;
    private boolean mNeedRedoMeasures;
    private java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> mRuns;
    private java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> runGroups;

    public DependencyGraph(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mNeedBuildGraph = r0
            r1.mNeedRedoMeasures = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRuns = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.runGroups = r0
            r0 = 0
            r1.mMeasurer = r0
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mGroups = r0
            r1.container = r2
            r1.mContainer = r2
            return
    }

    private void applyGroup(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9, int r10, int r11, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12, java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r13, androidx.constraintlayout.solver.widgets.analyzer.RunGroup r14) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9 = r9.run
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup r0 = r9.runGroup
            if (r0 != 0) goto L100
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r8.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r0.horizontalRun
            if (r9 == r1) goto L100
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            if (r9 != r0) goto L12
            goto L100
        L12:
            if (r14 != 0) goto L1c
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup r14 = new androidx.constraintlayout.solver.widgets.analyzer.RunGroup
            r14.<init>(r9, r11)
            r13.add(r14)
        L1c:
            r7 = r14
            r9.runGroup = r7
            r7.add(r9)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r9.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L2a:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L4d
            java.lang.Object r14 = r11.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r14 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r14
            boolean r0 = r14 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r0 == 0) goto L46
            r2 = r14
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            r4 = 0
            r1 = r8
            r3 = r10
            r5 = r12
            r6 = r13
            r1.applyGroup(r2, r3, r4, r5, r6, r7)
            goto L49
        L46:
            r3 = r10
            r5 = r12
            r6 = r13
        L49:
            r10 = r3
            r12 = r5
            r13 = r6
            goto L2a
        L4d:
            r3 = r10
            r5 = r12
            r6 = r13
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r10 = r10.dependencies
            java.util.Iterator r10 = r10.iterator()
        L58:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L71
            java.lang.Object r11 = r10.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r11 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r12 == 0) goto L58
            r2 = r11
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            r4 = 1
            r1 = r8
            r1.applyGroup(r2, r3, r4, r5, r6, r7)
            goto L58
        L71:
            r10 = 1
            if (r3 != r10) goto L9c
            boolean r11 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r11 == 0) goto L9c
            r11 = r9
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r11 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r11
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r11.baseline
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L83:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L9c
            java.lang.Object r12 = r11.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r12 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r12
            boolean r13 = r12 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r13 == 0) goto L83
            r2 = r12
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            r4 = 2
            r1 = r8
            r1.applyGroup(r2, r3, r4, r5, r6, r7)
            goto L83
        L9c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r9.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r11 = r11.targets
            java.util.Iterator r11 = r11.iterator()
        La4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lbb
            java.lang.Object r12 = r11.next()
            r2 = r12
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            if (r2 != r5) goto Lb5
            r7.dual = r10
        Lb5:
            r4 = 0
            r1 = r8
            r1.applyGroup(r2, r3, r4, r5, r6, r7)
            goto La4
        Lbb:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r9.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r11 = r11.targets
            java.util.Iterator r11 = r11.iterator()
        Lc3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lda
            java.lang.Object r12 = r11.next()
            r2 = r12
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            if (r2 != r5) goto Ld4
            r7.dual = r10
        Ld4:
            r4 = 1
            r1 = r8
            r1.applyGroup(r2, r3, r4, r5, r6, r7)
            goto Lc3
        Lda:
            if (r3 != r10) goto L100
            boolean r10 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r10 == 0) goto L100
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.baseline
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r9 = r9.targets
            java.util.Iterator r9 = r9.iterator()
        Lea:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L100
            java.lang.Object r10 = r9.next()
            r2 = r10
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            r4 = 2
            r1 = r8
            r1.applyGroup(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lfd
            goto Lea
        Lfd:
            r0 = move-exception
            r9 = r0
            throw r9
        L100:
            return
    }

    private boolean basicMeasureWidgets(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r19) {
            r18 = this;
            r0 = r19
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r1 = r0.mChildren
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L339
            java.lang.Object r2 = r1.next()
            r5 = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r5.mListDimensionBehaviors
            r4 = r2[r3]
            r10 = 1
            r2 = r2[r10]
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L28
            r5.measured = r10
            goto L8
        L28:
            float r6 = r5.mMatchConstraintPercentWidth
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L37
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L37
            r5.mMatchConstraintDefaultWidth = r7
        L37:
            float r6 = r5.mMatchConstraintPercentHeight
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L43
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r6) goto L43
            r5.mMatchConstraintDefaultHeight = r7
        L43:
            float r6 = r5.getDimensionRatio()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L79
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L5c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 == r8) goto L59
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 != r8) goto L5c
        L59:
            r5.mMatchConstraintDefaultWidth = r9
            goto L79
        L5c:
            if (r2 != r6) goto L69
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r8) goto L66
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r8) goto L69
        L66:
            r5.mMatchConstraintDefaultHeight = r9
            goto L79
        L69:
            if (r4 != r6) goto L79
            if (r2 != r6) goto L79
            int r6 = r5.mMatchConstraintDefaultWidth
            if (r6 != 0) goto L73
            r5.mMatchConstraintDefaultWidth = r9
        L73:
            int r6 = r5.mMatchConstraintDefaultHeight
            if (r6 != 0) goto L79
            r5.mMatchConstraintDefaultHeight = r9
        L79:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L8f
            int r8 = r5.mMatchConstraintDefaultWidth
            if (r8 != r10) goto L8f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L8d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 != 0) goto L8f
        L8d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L8f:
            if (r2 != r6) goto La3
            int r8 = r5.mMatchConstraintDefaultHeight
            if (r8 != r10) goto La3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto La1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 != 0) goto La3
        La1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        La3:
            r8 = r2
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            r2.dimensionBehavior = r4
            int r12 = r5.mMatchConstraintDefaultWidth
            r2.matchConstraintsType = r12
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            r2.dimensionBehavior = r8
            int r13 = r5.mMatchConstraintDefaultHeight
            r2.matchConstraintsType = r13
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 == r2) goto Lc0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r14) goto Lc0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r14) goto Lcd
        Lc0:
            if (r8 == r2) goto Lca
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 == r14) goto Lca
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r14) goto Lcd
        Lca:
            r6 = r4
            goto L2ea
        Lcd:
            r14 = 1056964608(0x3f000000, float:0.5)
            r15 = r6
            if (r4 != r6) goto L19a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r16 = 0
            if (r8 == r6) goto Le1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r3) goto Ldd
            goto Le1
        Ldd:
            r17 = 1065353216(0x3f800000, float:1.0)
            goto L19e
        Le1:
            if (r12 != r9) goto L11a
            if (r8 != r6) goto Led
            r7 = 0
            r9 = 0
            r8 = r6
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
        Led:
            int r9 = r5.getHeight()
            float r2 = (float) r9
            float r3 = r5.mDimensionRatio
            float r2 = r2 * r3
            float r2 = r2 + r14
            int r7 = (int) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = r6
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L11a:
            if (r12 != r10) goto L12f
            r7 = 0
            r9 = 0
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.wrapValue = r3
            goto L8
        L12f:
            if (r12 != r7) goto L169
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r0.mListDimensionBehaviors
            r3 = r3[r16]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r6) goto L13b
            if (r3 != r2) goto Ldd
        L13b:
            float r2 = r5.mMatchConstraintPercentWidth
            int r3 = r0.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r14
            int r7 = (int) r2
            int r9 = r5.getHeight()
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L169:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r5.mListAnchors
            r17 = 1065353216(0x3f800000, float:1.0)
            r11 = r3[r16]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L179
            r3 = r3[r10]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L19e
        L179:
            r7 = 0
            r9 = 0
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L19a:
            r16 = 0
            goto Ldd
        L19e:
            if (r8 != r15) goto L1a9
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r6) goto L1ac
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r3) goto L1a9
            goto L1ac
        L1a9:
            r6 = r4
            goto L277
        L1ac:
            if (r13 != r9) goto L1ee
            if (r4 != r6) goto L1b8
            r7 = 0
            r9 = 0
            r8 = r6
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
        L1b8:
            int r7 = r5.getWidth()
            float r2 = r5.mDimensionRatio
            int r3 = r5.getDimensionRatioSide()
            r4 = -1
            if (r3 != r4) goto L1c7
            float r2 = r17 / r2
        L1c7:
            float r3 = (float) r7
            float r3 = r3 * r2
            float r3 = r3 + r14
            int r9 = (int) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = r6
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L1ee:
            if (r13 != r10) goto L205
            r7 = 0
            r9 = 0
            r8 = r6
            r6 = r4
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.wrapValue = r3
            goto L8
        L205:
            r3 = r6
            r6 = r4
            if (r13 != r7) goto L245
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r0.mListDimensionBehaviors
            r3 = r3[r10]
            r4 = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r8) goto L217
            if (r3 != r2) goto L215
            goto L217
        L215:
            r8 = r4
            goto L277
        L217:
            float r2 = r5.mMatchConstraintPercentHeight
            int r7 = r5.getWidth()
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r14
            int r9 = (int) r2
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L245:
            r4 = r8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r5.mListAnchors
            r8 = r2[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L254
            r2 = r2[r9]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L215
        L254:
            r7 = 0
            r9 = 0
            r6 = r3
            r8 = r4
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L277:
            if (r6 != r15) goto L8
            if (r8 != r15) goto L8
            if (r12 == r10) goto L2ca
            if (r13 != r10) goto L280
            goto L2ca
        L280:
            if (r13 != r7) goto L8
            if (r12 != r7) goto L8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.mListDimensionBehaviors
            r3 = r2[r16]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r6) goto L28e
            if (r3 != r6) goto L8
        L28e:
            r2 = r2[r10]
            if (r2 == r6) goto L294
            if (r2 != r6) goto L8
        L294:
            float r2 = r5.mMatchConstraintPercentWidth
            float r3 = r5.mMatchConstraintPercentHeight
            int r4 = r0.getWidth()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r14
            int r7 = (int) r2
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r3 = r3 * r2
            float r3 = r3 + r14
            int r9 = (int) r3
            r8 = r6
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L2ca:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r8 = r6
            r4 = r18
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.wrapValue = r3
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.wrapValue = r3
            goto L8
        L2ea:
            int r3 = r5.getWidth()
            if (r6 != r2) goto L301
            int r3 = r0.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r5.mLeft
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r5.mRight
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = r4
        L301:
            r7 = r3
            int r3 = r5.getHeight()
            if (r8 != r2) goto L319
            int r2 = r0.getHeight()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r5.mTop
            int r3 = r3.mMargin
            int r2 = r2 - r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r5.mBottom
            int r3 = r3.mMargin
            int r3 = r2 - r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
        L319:
            r4 = r18
            r9 = r3
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r5.getHeight()
            r2.resolve(r3)
            r5.measured = r10
            goto L8
        L339:
            r16 = 0
            return r16
    }

    private int computeWrap(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7, int r8) {
            r6 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r0 = r6.mGroups
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L1e
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r4 = r6.mGroups
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup r4 = (androidx.constraintlayout.solver.widgets.analyzer.RunGroup) r4
            long r4 = r4.computeWrapSize(r7, r8)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L9
        L1e:
            int r7 = (int) r1
            return r7
    }

    private void displayGraph() {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r3.mRuns
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "digraph {\n"
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            java.lang.String r1 = r3.generateDisplayGraph(r2, r1)
            goto L8
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "\n}\n"
            r0.append(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    private void findGroup(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r19, int r20, java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r21) {
            r18 = this;
            r0 = r19
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r1 = r1.dependencies
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L2b
            r5 = r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r0.end
            r10 = 0
            r7 = 0
            r4 = r18
            r6 = r20
            r9 = r21
            r4.applyGroup(r5, r6, r7, r8, r9, r10)
            goto La
        L2b:
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
            if (r3 == 0) goto La
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = r2.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r15 = r0.end
            r17 = 0
            r14 = 0
            r11 = r18
            r13 = r20
            r16 = r21
            r11.applyGroup(r12, r13, r14, r15, r16, r17)
            goto La
        L42:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r1 = r1.dependencies
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L6c
            r12 = r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r12
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r15 = r0.start
            r17 = 0
            r14 = 1
            r11 = r18
            r13 = r20
            r16 = r21
            r11.applyGroup(r12, r13, r14, r15, r16, r17)
            goto L4a
        L6c:
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
            if (r3 == 0) goto L4a
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = r2.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r15 = r0.start
            r17 = 0
            r14 = 1
            r11 = r18
            r13 = r20
            r16 = r21
            r11.applyGroup(r12, r13, r14, r15, r16, r17)
            goto L4a
        L83:
            r1 = 1
            r13 = r20
            if (r13 != r1) goto Lb3
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.baseline
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r1 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            if (r2 == 0) goto Lb0
            r12 = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r12
            r15 = 0
            r17 = 0
            r14 = 2
            r11 = r18
            r16 = r21
            r11.applyGroup(r12, r13, r14, r15, r16, r17)
        Lb0:
            r13 = r20
            goto L92
        Lb3:
            return
    }

    private java.lang.String generateChainDisplayGraph(androidx.constraintlayout.solver.widgets.analyzer.ChainRun r7, java.lang.String r8) {
            r6 = this;
            int r0 = r7.orientation
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cluster_"
            r1.append(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            java.lang.String r2 = r2.getDebugName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r0 != 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_h"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L3e
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_v"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L3e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "subgraph "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " {\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r7.widgets
            java.util.Iterator r7 = r7.iterator()
            java.lang.String r2 = ""
        L5c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r7.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r3.widget
            java.lang.String r4 = r4.getDebugName()
            if (r0 != 0) goto L82
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_HORIZONTAL"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L93
        L82:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_VERTICAL"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L93:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = ";\n"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = r6.generateDisplayGraph(r3, r2)
            goto L5c
        Lac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r0 = "}\n"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    private java.lang.String generateDisplayGraph(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9, java.lang.String r10) {
            r8 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r9.end
            boolean r2 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r2 != 0) goto L28
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r0.dependencies
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            boolean r2 = r2.isEmpty()
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            r2 = r2 & r3
            if (r2 == 0) goto L28
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            return r10
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r10 = r8.nodeDefinition(r9)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            boolean r2 = r8.isCenteredConnection(r0, r1)
            java.lang.String r10 = r8.generateDisplayNode(r0, r2, r10)
            java.lang.String r10 = r8.generateDisplayNode(r1, r2, r10)
            boolean r3 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r3 == 0) goto L54
            r4 = r9
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.baseline
            java.lang.String r10 = r8.generateDisplayNode(r4, r2, r10)
        L54:
            boolean r2 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            r4 = 0
            java.lang.String r5 = " -> "
            java.lang.String r6 = "\n"
            if (r2 != 0) goto L11c
            boolean r2 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r2 == 0) goto L6a
            r7 = r9
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r7
            int r7 = r7.orientation
            if (r7 != 0) goto L6a
            goto L11c
        L6a:
            if (r3 != 0) goto L76
            if (r2 == 0) goto L1bf
            r2 = r9
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r2
            int r2 = r2.orientation
            r3 = 1
            if (r2 != r3) goto L1bf
        L76:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto L9a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L85
            goto L9a
        L85:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r0) goto L1bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            r0.getDebugName()
            goto L1bf
        L9a:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Ldb
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ldb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L1bf
        Ldb:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1bf
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L1bf
        L11c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto L140
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L12b
            goto L140
        L12b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r0) goto L1bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.widget
            r0.getDebugName()
            goto L1bf
        L140:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L180
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L180
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L1bf
        L180:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r0.targets
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1bf
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r1.targets
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
        L1bf:
            boolean r0 = r9 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r0 == 0) goto L1ca
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.ChainRun) r9
            java.lang.String r9 = r8.generateChainDisplayGraph(r9, r10)
            return r9
        L1ca:
            return r10
    }

    private java.lang.String generateDisplayNode(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6, boolean r7, java.lang.String r8) {
            r5 = this;
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r6.targets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n"
            r2.append(r3)
            java.lang.String r4 = r6.name()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            int r2 = r6.margin
            if (r2 > 0) goto L4b
            if (r7 != 0) goto L4b
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r6.run
            boolean r2 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r2 == 0) goto Lc9
        L4b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "["
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r2 = r6.margin
            if (r2 <= 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "label=\""
            r2.append(r1)
            int r1 = r6.margin
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r7 == 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ","
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L8e:
            if (r7 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " style=dashed "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        La1:
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r6.run
            boolean r2 = r2 instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            if (r2 == 0) goto Lb8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " style=bold,color=gray "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        Lb8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        Lc9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            goto L6
        Le9:
            return r8
    }

    private boolean isCenteredConnection(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6) {
            r4 = this;
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r5.targets
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r3
            if (r3 == r6) goto L8
            int r2 = r2 + 1
            goto L8
        L19:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r6 = r6.targets
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        L20:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r6.next()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r3
            if (r3 == r5) goto L20
            int r0 = r0 + 1
            goto L20
        L31:
            if (r2 <= 0) goto L37
            if (r0 <= 0) goto L37
            r5 = 1
            return r5
        L37:
            return r1
    }

    private void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget r2, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r3, int r4, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r5, int r6) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r1.mMeasure
            r0.horizontalBehavior = r3
            r0.verticalBehavior = r5
            r0.horizontalDimension = r4
            r0.verticalDimension = r6
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r3 = r1.mMeasurer
            r3.measure(r2, r0)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            boolean r3 = r3.measuredHasBaseline
            r2.setHasBaseline(r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
            return
    }

    private java.lang.String nodeDefinition(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            java.lang.String r1 = r1.getDebugName()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            if (r0 != 0) goto L11
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getHorizontalDimensionBehaviour()
            goto L15
        L11:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getVerticalDimensionBehaviour()
        L15:
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup r3 = r10.runGroup
            if (r0 != 0) goto L2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_HORIZONTAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L3c
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_VERTICAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " [shape=none, label=<"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "  <TR>"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            if (r0 != 0) goto Lab
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r10.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto L99
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
        L99:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto Le0
        Lab:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r10.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto Lcf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
        Lcf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
        Le0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "    <TD BORDER=\"1\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r10.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto L10f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r10.widget
            boolean r8 = r8.measured
            if (r8 != 0) goto L10f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"green\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L142
        L10f:
            if (r7 == 0) goto L129
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r10.widget
            boolean r8 = r8.measured
            if (r8 == 0) goto L129
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"lightgray\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L142
        L129:
            if (r7 != 0) goto L142
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r10.widget
            boolean r7 = r7.measured
            if (r7 == 0) goto L142
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"yellow\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
        L142:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r7) goto L157
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "style=\"dashed\""
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L157:
            if (r3 == 0) goto L17e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = " ["
            r2.append(r7)
            int r3 = r3.groupIndex
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            int r3 = androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L180
        L17e:
            java.lang.String r2 = ""
        L180:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ">"
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " </TD>"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r0 != 0) goto L1d4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto L1c2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
        L1c2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            goto L245
        L1d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r1 = r10 instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun
            if (r1 == 0) goto L1ff
            r1 = r10
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.baseline
            boolean r1 = r1.resolved
            if (r1 == 0) goto L1ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L1ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto L234
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
        L234:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
        L245:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "  </TR></TABLE>"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = ">];\n"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
    }

    public void buildGraph() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r0 = r4.mRuns
            r4.buildGraph(r0)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r0 = r4.mGroups
            r0.clear()
            r0 = 0
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r4.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r2 = r4.mGroups
            r4.findGroup(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r4.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            r2 = 1
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r3 = r4.mGroups
            r4.findGroup(r1, r2, r3)
            r4.mNeedBuildGraph = r0
            return
    }

    public void buildGraph(java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r6) {
            r5 = this;
            r6.clear()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r0.clear()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r0.clear()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r6.add(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r6.add(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r3 == 0) goto L41
            androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference r3 = new androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L41:
            boolean r3 = r2.isInHorizontalChain()
            if (r3 == 0) goto L60
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = r2.horizontalChainRun
            if (r3 != 0) goto L53
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = new androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            r4 = 0
            r3.<init>(r2, r4)
            r2.horizontalChainRun = r3
        L53:
            if (r1 != 0) goto L5a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L5a:
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = r2.horizontalChainRun
            r1.add(r3)
            goto L65
        L60:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            r6.add(r3)
        L65:
            boolean r3 = r2.isInVerticalChain()
            if (r3 == 0) goto L84
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = r2.verticalChainRun
            if (r3 != 0) goto L77
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = new androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            r4 = 1
            r3.<init>(r2, r4)
            r2.verticalChainRun = r3
        L77:
            if (r1 != 0) goto L7e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L7e:
            androidx.constraintlayout.solver.widgets.analyzer.ChainRun r3 = r2.verticalChainRun
            r1.add(r3)
            goto L89
        L84:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            r6.add(r3)
        L89:
            boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.HelperWidget
            if (r3 == 0) goto L28
            androidx.constraintlayout.solver.widgets.analyzer.HelperReferences r3 = new androidx.constraintlayout.solver.widgets.analyzer.HelperReferences
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L96:
            if (r1 == 0) goto L9b
            r6.addAll(r1)
        L9b:
            java.util.Iterator r0 = r6.iterator()
        L9f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r1
            r1.clear()
            goto L9f
        Laf:
            java.util.Iterator r6 = r6.iterator()
        Lb3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r6.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r5.mContainer
            if (r1 != r2) goto Lc6
            goto Lb3
        Lc6:
            r0.apply()
            goto Lb3
        Lca:
            return
    }

    public void defineTerminalWidgets(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r8) {
            r6 = this;
            boolean r0 = r6.mNeedBuildGraph
            if (r0 == 0) goto L4e
            r6.buildGraph()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r6.container
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L11:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean[] r5 = r3.isTerminalWidget
            r5[r1] = r4
            r5[r4] = r4
            boolean r3 = r3 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r3 == 0) goto L11
            r2 = 1
            goto L11
        L2a:
            if (r2 != 0) goto L4e
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> r0 = r6.mGroups
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.RunGroup r2 = (androidx.constraintlayout.solver.widgets.analyzer.RunGroup) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r3) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r8 != r3) goto L49
            r3 = 1
            goto L4a
        L49:
            r3 = 0
        L4a:
            r2.defineTerminalWidgets(r5, r3)
            goto L32
        L4e:
            return
    }

    public boolean directMeasure(boolean r10) {
            r9 = this;
            boolean r0 = r9.mNeedBuildGraph
            r1 = 0
            if (r0 != 0) goto L9
            boolean r0 = r9.mNeedRedoMeasures
            if (r0 == 0) goto L3c
        L9:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            r2.measured = r1
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            r3.reset()
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r2.verticalRun
            r2.reset()
            goto L11
        L2a:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            r0.measured = r1
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r0.reset()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r0.reset()
            r9.mNeedRedoMeasures = r1
        L3c:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.mContainer
            boolean r0 = r9.basicMeasureWidgets(r0)
            if (r0 == 0) goto L45
            return r1
        L45:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            r0.setX(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            r0.setY(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getDimensionBehaviour(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r9.container
            r3 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getDimensionBehaviour(r3)
            boolean r4 = r9.mNeedBuildGraph
            if (r4 == 0) goto L63
            r9.buildGraph()
        L63:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r6.start
            r6.resolve(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r6 = r6.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r6.start
            r6.resolve(r5)
            r9.measureWidgets()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r6) goto L8a
            if (r2 != r6) goto Leb
        L8a:
            if (r10 == 0) goto La5
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L92:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La5
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L92
            r10 = 0
        La5:
            if (r10 == 0) goto Lc8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r6) goto Lc8
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setHorizontalDimensionBehaviour(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            int r7 = r9.computeWrap(r6, r1)
            r6.setWidth(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r7 = r6.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r7.dimension
            int r6 = r6.getWidth()
            r7.resolve(r6)
        Lc8:
            if (r10 == 0) goto Leb
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r10) goto Leb
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r3)
            r10.setHeight(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r6 = r10.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getHeight()
            r6.resolve(r10)
        Leb:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r10.mListDimensionBehaviors
            r6 = r6[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto Lfc
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r6 != r8) goto Lfa
            goto Lfc
        Lfa:
            r10 = 0
            goto L13f
        Lfc:
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r6.end
            r6.resolve(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10 - r4
            r6.resolve(r10)
            r9.measureWidgets()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.mListDimensionBehaviors
            r4 = r4[r3]
            if (r4 == r7) goto L123
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L13b
        L123:
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
        L13b:
            r9.measureWidgets()
            r10 = 1
        L13f:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L145:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L160
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L15c
            boolean r6 = r5.resolved
            if (r6 != 0) goto L15c
            goto L145
        L15c:
            r5.applyToWidget()
            goto L145
        L160:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L166:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L19c
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            if (r10 != 0) goto L17b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L17b
            goto L166
        L17b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L182
            goto L19d
        L182:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L18d
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference
            if (r6 != 0) goto L18d
            goto L19d
        L18d:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r5.dimension
            boolean r6 = r6.resolved
            if (r6 != 0) goto L166
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r6 != 0) goto L166
            boolean r5 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference
            if (r5 != 0) goto L166
            goto L19d
        L19c:
            r1 = 1
        L19d:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r2)
            return r1
    }

    public boolean directMeasureSetup(boolean r5) {
            r4 = this;
            boolean r5 = r4.mNeedBuildGraph
            r0 = 0
            if (r5 == 0) goto L51
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r5.mChildren
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r5.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r1
            r1.measured = r0
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r2.dimension
            r3.resolved = r0
            r2.resolved = r0
            r2.reset()
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r1.dimension
            r2.resolved = r0
            r1.resolved = r0
            r1.reset()
            goto Ld
        L32:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.measured = r0
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r5.dimension
            r1.resolved = r0
            r5.resolved = r0
            r5.reset()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r5 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r5.dimension
            r1.resolved = r0
            r5.resolved = r0
            r5.reset()
            r4.buildGraph()
        L51:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mContainer
            boolean r5 = r4.basicMeasureWidgets(r5)
            if (r5 == 0) goto L5a
            return r0
        L5a:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.setX(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.setY(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.start
            r5.resolve(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r5 = r5.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.start
            r5.resolve(r0)
            r5 = 1
            return r5
    }

    public boolean directMeasureWithOrientation(boolean r10, int r11) {
            r9 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r9.container
            r1 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getDimensionBehaviour(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r9.container
            r3 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getDimensionBehaviour(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            if (r10 == 0) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r6) goto L22
            if (r2 != r6) goto L88
        L22:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L28:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L3f
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            int r8 = r7.orientation
            if (r8 != r11) goto L28
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L28
            r10 = 0
        L3f:
            if (r11 != 0) goto L65
            if (r10 == 0) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r10) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setHorizontalDimensionBehaviour(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r1)
            r10.setWidth(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r6 = r10.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getWidth()
            r6.resolve(r10)
            goto L88
        L65:
            if (r10 == 0) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r10) goto L88
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r3)
            r10.setHeight(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r6 = r10.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getHeight()
            r6.resolve(r10)
        L88:
            if (r11 != 0) goto Lb2
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.mListDimensionBehaviors
            r5 = r5[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r6) goto L98
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto Lc1
        L98:
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.end
            r5.resolve(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            int r10 = r10 - r4
            r5.resolve(r10)
        Lb0:
            r10 = 1
            goto Ldc
        Lb2:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.mListDimensionBehaviors
            r4 = r4[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r6) goto Lc3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto Lc1
            goto Lc3
        Lc1:
            r10 = 0
            goto Ldc
        Lc3:
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
            goto Lb0
        Ldc:
            r9.measureWidgets()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        Le5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L105
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto Lf6
            goto Le5
        Lf6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L101
            boolean r6 = r5.resolved
            if (r6 != 0) goto L101
            goto Le5
        L101:
            r5.applyToWidget()
            goto Le5
        L105:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L10b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L11c
            goto L10b
        L11c:
            if (r10 != 0) goto L125
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L125
            goto L10b
        L125:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L12c
            goto L13f
        L12c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L133
            goto L13f
        L133:
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun
            if (r6 != 0) goto L10b
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 != 0) goto L10b
            goto L13f
        L13e:
            r1 = 1
        L13f:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r2)
            return r1
    }

    public void invalidateGraph() {
            r1 = this;
            r0 = 1
            r1.mNeedBuildGraph = r0
            return
    }

    public void invalidateMeasures() {
            r1 = this;
            r0 = 1
            r1.mNeedRedoMeasures = r0
            return
    }

    public void measureWidgets() {
            r12 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r12.container
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r0.next()
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            boolean r1 = r3.measured
            if (r1 == 0) goto L1a
            goto L8
        L1a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r3.mListDimensionBehaviors
            r2 = 0
            r8 = r1[r2]
            r9 = 1
            r1 = r1[r9]
            int r4 = r3.mMatchConstraintDefaultWidth
            int r5 = r3.mMatchConstraintDefaultHeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r6) goto L33
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r7) goto L31
            if (r4 != r9) goto L31
            goto L33
        L31:
            r4 = 0
            goto L34
        L33:
            r4 = 1
        L34:
            if (r1 == r6) goto L3c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r7) goto L3d
            if (r5 != r9) goto L3d
        L3c:
            r2 = 1
        L3d:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r5 = r3.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r7 = r5.resolved
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r10 = r3.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r10 = r10.dimension
            boolean r11 = r10.resolved
            if (r7 == 0) goto L5b
            if (r11 == 0) goto L5b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r5 = r5.value
            int r7 = r10.value
            r6 = r4
            r2 = r12
            r2.measure(r3, r4, r5, r6, r7)
            r3.measured = r9
            goto Lb1
        L5b:
            if (r7 == 0) goto L86
            if (r2 == 0) goto L86
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r5 = r5.value
            int r7 = r10.value
            r2 = r12
            r2.measure(r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L78
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r3.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r2 = r3.getHeight()
            r1.wrapValue = r2
            goto Lb1
        L78:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r3.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r2 = r3.getHeight()
            r1.resolve(r2)
            r3.measured = r9
            goto Lb1
        L86:
            if (r11 == 0) goto Lb1
            if (r4 == 0) goto Lb1
            int r5 = r5.value
            r4 = r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r7 = r10.value
            r2 = r12
            r2.measure(r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r1) goto La4
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r3.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r2 = r3.getWidth()
            r1.wrapValue = r2
            goto Lb1
        La4:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r3.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r2 = r3.getWidth()
            r1.resolve(r2)
            r3.measured = r9
        Lb1:
            boolean r1 = r3.measured
            if (r1 == 0) goto L8
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r3.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.baselineDimension
            if (r1 == 0) goto L8
            int r2 = r3.getBaselineDistance()
            r1.resolve(r2)
            goto L8
        Lc4:
            return
    }

    public void setMeasurer(androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer r1) {
            r0 = this;
            r0.mMeasurer = r1
            return
    }
}
