package com.bytedance.adsdk.ugeno.yoga.widget;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VirtualYogaLayout extends android.view.ViewGroup {
    private final com.bytedance.adsdk.ugeno.yoga.oq cw;
    private final java.util.List<android.view.View> j;
    private final java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> xt;

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r3 = r2 instanceof com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout
            if (r3 == 0) goto L17
            com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout r2 = (com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout) r2
            r2.j(r1)
            com.bytedance.adsdk.ugeno.yoga.oq r2 = r2.getYogaNode()
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r1.cw
            int r4 = r3.j()
            r3.j(r2, r4)
            return
        L17:
            com.bytedance.adsdk.ugeno.yoga.oq r3 = com.bytedance.adsdk.ugeno.yoga.qv.j()
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r0 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j
            r0.<init>(r4)
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j(r0, r3, r2)
            r3.j(r2)
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$xt r4 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$xt
            r4.<init>()
            r3.j(r4)
            com.bytedance.adsdk.ugeno.yoga.oq r4 = r1.cw
            int r0 = r4.j()
            r4.j(r3, r0)
            r1.j(r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r0 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r0 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j
            r0.<init>(r2)
            return r0
    }

    public com.bytedance.adsdk.ugeno.yoga.oq getYogaNode() {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r1.cw
            return r0
    }

    public void j(android.view.View r2, com.bytedance.adsdk.ugeno.yoga.oq r3) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.j
            r0.add(r2)
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r1.xt
            r0.put(r2, r3)
            return
    }

    protected void j(android.view.ViewGroup r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout
            if (r0 == 0) goto L25
            java.util.List<android.view.View> r0 = r4.j
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r2 = r5
            com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout r2 = (com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout) r2
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r3 = r4.xt
            java.lang.Object r3 = r3.get(r1)
            com.bytedance.adsdk.ugeno.yoga.oq r3 = (com.bytedance.adsdk.ugeno.yoga.oq) r3
            r2.j(r1, r3)
            goto La
        L25:
            boolean r0 = r5 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout
            if (r0 == 0) goto L50
            java.util.List<android.view.View> r0 = r4.j
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r2 = r5
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout r2 = (com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout) r2
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r3 = r4.xt
            java.lang.Object r3 = r3.get(r1)
            com.bytedance.adsdk.ugeno.yoga.oq r3 = (com.bytedance.adsdk.ugeno.yoga.oq) r3
            r2.j(r1, r3)
            goto L2f
        L4a:
            java.util.List<android.view.View> r5 = r4.j
            r5.clear()
            return
        L50:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "VirtualYogaLayout cannot transfer children to ViewGroup of type "
            r1.<init>(r2)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            r1.append(r5)
            java.lang.String r5 = ".  Must either be a VirtualYogaLayout or a YogaLayout."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Attempting to layout a VirtualYogaLayout"
            r1.<init>(r2)
            throw r1
    }
}
