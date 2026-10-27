package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl extends com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase {
    public vl() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            r1.jy()     // Catch: java.lang.Throwable -> L7
            super.finalize()
            return
        L7:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    public void jy() {
            r5 = this;
            long r0 = r5.j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r5.j = r2
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeFinalizeJNI(r0)
        Ld:
            return
    }
}
