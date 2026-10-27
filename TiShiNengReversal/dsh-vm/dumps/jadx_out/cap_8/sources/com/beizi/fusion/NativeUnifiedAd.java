package com.beizi.fusion;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NativeUnifiedAd {
    private com.beizi.fusion.c.h a;

    public NativeUnifiedAd(android.content.Context r8, java.lang.String r9, com.beizi.fusion.NativeUnifiedAdListener r10, long r11, int r13) {
            r7 = this;
            r7.<init>()
            com.beizi.fusion.c.h r0 = new com.beizi.fusion.c.h
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            r7.a = r0
            return
    }

    public void destroy() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L7
            r0.B()
        L7:
            return
    }

    public java.lang.String getCustomExtraData() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.t()
            return r0
    }

    public java.lang.String getCustomExtraJsonData() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.v()
            return r0
    }

    public int getECPM() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.A()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public boolean isLoaded() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L9
            boolean r0 = r0.z()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void loadAd() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L7
            r0.y()
        L7:
            return
    }

    public void resume() {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L7
            r0.C()
        L7:
            return
    }

    public void sendLossNotificationWithInfo(java.util.Map r2) {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.b(r2)
        La:
            return
    }

    public void sendWinNotificationWithInfo(java.util.Map r2) {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.a(r2)
        La:
            return
    }

    public void setBidResponse(java.lang.String r2) {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.g(r2)
            return
    }

    public void setHideAdLogo(boolean r2) {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    public void setHideDownloadInfo(boolean r2) {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            return
    }

    public void setSpaceParam(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.beizi.fusion.c.h r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0.c(r2)
            return
    }
}
