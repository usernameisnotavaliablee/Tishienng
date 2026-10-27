package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class iOSOneButtonDialog extends android.app.Dialog {
    private final android.widget.Button btn_one;
    private boolean isClickAutoCancel;
    private final android.view.View line_title;
    private final android.widget.LinearLayout ll_content;
    private final android.content.Context mContext;
    private android.view.View.OnClickListener onClickListener;
    private final android.widget.TextView textView;
    private final android.widget.TextView tv_title;


    public iOSOneButtonDialog(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            int r0 = cn.bluemobi.dylan.base.R.style.ios_dialog_theme
            r1.<init>(r2, r0)
            r0 = 1
            r1.isClickAutoCancel = r0
            r1.mContext = r2
            r1.requestWindowFeature(r0)
            int r2 = cn.bluemobi.dylan.base.R.layout.ios_dialog_one_bt
            r1.setContentView(r2)
            android.view.Window r2 = r1.getWindow()
            r0 = 17
            r2.setGravity(r0)
            int r2 = cn.bluemobi.dylan.base.R.id.ll_content
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.ll_content = r2
            int r2 = cn.bluemobi.dylan.base.R.id.text_message
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.textView = r2
            int r2 = cn.bluemobi.dylan.base.R.id.tv_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.tv_title = r2
            int r2 = cn.bluemobi.dylan.base.R.id.btn_one
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_one = r2
            int r0 = cn.bluemobi.dylan.base.R.id.line_title
            android.view.View r0 = r1.findViewById(r0)
            r1.line_title = r0
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog$1 r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog$1
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
    }

    static /* synthetic */ boolean access$000(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0) {
            boolean r0 = r0.isClickAutoCancel
            return r0
    }

    static /* synthetic */ android.view.View.OnClickListener access$100(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0) {
            android.view.View$OnClickListener r0 = r0.onClickListener
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setButtonOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.onClickListener = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setCenterCustomView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r1 = r2.ll_content
            r0.inflate(r3, r1)
            return r2
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setClickAutoCancel(boolean r1) {
            r0 = this;
            r0.isClickAutoCancel = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setMessage(java.lang.CharSequence r3) {
            r2 = this;
            android.widget.TextView r0 = r2.textView
            java.lang.String r1 = r3.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lf
            r1 = 8
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.textView
            r0.setText(r3)
            return r2
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setMessageGrivity(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setGravity(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setOneButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_one
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setTitle(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_title
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSOneButtonDialog setTitleLineVisiBility(int r2) {
            r1 = this;
            android.view.View r0 = r1.line_title
            r0.setVisibility(r2)
            return r1
    }

    @Override // android.app.Dialog
    public void show() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L17
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L17
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L17
            super.show()
        L17:
            return
    }
}
