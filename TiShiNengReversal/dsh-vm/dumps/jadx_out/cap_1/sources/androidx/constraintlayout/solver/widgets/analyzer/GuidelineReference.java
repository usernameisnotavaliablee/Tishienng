package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class GuidelineReference extends androidx.constraintlayout.solver.widgets.analyzer.WidgetRun {
    public GuidelineReference(androidx.constraintlayout.solver.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r2.horizontalRun
            r0.clear()
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r2.verticalRun
            r0.clear()
            androidx.constraintlayout.solver.widgets.Guideline r2 = (androidx.constraintlayout.solver.widgets.Guideline) r2
            int r2 = r2.getOrientation()
            r1.orientation = r2
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
            r5 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.Guideline r0 = (androidx.constraintlayout.solver.widgets.Guideline) r0
            int r1 = r0.getRelativeBegin()
            int r2 = r0.getRelativeEnd()
            r0.getRelativePercent()
            int r0 = r0.getOrientation()
            r3 = -1
            r4 = 1
            if (r0 != r4) goto L95
            if (r1 == r3) goto L3c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mParent
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r2 = r2.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.start
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.start
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            r0.margin = r1
            goto L82
        L3c:
            if (r2 == r3) goto L62
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            int r1 = -r2
            r0.margin = r1
            goto L82
        L62:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            r0.delegateToWidgetRun = r4
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
        L82:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r5.addDependency(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            r5.addDependency(r0)
            return
        L95:
            if (r1 == r3) goto Lba
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mParent
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r2 = r2.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.start
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r5.start
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            r0.margin = r1
            goto L100
        Lba:
            if (r2 == r3) goto Le0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            int r1 = -r2
            r0.margin = r1
            goto L100
        Le0:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r5.start
            r0.delegateToWidgetRun = r4
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
        L100:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.start
            r5.addDependency(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.end
            r5.addDependency(r0)
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.solver.widgets.Guideline r0 = (androidx.constraintlayout.solver.widgets.Guideline) r0
            int r0 = r0.getOrientation()
            r1 = 1
            if (r0 != r1) goto L15
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setX(r1)
            return
        L15:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setY(r1)
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    void clear() {
            r1 = this;
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
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r2.end
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
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r1.start
            boolean r0 = r2.readyToSolve
            if (r0 != 0) goto L7
            goto Lb
        L7:
            boolean r0 = r2.resolved
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> r2 = r2.targets
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.widget
            androidx.constraintlayout.solver.widgets.Guideline r0 = (androidx.constraintlayout.solver.widgets.Guideline) r0
            int r2 = r2.value
            float r2 = (float) r2
            float r0 = r0.getRelativePercent()
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r1.start
            r0.resolve(r2)
            return
    }
}
