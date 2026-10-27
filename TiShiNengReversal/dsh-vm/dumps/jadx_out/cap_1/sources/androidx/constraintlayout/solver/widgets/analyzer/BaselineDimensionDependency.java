package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class BaselineDimensionDependency extends androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency {
    public BaselineDimensionDependency(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void update(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2) {
            r1 = this;
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = r1.run
            r0 = r2
            androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.baseline
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.widget
            int r2 = r2.getBaselineDistance()
            r0.margin = r2
            r2 = 1
            r1.resolved = r2
            return
    }
}
