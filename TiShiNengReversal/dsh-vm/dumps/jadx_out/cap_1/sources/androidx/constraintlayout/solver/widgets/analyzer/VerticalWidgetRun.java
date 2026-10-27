package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VerticalWidgetRun extends androidx.constraintlayout.solver.widgets.analyzer.WidgetRun {
    public androidx.constraintlayout.solver.widgets.analyzer.DependencyNode baseline;
    androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency baselineDimension;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType = null;

        static {
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType = r0
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public VerticalWidgetRun(androidx.constraintlayout.solver.widgets.ConstraintWidget r3) {
            r2 = this;
            r2.<init>(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = new androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
            r3.<init>(r2)
            r2.baseline = r3
            r0 = 0
            r2.baselineDimension = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r1 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.TOP
            r0.type = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r1 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.BOTTOM
            r0.type = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.BASELINE
            r3.type = r0
            r3 = 1
            r2.orientation = r3
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void apply() {
            r10 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r1 = r0.measured
            if (r1 == 0) goto Lf
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            int r0 = r0.getHeight()
            r1.resolve(r0)
        Lf:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L97
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getVerticalDimensionBehaviour()
            r10.dimensionBehavior = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L2c
            androidx.constraintlayout.solver.widgets.analyzer.BaselineDimensionDependency r0 = new androidx.constraintlayout.solver.widgets.analyzer.BaselineDimensionDependency
            r0.<init>(r10)
            r10.baselineDimension = r0
        L2c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto Ld1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L85
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L85
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto L85
            int r1 = r0.getHeight()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTop
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r3 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTop
            int r4 = r4.getMargin()
            r10.addTarget(r2, r3, r4)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mBottom
            int r3 = r3.getMargin()
            int r3 = -r3
            r10.addTarget(r2, r0, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            r0.resolve(r1)
            return
        L85:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto Ld1
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            int r1 = r1.getHeight()
            r0.resolve(r1)
            goto Ld1
        L97:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Ld1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto Ld1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto Ld1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTop
            int r3 = r3.getMargin()
            r10.addTarget(r1, r2, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r2 = -r2
            r10.addTarget(r1, r0, r2)
            return
        Ld1:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            boolean r1 = r0.resolved
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            if (r1 == 0) goto L256
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r10.widget
            boolean r8 = r7.measured
            if (r8 == 0) goto L256
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r7.mListAnchors
            r1 = r0[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r1.mTarget
            if (r8 == 0) goto L169
            r9 = r0[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L169
            boolean r0 = r7.isInVerticalChain()
            if (r0 == 0) goto L114
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r4]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L153
        L114:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r0)
            if (r0 == 0) goto L12f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r4]
            int r2 = r2.getMargin()
            r10.addTarget(r1, r0, r2)
        L12f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r6]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r0)
            if (r0 == 0) goto L14b
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r10.addTarget(r1, r0, r2)
        L14b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            r0.delegateToWidgetRun = r5
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            r0.delegateToWidgetRun = r5
        L153:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getBaselineDistance()
            r10.addTarget(r0, r1, r2)
            return
        L169:
            if (r8 == 0) goto L1a1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r1)
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r4]
            int r2 = r2.getMargin()
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            int r2 = r2.value
            r10.addTarget(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getBaselineDistance()
            r10.addTarget(r0, r1, r2)
            return
        L1a1:
            r1 = r0[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L1df
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r1)
            if (r0 == 0) goto L1c9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            int r2 = r2.value
            int r2 = -r2
            r10.addTarget(r0, r1, r2)
        L1c9:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getBaselineDistance()
            r10.addTarget(r0, r1, r2)
            return
        L1df:
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto L20a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r0)
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.baseline
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.baseline
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getBaselineDistance()
            int r2 = -r2
            r10.addTarget(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            int r2 = r2.value
            r10.addTarget(r0, r1, r2)
            return
        L20a:
            boolean r0 = r7 instanceof androidx.constraintlayout.solver.widgets.Helper
            if (r0 != 0) goto L46d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.getParent()
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L46d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getY()
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            int r2 = r2.value
            r10.addTarget(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getBaselineDistance()
            r10.addTarget(r0, r1, r2)
            return
        L256:
            if (r1 != 0) goto L2c9
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r7) goto L2c9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            int r1 = r0.mMatchConstraintDefaultHeight
            if (r1 == r4) goto L29b
            if (r1 == r6) goto L267
            goto L2cc
        L267:
            boolean r0 = r0.isInVerticalChain()
            if (r0 != 0) goto L2cc
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            int r1 = r0.mMatchConstraintDefaultWidth
            if (r1 != r6) goto L274
            goto L2cc
        L274:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            r0.delegateToWidgetRun = r5
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            r0.add(r1)
            goto L2cc
        L29b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 != 0) goto L2a2
            goto L2cc
        L2a2:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            r0.delegateToWidgetRun = r5
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            r0.add(r1)
            goto L2cc
        L2c9:
            r0.addDependency(r10)
        L2cc:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            r7 = r1[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mTarget
            if (r8 == 0) goto L331
            r9 = r1[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L331
            boolean r0 = r0.isInVerticalChain()
            if (r0 == 0) goto L300
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r4]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L31e
        L300:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.getTarget(r1)
            r0.addDependency(r10)
            r1.addDependency(r10)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER
            r10.mRunType = r0
        L31e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.baselineDimension
            r10.addTarget(r0, r1, r5, r2)
            goto L45f
        L331:
            r9 = 0
            if (r8 == 0) goto L397
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r7)
            if (r0 == 0) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r4]
            int r2 = r2.getMargin()
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            r10.addTarget(r0, r1, r5, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L363
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.baselineDimension
            r10.addTarget(r0, r1, r5, r2)
        L363:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L45f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L45f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.dimensionBehavior
            if (r2 != r1) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            r0.updateDelegate = r10
            goto L45f
        L397:
            r4 = r1[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r4.mTarget
            r8 = -1
            if (r7 == 0) goto L3d0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r4)
            if (r0 == 0) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            r10.addTarget(r0, r1, r8, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.baselineDimension
            r10.addTarget(r0, r1, r5, r2)
            goto L45f
        L3d0:
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mTarget
            if (r3 == 0) goto L3f4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.getTarget(r1)
            if (r0 == 0) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.baseline
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.baselineDimension
            r10.addTarget(r0, r1, r8, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            r10.addTarget(r0, r1, r5, r2)
            goto L45f
        L3f4:
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.Helper
            if (r1 != 0) goto L45f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L45f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.widget
            int r2 = r2.getY()
            r10.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.dimension
            r10.addTarget(r0, r1, r5, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L42d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.baseline
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r10.baselineDimension
            r10.addTarget(r0, r1, r5, r2)
        L42d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L45f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L45f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.dimensionBehavior
            if (r2 != r1) goto L45f
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r10.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            r0.updateDelegate = r10
        L45f:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 != 0) goto L46d
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r10.dimension
            r0.readyToSolve = r5
        L46d:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.start
            boolean r1 = r0.resolved
            if (r1 == 0) goto Ld
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.widget
            int r0 = r0.value
            r1.setY(r0)
        Ld:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void clear() {
            r1 = this;
            r0 = 0
            r1.runGroup = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.start
            r0.clear()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.end
            r0.clear()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.baseline
            r0.clear()
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r1.dimension
            r0.clear()
            r0 = 0
            r1.resolved = r0
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void reset() {
            r2 = this;
            r0 = 0
            r2.resolved = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.start
            r1.clear()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.start
            r1.resolved = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.end
            r1.clear()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.end
            r1.resolved = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.baseline
            r1.clear()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.baseline
            r1.resolved = r0
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r2.dimension
            r1.resolved = r0
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
            r3 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r3.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 1
            if (r0 != r1) goto L10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r3.widget
            int r0 = r0.mMatchConstraintDefaultHeight
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VerticalRun "
            r0.append(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.getDebugName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r7) {
            r6 = this;
            int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = r6.mRunType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L22
            if (r0 == r2) goto L1e
            if (r0 == r1) goto L14
            goto L25
        L14:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mBottom
            r6.updateRunCenter(r7, r1, r0, r3)
            return
        L1e:
            r6.updateRunEnd(r7)
            goto L25
        L22:
            r6.updateRunStart(r7)
        L25:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r0 = r7.readyToSolve
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            if (r0 == 0) goto La9
            boolean r7 = r7.resolved
            if (r7 != 0) goto La9
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r0) goto La9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            int r0 = r7.mMatchConstraintDefaultHeight
            if (r0 == r2) goto L8b
            if (r0 == r1) goto L41
            goto La9
        L41:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto La9
            int r7 = r7.getDimensionRatioSide()
            r0 = -1
            if (r7 == r0) goto L77
            if (r7 == 0) goto L67
            if (r7 == r3) goto L56
            r7 = 0
            goto L85
        L56:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r7 = r7.getDimensionRatio()
        L63:
            float r0 = r0 / r7
        L64:
            float r0 = r0 + r4
            int r7 = (int) r0
            goto L85
        L67:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r7 = r7.getDimensionRatio()
            float r0 = r0 * r7
            goto L64
        L77:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r7 = r7.getDimensionRatio()
            goto L63
        L85:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.resolve(r7)
            goto La9
        L8b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.getParent()
            if (r7 == 0) goto La9
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r7 = r7.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r7.dimension
            boolean r0 = r7.resolved
            if (r0 == 0) goto La9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r6.widget
            float r0 = r0.mMatchConstraintPercentHeight
            int r7 = r7.value
            float r7 = (float) r7
            float r7 = r7 * r0
            float r7 = r7 + r4
            int r7 = (int) r7
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.resolve(r7)
        La9:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            boolean r0 = r7.readyToSolve
            if (r0 == 0) goto L1d0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.end
            boolean r1 = r0.readyToSolve
            if (r1 != 0) goto Lb7
            goto L1d0
        Lb7:
            boolean r7 = r7.resolved
            if (r7 == 0) goto Lc7
            boolean r7 = r0.resolved
            if (r7 == 0) goto Lc7
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto Lc7
            goto L1d0
        Lc7:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L111
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r0) goto L111
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            int r0 = r7.mMatchConstraintDefaultWidth
            if (r0 != 0) goto L111
            boolean r7 = r7.isInVerticalChain()
            if (r7 != 0) goto L111
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r7 = r7.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r6.start
            int r2 = r1.margin
            int r7 = r7 + r2
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r6.end
            int r2 = r2.margin
            int r0 = r0 + r2
            int r2 = r0 - r7
            r1.resolve(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.end
            r7.resolve(r0)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            r7.resolve(r2)
            return
        L111:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L165
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r0) goto L165
            int r7 = r6.matchConstraintsType
            if (r7 != r3) goto L165
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L165
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L165
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r7 = r7.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r6.start
            int r1 = r1.margin
            int r7 = r7 + r1
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r6.end
            int r1 = r1.margin
            int r0 = r0 + r1
            int r0 = r0 - r7
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            int r1 = r7.wrapValue
            if (r0 >= r1) goto L162
            r7.resolve(r0)
            goto L165
        L162:
            r7.resolve(r1)
        L165:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L16c
            goto L1d0
        L16c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L1d0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L1d0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r0
            int r1 = r7.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r6.start
            int r2 = r2.margin
            int r1 = r1 + r2
            int r2 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r6.end
            int r3 = r3.margin
            int r2 = r2 + r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r6.widget
            float r3 = r3.getVerticalBiasPercent()
            if (r7 != r0) goto L1b0
            int r1 = r7.value
            int r2 = r0.value
            r3 = 1056964608(0x3f000000, float:0.5)
        L1b0:
            int r2 = r2 - r1
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r7 = r6.dimension
            int r7 = r7.value
            int r2 = r2 - r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.start
            float r0 = (float) r1
            float r0 = r0 + r4
            float r1 = (float) r2
            float r1 = r1 * r3
            float r0 = r0 + r1
            int r0 = (int) r0
            r7.resolve(r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.start
            int r0 = r0.value
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r6.dimension
            int r1 = r1.value
            int r0 = r0 + r1
            r7.resolve(r0)
        L1d0:
            return
    }
}
