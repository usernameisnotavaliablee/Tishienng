package com.bytedance.adsdk.ugeno.yoga;

@com.bytedance.adsdk.ugeno.yoga.j.j
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class YogaNative {
    static {
            java.lang.String r0 = "tt_ugen_layout"
            com.bytedance.sdk.openadsdk.l.m.j(r0)
            return
    }

    public YogaNative() {
            r0 = this;
            r0.<init>()
            return
    }

    static native void jni_YGConfigFreeJNI(long r0);

    static native int jni_YGConfigGetErrataJNI(long r0);

    static native long jni_YGConfigNewJNI();

    static native void jni_YGConfigSetErrataJNI(long r0, int r2);

    static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long r0, int r2, boolean r3);

    static native void jni_YGConfigSetLoggerJNI(long r0, com.bytedance.adsdk.ugeno.yoga.YogaLogger r2);

    static native void jni_YGConfigSetPointScaleFactorJNI(long r0, float r2);

    static native void jni_YGConfigSetUseWebDefaultsJNI(long r0, boolean r2);

    static native void jni_YGNodeCalculateLayoutJNI(long r0, float r2, float r3, long[] r4, com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase[] r5);

    static native long jni_YGNodeCloneJNI(long r0);

    static native void jni_YGNodeCopyStyleJNI(long r0, long r2);

    static native void jni_YGNodeFinalizeJNI(long r0);

    static native void jni_YGNodeInsertChildJNI(long r0, long r2, int r4);

    static native boolean jni_YGNodeIsDirtyJNI(long r0);

    static native boolean jni_YGNodeIsReferenceBaselineJNI(long r0);

    static native void jni_YGNodeMarkDirtyJNI(long r0);

    static native long jni_YGNodeNewJNI();

    static native long jni_YGNodeNewWithConfigJNI(long r0);

    static native void jni_YGNodeRemoveAllChildrenJNI(long r0);

    static native void jni_YGNodeRemoveChildJNI(long r0, long r2);

    static native void jni_YGNodeResetJNI(long r0);

    static native void jni_YGNodeSetAlwaysFormsContainingBlockJNI(long r0, boolean r2);

    static native void jni_YGNodeSetHasBaselineFuncJNI(long r0, boolean r2);

    static native void jni_YGNodeSetHasMeasureFuncJNI(long r0, boolean r2);

    static native void jni_YGNodeSetIsReferenceBaselineJNI(long r0, boolean r2);

    static native void jni_YGNodeSetStyleInputsJNI(long r0, float[] r2, int r3);

    static native int jni_YGNodeStyleGetAlignContentJNI(long r0);

    static native int jni_YGNodeStyleGetAlignItemsJNI(long r0);

    static native int jni_YGNodeStyleGetAlignSelfJNI(long r0);

    static native float jni_YGNodeStyleGetAspectRatioJNI(long r0);

    static native float jni_YGNodeStyleGetBorderJNI(long r0, int r2);

    static native int jni_YGNodeStyleGetBoxSizingJNI(long r0);

    static native int jni_YGNodeStyleGetDirectionJNI(long r0);

    static native int jni_YGNodeStyleGetDisplayJNI(long r0);

    static native long jni_YGNodeStyleGetFlexBasisJNI(long r0);

    static native int jni_YGNodeStyleGetFlexDirectionJNI(long r0);

    static native float jni_YGNodeStyleGetFlexGrowJNI(long r0);

    static native float jni_YGNodeStyleGetFlexJNI(long r0);

    static native float jni_YGNodeStyleGetFlexShrinkJNI(long r0);

    static native int jni_YGNodeStyleGetFlexWrapJNI(long r0);

    static native float jni_YGNodeStyleGetGapJNI(long r0, int r2);

    static native long jni_YGNodeStyleGetHeightJNI(long r0);

    static native int jni_YGNodeStyleGetJustifyContentJNI(long r0);

    static native long jni_YGNodeStyleGetMarginJNI(long r0, int r2);

    static native long jni_YGNodeStyleGetMaxHeightJNI(long r0);

    static native long jni_YGNodeStyleGetMaxWidthJNI(long r0);

    static native long jni_YGNodeStyleGetMinHeightJNI(long r0);

    static native long jni_YGNodeStyleGetMinWidthJNI(long r0);

    static native int jni_YGNodeStyleGetOverflowJNI(long r0);

    static native long jni_YGNodeStyleGetPaddingJNI(long r0, int r2);

    static native long jni_YGNodeStyleGetPositionJNI(long r0, int r2);

    static native int jni_YGNodeStyleGetPositionTypeJNI(long r0);

    static native long jni_YGNodeStyleGetWidthJNI(long r0);

    static native void jni_YGNodeStyleSetAlignContentJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetAlignItemsJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetAlignSelfJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetAspectRatioJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetBorderJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetBoxSizingJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetDirectionJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetDisplayJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long r0);

    static native void jni_YGNodeStyleSetFlexBasisJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetFlexDirectionJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetFlexGrowJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetFlexJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetFlexShrinkJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetFlexWrapJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetGapJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetGapPercentJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetHeightAutoJNI(long r0);

    static native void jni_YGNodeStyleSetHeightJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetHeightPercentJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetJustifyContentJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetMarginAutoJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetMarginJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetMarginPercentJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetMaxHeightJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMaxWidthJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMinHeightJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMinHeightPercentJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMinWidthJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetMinWidthPercentJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetOverflowJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetPaddingJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetPaddingPercentJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetPositionAutoJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetPositionJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetPositionPercentJNI(long r0, int r2, float r3);

    static native void jni_YGNodeStyleSetPositionTypeJNI(long r0, int r2);

    static native void jni_YGNodeStyleSetWidthAutoJNI(long r0);

    static native void jni_YGNodeStyleSetWidthJNI(long r0, float r2);

    static native void jni_YGNodeStyleSetWidthPercentJNI(long r0, float r2);

    static native void jni_YGNodeSwapChildJNI(long r0, long r2, int r4);
}
