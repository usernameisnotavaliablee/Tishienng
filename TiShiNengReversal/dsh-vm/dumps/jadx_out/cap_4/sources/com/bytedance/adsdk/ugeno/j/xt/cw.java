package com.bytedance.adsdk.ugeno.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw extends com.bytedance.adsdk.ugeno.j.xt.j {
    public cw(android.content.Context r1, com.bytedance.adsdk.ugeno.xt.cw r2, java.lang.String r3, java.util.TreeMap<java.lang.Float, java.lang.String> r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public void j(float r3, java.lang.String r4) {
            r2 = this;
            com.bytedance.adsdk.ugeno.j.up r0 = r2.f1971r
            com.bytedance.adsdk.ugeno.j.up r1 = com.bytedance.adsdk.ugeno.j.up.qv
            if (r0 != r1) goto Lf
            int r4 = com.bytedance.adsdk.ugeno.m.j.j(r4)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3, r4)
            goto L18
        Lf:
            r0 = 0
            int r4 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r0)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3, r4)
        L18:
            java.util.List<android.animation.Keyframe> r4 = r2.up
            r4.add(r3)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public android.animation.TypeEvaluator m() {
            r2 = this;
            com.bytedance.adsdk.ugeno.j.up r0 = r2.f1971r
            com.bytedance.adsdk.ugeno.j.up r1 = com.bytedance.adsdk.ugeno.j.up.qv
            if (r0 != r1) goto Lc
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            return r0
        Lc:
            android.animation.IntEvaluator r0 = new android.animation.IntEvaluator
            r0.<init>()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public void xt() {
            r2 = this;
            com.bytedance.adsdk.ugeno.j.up r0 = r2.f1971r
            com.bytedance.adsdk.ugeno.j.up r1 = com.bytedance.adsdk.ugeno.j.up.qv
            if (r0 != r1) goto L16
            com.bytedance.adsdk.ugeno.xt.cw r0 = r2.ae
            int r0 = r0.c()
            r1 = 0
            android.animation.Keyframe r0 = android.animation.Keyframe.ofInt(r1, r0)
            java.util.List<android.animation.Keyframe> r1 = r2.up
            r1.add(r0)
        L16:
            return
    }
}
