package com.bytedance.adsdk.ugeno.yoga;

@com.bytedance.adsdk.ugeno.yoga.j.j
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class YogaNodeJNIBase extends com.bytedance.adsdk.ugeno.yoga.oq implements java.lang.Cloneable {
    private boolean ae;

    @com.bytedance.adsdk.ugeno.yoga.j.j
    private float[] arr;
    private java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> cw;
    protected long j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.Object f2042m;

    @com.bytedance.adsdk.ugeno.yoga.j.j
    private int mLayoutDirection;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.ae f2043r;
    private com.bytedance.adsdk.ugeno.yoga.xt up;
    private com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase xt;

    YogaNodeJNIBase() {
            r2 = this;
            long r0 = com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeNewJNI()
            r2.<init>(r0)
            return
    }

    private YogaNodeJNIBase(long r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.arr = r0
            r0 = 0
            r3.mLayoutDirection = r0
            r0 = 1
            r3.ae = r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L15
            r3.j = r4
            return
        L15:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Failed to allocate native memory"
            r4.<init>(r5)
            throw r4
    }

    @com.bytedance.adsdk.ugeno.yoga.j.j
    private final long replaceChild(com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r2, int r3) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r1.cw
            if (r0 == 0) goto L11
            r0.remove(r3)
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r1.cw
            r0.add(r3, r2)
            r2.xt = r1
            long r2 = r2.j
            return r2
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot replace child. YogaNode does not have children"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public float ae() {
            r2 = this;
            float[] r0 = r2.arr
            if (r0 == 0) goto L8
            r1 = 4
            r0 = r0[r1]
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void ae(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetHeightPercentJNI(r0, r3)
            return
    }

    @com.bytedance.adsdk.ugeno.yoga.j.j
    public final float baseline(float r2, float r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.xt r0 = r1.up
            float r2 = r0.j(r1, r2, r3)
            return r2
    }

    public com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase cw(int r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r1.cw
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r2 = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) r2
            return r2
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "YogaNode does not have children"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void cw() {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void cw(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexBasisJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void cw(com.bytedance.adsdk.ugeno.yoga.j r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAlignContentJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void cw(com.bytedance.adsdk.ugeno.yoga.r r3, float r4) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetPositionJNI(r0, r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public float g() {
            r2 = this;
            float[] r0 = r2.arr
            if (r0 == 0) goto L8
            r1 = 2
            r0 = r0[r1]
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void g(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMinHeightJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public int j() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r1.cw
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public int j(com.bytedance.adsdk.ugeno.yoga.oq r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r1.cw
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public /* synthetic */ com.bytedance.adsdk.ugeno.yoga.oq j(int r1) {
            r0 = this;
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r1 = r0.cw(r1)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexGrowJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(float r9, float r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            r1 = 0
            r2 = 0
        La:
            int r3 = r0.size()
            if (r2 >= r3) goto L31
            java.lang.Object r3 = r0.get(r2)
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r3 = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) r3
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r3 = r3.cw
            if (r3 == 0) goto L2e
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r3.next()
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r4 = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) r4
            r0.add(r4)
            goto L1e
        L2e:
            int r2 = r2 + 1
            goto La
        L31:
            int r2 = r0.size()
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[] r2 = new com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            r7 = r0
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[] r7 = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[]) r7
            int r0 = r7.length
            long[] r6 = new long[r0]
        L41:
            int r0 = r7.length
            if (r1 >= r0) goto L4d
            r0 = r7[r1]
            long r2 = r0.j
            r6[r1] = r2
            int r1 = r1 + 1
            goto L41
        L4d:
            long r2 = r8.j
            r4 = r9
            r5 = r10
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeCalculateLayoutJNI(r2, r4, r5, r6, r7)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.ae r3) {
            r2 = this;
            r2.f2043r = r3
            long r0 = r2.j
            if (r3 == 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeSetHasMeasureFuncJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.cw r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetDirectionJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.j r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAlignItemsJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.jy r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetPositionTypeJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.m r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetJustifyContentJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.oq r5, int r6) {
            r4 = this;
            boolean r0 = r5 instanceof com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase
            if (r0 != 0) goto L5
            return
        L5:
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r5 = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) r5
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r0 = r5.xt
            if (r0 != 0) goto L26
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r4.cw
            if (r0 != 0) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r4.cw = r0
        L17:
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r4.cw
            r0.add(r6, r5)
            r5.xt = r4
            long r0 = r4.j
            long r2 = r5.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeInsertChildJNI(r0, r2, r6)
            return
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Child already has a parent, it must be removed first."
            r5.<init>(r6)
            throw r5
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.r r3, float r4) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMarginJNI(r0, r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.up r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(com.bytedance.adsdk.ugeno.yoga.ws r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexWrapJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(java.lang.Object r1) {
            r0 = this;
            r0.f2042m = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void j(boolean r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public float m() {
            r2 = this;
            float[] r0 = r2.arr
            if (r0 == 0) goto L8
            r1 = 3
            r0 = r0[r1]
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void m(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetHeightJNI(r0, r3)
            return
    }

    @com.bytedance.adsdk.ugeno.yoga.j.j
    public final long measure(float r8, int r9, float r10, int r11) {
            r7 = this;
            boolean r0 = r7.vl()
            if (r0 == 0) goto L18
            com.bytedance.adsdk.ugeno.yoga.ae r1 = r7.f2043r
            com.bytedance.adsdk.ugeno.yoga.tl r4 = com.bytedance.adsdk.ugeno.yoga.tl.j(r9)
            com.bytedance.adsdk.ugeno.yoga.tl r6 = com.bytedance.adsdk.ugeno.yoga.tl.j(r11)
            r2 = r7
            r3 = r8
            r5 = r10
            long r8 = r1.j(r2, r3, r4, r5, r6)
            return r8
        L18:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Measure function isn't defined!"
            r8.<init>(r9)
            throw r8
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public java.lang.Object oq() {
            r1 = this;
            java.lang.Object r0 = r1.f2042m
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void oq(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMaxWidthJNI(r0, r3)
            return
    }

    public com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase qv() {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void qv(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMaxHeightJNI(r0, r3)
            return
    }

    public com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r(int r5) {
            r4 = this;
            java.util.List<com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase> r0 = r4.cw
            if (r0 == 0) goto L15
            java.lang.Object r5 = r0.remove(r5)
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r5 = (com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase) r5
            r0 = 0
            r5.xt = r0
            long r0 = r4.j
            long r2 = r5.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeRemoveChildJNI(r0, r2)
            return r5
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Trying to remove a child of a YogaNode that does not have children"
            r5.<init>(r0)
            throw r5
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void r() {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetWidthAutoJNI(r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void r(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetWidthJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public float tl() {
            r2 = this;
            float[] r0 = r2.arr
            if (r0 == 0) goto L8
            r1 = 1
            r0 = r0[r1]
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void tl(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetMinWidthJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void up() {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetHeightAutoJNI(r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void up(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetWidthPercentJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void vl(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAspectRatioJNI(r0, r3)
            return
    }

    public boolean vl() {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.ae r0 = r1.f2043r
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public /* synthetic */ com.bytedance.adsdk.ugeno.yoga.oq xt() {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r0 = r1.qv()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public /* synthetic */ com.bytedance.adsdk.ugeno.yoga.oq xt(int r1) {
            r0 = this;
            com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase r1 = r0.r(r1)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void xt(float r3) {
            r2 = this;
            long r0 = r2.j
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void xt(com.bytedance.adsdk.ugeno.yoga.j r3) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetAlignSelfJNI(r0, r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.oq
    public void xt(com.bytedance.adsdk.ugeno.yoga.r r3, float r4) {
            r2 = this;
            long r0 = r2.j
            int r3 = r3.j()
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r0, r3, r4)
            return
    }
}
