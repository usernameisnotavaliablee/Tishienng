package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class HelperReferences extends androidx.constraintlayout.solver.widgets.analyzer.WidgetRun {
    public HelperReferences(androidx.constraintlayout.solver.widgets.ConstraintWidget r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void addDependency(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            r0.add(r2)
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.start
            r2.add(r0)
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void apply() {
            r7 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r1 == 0) goto L11f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            r2 = 1
            r1.delegateToWidgetRun = r2
            androidx.constraintlayout.solver.widgets.Barrier r0 = (androidx.constraintlayout.solver.widgets.Barrier) r0
            int r1 = r0.getBarrierType()
            boolean r3 = r0.allowsGoneWidget()
            r4 = 8
            r5 = 0
            if (r1 == 0) goto Le1
            if (r1 == r2) goto La2
            r2 = 2
            if (r1 == r2) goto L63
            r2 = 3
            if (r1 == r2) goto L24
            goto L11f
        L24:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.BOTTOM
            r1.type = r2
        L2a:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto L50
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto L3b
            int r2 = r1.getVisibility()
            if (r2 != r4) goto L3b
            goto L4d
        L3b:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        L4d:
            int r5 = r5 + 1
            goto L2a
        L50:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
            return
        L63:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.TOP
            r1.type = r2
        L69:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto L8f
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto L7a
            int r2 = r1.getVisibility()
            if (r2 != r4) goto L7a
            goto L8c
        L7a:
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        L8c:
            int r5 = r5 + 1
            goto L69
        L8f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
            return
        La2:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.RIGHT
            r1.type = r2
        La8:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto Lce
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto Lb9
            int r2 = r1.getVisibility()
            if (r2 != r4) goto Lb9
            goto Lcb
        Lb9:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        Lcb:
            int r5 = r5 + 1
            goto La8
        Lce:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
            return
        Le1:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.LEFT
            r1.type = r2
        Le7:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto L10d
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto Lf8
            int r2 = r1.getVisibility()
            if (r2 != r4) goto Lf8
            goto L10a
        Lf8:
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        L10a:
            int r5 = r5 + 1
            goto Le7
        L10d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
        L11f:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.widget
            boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.Barrier
            if (r1 == 0) goto L25
            androidx.constraintlayout.solver.widgets.Barrier r0 = (androidx.constraintlayout.solver.widgets.Barrier) r0
            int r0 = r0.getBarrierType()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 != r1) goto L12
            goto L1c
        L12:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setY(r1)
            return
        L1c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setX(r1)
        L25:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void clear() {
            r1 = this;
            r0 = 0
            r1.runGroup = r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.start
            r0.clear()
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void reset() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.start
            r1 = 0
            r0.resolved = r1
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r7) {
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.solver.widgets.Barrier r7 = (androidx.constraintlayout.solver.widgets.Barrier) r7
            int r0 = r7.getBarrierType()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r6.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
            r3 = 0
            r4 = -1
        L13:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r5 = r1.next()
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r5
            int r5 = r5.value
            if (r4 == r2) goto L25
            if (r5 >= r4) goto L26
        L25:
            r4 = r5
        L26:
            if (r3 >= r5) goto L13
            r3 = r5
            goto L13
        L2a:
            if (r0 == 0) goto L3b
            r1 = 2
            if (r0 != r1) goto L30
            goto L3b
        L30:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.start
            int r7 = r7.getMargin()
            int r3 = r3 + r7
            r0.resolve(r3)
            return
        L3b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r6.start
            int r7 = r7.getMargin()
            int r4 = r4 + r7
            r0.resolve(r4)
            return
    }
}
