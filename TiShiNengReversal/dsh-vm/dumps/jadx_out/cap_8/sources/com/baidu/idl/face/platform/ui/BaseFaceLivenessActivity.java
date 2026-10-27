package com.baidu.idl.face.platform.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BaseFaceLivenessActivity extends com.baidu.idl.face.platform.ui.FaceLivenessActivity implements com.baidu.idl.face.platform.ui.widget.TimeoutDialog.OnTimeoutDialogClickListener {
    private com.baidu.idl.face.platform.ui.widget.TimeoutDialog mTimeoutDialog;



    public BaseFaceLivenessActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void getBestImage(java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3) {
            r1 = this;
            if (r2 == 0) goto L19
            int r0 = r2.size()
            if (r0 <= 0) goto L19
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set r2 = r2.entrySet()
            r0.<init>(r2)
            com.baidu.idl.face.platform.ui.BaseFaceLivenessActivity$1 r2 = new com.baidu.idl.face.platform.ui.BaseFaceLivenessActivity$1
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
        L19:
            if (r3 == 0) goto L44
            int r2 = r3.size()
            if (r2 <= 0) goto L44
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r3.entrySet()
            r2.<init>(r3)
            com.baidu.idl.face.platform.ui.BaseFaceLivenessActivity$2 r3 = new com.baidu.idl.face.platform.ui.BaseFaceLivenessActivity$2
            r3.<init>(r1)
            java.util.Collections.sort(r2, r3)
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            com.baidu.idl.face.platform.model.ImageInfo r2 = (com.baidu.idl.face.platform.model.ImageInfo) r2
            java.lang.String r2 = r2.getBase64()
            goto L45
        L44:
            r2 = 0
        L45:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L4f
            r1.onRecollect()
            return
        L4f:
            r1.onFace(r2)
            return
    }

    private void showMessageDialog() {
            r2 = this;
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog r0 = new com.baidu.idl.face.platform.ui.widget.TimeoutDialog
            r0.<init>(r2)
            r2.mTimeoutDialog = r0
            r0.setDialogListener(r2)
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog r0 = r2.mTimeoutDialog
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog r0 = r2.mTimeoutDialog
            r0.setCancelable(r1)
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog r0 = r2.mTimeoutDialog
            r0.show()
            r0 = 1
            r2.mHasShownTimeoutDialog = r0
            r2.onPause()
            return
    }

    @Override // com.baidu.idl.face.platform.ui.FaceLivenessActivity
    public void finish() {
            r0 = this;
            super.finish()
            return
    }

    protected void onFace(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.baidu.idl.face.platform.ui.FaceLivenessActivity, com.baidu.idl.face.platform.ILivenessStrategyCallback
    public void onLivenessCompletion(com.baidu.idl.face.platform.FaceStatusNewEnum r1, java.lang.String r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4, int r5) {
            r0 = this;
            super.onLivenessCompletion(r1, r2, r3, r4, r5)
            r2 = r1
            r1 = r0
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r2 != r5) goto L11
            boolean r5 = r1.mIsCompletion
            if (r5 == 0) goto L11
            r0.getBestImage(r3, r4)
            return
        L11:
            com.baidu.idl.face.platform.FaceStatusNewEnum r3 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            if (r2 != r3) goto L20
            android.view.View r2 = r1.mViewBg
            if (r2 == 0) goto L1d
            r3 = 0
            r2.setVisibility(r3)
        L1d:
            r0.showMessageDialog()
        L20:
            return
    }

    @Override // com.baidu.idl.face.platform.ui.widget.TimeoutDialog.OnTimeoutDialogClickListener
    public void onRecollect() {
            r2 = this;
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog r0 = r2.mTimeoutDialog
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r2.mHasShownTimeoutDialog = r0
        La:
            android.view.View r0 = r2.mViewBg
            if (r0 == 0) goto L13
            r1 = 8
            r0.setVisibility(r1)
        L13:
            r2.onResume()
            return
    }

    @Override // com.baidu.idl.face.platform.ui.widget.TimeoutDialog.OnTimeoutDialogClickListener
    public void onReturn() {
            r1 = this;
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog r0 = r1.mTimeoutDialog
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.mHasShownTimeoutDialog = r0
        La:
            r1.finish()
            return
    }
}
