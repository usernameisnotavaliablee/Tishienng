package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class DimensionDependency extends androidx.constraintlayout.solver.widgets.analyzer.DependencyNode {
    public int wrapValue;

    public DimensionDependency(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun
            if (r1 == 0) goto Lc
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r1 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.HORIZONTAL_DIMENSION
            r0.type = r1
            return
        Lc:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type r1 = androidx.constraintlayout.solver.widgets.analyzer.DependencyNode.Type.VERTICAL_DIMENSION
            r0.type = r1
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
    public void resolve(int r2) {
            r1 = this;
            boolean r0 = r1.resolved
            if (r0 == 0) goto L5
            goto L20
        L5:
            r0 = 1
            r1.resolved = r0
            r1.value = r2
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.Dependency> r2 = r1.dependencies
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            androidx.constraintlayout.solver.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.solver.widgets.analyzer.Dependency) r0
            r0.update(r0)
            goto L10
        L20:
            return
    }
}
