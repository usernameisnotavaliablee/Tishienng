package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class iOSSelectDialog extends android.app.Dialog {
    private final android.widget.Button btn_one;
    private final android.widget.LinearLayout ll_content;
    private cn.bluemobi.dylan.base.view.iOSSelectDialog.MenuClick menuClick;
    private android.view.View.OnClickListener onClickListener;
    private final android.widget.TextView tv_title;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MenuClick {
        void onMenuClick(java.lang.String r1);
    }

    public iOSSelectDialog(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            int r0 = cn.bluemobi.dylan.base.R.style.ios_dialog_theme
            r1.<init>(r2, r0)
            r2 = 1
            r1.requestWindowFeature(r2)
            int r2 = cn.bluemobi.dylan.base.R.layout.ios_dialog_select
            r1.setContentView(r2)
            android.view.Window r2 = r1.getWindow()
            r0 = 17
            r2.setGravity(r0)
            int r2 = cn.bluemobi.dylan.base.R.id.ll_content
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.ll_content = r2
            int r2 = cn.bluemobi.dylan.base.R.id.tv_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.tv_title = r2
            int r2 = cn.bluemobi.dylan.base.R.id.btn_one
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.btn_one = r2
            cn.bluemobi.dylan.base.view.iOSSelectDialog$1 r0 = new cn.bluemobi.dylan.base.view.iOSSelectDialog$1
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
    }

    static /* synthetic */ android.view.View.OnClickListener access$000(cn.bluemobi.dylan.base.view.iOSSelectDialog r0) {
            android.view.View$OnClickListener r0 = r0.onClickListener
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.iOSSelectDialog.MenuClick access$100(cn.bluemobi.dylan.base.view.iOSSelectDialog r0) {
            cn.bluemobi.dylan.base.view.iOSSelectDialog$MenuClick r0 = r0.menuClick
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog addMenuText(java.lang.String r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r0.setText(r4)
            java.lang.String r1 = "#2C7AD7"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            r1 = 2
            r2 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r1, r2)
            r1 = 17
            r0.setGravity(r1)
            cn.bluemobi.dylan.base.view.iOSSelectDialog$2 r1 = new cn.bluemobi.dylan.base.view.iOSSelectDialog$2
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r1 = 1109393408(0x42200000, float:40.0)
            android.content.Context r2 = r3.getContext()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            r2 = -1
            r4.<init>(r2, r1)
            r0.setLayoutParams(r4)
            android.widget.LinearLayout r1 = r3.ll_content
            r1.addView(r0, r4)
            return r3
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog addMenuTexts(java.util.List<java.lang.String> r2) {
            r1 = this;
            if (r2 == 0) goto L16
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.addMenuText(r0)
            goto L6
        L16:
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog setButtonOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.onClickListener = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog setCenterCustomView(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r1 = r2.ll_content
            r0.inflate(r3, r1)
            return r2
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog setMenuClickLisentner(cn.bluemobi.dylan.base.view.iOSSelectDialog.MenuClick r1) {
            r0 = this;
            r0.menuClick = r1
            return r0
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog setOneButtonText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.Button r0 = r1.btn_one
            r0.setText(r2)
            return r1
    }

    public cn.bluemobi.dylan.base.view.iOSSelectDialog setTitle(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_title
            r0.setText(r2)
            return r1
    }
}
