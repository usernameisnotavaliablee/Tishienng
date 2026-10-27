package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class iOSTwoButtonDialog extends android.app.Dialog {
    private final android.widget.Button btn_one;
    private final android.widget.Button btn_two;
    private boolean isClickAutoCancel;
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.LeftButtonOnClick lefttButtonOnClick;
    private final android.view.View line_title;
    private final android.widget.LinearLayout ll_content;
    private final android.content.Context mContext;
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick rightButtonOnClick;
    private final android.widget.TextView textView;
    private final android.widget.TextView tv_title;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface LeftButtonOnClick {
        void buttonLeftOnClick();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface RightButtonOnClick {
        void buttonRightOnClick();
    }

    public iOSTwoButtonDialog(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            int r0 = cn.bluemobi.dylan.base.R.style.ios_dialog_theme
            r2.<init>(r3, r0)
            r0 = 1
            r2.isClickAutoCancel = r0
            r2.mContext = r3
            r2.requestWindowFeature(r0)
            int r3 = cn.bluemobi.dylan.base.R.layout.ios_dialog_two_bt
            r2.setContentView(r3)
            android.view.Window r3 = r2.getWindow()
            r0 = 17
            r3.setGravity(r0)
            int r3 = cn.bluemobi.dylan.base.R.id.ll_content
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.ll_content = r3
            int r3 = cn.bluemobi.dylan.base.R.id.text_message
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.textView = r3
            int r3 = cn.bluemobi.dylan.base.R.id.tv_title
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.tv_title = r3
            int r3 = cn.bluemobi.dylan.base.R.id.btn_one
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.btn_one = r3
            int r0 = cn.bluemobi.dylan.base.R.id.btn_two
            android.view.View r0 = r2.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r2.btn_two = r0
            int r1 = cn.bluemobi.dylan.base.R.id.line_title
            android.view.View r1 = r2.findViewById(r1)
            r2.line_title = r1
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog$1 r1 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog$1
            r1.<init>(r2)
            r3.setOnClickListener(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog$2 r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog$2
            r3.<init>(r2)
            r0.setOnClickListener(r3)
            return
    }

    static /* synthetic */ boolean access$000(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            boolean r0 = r0.isClickAutoCancel
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.LeftButtonOnClick access$100(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog$LeftButtonOnClick r0 = r0.lefttButtonOnClick
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick access$200(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog$RightButtonOnClick r0 = r0.rightButtonOnClick
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setCenterCustomView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r1 = r2.ll_content
            r0.inflate(r3, r1)
            return r2
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setClickAutoCancel(boolean r1) {
            r0 = this;
            r0.isClickAutoCancel = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setLeftButtonOnClickListener(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.LeftButtonOnClick r1) {
            r0 = this;
            r0.lefttButtonOnClick = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setLeftButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_one
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setMessage(java.lang.CharSequence r3) {
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

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setMessageGrivity(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setGravity(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setRightButtonOnClickListener(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick r1) {
            r0 = this;
            r0.rightButtonOnClick = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setRightButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_two
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setTitle(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_title
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSTwoButtonDialog setTitleLineVisiBility(int r2) {
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
