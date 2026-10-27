package com.bytedance.msdk.core.admanager.reward.rewardagain;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class GMRewardAgainDialogActivity extends android.app.Activity {

    /* renamed from: com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity$1, reason: invalid class name */
    class AnonymousClass1 implements android.view.View.OnClickListener {
        final /* synthetic */ com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity j;

        AnonymousClass1(com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity r1 = r0.j
                r1.finish()
                com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r1 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.cw()
                java.lang.Runnable r1 = r1.xt
                if (r1 == 0) goto L10
                r1.run()
            L10:
                return
        }
    }

    /* renamed from: com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity$2, reason: invalid class name */
    class AnonymousClass2 implements android.view.View.OnClickListener {
        final /* synthetic */ com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity j;

        AnonymousClass2(com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bytedance.msdk.core.admanager.reward.rewardagain.GMRewardAgainDialogActivity r1 = r0.j
                r1.finish()
                com.bytedance.msdk.core.admanager.reward.rewardagain.cw$j r1 = com.bytedance.msdk.core.admanager.reward.rewardagain.cw.cw()
                java.lang.Runnable r1 = r1.cw
                if (r1 == 0) goto L10
                r1.run()
            L10:
                return
        }
    }

    static {
            r0 = 20225(0x4f01, float:2.8341E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public GMRewardAgainDialogActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto L5
            r2 = 1
            return r2
        L5:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }
}
