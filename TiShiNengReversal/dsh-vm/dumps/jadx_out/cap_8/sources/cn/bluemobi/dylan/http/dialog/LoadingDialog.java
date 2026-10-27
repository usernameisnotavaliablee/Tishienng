package cn.bluemobi.dylan.http.dialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LoadingDialog {
    protected android.content.Context context;
    protected android.app.Dialog dialog;
    private android.widget.TextView tv_text;


    public LoadingDialog(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.context = r4
            android.app.Dialog r0 = new android.app.Dialog
            int r1 = cn.bluemobi.dylan.http.R.style.loadingDialogStyle
            r0.<init>(r4, r1)
            r3.dialog = r0
            android.view.Window r0 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            android.app.Dialog r0 = r3.dialog
            r0.setCanceledOnTouchOutside(r2)
            r3.addLifeCycle(r4)
            return
    }

    private void addLifeCycle(android.content.Context r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L13
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            com.bjtsn.dylan.lifecycleobserver.LifecycleObserver r0 = new com.bjtsn.dylan.lifecycleobserver.LifecycleObserver
            r0.<init>(r2)
            cn.bluemobi.dylan.http.dialog.LoadingDialog$1 r2 = new cn.bluemobi.dylan.http.dialog.LoadingDialog$1
            r2.<init>(r1)
            r0.c(r2)
        L13:
            return
    }

    public void dismiss() {
            r0 = this;
            r0.hideProgress()
            return
    }

    public void hideProgress() {
            r2 = this;
            android.app.Dialog r0 = r2.dialog
            if (r0 == 0) goto L33
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L33
            android.app.Dialog r0 = r2.dialog
            android.content.Context r0 = r0.getContext()
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2e
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L33
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L33
            android.app.Dialog r0 = r2.dialog
            r0.dismiss()
            return
        L2e:
            android.app.Dialog r0 = r2.dialog
            r0.dismiss()
        L33:
            return
    }

    public boolean isShowing() {
            r1 = this;
            android.app.Dialog r0 = r1.dialog
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void setMessage(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.tv_text
            if (r0 == 0) goto L7
            r0.setText(r2)
        L7:
            return
    }

    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            android.app.Dialog r0 = r1.dialog
            r0.setOnDismissListener(r2)
            return
    }

    public void setOnKeyListener(android.content.DialogInterface.OnKeyListener r2) {
            r1 = this;
            android.app.Dialog r0 = r1.dialog
            r0.setOnKeyListener(r2)
            return
    }

    public android.app.Dialog show() {
            r1 = this;
            r0 = 0
            android.app.Dialog r0 = r1.show(r0)
            return r0
    }

    public android.app.Dialog show(java.lang.String r4) {
            r3 = this;
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            java.lang.Integer r0 = r0.getLoadingDialogLayoutId()
            if (r0 == 0) goto L1c
            android.app.Dialog r0 = r3.dialog
            cn.bluemobi.dylan.http.Http r1 = cn.bluemobi.dylan.http.Http.getHttp()
            java.lang.Integer r1 = r1.getLoadingDialogLayoutId()
            int r1 = r1.intValue()
            r0.setContentView(r1)
            goto L2e
        L1c:
            android.content.Context r0 = r3.context
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = cn.bluemobi.dylan.http.R.layout.pub_loading
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.app.Dialog r1 = r3.dialog
            r1.setContentView(r0)
        L2e:
            android.app.Dialog r0 = r3.dialog     // Catch: java.lang.Exception -> L48
            int r1 = cn.bluemobi.dylan.http.R.id.tv_text     // Catch: java.lang.Exception -> L48
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L48
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L48
            r3.tv_text = r0     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L49
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L48
            if (r0 != 0) goto L49
            android.widget.TextView r0 = r3.tv_text     // Catch: java.lang.Exception -> L48
            r0.setText(r4)     // Catch: java.lang.Exception -> L48
            goto L49
        L48:
        L49:
            android.app.Dialog r4 = r3.dialog
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L7c
            android.app.Dialog r4 = r3.dialog
            android.content.Context r4 = r4.getContext()
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L77
            android.content.Context r4 = r3.context
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L7c
            boolean r4 = r4.isDestroyed()
            if (r4 != 0) goto L7c
            android.app.Dialog r4 = r3.dialog
            r4.show()
            goto L7c
        L77:
            android.app.Dialog r4 = r3.dialog
            r4.show()
        L7c:
            android.app.Dialog r4 = r3.dialog
            return r4
    }

    public android.app.Dialog showDefaultStyle(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.context
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = cn.bluemobi.dylan.http.R.layout.pub_loading
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.app.Dialog r1 = r3.dialog
            r1.setContentView(r0)
            android.app.Dialog r0 = r3.dialog     // Catch: java.lang.Exception -> L2c
            int r1 = cn.bluemobi.dylan.http.R.id.tv_text     // Catch: java.lang.Exception -> L2c
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L2c
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L2c
            r3.tv_text = r0     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2d
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L2d
            android.widget.TextView r0 = r3.tv_text     // Catch: java.lang.Exception -> L2c
            r0.setText(r4)     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
        L2d:
            android.app.Dialog r4 = r3.dialog
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L58
            android.app.Dialog r4 = r3.dialog
            android.content.Context r4 = r4.getContext()
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L53
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isFinishing()
            if (r4 != 0) goto L58
            android.app.Dialog r4 = r3.dialog
            r4.show()
            goto L58
        L53:
            android.app.Dialog r4 = r3.dialog
            r4.show()
        L58:
            android.app.Dialog r4 = r3.dialog
            return r4
    }
}
