package com.baidu.idl.face.platform.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BaseFaceDetectActivity extends com.baidu.idl.face.platform.ui.FaceDetectActivity implements com.baidu.idl.face.platform.ui.widget.TimeoutDialog.OnTimeoutDialogClickListener {
    private java.lang.String mBmpStr;
    private com.baidu.idl.face.platform.ui.widget.TimeoutDialog mTimeoutDialog;



    public BaseFaceDetectActivity() {
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
            com.baidu.idl.face.platform.ui.BaseFaceDetectActivity$1 r2 = new com.baidu.idl.face.platform.ui.BaseFaceDetectActivity$1
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
        L19:
            if (r3 == 0) goto L45
            int r2 = r3.size()
            if (r2 <= 0) goto L45
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r3.entrySet()
            r2.<init>(r3)
            com.baidu.idl.face.platform.ui.BaseFaceDetectActivity$2 r3 = new com.baidu.idl.face.platform.ui.BaseFaceDetectActivity$2
            r3.<init>(r1)
            java.util.Collections.sort(r2, r3)
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            com.baidu.idl.face.platform.model.ImageInfo r2 = (com.baidu.idl.face.platform.model.ImageInfo) r2
            java.lang.String r2 = r2.getBase64()
            r1.mBmpStr = r2
        L45:
            java.lang.String r2 = r1.mBmpStr
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L51
            r1.onRecollect()
            return
        L51:
            java.lang.String r2 = r1.mBmpStr
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

    @Override // com.baidu.idl.face.platform.ui.FaceDetectActivity
    public void finish() {
            r0 = this;
            super.finish()
            return
    }

    @Override // com.baidu.idl.face.platform.ui.FaceDetectActivity, com.baidu.idl.face.platform.IDetectStrategyCallback
    public void onDetectCompletion(com.baidu.idl.face.platform.FaceStatusNewEnum r1, java.lang.String r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4) {
            r0 = this;
            super.onDetectCompletion(r1, r2, r3, r4)
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r1 != r2) goto Lf
            boolean r2 = r0.mIsCompletion
            if (r2 == 0) goto Lf
            r0.getBestImage(r3, r4)
            return
        Lf:
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            if (r1 != r2) goto L1e
            android.view.View r1 = r0.mViewBg
            if (r1 == 0) goto L1b
            r2 = 0
            r1.setVisibility(r2)
        L1b:
            r0.showMessageDialog()
        L1e:
            return
    }

    protected void onFace(java.lang.String r1) {
            r0 = this;
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
