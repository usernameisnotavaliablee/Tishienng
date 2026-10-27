package com.bxkj.student.common.jpush;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LoginStatusChangeService extends android.content.BroadcastReceiver {
    public LoginStatusChangeService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@org.jetbrains.annotations.Nullable android.content.Context r3, @org.jetbrains.annotations.Nullable android.content.Intent r4) {
            r2 = this;
            com.bxkj.base.v2.data.b$a r3 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r4 = r3.a()
            boolean r4 = r4.Y()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LoginOutService->登录状态发生变化："
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.m(r4, r0)
            com.bxkj.student.common.jpush.a r4 = com.bxkj.student.common.jpush.a.a
            com.bxkj.base.v2.data.b r0 = r3.a()
            java.lang.String r0 = r0.R()
            com.bxkj.base.v2.data.b r3 = r3.a()
            boolean r3 = r3.Y()
            r4.d(r0, r3)
            return
    }
}
