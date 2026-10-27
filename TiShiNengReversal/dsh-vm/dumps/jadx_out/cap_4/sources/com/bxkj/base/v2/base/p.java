package com.bxkj.base.v2.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class p {
    protected android.app.Dialog a;
    protected android.content.Context b;
    private android.widget.TextView c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bjtsn.dylan.lifecycleobserver.b {
        final /* synthetic */ com.bxkj.base.v2.base.p a;

        a(com.bxkj.base.v2.base.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bjtsn.dylan.lifecycleobserver.b
        public void onDestroy() {
                r1 = this;
                com.bxkj.base.v2.base.p r0 = r1.a
                android.app.Dialog r0 = r0.a
                if (r0 == 0) goto L13
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L13
                com.bxkj.base.v2.base.p r0 = r1.a
                android.app.Dialog r0 = r0.a
                r0.dismiss()
            L13:
                super.onDestroy()
                return
        }
    }

    public p(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.b = r4
            android.app.Dialog r0 = new android.app.Dialog
            int r1 = com.bxkj.base.R.style.loadingDialogStyle
            r0.<init>(r4, r1)
            r3.a = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            int r1 = com.bxkj.base.R.layout.fragment_progress_dialog
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.bxkj.base.R.id.tv_msg
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.c = r1
            android.app.Dialog r1 = r3.a
            r1.setContentView(r0)
            android.app.Dialog r0 = r3.a
            android.view.Window r0 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            android.app.Dialog r0 = r3.a
            r0.setCanceledOnTouchOutside(r2)
            r3.a(r4)
            return
    }

    private void a(android.content.Context r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L13
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            com.bjtsn.dylan.lifecycleobserver.LifecycleObserver r0 = new com.bjtsn.dylan.lifecycleobserver.LifecycleObserver
            r0.<init>(r2)
            com.bxkj.base.v2.base.p$a r2 = new com.bxkj.base.v2.base.p$a
            r2.<init>(r1)
            r0.c(r2)
        L13:
            return
    }

    public void b() {
            r0 = this;
            r0.c()
            return
    }

    public void c() {
            r2 = this;
            android.app.Dialog r0 = r2.a
            if (r0 == 0) goto L33
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L33
            android.app.Dialog r0 = r2.a
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
            android.app.Dialog r0 = r2.a
            r0.dismiss()
            return
        L2e:
            android.app.Dialog r0 = r2.a
            r0.dismiss()
        L33:
            return
    }

    public boolean d() {
            r1 = this;
            android.app.Dialog r0 = r1.a
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.bxkj.base.v2.base.p e(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.c
            if (r0 == 0) goto L7
            r0.setText(r2)
        L7:
            return r1
    }

    public void f(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            android.app.Dialog r0 = r1.a
            r0.setOnDismissListener(r2)
            return
    }

    public void g(android.content.DialogInterface.OnKeyListener r2) {
            r1 = this;
            android.app.Dialog r0 = r1.a
            r0.setOnKeyListener(r2)
            return
    }

    public android.app.Dialog h() {
            r1 = this;
            r0 = 0
            android.app.Dialog r0 = r1.i(r0)
            return r0
    }

    public android.app.Dialog i(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.c     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L11
            android.widget.TextView r0 = r1.c     // Catch: java.lang.Exception -> L10
            r0.setText(r2)     // Catch: java.lang.Exception -> L10
            goto L11
        L10:
        L11:
            android.app.Dialog r2 = r1.a
            boolean r2 = r2.isShowing()
            if (r2 != 0) goto L44
            android.app.Dialog r2 = r1.a
            android.content.Context r2 = r2.getContext()
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L3f
            android.content.Context r2 = r1.b
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L44
            boolean r2 = r2.isDestroyed()
            if (r2 != 0) goto L44
            android.app.Dialog r2 = r1.a
            r2.show()
            goto L44
        L3f:
            android.app.Dialog r2 = r1.a
            r2.show()
        L44:
            android.app.Dialog r2 = r1.a
            return r2
    }

    public android.app.Dialog j(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.b
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.bxkj.base.R.layout.pub_loading
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.app.Dialog r1 = r3.a
            r1.setContentView(r0)
            android.app.Dialog r0 = r3.a     // Catch: java.lang.Exception -> L2c
            int r1 = com.bxkj.base.R.id.tv_text     // Catch: java.lang.Exception -> L2c
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L2c
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L2c
            r3.c = r0     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2d
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L2d
            android.widget.TextView r0 = r3.c     // Catch: java.lang.Exception -> L2c
            r0.setText(r4)     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
        L2d:
            android.app.Dialog r4 = r3.a
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L58
            android.app.Dialog r4 = r3.a
            android.content.Context r4 = r4.getContext()
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L53
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isFinishing()
            if (r4 != 0) goto L58
            android.app.Dialog r4 = r3.a
            r4.show()
            goto L58
        L53:
            android.app.Dialog r4 = r3.a
            r4.show()
        L58:
            android.app.Dialog r4 = r3.a
            return r4
    }
}
