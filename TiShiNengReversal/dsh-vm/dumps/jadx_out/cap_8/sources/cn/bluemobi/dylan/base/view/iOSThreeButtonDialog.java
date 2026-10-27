package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class iOSThreeButtonDialog extends android.app.Dialog {
    private final android.widget.Button btn_one;
    private final android.widget.Button btn_three;
    private final android.widget.Button btn_two;
    private cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.CenterButtonOnClick centerButtonOnClick;
    private boolean isClickAutoCancel;
    private cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.LeftButtonOnClick lefttButtonOnClick;
    private final android.view.View line_title;
    private final android.widget.LinearLayout ll_content;
    private cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.RightButtonOnClick rightButtonOnClick;
    private final android.widget.TextView textView;
    private final android.widget.TextView tv_title;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CenterButtonOnClick {
        void buttonCenterOnClick();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface LeftButtonOnClick {
        void buttonLeftOnClick();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface RightButtonOnClick {
        void buttonRightOnClick();
    }

    public iOSThreeButtonDialog(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            int r0 = cn.bluemobi.dylan.base.R.style.ios_dialog_theme
            r3.<init>(r4, r0)
            r4 = 1
            r3.isClickAutoCancel = r4
            r3.requestWindowFeature(r4)
            int r4 = cn.bluemobi.dylan.base.R.layout.ios_dialog_three_bt
            r3.setContentView(r4)
            android.view.Window r4 = r3.getWindow()
            r0 = 17
            r4.setGravity(r0)
            int r4 = cn.bluemobi.dylan.base.R.id.ll_content
            android.view.View r4 = r3.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.ll_content = r4
            int r4 = cn.bluemobi.dylan.base.R.id.text_message
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.textView = r4
            int r4 = cn.bluemobi.dylan.base.R.id.tv_title
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.tv_title = r4
            int r4 = cn.bluemobi.dylan.base.R.id.btn_one
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.btn_one = r4
            int r0 = cn.bluemobi.dylan.base.R.id.btn_two
            android.view.View r0 = r3.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.btn_two = r0
            int r1 = cn.bluemobi.dylan.base.R.id.btn_three
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r3.btn_three = r1
            int r2 = cn.bluemobi.dylan.base.R.id.line_title
            android.view.View r2 = r3.findViewById(r2)
            r3.line_title = r2
            cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$1 r2 = new cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$1
            r2.<init>(r3)
            r4.setOnClickListener(r2)
            cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$2 r4 = new cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$2
            r4.<init>(r3)
            r0.setOnClickListener(r4)
            cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$3 r4 = new cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$3
            r4.<init>(r3)
            r1.setOnClickListener(r4)
            return
    }

    static /* synthetic */ boolean access$000(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog r0) {
            boolean r0 = r0.isClickAutoCancel
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.LeftButtonOnClick access$100(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog r0) {
            cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$LeftButtonOnClick r0 = r0.lefttButtonOnClick
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.CenterButtonOnClick access$200(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog r0) {
            cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$CenterButtonOnClick r0 = r0.centerButtonOnClick
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.RightButtonOnClick access$300(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog r0) {
            cn.bluemobi.dylan.base.view.iOSThreeButtonDialog$RightButtonOnClick r0 = r0.rightButtonOnClick
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setCenterButtonOnClick(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.CenterButtonOnClick r1) {
            r0 = this;
            r0.centerButtonOnClick = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setCenterButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_two
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setCenterCustomView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r1 = r2.ll_content
            r0.inflate(r3, r1)
            return r2
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setClickAutoCancel(boolean r1) {
            r0 = this;
            r0.isClickAutoCancel = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setLeftButtonOnClickListener(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.LeftButtonOnClick r1) {
            r0 = this;
            r0.lefttButtonOnClick = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setLeftButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_one
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setMessage(java.lang.CharSequence r3) {
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

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setMessageGrivity(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setGravity(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setRightButtonOnClickListener(cn.bluemobi.dylan.base.view.iOSThreeButtonDialog.RightButtonOnClick r1) {
            r0 = this;
            r0.rightButtonOnClick = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setRightButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_three
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setTitle(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_title
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSThreeButtonDialog setTitleLineVisiBility(int r2) {
            r1 = this;
            android.view.View r0 = r1.line_title
            r0.setVisibility(r2)
            return r1
    }
}
