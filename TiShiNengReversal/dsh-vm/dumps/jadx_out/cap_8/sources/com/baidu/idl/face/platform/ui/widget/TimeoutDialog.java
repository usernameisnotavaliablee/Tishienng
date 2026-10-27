package com.baidu.idl.face.platform.ui.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TimeoutDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private android.content.Context mContext;
    private com.baidu.idl.face.platform.ui.widget.TimeoutDialog.OnTimeoutDialogClickListener mOnTimeoutDialogClickListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnTimeoutDialogClickListener {
        void onRecollect();

        void onReturn();
    }

    public TimeoutDialog(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            int r0 = com.baidu.idl.face.platform.ui.R.style.DefaultDialog
            r1.<init>(r2, r0)
            r1.mContext = r2
            return
    }

    private void initView() {
            r5 = this;
            android.content.Context r0 = r5.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.baidu.idl.face.platform.ui.R.layout.dialog_time_out
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r5.setContentView(r0)
            android.view.Window r1 = r5.getWindow()
            r2 = 1
            r1.setGravity(r2)
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            android.content.Context r3 = r5.getContext()
            int r3 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayWidth(r3)
            android.content.Context r4 = r5.getContext()
            float r3 = (float) r3
            int r3 = com.baidu.idl.face.platform.utils.DensityUtils.px2dip(r4, r3)
            int r3 = r3 + (-40)
            android.content.Context r4 = r5.getContext()
            float r3 = (float) r3
            int r3 = com.baidu.idl.face.platform.utils.DensityUtils.dip2px(r4, r3)
            r2.width = r3
            r3 = -2
            r2.height = r3
            r1.setAttributes(r2)
            int r1 = com.baidu.idl.face.platform.ui.R.id.btn_dialog_recollect
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setOnClickListener(r5)
            int r1 = com.baidu.idl.face.platform.ui.R.id.btn_dialog_return
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r0.setOnClickListener(r5)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            int r0 = com.baidu.idl.face.platform.ui.R.id.btn_dialog_recollect
            if (r2 != r0) goto L10
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog$OnTimeoutDialogClickListener r2 = r1.mOnTimeoutDialogClickListener
            if (r2 == 0) goto L1b
            r2.onRecollect()
            return
        L10:
            int r0 = com.baidu.idl.face.platform.ui.R.id.btn_dialog_return
            if (r2 != r0) goto L1b
            com.baidu.idl.face.platform.ui.widget.TimeoutDialog$OnTimeoutDialogClickListener r2 = r1.mOnTimeoutDialogClickListener
            if (r2 == 0) goto L1b
            r2.onReturn()
        L1b:
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r0.initView()
            return
    }

    public void setDialogListener(com.baidu.idl.face.platform.ui.widget.TimeoutDialog.OnTimeoutDialogClickListener r1) {
            r0 = this;
            r0.mOnTimeoutDialogClickListener = r1
            return
    }
}
