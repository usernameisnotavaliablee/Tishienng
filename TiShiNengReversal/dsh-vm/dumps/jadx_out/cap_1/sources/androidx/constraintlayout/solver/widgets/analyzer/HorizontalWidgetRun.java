package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class HorizontalWidgetRun extends androidx.constraintlayout.solver.widgets.analyzer.WidgetRun {
    private static int[] tempDimensions;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType = null;

        static {
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType = r0
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions = r0
            return
    }

    public HorizontalWidgetRun(androidx.constraintlayout.solver.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r1.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.LEFT
            r2.type = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r1.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.RIGHT
            r2.type = r0
            r2 = 0
            r1.orientation = r2
            return
    }

    private void computeInsetRatio(int[] r3, int r4, int r5, int r6, int r7, float r8, int r9) {
            r2 = this;
            int r5 = r5 - r4
            int r7 = r7 - r6
            r4 = -1
            r6 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r9 == r4) goto L22
            if (r9 == 0) goto L18
            if (r9 == r1) goto Le
            goto L38
        Le:
            float r4 = (float) r5
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r5
            r3[r1] = r4
            return
        L18:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r4
            r3[r1] = r7
            return
        L22:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            float r9 = (float) r5
            float r9 = r9 / r8
            float r9 = r9 + r0
            int r8 = (int) r9
            if (r4 > r5) goto L32
            r3[r6] = r4
            r3[r1] = r7
            return
        L32:
            if (r8 > r7) goto L38
            r3[r6] = r5
            r3[r1] = r8
        L38:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void apply() {
            r7 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            boolean r1 = r0.measured
            if (r1 == 0) goto Lf
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            int r0 = r0.getWidth()
            r1.resolve(r0)
        Lf:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L8c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getHorizontalDimensionBehaviour()
            r7.dimensionBehavior = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto Lcc
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L7a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L35
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto L3b
        L35:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            if (r2 != r1) goto L7a
        L3b:
            int r1 = r0.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mLeft
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mRight
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r3 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mLeft
            int r4 = r4.getMargin()
            r7.addTarget(r2, r3, r4)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mRight
            int r3 = r3.getMargin()
            int r3 = -r3
            r7.addTarget(r2, r0, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.resolve(r1)
            return
        L7a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto Lcc
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            int r1 = r1.getWidth()
            r0.resolve(r1)
            goto Lcc
        L8c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Lcc
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto La2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto La8
        La2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            if (r2 != r1) goto Lcc
        La8:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mLeft
            int r3 = r3.getMargin()
            r7.addTarget(r1, r2, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mRight
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
            return
        Lcc:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            boolean r1 = r0.resolved
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1cf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            boolean r4 = r1.measured
            if (r4 == 0) goto L1cf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r1.mListAnchors
            r4 = r0[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r4.mTarget
            if (r5 == 0) goto L14c
            r6 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L14c
            boolean r0 = r1.isInHorizontalChain()
            if (r0 == 0) goto L10c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r3]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            return
        L10c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L127
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r7.addTarget(r1, r0, r2)
        L127:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L143
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r3]
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
        L143:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.start
            r0.delegateToWidgetRun = r3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            r0.delegateToWidgetRun = r3
            return
        L14c:
            if (r5 == 0) goto L16f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r4)
            if (r0 == 0) goto L3c7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r2 = r3[r2]
            int r2 = r2.getMargin()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            r7.addTarget(r0, r1, r2)
            return
        L16f:
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L198
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L3c7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r3]
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            int r2 = -r2
            r7.addTarget(r0, r1, r2)
            return
        L198:
            boolean r0 = r1 instanceof androidx.constraintlayout.solver.widgets.Helper
            if (r0 != 0) goto L3c7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 == 0) goto L3c7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L3c7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getX()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            r7.addTarget(r0, r1, r2)
            return
        L1cf:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r7.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r4) goto L304
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            int r4 = r1.mMatchConstraintDefaultWidth
            r5 = 2
            if (r4 == r5) goto L2d7
            r5 = 3
            if (r4 == r5) goto L1e1
            goto L304
        L1e1:
            int r4 = r1.mMatchConstraintDefaultHeight
            if (r4 != r5) goto L286
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r7.start
            r4.updateDelegate = r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r7.end
            r4.updateDelegate = r7
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r4 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r4.start
            r5.updateDelegate = r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.end
            r4.updateDelegate = r7
            r0.updateDelegate = r7
            boolean r0 = r1.isInVerticalChain()
            if (r0 == 0) goto L253
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r0.dimension
            r1.updateDelegate = r7
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r1.add(r0)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            goto L304
        L253:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L277
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            goto L304
        L277:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            goto L304
        L286:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            r0.add(r1)
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r1.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.delegateToWidgetRun = r3
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            goto L304
        L2d7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 != 0) goto L2de
            goto L304
        L2de:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.delegateToWidgetRun = r3
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            r0.add(r1)
        L304:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            r4 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r4.mTarget
            if (r5 == 0) goto L357
            r6 = r1[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L357
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L338
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r3]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            return
        L338:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.getTarget(r1)
            r0.addDependency(r7)
            r1.addDependency(r7)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER
            r7.mRunType = r0
            return
        L357:
            if (r5 == 0) goto L378
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r4)
            if (r0 == 0) goto L3c7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r7.dimension
            r7.addTarget(r0, r1, r3, r2)
            return
        L378:
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mTarget
            if (r2 == 0) goto L39f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.getTarget(r1)
            if (r0 == 0) goto L3c7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r3]
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.end
            r2 = -1
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r7.dimension
            r7.addTarget(r0, r1, r2, r3)
            return
        L39f:
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.Helper
            if (r1 != 0) goto L3c7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L3c7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getX()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r7.dimension
            r7.addTarget(r0, r1, r3, r2)
        L3c7:
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
            r1.setX(r0)
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
            int r0 = r0.mMatchConstraintDefaultWidth
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
            java.lang.String r1 = "HorizontalRun "
            r0.append(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.getDebugName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r14) {
            r13 = this;
            int[] r1 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$analyzer$WidgetRun$RunType
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r2 = r13.mRunType
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 3
            r8 = 0
            r9 = 1
            if (r1 == r9) goto L23
            if (r1 == r2) goto L1f
            if (r1 == r3) goto L15
            goto L26
        L15:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mRight
            r13.updateRunCenter(r14, r2, r1, r8)
            return
        L1f:
            r13.updateRunEnd(r14)
            goto L26
        L23:
            r13.updateRunStart(r14)
        L26:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            boolean r1 = r1.resolved
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r1 != 0) goto L30f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r13.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r4) goto L30f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            int r4 = r1.mMatchConstraintDefaultWidth
            if (r4 == r2) goto L2f1
            if (r4 == r3) goto L3e
            goto L30f
        L3e:
            int r2 = r1.mMatchConstraintDefaultHeight
            r4 = -1
            if (r2 == 0) goto L88
            if (r2 != r3) goto L46
            goto L88
        L46:
            int r1 = r1.getDimensionRatioSide()
            if (r1 == r4) goto L73
            if (r1 == 0) goto L64
            if (r1 == r9) goto L52
            r1 = 0
            goto L81
        L52:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r2 = r2.value
            float r2 = (float) r2
            float r1 = r1.getDimensionRatio()
        L5f:
            float r2 = r2 * r1
        L61:
            float r2 = r2 + r10
            int r1 = (int) r2
            goto L81
        L64:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r2 = r2.value
            float r2 = (float) r2
            float r1 = r1.getDimensionRatio()
            float r2 = r2 / r1
            goto L61
        L73:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r2 = r2.value
            float r2 = (float) r2
            float r1 = r1.getDimensionRatio()
            goto L5f
        L81:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r13.dimension
            r2.resolve(r1)
            goto L30f
        L88:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r2.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r12 = r2.end
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L96
            r2 = 1
            goto L97
        L96:
            r2 = 0
        L97:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L9f
            r3 = 1
            goto La0
        L9f:
            r3 = 0
        La0:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto La8
            r5 = 1
            goto La9
        La8:
            r5 = 0
        La9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto Lb1
            r6 = 1
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            int r7 = r1.getDimensionRatioSide()
            if (r2 == 0) goto L1ec
            if (r3 == 0) goto L1ec
            if (r5 == 0) goto L1ec
            if (r6 == 0) goto L1ec
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            float r6 = r1.getDimensionRatio()
            boolean r1 = r11.resolved
            if (r1 == 0) goto L123
            boolean r1 = r12.resolved
            if (r1 == 0) goto L123
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            boolean r2 = r1.readyToSolve
            if (r2 == 0) goto L432
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            boolean r2 = r2.readyToSolve
            if (r2 != 0) goto Lda
            goto L432
        Lda:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.start
            int r2 = r2.margin
            int r2 = r2 + r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.end
            int r3 = r3.margin
            int r3 = r1 - r3
            int r1 = r11.value
            int r4 = r11.margin
            int r4 = r4 + r1
            int r1 = r12.value
            int r5 = r12.margin
            int r5 = r1 - r5
            int[] r1 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r13
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            int[] r2 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r2 = r2[r8]
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int[] r2 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r2 = r2[r9]
            r1.resolve(r2)
            return
        L123:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L17c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            boolean r3 = r2.resolved
            if (r3 == 0) goto L17c
            boolean r3 = r11.readyToSolve
            if (r3 == 0) goto L432
            boolean r3 = r12.readyToSolve
            if (r3 != 0) goto L139
            goto L432
        L139:
            int r3 = r1.value
            int r1 = r1.margin
            int r3 = r3 + r1
            int r1 = r2.value
            int r2 = r2.margin
            int r1 = r1 - r2
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r11.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r4 = r11.margin
            int r4 = r4 + r2
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r12.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r5 = r12.margin
            int r5 = r2 - r5
            r2 = r3
            r3 = r1
            int[] r1 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r13
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            int[] r2 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r2 = r2[r8]
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int[] r2 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r2 = r2[r9]
            r1.resolve(r2)
        L17c:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            boolean r2 = r1.readyToSolve
            if (r2 == 0) goto L432
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            boolean r2 = r2.readyToSolve
            if (r2 == 0) goto L432
            boolean r2 = r11.readyToSolve
            if (r2 == 0) goto L432
            boolean r2 = r12.readyToSolve
            if (r2 != 0) goto L192
            goto L432
        L192:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.start
            int r2 = r2.margin
            int r2 = r2 + r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.end
            int r3 = r3.margin
            int r3 = r1 - r3
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r11.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            int r4 = r11.margin
            int r4 = r4 + r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r12.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            int r5 = r12.margin
            int r5 = r1 - r5
            int[] r1 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r13
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            int[] r2 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r2 = r2[r8]
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int[] r2 = androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r2 = r2[r9]
            r1.resolve(r2)
            goto L30f
        L1ec:
            if (r2 == 0) goto L276
            if (r5 == 0) goto L276
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            boolean r1 = r1.readyToSolve
            if (r1 == 0) goto L432
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.end
            boolean r1 = r1.readyToSolve
            if (r1 != 0) goto L1fe
            goto L432
        L1fe:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            float r1 = r1.getDimensionRatio()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.start
            int r3 = r3.margin
            int r2 = r2 + r3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r3 = r3.targets
            java.lang.Object r3 = r3.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r3
            int r3 = r3.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r13.end
            int r5 = r5.margin
            int r3 = r3 - r5
            if (r7 == r4) goto L252
            if (r7 == 0) goto L252
            if (r7 == r9) goto L22e
            goto L30f
        L22e:
            int r3 = r3 - r2
            int r2 = r13.getLimitedDimension(r3, r8)
            float r3 = (float) r2
            float r3 = r3 / r1
            float r3 = r3 + r10
            int r3 = (int) r3
            int r4 = r13.getLimitedDimension(r3, r9)
            if (r3 == r4) goto L242
            float r2 = (float) r4
            float r2 = r2 * r1
            float r2 = r2 + r10
            int r2 = (int) r2
        L242:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r1.resolve(r4)
            goto L30f
        L252:
            int r3 = r3 - r2
            int r2 = r13.getLimitedDimension(r3, r8)
            float r3 = (float) r2
            float r3 = r3 * r1
            float r3 = r3 + r10
            int r3 = (int) r3
            int r4 = r13.getLimitedDimension(r3, r9)
            if (r3 == r4) goto L266
            float r2 = (float) r4
            float r2 = r2 / r1
            float r2 = r2 + r10
            int r2 = (int) r2
        L266:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r1.resolve(r4)
            goto L30f
        L276:
            if (r3 == 0) goto L30f
            if (r6 == 0) goto L30f
            boolean r1 = r11.readyToSolve
            if (r1 == 0) goto L432
            boolean r1 = r12.readyToSolve
            if (r1 != 0) goto L284
            goto L432
        L284:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            float r1 = r1.getDimensionRatio()
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r11.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r3 = r11.margin
            int r2 = r2 + r3
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r3 = r12.targets
            java.lang.Object r3 = r3.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r3
            int r3 = r3.value
            int r5 = r12.margin
            int r3 = r3 - r5
            if (r7 == r4) goto L2ce
            if (r7 == 0) goto L2ab
            if (r7 == r9) goto L2ce
            goto L30f
        L2ab:
            int r3 = r3 - r2
            int r2 = r13.getLimitedDimension(r3, r9)
            float r3 = (float) r2
            float r3 = r3 * r1
            float r3 = r3 + r10
            int r3 = (int) r3
            int r4 = r13.getLimitedDimension(r3, r8)
            if (r3 == r4) goto L2bf
            float r2 = (float) r4
            float r2 = r2 / r1
            float r2 = r2 + r10
            int r2 = (int) r2
        L2bf:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            r1.resolve(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r1.resolve(r2)
            goto L30f
        L2ce:
            int r3 = r3 - r2
            int r2 = r13.getLimitedDimension(r3, r9)
            float r3 = (float) r2
            float r3 = r3 / r1
            float r3 = r3 + r10
            int r3 = (int) r3
            int r4 = r13.getLimitedDimension(r3, r8)
            if (r3 == r4) goto L2e2
            float r2 = (float) r4
            float r2 = r2 * r1
            float r2 = r2 + r10
            int r2 = (int) r2
        L2e2:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            r1.resolve(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r1.resolve(r2)
            goto L30f
        L2f1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.getParent()
            if (r1 == 0) goto L30f
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r1.dimension
            boolean r2 = r1.resolved
            if (r2 == 0) goto L30f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r13.widget
            float r2 = r2.mMatchConstraintPercentWidth
            int r1 = r1.value
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r10
            int r1 = (int) r1
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r13.dimension
            r2.resolve(r1)
        L30f:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            boolean r2 = r1.readyToSolve
            if (r2 == 0) goto L432
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            boolean r3 = r2.readyToSolve
            if (r3 != 0) goto L31d
            goto L432
        L31d:
            boolean r1 = r1.resolved
            if (r1 == 0) goto L32d
            boolean r1 = r2.resolved
            if (r1 == 0) goto L32d
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            boolean r1 = r1.resolved
            if (r1 == 0) goto L32d
            goto L432
        L32d:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            boolean r1 = r1.resolved
            if (r1 != 0) goto L377
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r13.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L377
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.widget
            int r2 = r1.mMatchConstraintDefaultWidth
            if (r2 != 0) goto L377
            boolean r1 = r1.isInHorizontalChain()
            if (r1 != 0) goto L377
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.start
            int r4 = r3.margin
            int r1 = r1 + r4
            int r2 = r2.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r13.end
            int r4 = r4.margin
            int r2 = r2 + r4
            int r4 = r2 - r1
            r3.resolve(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.end
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            r1.resolve(r4)
            return
        L377:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            boolean r1 = r1.resolved
            if (r1 != 0) goto L3db
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r13.dimensionBehavior
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L3db
            int r1 = r13.matchConstraintsType
            if (r1 != r9) goto L3db
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            int r1 = r1.size()
            if (r1 <= 0) goto L3db
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            int r1 = r1.size()
            if (r1 <= 0) goto L3db
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r1 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.start
            int r3 = r3.margin
            int r1 = r1 + r3
            int r2 = r2.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r13.end
            int r3 = r3.margin
            int r2 = r2 + r3
            int r2 = r2 - r1
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            int r1 = r1.wrapValue
            int r1 = java.lang.Math.min(r2, r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r13.widget
            int r3 = r2.mMatchConstraintMaxWidth
            int r2 = r2.mMatchConstraintMinWidth
            int r1 = java.lang.Math.max(r2, r1)
            if (r3 <= 0) goto L3d6
            int r1 = java.lang.Math.min(r3, r1)
        L3d6:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r2 = r13.dimension
            r2.resolve(r1)
        L3db:
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            boolean r1 = r1.resolved
            if (r1 != 0) goto L3e2
            goto L432
        L3e2:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r8)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r3 = r1.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r13.start
            int r4 = r4.margin
            int r3 = r3 + r4
            int r4 = r2.value
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r13.end
            int r5 = r5.margin
            int r4 = r4 + r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r13.widget
            float r5 = r5.getHorizontalBiasPercent()
            if (r1 != r2) goto L412
            int r3 = r1.value
            int r4 = r2.value
            r5 = 1056964608(0x3f000000, float:0.5)
        L412:
            int r4 = r4 - r3
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r1 = r13.dimension
            int r1 = r1.value
            int r4 = r4 - r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.start
            float r2 = (float) r3
            float r2 = r2 + r10
            float r3 = (float) r4
            float r3 = r3 * r5
            float r2 = r2 + r3
            int r2 = (int) r2
            r1.resolve(r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r13.end
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r13.start
            int r2 = r2.value
            androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency r3 = r13.dimension
            int r3 = r3.value
            int r2 = r2 + r3
            r1.resolve(r2)
        L432:
            return
    }
}
