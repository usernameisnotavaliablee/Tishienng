package com.bytedance.pangle.receiver;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BroadcastReceiverProxy extends android.content.BroadcastReceiver {


    public BroadcastReceiverProxy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.j()
            int r1 = r2.hashCode()
            boolean r0 = r0.j(r1)
            if (r0 == 0) goto L16
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.j()
            r0.j(r3, r4)
            return
        L16:
            com.bytedance.pangle.receiver.BroadcastReceiverProxy$1 r0 = new com.bytedance.pangle.receiver.BroadcastReceiverProxy$1
            r0.<init>(r2, r3, r4)
            com.bytedance.pangle.up.up.cw(r0)
            return
    }
}
