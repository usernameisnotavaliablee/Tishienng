package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NativeFunctionRunnable {
    public static final java.lang.String CLEAR_OVERLAY_FUNC = "clearOverlay";
    public static final java.lang.String CREATE_OVERLAY_FUNC = "createOverlay";
    public static final java.lang.String REMOVE_OVERLAY_FUNC = "removeOverlay";
    public static final java.lang.String UPDATE_OPTIONS_FUNC = "updateOptions";
    private java.lang.String name;
    private java.lang.Runnable runnable;
    private java.lang.String type;

    public NativeFunctionRunnable(java.lang.String r1, java.lang.String r2, java.lang.Runnable r3) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.name = r2
            r0.runnable = r3
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L28
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L12
            goto L28
        L12:
            com.autonavi.base.amap.mapcore.NativeFunctionRunnable r4 = (com.autonavi.base.amap.mapcore.NativeFunctionRunnable) r4
            java.lang.String r1 = r3.type
            java.lang.String r2 = r4.type
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r0 = r3.name
            java.lang.String r4 = r4.name
            boolean r4 = java.util.Objects.equals(r0, r4)
            return r4
        L28:
            return r0
    }

    public java.lang.String getKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Runnable getRunnable() {
            r1 = this;
            java.lang.Runnable r0 = r1.runnable
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.type
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.name
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeFunctionRunnable{type='"
            r0.<init>(r1)
            java.lang.String r1 = r3.type
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", name='"
            r0.append(r2)
            java.lang.String r2 = r3.name
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", runnable="
            r0.append(r1)
            java.lang.Runnable r1 = r3.runnable
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
